package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBPostalAddress6;
import io.swagger.annotations.ApiModel;

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
  * Party to which an amount of money is due.
 **/
@ApiModel(description="Party to which an amount of money is due.")
public class OBWriteInternational2DataInitiationCreditor  {
  
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")
 /**
   * Name by which a party is known and which is usually used to identify that party.
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private OBPostalAddress6 postalAddress = null;
 /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteInternational2DataInitiationCreditor name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get postalAddress
   * @return postalAddress
  **/
  @JsonProperty("PostalAddress")
  public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public OBWriteInternational2DataInitiationCreditor postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternational2DataInitiationCreditor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

