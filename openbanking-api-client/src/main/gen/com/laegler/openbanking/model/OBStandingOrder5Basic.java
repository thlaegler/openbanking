package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount0;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount2;
import com.laegler.openbanking.model.OBExternalStandingOrderStatus1Code;
import com.laegler.openbanking.model.OBSupplementaryData1;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStandingOrder5Basic  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(value = "")
  private OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount = null;

  @ApiModelProperty(value = "")
  private String finalPaymentDateTime = null;

  @ApiModelProperty(value = "")
  private OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount = null;

  @ApiModelProperty(value = "")
  private String firstPaymentDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private String frequency = null;

  @ApiModelProperty(value = "")
  private OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount = null;

  @ApiModelProperty(value = "")
  private String nextPaymentDateTime = null;

  @ApiModelProperty(value = "")
  private String reference = null;

  @ApiModelProperty(value = "")
  private String standingOrderId = null;

  @ApiModelProperty(value = "")
  private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

  @ApiModelProperty(value = "")
  private OBSupplementaryData1 supplementaryData = null;
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

  public OBStandingOrder5Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  **/
  @JsonProperty("FinalPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount2 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder5Basic finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

 /**
   * Get finalPaymentDateTime
   * @return finalPaymentDateTime
  **/
  @JsonProperty("FinalPaymentDateTime")
  public String getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBStandingOrder5Basic finalPaymentDateTime(String finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

 /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  **/
  @JsonProperty("FirstPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount0 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder5Basic firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

 /**
   * Get firstPaymentDateTime
   * @return firstPaymentDateTime
  **/
  @JsonProperty("FirstPaymentDateTime")
  public String getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBStandingOrder5Basic firstPaymentDateTime(String firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

 /**
   * Get frequency
   * @return frequency
  **/
  @JsonProperty("Frequency")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStandingOrder5Basic frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  **/
  @JsonProperty("NextPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount1 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder5Basic nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount1 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

 /**
   * Get nextPaymentDateTime
   * @return nextPaymentDateTime
  **/
  @JsonProperty("NextPaymentDateTime")
  public String getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(String nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder5Basic nextPaymentDateTime(String nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
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

  public OBStandingOrder5Basic reference(String reference) {
    this.reference = reference;
    return this;
  }

 /**
   * Get standingOrderId
   * @return standingOrderId
  **/
  @JsonProperty("StandingOrderId")
  public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder5Basic standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

 /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
  **/
  @JsonProperty("StandingOrderStatusCode")
  public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder5Basic standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

 /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBStandingOrder5Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder5Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

