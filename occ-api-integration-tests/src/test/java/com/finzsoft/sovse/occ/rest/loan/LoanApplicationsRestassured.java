package com.finzsoft.sovse.occ.rest.loan;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import com.finzsoft.sovse.occ.rest.JsonapiRestassured;
import com.finzsoft.sovse.occ.rest.TestUtil;


public class LoanApplicationsRestassured extends JsonapiRestassured {

  private static final String PATH = "/applications";

  public void get_loan_application_by_externalNumber(String applicationExternalNumber) {
    resp(newReq().when().get(PATH, "applicationExternalNumber", applicationExternalNumber));
  }

  public void get_changed_loan_applications_since(String isoDateString) {
    resp(newReq().when().queryParam("changedDateSince", isoDateString).get(PATH));
  }

  public void get_changed_loan_applications_since() {
    resp(newReq().when().get(PATH));
  }

  public void submit_loan_application(String fileName) {
    String fileContent = TestUtil.getRequestBody(fileName, "");
    resp(newReq().when().body(fileContent).put(PATH));
  }

  public void get_loan_application(String applicationExternalNumber) {
    resp(newReq().when().get(PATH, "applicationExternalNumber", applicationExternalNumber));
  }

  public void assert_at_least_x_loan_applications(int numberOfElements) {
    assert_data_has_element();
    resp().then().assertThat().body("data[0].id", notNullValue());
    resp().then().assertThat().body("data[0].type", containsString("application"));
  }

}
