package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBAddressTypeCode;
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
  * Information that locates and identifies a specific address, as defined by postal services.
 **/
@ApiModel(description="Information that locates and identifies a specific address, as defined by postal services.")
public class OBPostalAddress6  {
  
  @ApiModelProperty(value = "")
  private List<String> addressLine = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBAddressTypeCode addressType = null;

  @ApiModelProperty(value = "")
  private String buildingNumber = null;

  @ApiModelProperty(value = "Nation with its own government.")
 /**
   * Nation with its own government.
  **/
  private String country = null;

  @ApiModelProperty(value = "Identifies a subdivision of a country such as state, region, county.")
 /**
   * Identifies a subdivision of a country such as state, region, county.
  **/
  private String countrySubDivision = null;

  @ApiModelProperty(value = "Identification of a division of a large organisation or building.")
 /**
   * Identification of a division of a large organisation or building.
  **/
  private String department = null;

  @ApiModelProperty(value = "")
  private String postCode = null;

  @ApiModelProperty(value = "")
  private String streetName = null;

  @ApiModelProperty(value = "Identification of a sub-division of a large organisation or building.")
 /**
   * Identification of a sub-division of a large organisation or building.
  **/
  private String subDepartment = null;

  @ApiModelProperty(value = "")
  private String townName = null;
 /**
   * Get addressLine
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
 @Size(min=0,max=7)  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBPostalAddress6 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress6 addAddressLineItem(String addressLineItem) {
    this.addressLine.add(addressLineItem);
    return this;
  }

 /**
   * Get addressType
   * @return addressType
  **/
  @JsonProperty("AddressType")
  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress6 addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
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

  public OBPostalAddress6 buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

 /**
   * Nation with its own government.
   * @return country
  **/
  @JsonProperty("Country")
 @Pattern(regexp="^[A-Z]{2,2}$")  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBPostalAddress6 country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  **/
  @JsonProperty("CountrySubDivision")
 @Size(min=1,max=35)  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress6 countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

 /**
   * Identification of a division of a large organisation or building.
   * @return department
  **/
  @JsonProperty("Department")
 @Size(min=1,max=70)  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public OBPostalAddress6 department(String department) {
    this.department = department;
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

  public OBPostalAddress6 postCode(String postCode) {
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

  public OBPostalAddress6 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
  **/
  @JsonProperty("SubDepartment")
 @Size(min=1,max=70)  public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBPostalAddress6 subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

 /**
   * Get townName
   * @return townName
  **/
  @JsonProperty("TownName")
 @Size(min=1,max=35)  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBPostalAddress6 townName(String townName) {
    this.townName = townName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress6 {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
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

