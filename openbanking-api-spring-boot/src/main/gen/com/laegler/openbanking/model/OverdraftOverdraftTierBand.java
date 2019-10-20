package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OverdraftOverdraftFeesCharges1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides overdraft details for a specific tier or band
 */
@ApiModel(description = "Provides overdraft details for a specific tier or band")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OverdraftOverdraftTierBand   {
  @JsonProperty("AgreementLengthMax")
  private Float agreementLengthMax = null;

  @JsonProperty("AgreementLengthMin")
  private Float agreementLengthMin = null;

  /**
   * Specifies the period of a fixed length overdraft agreement
   */
  public enum AgreementPeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
    YEAR("Year");

    private String value;

    AgreementPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AgreementPeriodEnum fromValue(String text) {
      for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AgreementPeriod")
  private AgreementPeriodEnum agreementPeriod = null;

  @JsonProperty("BankGuaranteedIndicator")
  private Boolean bankGuaranteedIndicator = null;

  @JsonProperty("EAR")
  private String EAR = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeesCharges")
  @Valid
  private List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges = null;

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is GBP 2k and the interest tiers are:- 0-GBP 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.
   */
  public enum OverdraftInterestChargingCoverageEnum {
    BANDED("Banded"),
    
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OverdraftInterestChargingCoverageEnum fromValue(String text) {
      for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("OverdraftInterestChargingCoverage")
  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage = null;

  @JsonProperty("TierValueMax")
  private String tierValueMax = null;

  @JsonProperty("TierValueMin")
  private String tierValueMin = null;

  public OverdraftOverdraftTierBand agreementLengthMax(Float agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
    return this;
  }

  /**
   * Specifies the maximum length of a band for a fixed overdraft agreement
   * @return agreementLengthMax
  **/
  @ApiModelProperty(value = "Specifies the maximum length of a band for a fixed overdraft agreement")


  public Float getAgreementLengthMax() {
    return agreementLengthMax;
  }

  public void setAgreementLengthMax(Float agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
  }

  public OverdraftOverdraftTierBand agreementLengthMin(Float agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
    return this;
  }

  /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
   * @return agreementLengthMin
  **/
  @ApiModelProperty(value = "Specifies the minimum length of a band for a fixed overdraft agreement")


  public Float getAgreementLengthMin() {
    return agreementLengthMin;
  }

  public void setAgreementLengthMin(Float agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
  }

  public OverdraftOverdraftTierBand agreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  /**
   * Specifies the period of a fixed length overdraft agreement
   * @return agreementPeriod
  **/
  @ApiModelProperty(value = "Specifies the period of a fixed length overdraft agreement")


  public AgreementPeriodEnum getAgreementPeriod() {
    return agreementPeriod;
  }

  public void setAgreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public OverdraftOverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.
   * @return bankGuaranteedIndicator
  **/
  @ApiModelProperty(value = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.")


  public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OverdraftOverdraftTierBand EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

  /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
  **/
  @ApiModelProperty(value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public OverdraftOverdraftTierBand identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OverdraftOverdraftTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftOverdraftTierBand addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier/band details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier/band details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftOverdraftTierBand overdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftOverdraftTierBand addOverdraftFeesChargesItem(OverdraftOverdraftFeesCharges1 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges
   * @return overdraftFeesCharges
  **/
  @ApiModelProperty(value = "Overdraft fees and charges")

  @Valid

  public List<OverdraftOverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public OverdraftOverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is GBP 2k and the interest tiers are:- 0-GBP 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.
   * @return overdraftInterestChargingCoverage
  **/
  @ApiModelProperty(value = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is GBP 2k and the interest tiers are:- 0-GBP 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.")


  public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public OverdraftOverdraftTierBand tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

  /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
  **/
  @ApiModelProperty(value = "Maximum value of Overdraft Tier/Band")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public OverdraftOverdraftTierBand tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }

  /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  **/
  @ApiModelProperty(required = true, value = "Minimum value of Overdraft Tier/Band")
  @NotNull

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftOverdraftTierBand overdraftOverdraftTierBand = (OverdraftOverdraftTierBand) o;
    return Objects.equals(this.agreementLengthMax, overdraftOverdraftTierBand.agreementLengthMax) &&
        Objects.equals(this.agreementLengthMin, overdraftOverdraftTierBand.agreementLengthMin) &&
        Objects.equals(this.agreementPeriod, overdraftOverdraftTierBand.agreementPeriod) &&
        Objects.equals(this.bankGuaranteedIndicator, overdraftOverdraftTierBand.bankGuaranteedIndicator) &&
        Objects.equals(this.EAR, overdraftOverdraftTierBand.EAR) &&
        Objects.equals(this.identification, overdraftOverdraftTierBand.identification) &&
        Objects.equals(this.notes, overdraftOverdraftTierBand.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraftOverdraftTierBand.overdraftFeesCharges) &&
        Objects.equals(this.overdraftInterestChargingCoverage, overdraftOverdraftTierBand.overdraftInterestChargingCoverage) &&
        Objects.equals(this.tierValueMax, overdraftOverdraftTierBand.tierValueMax) &&
        Objects.equals(this.tierValueMin, overdraftOverdraftTierBand.tierValueMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementLengthMax, agreementLengthMin, agreementPeriod, bankGuaranteedIndicator, EAR, identification, notes, overdraftFeesCharges, overdraftInterestChargingCoverage, tierValueMax, tierValueMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftTierBand {\n");
    
    sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
    sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
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

