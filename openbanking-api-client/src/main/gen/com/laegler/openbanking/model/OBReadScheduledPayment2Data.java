package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBScheduledPayment2;
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

public class OBReadScheduledPayment2Data  {
  
  @ApiModelProperty(value = "")
  private List<OBScheduledPayment2> scheduledPayment = null;
 /**
   * Get scheduledPayment
   * @return scheduledPayment
  **/
  @JsonProperty("ScheduledPayment")
  public List<OBScheduledPayment2> getScheduledPayment() {
    return scheduledPayment;
  }

  public void setScheduledPayment(List<OBScheduledPayment2> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
  }

  public OBReadScheduledPayment2Data scheduledPayment(List<OBScheduledPayment2> scheduledPayment) {
    this.scheduledPayment = scheduledPayment;
    return this;
  }

  public OBReadScheduledPayment2Data addScheduledPaymentItem(OBScheduledPayment2 scheduledPaymentItem) {
    this.scheduledPayment.add(scheduledPaymentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadScheduledPayment2Data {\n");
    
    sb.append("    scheduledPayment: ").append(toIndentedString(scheduledPayment)).append("\n");
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

