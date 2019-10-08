package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.IndustryEligibility2OtherSICCodeExluded;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Industry Eligibility that the account holder will need to meet to take out the SME Loan product
 */
@ApiModel(description = "Industry Eligibility that the account holder will need to meet to take out the SME Loan product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class IndustryEligibility2   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherSICCodeExluded")
  @Valid
  private List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded = null;

  @JsonProperty("OtherSICCodeIncluded")
  @Valid
  private List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded = null;

  @JsonProperty("SICCodeExcluded")
  @Valid
  private List<String> siCCodeExcluded = null;

  @JsonProperty("SICCodeIncluded")
  @Valid
  private List<String> siCCodeIncluded = null;

  public IndustryEligibility2 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility2 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the IndustryEligibility details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the IndustryEligibility details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public IndustryEligibility2 otherSICCodeExluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded) {
    this.otherSICCodeExluded = otherSICCodeExluded;
    return this;
  }

  public IndustryEligibility2 addOtherSICCodeExludedItem(IndustryEligibility2OtherSICCodeExluded otherSICCodeExludedItem) {
    if (this.otherSICCodeExluded == null) {
      this.otherSICCodeExluded = new ArrayList<>();
    }
    this.otherSICCodeExluded.add(otherSICCodeExludedItem);
    return this;
  }

  /**
   * Other SICCode which is not in the standard code set
   * @return otherSICCodeExluded
  **/
  @ApiModelProperty(value = "Other SICCode which is not in the standard code set")

  @Valid

  public List<IndustryEligibility2OtherSICCodeExluded> getOtherSICCodeExluded() {
    return otherSICCodeExluded;
  }

  public void setOtherSICCodeExluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeExluded) {
    this.otherSICCodeExluded = otherSICCodeExluded;
  }

  public IndustryEligibility2 otherSICCodeIncluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
    return this;
  }

  public IndustryEligibility2 addOtherSICCodeIncludedItem(IndustryEligibility2OtherSICCodeExluded otherSICCodeIncludedItem) {
    if (this.otherSICCodeIncluded == null) {
      this.otherSICCodeIncluded = new ArrayList<>();
    }
    this.otherSICCodeIncluded.add(otherSICCodeIncludedItem);
    return this;
  }

  /**
   * Other SICCode which is not in the standard code set
   * @return otherSICCodeIncluded
  **/
  @ApiModelProperty(value = "Other SICCode which is not in the standard code set")

  @Valid

  public List<IndustryEligibility2OtherSICCodeExluded> getOtherSICCodeIncluded() {
    return otherSICCodeIncluded;
  }

  public void setOtherSICCodeIncluded(List<IndustryEligibility2OtherSICCodeExluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
  }

  public IndustryEligibility2 siCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
    return this;
  }

  public IndustryEligibility2 addSiCCodeExcludedItem(String siCCodeExcludedItem) {
    if (this.siCCodeExcluded == null) {
      this.siCCodeExcluded = new ArrayList<>();
    }
    this.siCCodeExcluded.add(siCCodeExcludedItem);
    return this;
  }

  /**
   * UK Standard Industry Code of the business not eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeExcluded
  **/
  @ApiModelProperty(value = "UK Standard Industry Code of the business not eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/")


  public List<String> getSiCCodeExcluded() {
    return siCCodeExcluded;
  }

  public void setSiCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
  }

  public IndustryEligibility2 siCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
    return this;
  }

  public IndustryEligibility2 addSiCCodeIncludedItem(String siCCodeIncludedItem) {
    if (this.siCCodeIncluded == null) {
      this.siCCodeIncluded = new ArrayList<>();
    }
    this.siCCodeIncluded.add(siCCodeIncludedItem);
    return this;
  }

  /**
   * UK Standard Industry Code of the business eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeIncluded
  **/
  @ApiModelProperty(value = "UK Standard Industry Code of the business eligible to access the SME Loan product. Ref http://resources.companieshouse.gov.uk/sic/")


  public List<String> getSiCCodeIncluded() {
    return siCCodeIncluded;
  }

  public void setSiCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndustryEligibility2 industryEligibility2 = (IndustryEligibility2) o;
    return Objects.equals(this.notes, industryEligibility2.notes) &&
        Objects.equals(this.otherSICCodeExluded, industryEligibility2.otherSICCodeExluded) &&
        Objects.equals(this.otherSICCodeIncluded, industryEligibility2.otherSICCodeIncluded) &&
        Objects.equals(this.siCCodeExcluded, industryEligibility2.siCCodeExcluded) &&
        Objects.equals(this.siCCodeIncluded, industryEligibility2.siCCodeIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherSICCodeExluded, otherSICCodeIncluded, siCCodeExcluded, siCCodeIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility2 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCodeExluded: ").append(toIndentedString(otherSICCodeExluded)).append("\n");
    sb.append("    otherSICCodeIncluded: ").append(toIndentedString(otherSICCodeIncluded)).append("\n");
    sb.append("    siCCodeExcluded: ").append(toIndentedString(siCCodeExcluded)).append("\n");
    sb.append("    siCCodeIncluded: ").append(toIndentedString(siCCodeIncluded)).append("\n");
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

