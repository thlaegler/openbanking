package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.Overdraft2OverdraftFeesCharges1;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Overdraft2OverdraftTierBand   {
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
  private List<Overdraft2OverdraftFeesCharges1> overdraftFeesCharges = null;

  /**
   * Interest charged on whole amount or tiered/banded
   */
  public enum OverdraftInterestChargingCoverageEnum {
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

  public Overdraft2OverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
   * @return bankGuaranteedIndicator
  **/
  @ApiModelProperty(value = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically")


  public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public Overdraft2OverdraftTierBand EAR(String EAR) {
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

  public Overdraft2OverdraftTierBand identification(String identification) {
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

  public Overdraft2OverdraftTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft2OverdraftTierBand addNotesItem(String notesItem) {
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

  public Overdraft2OverdraftTierBand overdraftFeesCharges(List<Overdraft2OverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public Overdraft2OverdraftTierBand addOverdraftFeesChargesItem(Overdraft2OverdraftFeesCharges1 overdraftFeesChargesItem) {
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

  public List<Overdraft2OverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<Overdraft2OverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public Overdraft2OverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Interest charged on whole amount or tiered/banded
   * @return overdraftInterestChargingCoverage
  **/
  @ApiModelProperty(value = "Interest charged on whole amount or tiered/banded")


  public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public Overdraft2OverdraftTierBand tierValueMax(String tierValueMax) {
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

  public Overdraft2OverdraftTierBand tierValueMin(String tierValueMin) {
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
    Overdraft2OverdraftTierBand overdraft2OverdraftTierBand = (Overdraft2OverdraftTierBand) o;
    return Objects.equals(this.bankGuaranteedIndicator, overdraft2OverdraftTierBand.bankGuaranteedIndicator) &&
        Objects.equals(this.EAR, overdraft2OverdraftTierBand.EAR) &&
        Objects.equals(this.identification, overdraft2OverdraftTierBand.identification) &&
        Objects.equals(this.notes, overdraft2OverdraftTierBand.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraft2OverdraftTierBand.overdraftFeesCharges) &&
        Objects.equals(this.overdraftInterestChargingCoverage, overdraft2OverdraftTierBand.overdraftInterestChargingCoverage) &&
        Objects.equals(this.tierValueMax, overdraft2OverdraftTierBand.tierValueMax) &&
        Objects.equals(this.tierValueMin, overdraft2OverdraftTierBand.tierValueMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankGuaranteedIndicator, EAR, identification, notes, overdraftFeesCharges, overdraftInterestChargingCoverage, tierValueMax, tierValueMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft2OverdraftTierBand {\n");
    
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

