package com.laegler.openbanking.model;

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
  * Other repayment frequency which is not in the standard code list
 **/
@ApiModel(description="Other repayment frequency which is not in the standard code list")
public class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency  {
  
  @ApiModelProperty(value = "")
  private String code = null;

  @ApiModelProperty(required = true, value = "")
  private String description = null;

  @ApiModelProperty(required = true, value = "")
  private String name = null;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

