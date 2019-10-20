package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.IndustryEligibility1OtherSICCodeExcluded;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Industry Eligibility that the account holder will need to meet to take out the CCC product
 */
@ApiModel(description = "Industry Eligibility that the account holder will need to meet to take out the CCC product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class IndustryEligibility1   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherSICCodeExcluded")
  @Valid
  private List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded = null;

  @JsonProperty("OtherSICCodeIncluded")
  @Valid
  private List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded = null;

  @JsonProperty("SICCodeExcluded")
  @Valid
  private List<String> siCCodeExcluded = null;

  @JsonProperty("SICCodeIncluded")
  @Valid
  private List<String> siCCodeIncluded = null;

  public IndustryEligibility1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility1 addNotesItem(String notesItem) {
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

  public IndustryEligibility1 otherSICCodeExcluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded) {
    this.otherSICCodeExcluded = otherSICCodeExcluded;
    return this;
  }

  public IndustryEligibility1 addOtherSICCodeExcludedItem(IndustryEligibility1OtherSICCodeExcluded otherSICCodeExcludedItem) {
    if (this.otherSICCodeExcluded == null) {
      this.otherSICCodeExcluded = new ArrayList<>();
    }
    this.otherSICCodeExcluded.add(otherSICCodeExcludedItem);
    return this;
  }

  /**
   * Other SICCode which is not in the standard code list
   * @return otherSICCodeExcluded
  **/
  @ApiModelProperty(value = "Other SICCode which is not in the standard code list")

  @Valid

  public List<IndustryEligibility1OtherSICCodeExcluded> getOtherSICCodeExcluded() {
    return otherSICCodeExcluded;
  }

  public void setOtherSICCodeExcluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeExcluded) {
    this.otherSICCodeExcluded = otherSICCodeExcluded;
  }

  public IndustryEligibility1 otherSICCodeIncluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
    return this;
  }

  public IndustryEligibility1 addOtherSICCodeIncludedItem(IndustryEligibility1OtherSICCodeExcluded otherSICCodeIncludedItem) {
    if (this.otherSICCodeIncluded == null) {
      this.otherSICCodeIncluded = new ArrayList<>();
    }
    this.otherSICCodeIncluded.add(otherSICCodeIncludedItem);
    return this;
  }

  /**
   * Other SICCode which is not in the standard code list
   * @return otherSICCodeIncluded
  **/
  @ApiModelProperty(value = "Other SICCode which is not in the standard code list")

  @Valid

  public List<IndustryEligibility1OtherSICCodeExcluded> getOtherSICCodeIncluded() {
    return otherSICCodeIncluded;
  }

  public void setOtherSICCodeIncluded(List<IndustryEligibility1OtherSICCodeExcluded> otherSICCodeIncluded) {
    this.otherSICCodeIncluded = otherSICCodeIncluded;
  }

  public IndustryEligibility1 siCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
    return this;
  }

  public IndustryEligibility1 addSiCCodeExcludedItem(String siCCodeExcludedItem) {
    if (this.siCCodeExcluded == null) {
      this.siCCodeExcluded = new ArrayList<>();
    }
    this.siCCodeExcluded.add(siCCodeExcludedItem);
    return this;
  }

  /**
   * UK Standard Industry Code of the business not eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeExcluded
  **/
  @ApiModelProperty(value = "UK Standard Industry Code of the business not eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/")


  public List<String> getSiCCodeExcluded() {
    return siCCodeExcluded;
  }

  public void setSiCCodeExcluded(List<String> siCCodeExcluded) {
    this.siCCodeExcluded = siCCodeExcluded;
  }

  public IndustryEligibility1 siCCodeIncluded(List<String> siCCodeIncluded) {
    this.siCCodeIncluded = siCCodeIncluded;
    return this;
  }

  public IndustryEligibility1 addSiCCodeIncludedItem(String siCCodeIncludedItem) {
    if (this.siCCodeIncluded == null) {
      this.siCCodeIncluded = new ArrayList<>();
    }
    this.siCCodeIncluded.add(siCCodeIncludedItem);
    return this;
  }

  /**
   * UK Standard Industry Code of the business eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCodeIncluded
  **/
  @ApiModelProperty(value = "UK Standard Industry Code of the business eligible to access the CCC product. Ref http://resources.companieshouse.gov.uk/sic/")


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
    IndustryEligibility1 industryEligibility1 = (IndustryEligibility1) o;
    return Objects.equals(this.notes, industryEligibility1.notes) &&
        Objects.equals(this.otherSICCodeExcluded, industryEligibility1.otherSICCodeExcluded) &&
        Objects.equals(this.otherSICCodeIncluded, industryEligibility1.otherSICCodeIncluded) &&
        Objects.equals(this.siCCodeExcluded, industryEligibility1.siCCodeExcluded) &&
        Objects.equals(this.siCCodeIncluded, industryEligibility1.siCCodeIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherSICCodeExcluded, otherSICCodeIncluded, siCCodeExcluded, siCCodeIncluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility1 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCodeExcluded: ").append(toIndentedString(otherSICCodeExcluded)).append("\n");
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

