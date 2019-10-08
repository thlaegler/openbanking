package com.laegler.openbanking;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.StringContains.containsString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CommonFeatureSteps extends AbstractFeatureSteps {
  @Given("^a consumer$")
  public void a_consumer() throws Throwable {
    given().spec(spec());
  }

  @Given("^a consumer authenticated with \"([^\"]*)\" method \"([^\"]*)\" flow \"([^\"]*)\" scope \"([^\"]*)\"$")
  public void a_consumer_authenticated_by_flow_scope(String arg1, String arg2, String arg3,
      String arg4) throws Throwable {
    // given().spec(spec()).auth().oauth;
    given().spec(spec()).headers("X-Access-Token", oauthAccessToken, "X-Client-ID", oauthClientId,
        "X-Client-Secret", oauthClientSecret).auth().oauth2(oauthAccessToken);
  }

  @When("^the consumer does \"([^\"]*)\" on \"([^\"]*)\"$")
  public void the_consumer_does_on(String httpMethod, String url) throws Throwable {
    if (httpMethod.equalsIgnoreCase("get")) {
      when().get(url);
    } else if (httpMethod.equalsIgnoreCase("post")) {
      when().post(url);
    } else if (httpMethod.equalsIgnoreCase("put")) {
      when().put(url);
    } else if (httpMethod.equalsIgnoreCase("delete")) {
      when().delete(url);
    }
  }

  @When("^the request content type is \"([^\"]*)\"$")
  public void the_request_content_type_is(String arg1) throws Throwable {
    given().contentType("application/json");
  }

  @When("^the request body is \"([^\"]*)\"$")
  public void the_request_body_is_requestBody(String requestBody) throws Throwable {
    given().body(requestBody);
    // given.param();
  }

  @Then("^the endpoint should answer with a response$")
  public void the_endpoint_should_answer_with_a_response() throws Throwable {
    // nothing to do
  }

  @Then("^the response HTTP code should be (\\d+)$")
  public void the_response_HTTP_code_should_be(int statusCode) throws Throwable {
    spec().then().statusCode(statusCode);
  }

  @Then("^the response content type should be \"([^\"]*)\"$")
  public void the_response_content_type_should_be(String contentType) throws Throwable {
    spec().then().contentType(contentType);
  }

  @Then("^the response body should be \"([^\"]*)\"$")
  public void the_response_body_should_be(String responseBody) throws Throwable {
    spec().then().body(containsString(responseBody));
    // then().body("info.status",equalTo("open"))
  }
}
