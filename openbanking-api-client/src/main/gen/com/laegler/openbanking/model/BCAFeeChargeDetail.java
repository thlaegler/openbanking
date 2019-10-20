package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BCAFeeChargeCap;
import com.laegler.openbanking.model.FeeApplicableRange;
import com.laegler.openbanking.model.OtherApplicationFrequency2;
import com.laegler.openbanking.model.OtherCalculationFrequency2;
import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.OtherFeeRateType;
import com.laegler.openbanking.model.OtherFeeType4;
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
  * Other fees/charges details
 **/
@ApiModel(description="Other fees/charges details")
public class BCAFeeChargeDetail  {
  

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

  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
 /**
   * How frequently the fee/charge is applied to the account
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

  @ApiModelProperty(value = "How frequently the fee/charge is calculated")
 /**
   * How frequently the fee/charge is calculated
  **/
  private CalculationFrequencyEnum calculationFrequency = null;

  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeAmount = null;

  @ApiModelProperty(value = "")
  private FeeApplicableRange feeApplicableRange = null;


@XmlType(name="FeeCategoryEnum")
@XmlEnum(String.class)
public enum FeeCategoryEnum {

@XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Servicing") SERVICING(String.valueOf("Servicing"));


    private String value;

    FeeCategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeCategoryEnum fromValue(String v) {
        for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
 /**
   * Categorisation of fees and charges into standard categories.
  **/
  private FeeCategoryEnum feeCategory = null;

  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
 /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
  **/
  private List<BCAFeeChargeCap> feeChargeCap = null;

  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
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

  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
 /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
  **/
  private FeeRateTypeEnum feeRateType = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("ServiceCAccountFee") SERVICECACCOUNTFEE(String.valueOf("ServiceCAccountFee")), @XmlEnumValue("ServiceCAccountFeeMonthly") SERVICECACCOUNTFEEMONTHLY(String.valueOf("ServiceCAccountFeeMonthly")), @XmlEnumValue("ServiceCAccountFeeQuarterly") SERVICECACCOUNTFEEQUARTERLY(String.valueOf("ServiceCAccountFeeQuarterly")), @XmlEnumValue("ServiceCFixedTariff") SERVICECFIXEDTARIFF(String.valueOf("ServiceCFixedTariff")), @XmlEnumValue("ServiceCBusiDepAccBreakage") SERVICECBUSIDEPACCBREAKAGE(String.valueOf("ServiceCBusiDepAccBreakage")), @XmlEnumValue("ServiceCMinimumMonthlyFee") SERVICECMINIMUMMONTHLYFEE(String.valueOf("ServiceCMinimumMonthlyFee")), @XmlEnumValue("ServiceCOther") SERVICECOTHER(String.valueOf("ServiceCOther"));


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

  @ApiModelProperty(required = true, value = "Fee/Charge Type")
 /**
   * Fee/Charge Type
  **/
  private FeeTypeEnum feeType = null;

  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
 /**
   * Fee/charge which is usually negotiable rather than a fixed amount
  **/
  private Boolean negotiableIndicator = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")
 /**
   * Optional additional notes to supplement the fee/charge details.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherApplicationFrequency2 otherApplicationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherCalculationFrequency2 otherCalculationFrequency = null;

  @ApiModelProperty(value = "")
  private OtherFeeCategory otherFeeCategoryType = null;

  @ApiModelProperty(value = "")
  private OtherFeeRateType otherFeeRateType = null;

  @ApiModelProperty(value = "")
  private OtherFeeType4 otherFeeType = null;
 /**
   * How frequently the fee/charge is applied to the account
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

  public BCAFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

 /**
   * How frequently the fee/charge is calculated
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

  public BCAFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

 /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public BCAFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

 /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @JsonProperty("FeeApplicableRange")
  public FeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }

  public BCAFeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

 /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @JsonProperty("FeeCategory")
  public String getFeeCategory() {
    if (feeCategory == null) {
      return null;
    }
    return feeCategory.value();
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public BCAFeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

 /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
  **/
  @JsonProperty("FeeChargeCap")
  public List<BCAFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public BCAFeeChargeDetail feeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public BCAFeeChargeDetail addFeeChargeCapItem(BCAFeeChargeCap feeChargeCapItem) {
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

 /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public BCAFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

 /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
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

  public BCAFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

 /**
   * Fee/Charge Type
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

  public BCAFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

 /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @JsonProperty("NegotiableIndicator")
  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public BCAFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

 /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public BCAFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BCAFeeChargeDetail addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency2 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency2 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public BCAFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency2 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

 /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency2 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency2 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public BCAFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency2 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

 /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
  **/
  @JsonProperty("OtherFeeCategoryType")
  public OtherFeeCategory getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OtherFeeCategory otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public BCAFeeChargeDetail otherFeeCategoryType(OtherFeeCategory otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

 /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @JsonProperty("OtherFeeRateType")
  public OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public BCAFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public OtherFeeType4 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType4 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public BCAFeeChargeDetail otherFeeType(OtherFeeType4 otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BCAFeeChargeDetail {\n");
    
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
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

