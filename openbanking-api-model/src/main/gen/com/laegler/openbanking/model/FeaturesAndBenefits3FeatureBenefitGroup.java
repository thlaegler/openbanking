package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.FeaturesAndBenefits3FeatureBenefitEligibility;
import com.laegler.openbanking.model.FeaturesAndBenefits3FeatureBenefitItem;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherType3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FeatureBenefitGroup can be used to group features &amp; benefits in to packages (which may be chargeable at the group level).
 */
@ApiModel(description = "FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class FeaturesAndBenefits3FeatureBenefitGroup   {
  /**
   * How often is the charge for the feature/benefit group applied to the customer account
   */
  public enum ApplicationFrequencyEnum {
    DAILY("Daily"),
    
    HALFYEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    ApplicationFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplicationFrequencyEnum fromValue(String text) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ApplicationFrequency")
  private ApplicationFrequencyEnum applicationFrequency = null;

  @JsonProperty("BenefitGroupNominalValue")
  private String benefitGroupNominalValue = null;

  /**
   * How often is the charge for the feature/benefit group calculated for the customer account
   */
  public enum CalculationFrequencyEnum {
    DAILY("Daily"),
    
    HALFYEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    CalculationFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationFrequencyEnum fromValue(String text) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CalculationFrequency")
  private CalculationFrequencyEnum calculationFrequency = null;

  @JsonProperty("FeatureBenefitEligibility")
  @Valid
  private List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility = null;

  @JsonProperty("FeatureBenefitItem")
  @Valid
  private List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem = null;

  @JsonProperty("Fee")
  private String fee = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherApplicationFrequency")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @JsonProperty("OtherType")
  private OtherType3 otherType = null;

  /**
   * Common types of features & benefits
   */
  public enum TypeEnum {
    EARLYSETTLEMENT("EarlySettlement"),
    
    FLEXIBLEREPAYMENT("FlexibleRepayment"),
    
    OVERPAYMENT("OverPayment"),
    
    OTHER("Other"),
    
    PAYMENTHOLIDAYS("PaymentHolidays"),
    
    REPAYMENTHOLIDAY("RepaymentHoliday");

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

  public FeaturesAndBenefits3FeatureBenefitGroup applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How often is the charge for the feature/benefit group applied to the customer account
   * @return applicationFrequency
  **/
  @ApiModelProperty(value = "How often is the charge for the feature/benefit group applied to the customer account")


  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup benefitGroupNominalValue(String benefitGroupNominalValue) {
    this.benefitGroupNominalValue = benefitGroupNominalValue;
    return this;
  }

  /**
   * BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth
   * @return benefitGroupNominalValue
  **/
  @ApiModelProperty(value = "BenefitGroupNominalValue is  to allow banks to state what they feel their benefit package is worth")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getBenefitGroupNominalValue() {
    return benefitGroupNominalValue;
  }

  public void setBenefitGroupNominalValue(String benefitGroupNominalValue) {
    this.benefitGroupNominalValue = benefitGroupNominalValue;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is the charge for the feature/benefit group calculated for the customer account
   * @return calculationFrequency
  **/
  @ApiModelProperty(value = "How often is the charge for the feature/benefit group calculated for the customer account")


  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup featureBenefitEligibility(List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup addFeatureBenefitEligibilityItem(FeaturesAndBenefits3FeatureBenefitEligibility featureBenefitEligibilityItem) {
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

  public List<FeaturesAndBenefits3FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits3FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup featureBenefitItem(List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup addFeatureBenefitItemItem(FeaturesAndBenefits3FeatureBenefitItem featureBenefitItemItem) {
    if (this.featureBenefitItem == null) {
      this.featureBenefitItem = new ArrayList<>();
    }
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }

  /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")

  @Valid

  public List<FeaturesAndBenefits3FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Amount that is charged to the customer for a pack of features/benefits
   * @return fee
  **/
  @ApiModelProperty(value = "Amount that is charged to the customer for a pack of features/benefits")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Feature/Benefit Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Feature/Benefit Name")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Feature Benefit Group details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Feature Benefit Group details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup otherType(OtherType3 otherType) {
    this.otherType = otherType;
    return this;
  }

  /**
   * Get otherType
   * @return otherType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherType3 getOtherType() {
    return otherType;
  }

  public void setOtherType(OtherType3 otherType) {
    this.otherType = otherType;
  }

  public FeaturesAndBenefits3FeatureBenefitGroup type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Common types of features & benefits
   * @return type
  **/
  @ApiModelProperty(value = "Common types of features & benefits")


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
    FeaturesAndBenefits3FeatureBenefitGroup featuresAndBenefits3FeatureBenefitGroup = (FeaturesAndBenefits3FeatureBenefitGroup) o;
    return Objects.equals(this.applicationFrequency, featuresAndBenefits3FeatureBenefitGroup.applicationFrequency) &&
        Objects.equals(this.benefitGroupNominalValue, featuresAndBenefits3FeatureBenefitGroup.benefitGroupNominalValue) &&
        Objects.equals(this.calculationFrequency, featuresAndBenefits3FeatureBenefitGroup.calculationFrequency) &&
        Objects.equals(this.featureBenefitEligibility, featuresAndBenefits3FeatureBenefitGroup.featureBenefitEligibility) &&
        Objects.equals(this.featureBenefitItem, featuresAndBenefits3FeatureBenefitGroup.featureBenefitItem) &&
        Objects.equals(this.fee, featuresAndBenefits3FeatureBenefitGroup.fee) &&
        Objects.equals(this.name, featuresAndBenefits3FeatureBenefitGroup.name) &&
        Objects.equals(this.notes, featuresAndBenefits3FeatureBenefitGroup.notes) &&
        Objects.equals(this.otherApplicationFrequency, featuresAndBenefits3FeatureBenefitGroup.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, featuresAndBenefits3FeatureBenefitGroup.otherCalculationFrequency) &&
        Objects.equals(this.otherType, featuresAndBenefits3FeatureBenefitGroup.otherType) &&
        Objects.equals(this.type, featuresAndBenefits3FeatureBenefitGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFrequency, benefitGroupNominalValue, calculationFrequency, featureBenefitEligibility, featureBenefitItem, fee, name, notes, otherApplicationFrequency, otherCalculationFrequency, otherType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits3FeatureBenefitGroup {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

