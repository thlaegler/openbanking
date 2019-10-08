package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventSubscriptionsResponse1DataEventSubscription;
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

public class OBEventSubscriptionsResponse1Data  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription = null;
 /**
   * Get eventSubscription
   * @return eventSubscription
  **/
  @JsonProperty("EventSubscription")
  public List<OBEventSubscriptionsResponse1DataEventSubscription> getEventSubscription() {
    return eventSubscription;
  }

  public void setEventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
    this.eventSubscription = eventSubscription;
  }

  public OBEventSubscriptionsResponse1Data eventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
    this.eventSubscription = eventSubscription;
    return this;
  }

  public OBEventSubscriptionsResponse1Data addEventSubscriptionItem(OBEventSubscriptionsResponse1DataEventSubscription eventSubscriptionItem) {
    this.eventSubscription.add(eventSubscriptionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubscriptionsResponse1Data {\n");
    
    sb.append("    eventSubscription: ").append(toIndentedString(eventSubscription)).append("\n");
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

