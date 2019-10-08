package com.laegler.openbanking.model;

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
  * Credit check criteria that the account holder will need to meet to take out the BCA product
 **/
@ApiModel(description="Credit check criteria that the account holder will need to meet to take out the BCA product")
public class CreditCheckEligibility  {
  
  @ApiModelProperty(value = "Optional additional notes to supplement the CreditCheck details")
 /**
   * Optional additional notes to supplement the CreditCheck details
  **/
  private List<String> notes = null;


@XmlType(name="ScoringTypeEnum")
@XmlEnum(String.class)
public enum ScoringTypeEnum {

@XmlEnumValue("Hard") HARD(String.valueOf("Hard")), @XmlEnumValue("Soft") SOFT(String.valueOf("Soft"));


    private String value;

    ScoringTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScoringTypeEnum fromValue(String v) {
        for (ScoringTypeEnum b : ScoringTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Opening Credit Scoring Type (Hard or Soft)")
 /**
   * Opening Credit Scoring Type (Hard or Soft)
  **/
  private ScoringTypeEnum scoringType = null;
 /**
   * Optional additional notes to supplement the CreditCheck details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditCheckEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditCheckEligibility addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Opening Credit Scoring Type (Hard or Soft)
   * @return scoringType
  **/
  @JsonProperty("ScoringType")
  public String getScoringType() {
    if (scoringType == null) {
      return null;
    }
    return scoringType.value();
  }

  public void setScoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
  }

  public CreditCheckEligibility scoringType(ScoringTypeEnum scoringType) {
    this.scoringType = scoringType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCheckEligibility {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    scoringType: ").append(toIndentedString(scoringType)).append("\n");
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

