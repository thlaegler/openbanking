package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherLegalStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Legal structure eligibility requirement to access the SME Loan product.
 */
@ApiModel(description = "Legal structure eligibility requirement to access the SME Loan product.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Eligibility3LegalStructureEligibility   {
  /**
   * Defines the legal structure of the business to access the SME Loan product.
   */
  public enum LegalStructureEnum {
    CIO("CIO"),
    
    CLUBSOCIETY("ClubSociety"),
    
    CHARITY("Charity"),
    
    LTD("Ltd"),
    
    LBG("LBG"),
    
    LLP("LLP"),
    
    OTHER("Other"),
    
    PARTNERSHIP("Partnership"),
    
    SOLETRADER("SoleTrader"),
    
    TRUST("Trust");

    private String value;

    LegalStructureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LegalStructureEnum fromValue(String text) {
      for (LegalStructureEnum b : LegalStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("LegalStructure")
  private LegalStructureEnum legalStructure = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherLegalStructure")
  private OtherLegalStructure otherLegalStructure = null;

  public Eligibility3LegalStructureEligibility legalStructure(LegalStructureEnum legalStructure) {
    this.legalStructure = legalStructure;
    return this;
  }

  /**
   * Defines the legal structure of the business to access the SME Loan product.
   * @return legalStructure
  **/
  @ApiModelProperty(value = "Defines the legal structure of the business to access the SME Loan product.")


  public LegalStructureEnum getLegalStructure() {
    return legalStructure;
  }

  public void setLegalStructure(LegalStructureEnum legalStructure) {
    this.legalStructure = legalStructure;
  }

  public Eligibility3LegalStructureEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Eligibility3LegalStructureEligibility addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the LegalStructureEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the LegalStructureEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Eligibility3LegalStructureEligibility otherLegalStructure(OtherLegalStructure otherLegalStructure) {
    this.otherLegalStructure = otherLegalStructure;
    return this;
  }

  /**
   * Get otherLegalStructure
   * @return otherLegalStructure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherLegalStructure getOtherLegalStructure() {
    return otherLegalStructure;
  }

  public void setOtherLegalStructure(OtherLegalStructure otherLegalStructure) {
    this.otherLegalStructure = otherLegalStructure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility3LegalStructureEligibility eligibility3LegalStructureEligibility = (Eligibility3LegalStructureEligibility) o;
    return Objects.equals(this.legalStructure, eligibility3LegalStructureEligibility.legalStructure) &&
        Objects.equals(this.notes, eligibility3LegalStructureEligibility.notes) &&
        Objects.equals(this.otherLegalStructure, eligibility3LegalStructureEligibility.otherLegalStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalStructure, notes, otherLegalStructure);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

