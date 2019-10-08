package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft3OverdraftFeesCharges1;
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
  * Provides overdraft details for a specific tier or band
 **/
@ApiModel(description="Provides overdraft details for a specific tier or band")
public class Overdraft3OverdraftTierBand  {
  
  @ApiModelProperty(value = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically")
 /**
   * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
  **/
  private Boolean bankGuaranteedIndicator = null;

  @ApiModelProperty(value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
 /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
  **/
  private String EAR = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier/band details")
 /**
   * Optional additional notes to supplement the Tier/band details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Overdraft fees and charges")
  @Valid
 /**
   * Overdraft fees and charges
  **/
  private List<Overdraft3OverdraftFeesCharges1> overdraftFeesCharges = null;


@XmlType(name="OverdraftInterestChargingCoverageEnum")
@XmlEnum(String.class)
public enum OverdraftInterestChargingCoverageEnum {

@XmlEnumValue("Tiered") TIERED(String.valueOf("Tiered")), @XmlEnumValue("Whole") WHOLE(String.valueOf("Whole"));


    private String value;

    OverdraftInterestChargingCoverageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OverdraftInterestChargingCoverageEnum fromValue(String v) {
        for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Interest charged on whole amount or tiered/banded")
 /**
   * Interest charged on whole amount or tiered/banded
  **/
  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage = null;

  @ApiModelProperty(value = "Maximum value of Overdraft Tier/Band")
 /**
   * Maximum value of Overdraft Tier/Band
  **/
  private String tierValueMax = null;

  @ApiModelProperty(required = true, value = "Minimum value of Overdraft Tier/Band")
 /**
   * Minimum value of Overdraft Tier/Band
  **/
  private String tierValueMin = null;
 /**
   * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
   * @return bankGuaranteedIndicator
  **/
  @JsonProperty("BankGuaranteedIndicator")
  public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public Overdraft3OverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

 /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
  **/
  @JsonProperty("EAR")
 @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")  public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public Overdraft3OverdraftTierBand EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Overdraft3OverdraftTierBand identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Optional additional notes to supplement the Tier/band details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3OverdraftTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3OverdraftTierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Overdraft fees and charges
   * @return overdraftFeesCharges
  **/
  @JsonProperty("OverdraftFeesCharges")
  public List<Overdraft3OverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<Overdraft3OverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public Overdraft3OverdraftTierBand overdraftFeesCharges(List<Overdraft3OverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public Overdraft3OverdraftTierBand addOverdraftFeesChargesItem(Overdraft3OverdraftFeesCharges1 overdraftFeesChargesItem) {
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

 /**
   * Interest charged on whole amount or tiered/banded
   * @return overdraftInterestChargingCoverage
  **/
  @JsonProperty("OverdraftInterestChargingCoverage")
  public String getOverdraftInterestChargingCoverage() {
    if (overdraftInterestChargingCoverage == null) {
      return null;
    }
    return overdraftInterestChargingCoverage.value();
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public Overdraft3OverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

 /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
  **/
  @JsonProperty("TierValueMax")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public Overdraft3OverdraftTierBand tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

 /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  **/
  @JsonProperty("TierValueMin")
  @NotNull
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public Overdraft3OverdraftTierBand tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3OverdraftTierBand {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

