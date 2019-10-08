package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft1OverdraftTierBandSet;
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
  * Borrowing details
 **/
@ApiModel(description="Borrowing details")
public class Overdraft1  {
  
  @ApiModelProperty(value = "Associated Notes about the overdraft rates")
 /**
   * Associated Notes about the overdraft rates
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "Tier band set details")
  @Valid
 /**
   * Tier band set details
  **/
  private List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet = new ArrayList<Overdraft1OverdraftTierBandSet>();
 /**
   * Associated Notes about the overdraft rates
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft1 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Tier band set details
   * @return overdraftTierBandSet
  **/
  @JsonProperty("OverdraftTierBandSet")
  @NotNull
 @Size(min=1)  public List<Overdraft1OverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public Overdraft1 overdraftTierBandSet(List<Overdraft1OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft1 addOverdraftTierBandSetItem(Overdraft1OverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1 {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

