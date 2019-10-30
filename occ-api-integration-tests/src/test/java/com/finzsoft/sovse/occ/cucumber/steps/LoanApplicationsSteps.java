package com.finzsoft.sovse.occ.cucumber.steps;

import com.finzsoft.sovse.occ.cucumber.AbstractSteps;
import com.finzsoft.sovse.occ.rest.loan.LoanApplicationsRestassured;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoanApplicationsSteps extends AbstractSteps {

    // @Before
    @Override
    public void initRestassuredContext() {
        REST = new LoanApplicationsRestassured();
    }

    private LoanApplicationsRestassured getRest() {
        if (!(REST instanceof LoanApplicationsRestassured)) {
            initRestassuredContext();
        }
        return (LoanApplicationsRestassured) REST;
    }

    @When("request to GET changed loan applications by changed date {string}")
    public void request_to_GET_changed_loan_applications_by_changed_date(String isoDateString) {
        getRest().get_changed_loan_applications_since(isoDateString);
    }

    @Then("the response should contain at least {int} changed loan application")
    public void the_response_should_contain_at_least_changed_loan_application(
            Integer numberOfElements) {
        getRest().assert_success();
        getRest().assert_at_least_x_loan_applications(numberOfElements);
    }

    @When("request to submit a loan application with request {string}")
    public void request_to_submit_a_loan_application_with_request(String fileName) {
        getRest().submit_loan_application(fileName);
    }

    @Then("the response should contain at least {int} loan application")
    public void the_response_should_contain_at_least_loan_application(Integer numberOfElements) {
        getRest().assert_success();
        getRest().assert_at_least_x_loan_applications(numberOfElements);
    }

}
