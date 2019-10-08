package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.Overdraft3OverdraftTierBandSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Overdraft3   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftTierBandSet")
  @Valid
  private List<Overdraft3OverdraftTierBandSet> overdraftTierBandSet = new ArrayList<>();

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

  public Overdraft3 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft3 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Associated Notes about the overdraft rates
   * @return notes
  **/
  @ApiModelProperty(value = "Associated Notes about the overdraft rates")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft3 overdraftTierBandSet(List<Overdraft3OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft3 addOverdraftTierBandSetItem(Overdraft3OverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

  /**
   * Tier band set details
   * @return overdraftTierBandSet
  **/
  @ApiModelProperty(required = true, value = "Tier band set details")
  @NotNull

  @Valid
@Size(min=1) 
  public List<Overdraft3OverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<Overdraft3OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public Overdraft3 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }

  /**
   * URL provided by the financial institution which redirects to the PCA Overdraft T&Cs on an external website
   * @return tcsAndCsURL
  **/
  @ApiModelProperty(value = "URL provided by the financial institution which redirects to the PCA Overdraft T&Cs on an external website")

@Size(min=1,max=500) 
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft3 overdraft3 = (Overdraft3) o;
    return Objects.equals(this.notes, overdraft3.notes) &&
        Objects.equals(this.overdraftTierBandSet, overdraft3.overdraftTierBandSet) &&
        Objects.equals(this.tcsAndCsURL, overdraft3.tcsAndCsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet, tcsAndCsURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft3 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
    sb.append("    tcsAndCsURL: ").append(toIndentedString(tcsAndCsURL)).append("\n");
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

