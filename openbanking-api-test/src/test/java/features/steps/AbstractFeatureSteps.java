package features.steps;

import features.CucumberState;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AbstractFeatureSteps {

  String baseUrl = "http://localhost:8080";
  String basePath = "/api/v1/openbanking";

  protected RequestSpecification req() {
    if (CucumberState.REQ == null) {
      CucumberState.REQ = RestAssured.given().baseUri(baseUrl).basePath(basePath)
          .config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig()
              .encodeContentTypeAs("application/prs.openbanking.opendata.v2.3+json",
                  ContentType.JSON)
              .encodeContentTypeAs("application/jose+jwe", ContentType.JSON)
              .encodeContentTypeAs("application/jose", ContentType.JSON)
              .encodeContentTypeAs("application/jwt; charset=ISO-8859-1", ContentType.JSON)
              .encodeContentTypeAs("application/jwt", ContentType.JSON)
              .encodeContentTypeAs("application/json; charset=utf-8", ContentType.JSON)
              .encodeContentTypeAs("application/scim+json", ContentType.JSON)))
          .contentType(ContentType.JSON).log().all();
    }
    return CucumberState.REQ;
  }

  protected void req(RequestSpecification req) {
    CucumberState.REQ = req;
  }

  protected Response res() {
    return CucumberState.RES;
  }

  protected void res(Response res) {
    CucumberState.RES = res;
  }

  protected String oauthAccessToken = "abc";
  protected String oauthAuthoizationCode = "abc";
  protected String oauthClientId = "123";
  protected String oauthClientSecret = "123";

  public RequestSpecification spec() {
    return new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri(baseUrl)
        .addFilter(new ResponseLoggingFilter()).addFilter(new RequestLoggingFilter()).build();
  }

}
