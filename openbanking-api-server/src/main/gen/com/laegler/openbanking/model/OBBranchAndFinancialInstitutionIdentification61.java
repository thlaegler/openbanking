package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBPostalAddress6;
import io.swagger.annotations.ApiModel;
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
  * Financial institution servicing an account for the debtor.
 **/
@ApiModel(description="Financial institution servicing an account for the debtor.")
public class OBBranchAndFinancialInstitutionIdentification61  {
  
  @ApiModelProperty(value = "")
  private String identification = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBPostalAddress6 postalAddress = null;

  @ApiModelProperty(value = "")
  private String schemeName = null;
 /**
   * Get identification
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification61 identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("Name")
 @Size(min=1,max=140)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBBranchAndFinancialInstitutionIdentification61 name(String name) {
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

  public OBBranchAndFinancialInstitutionIdentification61 postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

 /**
   * Get schemeName
   * @return schemeName
  **/
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBBranchAndFinancialInstitutionIdentification61 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification61 {\n");
    
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

