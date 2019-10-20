package com.laegler.openbanking.model;

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

public class OrganisationEmailAddresses  {
  
  @ApiModelProperty(value = "A name of a person or an office to which this email belongs.")
 /**
   * A name of a person or an office to which this email belongs.
  **/
  private String name = null;

  @ApiModelProperty(value = "Indicator to show is this is the primary email address")
 /**
   * Indicator to show is this is the primary email address
  **/
  private Boolean primary = null;

  @ApiModelProperty(value = "Type of email address")
 /**
   * Type of email address
  **/
  private String type = null;

  @ApiModelProperty(value = "Value of email address")
 /**
   * Value of email address
  **/
  private String value = null;
 /**
   * A name of a person or an office to which this email belongs.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganisationEmailAddresses name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Indicator to show is this is the primary email address
   * @return primary
  **/
  @JsonProperty("Primary")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public OrganisationEmailAddresses primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

 /**
   * Type of email address
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganisationEmailAddresses type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Value of email address
   * @return value
  **/
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OrganisationEmailAddresses value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationEmailAddresses {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

