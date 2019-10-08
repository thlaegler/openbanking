package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Feature and Benefit eligibility
 */
@ApiModel(description = "Feature and Benefit eligibility")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class FeaturesAndBenefits1FeatureBenefitEligibility   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Indicator")
  private Boolean indicator = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherType")
  private OtherType otherType = null;

  /**
   * Period for which the other eligibility criteria applies.
   */
  public enum PeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
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
   * Method by which we group eligibilities for comparison purposes.
   */
  public enum TypeEnum {
    ANYBUSINESSCUSTOMER("AnyBusinessCustomer"),
    
    BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),
    
    CREDITSCORING("CreditScoring"),
    
    OTHERFINANCIALHOLDING("OtherFinancialHolding"),
    
    OTHER("Other"),
    
    MINIMUMTURNOVER("MinimumTurnover");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public FeaturesAndBenefits1FeatureBenefitEligibility amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Any eligibility criteria where an amount is required to be specified e.g. Minimum Age.
   * @return amount
  **/
  @ApiModelProperty(value = "Any eligibility criteria where an amount is required to be specified e.g. Minimum Age.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Full description for the eligibility criteria
   * @return description
  **/
  @ApiModelProperty(value = "Full description for the eligibility criteria")

@Size(min=1,max=500) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False
   * @return indicator
  **/
  @ApiModelProperty(value = "Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False")


  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name provided for the eligibility criteria
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name provided for the eligibility criteria")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the eligibility conditions.
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the eligibility conditions.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility otherType(OtherType otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility period(PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * Period for which the other eligibility criteria applies.
   * @return period
  **/
  @ApiModelProperty(value = "Period for which the other eligibility criteria applies.")


  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public FeaturesAndBenefits1FeatureBenefitEligibility textual(String textual) {
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

  public FeaturesAndBenefits1FeatureBenefitEligibility type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Method by which we group eligibilities for comparison purposes.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Method by which we group eligibilities for comparison purposes.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    FeaturesAndBenefits1FeatureBenefitEligibility featuresAndBenefits1FeatureBenefitEligibility = (FeaturesAndBenefits1FeatureBenefitEligibility) o;
    return Objects.equals(this.amount, featuresAndBenefits1FeatureBenefitEligibility.amount) &&
        Objects.equals(this.description, featuresAndBenefits1FeatureBenefitEligibility.description) &&
        Objects.equals(this.indicator, featuresAndBenefits1FeatureBenefitEligibility.indicator) &&
        Objects.equals(this.name, featuresAndBenefits1FeatureBenefitEligibility.name) &&
        Objects.equals(this.notes, featuresAndBenefits1FeatureBenefitEligibility.notes) &&
        Objects.equals(this.otherType, featuresAndBenefits1FeatureBenefitEligibility.otherType) &&
        Objects.equals(this.period, featuresAndBenefits1FeatureBenefitEligibility.period) &&
        Objects.equals(this.textual, featuresAndBenefits1FeatureBenefitEligibility.textual) &&
        Objects.equals(this.type, featuresAndBenefits1FeatureBenefitEligibility.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, indicator, name, notes, otherType, period, textual, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits1FeatureBenefitEligibility {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
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

