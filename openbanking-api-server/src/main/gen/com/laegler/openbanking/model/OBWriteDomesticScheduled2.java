package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBRisk1;
import com.laegler.openbanking.model.OBWriteDomesticScheduled2Data;
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

public class OBWriteDomesticScheduled2  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBWriteDomesticScheduled2Data data = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBRisk1 risk = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("Data")
  @NotNull
  public OBWriteDomesticScheduled2Data getData() {
    return data;
  }

  public void setData(OBWriteDomesticScheduled2Data data) {
    this.data = data;
  }

  public OBWriteDomesticScheduled2 data(OBWriteDomesticScheduled2Data data) {
    this.data = data;
    return this;
  }

 /**
   * Get risk
   * @return risk
  **/
  @JsonProperty("Risk")
  @NotNull
  public OBRisk1 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk1 risk) {
    this.risk = risk;
  }

  public OBWriteDomesticScheduled2 risk(OBRisk1 risk) {
    this.risk = risk;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticScheduled2 {\n");
    
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

