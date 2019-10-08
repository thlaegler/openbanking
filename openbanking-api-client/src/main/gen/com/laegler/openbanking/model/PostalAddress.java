package com.laegler.openbanking.model;

import com.laegler.openbanking.model.GeoLocation;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 **/
@ApiModel(description="Information that locates and identifies a specific address, as defined by postal services or in free format text.")
public class PostalAddress  {
  
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")
 /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
  **/
  private List<String> addressLine = null;

  @ApiModelProperty(value = "Name or Number that identifies the position of a building on a street.")
 /**
   * Name or Number that identifies the position of a building on a street.
  **/
  private String buildingNumber = null;

  @ApiModelProperty(value = "Nation with its own government, occupying a particular territory.")
 /**
   * Nation with its own government, occupying a particular territory.
  **/
  private String country = null;

  @ApiModelProperty(value = "Identifies a subdivision of a country, for instance state, region, county.")
 /**
   * Identifies a subdivision of a country, for instance state, region, county.
  **/
  private List<String> countrySubDivision = null;

  @ApiModelProperty(value = "")
  private GeoLocation geoLocation = null;

  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")
 /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
  **/
  private String postCode = null;

  @ApiModelProperty(value = "Name of a street or thoroughfare.")
 /**
   * Name of a street or thoroughfare.
  **/
  private String streetName = null;

  @ApiModelProperty(value = "Name of a built-up area, with defined boundaries, and a local government.")
 /**
   * Name of a built-up area, with defined boundaries, and a local government.
  **/
  private String townName = null;
 /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public PostalAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public PostalAddress addAddressLineItem(String addressLineItem) {
    this.addressLine.add(addressLineItem);
    return this;
  }

 /**
   * Name or Number that identifies the position of a building on a street.
   * @return buildingNumber
  **/
  @JsonProperty("BuildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public PostalAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

 /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  **/
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostalAddress country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Identifies a subdivision of a country, for instance state, region, county.
   * @return countrySubDivision
  **/
  @JsonProperty("CountrySubDivision")
  public List<String> getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PostalAddress countrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  public PostalAddress addCountrySubDivisionItem(String countrySubDivisionItem) {
    this.countrySubDivision.add(countrySubDivisionItem);
    return this;
  }

 /**
   * Get geoLocation
   * @return geoLocation
  **/
  @JsonProperty("GeoLocation")
  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }

  public PostalAddress geoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

 /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  **/
  @JsonProperty("PostCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public PostalAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

 /**
   * Name of a street or thoroughfare.
   * @return streetName
  **/
  @JsonProperty("StreetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public PostalAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  **/
  @JsonProperty("TownName")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public PostalAddress townName(String townName) {
    this.townName = townName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
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

