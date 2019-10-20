package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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
  * Location on the earth specified by two numbers representing vertical and horizontal position.
 **/
@ApiModel(description="Location on the earth specified by two numbers representing vertical and horizontal position.")
public class GeographicCoordinates  {
  
  @ApiModelProperty(required = true, value = "Latitude measured in decimal degrees.")
 /**
   * Latitude measured in decimal degrees.
  **/
  private String latitude = null;

  @ApiModelProperty(required = true, value = "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory. The longitude is measured in decimal degrees.")
 /**
   * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory. The longitude is measured in decimal degrees.
  **/
  private String longitude = null;
 /**
   * Latitude measured in decimal degrees.
   * @return latitude
  **/
  @JsonProperty("Latitude")
  @NotNull
 @Pattern(regexp="^-?\\d{1,3}\\.\\d{1,8}$")  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory. The longitude is measured in decimal degrees.
   * @return longitude
  **/
  @JsonProperty("Longitude")
  @NotNull
 @Pattern(regexp="^-?\\d{1,3}\\.\\d{1,8}$")  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public GeographicCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

