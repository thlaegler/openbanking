package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherTradingType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the trading history requirements to access the BCA product.
 */
@ApiModel(description = "Describes the trading history requirements to access the BCA product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class EligibilityTradingHistoryEligibility   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Indicator")
  private Boolean indicator = null;

  /**
   * Min Max type
   */
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MinMaxTypeEnum fromValue(String text) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MinMaxType")
  private MinMaxTypeEnum minMaxType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherTradingType")
  private OtherTradingType otherTradingType = null;

  /**
   * The unit of period (days, weeks, months etc.)
   */
  public enum PeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
    YEAR("Year");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Period")
  private PeriodEnum period = null;

  @JsonProperty("Textual")
  private String textual = null;

  /**
   * Trading type eligibility for the BCA product
   */
  public enum TradingTypeEnum {
    ANNUALRETURNS("AnnualReturns"),
    
    PREVIOUSCCJSALLOWED("PreviousCCJSAllowed"),
    
    GOODTRADINGHISTORY("GoodTradingHistory"),
    
    OTHER("Other"),
    
    PREVIOUSBANKRUPTCYALLOWED("PreviousBankruptcyAllowed"),
    
    TRADINGLENGTH("TradingLength"),
    
    TURNOVER("Turnover");

    private String value;

    TradingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TradingTypeEnum fromValue(String text) {
      for (TradingTypeEnum b : TradingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TradingType")
  private TradingTypeEnum tradingType = null;

  public EligibilityTradingHistoryEligibility amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount indicating the min max type
   * @return amount
  **/
  @ApiModelProperty(value = "Amount indicating the min max type")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public EligibilityTradingHistoryEligibility indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False
   * @return indicator
  **/
  @ApiModelProperty(value = "Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False")


  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public EligibilityTradingHistoryEligibility minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Min Max type
   * @return minMaxType
  **/
  @ApiModelProperty(value = "Min Max type")


  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public EligibilityTradingHistoryEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public EligibilityTradingHistoryEligibility addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the TradingHistoryEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the TradingHistoryEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public EligibilityTradingHistoryEligibility otherTradingType(OtherTradingType otherTradingType) {
    this.otherTradingType = otherTradingType;
    return this;
  }

  /**
   * Get otherTradingType
   * @return otherTradingType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherTradingType getOtherTradingType() {
    return otherTradingType;
  }

  public void setOtherTradingType(OtherTradingType otherTradingType) {
    this.otherTradingType = otherTradingType;
  }

  public EligibilityTradingHistoryEligibility period(PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.)
   * @return period
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.)")


  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public EligibilityTradingHistoryEligibility textual(String textual) {
    this.textual = textual;
    return this;
  }

  /**
   * Any eligibility criteria where a long description is supplied
   * @return textual
  **/
  @ApiModelProperty(value = "Any eligibility criteria where a long description is supplied")

@Size(min=1,max=500) 
  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public EligibilityTradingHistoryEligibility tradingType(TradingTypeEnum tradingType) {
    this.tradingType = tradingType;
    return this;
  }

  /**
   * Trading type eligibility for the BCA product
   * @return tradingType
  **/
  @ApiModelProperty(value = "Trading type eligibility for the BCA product")


  public TradingTypeEnum getTradingType() {
    return tradingType;
  }

  public void setTradingType(TradingTypeEnum tradingType) {
    this.tradingType = tradingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityTradingHistoryEligibility eligibilityTradingHistoryEligibility = (EligibilityTradingHistoryEligibility) o;
    return Objects.equals(this.amount, eligibilityTradingHistoryEligibility.amount) &&
        Objects.equals(this.indicator, eligibilityTradingHistoryEligibility.indicator) &&
        Objects.equals(this.minMaxType, eligibilityTradingHistoryEligibility.minMaxType) &&
        Objects.equals(this.notes, eligibilityTradingHistoryEligibility.notes) &&
        Objects.equals(this.otherTradingType, eligibilityTradingHistoryEligibility.otherTradingType) &&
        Objects.equals(this.period, eligibilityTradingHistoryEligibility.period) &&
        Objects.equals(this.textual, eligibilityTradingHistoryEligibility.textual) &&
        Objects.equals(this.tradingType, eligibilityTradingHistoryEligibility.tradingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, indicator, minMaxType, notes, otherTradingType, period, textual, tradingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityTradingHistoryEligibility {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

