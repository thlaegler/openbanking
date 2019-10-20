package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1;
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
  * Provides overdraft details for a specific tier or band
 **/
@ApiModel(description="Provides overdraft details for a specific tier or band")
public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand  {
  
  @ApiModelProperty(value = "Specifies the maximum length of a band for a fixed overdraft agreement")
 /**
   * Specifies the maximum length of a band for a fixed overdraft agreement
  **/
  private Integer agreementLengthMax = null;

  @ApiModelProperty(value = "Specifies the minimum length of a band for a fixed overdraft agreement")
 /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
  **/
  private Integer agreementLengthMin = null;


@XmlType(name="AgreementPeriodEnum")
@XmlEnum(String.class)
public enum AgreementPeriodEnum {

@XmlEnumValue("PACT") PACT(String.valueOf("PACT")), @XmlEnumValue("PDAY") PDAY(String.valueOf("PDAY")), @XmlEnumValue("PHYR") PHYR(String.valueOf("PHYR")), @XmlEnumValue("PMTH") PMTH(String.valueOf("PMTH")), @XmlEnumValue("PQTR") PQTR(String.valueOf("PQTR")), @XmlEnumValue("PWEK") PWEK(String.valueOf("PWEK")), @XmlEnumValue("PYER") PYER(String.valueOf("PYER"));


    private String value;

    AgreementPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AgreementPeriodEnum fromValue(String v) {
        for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Specifies the period of a fixed length overdraft agreement")
 /**
   * Specifies the period of a fixed length overdraft agreement
  **/
  private AgreementPeriodEnum agreementPeriod = null;

  @ApiModelProperty(value = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.")
 /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.
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

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges = null;


@XmlType(name="OverdraftInterestChargingCoverageEnum")
@XmlEnum(String.class)
public enum OverdraftInterestChargingCoverageEnum {

@XmlEnumValue("INBA") INBA(String.valueOf("INBA")), @XmlEnumValue("INTI") INTI(String.valueOf("INTI")), @XmlEnumValue("INWH") INWH(String.valueOf("INWH"));


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

  @ApiModelProperty(value = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is 2k and the interest tiers are:- 0-500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.")
 /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is 2k and the interest tiers are:- 0-500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.
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
   * Specifies the maximum length of a band for a fixed overdraft agreement
   * @return agreementLengthMax
  **/
  @JsonProperty("AgreementLengthMax")
  public Integer getAgreementLengthMax() {
    return agreementLengthMax;
  }

  public void setAgreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
    return this;
  }

 /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
   * @return agreementLengthMin
  **/
  @JsonProperty("AgreementLengthMin")
  public Integer getAgreementLengthMin() {
    return agreementLengthMin;
  }

  public void setAgreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
    return this;
  }

 /**
   * Specifies the period of a fixed length overdraft agreement
   * @return agreementPeriod
  **/
  @JsonProperty("AgreementPeriod")
  public String getAgreementPeriod() {
    if (agreementPeriod == null) {
      return null;
    }
    return agreementPeriod.value();
  }

  public void setAgreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand agreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

 /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.
   * @return bankGuaranteedIndicator
  **/
  @JsonProperty("BankGuaranteedIndicator")
  public Boolean isBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

 /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
  **/
  @JsonProperty("EAR")
  public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get overdraftFeesCharges
   * @return overdraftFeesCharges
  **/
  @JsonProperty("OverdraftFeesCharges")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftFeesCharges(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand addOverdraftFeesChargesItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeesCharges1 overdraftFeesChargesItem) {
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

 /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is 2k and the interest tiers are:- 0-500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the Whole of the account balance,  and in the 2nd that it is Tiered.
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

 /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
  **/
  @JsonProperty("TierValueMax")
  public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

 /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  **/
  @JsonProperty("TierValueMin")
  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBand {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

