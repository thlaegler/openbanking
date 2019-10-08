package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OtherSICCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Industry Eligibility that the account holder will need to meet to take out the BCA product
 */
@ApiModel(description = "Industry Eligibility that the account holder will need to meet to take out the BCA product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class IndustryEligibility   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherSICCode")
  private OtherSICCode otherSICCode = null;

  @JsonProperty("SICCode")
  @Valid
  private List<String> siCCode = new ArrayList<>();

  public IndustryEligibility notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IndustryEligibility addNotesItem(String notesItem) {
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

  public IndustryEligibility otherSICCode(OtherSICCode otherSICCode) {
    this.otherSICCode = otherSICCode;
    return this;
  }

  /**
   * Get otherSICCode
   * @return otherSICCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherSICCode getOtherSICCode() {
    return otherSICCode;
  }

  public void setOtherSICCode(OtherSICCode otherSICCode) {
    this.otherSICCode = otherSICCode;
  }

  public IndustryEligibility siCCode(List<String> siCCode) {
    this.siCCode = siCCode;
    return this;
  }

  public IndustryEligibility addSiCCodeItem(String siCCodeItem) {
    this.siCCode.add(siCCodeItem);
    return this;
  }

  /**
   * UK Standard Industry Code of the business eligible to access the BCA product. Ref http://resources.companieshouse.gov.uk/sic/
   * @return siCCode
  **/
  @ApiModelProperty(required = true, value = "UK Standard Industry Code of the business eligible to access the BCA product. Ref http://resources.companieshouse.gov.uk/sic/")
  @NotNull

@Size(min=1) 
  public List<String> getSiCCode() {
    return siCCode;
  }

  public void setSiCCode(List<String> siCCode) {
    this.siCCode = siCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndustryEligibility industryEligibility = (IndustryEligibility) o;
    return Objects.equals(this.notes, industryEligibility.notes) &&
        Objects.equals(this.otherSICCode, industryEligibility.otherSICCode) &&
        Objects.equals(this.siCCode, industryEligibility.siCCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, otherSICCode, siCCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryEligibility {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSICCode: ").append(toIndentedString(otherSICCode)).append("\n");
    sb.append("    siCCode: ").append(toIndentedString(siCCode)).append("\n");
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

