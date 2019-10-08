package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
 */
@ApiModel(description = "NonRepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class RepaymentNonRepaymentFeeChargeCap   {
  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  public enum CappingPeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    CappingPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CappingPeriodEnum fromValue(String text) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CappingPeriod")
  private CappingPeriodEnum cappingPeriod = null;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount = null;

  @JsonProperty("FeeCapOccurrence")
  private Float feeCapOccurrence = null;

  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    LATEPAYMENT("LatePayment"),
    
    OVERCREDITLIMIT("OverCreditLimit"),
    
    OTHER("Other"),
    
    RETURNPAYMENT("ReturnPayment");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FeeType")
  @Valid
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  /**
   * Min Max type
   */
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MinMaxTypeEnum fromValue(String text) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("MinMaxType")
  private MinMaxTypeEnum minMaxType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<BranchCurrentAccountResponseOtherFeeType> otherFeeType = null;

  public RepaymentNonRepaymentFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")


  public CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public RepaymentNonRepaymentFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public RepaymentNonRepaymentFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")


  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public RepaymentNonRepaymentFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public RepaymentNonRepaymentFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
  @NotNull

@Size(min=1) 
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public RepaymentNonRepaymentFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Min Max type
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "Min Max type")
  @NotNull


  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public RepaymentNonRepaymentFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public RepaymentNonRepaymentFeeChargeCap addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public RepaymentNonRepaymentFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public RepaymentNonRepaymentFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")

  @Valid

  public List<BranchCurrentAccountResponseOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentNonRepaymentFeeChargeCap repaymentNonRepaymentFeeChargeCap = (RepaymentNonRepaymentFeeChargeCap) o;
    return Objects.equals(this.cappingPeriod, repaymentNonRepaymentFeeChargeCap.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, repaymentNonRepaymentFeeChargeCap.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, repaymentNonRepaymentFeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeType, repaymentNonRepaymentFeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, repaymentNonRepaymentFeeChargeCap.minMaxType) &&
        Objects.equals(this.notes, repaymentNonRepaymentFeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, repaymentNonRepaymentFeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentNonRepaymentFeeChargeCap {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

