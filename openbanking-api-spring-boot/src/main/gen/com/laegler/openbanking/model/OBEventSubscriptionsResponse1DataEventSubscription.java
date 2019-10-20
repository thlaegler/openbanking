package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBEventSubscriptionsResponse1DataEventSubscription
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBEventSubscriptionsResponse1DataEventSubscription   {
  @JsonProperty("CallbackUrl")
  private String callbackUrl = null;

  @JsonProperty("EventSubscriptionId")
  private String eventSubscriptionId = null;

  @JsonProperty("EventTypes")
  @Valid
  private List<String> eventTypes = null;

  @JsonProperty("Version")
  private String version = null;

  public OBEventSubscriptionsResponse1DataEventSubscription callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")


  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public OBEventSubscriptionsResponse1DataEventSubscription eventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.
   * @return eventSubscriptionId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getEventSubscriptionId() {
    return eventSubscriptionId;
  }

  public void setEventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
  }

  public OBEventSubscriptionsResponse1DataEventSubscription eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public OBEventSubscriptionsResponse1DataEventSubscription addEventTypesItem(String eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Get eventTypes
   * @return eventTypes
  **/
  @ApiModelProperty(value = "")


  public List<String> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
  }

  public OBEventSubscriptionsResponse1DataEventSubscription version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=10) 
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventSubscriptionsResponse1DataEventSubscription obEventSubscriptionsResponse1DataEventSubscription = (OBEventSubscriptionsResponse1DataEventSubscription) o;
    return Objects.equals(this.callbackUrl, obEventSubscriptionsResponse1DataEventSubscription.callbackUrl) &&
        Objects.equals(this.eventSubscriptionId, obEventSubscriptionsResponse1DataEventSubscription.eventSubscriptionId) &&
        Objects.equals(this.eventTypes, obEventSubscriptionsResponse1DataEventSubscription.eventTypes) &&
        Objects.equals(this.version, obEventSubscriptionsResponse1DataEventSubscription.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, eventSubscriptionId, eventTypes, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubscriptionsResponse1DataEventSubscription {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

