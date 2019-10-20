package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AvailabilityDay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Standard hours of availability for the branch of the organisation
 */
@ApiModel(description = "Standard hours of availability for the branch of the organisation")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class StandardAvailability   {
  @JsonProperty("Day")
  @Valid
  private List<AvailabilityDay> day = new ArrayList<>();

  public StandardAvailability day(List<AvailabilityDay> day) {
    this.day = day;
    return this;
  }

  public StandardAvailability addDayItem(AvailabilityDay dayItem) {
    this.day.add(dayItem);
    return this;
  }

  /**
   * Working day information
   * @return day
  **/
  @ApiModelProperty(required = true, value = "Working day information")
  @NotNull

  @Valid
@Size(min=1,max=7) 
  public List<AvailabilityDay> getDay() {
    return day;
  }

  public void setDay(List<AvailabilityDay> day) {
    this.day = day;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardAvailability standardAvailability = (StandardAvailability) o;
    return Objects.equals(this.day, standardAvailability.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

