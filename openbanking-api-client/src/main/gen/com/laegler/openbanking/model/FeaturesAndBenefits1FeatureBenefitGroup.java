package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefits1FeatureBenefitEligibility;
import com.laegler.openbanking.model.FeaturesAndBenefits1FeatureBenefitItem;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherType3;
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
  * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).
 **/
@ApiModel(description="FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).")
public class FeaturesAndBenefits1FeatureBenefitGroup  {
  

@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("PerStatementDate") PERSTATEMENTDATE(String.valueOf("PerStatementDate")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    ApplicationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationFrequencyEnum fromValue(String v) {
        for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "How often is the charge for the feature/benefit group applied to the customer account")
 /**
   * How often is the charge for the feature/benefit group applied to the customer account
  **/
  private ApplicationFrequencyEnum applicationFrequency = null;

  @ApiModelProperty(value = "BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth")
 /**
   * BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth
  **/
  private String benefitGroupNominalValue = null;


@XmlType(name="CalculationFrequencyEnum")
@XmlEnum(String.class)
public enum CalculationFrequencyEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("PerStatementDate") PERSTATEMENTDATE(String.valueOf("PerStatementDate")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    CalculationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculationFrequencyEnum fromValue(String v) {
        for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "How often is the charge for the feature/benefit group calculated for the customer account")
 /**
   * How often is the charge for the feature/benefit group calculated for the customer account
  **/
  private CalculationFrequencyEnum calculationFrequency = null;

  @ApiModelProperty(value = "Feature and Benefit eligibility")
 /**
   * Feature and Benefit eligibility
  **/
  private List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility = null;

  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
  **/
  private List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem = null;

  @ApiModelProperty(value = "Amount that is charged to the customer for a pack of features/benefits")
 /**
   * Amount that is charged to the customer for a pack of features/benefits
  **/
  private String fee = null;

  @ApiModelProperty(required = true, value = "Feature/Benefit Name")
 /**
   * Feature/Benefit Name
  **/
  private String name = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Feature Benefit Group details")
 /**
   * Optional additional notes to supplement the Feature Benefit Group details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherType3 otherType = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("AccountManagement") ACCOUNTMANAGEMENT(String.valueOf("AccountManagement")), @XmlEnumValue("CashBack") CASHBACK(String.valueOf("CashBack")), @XmlEnumValue("CreditReports") CREDITREPORTS(String.valueOf("CreditReports")), @XmlEnumValue("Lifestyle") LIFESTYLE(String.valueOf("Lifestyle")), @XmlEnumValue("MotorBreakdown") MOTORBREAKDOWN(String.valueOf("MotorBreakdown")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PaymentHolidays") PAYMENTHOLIDAYS(String.valueOf("PaymentHolidays")), @XmlEnumValue("SpendLimits") SPENDLIMITS(String.valueOf("SpendLimits")), @XmlEnumValue("TravelInsurance") TRAVELINSURANCE(String.valueOf("TravelInsurance"));


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

  @ApiModelProperty(value = "Common types of features & benefits")
 /**
   * Common types of features & benefits
  **/
  private TypeEnum type = null;
 /**
   * How often is the charge for the feature/benefit group applied to the customer account
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  public String getApplicationFrequency() {
    if (applicationFrequency == null) {
      return null;
    }
    return applicationFrequency.value();
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth
   * @return benefitGroupNominalValue
  **/
  @JsonProperty("BenefitGroupNominalValue")
  public String getBenefitGroupNominalValue() {
    return benefitGroupNominalValue;
  }

  public void setBenefitGroupNominalValue(String benefitGroupNominalValue) {
    this.benefitGroupNominalValue = benefitGroupNominalValue;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup benefitGroupNominalValue(String benefitGroupNominalValue) {
    this.benefitGroupNominalValue = benefitGroupNominalValue;
    return this;
  }

 /**
   * How often is the charge for the feature/benefit group calculated for the customer account
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  public String getCalculationFrequency() {
    if (calculationFrequency == null) {
      return null;
    }
    return calculationFrequency.value();
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Feature and Benefit eligibility
   * @return featureBenefitEligibility
  **/
  @JsonProperty("FeatureBenefitEligibility")
  public List<FeaturesAndBenefits1FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup featureBenefitEligibility(List<FeaturesAndBenefits1FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup addFeatureBenefitEligibilityItem(FeaturesAndBenefits1FeatureBenefitEligibility featureBenefitEligibilityItem) {
    this.featureBenefitEligibility.add(featureBenefitEligibilityItem);
    return this;
  }

 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @JsonProperty("FeatureBenefitItem")
  public List<FeaturesAndBenefits1FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup featureBenefitItem(List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup addFeatureBenefitItemItem(FeaturesAndBenefits1FeatureBenefitItem featureBenefitItemItem) {
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }

 /**
   * Amount that is charged to the customer for a pack of features/benefits
   * @return fee
  **/
  @JsonProperty("Fee")
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup fee(String fee) {
    this.fee = fee;
    return this;
  }

 /**
   * Feature/Benefit Name
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optional additional notes to supplement the Feature Benefit Group details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Get otherType
   * @return otherType
  **/
  @JsonProperty("OtherType")
  public OtherType3 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType3 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits1FeatureBenefitGroup otherType(OtherType3 otherType) {
    this.otherType = otherType;
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

  public FeaturesAndBenefits1FeatureBenefitGroup type(TypeEnum type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits1FeatureBenefitGroup {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    benefitGroupNominalValue: ").append(toIndentedString(benefitGroupNominalValue)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    featureBenefitEligibility: ").append(toIndentedString(featureBenefitEligibility)).append("\n");
    sb.append("    featureBenefitItem: ").append(toIndentedString(featureBenefitItem)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherType: ").append(toIndentedString(otherType)).append("\n");
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

