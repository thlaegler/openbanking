package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBActiveOrHistoricCurrencyAndAmount5;
import com.laegler.openbanking.model.OBCreditDebitCode0;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
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
  * Set of elements used to provide details of a generic interest amount related to the statement resource.
 **/
@ApiModel(description="Set of elements used to provide details of a generic interest amount related to the statement resource.")
public class OBStatement2StatementInterest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBActiveOrHistoricCurrencyAndAmount5 amount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBCreditDebitCode0 creditDebitIndicator = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private String frequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal rate = null;

  @ApiModelProperty(value = "")
  private String rateType = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  @NotNull
  public OBActiveOrHistoricCurrencyAndAmount5 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
  }

  public OBStatement2StatementInterest amount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @JsonProperty("CreditDebitIndicator")
  @NotNull
  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementInterest creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("Description")
 @Size(min=1,max=128)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBStatement2StatementInterest description(String description) {
    this.description = description;
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

  public OBStatement2StatementInterest frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * Get rate
   * @return rate
  **/
  @JsonProperty("Rate")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public OBStatement2StatementInterest rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Get rateType
   * @return rateType
  **/
  @JsonProperty("RateType")
  public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }

  public OBStatement2StatementInterest rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementInterest type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementInterest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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

