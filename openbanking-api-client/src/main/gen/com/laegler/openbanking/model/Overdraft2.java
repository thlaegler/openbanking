package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Overdraft2OverdraftTierBandSet;
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
  * Details about Overdraft rates, fees & charges
 **/
@ApiModel(description="Details about Overdraft rates, fees & charges")
public class Overdraft2  {
  
  @ApiModelProperty(value = "Associated Notes about the overdraft rates")
 /**
   * Associated Notes about the overdraft rates
  **/
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "Tier band set details")
 /**
   * Tier band set details
  **/
  private List<Overdraft2OverdraftTierBandSet> overdraftTierBandSet = new ArrayList<Overdraft2OverdraftTierBandSet>();
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

  public Overdraft2 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft2 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Tier band set details
   * @return overdraftTierBandSet
  **/
  @JsonProperty("OverdraftTierBandSet")
  public List<Overdraft2OverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<Overdraft2OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public Overdraft2 overdraftTierBandSet(List<Overdraft2OverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft2 addOverdraftTierBandSetItem(Overdraft2OverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft2 {\n");
    
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

