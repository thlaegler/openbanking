package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBCurrencyExchange5InstructedAmount;
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
  * Set of elements used to provide details on the currency exchange.
 **/
@ApiModel(description="Set of elements used to provide details on the currency exchange.")
public class OBCurrencyExchange5  {
  
  @ApiModelProperty(value = "Unique identification to unambiguously identify the foreign exchange contract.")
 /**
   * Unique identification to unambiguously identify the foreign exchange contract.
  **/
  private String contractIdentification = null;

  @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
  @Valid
 /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
  **/
  private BigDecimal exchangeRate = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBCurrencyExchange5InstructedAmount instructedAmount = null;

  @ApiModelProperty(value = "Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String quotationDate = null;

  @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
 /**
   * Currency from which an amount is to be converted in a currency conversion.
  **/
  private String sourceCurrency = null;

  @ApiModelProperty(value = "Currency into which an amount is to be converted in a currency conversion.")
 /**
   * Currency into which an amount is to be converted in a currency conversion.
  **/
  private String targetCurrency = null;

  @ApiModelProperty(value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
 /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
  **/
  private String unitCurrency = null;
 /**
   * Unique identification to unambiguously identify the foreign exchange contract.
   * @return contractIdentification
  **/
  @JsonProperty("ContractIdentification")
 @Size(min=1,max=35)  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

 /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate &#x3D; UnitCurrency/QuotedCurrency).
   * @return exchangeRate
  **/
  @JsonProperty("ExchangeRate")
  @NotNull
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

 /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @JsonProperty("InstructedAmount")
  public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

 /**
   * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return quotationDate
  **/
  @JsonProperty("QuotationDate")
  public String getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(String quotationDate) {
    this.quotationDate = quotationDate;
  }

  public OBCurrencyExchange5 quotationDate(String quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

 /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
  **/
  @JsonProperty("SourceCurrency")
  @NotNull
 @Pattern(regexp="^[A-Z]{3,3}$")  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

 /**
   * Currency into which an amount is to be converted in a currency conversion.
   * @return targetCurrency
  **/
  @JsonProperty("TargetCurrency")
 @Pattern(regexp="^[A-Z]{3,3}$")  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

 /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @JsonProperty("UnitCurrency")
 @Pattern(regexp="^[A-Z]{3,3}$")  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCurrencyExchange5 {\n");
    
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
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

