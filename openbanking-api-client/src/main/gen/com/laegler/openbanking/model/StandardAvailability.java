package com.laegler.openbanking.model;

import com.laegler.openbanking.model.AvailabilityDay;
import io.swagger.annotations.ApiModel;
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

/**
  * Standard hours of availability for the branch of the organisation
 **/
@ApiModel(description="Standard hours of availability for the branch of the organisation")
public class StandardAvailability  {
  
  @ApiModelProperty(required = true, value = "Working day information")
 /**
   * Working day information
  **/
  private List<AvailabilityDay> day = new ArrayList<AvailabilityDay>();
 /**
   * Working day information
   * @return day
  **/
  @JsonProperty("Day")
  public List<AvailabilityDay> getDay() {
    return day;
  }

  public void setDay(List<AvailabilityDay> day) {
    this.day = day;
  }

  public StandardAvailability day(List<AvailabilityDay> day) {
    this.day = day;
    return this;
  }

  public StandardAvailability addDayItem(AvailabilityDay dayItem) {
    this.day.add(dayItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardAvailability {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

