package com.laegler.openbanking.model;

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
  * Provides the details to identify the beneficiary account.
 **/
@ApiModel(description="Provides the details to identify the beneficiary account.")
public class OBCashAccount50  {
  
  @ApiModelProperty(required = true, value = "Beneficiary account identification.")
 /**
   * Beneficiary account identification.
  **/
  private String identification = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(required = true, value = "")
  private String schemeName = null;

  @ApiModelProperty(value = "")
  private String secondaryIdentification = null;
 /**
   * Beneficiary account identification.
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
 @Size(min=1,max=256)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount50 identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("Name")
 @Size(min=1,max=70)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount50 name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get schemeName
   * @return schemeName
  **/
  @JsonProperty("SchemeName")
  @NotNull
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount50 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

 /**
   * Get secondaryIdentification
   * @return secondaryIdentification
  **/
  @JsonProperty("SecondaryIdentification")
 @Size(min=1,max=34)  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  public OBCashAccount50 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccount50 {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

