package com.laegler.openbanking.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBeneficiary3Basic  {
  
  @ApiModelProperty(value = "")
  private String accountId = null;

  @ApiModelProperty(value = "")
  private String beneficiaryId = null;

  @ApiModelProperty(value = "")
  private String reference = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBBeneficiary3Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get beneficiaryId
   * @return beneficiaryId
  **/
  @JsonProperty("BeneficiaryId")
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public OBBeneficiary3Basic beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

 /**
   * Get reference
   * @return reference
  **/
  @JsonProperty("Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBBeneficiary3Basic reference(String reference) {
    this.reference = reference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary3Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

