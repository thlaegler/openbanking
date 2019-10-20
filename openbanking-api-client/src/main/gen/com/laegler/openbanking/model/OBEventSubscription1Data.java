package com.laegler.openbanking.model;

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

public class OBEventSubscription1Data  {
  
  @ApiModelProperty(value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
 /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
  **/
  private String callbackUrl = null;

  @ApiModelProperty(value = "")
  private List<String> eventTypes = null;

  @ApiModelProperty(required = true, value = "")
  private String version = null;
 /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
   * @return callbackUrl
  **/
  @JsonProperty("CallbackUrl")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public OBEventSubscription1Data callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

 /**
   * Get eventTypes
   * @return eventTypes
  **/
  @JsonProperty("EventTypes")
  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }

  public OBEventSubscription1Data eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public OBEventSubscription1Data addEventTypesItem(String eventTypesItem) {
    this.eventTypes.add(eventTypesItem);
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public OBEventSubscription1Data version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubscription1Data {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

