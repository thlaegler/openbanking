package com.laegler.openbanking.model;

import com.laegler.openbanking.model.GeographicCoordinates1;
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
  * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 **/
@ApiModel(description="Geographic location of the ATM specified by geographic coordinates or UTM coordinates.")
public class GeoLocation1  {
  
  @ApiModelProperty(required = true, value = "")
  private GeographicCoordinates1 geographicCoordinates = null;
 /**
   * Get geographicCoordinates
   * @return geographicCoordinates
  **/
  @JsonProperty("GeographicCoordinates")
  public GeographicCoordinates1 getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(GeographicCoordinates1 geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }

  public GeoLocation1 geographicCoordinates(GeographicCoordinates1 geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

