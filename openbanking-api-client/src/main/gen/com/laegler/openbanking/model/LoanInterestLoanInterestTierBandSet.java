package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LoanInterestLoanInterestFeesCharges;
import com.laegler.openbanking.model.LoanInterestLoanInterestTierBand;
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
public class LoanInterestLoanInterestTierBandSet  {
  

@XmlType(name="CalculationMethodEnum")
@XmlEnum(String.class)
public enum CalculationMethodEnum {

@XmlEnumValue("Compound") COMPOUND(String.valueOf("Compound")), @XmlEnumValue("SimpleInterest") SIMPLEINTEREST(String.valueOf("SimpleInterest"));


    private String value;

    CalculationMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculationMethodEnum fromValue(String v) {
        for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Methods of calculating interest")
 /**
   * Methods of calculating interest
  **/
  private CalculationMethodEnum calculationMethod = null;

  @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
 /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
 /**
   * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
  **/
  private List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  @ApiModelProperty(required = true, value = "Tier Band Details")
 /**
   * Tier Band Details
  **/
  private List<LoanInterestLoanInterestTierBand> loanInterestTierBand = new ArrayList<LoanInterestLoanInterestTierBand>();

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
 /**
   * Optional additional notes to supplement the Tier Band Set details
  **/
  private List<String> notes = null;


@XmlType(name="TierBandMethodEnum")
@XmlEnum(String.class)
public enum TierBandMethodEnum {

@XmlEnumValue("Banded") BANDED(String.valueOf("Banded")), @XmlEnumValue("Tiered") TIERED(String.valueOf("Tiered")), @XmlEnumValue("Whole") WHOLE(String.valueOf("Whole"));


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

  @ApiModelProperty(required = true, value = "The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance")
 /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance
  **/
  private TierBandMethodEnum tierBandMethod = null;
 /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @JsonProperty("CalculationMethod")
  public String getCalculationMethod() {
    if (calculationMethod == null) {
      return null;
    }
    return calculationMethod.value();
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public LoanInterestLoanInterestTierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
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

  public LoanInterestLoanInterestTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
   * @return loanInterestFeesCharges
  **/
  @JsonProperty("LoanInterestFeesCharges")
  public List<LoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
    return loanInterestFeesCharges;
  }

  public void setLoanInterestFeesCharges(List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
  }

  public LoanInterestLoanInterestTierBandSet loanInterestFeesCharges(List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addLoanInterestFeesChargesItem(LoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

 /**
   * Tier Band Details
   * @return loanInterestTierBand
  **/
  @JsonProperty("LoanInterestTierBand")
  public List<LoanInterestLoanInterestTierBand> getLoanInterestTierBand() {
    return loanInterestTierBand;
  }

  public void setLoanInterestTierBand(List<LoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public LoanInterestLoanInterestTierBandSet loanInterestTierBand(List<LoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addLoanInterestTierBandItem(LoanInterestLoanInterestTierBand loanInterestTierBandItem) {
    this.loanInterestTierBand.add(loanInterestTierBandItem);
    return this;
  }

 /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public LoanInterestLoanInterestTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterestLoanInterestTierBandSet addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the SME Loan balance
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

  public LoanInterestLoanInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterestLoanInterestTierBandSet {\n");
    
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
    sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

