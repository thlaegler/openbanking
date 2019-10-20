package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.GeographicCoordinates1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 */
@ApiModel(description = "Geographic location of the ATM specified by geographic coordinates or UTM coordinates.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class GeoLocation1   {
  @JsonProperty("GeographicCoordinates")
  private GeographicCoordinates1 geographicCoordinates = null;

  public GeoLocation1 geographicCoordinates(GeographicCoordinates1 geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }

  /**
   * Get geographicCoordinates
   * @return geographicCoordinates
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GeographicCoordinates1 getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(GeographicCoordinates1 geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation1 geoLocation1 = (GeoLocation1) o;
    return Objects.equals(this.geographicCoordinates, geoLocation1.geographicCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation1 {\n");
    
    sb.append("    geographicCoordinates: ").append(toIndentedString(geographicCoordinates)).append("\n");
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

