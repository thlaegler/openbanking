package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.AvailabilityNonStandardAvailability;
import com.laegler.openbanking.model.StandardAvailability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Days and times defining when the branch is available for use by a customer
 */
@ApiModel(description = "Days and times defining when the branch is available for use by a customer")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Availability   {
  @JsonProperty("NonStandardAvailability")
  @Valid
  private List<AvailabilityNonStandardAvailability> nonStandardAvailability = null;

  @JsonProperty("StandardAvailability")
  private StandardAvailability standardAvailability = null;

  public Availability nonStandardAvailability(List<AvailabilityNonStandardAvailability> nonStandardAvailability) {
    this.nonStandardAvailability = nonStandardAvailability;
    return this;
  }

  public Availability addNonStandardAvailabilityItem(AvailabilityNonStandardAvailability nonStandardAvailabilityItem) {
    if (this.nonStandardAvailability == null) {
      this.nonStandardAvailability = new ArrayList<>();
    }
    this.nonStandardAvailability.add(nonStandardAvailabilityItem);
    return this;
  }

  /**
   * Non-standard hours of availability for a branch of an organisation
   * @return nonStandardAvailability
  **/
  @ApiModelProperty(value = "Non-standard hours of availability for a branch of an organisation")

  @Valid

  public List<AvailabilityNonStandardAvailability> getNonStandardAvailability() {
    return nonStandardAvailability;
  }

  public void setNonStandardAvailability(List<AvailabilityNonStandardAvailability> nonStandardAvailability) {
    this.nonStandardAvailability = nonStandardAvailability;
  }

  public Availability standardAvailability(StandardAvailability standardAvailability) {
    this.standardAvailability = standardAvailability;
    return this;
  }

  /**
   * Get standardAvailability
   * @return standardAvailability
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public StandardAvailability getStandardAvailability() {
    return standardAvailability;
  }

  public void setStandardAvailability(StandardAvailability standardAvailability) {
    this.standardAvailability = standardAvailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Availability availability = (Availability) o;
    return Objects.equals(this.nonStandardAvailability, availability.nonStandardAvailability) &&
        Objects.equals(this.standardAvailability, availability.standardAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonStandardAvailability, standardAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Availability {\n");
    
    sb.append("    nonStandardAvailability: ").append(toIndentedString(nonStandardAvailability)).append("\n");
    sb.append("    standardAvailability: ").append(toIndentedString(standardAvailability)).append("\n");
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

