package com.laegler.openbanking.model;

import com.laegler.openbanking.model.IndustryEligibility2OtherSICCodeExluded;
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
  * Industry Eligibility that the account holder will need to meet to take out the SME Loan product
 **/
@ApiModel(description="Industry Eligibility that the account holder will need to meet to take out the SME Loan product")
public class IndustryEligibility2  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the IndustryEligibility details")
 /**
   * Optional additional notes to supplement the IndustryEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other SICCode which is not in the standard code set")
 /**
   * Other SICCode which is not in the standard code set
  **/
  private List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded = null;

  @ApiModelProperty(value = "Other SICCode which is not in the standard code set")
 /**
   * Other SICCode which is not in the standard code set
  **/
  private List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded = null;

  @ApiModelProperty(value = "UK Standard Industry Code of the business not eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/")
 /**
   * UK Standard Industry Code of the business not eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
  **/
  private List<String> siCCodeExcluded = null;

  @ApiModelProperty(value = "UK Standard Industry Code of the business eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/")
 /**
   * UK Standard Industry Code of the business eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
  **/
  private List<String> siCCodeIncluded = null;
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

  public IndustryEligibility2 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility2 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other SICCode which is not in the standard code set
   * @return otherSICCodeExluded
  **/
  @JsonProperty("OtherSICCodeExluded")
  public List<IndustryEligibility2OtherSICCodeExluded> getOtherSICCodeExluded() {
    return otherSICCodeExluded;
  }

  public void setOtherSICCodeExluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded) {
    this.otherSICCodeExluded = otherSICCodeExluded;
  }

  public IndustryEligibility2 otherSICCodeExluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded) {
    this.otherSICCodeExluded = otherSICCodeExluded;
    return this;
  }

  public IndustryEligibility2 addOtherSICCodeExludedItem(IndustryEligibility2OtherSICCodeExluded otherSICCodeExludedItem) {
    this.otherSICCodeExluded.add(otherSICCodeExludedItem);
    return this;
  }

 /**
   * Other SICCode which is not in the standard code set
   * @return otherSICCodeIncluded
  **/
  @JsonProperty("OtherSICCodeIncluded")
  public List<IndustryEligibility2OtherSICCodeExluded> getOtherSICCodeIncluded() {
    return otherSICCodeIncluded;
  }

  public void setOtherSICCodeIncluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
  }

  public IndustryEligibility2 otherSICCodeIncluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
    return this;
  }

  public IndustryEligibility2 addOtherSICCodeIncludedItem(IndustryEligibility2OtherSICCodeExluded otherSICCodeIncludedItem) {
    this.otherSICCodeIncluded.add(otherSICCodeIncludedItem);
    return this;
  }

 /**
   * UK Standard Industry Code of the business not eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeExcluded
  **/
  @JsonProperty("SICCodeExcluded")
  public List<String> getSiCCodeExcluded() {
    return siCCodeExcluded;
  }

  public void setSiCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
  }

  public IndustryEligibility2 siCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
    return this;
  }

  public IndustryEligibility2 addSiCCodeExcludedItem(String siCCodeExcludedItem) {
    this.siCCodeExcluded.add(siCCodeExcludedItem);
    return this;
  }

 /**
   * UK Standard Industry Code of the business eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeIncluded
  **/
  @JsonProperty("SICCodeIncluded")
  public List<String> getSiCCodeIncluded() {
    return siCCodeIncluded;
  }

  public void setSiCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
  }

  public IndustryEligibility2 siCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
    return this;
  }

  public IndustryEligibility2 addSiCCodeIncludedItem(String siCCodeIncludedItem) {
    this.siCCodeIncluded.add(siCCodeIncludedItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility2 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCodeExluded: ").append(toIndentedString(otherSICCodeExluded)).append("\n");
    sb.append("    otherSICCodeIncluded: ").append(toIndentedString(otherSICCodeIncluded)).append("\n");
    sb.append("    siCCodeExcluded: ").append(toIndentedString(siCCodeExcluded)).append("\n");
    sb.append("    siCCodeIncluded: ").append(toIndentedString(siCCodeIncluded)).append("\n");
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

