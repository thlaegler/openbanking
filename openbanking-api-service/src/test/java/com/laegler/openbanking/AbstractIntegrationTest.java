package com.laegler.openbanking;


import org.junit.BeforeClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

abstract public class AbstractIntegrationTest {

  protected static RequestSpecification spec;

  @BeforeClass
  public static void initSpec() {
    spec = new RequestSpecBuilder().setContentType(ContentType.JSON)
        .addFilter(new ResponseLoggingFilter()).addFilter(new RequestLoggingFilter()).build();
    String port = System.getProperty("server.port");
    if (port == null) {
      spec.port(Integer.valueOf(8080));
    } else {
      spec.port(Integer.valueOf(port));
    }

    String basePath = System.getProperty("server.base");
    if (basePath == null) {
      basePath = "/example-api/";
    }
    spec.basePath(basePath);

    String baseHost = System.getProperty("server.host");
    if (baseHost == null) {
      baseHost = "http://localhost";
    }
    spec.baseUri(baseHost);
  }
}
