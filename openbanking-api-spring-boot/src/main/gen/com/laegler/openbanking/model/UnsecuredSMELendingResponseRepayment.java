package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherAmountType;
import com.laegler.openbanking.model.OtherRepaymentFrequency;
import com.laegler.openbanking.model.OtherRepaymentType;
import com.laegler.openbanking.model.RepaymentFeeCharges;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseRepaymentHoliday;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Repayment details of the Loan product
 */
@ApiModel(description = "Repayment details of the Loan product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class UnsecuredSMELendingResponseRepayment   {
  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   */
  public enum AmountTypeEnum {
    BALANCETODATE("BalanceToDate"),
    
    BALLOON("Balloon"),
    
    CAPITALANDINTEREST("CapitalAndInterest"),
    
    FEECHARGECAP("FeeChargeCap"),
    
    INTERESTONLY("InterestOnly"),
    
    BULLET("Bullet"),
    
    OTHER("Other");

    private String value;

    AmountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AmountTypeEnum fromValue(String text) {
      for (AmountTypeEnum b : AmountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AmountType")
  private AmountTypeEnum amountType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherAmountType")
  private OtherAmountType otherAmountType = null;

  @JsonProperty("OtherRepaymentFrequency")
  private OtherRepaymentFrequency otherRepaymentFrequency = null;

  @JsonProperty("OtherRepaymentType")
  private OtherRepaymentType otherRepaymentType = null;

  @JsonProperty("RepaymentFeeCharges")
  private RepaymentFeeCharges repaymentFeeCharges = null;

  /**
   * Repayment frequency
   */
  public enum RepaymentFrequencyEnum {
    DAILY("Daily"),
    
    FLEXIBLE("Flexible"),
    
    FORTNIGHTLY("Fortnightly"),
    
    HALFYEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    RepaymentFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepaymentFrequencyEnum fromValue(String text) {
      for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RepaymentFrequency")
  private RepaymentFrequencyEnum repaymentFrequency = null;

  @JsonProperty("RepaymentHoliday")
  @Valid
  private List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday = null;

  /**
   * Repayment type
   */
  public enum RepaymentTypeEnum {
    BALLOON("Balloon"),
    
    BULLET("Bullet"),
    
    CAPITALANDINTEREST("CapitalAndInterest"),
    
    CUSTOMSCHEDULE("CustomSchedule"),
    
    EARLYREPAYMENT("EarlyRepayment"),
    
    FIXEDCAPITALFULLYAMORTISING("FixedCapitalFullyAmortising"),
    
    FIXEDCAPITALWITHBULLET("FixedCapitalWithBullet"),
    
    FIXEDCAPITALANDINTERESTREDUCINGBALANCE("FixedCapitalAndInterestReducingBalance"),
    
    INTERESTONLY("InterestOnly"),
    
    OTHER("Other"),
    
    PREPAYMENTFEE("PrepaymentFee"),
    
    REPAYMENTWITHBULLET("RepaymentWithBullet"),
    
    STRAIGHTLINEINTERESTONLY("StraightLineInterestOnly");

    private String value;

    RepaymentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepaymentTypeEnum fromValue(String text) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RepaymentType")
  private RepaymentTypeEnum repaymentType = null;

  public UnsecuredSMELendingResponseRepayment amountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
  **/
  @ApiModelProperty(value = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc")


  public AmountTypeEnum getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public UnsecuredSMELendingResponseRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public UnsecuredSMELendingResponseRepayment addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Repayment
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Repayment")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public UnsecuredSMELendingResponseRepayment otherAmountType(OtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

  /**
   * Get otherAmountType
   * @return otherAmountType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  public void setOtherAmountType(OtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public UnsecuredSMELendingResponseRepayment otherRepaymentFrequency(OtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

  /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  public void setOtherRepaymentFrequency(OtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public UnsecuredSMELendingResponseRepayment otherRepaymentType(OtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

  /**
   * Get otherRepaymentType
   * @return otherRepaymentType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  public void setOtherRepaymentType(OtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public UnsecuredSMELendingResponseRepayment repaymentFeeCharges(RepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

  /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  public void setRepaymentFeeCharges(RepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public UnsecuredSMELendingResponseRepayment repaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  /**
   * Repayment frequency
   * @return repaymentFrequency
  **/
  @ApiModelProperty(value = "Repayment frequency")


  public RepaymentFrequencyEnum getRepaymentFrequency() {
    return repaymentFrequency;
  }

  public void setRepaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public UnsecuredSMELendingResponseRepayment repaymentHoliday(List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public UnsecuredSMELendingResponseRepayment addRepaymentHolidayItem(UnsecuredSMELendingResponseRepaymentHoliday repaymentHolidayItem) {
    if (this.repaymentHoliday == null) {
      this.repaymentHoliday = new ArrayList<>();
    }
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

  /**
   * Details of capital repayment holiday if any
   * @return repaymentHoliday
  **/
  @ApiModelProperty(value = "Details of capital repayment holiday if any")

  @Valid

  public List<UnsecuredSMELendingResponseRepaymentHoliday> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  public void setRepaymentHoliday(List<UnsecuredSMELendingResponseRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }

  public UnsecuredSMELendingResponseRepayment repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Repayment type
   * @return repaymentType
  **/
  @ApiModelProperty(value = "Repayment type")


  public RepaymentTypeEnum getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsecuredSMELendingResponseRepayment unsecuredSMELendingResponseRepayment = (UnsecuredSMELendingResponseRepayment) o;
    return Objects.equals(this.amountType, unsecuredSMELendingResponseRepayment.amountType) &&
        Objects.equals(this.notes, unsecuredSMELendingResponseRepayment.notes) &&
        Objects.equals(this.otherAmountType, unsecuredSMELendingResponseRepayment.otherAmountType) &&
        Objects.equals(this.otherRepaymentFrequency, unsecuredSMELendingResponseRepayment.otherRepaymentFrequency) &&
        Objects.equals(this.otherRepaymentType, unsecuredSMELendingResponseRepayment.otherRepaymentType) &&
        Objects.equals(this.repaymentFeeCharges, unsecuredSMELendingResponseRepayment.repaymentFeeCharges) &&
        Objects.equals(this.repaymentFrequency, unsecuredSMELendingResponseRepayment.repaymentFrequency) &&
        Objects.equals(this.repaymentHoliday, unsecuredSMELendingResponseRepayment.repaymentHoliday) &&
        Objects.equals(this.repaymentType, unsecuredSMELendingResponseRepayment.repaymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountType, notes, otherAmountType, otherRepaymentFrequency, otherRepaymentType, repaymentFeeCharges, repaymentFrequency, repaymentHoliday, repaymentType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

