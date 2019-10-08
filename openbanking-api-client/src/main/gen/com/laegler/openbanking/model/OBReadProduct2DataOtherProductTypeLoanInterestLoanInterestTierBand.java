package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBInterestFixedVariableType1Code;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType;
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
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand  {
  
  @ApiModelProperty(required = true, value = "")
  private OBInterestFixedVariableType1Code fixedVariableInterestRateType = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a SME Loan.")
 /**
   * Unique and unambiguous identification of a  Tier Band for a SME Loan.
  **/
  private String identification = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  @ApiModelProperty(value = "Loan provider Interest for the SME Loan product")
 /**
   * Loan provider Interest for the SME Loan product
  **/
  private String loanProviderInterestRate = null;


@XmlType(name="LoanProviderInterestRateTypeEnum")
@XmlEnum(String.class)
public enum LoanProviderInterestRateTypeEnum {

@XmlEnumValue("INBB") INBB(String.valueOf("INBB")), @XmlEnumValue("INFR") INFR(String.valueOf("INFR")), @XmlEnumValue("INGR") INGR(String.valueOf("INGR")), @XmlEnumValue("INLR") INLR(String.valueOf("INLR")), @XmlEnumValue("INNE") INNE(String.valueOf("INNE")), @XmlEnumValue("INOT") INOT(String.valueOf("INOT"));


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

@XmlEnumValue("PACT") PACT(String.valueOf("PACT")), @XmlEnumValue("PDAY") PDAY(String.valueOf("PDAY")), @XmlEnumValue("PHYR") PHYR(String.valueOf("PHYR")), @XmlEnumValue("PMTH") PMTH(String.valueOf("PMTH")), @XmlEnumValue("PQTR") PQTR(String.valueOf("PQTR")), @XmlEnumValue("PWEK") PWEK(String.valueOf("PWEK")), @XmlEnumValue("PYER") PYER(String.valueOf("PYER"));


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

@XmlEnumValue("PACT") PACT(String.valueOf("PACT")), @XmlEnumValue("PDAY") PDAY(String.valueOf("PDAY")), @XmlEnumValue("PHYR") PHYR(String.valueOf("PHYR")), @XmlEnumValue("PMTH") PMTH(String.valueOf("PMTH")), @XmlEnumValue("PQTR") PQTR(String.valueOf("PQTR")), @XmlEnumValue("PWEK") PWEK(String.valueOf("PWEK")), @XmlEnumValue("PYER") PYER(String.valueOf("PYER"));


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

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType = null;

  @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.")
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.
  **/
  private String repAPR = null;

  @ApiModelProperty(value = "Maximum loan term for which the loan interest tier applies.")
 /**
   * Maximum loan term for which the loan interest tier applies.
  **/
  private Integer tierValueMaxTerm = null;

  @ApiModelProperty(value = "Maximum loan value for which the loan interest tier applies.")
 /**
   * Maximum loan value for which the loan interest tier applies.
  **/
  private String tierValueMaximum = null;

  @ApiModelProperty(required = true, value = "Minimum loan term for which the loan interest tier applies.")
 /**
   * Minimum loan term for which the loan interest tier applies.
  **/
  private Integer tierValueMinTerm = null;

  @ApiModelProperty(required = true, value = "Minimum loan value for which the loan interest tier applies.")
 /**
   * Minimum loan value for which the loan interest tier applies.
  **/
  private String tierValueMinimum = null;
 /**
   * Get fixedVariableInterestRateType
   * @return fixedVariableInterestRateType
  **/
  @JsonProperty("FixedVariableInterestRateType")
  public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
    return fixedVariableInterestRateType;
  }

  public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand identification(String identification) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand addLoanInterestFeesChargesItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanProviderInterestRate(String loanProviderInterestRate) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanProviderInterestRateType(LoanProviderInterestRateTypeEnum loanProviderInterestRateType) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand maxTermPeriod(MaxTermPeriodEnum maxTermPeriod) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand minTermPeriod(MinTermPeriodEnum minTermPeriod) {
    this.minTermPeriod = minTermPeriod;
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherLoanProviderInterestRateType
   * @return otherLoanProviderInterestRateType
  **/
  @JsonProperty("OtherLoanProviderInterestRateType")
  public OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType getOtherLoanProviderInterestRateType() {
    return otherLoanProviderInterestRateType;
  }

  public void setOtherLoanProviderInterestRateType(OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
    this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand otherLoanProviderInterestRateType(OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
    this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
    return this;
  }

 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.
   * @return repAPR
  **/
  @JsonProperty("RepAPR")
  public String getRepAPR() {
    return repAPR;
  }

  public void setRepAPR(String repAPR) {
    this.repAPR = repAPR;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand repAPR(String repAPR) {
    this.repAPR = repAPR;
    return this;
  }

 /**
   * Maximum loan term for which the loan interest tier applies.
   * @return tierValueMaxTerm
  **/
  @JsonProperty("TierValueMaxTerm")
  public Integer getTierValueMaxTerm() {
    return tierValueMaxTerm;
  }

  public void setTierValueMaxTerm(Integer tierValueMaxTerm) {
    this.tierValueMaxTerm = tierValueMaxTerm;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMaxTerm(Integer tierValueMaxTerm) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

 /**
   * Minimum loan term for which the loan interest tier applies.
   * @return tierValueMinTerm
  **/
  @JsonProperty("TierValueMinTerm")
  public Integer getTierValueMinTerm() {
    return tierValueMinTerm;
  }

  public void setTierValueMinTerm(Integer tierValueMinTerm) {
    this.tierValueMinTerm = tierValueMinTerm;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMinTerm(Integer tierValueMinTerm) {
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

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand {\n");
    
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

