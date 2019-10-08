package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LoanInterestLoanInterestFeesCharges;
import com.laegler.openbanking.model.OtherLoanProviderInterestRateType;
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
  * Tier Band Details
 **/
@ApiModel(description="Tier Band Details")
public class LoanInterestLoanInterestTierBand  {
  

@XmlType(name="FixedVariableInterestRateTypeEnum")
@XmlEnum(String.class)
public enum FixedVariableInterestRateTypeEnum {

@XmlEnumValue("Fixed") FIXED(String.valueOf("Fixed")), @XmlEnumValue("Variable") VARIABLE(String.valueOf("Variable"));


    private String value;

    FixedVariableInterestRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FixedVariableInterestRateTypeEnum fromValue(String v) {
        for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Type of interest rate, Fixed or Variable")
 /**
   * Type of interest rate, Fixed or Variable
  **/
  private FixedVariableInterestRateTypeEnum fixedVariableInterestRateType = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a SME Loan.")
 /**
   * Unique and unambiguous identification of a  Tier Band for a SME Loan.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
 /**
   * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
  **/
  private List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  @ApiModelProperty(value = "Loan provider Interest for the SME Loan product")
 /**
   * Loan provider Interest for the SME Loan product
  **/
  private String loanProviderInterestRate = null;


@XmlType(name="LoanProviderInterestRateTypeEnum")
@XmlEnum(String.class)
public enum LoanProviderInterestRateTypeEnum {

@XmlEnumValue("BOEBaseRate") BOEBASERATE(String.valueOf("BOEBaseRate")), @XmlEnumValue("FixedRate") FIXEDRATE(String.valueOf("FixedRate")), @XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("LoanProviderBaseRate") LOANPROVIDERBASERATE(String.valueOf("LoanProviderBaseRate")), @XmlEnumValue("Net") NET(String.valueOf("Net")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    LoanProviderInterestRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LoanProviderInterestRateTypeEnum fromValue(String v) {
        for (LoanProviderInterestRateTypeEnum b : LoanProviderInterestRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.")
 /**
   * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
  **/
  private LoanProviderInterestRateTypeEnum loanProviderInterestRateType = null;


@XmlType(name="MaxTermPeriodEnum")
@XmlEnum(String.class)
public enum MaxTermPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    MaxTermPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MaxTermPeriodEnum fromValue(String v) {
        for (MaxTermPeriodEnum b : MaxTermPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the Maximum Term")
 /**
   * The unit of period (days, weeks, months etc.) of the Maximum Term
  **/
  private MaxTermPeriodEnum maxTermPeriod = null;


@XmlType(name="MinTermPeriodEnum")
@XmlEnum(String.class)
public enum MinTermPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    MinTermPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MinTermPeriodEnum fromValue(String v) {
        for (MinTermPeriodEnum b : MinTermPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The unit of period (days, weeks, months etc.) of the Minimum Term")
 /**
   * The unit of period (days, weeks, months etc.) of the Minimum Term
  **/
  private MinTermPeriodEnum minTermPeriod = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")
 /**
   * Optional additional notes to supplement the Tier Band details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherLoanProviderInterestRateType otherLoanProviderInterestRateType = null;

  @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   For SME Loan, this APR is the representative APR which includes any account fees.")
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   For SME Loan, this APR is the representative APR which includes any account fees.
  **/
  private String repAPR = null;

  @ApiModelProperty(value = "Maximum loan term for which the loan interest tier applies.")
 /**
   * Maximum loan term for which the loan interest tier applies.
  **/
  private Float tierValueMaxTerm = null;

  @ApiModelProperty(value = "Maximum loan value for which the loan interest tier applies.")
 /**
   * Maximum loan value for which the loan interest tier applies.
  **/
  private String tierValueMaximum = null;

  @ApiModelProperty(required = true, value = "Minimum loan term for which the loan interest tier applies.")
 /**
   * Minimum loan term for which the loan interest tier applies.
  **/
  private Float tierValueMinTerm = null;

  @ApiModelProperty(required = true, value = "Minimum loan value for which the loan interest tier applies.")
 /**
   * Minimum loan value for which the loan interest tier applies.
  **/
  private String tierValueMinimum = null;
 /**
   * Type of interest rate, Fixed or Variable
   * @return fixedVariableInterestRateType
  **/
  @JsonProperty("FixedVariableInterestRateType")
  public String getFixedVariableInterestRateType() {
    if (fixedVariableInterestRateType == null) {
      return null;
    }
    return fixedVariableInterestRateType.value();
  }

  public void setFixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public LoanInterestLoanInterestTierBand fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a SME Loan.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public LoanInterestLoanInterestTierBand identification(String identification) {
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

  public LoanInterestLoanInterestTierBand loanInterestFeesCharges(List<LoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public LoanInterestLoanInterestTierBand addLoanInterestFeesChargesItem(LoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

 /**
   * Loan provider Interest for the SME Loan product
   * @return loanProviderInterestRate
  **/
  @JsonProperty("LoanProviderInterestRate")
  public String getLoanProviderInterestRate() {
    return loanProviderInterestRate;
  }

  public void setLoanProviderInterestRate(String loanProviderInterestRate) {
    this.loanProviderInterestRate = loanProviderInterestRate;
  }

  public LoanInterestLoanInterestTierBand loanProviderInterestRate(String loanProviderInterestRate) {
    this.loanProviderInterestRate = loanProviderInterestRate;
    return this;
  }

 /**
   * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
   * @return loanProviderInterestRateType
  **/
  @JsonProperty("LoanProviderInterestRateType")
  public String getLoanProviderInterestRateType() {
    if (loanProviderInterestRateType == null) {
      return null;
    }
    return loanProviderInterestRateType.value();
  }

  public void setLoanProviderInterestRateType(LoanProviderInterestRateTypeEnum loanProviderInterestRateType) {
    this.loanProviderInterestRateType = loanProviderInterestRateType;
  }

  public LoanInterestLoanInterestTierBand loanProviderInterestRateType(LoanProviderInterestRateTypeEnum loanProviderInterestRateType) {
    this.loanProviderInterestRateType = loanProviderInterestRateType;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the Maximum Term
   * @return maxTermPeriod
  **/
  @JsonProperty("MaxTermPeriod")
  public String getMaxTermPeriod() {
    if (maxTermPeriod == null) {
      return null;
    }
    return maxTermPeriod.value();
  }

  public void setMaxTermPeriod(MaxTermPeriodEnum maxTermPeriod) {
    this.maxTermPeriod = maxTermPeriod;
  }

  public LoanInterestLoanInterestTierBand maxTermPeriod(MaxTermPeriodEnum maxTermPeriod) {
    this.maxTermPeriod = maxTermPeriod;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the Minimum Term
   * @return minTermPeriod
  **/
  @JsonProperty("MinTermPeriod")
  public String getMinTermPeriod() {
    if (minTermPeriod == null) {
      return null;
    }
    return minTermPeriod.value();
  }

  public void setMinTermPeriod(MinTermPeriodEnum minTermPeriod) {
    this.minTermPeriod = minTermPeriod;
  }

  public LoanInterestLoanInterestTierBand minTermPeriod(MinTermPeriodEnum minTermPeriod) {
    this.minTermPeriod = minTermPeriod;
    return this;
  }

 /**
   * Optional additional notes to supplement the Tier Band details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public LoanInterestLoanInterestTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterestLoanInterestTierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherLoanProviderInterestRateType
   * @return otherLoanProviderInterestRateType
  **/
  @JsonProperty("OtherLoanProviderInterestRateType")
  public OtherLoanProviderInterestRateType getOtherLoanProviderInterestRateType() {
    return otherLoanProviderInterestRateType;
  }

  public void setOtherLoanProviderInterestRateType(OtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
    this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
  }

  public LoanInterestLoanInterestTierBand otherLoanProviderInterestRateType(OtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
    this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
    return this;
  }

 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   For SME Loan, this APR is the representative APR which includes any account fees.
   * @return repAPR
  **/
  @JsonProperty("RepAPR")
  public String getRepAPR() {
    return repAPR;
  }

  public void setRepAPR(String repAPR) {
    this.repAPR = repAPR;
  }

  public LoanInterestLoanInterestTierBand repAPR(String repAPR) {
    this.repAPR = repAPR;
    return this;
  }

 /**
   * Maximum loan term for which the loan interest tier applies.
   * @return tierValueMaxTerm
  **/
  @JsonProperty("TierValueMaxTerm")
  public Float getTierValueMaxTerm() {
    return tierValueMaxTerm;
  }

  public void setTierValueMaxTerm(Float tierValueMaxTerm) {
    this.tierValueMaxTerm = tierValueMaxTerm;
  }

  public LoanInterestLoanInterestTierBand tierValueMaxTerm(Float tierValueMaxTerm) {
    this.tierValueMaxTerm = tierValueMaxTerm;
    return this;
  }

 /**
   * Maximum loan value for which the loan interest tier applies.
   * @return tierValueMaximum
  **/
  @JsonProperty("TierValueMaximum")
  public String getTierValueMaximum() {
    return tierValueMaximum;
  }

  public void setTierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
  }

  public LoanInterestLoanInterestTierBand tierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

 /**
   * Minimum loan term for which the loan interest tier applies.
   * @return tierValueMinTerm
  **/
  @JsonProperty("TierValueMinTerm")
  public Float getTierValueMinTerm() {
    return tierValueMinTerm;
  }

  public void setTierValueMinTerm(Float tierValueMinTerm) {
    this.tierValueMinTerm = tierValueMinTerm;
  }

  public LoanInterestLoanInterestTierBand tierValueMinTerm(Float tierValueMinTerm) {
    this.tierValueMinTerm = tierValueMinTerm;
    return this;
  }

 /**
   * Minimum loan value for which the loan interest tier applies.
   * @return tierValueMinimum
  **/
  @JsonProperty("TierValueMinimum")
  public String getTierValueMinimum() {
    return tierValueMinimum;
  }

  public void setTierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
  }

  public LoanInterestLoanInterestTierBand tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterestLoanInterestTierBand {\n");
    
    sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
    sb.append("    loanProviderInterestRate: ").append(toIndentedString(loanProviderInterestRate)).append("\n");
    sb.append("    loanProviderInterestRateType: ").append(toIndentedString(loanProviderInterestRateType)).append("\n");
    sb.append("    maxTermPeriod: ").append(toIndentedString(maxTermPeriod)).append("\n");
    sb.append("    minTermPeriod: ").append(toIndentedString(minTermPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherLoanProviderInterestRateType: ").append(toIndentedString(otherLoanProviderInterestRateType)).append("\n");
    sb.append("    repAPR: ").append(toIndentedString(repAPR)).append("\n");
    sb.append("    tierValueMaxTerm: ").append(toIndentedString(tierValueMaxTerm)).append("\n");
    sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
    sb.append("    tierValueMinTerm: ").append(toIndentedString(tierValueMinTerm)).append("\n");
    sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
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

