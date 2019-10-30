package com.finzsoft.sovse.occ.rest;

import static org.hamcrest.Matchers.emptyIterable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

public class JsonapiRestassured extends AbstractRestassured {

  public void assert_success() {
    assert_status_code_equals(200);
    assert_data_not_null_or_empty();
    assert_data_has_element();
    assert_errors_null();
  }

  public void assert_data_not_null() {
    resp().then().assertThat().body("data", notNullValue());
  }

  public void assert_data_not_empty() {
    resp().then().assertThat().body("data", not(emptyIterable()));
  }

  public void assert_data_not_null_or_empty() {
    assert_data_not_null();
    assert_data_not_empty();
  }

  public void assert_data_null() {
    // TODO Auto-generated method stub
  }

  public void assert_data_empty() {
    // TODO Auto-generated method stub
  }

  public void assert_data_has_element() {
    resp().then().assertThat().body("data[0]", notNullValue());
  }

  public void assert_data_has_element(String dataJsonPath) {
    resp().then().assertThat().body("data." + dataJsonPath, notNullValue());
  }

  public void assert_errors_null() {
    // TODO Auto-generated method stub
  }

  public void assert_errors_not_null() {
    resp().then().assertThat().body("errors", notNullValue());
  }

  public void assert_errors_not_empty() {
    resp().then().assertThat().body("errors", not(emptyIterable()));
  }

  public void assert_errors_not_null_or_empty() {
    assert_errors_not_null();
    assert_errors_not_empty();
  }

  public void assert_error_title_equals(String errorTitle) {
    resp().then().assertThat().body("errors[0].title", equalTo(errorTitle));
  }

  public void assert_error_message_equals(String errorMessage) {
    resp().then().assertThat().body("errors[0].message", equalTo(errorMessage));
  }

}
