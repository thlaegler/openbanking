package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBInterestCalculationMethod1Code;
import com.laegler.openbanking.model.OBOtherCodeType10;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand;
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
  * The group of tiers or bands for which debit interest can be applied.
 **/
@ApiModel(description="The group of tiers or bands for which debit interest can be applied.")
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet  {
  
  @ApiModelProperty(required = true, value = "")
  private OBInterestCalculationMethod1Code calculationMethod = null;

  @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
 /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
  **/
  private String identification = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand>();

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OBOtherCodeType10 otherCalculationMethod = null;


@XmlType(name="TierBandMethodEnum")
@XmlEnum(String.class)
public enum TierBandMethodEnum {

@XmlEnumValue("INBA") INBA(String.valueOf("INBA")), @XmlEnumValue("INTI") INTI(String.valueOf("INTI")), @XmlEnumValue("INWH") INWH(String.valueOf("INWH"));


    private String value;

    TierBandMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TierBandMethodEnum fromValue(String v) {
        for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance")
 /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
  **/
  private TierBandMethodEnum tierBandMethod = null;
 /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @JsonProperty("CalculationMethod")
  public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

 /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get loanInterestFeesCharges
   * @return loanInterestFeesCharges
  **/
  @JsonProperty("LoanInterestFeesCharges")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
    return loanInterestFeesCharges;
  }

  public void setLoanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestFeesChargesItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

 /**
   * Get loanInterestTierBand
   * @return loanInterestTierBand
  **/
  @JsonProperty("LoanInterestTierBand")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> getLoanInterestTierBand() {
    return loanInterestTierBand;
  }

  public void setLoanInterestTierBand(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBand(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestTierBandItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanInterestTierBandItem) {
    this.loanInterestTierBand.add(loanInterestTierBandItem);
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
  **/
  @JsonProperty("OtherCalculationMethod")
  public OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

 /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
   * @return tierBandMethod
  **/
  @JsonProperty("TierBandMethod")
  public String getTierBandMethod() {
    if (tierBandMethod == null) {
      return null;
    }
    return tierBandMethod.value();
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
    sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
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

