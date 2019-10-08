package com.laegler.openbanking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.json.JSONObject;
import org.json.XML;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Transformation<O> {

  // private String static final JS_PATH = "classpath:js/transform.js";
  private static final String JS_PATH = "src/main/resources/js/transform.js";
  private static final String STJS_PATH = "src/main/resources/js/st.js";
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public static <O> O transform(Object soapInput, Class<O> outputClazz)
      throws JAXBException, ScriptException, IOException, NoSuchMethodException {
    log.debug("Transforming {} to {} 1", soapInput.getClass(), outputClazz.getName());
    JAXBContext jaxbContext = JAXBContext.newInstance(soapInput.getClass());
    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    StringWriter stringWriter = new StringWriter();
    jaxbMarshaller.marshal(soapInput, stringWriter);
    String soapXml = stringWriter.toString();
    String template = getTransformTemplate(soapInput, outputClazz);
    return transform(soapXml, outputClazz, template);
  }

  public static <O> O transform(String soapXml, Class<O> outputClazz, String template)
      throws JAXBException, ScriptException, IOException, NoSuchMethodException {
    log.debug("Transforming {} to {} 2", "XML string", outputClazz.getName());

    // XML
    JSONObject soapJson = XML.toJSONObject(soapXml);
    String soapJsonString = soapJson.toString(2);
    log.info("Got soap message: {}", soapJsonString);

    // JS
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    engine.eval(Files.newBufferedReader(Paths.get(STJS_PATH), StandardCharsets.UTF_8));
    Object res = engine.eval("JSON.stringify(ST.select(" + soapJsonString + ").transformWith("
        + template + ").root());");
    String resScr = (String) res;
    log.info("Got script mirror message: {}", resScr);
    System.out.println("Got " + resScr);

    // JSON
    O restJson = OBJECT_MAPPER.readValue(resScr, outputClazz);

    // Object restJson = OBJECT_MAPPER.readValue(restJsonString, outputClazz);
    log.debug("Done with transforming {} to {}", "XML string", outputClazz.getName());
    return restJson;
  }

  private static String getTransformTemplate(Object soapInput, Class<?> outputClazz) {
    String templateName = "/transform/soap-to-" + outputClazz.getSimpleName() + ".json";
    try {
      InputStream inputStream = Transformation.class.getResourceAsStream(templateName);
      String template = readFromInputStream(inputStream);
      System.out.println("Get template: " + template);
      return template;
    } catch (IOException ex1) {
      ex1.printStackTrace();
      templateName = "/transform/from-" + soapInput.getClass().getSimpleName() + "-to-soap.json";
      try {
        InputStream inputStream = Transformation.class.getResourceAsStream(templateName);
        String template = readFromInputStream(inputStream);
        System.out.println("Get template: " + template);
        return template;
      } catch (IOException ex2) {
        ex2.printStackTrace();
      }
      throw new IllegalStateException("Template not found " + templateName);
    }
  }

  private static String readFromInputStream(InputStream inputStream) throws IOException {
    StringBuilder resultStringBuilder = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = br.readLine()) != null) {
        resultStringBuilder.append(line).append("\n");
      }
    }
    return resultStringBuilder.toString();
  }
}
