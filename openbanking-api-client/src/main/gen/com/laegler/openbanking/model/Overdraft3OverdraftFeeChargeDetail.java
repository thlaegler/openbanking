package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherApplicationFrequency;
import com.laegler.openbanking.model.OtherCalculationFrequency;
import com.laegler.openbanking.model.OtherFeeRateType1;
import com.laegler.openbanking.model.OtherFeeType1;
import com.laegler.openbanking.model.Overdraft3OverdraftFeeChargeCap;
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
  * Details about the fees/charges
 **/
@ApiModel(description="Details about the fees/charges")
public class Overdraft3OverdraftFeeChargeDetail  {
  

@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("AccountClosing") ACCOUNTCLOSING(String.valueOf("AccountClosing")), @XmlEnumValue("AccountOpening") ACCOUNTOPENING(String.valueOf("AccountOpening")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAccountAnniversary") ONACCOUNTANNIVERSARY(String.valueOf("OnAccountAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

  @ApiModelProperty(required = true, value = "Frequency at which the overdraft charge is applied to the account")
 /**
   * Frequency at which the overdraft charge is applied to the account
  **/
  private ApplicationFrequencyEnum applicationFrequency = null;


@XmlType(name="CalculationFrequencyEnum")
@XmlEnum(String.class)
public enum CalculationFrequencyEnum {

@XmlEnumValue("AccountClosing") ACCOUNTCLOSING(String.valueOf("AccountClosing")), @XmlEnumValue("AccountOpening") ACCOUNTOPENING(String.valueOf("AccountOpening")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAccountAnniversary") ONACCOUNTANNIVERSARY(String.valueOf("OnAccountAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

  @ApiModelProperty(required = true, value = "How often is the overdraft fee/charge calculated for the account.")
 /**
   * How often is the overdraft fee/charge calculated for the account.
  **/
  private CalculationFrequencyEnum calculationFrequency = null;

  @ApiModelProperty(value = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeAmount = null;

  @ApiModelProperty(value = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
  **/
  private String feeRate = null;


@XmlType(name="FeeRateTypeEnum")
@XmlEnum(String.class)
public enum FeeRateTypeEnum {

@XmlEnumValue("LinkedBaseRate") LINKEDBASERATE(String.valueOf("LinkedBaseRate")), @XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Net") NET(String.valueOf("Net")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    FeeRateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeRateTypeEnum fromValue(String v) {
        for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
  **/
  private FeeRateTypeEnum feeRateType = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("ArrangedOverdraft") ARRANGEDOVERDRAFT(String.valueOf("ArrangedOverdraft")), @XmlEnumValue("EmergencyBorrowing") EMERGENCYBORROWING(String.valueOf("EmergencyBorrowing")), @XmlEnumValue("BorrowingItem") BORROWINGITEM(String.valueOf("BorrowingItem")), @XmlEnumValue("OverdraftRenewal") OVERDRAFTRENEWAL(String.valueOf("OverdraftRenewal")), @XmlEnumValue("AnnualReview") ANNUALREVIEW(String.valueOf("AnnualReview")), @XmlEnumValue("OverdraftSetup") OVERDRAFTSETUP(String.valueOf("OverdraftSetup")), @XmlEnumValue("Surcharge") SURCHARGE(String.valueOf("Surcharge")), @XmlEnumValue("TempOverdraft") TEMPOVERDRAFT(String.valueOf("TempOverdraft")), @XmlEnumValue("UnauthorisedBorrowing") UNAUTHORISEDBORROWING(String.valueOf("UnauthorisedBorrowing")), @XmlEnumValue("UnauthorisedPaidTrans") UNAUTHORISEDPAIDTRANS(String.valueOf("UnauthorisedPaidTrans")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("UnauthorisedUnpaidTrans") UNAUTHORISEDUNPAIDTRANS(String.valueOf("UnauthorisedUnpaidTrans"));


    private String value;

    FeeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String v) {
        for (FeeTypeEnum b : FeeTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Overdraft fee type")
 /**
   * Overdraft fee type
  **/
  private FeeTypeEnum feeType = null;

  @ApiModelProperty(value = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
 /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
  **/
  private String incrementalBorrowingAmount = null;

  @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")
 /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherFeeRateType1 otherFeeRateType = null;

  @ApiModelProperty(value = "")
  private OtherFeeType1 otherFeeType = null;

  @ApiModelProperty(value = "Specifies for the overdraft control feature/benefit")
 /**
   * Specifies for the overdraft control feature/benefit
  **/
  private Boolean overdraftControlIndicator = null;

  @ApiModelProperty(value = "")
  private Overdraft3OverdraftFeeChargeCap overdraftFeeChargeCap = null;
 /**
   * Frequency at which the overdraft charge is applied to the account
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

  public Overdraft3OverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * How often is the overdraft fee/charge calculated for the account.
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

  public Overdraft3OverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public Overdraft3OverdraftFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

 /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public Overdraft3OverdraftFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

 /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @JsonProperty("FeeRateType")
  public String getFeeRateType() {
    if (feeRateType == null) {
      return null;
    }
    return feeRateType.value();
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public Overdraft3OverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Overdraft fee type
   * @return feeType
  **/
  @JsonProperty("FeeType")
  public String getFeeType() {
    if (feeType == null) {
      return null;
    }
    return feeType.value();
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public Overdraft3OverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
  **/
  @JsonProperty("IncrementalBorrowingAmount")
  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public Overdraft3OverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

 /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3OverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3OverdraftFeeChargeDetail addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public Overdraft3OverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public Overdraft3OverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @JsonProperty("OtherFeeRateType")
  public OtherFeeRateType1 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public Overdraft3OverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public OtherFeeType1 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public Overdraft3OverdraftFeeChargeDetail otherFeeType(OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

 /**
   * Specifies for the overdraft control feature/benefit
   * @return overdraftControlIndicator
  **/
  @JsonProperty("OverdraftControlIndicator")
  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public Overdraft3OverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

 /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
  **/
  @JsonProperty("OverdraftFeeChargeCap")
  public Overdraft3OverdraftFeeChargeCap getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(Overdraft3OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft3OverdraftFeeChargeDetail overdraftFeeChargeCap(Overdraft3OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3OverdraftFeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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

