package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBExternalStatementType1Code;
import com.laegler.openbanking.model.OBStatement2StatementBenefit;
import com.laegler.openbanking.model.OBStatement2StatementDateTime;
import com.laegler.openbanking.model.OBStatement2StatementFee;
import com.laegler.openbanking.model.OBStatement2StatementInterest;
import com.laegler.openbanking.model.OBStatement2StatementRate;
import com.laegler.openbanking.model.OBStatement2StatementValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides further details on a statement resource.
 */
@ApiModel(description = "Provides further details on a statement resource.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBStatement2Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("CreationDateTime")
  private String creationDateTime = null;

  @JsonProperty("EndDateTime")
  private String endDateTime = null;

  @JsonProperty("StartDateTime")
  private String startDateTime = null;

  @JsonProperty("StatementBenefit")
  @Valid
  private List<OBStatement2StatementBenefit> statementBenefit = null;

  @JsonProperty("StatementDateTime")
  @Valid
  private List<OBStatement2StatementDateTime> statementDateTime = null;

  @JsonProperty("StatementDescription")
  @Valid
  private List<String> statementDescription = null;

  @JsonProperty("StatementFee")
  @Valid
  private List<OBStatement2StatementFee> statementFee = null;

  @JsonProperty("StatementId")
  private String statementId = null;

  @JsonProperty("StatementInterest")
  @Valid
  private List<OBStatement2StatementInterest> statementInterest = null;

  @JsonProperty("StatementRate")
  @Valid
  private List<OBStatement2StatementRate> statementRate = null;

  @JsonProperty("StatementReference")
  private String statementReference = null;

  @JsonProperty("StatementValue")
  @Valid
  private List<OBStatement2StatementValue> statementValue = null;

  @JsonProperty("Type")
  private OBExternalStatementType1Code type = null;

  public OBStatement2Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStatement2Basic creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2Basic endDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2Basic startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Get startDateTime
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2Basic statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2Basic addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Get statementBenefit
   * @return statementBenefit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementBenefit> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2Basic statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2Basic addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Get statementDateTime
   * @return statementDateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementDateTime> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2Basic statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2Basic addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Get statementDescription
   * @return statementDescription
  **/
  @ApiModelProperty(value = "")


  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2Basic statementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2Basic addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Get statementFee
   * @return statementFee
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementFee> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2Basic statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Get statementId
   * @return statementId
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=40) 
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2Basic statementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2Basic addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Get statementInterest
   * @return statementInterest
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementInterest> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2Basic statementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2Basic addStatementRateItem(OBStatement2StatementRate statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Get statementRate
   * @return statementRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementRate> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2Basic statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2Basic statementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2Basic addStatementValueItem(OBStatement2StatementValue statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Get statementValue
   * @return statementValue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBStatement2StatementValue> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
    this.statementValue = statementValue;
  }

  public OBStatement2Basic type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2Basic obStatement2Basic = (OBStatement2Basic) o;
    return Objects.equals(this.accountId, obStatement2Basic.accountId) &&
        Objects.equals(this.creationDateTime, obStatement2Basic.creationDateTime) &&
        Objects.equals(this.endDateTime, obStatement2Basic.endDateTime) &&
        Objects.equals(this.startDateTime, obStatement2Basic.startDateTime) &&
        Objects.equals(this.statementBenefit, obStatement2Basic.statementBenefit) &&
        Objects.equals(this.statementDateTime, obStatement2Basic.statementDateTime) &&
        Objects.equals(this.statementDescription, obStatement2Basic.statementDescription) &&
        Objects.equals(this.statementFee, obStatement2Basic.statementFee) &&
        Objects.equals(this.statementId, obStatement2Basic.statementId) &&
        Objects.equals(this.statementInterest, obStatement2Basic.statementInterest) &&
        Objects.equals(this.statementRate, obStatement2Basic.statementRate) &&
        Objects.equals(this.statementReference, obStatement2Basic.statementReference) &&
        Objects.equals(this.statementValue, obStatement2Basic.statementValue) &&
        Objects.equals(this.type, obStatement2Basic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationDateTime, endDateTime, startDateTime, statementBenefit, statementDateTime, statementDescription, statementFee, statementId, statementInterest, statementRate, statementReference, statementValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

