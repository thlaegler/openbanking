package com.laegler.openbanking.model;

import com.laegler.openbanking.model.GeographicCoordinates;
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
public class GeoLocation  {
  
  @ApiModelProperty(required = true, value = "")
  private GeographicCoordinates geographicCoordinates = null;
 /**
   * Get geographicCoordinates
   * @return geographicCoordinates
  **/
  @JsonProperty("GeographicCoordinates")
  public GeographicCoordinates getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }

  public GeoLocation geographicCoordinates(GeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    
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

