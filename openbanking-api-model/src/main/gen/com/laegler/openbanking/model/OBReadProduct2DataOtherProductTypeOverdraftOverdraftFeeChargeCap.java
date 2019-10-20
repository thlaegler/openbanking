package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBMinMaxType1Code;
import com.laegler.openbanking.model.OBPeriod1Code;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap   {
  @JsonProperty("CappingPeriod")
  private OBPeriod1Code cappingPeriod = null;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount = null;

  @JsonProperty("FeeCapOccurrence")
  private Integer feeCapOccurrence = null;

  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    FBAO("FBAO"),
    
    FBAR("FBAR"),
    
    FBEB("FBEB"),
    
    FBIT("FBIT"),
    
    FBOR("FBOR"),
    
    FBOS("FBOS"),
    
    FBSC("FBSC"),
    
    FBTO("FBTO"),
    
    FBUB("FBUB"),
    
    FBUT("FBUT"),
    
    FTOT("FTOT"),
    
    FTUT("FTUT");

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

  @JsonProperty("MinMaxType")
  private OBMinMaxType1Code minMaxType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType = null;

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap cappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Get cappingPeriod
   * @return cappingPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPeriod1Code getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Get feeCapAmount
   * @return feeCapAmount
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap feeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * Get feeCapOccurrence
   * @return feeCapOccurrence
  **/
  @ApiModelProperty(value = "")


  public Integer getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1) 
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap minMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Get minMaxType
   * @return minMaxType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap otherFeeType(List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap addOtherFeeTypeItem(OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType) {
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
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap) o;
    return Objects.equals(this.cappingPeriod, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.cappingPeriod) &&
        Objects.equals(this.feeCapAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.feeCapAmount) &&
        Objects.equals(this.feeCapOccurrence, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.minMaxType) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappingPeriod, feeCapAmount, feeCapOccurrence, feeType, minMaxType, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap {\n");
    
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

