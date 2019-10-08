package com.laegler.openbanking.model;

import com.laegler.openbanking.model.AvailabilityDay;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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

/**
  * Non-standard hours of availability for a branch of an organisation
 **/
@ApiModel(description="Non-standard hours of availability for a branch of an organisation")
public class AvailabilityNonStandardAvailability  {
  
  @ApiModelProperty(value = "Working day information")
  @Valid
 /**
   * Working day information
  **/
  private List<AvailabilityDay> day = null;

  @ApiModelProperty(value = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.")
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.
  **/
  private LocalDate endDate = null;

  @ApiModelProperty(required = true, value = "Name provided for non-standard opening periods e.g. Christmas")
 /**
   * Name provided for non-standard opening periods e.g. Christmas
  **/
  private String name = null;

  @ApiModelProperty(value = "Notes related to the Non-standard hours e.g. During shrimp season, the branch has extended opening hours")
 /**
   * Notes related to the Non-standard hours e.g. During shrimp season, the branch has extended opening hours
  **/
  private String notes = null;

  @ApiModelProperty(value = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.")
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.
  **/
  private LocalDate startDate = null;
 /**
   * Working day information
   * @return day
  **/
  @JsonProperty("Day")
 @Size(min=0,max=7)  public List<AvailabilityDay> getDay() {
    return day;
  }

  public void setDay(List<AvailabilityDay> day) {
    this.day = day;
  }

  public AvailabilityNonStandardAvailability day(List<AvailabilityDay> day) {
    this.day = day;
    return this;
  }

  public AvailabilityNonStandardAvailability addDayItem(AvailabilityDay dayItem) {
    this.day.add(dayItem);
    return this;
  }

 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601.
   * @return endDate
  **/
  @JsonProperty("EndDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public AvailabilityNonStandardAvailability endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Name provided for non-standard opening periods e.g. Christmas
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=140)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailabilityNonStandardAvailability name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Notes related to the Non-standard hours e.g. During shrimp season, the branch has extended opening hours
   * @return notes
  **/
  @JsonProperty("Notes")
 @Size(min=1,max=2000)  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AvailabilityNonStandardAvailability notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601.
   * @return startDate
  **/
  @JsonProperty("StartDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public AvailabilityNonStandardAvailability startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityNonStandardAvailability {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

