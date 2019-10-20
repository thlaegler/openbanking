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
  * Set of elements to fully identify a proprietary bank transaction code.
 **/
@ApiModel(description="Set of elements to fully identify a proprietary bank transaction code.")
public class ProprietaryBankTransactionCodeStructure1  {
  
  @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
 /**
   * Proprietary bank transaction code to identify the underlying transaction.
  **/
  private String code = null;

  @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")
 /**
   * Identification of the issuer of the proprietary bank transaction code.
  **/
  private String issuer = null;
 /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
  **/
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProprietaryBankTransactionCodeStructure1 code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
  **/
  @JsonProperty("Issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

