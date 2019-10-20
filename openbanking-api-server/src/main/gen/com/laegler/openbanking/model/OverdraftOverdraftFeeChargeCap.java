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
  * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 **/
@ApiModel(description="Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
public class OverdraftOverdraftFeeChargeCap  {
  

@XmlType(name="CappingPeriodEnum")
@XmlEnum(String.class)
public enum CappingPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("HalfYear") HALFYEAR(String.valueOf("HalfYear")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


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

  @ApiModelProperty(value = "Cap amount charged for a fee/charge")
 /**
   * Cap amount charged for a fee/charge
  **/
  private String feeCapAmount = null;

  @ApiModelProperty(value = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.")
 /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.
  **/
  private Float feeCapOccurrence = null;


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

  @ApiModelProperty(value = "Notes related to Overdraft fee charge cap")
 /**
   * Notes related to Overdraft fee charge cap
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

  public OverdraftOverdraftFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

 /**
   * Cap amount charged for a fee/charge
   * @return feeCapAmount
  **/
  @JsonProperty("FeeCapAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OverdraftOverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

 /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if its part of a government scheme, or whether the rate may vary dependent on the applicants circumstances.
   * @return feeCapOccurrence
  **/
  @JsonProperty("FeeCapOccurrence")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OverdraftOverdraftFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
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

  public OverdraftOverdraftFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OverdraftOverdraftFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
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

  public OverdraftOverdraftFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Notes related to Overdraft fee charge cap
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftOverdraftFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftOverdraftFeeChargeCap addNotesItem(String notesItem) {
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

  public OverdraftOverdraftFeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OverdraftOverdraftFeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftFeeChargeCap {\n");
    
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

