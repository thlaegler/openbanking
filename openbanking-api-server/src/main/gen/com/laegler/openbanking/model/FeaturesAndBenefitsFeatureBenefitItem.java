package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefitsFeatureBenefitEligibility;
import com.laegler.openbanking.model.OtherType2;
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
  * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
 **/
@ApiModel(description="Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
public class FeaturesAndBenefitsFeatureBenefitItem  {
  
  @ApiModelProperty(value = "Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance")
 /**
   * Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance
  **/
  private String amount = null;

  @ApiModelProperty(value = "Feature and Benefit eligibility")
  @Valid
 /**
   * Feature and Benefit eligibility
  **/
  private List<FeaturesAndBenefitsFeatureBenefitEligibility> featureBenefitEligibility = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Feature and Benefit Item.")
 /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
  **/
  private String identification = null;

  @ApiModelProperty(value = "True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft? Yes or No")
 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft? Yes or No
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
  @Valid
  private OtherType2 otherType = null;

  @ApiModelProperty(value = "Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights")
 /**
   * Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights
  **/
  private String textual = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("AccountManagement") ACCOUNTMANAGEMENT(String.valueOf("AccountManagement")), @XmlEnumValue("AccountOpeningOrSwitchingIncentive") ACCOUNTOPENINGORSWITCHINGINCENTIVE(String.valueOf("AccountOpeningOrSwitchingIncentive")), @XmlEnumValue("Cashback") CASHBACK(String.valueOf("Cashback")), @XmlEnumValue("InternationalPaymentsSupport") INTERNATIONALPAYMENTSSUPPORT(String.valueOf("InternationalPaymentsSupport")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PreferentialRates") PREFERENTIALRATES(String.valueOf("PreferentialRates")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager")), @XmlEnumValue("Rewards") REWARDS(String.valueOf("Rewards")), @XmlEnumValue("SecureCash") SECURECASH(String.valueOf("SecureCash"));


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
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public FeaturesAndBenefitsFeatureBenefitItem amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Feature and Benefit eligibility
   * @return featureBenefitEligibility
  **/
  @JsonProperty("FeatureBenefitEligibility")
  public List<FeaturesAndBenefitsFeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefitsFeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefitsFeatureBenefitItem featureBenefitEligibility(List<FeaturesAndBenefitsFeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefitsFeatureBenefitItem addFeatureBenefitEligibilityItem(FeaturesAndBenefitsFeatureBenefitEligibility featureBenefitEligibilityItem) {
    this.featureBenefitEligibility.add(featureBenefitEligibilityItem);
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public FeaturesAndBenefitsFeatureBenefitItem identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft? Yes or No
   * @return indicator
  **/
  @JsonProperty("Indicator")
  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public FeaturesAndBenefitsFeatureBenefitItem indicator(Boolean indicator) {
    this.indicator = indicator;
    return this;
  }

 /**
   * Name which can be attached to the feature/benefit
   * @return name
  **/
  @JsonProperty("Name")
 @Size(min=1,max=350)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefitsFeatureBenefitItem name(String name) {
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

  public FeaturesAndBenefitsFeatureBenefitItem notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefitsFeatureBenefitItem addNotesItem(String notesItem) {
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

  public FeaturesAndBenefitsFeatureBenefitItem otherType(OtherType2 otherType) {
    this.otherType = otherType;
    return this;
  }

 /**
   * Provides textual information about a feature/benefit e.g. 10% off cinema tickets on Tuesday nights
   * @return textual
  **/
  @JsonProperty("Textual")
 @Size(min=1,max=500)  public String getTextual() {
    return textual;
  }

  public void setTextual(String textual) {
    this.textual = textual;
  }

  public FeaturesAndBenefitsFeatureBenefitItem textual(String textual) {
    this.textual = textual;
    return this;
  }

 /**
   * Feature and Benefit type
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FeaturesAndBenefitsFeatureBenefitItem type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefitsFeatureBenefitItem {\n");
    
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

