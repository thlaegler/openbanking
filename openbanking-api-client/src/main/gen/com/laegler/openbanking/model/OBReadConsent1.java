package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadConsent1Data;
import com.laegler.openbanking.model.OBRisk2;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadConsent1  {
  
  @ApiModelProperty(required = true, value = "")
  private OBReadConsent1Data data = null;

  @ApiModelProperty(required = true, value = "")
  private OBRisk2 risk = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("Data")
  public OBReadConsent1Data getData() {
    return data;
  }

  public void setData(OBReadConsent1Data data) {
    this.data = data;
  }

  public OBReadConsent1 data(OBReadConsent1Data data) {
    this.data = data;
    return this;
  }

 /**
   * Get risk
   * @return risk
  **/
  @JsonProperty("Risk")
  public OBRisk2 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk2 risk) {
    this.risk = risk;
  }

  public OBReadConsent1 risk(OBRisk2 risk) {
    this.risk = risk;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

