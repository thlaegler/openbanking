package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBExternalStatementType1Code;
import com.laegler.openbanking.model.OBStatement2StatementAmount;
import com.laegler.openbanking.model.OBStatement2StatementBenefit;
import com.laegler.openbanking.model.OBStatement2StatementDateTime;
import com.laegler.openbanking.model.OBStatement2StatementFee;
import com.laegler.openbanking.model.OBStatement2StatementInterest;
import com.laegler.openbanking.model.OBStatement2StatementRate;
import com.laegler.openbanking.model.OBStatement2StatementValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * Provides further details on a statement resource.
 **/
@ApiModel(description="Provides further details on a statement resource.")
public class OBStatement2  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(required = true, value = "")
  private String creationDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private String endDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private String startDateTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementAmount> statementAmount = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementBenefit> statementBenefit = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementDateTime> statementDateTime = null;

  @ApiModelProperty(value = "")
  private List<String> statementDescription = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementFee> statementFee = null;

  @ApiModelProperty(value = "")
  private String statementId = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementInterest> statementInterest = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementRate> statementRate = null;

  @ApiModelProperty(value = "")
  private String statementReference = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OBStatement2StatementValue> statementValue = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBExternalStatementType1Code type = null;
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

  public OBStatement2 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  @NotNull
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2 creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Get endDateTime
   * @return endDateTime
  **/
  @JsonProperty("EndDateTime")
  @NotNull
  public String getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2 endDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

 /**
   * Get startDateTime
   * @return startDateTime
  **/
  @JsonProperty("StartDateTime")
  @NotNull
  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2 startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

 /**
   * Get statementAmount
   * @return statementAmount
  **/
  @JsonProperty("StatementAmount")
  public List<OBStatement2StatementAmount> getStatementAmount() {
    return statementAmount;
  }

  public void setStatementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
  }

  public OBStatement2 statementAmount(List<OBStatement2StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement2 addStatementAmountItem(OBStatement2StatementAmount statementAmountItem) {
    this.statementAmount.add(statementAmountItem);
    return this;
  }

 /**
   * Get statementBenefit
   * @return statementBenefit
  **/
  @JsonProperty("StatementBenefit")
  public List<OBStatement2StatementBenefit> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2 statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2 addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

 /**
   * Get statementDateTime
   * @return statementDateTime
  **/
  @JsonProperty("StatementDateTime")
  public List<OBStatement2StatementDateTime> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2 statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2 addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

 /**
   * Get statementDescription
   * @return statementDescription
  **/
  @JsonProperty("StatementDescription")
  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2 statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2 addStatementDescriptionItem(String statementDescriptionItem) {
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

 /**
   * Get statementFee
   * @return statementFee
  **/
  @JsonProperty("StatementFee")
  public List<OBStatement2StatementFee> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2 statementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2 addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
    this.statementFee.add(statementFeeItem);
    return this;
  }

 /**
   * Get statementId
   * @return statementId
  **/
  @JsonProperty("StatementId")
 @Size(min=1,max=40)  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2 statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

 /**
   * Get statementInterest
   * @return statementInterest
  **/
  @JsonProperty("StatementInterest")
  public List<OBStatement2StatementInterest> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2 statementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2 addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
    this.statementInterest.add(statementInterestItem);
    return this;
  }

 /**
   * Get statementRate
   * @return statementRate
  **/
  @JsonProperty("StatementRate")
  public List<OBStatement2StatementRate> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2 statementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2 addStatementRateItem(OBStatement2StatementRate statementRateItem) {
    this.statementRate.add(statementRateItem);
    return this;
  }

 /**
   * Get statementReference
   * @return statementReference
  **/
  @JsonProperty("StatementReference")
 @Size(min=1,max=35)  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2 statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

 /**
   * Get statementValue
   * @return statementValue
  **/
  @JsonProperty("StatementValue")
  public List<OBStatement2StatementValue> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
  }

  public OBStatement2 statementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2 addStatementValueItem(OBStatement2StatementValue statementValueItem) {
    this.statementValue.add(statementValueItem);
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement2 type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2 {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

