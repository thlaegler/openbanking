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
  * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 **/
@ApiModel(description="Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
public class OBWriteInternationalStandingOrder3DataInitiationCreditorAgent  {
  
  @ApiModelProperty(value = "Unique and unambiguous identification of the servicing institution.")
 /**
   * Unique and unambiguous identification of the servicing institution.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")
 /**
   * Name by which an agent is known and which is usually used to identify that agent.
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private OBPostalAddress6 postalAddress = null;

  @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")
 /**
   * Name of the identification scheme, in a coded form as published in an external list.
  **/
  private String schemeName = null;
 /**
   * Unique and unambiguous identification of the servicing institution.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent name(String name) {
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

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

 /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBWriteInternationalStandingOrder3DataInitiationCreditorAgent schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrder3DataInitiationCreditorAgent {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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

