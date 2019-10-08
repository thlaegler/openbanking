package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherApplicationFrequency1;
import com.laegler.openbanking.model.OtherBankInterestType;
import com.laegler.openbanking.model.OtherCalculationFrequency1;
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
public class CreditInterest1TierBand  {
  
  @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
  **/
  private String AER = null;


@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("PerStatementDate") PERSTATEMENTDATE(String.valueOf("PerStatementDate")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    ApplicationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationFrequencyEnum fromValue(String v) {
        for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.")
 /**
   * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.
  **/
  private ApplicationFrequencyEnum applicationFrequency = null;

  @ApiModelProperty(value = "Bank Interest for the BCA product")
 /**
   * Bank Interest for the BCA product
  **/
  private String bankInterestRate = null;


@XmlType(name="BankInterestRateTypeEnum")
@XmlEnum(String.class)
public enum BankInterestRateTypeEnum {

@XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    BankInterestRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BankInterestRateTypeEnum fromValue(String v) {
        for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.")
 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
  **/
  private BankInterestRateTypeEnum bankInterestRateType = null;


@XmlType(name="CalculationFrequencyEnum")
@XmlEnum(String.class)
public enum CalculationFrequencyEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("PerStatementDate") PERSTATEMENTDATE(String.valueOf("PerStatementDate")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    CalculationFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CalculationFrequencyEnum fromValue(String v) {
        for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "How often is credit interest calculated for the account.")
 /**
   * How often is credit interest calculated for the account.
  **/
  private CalculationFrequencyEnum calculationFrequency = null;


@XmlType(name="DepositInterestAppliedCoverageEnum")
@XmlEnum(String.class)
public enum DepositInterestAppliedCoverageEnum {

@XmlEnumValue("Banded") BANDED(String.valueOf("Banded")), @XmlEnumValue("Tiered") TIERED(String.valueOf("Tiered")), @XmlEnumValue("Whole") WHOLE(String.valueOf("Whole"));


    private String value;

    DepositInterestAppliedCoverageEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DepositInterestAppliedCoverageEnum fromValue(String v) {
        for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Amount on which Interest applied.")
 /**
   * Amount on which Interest applied.
  **/
  private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage = null;


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

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a BCA.")
 /**
   * Unique and unambiguous identification of a  Tier Band for a BCA.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")
 /**
   * Optional additional notes to supplement the Tier Band details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency1 otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherBankInterestType otherBankInterestType = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency1 otherCalculationFrequency = null;

  @ApiModelProperty(value = "Maximum deposit value for which the credit interest tier applies.")
 /**
   * Maximum deposit value for which the credit interest tier applies.
  **/
  private String tierValueMaximum = null;

  @ApiModelProperty(required = true, value = "Minimum deposit value for which the credit interest tier applies.")
 /**
   * Minimum deposit value for which the credit interest tier applies.
  **/
  private String tierValueMinimum = null;
 /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
   * @return AER
  **/
  @JsonProperty("AER")
  public String getAER() {
    return AER;
  }

  public void setAER(String AER) {
    this.AER = AER;
  }

  public CreditInterest1TierBand AER(String AER) {
    this.AER = AER;
    return this;
  }

 /**
   * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s BCA.
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  public String getApplicationFrequency() {
    if (applicationFrequency == null) {
      return null;
    }
    return applicationFrequency.value();
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public CreditInterest1TierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * Bank Interest for the BCA product
   * @return bankInterestRate
  **/
  @JsonProperty("BankInterestRate")
  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public CreditInterest1TierBand bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

 /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   * @return bankInterestRateType
  **/
  @JsonProperty("BankInterestRateType")
  public String getBankInterestRateType() {
    if (bankInterestRateType == null) {
      return null;
    }
    return bankInterestRateType.value();
  }

  public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public CreditInterest1TierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

 /**
   * How often is credit interest calculated for the account.
   * @return calculationFrequency
  **/
  @JsonProperty("CalculationFrequency")
  public String getCalculationFrequency() {
    if (calculationFrequency == null) {
      return null;
    }
    return calculationFrequency.value();
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public CreditInterest1TierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Amount on which Interest applied.
   * @return depositInterestAppliedCoverage
  **/
  @JsonProperty("DepositInterestAppliedCoverage")
  public String getDepositInterestAppliedCoverage() {
    if (depositInterestAppliedCoverage == null) {
      return null;
    }
    return depositInterestAppliedCoverage.value();
  }

  public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
  }

  public CreditInterest1TierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    return this;
  }

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

  public CreditInterest1TierBand fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Tier Band for a BCA.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CreditInterest1TierBand identification(String identification) {
    this.identification = identification;
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

  public CreditInterest1TierBand notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterest1TierBand addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency1 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public CreditInterest1TierBand otherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherBankInterestType
   * @return otherBankInterestType
  **/
  @JsonProperty("OtherBankInterestType")
  public OtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public CreditInterest1TierBand otherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency1 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public CreditInterest1TierBand otherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Maximum deposit value for which the credit interest tier applies.
   * @return tierValueMaximum
  **/
  @JsonProperty("TierValueMaximum")
  public String getTierValueMaximum() {
    return tierValueMaximum;
  }

  public void setTierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
  }

  public CreditInterest1TierBand tierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

 /**
   * Minimum deposit value for which the credit interest tier applies.
   * @return tierValueMinimum
  **/
  @JsonProperty("TierValueMinimum")
  public String getTierValueMinimum() {
    return tierValueMinimum;
  }

  public void setTierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
  }

  public CreditInterest1TierBand tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1TierBand {\n");
    
    sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
    sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
    sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
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

