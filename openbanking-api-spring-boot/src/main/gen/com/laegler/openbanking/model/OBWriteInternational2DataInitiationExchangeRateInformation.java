package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides details on the currency exchange rate and contract.
 */
@ApiModel(description = "Provides details on the currency exchange rate and contract.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBWriteInternational2DataInitiationExchangeRateInformation   {
  @JsonProperty("ContractIdentification")
  private String contractIdentification = null;

  @JsonProperty("ExchangeRate")
  private BigDecimal exchangeRate = null;

  /**
   * Specifies the type used to complete the currency exchange.
   */
  public enum RateTypeEnum {
    ACTUAL("Actual"),
    
    AGREED("Agreed"),
    
    INDICATIVE("Indicative");

    private String value;

    RateTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RateTypeEnum fromValue(String text) {
      for (RateTypeEnum b : RateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RateType")
  private RateTypeEnum rateType = null;

  @JsonProperty("UnitCurrency")
  private String unitCurrency = null;

  public OBWriteInternational2DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
   * @return contractIdentification
  **/
  @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")

@Size(min=1,max=256) 
  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")

  @Valid

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Specifies the type used to complete the currency exchange.
   * @return rateType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
  @NotNull


  public RateTypeEnum getRateType() {
    return rateType;
  }

  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
  @NotNull

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
    OBWriteInternational2DataInitiationExchangeRateInformation obWriteInternational2DataInitiationExchangeRateInformation = (OBWriteInternational2DataInitiationExchangeRateInformation) o;
    return Objects.equals(this.contractIdentification, obWriteInternational2DataInitiationExchangeRateInformation.contractIdentification) &&
        Objects.equals(this.exchangeRate, obWriteInternational2DataInitiationExchangeRateInformation.exchangeRate) &&
        Objects.equals(this.rateType, obWriteInternational2DataInitiationExchangeRateInformation.rateType) &&
        Objects.equals(this.unitCurrency, obWriteInternational2DataInitiationExchangeRateInformation.unitCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractIdentification, exchangeRate, rateType, unitCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternational2DataInitiationExchangeRateInformation {\n");
    
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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

