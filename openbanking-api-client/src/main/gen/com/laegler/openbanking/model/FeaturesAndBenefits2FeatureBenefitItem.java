package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitEligibility;
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
public class FeaturesAndBenefits2FeatureBenefitItem  {
  
  @ApiModelProperty(value = "Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance")
 /**
   * Amount associated to the feature/benefit where applicable e.g. 200 Pounds worth of travel insurance
  **/
  private String amount = null;

  @ApiModelProperty(value = "Feature and Benefit eligibility")
 /**
   * Feature and Benefit eligibility
  **/
  private List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Feature and Benefit Item.")
 /**
   * Unique and unambiguous identification of a  Feature and Benefit Item.
  **/
  private String identification = null;

  @ApiModelProperty(value = "True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft?")
 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft?
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

@XmlEnumValue("AccountManagement") ACCOUNTMANAGEMENT(String.valueOf("AccountManagement")), @XmlEnumValue("AccountOpeningOrSwitchingIncentive") ACCOUNTOPENINGORSWITCHINGINCENTIVE(String.valueOf("AccountOpeningOrSwitchingIncentive")), @XmlEnumValue("Cashback") CASHBACK(String.valueOf("Cashback")), @XmlEnumValue("Entertainment") ENTERTAINMENT(String.valueOf("Entertainment")), @XmlEnumValue("HomeInsurance") HOMEINSURANCE(String.valueOf("HomeInsurance")), @XmlEnumValue("HomeProtection") HOMEPROTECTION(String.valueOf("HomeProtection")), @XmlEnumValue("InternationalPaymentSupport") INTERNATIONALPAYMENTSUPPORT(String.valueOf("InternationalPaymentSupport")), @XmlEnumValue("Lifestyle") LIFESTYLE(String.valueOf("Lifestyle")), @XmlEnumValue("MotorBreakdown") MOTORBREAKDOWN(String.valueOf("MotorBreakdown")), @XmlEnumValue("OverdraftControl") OVERDRAFTCONTROL(String.valueOf("OverdraftControl")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PremiumService") PREMIUMSERVICE(String.valueOf("PremiumService")), @XmlEnumValue("PreferentialRates") PREFERENTIALRATES(String.valueOf("PreferentialRates")), @XmlEnumValue("PassiveSaving") PASSIVESAVING(String.valueOf("PassiveSaving")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager")), @XmlEnumValue("Rewards") REWARDS(String.valueOf("Rewards")), @XmlEnumValue("TechnologyInsurance") TECHNOLOGYINSURANCE(String.valueOf("TechnologyInsurance")), @XmlEnumValue("TravelInsurance") TRAVELINSURANCE(String.valueOf("TravelInsurance")), @XmlEnumValue("Travel") TRAVEL(String.valueOf("Travel"));


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

  @ApiModelProperty(required = true, value = "Common types of features & benefits")
 /**
   * Common types of features & benefits
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

  public FeaturesAndBenefits2FeatureBenefitItem amount(String amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Feature and Benefit eligibility
   * @return featureBenefitEligibility
  **/
  @JsonProperty("FeatureBenefitEligibility")
  public List<FeaturesAndBenefits2FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits2FeatureBenefitItem featureBenefitEligibility(List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits2FeatureBenefitItem addFeatureBenefitEligibilityItem(FeaturesAndBenefits2FeatureBenefitEligibility featureBenefitEligibilityItem) {
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

  public FeaturesAndBenefits2FeatureBenefitItem identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * True/False indicator for a particular feature/benefit e.g. Interest Free Overdraft?
   * @return indicator
  **/
  @JsonProperty("Indicator")
  public Boolean isIndicator() {
    return indicator;
  }

  public void setIndicator(Boolean indicator) {
    this.indicator = indicator;
  }

  public FeaturesAndBenefits2FeatureBenefitItem indicator(Boolean indicator) {
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

  public FeaturesAndBenefits2FeatureBenefitItem name(String name) {
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

  public FeaturesAndBenefits2FeatureBenefitItem notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits2FeatureBenefitItem addNotesItem(String notesItem) {
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

  public FeaturesAndBenefits2FeatureBenefitItem otherType(OtherType2 otherType) {
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

  public FeaturesAndBenefits2FeatureBenefitItem textual(String textual) {
    this.textual = textual;
    return this;
  }

 /**
   * Common types of features &amp; benefits
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

  public FeaturesAndBenefits2FeatureBenefitItem type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits2FeatureBenefitItem {\n");
    
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

