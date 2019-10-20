package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEventSubscriptionsResponse1DataEventSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBEventSubscriptionsResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBEventSubscriptionsResponse1Data   {
  @JsonProperty("EventSubscription")
  @Valid
  private List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription = null;

  public OBEventSubscriptionsResponse1Data eventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
    this.eventSubscription = eventSubscription;
    return this;
  }

  public OBEventSubscriptionsResponse1Data addEventSubscriptionItem(OBEventSubscriptionsResponse1DataEventSubscription eventSubscriptionItem) {
    if (this.eventSubscription == null) {
      this.eventSubscription = new ArrayList<>();
    }
    this.eventSubscription.add(eventSubscriptionItem);
    return this;
  }

  /**
   * Get eventSubscription
   * @return eventSubscription
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBEventSubscriptionsResponse1DataEventSubscription> getEventSubscription() {
    return eventSubscription;
  }

  public void setEventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
    this.eventSubscription = eventSubscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventSubscriptionsResponse1Data obEventSubscriptionsResponse1Data = (OBEventSubscriptionsResponse1Data) o;
    return Objects.equals(this.eventSubscription, obEventSubscriptionsResponse1Data.eventSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSubscription);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

