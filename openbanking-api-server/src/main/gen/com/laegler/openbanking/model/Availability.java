package com.laegler.openbanking.model;

import com.laegler.openbanking.model.AvailabilityNonStandardAvailability;
import com.laegler.openbanking.model.StandardAvailability;
import io.swagger.annotations.ApiModel;
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
  * Days and times defining when the branch is available for use by a customer
 **/
@ApiModel(description="Days and times defining when the branch is available for use by a customer")
public class Availability  {
  
  @ApiModelProperty(value = "Non-standard hours of availability for a branch of an organisation")
  @Valid
 /**
   * Non-standard hours of availability for a branch of an organisation
  **/
  private List<AvailabilityNonStandardAvailability> nonStandardAvailability = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private StandardAvailability standardAvailability = null;
 /**
   * Non-standard hours of availability for a branch of an organisation
   * @return nonStandardAvailability
  **/
  @JsonProperty("NonStandardAvailability")
  public List<AvailabilityNonStandardAvailability> getNonStandardAvailability() {
    return nonStandardAvailability;
  }

  public void setNonStandardAvailability(List<AvailabilityNonStandardAvailability> nonStandardAvailability) {
    this.nonStandardAvailability = nonStandardAvailability;
  }

  public Availability nonStandardAvailability(List<AvailabilityNonStandardAvailability> nonStandardAvailability) {
    this.nonStandardAvailability = nonStandardAvailability;
    return this;
  }

  public Availability addNonStandardAvailabilityItem(AvailabilityNonStandardAvailability nonStandardAvailabilityItem) {
    this.nonStandardAvailability.add(nonStandardAvailabilityItem);
    return this;
  }

 /**
   * Get standardAvailability
   * @return standardAvailability
  **/
  @JsonProperty("StandardAvailability")
  @NotNull
  public StandardAvailability getStandardAvailability() {
    return standardAvailability;
  }

  public void setStandardAvailability(StandardAvailability standardAvailability) {
    this.standardAvailability = standardAvailability;
  }

  public Availability standardAvailability(StandardAvailability standardAvailability) {
    this.standardAvailability = standardAvailability;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

