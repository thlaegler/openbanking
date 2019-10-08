package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadParty1DataParty;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadParty1Data  {
  
  @ApiModelProperty(value = "")
  private OBReadParty1DataParty party = null;
 /**
   * Get party
   * @return party
  **/
  @JsonProperty("Party")
  public OBReadParty1DataParty getParty() {
    return party;
  }

  public void setParty(OBReadParty1DataParty party) {
    this.party = party;
  }

  public OBReadParty1Data party(OBReadParty1DataParty party) {
    this.party = party;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty1Data {\n");
    
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
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

