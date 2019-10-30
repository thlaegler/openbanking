package com.finzsoft.sovse.occ.cucumber.steps;

import com.finzsoft.sovse.occ.cucumber.AbstractSteps;
import com.finzsoft.sovse.occ.rest.attachment.AttachmentsRestassured;
import io.cucumber.java.en.When;

public class AttachmentsSteps extends AbstractSteps {

  // @Before
  @Override
  public void initRestassuredContext() {
    REST = new AttachmentsRestassured();
  }

  private AttachmentsRestassured getRest() {
    if (!(REST instanceof AttachmentsRestassured)) {
      initRestassuredContext();
    }
    return (AttachmentsRestassured) REST;
  }

  @When("request to upload PDF file {string}")
  public void request_to_upload_PDF_file(String fileName) {
    getRest().upload_attachement(fileName);
  }

}
