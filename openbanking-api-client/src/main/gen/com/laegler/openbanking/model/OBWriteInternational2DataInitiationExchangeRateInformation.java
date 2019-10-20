package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

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
  * Provides details on the currency exchange rate and contract.
 **/
@ApiModel(description="Provides details on the currency exchange rate and contract.")
public class OBWriteInternational2DataInitiationExchangeRateInformation  {
  
  @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")
 /**
   * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
  **/
  private String contractIdentification = null;

  @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
 /**
   * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
  **/
  private BigDecimal exchangeRate = null;


@XmlType(name="RateTypeEnum")
@XmlEnum(String.class)
public enum RateTypeEnum {

@XmlEnumValue("Actual") ACTUAL(String.valueOf("Actual")), @XmlEnumValue("Agreed") AGREED(String.valueOf("Agreed")), @XmlEnumValue("Indicative") INDICATIVE(String.valueOf("Indicative"));


    private String value;

    RateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RateTypeEnum fromValue(String v) {
        for (RateTypeEnum b : RateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the type used to complete the currency exchange.")
 /**
   * Specifies the type used to complete the currency exchange.
  **/
  private RateTypeEnum rateType = null;

  @ApiModelProperty(required = true, value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
 /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
  **/
  private String unitCurrency = null;
 /**
   * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
   * @return contractIdentification
  **/
  @JsonProperty("ContractIdentification")
  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

 /**
   * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
   * @return exchangeRate
  **/
  @JsonProperty("ExchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

 /**
   * Specifies the type used to complete the currency exchange.
   * @return rateType
  **/
  @JsonProperty("RateType")
  public String getRateType() {
    if (rateType == null) {
      return null;
    }
    return rateType.value();
  }

  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

 /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @JsonProperty("UnitCurrency")
  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBWriteInternational2DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

