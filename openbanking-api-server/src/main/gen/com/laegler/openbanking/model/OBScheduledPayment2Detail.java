package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification51;
import com.laegler.openbanking.model.OBCashAccount50;
import com.laegler.openbanking.model.OBExternalScheduleType1Code;
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

public class OBScheduledPayment2Detail  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBCashAccount50 creditorAccount = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBActiveOrHistoricCurrencyAndAmount9 instructedAmount = null;

  @ApiModelProperty(value = "")
  private String reference = null;

  @ApiModelProperty(required = true, value = "")
  private String scheduledPaymentDateTime = null;

  @ApiModelProperty(value = "")
  private String scheduledPaymentId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBExternalScheduleType1Code scheduledType = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBScheduledPayment2Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @JsonProperty("CreditorAccount")
  @NotNull
  public OBCashAccount50 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBScheduledPayment2Detail creditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

 /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @JsonProperty("CreditorAgent")
  public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBScheduledPayment2Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  @NotNull
  public OBActiveOrHistoricCurrencyAndAmount9 getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount9 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment2Detail instructedAmount(OBActiveOrHistoricCurrencyAndAmount9 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Get reference
   * @return reference
  **/
  @JsonProperty("Reference")
 @Size(min=1,max=35)  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBScheduledPayment2Detail reference(String reference) {
    this.reference = reference;
    return this;
  }

 /**
   * Get scheduledPaymentDateTime
   * @return scheduledPaymentDateTime
  **/
  @JsonProperty("ScheduledPaymentDateTime")
  @NotNull
  public String getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(String scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment2Detail scheduledPaymentDateTime(String scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

 /**
   * Get scheduledPaymentId
   * @return scheduledPaymentId
  **/
  @JsonProperty("ScheduledPaymentId")
 @Size(min=1,max=40)  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment2Detail scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

 /**
   * Get scheduledType
   * @return scheduledType
  **/
  @JsonProperty("ScheduledType")
  @NotNull
  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment2Detail scheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment2Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
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

