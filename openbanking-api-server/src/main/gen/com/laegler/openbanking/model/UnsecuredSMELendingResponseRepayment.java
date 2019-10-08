package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherAmountType;
import com.laegler.openbanking.model.OtherRepaymentFrequency;
import com.laegler.openbanking.model.OtherRepaymentType;
import com.laegler.openbanking.model.RepaymentFeeCharges;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseRepaymentHoliday;
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
  * Repayment details of the Loan product
 **/
@ApiModel(description="Repayment details of the Loan product")
public class UnsecuredSMELendingResponseRepayment  {
  

@XmlType(name="AmountTypeEnum")
@XmlEnum(String.class)
public enum AmountTypeEnum {

@XmlEnumValue("BalanceToDate") BALANCETODATE(String.valueOf("BalanceToDate")), @XmlEnumValue("Balloon") BALLOON(String.valueOf("Balloon")), @XmlEnumValue("CapitalAndInterest") CAPITALANDINTEREST(String.valueOf("CapitalAndInterest")), @XmlEnumValue("FeeChargeCap") FEECHARGECAP(String.valueOf("FeeChargeCap")), @XmlEnumValue("InterestOnly") INTERESTONLY(String.valueOf("InterestOnly")), @XmlEnumValue("Bullet") BULLET(String.valueOf("Bullet")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    AmountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AmountTypeEnum fromValue(String v) {
        for (AmountTypeEnum b : AmountTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc")
 /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
  **/
  private AmountTypeEnum amountType = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Repayment")
 /**
   * Optional additional notes to supplement the Repayment
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherAmountType otherAmountType = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherRepaymentFrequency otherRepaymentFrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherRepaymentType otherRepaymentType = null;

  @ApiModelProperty(value = "")
  @Valid
  private RepaymentFeeCharges repaymentFeeCharges = null;


@XmlType(name="RepaymentFrequencyEnum")
@XmlEnum(String.class)
public enum RepaymentFrequencyEnum {

@XmlEnumValue("Daily") DAILY(String.valueOf("Daily")), @XmlEnumValue("Flexible") FLEXIBLE(String.valueOf("Flexible")), @XmlEnumValue("Fortnightly") FORTNIGHTLY(String.valueOf("Fortnightly")), @XmlEnumValue("HalfYearly") HALFYEARLY(String.valueOf("HalfYearly")), @XmlEnumValue("Monthly") MONTHLY(String.valueOf("Monthly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Quarterly") QUARTERLY(String.valueOf("Quarterly")), @XmlEnumValue("Weekly") WEEKLY(String.valueOf("Weekly")), @XmlEnumValue("Yearly") YEARLY(String.valueOf("Yearly"));


    private String value;

    RepaymentFrequencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RepaymentFrequencyEnum fromValue(String v) {
        for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Repayment frequency")
 /**
   * Repayment frequency
  **/
  private RepaymentFrequencyEnum repaymentFrequency = null;

  @ApiModelProperty(value = "Details of capital repayment holiday if any")
  @Valid
 /**
   * Details of capital repayment holiday if any
  **/
  private List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday = null;


@XmlType(name="RepaymentTypeEnum")
@XmlEnum(String.class)
public enum RepaymentTypeEnum {

@XmlEnumValue("Balloon") BALLOON(String.valueOf("Balloon")), @XmlEnumValue("Bullet") BULLET(String.valueOf("Bullet")), @XmlEnumValue("CapitalAndInterest") CAPITALANDINTEREST(String.valueOf("CapitalAndInterest")), @XmlEnumValue("CustomSchedule") CUSTOMSCHEDULE(String.valueOf("CustomSchedule")), @XmlEnumValue("EarlyRepayment") EARLYREPAYMENT(String.valueOf("EarlyRepayment")), @XmlEnumValue("FixedCapitalFullyAmortising") FIXEDCAPITALFULLYAMORTISING(String.valueOf("FixedCapitalFullyAmortising")), @XmlEnumValue("FixedCapitalWithBullet") FIXEDCAPITALWITHBULLET(String.valueOf("FixedCapitalWithBullet")), @XmlEnumValue("FixedCapitalAndInterestReducingBalance") FIXEDCAPITALANDINTERESTREDUCINGBALANCE(String.valueOf("FixedCapitalAndInterestReducingBalance")), @XmlEnumValue("InterestOnly") INTERESTONLY(String.valueOf("InterestOnly")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PrepaymentFee") PREPAYMENTFEE(String.valueOf("PrepaymentFee")), @XmlEnumValue("RepaymentWithBullet") REPAYMENTWITHBULLET(String.valueOf("RepaymentWithBullet")), @XmlEnumValue("StraightLineInterestOnly") STRAIGHTLINEINTERESTONLY(String.valueOf("StraightLineInterestOnly"));


    private String value;

    RepaymentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RepaymentTypeEnum fromValue(String v) {
        for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Repayment type")
 /**
   * Repayment type
  **/
  private RepaymentTypeEnum repaymentType = null;
 /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
  **/
  @JsonProperty("AmountType")
  public String getAmountType() {
    if (amountType == null) {
      return null;
    }
    return amountType.value();
  }

  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public UnsecuredSMELendingResponseRepayment amountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

 /**
   * Optional additional notes to supplement the Repayment
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public UnsecuredSMELendingResponseRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseRepayment addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherAmountType
   * @return otherAmountType
  **/
  @JsonProperty("OtherAmountType")
  public OtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  public void setOtherAmountType(OtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public UnsecuredSMELendingResponseRepayment otherAmountType(OtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

 /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
  **/
  @JsonProperty("OtherRepaymentFrequency")
  public OtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  public void setOtherRepaymentFrequency(OtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public UnsecuredSMELendingResponseRepayment otherRepaymentFrequency(OtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

 /**
   * Get otherRepaymentType
   * @return otherRepaymentType
  **/
  @JsonProperty("OtherRepaymentType")
  public OtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  public void setOtherRepaymentType(OtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public UnsecuredSMELendingResponseRepayment otherRepaymentType(OtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

 /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
  **/
  @JsonProperty("RepaymentFeeCharges")
  public RepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  public void setRepaymentFeeCharges(RepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public UnsecuredSMELendingResponseRepayment repaymentFeeCharges(RepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

 /**
   * Repayment frequency
   * @return repaymentFrequency
  **/
  @JsonProperty("RepaymentFrequency")
  public String getRepaymentFrequency() {
    if (repaymentFrequency == null) {
      return null;
    }
    return repaymentFrequency.value();
  }

  public void setRepaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public UnsecuredSMELendingResponseRepayment repaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

 /**
   * Details of capital repayment holiday if any
   * @return repaymentHoliday
  **/
  @JsonProperty("RepaymentHoliday")
  public List<UnsecuredSMELendingResponseRepaymentHoliday> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  public void setRepaymentHoliday(List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }

  public UnsecuredSMELendingResponseRepayment repaymentHoliday(List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public UnsecuredSMELendingResponseRepayment addRepaymentHolidayItem(UnsecuredSMELendingResponseRepaymentHoliday repaymentHolidayItem) {
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

 /**
   * Repayment type
   * @return repaymentType
  **/
  @JsonProperty("RepaymentType")
  public String getRepaymentType() {
    if (repaymentType == null) {
      return null;
    }
    return repaymentType.value();
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public UnsecuredSMELendingResponseRepayment repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseRepayment {\n");
    
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
    sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
    sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
    sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
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

