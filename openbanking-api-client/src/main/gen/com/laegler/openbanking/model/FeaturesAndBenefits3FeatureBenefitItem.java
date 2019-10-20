package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefits3FeatureBenefitEligibility;
import com.laegler.openbanking.model.OtherType2;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
 **/
@ApiModel(description="Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
public class FeaturesAndBenefits3FeatureBenefitItem  {
  
  @ApiModelProperty(value = "Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance")
 /**
   * Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance
  **/
  private String amount = null;

  @ApiModelProperty(value = "Feature and Benefit eligibility")
 /**
   * Feature and Benefit eligibility
  **/
  private List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Feature and Benefit Item.")
 /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
  **/
  private String identification = null;

  @ApiModelProperty(value = "True/False indicator for a particular feature/benefit e.g. Interest Free Period Yes or No")
 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Period Yes or No
  **/
  private Boolean indicator = null;

  @ApiModelProperty(value = "Name which can be attached to the feature/benefit")
 /**
   * Name which can be attached to the feature/benefit
  **/
  private String name = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions")
 /**
   * Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherType2 otherType = null;

  @ApiModelProperty(value = "Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights")
 /**
   * Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights
  **/
  private String textual = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("EarlySettlement") EARLYSETTLEMENT(String.valueOf("EarlySettlement")), @XmlEnumValue("FlexibleRepayment") FLEXIBLEREPAYMENT(String.valueOf("FlexibleRepayment")), @XmlEnumValue("OverPayment") OVERPAYMENT(String.valueOf("OverPayment")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PaymentHolidays") PAYMENTHOLIDAYS(String.valueOf("PaymentHolidays")), @XmlEnumValue("RepaymentHoliday") REPAYMENTHOLIDAY(String.valueOf("RepaymentHoliday"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Feature and Benefit type")
 /**
   * Feature and Benefit type
  **/
  private TypeEnum type = null;
 /**
   * Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance
   * @return amount
  **/
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public FeaturesAndBenefits3FeatureBenefitItem amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Feature and Benefit eligibility
   * @return featureBenefitEligibility
  **/
  @JsonProperty("FeatureBenefitEligibility")
  public List<FeaturesAndBenefits3FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits3FeatureBenefitItem featureBenefitEligibility(List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits3FeatureBenefitItem addFeatureBenefitEligibilityItem(FeaturesAndBenefits3FeatureBenefitEligibility featureBenefitEligibilityItem) {
    this.featureBenefitEligibility.add(featureBenefitEligibilityItem);
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public FeaturesAndBenefits3FeatureBenefitItem identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Period Yes or No
   * @return indicator
  **/
  @JsonProperty("Indicator")
  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public FeaturesAndBenefits3FeatureBenefitItem indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

 /**
   * Name which can be attached to the feature/benefit
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefits3FeatureBenefitItem name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optional additional notes to supplement the feature/benefit item. Only used for very specific conditions
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits3FeatureBenefitItem notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits3FeatureBenefitItem addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherType
   * @return otherType
  **/
  @JsonProperty("OtherType")
  public OtherType2 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType2 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits3FeatureBenefitItem otherType(OtherType2 otherType) {
    this.otherType = otherType;
    return this;
  }

 /**
   * Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights
   * @return textual
  **/
  @JsonProperty("Textual")
  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public FeaturesAndBenefits3FeatureBenefitItem textual(String textual) {
    this.textual = textual;
    return this;
  }

 /**
   * Feature and Benefit type
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FeaturesAndBenefits3FeatureBenefitItem type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits3FeatureBenefitItem {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

