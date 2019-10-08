package com.laegler.openbanking.model;

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

public class OBEventPollingResponse1  {
  
  @ApiModelProperty(required = true, value = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
 /**
   * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
  **/
  private Boolean moreAvailable = null;

  @ApiModelProperty(required = true, value = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
 /**
   * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
  **/
  private Map<String, String> sets = new HashMap<String, String>();
 /**
   * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
   * @return moreAvailable
  **/
  @JsonProperty("moreAvailable")
  public Boolean isMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  public OBEventPollingResponse1 moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

 /**
   * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
   * @return sets
  **/
  @JsonProperty("sets")
  public Map<String, String> getSets() {
    return sets;
  }

  public void setSets(Map<String, String> sets) {
    this.sets = sets;
  }

  public OBEventPollingResponse1 sets(Map<String, String> sets) {
    this.sets = sets;
    return this;
  }

  public OBEventPollingResponse1 putSetsItem(String key, String setsItem) {
    this.sets.put(key, setsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

