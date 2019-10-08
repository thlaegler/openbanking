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
  * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 **/
@ApiModel(description="Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
public class OBBankTransactionCodeStructure1  {
  
  @ApiModelProperty(required = true, value = "Specifies the family within a domain.")
 /**
   * Specifies the family within a domain.
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "Specifies the sub-product family within a specific family.")
 /**
   * Specifies the sub-product family within a specific family.
  **/
  private String subCode = null;
 /**
   * Specifies the family within a domain.
   * @return code
  **/
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBBankTransactionCodeStructure1 code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Specifies the sub-product family within a specific family.
   * @return subCode
  **/
  @JsonProperty("SubCode")
  public String getSubCode() {
    return subCode;
  }

  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }

  public OBBankTransactionCodeStructure1 subCode(String subCode) {
    this.subCode = subCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBankTransactionCodeStructure1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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

