package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadDirectDebit1DataDirectDebit;
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

public class OBReadDirectDebit1Data  {
  
  @ApiModelProperty(value = "")
  private List<OBReadDirectDebit1DataDirectDebit> directDebit = null;
 /**
   * Get directDebit
   * @return directDebit
  **/
  @JsonProperty("DirectDebit")
  public List<OBReadDirectDebit1DataDirectDebit> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBReadDirectDebit1DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
  }

  public OBReadDirectDebit1Data directDebit(List<OBReadDirectDebit1DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit1Data addDirectDebitItem(OBReadDirectDebit1DataDirectDebit directDebitItem) {
    this.directDebit.add(directDebitItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1Data {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

