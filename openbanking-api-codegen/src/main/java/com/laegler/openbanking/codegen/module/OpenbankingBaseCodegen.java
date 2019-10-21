package com.laegler.openbanking.codegen.module;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import com.laegler.openbanking.codegen.OpenbankingCodegenOperation;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenOperation;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.CodegenResponse;
import io.swagger.codegen.languages.SpringCodegen;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Swagger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenbankingBaseCodegen extends SpringCodegen {

  protected Map<String, String> apiFeatureStepsTemplateFiles = new HashMap<String, String>();
  protected Map<String, String> apiIntegrationTestTemplateFiles = new HashMap<String, String>();
  protected Map<String, String> resourceTemplateFiles = new HashMap<String, String>();

  protected String resourceFolder = projectFolder + File.separator + "resources";

  public OpenbankingBaseCodegen() {
    super();
    this.apiTestTemplateFiles.put("test/integration/apiIntegrationTest.mustache", ".java");
    this.apiTestTemplateFiles.put("test/feature/apiCucumberFeatureSteps.mustache", ".java");
    this.apiTestTemplateFiles.put("test/feature/apiCucumberFeature.mustache", ".feature");
    // this.apiFeatureStepsTemplateFiles.put("apiFeatureSteps.mustache", ".java");
    this.java8 = true;
    // this.useTags = true;
  }

  @Override
  public String getName() {
    return "openbanking-base";
  }

  public Map<String, String> resourceTemplateFiles() {
    return resourceTemplateFiles;
  }

  @Override
  public Map<String, Object> postProcessOperationsWithModels(Map<String, Object> objs,
      List<Object> allModels) {
    // TODO Auto-generated method stub
    return super.postProcessOperationsWithModels(objs, allModels);
  }

  protected Map<String, Object> processOperations(CodegenConfig config, String tag,
      List<CodegenOperation> ops, List<Object> allModels) {
    Map<String, Object> operations = new HashMap<String, Object>();
    Map<String, Object> objs = new HashMap<String, Object>();
    objs.put("classname", config.toApiName(tag));
    objs.put("pathPrefix", config.toApiVarName(tag));

    // check for operationId uniqueness
    Set<String> opIds = new HashSet<String>();
    int counter = 0;
    for (CodegenOperation op : ops) {
      String opId = op.nickname;
      if (opIds.contains(opId)) {
        counter++;
        op.nickname += "_" + counter;
      }
      opIds.add(opId);
    }
    objs.put("operation", ops);

    operations.put("operations", objs);
    operations.put("package", config.apiPackage());

    Set<String> allImports = new TreeSet<String>();
    for (CodegenOperation op : ops) {
      allImports.addAll(op.imports);
    }

    List<Map<String, String>> imports = new ArrayList<Map<String, String>>();
    for (String nextImport : allImports) {
      Map<String, String> im = new LinkedHashMap<String, String>();
      String mapping = config.importMapping().get(nextImport);
      if (mapping == null) {
        mapping = config.toModelImport(nextImport);
      }
      if (mapping != null) {
        im.put("import", mapping);
        if (!imports.contains(im)) { // avoid duplicates
          imports.add(im);
        }
      }
    }

    operations.put("imports", imports);

    // add a flag to indicate whether there's any {{import}}
    if (imports.size() > 0) {
      operations.put("hasImport", true);
    }
    config.postProcessOperations(operations);
    config.postProcessOperationsWithModels(operations, allModels);
    if (objs.size() > 0) {
      List<CodegenOperation> os = (List<CodegenOperation>) objs.get("operation");

      if (os != null && os.size() > 0) {
        CodegenOperation op = os.get(os.size() - 1);
        op.hasMore = false;
      }
    }
    return operations;
  }

  @Override
  public Map<String, Object> postProcessOperations(Map<String, Object> objs) {
    // TODO Auto-generated method stub
    objs = super.postProcessOperations(objs);
    // Map<String, Object> operations = (Map<String, Object>) objs.get("operations");
    // if (operations != null) {
    // List<CodegenOperation> ops = (List<CodegenOperation>) operations.get("operation");
    // for (final CodegenOperation operation : ops) {
    // List<Tag> tags = operation.tags;
    // for (final Tag tag : tags) {
    // // TODO
    // }
    // }
    // }

    // Add imports for Jackson
    // List<Object> models = (List<Object>) objs.get("models");
    // for (Object _mo : models) {
    // Map<String, Object> mo = (Map<String, Object>) _mo;
    // CodegenModel cm = (CodegenModel) mo.get("model");
    // // for enum model
    // if (Boolean.TRUE.equals(cm.isEnum) && cm.allowableValues != null) {
    // cm.imports.add(importMapping.get("JsonValue"));
    // Map<String, String> item = new HashMap<String, String>();
    // item.put("import", importMapping.get("JsonValue"));
    // }
    // }

    return objs;
  }

  @Override
  public void processOpts() {
    String mDoc = modelDocTemplateFiles.get("model_doc.mustache");
    String aDoc = apiDocTemplateFiles.get("api_doc.mustache");
    super.processOpts();
    modelDocTemplateFiles.put("model_doc.mustache", mDoc);
    apiDocTemplateFiles.put("api_doc.mustache", aDoc);
  }

  @Override
  public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
    super.postProcessModelProperty(model, property);

  }

  @Override
  public OpenbankingCodegenOperation fromOperation(final String path, final String httpMethod,
      final Operation operation, final Map<String, Model> definitions, final Swagger swagger) {

    final CodegenOperation op =
        super.fromOperation(path, httpMethod, operation, definitions, swagger);
    OpenbankingCodegenOperation it = new OpenbankingCodegenOperation();
    it.httpMethodLowerCase = httpMethod.toLowerCase();
    it.description = operation.getDescription();
    it.allParams = op.allParams;
    it.authMethods = op.authMethods;
    it.baseName = op.baseName;
    it.bodyParam = op.bodyParam;
    it.bodyParams = op.bodyParams;
    it.consumes = op.consumes;
    it.defaultResponse = op.defaultResponse;
    it.discriminator = op.discriminator;
    it.examples = op.examples;
    it.externalDocs = op.externalDocs;
    it.formParams = op.formParams;
    it.hasAuthMethods = op.hasAuthMethods;
    it.hasConsumes = op.hasConsumes;
    it.hasMore = op.hasMore;
    it.hasOptionalParams = op.hasOptionalParams;
    it.hasParams = op.hasParams;
    it.hasProduces = op.hasProduces;
    it.hasReference = op.hasReference;
    it.headerParams = op.headerParams;
    it.httpMethod = op.httpMethod;
    it.imports = op.imports;
    it.isListContainer = op.isListContainer;
    it.isMapContainer = op.isMapContainer;
    it.isMultipart = op.isMultipart;
    it.isResponseBinary = op.isResponseBinary;
    it.nickname = op.nickname;
    it.notes = op.notes;
    it.operationId = op.operationId;
    it.operationIdLowerCase = op.operationIdLowerCase;
    it.path = this.sanitizePath(op.path);
    it.pathParams = op.pathParams;
    it.produces = op.produces;
    it.queryParams = op.queryParams;
    Optional<CodegenResponse> defaultResponse =
        op.responses.stream().filter(r -> r.code == "default").findFirst();
    if (defaultResponse.isPresent()) {
      Optional<CodegenProperty> defaultHeader = defaultResponse.get().headers.stream()
          .filter(r -> StringUtils.isNumeric(r.defaultValue)).findFirst();
      if (defaultHeader.isPresent()) {
        defaultResponse.get().code = defaultHeader.get().defaultValue;
      }
    }
    // it.responses = op.responses;
    it.responses = op.responses.stream().collect(Collectors.toMap(v -> {
      try {
        int cod = Integer.parseInt(v.code);
        return cod != 0 ? cod : null;
      } catch (Exception e) {
        return null;
      }
    }, v -> v)).entrySet().stream().filter(e -> e.getKey() != null)
        .collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue())).values().stream()
        .collect(Collectors.toList());
    // .filter(i -> Collections.frequency(
    // op.responses.stream().map(j -> j.code).collect(Collectors.toList()), i.code) < 1)
    // .collect(Collectors.toList());
    it.returnBaseType = op.returnBaseType;
    it.returnContainer = op.returnContainer;
    it.returnSimpleType = op.returnSimpleType;
    it.returnType = op.returnType;
    it.returnTypeIsPrimitive = op.returnTypeIsPrimitive;
    it.subresourceOperation = op.subresourceOperation;
    it.summary = op.summary;
    it.tags = op.tags;
    it.unescapedNotes = op.unescapedNotes;
    it.vendorExtensions = op.vendorExtensions;;

    return it;
  }

  private String sanitizePath(final String p) {
    return p.replaceAll("\"", "%22");
  }

  @Override
  public String escapeText(String input) {
    String gaga = super.escapeText(input);
    log.info("Escaping {} -> {}", input, gaga);
    return gaga;
  }


  @Override
  public String apiTestFilename(final String templateName, String tag1) {
    String result = super.apiTestFilename(templateName, tag1);
    // String result = tag1;
    String tag = camelize(tag1);

    if (templateName.endsWith("IntegrationTest.mustache")) {
      final int ix = result.lastIndexOf("/");
      result = result.replace("Test", "");
      String _substring = result.substring(0, ix);
      String _plus = (_substring + "/integration/");
      String _initialCaps = this.initialCaps(tag);
      String _plus_1 = (_plus + _initialCaps);
      result = (_plus_1 + "ApiIntegrationTest.java");
    }
    if (templateName.endsWith("CucumberFeature.mustache")) {
      final int ix_1 = result.lastIndexOf("/");
      String _substring_1 = result.substring(0, ix_1);
      String _plus_4 = (_substring_1 + "/feature/");
      String _plus_5 = (_plus_4 + tag.toLowerCase().charAt(0) + tag.substring(1, tag.length()));
      String _plus_6 = (_plus_5 + "/");
      String _plus_7 = (_plus_6 + tag1);
      result = (_plus_7 + ".feature");
    }
    if (templateName.endsWith("CucumberFeatureSteps.mustache")) {
      final int ix_2 = result.lastIndexOf("/");
      result = result.replace("Test", "");
      String _substring_2 = result.substring(0, ix_2);
      String _plus_9 = (_substring_2 + "/feature/");
      String _plus_10 = (_plus_9 + tag.toLowerCase().charAt(0) + tag.substring(1, tag.length()));
      String _plus_11 = (_plus_10 + "/");
      String _plus_12 = (_plus_11 + tag);
      result = (_plus_12 + "ApiFeatureSteps.java");
      // result = _plus_13;
      // String _apiFileFolder_1 = this.apiTestFileFolder();
      // String _replace_1 = this.apiPackage().replace(".", "/");
      // String _plus_14 = ((this.testFolder + "/") + _replace_1);
      // result = result.replace(_apiFileFolder_1, _plus_14);
    }
    return result;
  }

  public String apiIntegrationTestFilename(final String templateName, final String tag) {
    final String suffix = this.apiIntegrationTestTemplateFiles().get(templateName);
    String _apiIntegrationTestFileFolder = this.apiIntegrationTestFileFolder();
    String _plus = (_apiIntegrationTestFileFolder + "/");
    String _apiIntegrationTestFilename = this.toApiIntegrationTestFilename(tag);
    String _plus_1 = (_plus + _apiIntegrationTestFilename);
    return (_plus_1 + suffix);
  }

  public String apiFeatureStepsFilename(final String templateName, final String tag) {
    final String suffix = this.apiFeatureStepsTemplateFiles().get(templateName);
    String _apiFeatureStepsFileFolder = this.apiFeatureStepsFileFolder();
    String _plus = (_apiFeatureStepsFileFolder + "/");
    String _apiFeatureStepsFilename = this.toApiFeatureStepsFilename(tag);
    String _plus_1 = (_plus + _apiFeatureStepsFilename);
    return (_plus_1 + suffix);
  }

  public String apiIntegrationTestFileFolder() {
    String _replace = this.apiPackage.replace(".", "/");
    return ((this.testFolder + "/") + _replace);
  }

  public String apiFeatureStepsFileFolder() {
    String _replace = this.apiPackage.replace(".", "/");
    return ((this.testFolder + "/") + _replace);
  }

  public String toApiIntegrationTestFilename(final String name) {
    String _apiName = this.toApiName(name);
    return (_apiName + "IntegrationTest");
  }

  public String toApiFeatureStepsFilename(final String name) {
    String _apiName = this.toApiName(name);
    return (_apiName + "FeatureSteps");
  }

  public Map<String, String> apiFeatureStepsTemplateFiles() {
    return this.apiFeatureStepsTemplateFiles;
  }

  public Map<String, String> apiIntegrationTestTemplateFiles() {
    return this.apiIntegrationTestTemplateFiles;
  }

  public String resourceFileFolder() {
    return outputFolder + "/" + resourceFolder + "/" + modelPackage().replace('.', '/');
  }

}
