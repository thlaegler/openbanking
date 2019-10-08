package com.laegler.openbanking;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

abstract public class AbstractFeatureSteps {
  protected String oauthAccessToken = "abc";
  protected String oauthAuthoizationCode = "abc";
  protected String oauthClientId = "123";
  protected String oauthClientSecret = "123";

  public RequestSpecification spec() {
    return new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("{{basePath}}")
        .addFilter(new ResponseLoggingFilter()).addFilter(new RequestLoggingFilter()).build();
  }
}
