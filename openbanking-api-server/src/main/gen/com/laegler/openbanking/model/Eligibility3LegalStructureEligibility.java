package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherLegalStructure;
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
  * Legal structure eligibility requirement to access the SME Loan product.
 **/
@ApiModel(description="Legal structure eligibility requirement to access the SME Loan product.")
public class Eligibility3LegalStructureEligibility  {
  

@XmlType(name="LegalStructureEnum")
@XmlEnum(String.class)
public enum LegalStructureEnum {

@XmlEnumValue("CIO") CIO(String.valueOf("CIO")), @XmlEnumValue("ClubSociety") CLUBSOCIETY(String.valueOf("ClubSociety")), @XmlEnumValue("Charity") CHARITY(String.valueOf("Charity")), @XmlEnumValue("Ltd") LTD(String.valueOf("Ltd")), @XmlEnumValue("LBG") LBG(String.valueOf("LBG")), @XmlEnumValue("LLP") LLP(String.valueOf("LLP")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Partnership") PARTNERSHIP(String.valueOf("Partnership")), @XmlEnumValue("SoleTrader") SOLETRADER(String.valueOf("SoleTrader")), @XmlEnumValue("Trust") TRUST(String.valueOf("Trust"));


    private String value;

    LegalStructureEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LegalStructureEnum fromValue(String v) {
        for (LegalStructureEnum b : LegalStructureEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Defines the legal structure of the business to access the SME Loan product.")
 /**
   * Defines the legal structure of the business to access the SME Loan product.
  **/
  private LegalStructureEnum legalStructure = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the LegalStructureEligibility details")
 /**
   * Optional additional notes to supplement the LegalStructureEligibility details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherLegalStructure otherLegalStructure = null;
 /**
   * Defines the legal structure of the business to access the SME Loan product.
   * @return legalStructure
  **/
  @JsonProperty("LegalStructure")
  public String getLegalStructure() {
    if (legalStructure == null) {
      return null;
    }
    return legalStructure.value();
  }

  public void setLegalStructure(LegalStructureEnum legalStructure) {
    this.legalStructure = legalStructure;
  }

  public Eligibility3LegalStructureEligibility legalStructure(LegalStructureEnum legalStructure) {
    this.legalStructure = legalStructure;
    return this;
  }

 /**
   * Optional additional notes to supplement the LegalStructureEligibility details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility3LegalStructureEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility3LegalStructureEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get otherLegalStructure
   * @return otherLegalStructure
  **/
  @JsonProperty("OtherLegalStructure")
  public OtherLegalStructure getOtherLegalStructure() {
    return otherLegalStructure;
  }

  public void setOtherLegalStructure(OtherLegalStructure otherLegalStructure) {
    this.otherLegalStructure = otherLegalStructure;
  }

  public Eligibility3LegalStructureEligibility otherLegalStructure(OtherLegalStructure otherLegalStructure) {
    this.otherLegalStructure = otherLegalStructure;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility3LegalStructureEligibility {\n");
    
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherLegalStructure: ").append(toIndentedString(otherLegalStructure)).append("\n");
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

