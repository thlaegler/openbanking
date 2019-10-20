package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFeeFrequency1Code4;
import com.laegler.openbanking.model.OBMinMaxType1Code;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType;
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
  * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
 **/
@ApiModel(description="Details about any caps (minimum/maximum charges) that apply to a particular fee/charge")
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap  {
  
  @ApiModelProperty(value = "")
  private OBFeeFrequency1Code4 cappingPeriod = null;

  @ApiModelProperty(value = "")
  private String feeCapAmount = null;

  @ApiModelProperty(value = "")
  private Integer feeCapOccurrence = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("FEPF") FEPF(String.valueOf("FEPF")), @XmlEnumValue("FTOT") FTOT(String.valueOf("FTOT")), @XmlEnumValue("FYAF") FYAF(String.valueOf("FYAF")), @XmlEnumValue("FYAM") FYAM(String.valueOf("FYAM")), @XmlEnumValue("FYAQ") FYAQ(String.valueOf("FYAQ")), @XmlEnumValue("FYCP") FYCP(String.valueOf("FYCP")), @XmlEnumValue("FYDB") FYDB(String.valueOf("FYDB")), @XmlEnumValue("FYMI") FYMI(String.valueOf("FYMI")), @XmlEnumValue("FYXX") FYXX(String.valueOf("FYXX"));


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

  @ApiModelProperty(required = true, value = "")
  private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();

  @ApiModelProperty(required = true, value = "")
  private OBMinMaxType1Code minMaxType = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType = null;
 /**
   * Get cappingPeriod
   * @return cappingPeriod
  **/
  @JsonProperty("CappingPeriod")
  public OBFeeFrequency1Code4 getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(OBFeeFrequency1Code4 cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap cappingPeriod(OBFeeFrequency1Code4 cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

 /**
   * Get feeCapAmount
   * @return feeCapAmount
  **/
  @JsonProperty("FeeCapAmount")
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

 /**
   * Get feeCapOccurrence
   * @return feeCapOccurrence
  **/
  @JsonProperty("FeeCapOccurrence")
  public Integer getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap feeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

 /**
   * Get feeType
   * @return feeType
  **/
  @JsonProperty("FeeType")
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

 /**
   * Get minMaxType
   * @return minMaxType
  **/
  @JsonProperty("MinMaxType")
  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap minMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap otherFeeType(List<OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap addOtherFeeTypeItem(OBReadProduct2DataOtherProductTypeLoanInterestOtherFeeType otherFeeTypeItem) {
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap {\n");
    
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

