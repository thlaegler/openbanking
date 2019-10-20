package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AvailabilityDay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Non-standard hours of availability for a branch of an organisation
 */
@ApiModel(description = "Non-standard hours of availability for a branch of an organisation")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class AvailabilityNonStandardAvailability   {
  @JsonProperty("Day")
  @Valid
  private List<AvailabilityDay> day = null;

  @JsonProperty("EndDate")
  private LocalDate endDate = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  private String notes = null;

  @JsonProperty("StartDate")
  private LocalDate startDate = null;

  public AvailabilityNonStandardAvailability day(List<AvailabilityDay> day) {
    this.day = day;
    return this;
  }

  public AvailabilityNonStandardAvailability addDayItem(AvailabilityDay dayItem) {
    if (this.day == null) {
      this.day = new ArrayList<>();
    }
    this.day.add(dayItem);
    return this;
  }

  /**
   * Working day information
   * @return day
  **/
  @ApiModelProperty(value = "Working day information")

  @Valid
@Size(min=0,max=7) 
  public List<AvailabilityDay> getDay() {
    return day;
  }

  public void setDay(List<AvailabilityDay> day) {
    this.day = day;
  }

  public AvailabilityNonStandardAvailability endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.
   * @return endDate
  **/
  @ApiModelProperty(value = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public AvailabilityNonStandardAvailability name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name provided for non-standard opening periods e.g. Christmas
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name provided for non-standard opening periods e.g. Christmas")
  @NotNull

@Size(min=1,max=140) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailabilityNonStandardAvailability notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes related to the Non-standard hours e.g. During shrimp season, the branch has extended opening hours
   * @return notes
  **/
  @ApiModelProperty(value = "Notes related to the Non-standard hours e.g. During shrimp season, the branch has extended opening hours")

@Size(min=1,max=2000) 
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AvailabilityNonStandardAvailability startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.
   * @return startDate
  **/
  @ApiModelProperty(value = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityNonStandardAvailability availabilityNonStandardAvailability = (AvailabilityNonStandardAvailability) o;
    return Objects.equals(this.day, availabilityNonStandardAvailability.day) &&
        Objects.equals(this.endDate, availabilityNonStandardAvailability.endDate) &&
        Objects.equals(this.name, availabilityNonStandardAvailability.name) &&
        Objects.equals(this.notes, availabilityNonStandardAvailability.notes) &&
        Objects.equals(this.startDate, availabilityNonStandardAvailability.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, endDate, name, notes, startDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

