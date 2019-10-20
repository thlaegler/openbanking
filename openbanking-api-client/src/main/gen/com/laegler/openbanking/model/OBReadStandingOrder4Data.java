package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBStandingOrder4;
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

public class OBReadStandingOrder4Data  {
  
  @ApiModelProperty(value = "")
  private List<OBStandingOrder4> standingOrder = null;
 /**
   * Get standingOrder
   * @return standingOrder
  **/
  @JsonProperty("StandingOrder")
  public List<OBStandingOrder4> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder4> standingOrder) {
    this.standingOrder = standingOrder;
  }

  public OBReadStandingOrder4Data standingOrder(List<OBStandingOrder4> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder4Data addStandingOrderItem(OBStandingOrder4 standingOrderItem) {
    this.standingOrder.add(standingOrderItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder4Data {\n");
    
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

