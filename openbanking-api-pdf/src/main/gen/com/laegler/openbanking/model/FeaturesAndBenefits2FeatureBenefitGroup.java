package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitEligibility;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitItem;
import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherType2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used to group multiple features/benefits where a charge is applied
 */
@ApiModel(description = "Used to group multiple features/benefits where a charge is applied")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class FeaturesAndBenefits2FeatureBenefitGroup   {
  /**
   * How often is the charge for the feature/benefit group applied to the customer account
   */
  public enum ApplicationFrequencyEnum {
    PERACADEMICTERM("PerAcademicTerm"),
    
    DAILY("Daily"),
    
    HALFYEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PERSTATEMENTDATE("PerStatementDate"),
    
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
    PERACADEMICTERM("PerAcademicTerm"),
    
    DAILY("Daily"),
    
    HALFYEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PERSTATEMENTDATE("PerStatementDate"),
    
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
  private List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility = null;

  @JsonProperty("FeatureBenefitItem")
  @Valid
  private List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem = null;

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
  private OtherType2 otherType = null;

  /**
   * Common types of features & benefits
   */
  public enum TypeEnum {
    ACCOUNTMANAGEMENT("AccountManagement"),
    
    ACCOUNTOPENINGORSWITCHINGINCENTIVE("AccountOpeningOrSwitchingIncentive"),
    
    CASHBACK("Cashback"),
    
    ENTERTAINMENT("Entertainment"),
    
    HOMEINSURANCE("HomeInsurance"),
    
    HOMEPROTECTION("HomeProtection"),
    
    INTERNATIONALPAYMENTSUPPORT("InternationalPaymentSupport"),
    
    LIFESTYLE("Lifestyle"),
    
    MOTORBREAKDOWN("MotorBreakdown"),
    
    OVERDRAFTCONTROL("OverdraftControl"),
    
    OTHER("Other"),
    
    PREMIUMSERVICE("PremiumService"),
    
    PREFERENTIALRATES("PreferentialRates"),
    
    PASSIVESAVING("PassiveSaving"),
    
    RELATIONSHIPMANAGER("RelationshipManager"),
    
    REWARDS("Rewards"),
    
    TECHNOLOGYINSURANCE("TechnologyInsurance"),
    
    TRAVELINSURANCE("TravelInsurance"),
    
    TRAVEL("Travel");

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

  public FeaturesAndBenefits2FeatureBenefitGroup applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup benefitGroupNominalValue(String benefitGroupNominalValue) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup featureBenefitEligibility(List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
    return this;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup addFeatureBenefitEligibilityItem(FeaturesAndBenefits2FeatureBenefitEligibility featureBenefitEligibilityItem) {
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

  public List<FeaturesAndBenefits2FeatureBenefitEligibility> getFeatureBenefitEligibility() {
    return featureBenefitEligibility;
  }

  public void setFeatureBenefitEligibility(List<FeaturesAndBenefits2FeatureBenefitEligibility> featureBenefitEligibility) {
    this.featureBenefitEligibility = featureBenefitEligibility;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup featureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup addFeatureBenefitItemItem(FeaturesAndBenefits2FeatureBenefitItem featureBenefitItemItem) {
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

  public List<FeaturesAndBenefits2FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Fee that is charged to the customer for a pack of features/benefits
   * @return fee
  **/
  @ApiModelProperty(value = "Fee that is charged to the customer for a pack of features/benefits")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup name(String name) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public FeaturesAndBenefits2FeatureBenefitGroup addNotesItem(String notesItem) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup otherType(OtherType2 otherType) {
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

  public FeaturesAndBenefits2FeatureBenefitGroup type(TypeEnum type) {
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
    FeaturesAndBenefits2FeatureBenefitGroup featuresAndBenefits2FeatureBenefitGroup = (FeaturesAndBenefits2FeatureBenefitGroup) o;
    return Objects.equals(this.applicationFrequency, featuresAndBenefits2FeatureBenefitGroup.applicationFrequency) &&
        Objects.equals(this.benefitGroupNominalValue, featuresAndBenefits2FeatureBenefitGroup.benefitGroupNominalValue) &&
        Objects.equals(this.calculationFrequency, featuresAndBenefits2FeatureBenefitGroup.calculationFrequency) &&
        Objects.equals(this.featureBenefitEligibility, featuresAndBenefits2FeatureBenefitGroup.featureBenefitEligibility) &&
        Objects.equals(this.featureBenefitItem, featuresAndBenefits2FeatureBenefitGroup.featureBenefitItem) &&
        Objects.equals(this.fee, featuresAndBenefits2FeatureBenefitGroup.fee) &&
        Objects.equals(this.name, featuresAndBenefits2FeatureBenefitGroup.name) &&
        Objects.equals(this.notes, featuresAndBenefits2FeatureBenefitGroup.notes) &&
        Objects.equals(this.otherApplicationFrequency, featuresAndBenefits2FeatureBenefitGroup.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, featuresAndBenefits2FeatureBenefitGroup.otherCalculationFrequency) &&
        Objects.equals(this.otherType, featuresAndBenefits2FeatureBenefitGroup.otherType) &&
        Objects.equals(this.type, featuresAndBenefits2FeatureBenefitGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationFrequency, benefitGroupNominalValue, calculationFrequency, featureBenefitEligibility, featureBenefitItem, fee, name, notes, otherApplicationFrequency, otherCalculationFrequency, otherType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits2FeatureBenefitGroup {\n");
    
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

