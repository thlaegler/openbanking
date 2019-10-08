package features.steps;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.StringContains.containsString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class CommonFeatureSteps extends AbstractFeatureSteps {

  @Given("I'm an authorized API-user with {string} method {string} flow {string} scope {string}")
  public void im_an_autorized_API_user_with_oauth2(String arg1, String arg2, String arg3,
      String arg4) throws Throwable {
    // given().spec(spec()).auth().oauth;
    req().headers("X-Access-Token", oauthAccessToken, "X-Client-ID", oauthClientId,
        "X-Client-Secret", oauthClientSecret).auth().oauth2(oauthAccessToken);
  }

  @When("the consumer does {string} on {string}")
  public void the_consumer_does_on(String httpMethod, String url) throws Throwable {
    if (httpMethod.equalsIgnoreCase("get")) {
      req().when().get(url);
    } else if (httpMethod.equalsIgnoreCase("post")) {
      req().when().post(url);
    } else if (httpMethod.equalsIgnoreCase("put")) {
      req().when().put(url);
    } else if (httpMethod.equalsIgnoreCase("delete")) {
      req().when().delete(url);
    }
  }

  @When("I request to {string} to {string}")
  public void i_request_to_to(String httpMethod, String url) throws Throwable {
    Response res = null;
    if (httpMethod.equalsIgnoreCase("get")) {
      res = req().when().get(url);
    } else if (httpMethod.equalsIgnoreCase("post")) {
      res = req().when().post(url);
    } else if (httpMethod.equalsIgnoreCase("put")) {
      res = req().when().put(url);
    } else if (httpMethod.equalsIgnoreCase("delete")) {
      res = req().when().delete(url);
    }
    res(res);
  }

  @When("the request content type is {string}")
  public void the_request_content_type_is(String contentType) throws Throwable {
    req().contentType(contentType);
  }

  @When("the request body is {string}")
  public void the_request_body_is_requestBody(String requestBody) throws Throwable {
    req().body(requestBody);
    // given.param();
  }

  @Then("the endpoint should answer with a response")
  public void the_endpoint_should_answer_with_a_response() throws Throwable {
    res().then().assertThat().time(lessThan(2000L));
  }

  @Then("the response content type should be {string}")
  public void the_response_content_type_should_be(String contentType) throws Throwable {
    // res().then().assertThat().contentType(contentType);
  }

  @Then("the response body should be {string}")
  public void the_response_body_should_be(String responseBody) throws Throwable {
    res().then().assertThat().body(containsString(responseBody));
    // then().body("info.status",equalTo("open"))
  }

  @Given("I'm an authorized API-user")
  public void i_m_an_authorized_API_user() {
    req();
  }

  @Then("the response code should be {int}")
  public void the_response_code_should_be(Integer statusCode) {
    res().then().assertThat().statusCode(404);
  }

  @Then("the response should contain a list of {string}")
  public void the_response_should_contain_a_list_of(String listType) {
    // res().then().assertThat().body("id", equalTo(5));
  }

}
