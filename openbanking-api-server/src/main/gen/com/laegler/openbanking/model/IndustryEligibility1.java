package com.laegler.openbanking.model;

import com.laegler.openbanking.model.IndustryEligibility1OtherSICCodeExcluded;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

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
  * Industry Eligibility that the account holder will need to meet to take out the CCC product
 **/
@ApiModel(description="Industry Eligibility that the account holder will need to meet to take out the CCC product")
public class IndustryEligibility1  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the IndustryEligibility details")
 /**
   * Optional additional notes to supplement the IndustryEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other SICCode which is not in the standard code list")
  @Valid
 /**
   * Other SICCode which is not in the standard code list
  **/
  private List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded = null;

  @ApiModelProperty(value = "Other SICCode which is not in the standard code list")
  @Valid
 /**
   * Other SICCode which is not in the standard code list
  **/
  private List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded = null;

  @ApiModelProperty(value = "UK Standard Industry Code of the business not eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/")
 /**
   * UK Standard Industry Code of the business not eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
  **/
  private List<String> siCCodeExcluded = null;

  @ApiModelProperty(value = "UK Standard Industry Code of the business eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/")
 /**
   * UK Standard Industry Code of the business eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
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

  public IndustryEligibility1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility1 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other SICCode which is not in the standard code list
   * @return otherSICCodeExcluded
  **/
  @JsonProperty("OtherSICCodeExcluded")
  public List<IndustryEligibility1OtherSICCodeExcluded> getOtherSICCodeExcluded() {
    return otherSICCodeExcluded;
  }

  public void setOtherSICCodeExcluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded) {
    this.otherSICCodeExcluded = otherSICCodeExcluded;
  }

  public IndustryEligibility1 otherSICCodeExcluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded) {
    this.otherSICCodeExcluded = otherSICCodeExcluded;
    return this;
  }

  public IndustryEligibility1 addOtherSICCodeExcludedItem(IndustryEligibility1OtherSICCodeExcluded otherSICCodeExcludedItem) {
    this.otherSICCodeExcluded.add(otherSICCodeExcludedItem);
    return this;
  }

 /**
   * Other SICCode which is not in the standard code list
   * @return otherSICCodeIncluded
  **/
  @JsonProperty("OtherSICCodeIncluded")
  public List<IndustryEligibility1OtherSICCodeExcluded> getOtherSICCodeIncluded() {
    return otherSICCodeIncluded;
  }

  public void setOtherSICCodeIncluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
  }

  public IndustryEligibility1 otherSICCodeIncluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
    return this;
  }

  public IndustryEligibility1 addOtherSICCodeIncludedItem(IndustryEligibility1OtherSICCodeExcluded otherSICCodeIncludedItem) {
    this.otherSICCodeIncluded.add(otherSICCodeIncludedItem);
    return this;
  }

 /**
   * UK Standard Industry Code of the business not eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeExcluded
  **/
  @JsonProperty("SICCodeExcluded")
  public List<String> getSiCCodeExcluded() {
    return siCCodeExcluded;
  }

  public void setSiCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
  }

  public IndustryEligibility1 siCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
    return this;
  }

  public IndustryEligibility1 addSiCCodeExcludedItem(String siCCodeExcludedItem) {
    this.siCCodeExcluded.add(siCCodeExcludedItem);
    return this;
  }

 /**
   * UK Standard Industry Code of the business eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeIncluded
  **/
  @JsonProperty("SICCodeIncluded")
  public List<String> getSiCCodeIncluded() {
    return siCCodeIncluded;
  }

  public void setSiCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
  }

  public IndustryEligibility1 siCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
    return this;
  }

  public IndustryEligibility1 addSiCCodeIncludedItem(String siCCodeIncludedItem) {
    this.siCCodeIncluded.add(siCCodeIncludedItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility1 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCodeExcluded: ").append(toIndentedString(otherSICCodeExcluded)).append("\n");
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

