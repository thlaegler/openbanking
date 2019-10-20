package com.laegler.openbanking.model;

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
  * Age eligibility for BCA product
 **/
@ApiModel(description="Age eligibility for BCA product")
public class AgeEligibility  {
  
  @ApiModelProperty(value = "Maximum age that a person is eligible to hold this account")
 /**
   * Maximum age that a person is eligible to hold this account
  **/
  private Float maximumAge = null;

  @ApiModelProperty(value = "Minimum age that a person is eligible to hold this account")
 /**
   * Minimum age that a person is eligible to hold this account
  **/
  private Float minimumAge = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the AgeEligibility details")
 /**
   * Optional additional notes to supplement the AgeEligibility details
  **/
  private List<String> notes = null;
 /**
   * Maximum age that a person is eligible to hold this account
   * @return maximumAge
  **/
  @JsonProperty("MaximumAge")
  public Float getMaximumAge() {
    return maximumAge;
  }

  public void setMaximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
  }

  public AgeEligibility maximumAge(Float maximumAge) {
    this.maximumAge = maximumAge;
    return this;
  }

 /**
   * Minimum age that a person is eligible to hold this account
   * @return minimumAge
  **/
  @JsonProperty("MinimumAge")
  public Float getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
  }

  public AgeEligibility minimumAge(Float minimumAge) {
    this.minimumAge = minimumAge;
    return this;
  }

 /**
   * Optional additional notes to supplement the AgeEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public AgeEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public AgeEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEligibility {\n");
    
    sb.append("    maximumAge: ").append(toIndentedString(maximumAge)).append("\n");
    sb.append("    minimumAge: ").append(toIndentedString(minimumAge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

