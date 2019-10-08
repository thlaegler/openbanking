package com.laegler.openbanking.model;

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
  * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 **/
@ApiModel(description="Information that locates and identifies a specific address, as defined by postal services or in free format text.")
public class OBRisk1DeliveryAddress  {
  
  @ApiModelProperty(value = "")
  private List<String> addressLine = null;

  @ApiModelProperty(value = "")
  private String buildingNumber = null;

  @ApiModelProperty(required = true, value = "Nation with its own government, occupying a particular territory.")
 /**
   * Nation with its own government, occupying a particular territory.
  **/
  private String country = null;

  @ApiModelProperty(value = "")
  private List<String> countrySubDivision = null;

  @ApiModelProperty(value = "")
  private String postCode = null;

  @ApiModelProperty(value = "")
  private String streetName = null;

  @ApiModelProperty(required = true, value = "")
  private String townName = null;
 /**
   * Get addressLine
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
 @Size(min=0,max=2)  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBRisk1DeliveryAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBRisk1DeliveryAddress addAddressLineItem(String addressLineItem) {
    this.addressLine.add(addressLineItem);
    return this;
  }

 /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @JsonProperty("BuildingNumber")
 @Size(min=1,max=16)  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBRisk1DeliveryAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

 /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  **/
  @JsonProperty("Country")
  @NotNull
 @Pattern(regexp="^[A-Z]{2,2}$")  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBRisk1DeliveryAddress country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get countrySubDivision
   * @return countrySubDivision
  **/
  @JsonProperty("CountrySubDivision")
 @Size(min=0,max=2)  public List<String> getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBRisk1DeliveryAddress countrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  public OBRisk1DeliveryAddress addCountrySubDivisionItem(String countrySubDivisionItem) {
    this.countrySubDivision.add(countrySubDivisionItem);
    return this;
  }

 /**
   * Get postCode
   * @return postCode
  **/
  @JsonProperty("PostCode")
 @Size(min=1,max=16)  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBRisk1DeliveryAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

 /**
   * Get streetName
   * @return streetName
  **/
  @JsonProperty("StreetName")
 @Size(min=1,max=70)  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBRisk1DeliveryAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Get townName
   * @return townName
  **/
  @JsonProperty("TownName")
  @NotNull
 @Size(min=1,max=35)  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBRisk1DeliveryAddress townName(String townName) {
    this.townName = townName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRisk1DeliveryAddress {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
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

