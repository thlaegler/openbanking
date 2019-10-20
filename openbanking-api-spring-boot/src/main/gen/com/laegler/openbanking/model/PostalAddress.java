package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.GeoLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services or in free format text.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class PostalAddress   {
  @JsonProperty("AddressLine")
  @Valid
  private List<String> addressLine = null;

  @JsonProperty("BuildingNumber")
  private String buildingNumber = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("CountrySubDivision")
  @Valid
  private List<String> countrySubDivision = null;

  @JsonProperty("GeoLocation")
  private GeoLocation geoLocation = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("StreetName")
  private String streetName = null;

  @JsonProperty("TownName")
  private String townName = null;

  public PostalAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public PostalAddress addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   * @return addressLine
  **/
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")

@Size(min=0,max=7) 
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public PostalAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Name or Number that identifies the position of a building on a street.
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "Name or Number that identifies the position of a building on a street.")

@Size(min=1,max=350) 
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public PostalAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  **/
  @ApiModelProperty(value = "Nation with its own government, occupying a particular territory.")

@Pattern(regexp="[A-Z]{2}") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostalAddress countrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  public PostalAddress addCountrySubDivisionItem(String countrySubDivisionItem) {
    if (this.countrySubDivision == null) {
      this.countrySubDivision = new ArrayList<>();
    }
    this.countrySubDivision.add(countrySubDivisionItem);
    return this;
  }

  /**
   * Identifies a subdivision of a country, for instance state, region, county.
   * @return countrySubDivision
  **/
  @ApiModelProperty(value = "Identifies a subdivision of a country, for instance state, region, county.")

@Size(min=0,max=2) 
  public List<String> getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PostalAddress geoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   * @return geoLocation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }

  public PostalAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  **/
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")

@Size(min=1,max=16) 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public PostalAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
  **/
  @ApiModelProperty(value = "Name of a street or thoroughfare.")

@Size(min=1,max=70) 
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public PostalAddress townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  **/
  @ApiModelProperty(value = "Name of a built-up area, with defined boundaries, and a local government.")

@Size(min=1,max=35) 
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.addressLine, postalAddress.addressLine) &&
        Objects.equals(this.buildingNumber, postalAddress.buildingNumber) &&
        Objects.equals(this.country, postalAddress.country) &&
        Objects.equals(this.countrySubDivision, postalAddress.countrySubDivision) &&
        Objects.equals(this.geoLocation, postalAddress.geoLocation) &&
        Objects.equals(this.postCode, postalAddress.postCode) &&
        Objects.equals(this.streetName, postalAddress.streetName) &&
        Objects.equals(this.townName, postalAddress.townName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, buildingNumber, country, countrySubDivision, geoLocation, postCode, streetName, townName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

