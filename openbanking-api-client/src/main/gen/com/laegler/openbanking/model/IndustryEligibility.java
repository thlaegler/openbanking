package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherSICCode;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Industry Eligibility that the account holder will need to meet to take out the BCA product
 **/
@ApiModel(description="Industry Eligibility that the account holder will need to meet to take out the BCA product")
public class IndustryEligibility  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the IndustryEligibility details")
 /**
   * Optional additional notes to supplement the IndustryEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherSICCode otherSICCode = null;

  @ApiModelProperty(required = true, value = "UK Standard Industry Code of the business eligible to access the BCA product. Ref http://resources.companieshouse.gov.uk/sic/")
 /**
   * UK Standard Industry Code of the business eligible to access the BCA product. Ref http://resources.companieshouse.gov.uk/sic/
  **/
  private List<String> siCCode = new ArrayList<String>();
 /**
   * Optional additional notes to supplement the IndustryEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public IndustryEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherSICCode
   * @return otherSICCode
  **/
  @JsonProperty("OtherSICCode")
  public OtherSICCode getOtherSICCode() {
    return otherSICCode;
  }

  public void setOtherSICCode(OtherSICCode otherSICCode) {
    this.otherSICCode = otherSICCode;
  }

  public IndustryEligibility otherSICCode(OtherSICCode otherSICCode) {
    this.otherSICCode = otherSICCode;
    return this;
  }

 /**
   * UK Standard Industry Code of the business eligible to access the BCA product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCode
  **/
  @JsonProperty("SICCode")
  public List<String> getSiCCode() {
    return siCCode;
  }

  public void setSiCCode(List<String> siCCode) {
    this.siCCode = siCCode;
  }

  public IndustryEligibility siCCode(List<String> siCCode) {
    this.siCCode = siCCode;
    return this;
  }

  public IndustryEligibility addSiCCodeItem(String siCCodeItem) {
    this.siCCode.add(siCCodeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCode: ").append(toIndentedString(otherSICCode)).append("\n");
    sb.append("    siCCode: ").append(toIndentedString(siCCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

