package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBStandingOrder5;
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

public class OBReadStandingOrder5Data  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<OBStandingOrder5> standingOrder = null;
 /**
   * Get standingOrder
   * @return standingOrder
  **/
  @JsonProperty("StandingOrder")
  public List<OBStandingOrder5> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder5> standingOrder) {
    this.standingOrder = standingOrder;
  }

  public OBReadStandingOrder5Data standingOrder(List<OBStandingOrder5> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder5Data addStandingOrderItem(OBStandingOrder5 standingOrderItem) {
    this.standingOrder.add(standingOrderItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder5Data {\n");
    
    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

