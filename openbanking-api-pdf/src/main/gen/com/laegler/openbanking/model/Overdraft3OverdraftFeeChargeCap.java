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
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Overdraft3OverdraftFeeChargeCap   {
  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  public enum CappingPeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
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
   * Overdraft fee type
   */
  public enum FeeTypeEnum {
    ARRANGEDOVERDRAFT("ArrangedOverdraft"),
    
    EMERGENCYBORROWING("EmergencyBorrowing"),
    
    BORROWINGITEM("BorrowingItem"),
    
    OVERDRAFTRENEWAL("OverdraftRenewal"),
    
    ANNUALREVIEW("AnnualReview"),
    
    OVERDRAFTSETUP("OverdraftSetup"),
    
    SURCHARGE("Surcharge"),
    
    TEMPOVERDRAFT("TempOverdraft"),
    
    UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),
    
    UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),
    
    OTHER("Other"),
    
    UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

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
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
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

  @JsonProperty("OverdraftControlIndicator")
  private Boolean overdraftControlIndicator = null;

  public Overdraft3OverdraftFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
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

  public Overdraft3OverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge
   * @return feeCapAmount
  **/
  @ApiModelProperty(value = "Cap amount charged for a fee/charge")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public Overdraft3OverdraftFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
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

  public Overdraft3OverdraftFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public Overdraft3OverdraftFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
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

  public Overdraft3OverdraftFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")
  @NotNull


  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public Overdraft3OverdraftFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3OverdraftFeeChargeCap addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Notes related to Overdraft fee charge cap
   * @return notes
  **/
  @ApiModelProperty(value = "Notes related to Overdraft fee charge cap")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3OverdraftFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public Overdraft3OverdraftFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
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

  public Overdraft3OverdraftFeeChargeCap overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Specifies for the overdraft control feature/benefit
   * @return overdraftControlIndicator
  **/
  @ApiModelProperty(value = "Specifies for the overdraft control feature/benefit")


  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft3OverdraftFeeChargeCap overdraft3OverdraftFeeChargeCap = (Overdraft3OverdraftFeeChargeCap) o;
    return Objects.equals(this.cappingPeriod, overdraft3OverdraftFeeChargeCap.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, overdraft3OverdraftFeeChargeCap.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, overdraft3OverdraftFeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeType, overdraft3OverdraftFeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, overdraft3OverdraftFeeChargeCap.minMaxType) &&
        Objects.equals(this.notes, overdraft3OverdraftFeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, overdraft3OverdraftFeeChargeCap.otherFeeType) &&
        Objects.equals(this.overdraftControlIndicator, overdraft3OverdraftFeeChargeCap.overdraftControlIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType, overdraftControlIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3OverdraftFeeChargeCap {\n");
    
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
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

