package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherApplicationFrequency1;
import com.laegler.openbanking.model.OtherCalculationFrequency1;
import com.laegler.openbanking.model.OtherFeeRateType1;
import com.laegler.openbanking.model.OtherFeeType1;
import com.laegler.openbanking.model.Overdraft1OverdraftFeeChargeCap;
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
  * Details about the fees/charges
 **/
@ApiModel(description="Details about the fees/charges")
public class Overdraft1OverdraftFeeChargeDetail  {
  

@XmlType(name="ApplicationFrequencyEnum")
@XmlEnum(String.class)
public enum ApplicationFrequencyEnum {

@XmlEnumValue("OnClosing") ONCLOSING(String.valueOf("OnClosing")), @XmlEnumValue("OnOpening") ONOPENING(String.valueOf("OnOpening")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAnniversary") ONANNIVERSARY(String.valueOf("OnAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHundredPounds") PERHUNDREDPOUNDS(String.valueOf("PerHundredPounds")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

@XmlEnumValue("OnClosing") ONCLOSING(String.valueOf("OnClosing")), @XmlEnumValue("OnOpening") ONOPENING(String.valueOf("OnOpening")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAnniversary") ONANNIVERSARY(String.valueOf("OnAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHundredPounds") PERHUNDREDPOUNDS(String.valueOf("PerHundredPounds")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


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

  @ApiModelProperty(value = "How often is the overdraft fee/charge calculated for the account.")
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

@XmlEnumValue("Gross") GROSS(String.valueOf("Gross")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


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

@XmlEnumValue("ArrangedOverdraft") ARRANGEDOVERDRAFT(String.valueOf("ArrangedOverdraft")), @XmlEnumValue("AnnualReview") ANNUALREVIEW(String.valueOf("AnnualReview")), @XmlEnumValue("EmergencyBorrowing") EMERGENCYBORROWING(String.valueOf("EmergencyBorrowing")), @XmlEnumValue("BorrowingItem") BORROWINGITEM(String.valueOf("BorrowingItem")), @XmlEnumValue("OverdraftRenewal") OVERDRAFTRENEWAL(String.valueOf("OverdraftRenewal")), @XmlEnumValue("OverdraftSetup") OVERDRAFTSETUP(String.valueOf("OverdraftSetup")), @XmlEnumValue("Surcharge") SURCHARGE(String.valueOf("Surcharge")), @XmlEnumValue("TempOverdraft") TEMPOVERDRAFT(String.valueOf("TempOverdraft")), @XmlEnumValue("UnauthorisedBorrowing") UNAUTHORISEDBORROWING(String.valueOf("UnauthorisedBorrowing")), @XmlEnumValue("UnauthorisedPaidTrans") UNAUTHORISEDPAIDTRANS(String.valueOf("UnauthorisedPaidTrans")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("UnauthorisedUnpaidTrans") UNAUTHORISEDUNPAIDTRANS(String.valueOf("UnauthorisedUnpaidTrans"));


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

  @ApiModelProperty(value = "Indicates whether fee and charges are negotiable")
 /**
   * Indicates whether fee and charges are negotiable
  **/
  private Boolean negotiableIndicator = null;

  @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")
 /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherApplicationFrequency1 otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherCalculationFrequency1 otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeeRateType1 otherFeeRateType = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherFeeType1 otherFeeType = null;

  @ApiModelProperty(value = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
 /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
  **/
  private Boolean overdraftControlIndicator = null;

  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
  @Valid
 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
  **/
  private List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap = null;
 /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
  **/
  @JsonProperty("ApplicationFrequency")
  @NotNull
  public String getApplicationFrequency() {
    if (applicationFrequency == null) {
      return null;
    }
    return applicationFrequency.value();
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public Overdraft1OverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
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

  public Overdraft1OverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public Overdraft1OverdraftFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

 /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
 @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public Overdraft1OverdraftFeeChargeDetail feeRate(String feeRate) {
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

  public Overdraft1OverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Overdraft fee type
   * @return feeType
  **/
  @JsonProperty("FeeType")
  @NotNull
  public String getFeeType() {
    if (feeType == null) {
      return null;
    }
    return feeType.value();
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public Overdraft1OverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
  **/
  @JsonProperty("IncrementalBorrowingAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public Overdraft1OverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

 /**
   * Indicates whether fee and charges are negotiable
   * @return negotiableIndicator
  **/
  @JsonProperty("NegotiableIndicator")
  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public Overdraft1OverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
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

  public Overdraft1OverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft1OverdraftFeeChargeDetail addNotesItem(String notesItem) {
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

  public Overdraft1OverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
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

  public Overdraft1OverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
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

  public Overdraft1OverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
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

  public Overdraft1OverdraftFeeChargeDetail otherFeeType(OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

 /**
   * Indicates if the fee/charge is already covered by an &#39;Overdraft Control&#39; fee or not.
   * @return overdraftControlIndicator
  **/
  @JsonProperty("OverdraftControlIndicator")
  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public Overdraft1OverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

 /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
   * @return overdraftFeeChargeCap
  **/
  @JsonProperty("OverdraftFeeChargeCap")
  public List<Overdraft1OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft1OverdraftFeeChargeDetail overdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft1OverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1OverdraftFeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
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

