package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification62;
import com.laegler.openbanking.model.OBCashAccount51;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBeneficiary3Detail  {
  
  @ApiModelProperty(value = "")
  private String accountId = null;

  @ApiModelProperty(value = "")
  private String beneficiaryId = null;

  @ApiModelProperty(required = true, value = "")
  private OBCashAccount51 creditorAccount = null;

  @ApiModelProperty(value = "")
  private OBBranchAndFinancialInstitutionIdentification62 creditorAgent = null;

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

  public OBBeneficiary3Detail accountId(String accountId) {
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

  public OBBeneficiary3Detail beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBBeneficiary3Detail creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @JsonProperty("CreditorAgent")
  public OBBranchAndFinancialInstitutionIdentification62 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification62 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBBeneficiary3Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification62 creditorAgent) {
    this.creditorAgent = creditorAgent;
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

  public OBBeneficiary3Detail reference(String reference) {
    this.reference = reference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary3Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
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

