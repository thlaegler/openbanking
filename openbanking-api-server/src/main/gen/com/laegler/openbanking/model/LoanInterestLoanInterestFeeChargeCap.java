package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeeType;
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
  * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
 **/
@ApiModel(description="Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")
public class LoanInterestLoanInterestFeeChargeCap  {
  

@XmlType(name="CappingPeriodEnum")
@XmlEnum(String.class)
public enum CappingPeriodEnum {

@XmlEnumValue("OnClosing") ONCLOSING(String.valueOf("OnClosing")), @XmlEnumValue("OnOpening") ONOPENING(String.valueOf("OnOpening")), @XmlEnumValue("ChargingPeriod") CHARGINGPERIOD(String.valueOf("ChargingPeriod")), @XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("Holiday") HOLIDAY(String.valueOf("Holiday")), @XmlEnumValue("PerItem") PERITEM(String.valueOf("PerItem")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("OnAnniversary") ONANNIVERSARY(String.valueOf("OnAnniversary")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PerHundredPounds") PERHUNDREDPOUNDS(String.valueOf("PerHundredPounds")), @XmlEnumValue("PerHour") PERHOUR(String.valueOf("PerHour")), @XmlEnumValue("PerOccurrence") PEROCCURRENCE(String.valueOf("PerOccurrence")), @XmlEnumValue("PerSheet") PERSHEET(String.valueOf("PerSheet")), @XmlEnumValue("PerTransaction") PERTRANSACTION(String.valueOf("PerTransaction")), @XmlEnumValue("PerTransactionAmount") PERTRANSACTIONAMOUNT(String.valueOf("PerTransactionAmount")), @XmlEnumValue("PerTransactionPercentage") PERTRANSACTIONPERCENTAGE(String.valueOf("PerTransactionPercentage")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("SixMonthly") SIXMONTHLY(String.valueOf("SixMonthly")), @XmlEnumValue("StatementMonthly") STATEMENTMONTHLY(String.valueOf("StatementMonthly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    CappingPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CappingPeriodEnum fromValue(String v) {
        for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
  **/
  private CappingPeriodEnum cappingPeriod = null;

  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeCapAmount = null;

  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
  **/
  private Float feeCapOccurrence = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("Application") APPLICATION(String.valueOf("Application")), @XmlEnumValue("Arrangement") ARRANGEMENT(String.valueOf("Arrangement")), @XmlEnumValue("FeeChargeCap") FEECHARGECAP(String.valueOf("FeeChargeCap")), @XmlEnumValue("CreditReference") CREDITREFERENCE(String.valueOf("CreditReference")), @XmlEnumValue("EarlyRepayment") EARLYREPAYMENT(String.valueOf("EarlyRepayment")), @XmlEnumValue("LatePayment") LATEPAYMENT(String.valueOf("LatePayment")), @XmlEnumValue("MissedPaymentFee") MISSEDPAYMENTFEE(String.valueOf("MissedPaymentFee")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("MissedPaymentRate") MISSEDPAYMENTRATE(String.valueOf("MissedPaymentRate")), @XmlEnumValue("OtherPaymentFee") OTHERPAYMENTFEE(String.valueOf("OtherPaymentFee")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PrepaymentFee") PREPAYMENTFEE(String.valueOf("PrepaymentFee")), @XmlEnumValue("OtherPaymentRate") OTHERPAYMENTRATE(String.valueOf("OtherPaymentRate")), @XmlEnumValue("ReStatement") RESTATEMENT(String.valueOf("ReStatement")), @XmlEnumValue("Statement") STATEMENT(String.valueOf("Statement")), @XmlEnumValue("SetUp") SETUP(String.valueOf("SetUp"));


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

  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
 /**
   * Fee/charge type which is being capped
  **/
  private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();


@XmlType(name="MinMaxTypeEnum")
@XmlEnum(String.class)
public enum MinMaxTypeEnum {

@XmlEnumValue("Minimum") MINIMUM(String.valueOf("Minimum")), @XmlEnumValue("Maximum") MAXIMUM(String.valueOf("Maximum"));


    private String value;

    MinMaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MinMaxTypeEnum fromValue(String v) {
        for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Min Max type")
 /**
   * Min Max type
  **/
  private MinMaxTypeEnum minMaxType = null;

  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")
 /**
   * Free text for adding  extra details for fee charge cap
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")
  @Valid
 /**
   * Other fee type code which is not available in the standard code set
  **/
  private List<BranchCurrentAccountResponseOtherFeeType> otherFeeType = null;
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @JsonProperty("CappingPeriod")
  public String getCappingPeriod() {
    if (cappingPeriod == null) {
      return null;
    }
    return cappingPeriod.value();
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public LoanInterestLoanInterestFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @JsonProperty("FeeCapAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public LoanInterestLoanInterestFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @JsonProperty("FeeCapOccurrence")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public LoanInterestLoanInterestFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

 /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @JsonProperty("FeeType")
  @NotNull
 @Size(min=1)  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public LoanInterestLoanInterestFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public LoanInterestLoanInterestFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

 /**
   * Min Max type
   * @return minMaxType
  **/
  @JsonProperty("MinMaxType")
  @NotNull
  public String getMinMaxType() {
    if (minMaxType == null) {
      return null;
    }
    return minMaxType.value();
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public LoanInterestLoanInterestFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public LoanInterestLoanInterestFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public LoanInterestLoanInterestFeeChargeCap addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public List<BranchCurrentAccountResponseOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public LoanInterestLoanInterestFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public LoanInterestLoanInterestFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInterestLoanInterestFeeChargeCap {\n");
    
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

