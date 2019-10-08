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

public class ContactSchema  {
  
  @ApiModelProperty(value = "")
  private String emailAddress = null;

  @ApiModelProperty(value = "")
  private String phoneNumber = null;
 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("EmailAddress")
 @Size(max=18)  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ContactSchema emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @JsonProperty("PhoneNumber")
 @Size(max=18)  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ContactSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSchema {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

