package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;

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
  * Opening & Closing Times of a branch of an organisation
 **/
@ApiModel(description="Opening & Closing Times of a branch of an organisation")
public class AvailabilityOpeningHours  {
  
  @ApiModelProperty(required = true, value = "A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.")
 /**
   * A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.
  **/
  private String closingTime = null;

  @ApiModelProperty(required = true, value = "A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.")
 /**
   * A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.
  **/
  private String openingTime = null;
 /**
   * A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.
   * @return closingTime
  **/
  @JsonProperty("ClosingTime")
  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }

  public AvailabilityOpeningHours closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

 /**
   * A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.
   * @return openingTime
  **/
  @JsonProperty("OpeningTime")
  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public AvailabilityOpeningHours openingTime(String openingTime) {
    this.openingTime = openingTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityOpeningHours {\n");
    
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
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

