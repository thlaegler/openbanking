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

public class Organisation1PhoneNumbers  {
  
  @ApiModelProperty(value = "A name of a person or an office to which this phone number belongs.")
 /**
   * A name of a person or an office to which this phone number belongs.
  **/
  private String name = null;

  @ApiModelProperty(value = "Type of phone contact")
 /**
   * Type of phone contact
  **/
  private String type = null;

  @ApiModelProperty(value = "Value of phone number through which the organisation can be contacted")
 /**
   * Value of phone number through which the organisation can be contacted
  **/
  private String value = null;

  @ApiModelProperty(value = "Flag to show that the phone number has been verified")
 /**
   * Flag to show that the phone number has been verified
  **/
  private Boolean verified = null;
 /**
   * A name of a person or an office to which this phone number belongs.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organisation1PhoneNumbers name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Type of phone contact
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Organisation1PhoneNumbers type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Value of phone number through which the organisation can be contacted
   * @return value
  **/
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Organisation1PhoneNumbers value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Flag to show that the phone number has been verified
   * @return verified
  **/
  @JsonProperty("Verified")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public Organisation1PhoneNumbers verified(Boolean verified) {
    this.verified = verified;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation1PhoneNumbers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

