package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBCurrencyExchange5InstructedAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details on the currency exchange.
 */
@ApiModel(description = "Set of elements used to provide details on the currency exchange.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBCurrencyExchange5   {
  @JsonProperty("ContractIdentification")
  private String contractIdentification = null;

  @JsonProperty("ExchangeRate")
  private BigDecimal exchangeRate = null;

  @JsonProperty("InstructedAmount")
  private OBCurrencyExchange5InstructedAmount instructedAmount = null;

  @JsonProperty("QuotationDate")
  private String quotationDate = null;

  @JsonProperty("SourceCurrency")
  private String sourceCurrency = null;

  @JsonProperty("TargetCurrency")
  private String targetCurrency = null;

  @JsonProperty("UnitCurrency")
  private String unitCurrency = null;

  public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique identification to unambiguously identify the foreign exchange contract.
   * @return contractIdentification
  **/
  @ApiModelProperty(value = "Unique identification to unambiguously identify the foreign exchange contract.")

@Size(min=1,max=35) 
  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
   * @return exchangeRate
  **/
  @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
  @NotNull

  @Valid

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBCurrencyExchange5 quotationDate(String quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  /**
   * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return quotationDate
  **/
  @ApiModelProperty(value = "Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(String quotationDate) {
    this.quotationDate = quotationDate;
  }

  public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Currency into which an amount is to be converted in a currency conversion.
   * @return targetCurrency
  **/
  @ApiModelProperty(value = "Currency into which an amount is to be converted in a currency conversion.")

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @ApiModelProperty(value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
    return Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
        Objects.equals(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
        Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount) &&
        Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
        Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
        Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
        Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractIdentification, exchangeRate, instructedAmount, quotationDate, sourceCurrency, targetCurrency, unitCurrency);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

