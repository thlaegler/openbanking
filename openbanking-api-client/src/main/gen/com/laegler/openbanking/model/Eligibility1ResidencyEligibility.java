package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherResidencyType;
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
  * Countries in which an accountholder can reside and, therefore, be eligible to open an account
 **/
@ApiModel(description="Countries in which an accountholder can reside and, therefore, be eligible to open an account")
public class Eligibility1ResidencyEligibility  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the ResidencyEligibility details")
 /**
   * Optional additional notes to supplement the ResidencyEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  private OtherResidencyType otherResidencyType = null;

  @ApiModelProperty(required = true, value = "Country code for which CCC product is allowed.")
 /**
   * Country code for which CCC product is allowed.
  **/
  private List<String> residencyIncluded = new ArrayList<String>();


@XmlType(name="ResidencyTypeEnum")
@XmlEnum(String.class)
public enum ResidencyTypeEnum {

@XmlEnumValue("Incorporated") INCORPORATED(String.valueOf("Incorporated")), @XmlEnumValue("Owner") OWNER(String.valueOf("Owner")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Trading") TRADING(String.valueOf("Trading")), @XmlEnumValue("CompanyTax") COMPANYTAX(String.valueOf("CompanyTax"));


    private String value;

    ResidencyTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResidencyTypeEnum fromValue(String v) {
        for (ResidencyTypeEnum b : ResidencyTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Residency type like Tax residency, Owner residency etc.")
 /**
   * Residency type like Tax residency, Owner residency etc.
  **/
  private ResidencyTypeEnum residencyType = null;
 /**
   * Optional additional notes to supplement the ResidencyEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility1ResidencyEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility1ResidencyEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherResidencyType
   * @return otherResidencyType
  **/
  @JsonProperty("OtherResidencyType")
  public OtherResidencyType getOtherResidencyType() {
    return otherResidencyType;
  }

  public void setOtherResidencyType(OtherResidencyType otherResidencyType) {
    this.otherResidencyType = otherResidencyType;
  }

  public Eligibility1ResidencyEligibility otherResidencyType(OtherResidencyType otherResidencyType) {
    this.otherResidencyType = otherResidencyType;
    return this;
  }

 /**
   * Country code for which CCC product is allowed.
   * @return residencyIncluded
  **/
  @JsonProperty("ResidencyIncluded")
  public List<String> getResidencyIncluded() {
    return residencyIncluded;
  }

  public void setResidencyIncluded(List<String> residencyIncluded) {
    this.residencyIncluded = residencyIncluded;
  }

  public Eligibility1ResidencyEligibility residencyIncluded(List<String> residencyIncluded) {
    this.residencyIncluded = residencyIncluded;
    return this;
  }

  public Eligibility1ResidencyEligibility addResidencyIncludedItem(String residencyIncludedItem) {
    this.residencyIncluded.add(residencyIncludedItem);
    return this;
  }

 /**
   * Residency type like Tax residency, Owner residency etc.
   * @return residencyType
  **/
  @JsonProperty("ResidencyType")
  public String getResidencyType() {
    if (residencyType == null) {
      return null;
    }
    return residencyType.value();
  }

  public void setResidencyType(ResidencyTypeEnum residencyType) {
    this.residencyType = residencyType;
  }

  public Eligibility1ResidencyEligibility residencyType(ResidencyTypeEnum residencyType) {
    this.residencyType = residencyType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility1ResidencyEligibility {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherResidencyType: ").append(toIndentedString(otherResidencyType)).append("\n");
    sb.append("    residencyIncluded: ").append(toIndentedString(residencyIncluded)).append("\n");
    sb.append("    residencyType: ").append(toIndentedString(residencyType)).append("\n");
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

