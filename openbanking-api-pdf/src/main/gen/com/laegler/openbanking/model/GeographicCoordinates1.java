package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location on the earth specified by two numbers representing vertical and horizontal position.
 */
@ApiModel(description = "Location on the earth specified by two numbers representing vertical and horizontal position.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class GeographicCoordinates1   {
  @JsonProperty("Latitude")
  private String latitude = null;

  @JsonProperty("Longitude")
  private String longitude = null;

  public GeographicCoordinates1 latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude measured in decimal degrees
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "Latitude measured in decimal degrees")
  @NotNull

@Pattern(regexp="^-?\\d{1,3}\\.\\d{1,8}$") 
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicCoordinates1 longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory. The longitude is measured in decimal degrees.
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory. The longitude is measured in decimal degrees.")
  @NotNull

@Pattern(regexp="^-?\\d{1,3}\\.\\d{1,8}$") 
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicCoordinates1 geographicCoordinates1 = (GeographicCoordinates1) o;
    return Objects.equals(this.latitude, geographicCoordinates1.latitude) &&
        Objects.equals(this.longitude, geographicCoordinates1.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicCoordinates1 {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

