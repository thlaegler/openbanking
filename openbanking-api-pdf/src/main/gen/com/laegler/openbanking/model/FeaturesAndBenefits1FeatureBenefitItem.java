package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.FeaturesAndBenefits1FeatureBenefitEligibility;
import com.laegler.openbanking.model.OtherType2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
 */
@ApiModel(description = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class FeaturesAndBenefits1FeatureBenefitItem   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("FeatureBenefitEligibility")
  @Valid
  private List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Indicator")
  private Boolean indicator = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherType")
  private OtherType2 otherType = null;

  @JsonProperty("Textual")
  private String textual = null;

  /**
   * Feature and Benefit type
   */
  public enum TypeEnum {
    ACCOUNTMANAGEMENT("AccountManagement"),
    
    CASHBACK("CashBack"),
    
    CREDITREPORTS("CreditReports"),
    
    LIFESTYLE("Lifestyle"),
    
    MOTORBREAKDOWN("MotorBreakdown"),
    
    OTHER("Other"),
    
    PAYMENTHOLIDAYS("PaymentHolidays"),
    
    SPENDLIMITS("SpendLimits"),
    
    TRAVELINSURANCE("TravelInsurance");

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

  public FeaturesAndBenefits1FeatureBenefitItem amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance
   * @return amount
  **/
  @ApiModelProperty(value = "Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public FeaturesAndBenefits1FeatureBenefitItem featureBenefitEligibility(List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitItem addFeatureBenefitEligibilityItem(FeaturesAndBenefits1FeatureBenefitEligibility featureBenefitEligibilityItem) {
    if (this.featureBenefitEligibility == null) {
      this.featureBenefitEligibility = new ArrayList<>();
    }
    this.featureBenefitEligibility.add(featureBenefitEligibilityItem);
    return this;
  }

  /**
   * Feature and Benefit eligibility
   * @return featureBenefitEligibility
  **/
  @ApiModelProperty(value = "Feature and Benefit eligibility")

  @Valid

  public List<FeaturesAndBenefits1FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits1FeatureBenefitItem identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Feature and Benefit Item.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public FeaturesAndBenefits1FeatureBenefitItem indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free BalanceTransfer?
   * @return indicator
  **/
  @ApiModelProperty(value = "True/False indicator for a particular feature/benefit e.g. Interest Free BalanceTransfer?")


  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public FeaturesAndBenefits1FeatureBenefitItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name which can be attached to the feature/benefit
   * @return name
  **/
  @ApiModelProperty(value = "Name which can be attached to the feature/benefit")

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefits1FeatureBenefitItem notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitItem addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits1FeatureBenefitItem otherType(OtherType2 otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType2 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType2 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits1FeatureBenefitItem textual(String textual) {
    this.textual = textual;
    return this;
  }

  /**
   * Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights
   * @return textual
  **/
  @ApiModelProperty(value = "Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights")

@Size(min=1,max=500) 
  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public FeaturesAndBenefits1FeatureBenefitItem type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Feature and Benefit type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Feature and Benefit type")
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
    FeaturesAndBenefits1FeatureBenefitItem featuresAndBenefits1FeatureBenefitItem = (FeaturesAndBenefits1FeatureBenefitItem) o;
    return Objects.equals(this.amount, featuresAndBenefits1FeatureBenefitItem.amount) &&
        Objects.equals(this.featureBenefitEligibility, featuresAndBenefits1FeatureBenefitItem.featureBenefitEligibility) &&
        Objects.equals(this.identification, featuresAndBenefits1FeatureBenefitItem.identification) &&
        Objects.equals(this.indicator, featuresAndBenefits1FeatureBenefitItem.indicator) &&
        Objects.equals(this.name, featuresAndBenefits1FeatureBenefitItem.name) &&
        Objects.equals(this.notes, featuresAndBenefits1FeatureBenefitItem.notes) &&
        Objects.equals(this.otherType, featuresAndBenefits1FeatureBenefitItem.otherType) &&
        Objects.equals(this.textual, featuresAndBenefits1FeatureBenefitItem.textual) &&
        Objects.equals(this.type, featuresAndBenefits1FeatureBenefitItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, featureBenefitEligibility, identification, indicator, name, notes, otherType, textual, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits1FeatureBenefitItem {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    featureBenefitEligibility: ").append(toIndentedString(featureBenefitEligibility)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
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

