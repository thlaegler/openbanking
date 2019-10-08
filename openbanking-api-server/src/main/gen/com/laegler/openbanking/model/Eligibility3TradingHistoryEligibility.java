package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherTradingType;
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
  * Describes the trading history requirements to access the SME Loan product.
 **/
@ApiModel(description="Describes the trading history requirements to access the SME Loan product.")
public class Eligibility3TradingHistoryEligibility  {
  
  @ApiModelProperty(value = "Amount indicating the min max type")
 /**
   * Amount indicating the min max type
  **/
  private String amount = null;

  @ApiModelProperty(value = "Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False")
 /**
   * Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False
  **/
  private Boolean indicator = null;


@XmlType(name="MinMaxTypeEnum")
@XmlEnum(String.class)
public enum MinMaxTypeEnum {

@XmlEnumValue("Minimum") MINIMUM(String.valueOf("Minimum")), @XmlEnumValue("Maximum") MAXIMUM(String.valueOf("Maximum"));


    private String value;

    MinMaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MinMaxTypeEnum fromValue(String v) {
        for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Min Max type")
 /**
   * Min Max type
  **/
  private MinMaxTypeEnum minMaxType = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the TradingHistoryEligibility details")
 /**
   * Optional additional notes to supplement the TradingHistoryEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherTradingType otherTradingType = null;


@XmlType(name="PeriodEnum")
@XmlEnum(String.class)
public enum PeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    PeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String v) {
        for (PeriodEnum b : PeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.)")
 /**
   * The unit of period (days, weeks, months etc.)
  **/
  private PeriodEnum period = null;

  @ApiModelProperty(value = "Any eligibility criteria where a long description is supplied")
 /**
   * Any eligibility criteria where a long description is supplied
  **/
  private String textual = null;


@XmlType(name="TradingTypeEnum")
@XmlEnum(String.class)
public enum TradingTypeEnum {

@XmlEnumValue("AnnualReturns") ANNUALRETURNS(String.valueOf("AnnualReturns")), @XmlEnumValue("PreviousCCJSAllowed") PREVIOUSCCJSALLOWED(String.valueOf("PreviousCCJSAllowed")), @XmlEnumValue("GoodTradingHistory") GOODTRADINGHISTORY(String.valueOf("GoodTradingHistory")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PreviousBankruptcyAllowed") PREVIOUSBANKRUPTCYALLOWED(String.valueOf("PreviousBankruptcyAllowed")), @XmlEnumValue("TradingLength") TRADINGLENGTH(String.valueOf("TradingLength")), @XmlEnumValue("Turnover") TURNOVER(String.valueOf("Turnover"));


    private String value;

    TradingTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TradingTypeEnum fromValue(String v) {
        for (TradingTypeEnum b : TradingTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Trading type eligibility for the SME Loan product")
 /**
   * Trading type eligibility for the SME Loan product
  **/
  private TradingTypeEnum tradingType = null;
 /**
   * Amount indicating the min max type
   * @return amount
  **/
  @JsonProperty("Amount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Eligibility3TradingHistoryEligibility amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False
   * @return indicator
  **/
  @JsonProperty("Indicator")
  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public Eligibility3TradingHistoryEligibility indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

 /**
   * Min Max type
   * @return minMaxType
  **/
  @JsonProperty("MinMaxType")
  public String getMinMaxType() {
    if (minMaxType == null) {
      return null;
    }
    return minMaxType.value();
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public Eligibility3TradingHistoryEligibility minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Optional additional notes to supplement the TradingHistoryEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility3TradingHistoryEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility3TradingHistoryEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherTradingType
   * @return otherTradingType
  **/
  @JsonProperty("OtherTradingType")
  public OtherTradingType getOtherTradingType() {
    return otherTradingType;
  }

  public void setOtherTradingType(OtherTradingType otherTradingType) {
    this.otherTradingType = otherTradingType;
  }

  public Eligibility3TradingHistoryEligibility otherTradingType(OtherTradingType otherTradingType) {
    this.otherTradingType = otherTradingType;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.)
   * @return period
  **/
  @JsonProperty("Period")
  public String getPeriod() {
    if (period == null) {
      return null;
    }
    return period.value();
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public Eligibility3TradingHistoryEligibility period(PeriodEnum period) {
    this.period = period;
    return this;
  }

 /**
   * Any eligibility criteria where a long description is supplied
   * @return textual
  **/
  @JsonProperty("Textual")
 @Size(min=1,max=500)  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public Eligibility3TradingHistoryEligibility textual(String textual) {
    this.textual = textual;
    return this;
  }

 /**
   * Trading type eligibility for the SME Loan product
   * @return tradingType
  **/
  @JsonProperty("TradingType")
  public String getTradingType() {
    if (tradingType == null) {
      return null;
    }
    return tradingType.value();
  }

  public void setTradingType(TradingTypeEnum tradingType) {
    this.tradingType = tradingType;
  }

  public Eligibility3TradingHistoryEligibility tradingType(TradingTypeEnum tradingType) {
    this.tradingType = tradingType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility3TradingHistoryEligibility {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherTradingType: ").append(toIndentedString(otherTradingType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    tradingType: ").append(toIndentedString(tradingType)).append("\n");
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

