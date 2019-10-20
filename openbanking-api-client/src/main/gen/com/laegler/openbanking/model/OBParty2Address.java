package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBAddressTypeCode;
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
  * Postal address of a party.
 **/
@ApiModel(description="Postal address of a party.")
public class OBParty2Address  {
  
  @ApiModelProperty(value = "")
  private List<String> addressLine = null;

  @ApiModelProperty(value = "")
  private OBAddressTypeCode addressType = null;

  @ApiModelProperty(value = "")
  private String buildingNumber = null;

  @ApiModelProperty(required = true, value = "")
  private String country = null;

  @ApiModelProperty(value = "")
  private String countrySubDivision = null;

  @ApiModelProperty(value = "")
  private String postCode = null;

  @ApiModelProperty(value = "")
  private String streetName = null;

  @ApiModelProperty(value = "")
  private String townName = null;
 /**
   * Get addressLine
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBParty2Address addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBParty2Address addAddressLineItem(String addressLineItem) {
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

  public OBParty2Address addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

 /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @JsonProperty("BuildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBParty2Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBParty2Address country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get countrySubDivision
   * @return countrySubDivision
  **/
  @JsonProperty("CountrySubDivision")
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBParty2Address countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

 /**
   * Get postCode
   * @return postCode
  **/
  @JsonProperty("PostCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBParty2Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

 /**
   * Get streetName
   * @return streetName
  **/
  @JsonProperty("StreetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBParty2Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Get townName
   * @return townName
  **/
  @JsonProperty("TownName")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBParty2Address townName(String townName) {
    this.townName = townName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2Address {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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

