package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet;
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
  * Borrowing details
 **/
@ApiModel(description="Borrowing details")
public class OBReadProduct2DataOtherProductTypeOverdraft  {
  
  @ApiModelProperty(value = "")
  private List<String> notes = null;

  @ApiModelProperty(required = true, value = "")
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet>();
 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get overdraftTierBandSet
   * @return overdraftTierBandSet
  **/
  @JsonProperty("OverdraftTierBandSet")
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft overdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraft {\n");
    
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

