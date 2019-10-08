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
  * Identity verification criteria that the account holder will need to meet to take out the CCC product
 **/
@ApiModel(description="Identity verification criteria that the account holder will need to meet to take out the CCC product")
public class IDEligibility1  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the ID Verification details")
 /**
   * Optional additional notes to supplement the ID Verification details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "URL to identity verification document list which is required for obtaining the product.")
 /**
   * URL to identity verification document list which is required for obtaining the product.
  **/
  private String URL = null;
 /**
   * Optional additional notes to supplement the ID Verification details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public IDEligibility1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IDEligibility1 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * URL to identity verification document list which is required for obtaining the product.
   * @return URL
  **/
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public IDEligibility1 URL(String URL) {
    this.URL = URL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDEligibility1 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

