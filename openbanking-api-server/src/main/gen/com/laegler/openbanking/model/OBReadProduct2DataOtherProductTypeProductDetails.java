package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBOtherCodeType10;
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

public class OBReadProduct2DataOtherProductTypeProductDetails  {
  
  @ApiModelProperty(value = "The length/duration of the fee free period")
 /**
   * The length/duration of the fee free period
  **/
  private Integer feeFreeLength = null;


@XmlType(name="FeeFreeLengthPeriodEnum")
@XmlEnum(String.class)
public enum FeeFreeLengthPeriodEnum {

@XmlEnumValue("PACT") PACT(String.valueOf("PACT")), @XmlEnumValue("PDAY") PDAY(String.valueOf("PDAY")), @XmlEnumValue("PHYR") PHYR(String.valueOf("PHYR")), @XmlEnumValue("PMTH") PMTH(String.valueOf("PMTH")), @XmlEnumValue("PQTR") PQTR(String.valueOf("PQTR")), @XmlEnumValue("PWEK") PWEK(String.valueOf("PWEK")), @XmlEnumValue("PYER") PYER(String.valueOf("PYER"));


    private String value;

    FeeFreeLengthPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeFreeLengthPeriodEnum fromValue(String v) {
        for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")
 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
  **/
  private FeeFreeLengthPeriodEnum feeFreeLengthPeriod = null;

  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
  **/
  private String monthlyMaximumCharge = null;

  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBOtherCodeType10 otherSegment = null;


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("GEAS") GEAS(String.valueOf("GEAS")), @XmlEnumValue("GEBA") GEBA(String.valueOf("GEBA")), @XmlEnumValue("GEBR") GEBR(String.valueOf("GEBR")), @XmlEnumValue("GEBU") GEBU(String.valueOf("GEBU")), @XmlEnumValue("GECI") GECI(String.valueOf("GECI")), @XmlEnumValue("GECS") GECS(String.valueOf("GECS")), @XmlEnumValue("GEFB") GEFB(String.valueOf("GEFB")), @XmlEnumValue("GEFG") GEFG(String.valueOf("GEFG")), @XmlEnumValue("GEG") GEG(String.valueOf("GEG")), @XmlEnumValue("GEGR") GEGR(String.valueOf("GEGR")), @XmlEnumValue("GEGS") GEGS(String.valueOf("GEGS")), @XmlEnumValue("GEOT") GEOT(String.valueOf("GEOT")), @XmlEnumValue("GEOV") GEOV(String.valueOf("GEOV")), @XmlEnumValue("GEPA") GEPA(String.valueOf("GEPA")), @XmlEnumValue("GEPR") GEPR(String.valueOf("GEPR")), @XmlEnumValue("GERE") GERE(String.valueOf("GERE")), @XmlEnumValue("GEST") GEST(String.valueOf("GEST")), @XmlEnumValue("GEYA") GEYA(String.valueOf("GEYA")), @XmlEnumValue("GEYO") GEYO(String.valueOf("GEYO")), @XmlEnumValue("PSCA") PSCA(String.valueOf("PSCA")), @XmlEnumValue("PSES") PSES(String.valueOf("PSES")), @XmlEnumValue("PSNC") PSNC(String.valueOf("PSNC")), @XmlEnumValue("PSNP") PSNP(String.valueOf("PSNP")), @XmlEnumValue("PSRG") PSRG(String.valueOf("PSRG")), @XmlEnumValue("PSSS") PSSS(String.valueOf("PSSS")), @XmlEnumValue("PSST") PSST(String.valueOf("PSST")), @XmlEnumValue("PSSW") PSSW(String.valueOf("PSSW"));


    private String value;

    SegmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SegmentEnum fromValue(String v) {
        for (SegmentEnum b : SegmentEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private List<SegmentEnum> segment = null;
 /**
   * The length/duration of the fee free period
   * @return feeFreeLength
  **/
  @JsonProperty("FeeFreeLength")
  public Integer getFeeFreeLength() {
    return feeFreeLength;
  }

  public void setFeeFreeLength(Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLength(Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
  **/
  @JsonProperty("FeeFreeLengthPeriod")
  public String getFeeFreeLengthPeriod() {
    if (feeFreeLengthPeriod == null) {
      return null;
    }
    return feeFreeLengthPeriod.value();
  }

  public void setFeeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @JsonProperty("MonthlyMaximumCharge")
 @Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")  public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails monthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
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

  public OBReadProduct2DataOtherProductTypeProductDetails notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherSegment
   * @return otherSegment
  **/
  @JsonProperty("OtherSegment")
  public OBOtherCodeType10 getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails otherSegment(OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

 /**
   * Get segment
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeProductDetails {\n");
    
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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

