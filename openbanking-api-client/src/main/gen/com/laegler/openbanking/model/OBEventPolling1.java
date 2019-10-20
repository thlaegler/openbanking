package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventPolling1SetErrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBEventPolling1  {
  
  @ApiModelProperty(value = "")
  private List<String> ack = null;

  @ApiModelProperty(value = "Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available")
 /**
   * Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
  **/
  private Integer maxEvents = null;

  @ApiModelProperty(value = "Indicates whether an ASPSP should return a response immediately or provide a long poll")
 /**
   * Indicates whether an ASPSP should return a response immediately or provide a long poll
  **/
  private Boolean returnImmediately = null;

  @ApiModelProperty(value = "An object that encapsulates all negative acknowledgements transmitted by the TPP")
 /**
   * An object that encapsulates all negative acknowledgements transmitted by the TPP
  **/
  private Map<String, OBEventPolling1SetErrs> setErrs = null;
 /**
   * Get ack
   * @return ack
  **/
  @JsonProperty("ack")
  public List<String> getAck() {
    return ack;
  }

  public void setAck(List<String> ack) {
    this.ack = ack;
  }

  public OBEventPolling1 ack(List<String> ack) {
    this.ack = ack;
    return this;
  }

  public OBEventPolling1 addAckItem(String ackItem) {
    this.ack.add(ackItem);
    return this;
  }

 /**
   * Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
   * @return maxEvents
  **/
  @JsonProperty("maxEvents")
  public Integer getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
  }

  public OBEventPolling1 maxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

 /**
   * Indicates whether an ASPSP should return a response immediately or provide a long poll
   * @return returnImmediately
  **/
  @JsonProperty("returnImmediately")
  public Boolean isReturnImmediately() {
    return returnImmediately;
  }

  public void setReturnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
  }

  public OBEventPolling1 returnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
    return this;
  }

 /**
   * An object that encapsulates all negative acknowledgements transmitted by the TPP
   * @return setErrs
  **/
  @JsonProperty("setErrs")
  public Map<String, OBEventPolling1SetErrs> getSetErrs() {
    return setErrs;
  }

  public void setSetErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
    this.setErrs = setErrs;
  }

  public OBEventPolling1 setErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
    this.setErrs = setErrs;
    return this;
  }

  public OBEventPolling1 putSetErrsItem(String key, OBEventPolling1SetErrs setErrsItem) {
    this.setErrs.put(key, setErrsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventPolling1 {\n");
    
    sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
    sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
    sb.append("    returnImmediately: ").append(toIndentedString(returnImmediately)).append("\n");
    sb.append("    setErrs: ").append(toIndentedString(setErrs)).append("\n");
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

