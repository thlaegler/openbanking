package com.finzsoft.sovse.occ.cucumber.steps;

import com.finzsoft.sovse.occ.cucumber.AbstractSteps;
import com.finzsoft.sovse.occ.rest.JsonapiRestassured;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonSteps extends AbstractSteps {

    // @Before
    @Override
    public void initRestassuredContext() {
        REST = new JsonapiRestassured();
    }

    private JsonapiRestassured getRest() {
        if (!(REST instanceof JsonapiRestassured)) {
            initRestassuredContext();
        }
        return (JsonapiRestassured) REST;
    }

    @Given("I'm an authorized API-consumer with client credentials")
    public void i_m_an_authorized_API_consumer_with_client_credentials() {
        getRest().get_access_token_by_client_credentials();
    }

    @Then("the response should be successful")
    public void the_response_should_be_successful() {
        getRest().assert_success();
    }

    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer httpStatusCode) {
        getRest().assert_status_code_equals(httpStatusCode);
    }

    @Then("the response should contain exactly {int} error")
    public void the_response_should_contain_exactly_error(Integer int1) {}

    @Then("the error message should be {string}")
    public void the_error_message_should_be(String string) {}



}
