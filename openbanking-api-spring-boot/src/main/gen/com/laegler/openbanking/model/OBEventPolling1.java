package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEventPolling1SetErrs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBEventPolling1
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBEventPolling1   {
  @JsonProperty("ack")
  @Valid
  private List<String> ack = null;

  @JsonProperty("maxEvents")
  private Integer maxEvents = null;

  @JsonProperty("returnImmediately")
  private Boolean returnImmediately = null;

  @JsonProperty("setErrs")
  @Valid
  private Map<String, OBEventPolling1SetErrs> setErrs = null;

  public OBEventPolling1 ack(List<String> ack) {
    this.ack = ack;
    return this;
  }

  public OBEventPolling1 addAckItem(String ackItem) {
    if (this.ack == null) {
      this.ack = new ArrayList<>();
    }
    this.ack.add(ackItem);
    return this;
  }

  /**
   * Get ack
   * @return ack
  **/
  @ApiModelProperty(value = "")


  public List<String> getAck() {
    return ack;
  }

  public void setAck(List<String> ack) {
    this.ack = ack;
  }

  public OBEventPolling1 maxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
    return this;
  }

  /**
   * Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
   * @return maxEvents
  **/
  @ApiModelProperty(value = "Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available")


  public Integer getMaxEvents() {
    return maxEvents;
  }

  public void setMaxEvents(Integer maxEvents) {
    this.maxEvents = maxEvents;
  }

  public OBEventPolling1 returnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
    return this;
  }

  /**
   * Indicates whether an ASPSP should return a response immediately or provide a long poll
   * @return returnImmediately
  **/
  @ApiModelProperty(value = "Indicates whether an ASPSP should return a response immediately or provide a long poll")


  public Boolean isReturnImmediately() {
    return returnImmediately;
  }

  public void setReturnImmediately(Boolean returnImmediately) {
    this.returnImmediately = returnImmediately;
  }

  public OBEventPolling1 setErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
    this.setErrs = setErrs;
    return this;
  }

  public OBEventPolling1 putSetErrsItem(String key, OBEventPolling1SetErrs setErrsItem) {
    if (this.setErrs == null) {
      this.setErrs = new HashMap<>();
    }
    this.setErrs.put(key, setErrsItem);
    return this;
  }

  /**
   * An object that encapsulates all negative acknowledgements transmitted by the TPP
   * @return setErrs
  **/
  @ApiModelProperty(value = "An object that encapsulates all negative acknowledgements transmitted by the TPP")

  @Valid

  public Map<String, OBEventPolling1SetErrs> getSetErrs() {
    return setErrs;
  }

  public void setSetErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
    this.setErrs = setErrs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventPolling1 obEventPolling1 = (OBEventPolling1) o;
    return Objects.equals(this.ack, obEventPolling1.ack) &&
        Objects.equals(this.maxEvents, obEventPolling1.maxEvents) &&
        Objects.equals(this.returnImmediately, obEventPolling1.returnImmediately) &&
        Objects.equals(this.setErrs, obEventPolling1.setErrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ack, maxEvents, returnImmediately, setErrs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

