package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.laegler.openbanking.model.OBExternalScheduleType1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBScheduledPayment2Basic
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBScheduledPayment2Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount9 instructedAmount = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("ScheduledPaymentDateTime")
  private String scheduledPaymentDateTime = null;

  @JsonProperty("ScheduledPaymentId")
  private String scheduledPaymentId = null;

  @JsonProperty("ScheduledType")
  private OBExternalScheduleType1Code scheduledType = null;

  public OBScheduledPayment2Basic accountId(String accountId) {
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

  public OBScheduledPayment2Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount9 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBActiveOrHistoricCurrencyAndAmount9 getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount9 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment2Basic reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBScheduledPayment2Basic scheduledPaymentDateTime(String scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * Get scheduledPaymentDateTime
   * @return scheduledPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(String scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment2Basic scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * Get scheduledPaymentId
   * @return scheduledPaymentId
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=40) 
  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment2Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment2Basic obScheduledPayment2Basic = (OBScheduledPayment2Basic) o;
    return Objects.equals(this.accountId, obScheduledPayment2Basic.accountId) &&
        Objects.equals(this.instructedAmount, obScheduledPayment2Basic.instructedAmount) &&
        Objects.equals(this.reference, obScheduledPayment2Basic.reference) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment2Basic.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment2Basic.scheduledPaymentId) &&
        Objects.equals(this.scheduledType, obScheduledPayment2Basic.scheduledType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, instructedAmount, reference, scheduledPaymentDateTime, scheduledPaymentId, scheduledType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment2Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

