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
 * OBEventSubscriptionResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBEventSubscriptionResponse1Data   {
  @JsonProperty("CallbackUrl")
  private String callbackUrl = null;

  @JsonProperty("EventSubscriptionId")
  private String eventSubscriptionId = null;

  @JsonProperty("EventTypes")
  @Valid
  private List<String> eventTypes = null;

  @JsonProperty("Version")
  private String version = null;

  public OBEventSubscriptionResponse1Data callbackUrl(String callbackUrl) {
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

  public OBEventSubscriptionResponse1Data eventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.
   * @return eventSubscriptionId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the callback URL resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getEventSubscriptionId() {
    return eventSubscriptionId;
  }

  public void setEventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
  }

  public OBEventSubscriptionResponse1Data eventTypes(List<String> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public OBEventSubscriptionResponse1Data addEventTypesItem(String eventTypesItem) {
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

  public OBEventSubscriptionResponse1Data version(String version) {
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
    OBEventSubscriptionResponse1Data obEventSubscriptionResponse1Data = (OBEventSubscriptionResponse1Data) o;
    return Objects.equals(this.callbackUrl, obEventSubscriptionResponse1Data.callbackUrl) &&
        Objects.equals(this.eventSubscriptionId, obEventSubscriptionResponse1Data.eventSubscriptionId) &&
        Objects.equals(this.eventTypes, obEventSubscriptionResponse1Data.eventTypes) &&
        Objects.equals(this.version, obEventSubscriptionResponse1Data.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, eventSubscriptionId, eventTypes, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubscriptionResponse1Data {\n");
    
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

