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
  * Used by a Financial Institution internally to identify the location of an ATM.
 **/
@ApiModel(description="Used by a Financial Institution internally to identify the location of an ATM.")
public class Site  {
  
  @ApiModelProperty(value = "ATM site identification for the Financial Institution.")
 /**
   * ATM site identification for the Financial Institution.
  **/
  private String identification = null;

  @ApiModelProperty(value = "ATM site name as used by Financial Institution.")
 /**
   * ATM site name as used by Financial Institution.
  **/
  private String name = null;
 /**
   * ATM site identification for the Financial Institution.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Site identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * ATM site name as used by Financial Institution.
   * @return name
  **/
  @JsonProperty("Name")
 @Size(min=1,max=140)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Site name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

