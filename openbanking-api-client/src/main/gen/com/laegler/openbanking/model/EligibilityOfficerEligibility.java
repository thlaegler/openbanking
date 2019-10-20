package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherOfficerType;
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
  * Describes the requirement of the officers(owner, partner, directors) to access the BCA product.
 **/
@ApiModel(description="Describes the requirement of the officers(owner, partner, directors) to access the BCA product.")
public class EligibilityOfficerEligibility  {
  
  @ApiModelProperty(value = "Maximum amount of officers (for a particular officer type) required to the BCA product")
 /**
   * Maximum amount of officers (for a particular officer type) required to the BCA product
  **/
  private Integer maxAmount = null;

  @ApiModelProperty(value = "Minimum amount of officers (for a particular officer type) required to the BCA product")
 /**
   * Minimum amount of officers (for a particular officer type) required to the BCA product
  **/
  private Integer minAmount = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the OfficerEligibility details")
 /**
   * Optional additional notes to supplement the OfficerEligibility details
  **/
  private List<String> notes = null;


@XmlType(name="OfficerTypeEnum")
@XmlEnum(String.class)
public enum OfficerTypeEnum {

@XmlEnumValue("Director") DIRECTOR(String.valueOf("Director")), @XmlEnumValue("Owner") OWNER(String.valueOf("Owner")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Partner") PARTNER(String.valueOf("Partner"));


    private String value;

    OfficerTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfficerTypeEnum fromValue(String v) {
        for (OfficerTypeEnum b : OfficerTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Defines the types of officers eligible for the BCA product. Examples are Directors, Owners etc.")
 /**
   * Defines the types of officers eligible for the BCA product. Examples are Directors, Owners etc.
  **/
  private OfficerTypeEnum officerType = null;

  @ApiModelProperty(value = "")
  private OtherOfficerType otherOfficerType = null;
 /**
   * Maximum amount of officers (for a particular officer type) required to the BCA product
   * @return maxAmount
  **/
  @JsonProperty("MaxAmount")
  public Integer getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
  }

  public EligibilityOfficerEligibility maxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

 /**
   * Minimum amount of officers (for a particular officer type) required to the BCA product
   * @return minAmount
  **/
  @JsonProperty("MinAmount")
  public Integer getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Integer minAmount) {
    this.minAmount = minAmount;
  }

  public EligibilityOfficerEligibility minAmount(Integer minAmount) {
    this.minAmount = minAmount;
    return this;
  }

 /**
   * Optional additional notes to supplement the OfficerEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public EligibilityOfficerEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public EligibilityOfficerEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Defines the types of officers eligible for the BCA product. Examples are Directors, Owners etc.
   * @return officerType
  **/
  @JsonProperty("OfficerType")
  public String getOfficerType() {
    if (officerType == null) {
      return null;
    }
    return officerType.value();
  }

  public void setOfficerType(OfficerTypeEnum officerType) {
    this.officerType = officerType;
  }

  public EligibilityOfficerEligibility officerType(OfficerTypeEnum officerType) {
    this.officerType = officerType;
    return this;
  }

 /**
   * Get otherOfficerType
   * @return otherOfficerType
  **/
  @JsonProperty("OtherOfficerType")
  public OtherOfficerType getOtherOfficerType() {
    return otherOfficerType;
  }

  public void setOtherOfficerType(OtherOfficerType otherOfficerType) {
    this.otherOfficerType = otherOfficerType;
  }

  public EligibilityOfficerEligibility otherOfficerType(OtherOfficerType otherOfficerType) {
    this.otherOfficerType = otherOfficerType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityOfficerEligibility {\n");
    
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    officerType: ").append(toIndentedString(officerType)).append("\n");
    sb.append("    otherOfficerType: ").append(toIndentedString(otherOfficerType)).append("\n");
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

