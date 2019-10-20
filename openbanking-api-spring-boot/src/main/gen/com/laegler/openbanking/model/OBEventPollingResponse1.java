package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBEventPollingResponse1
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBEventPollingResponse1   {
  @JsonProperty("moreAvailable")
  private Boolean moreAvailable = null;

  @JsonProperty("sets")
  @Valid
  private Map<String, String> sets = new HashMap<>();

  public OBEventPollingResponse1 moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

  /**
   * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
   * @return moreAvailable
  **/
  @ApiModelProperty(required = true, value = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
  @NotNull


  public Boolean isMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  public OBEventPollingResponse1 sets(Map<String, String> sets) {
    this.sets = sets;
    return this;
  }

  public OBEventPollingResponse1 putSetsItem(String key, String setsItem) {
    this.sets.put(key, setsItem);
    return this;
  }

  /**
   * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
   * @return sets
  **/
  @ApiModelProperty(required = true, value = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
  @NotNull


  public Map<String, String> getSets() {
    return sets;
  }

  public void setSets(Map<String, String> sets) {
    this.sets = sets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventPollingResponse1 obEventPollingResponse1 = (OBEventPollingResponse1) o;
    return Objects.equals(this.moreAvailable, obEventPollingResponse1.moreAvailable) &&
        Objects.equals(this.sets, obEventPollingResponse1.sets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreAvailable, sets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventPollingResponse1 {\n");
    
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
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

