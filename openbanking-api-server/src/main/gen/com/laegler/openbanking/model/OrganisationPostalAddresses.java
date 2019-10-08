package com.laegler.openbanking.model;

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

public class OrganisationPostalAddresses  {
  
  @ApiModelProperty(value = "Additional address line")
 /**
   * Additional address line
  **/
  private String addressLine2 = null;

  @ApiModelProperty(value = "Address Country in full")
 /**
   * Address Country in full
  **/
  private String country = null;

  @ApiModelProperty(value = "Country or regional devision")
 /**
   * Country or regional devision
  **/
  private String county = null;

  @ApiModelProperty(value = "Name of addressee")
 /**
   * Name of addressee
  **/
  private String name = null;

  @ApiModelProperty(value = "PO Box assosiated with address")
 /**
   * PO Box assosiated with address
  **/
  private String poBox = null;

  @ApiModelProperty(value = "Post or ZIP Code")
 /**
   * Post or ZIP Code
  **/
  private String postCode = null;

  @ApiModelProperty(value = "Flag to indicate that this is the primary contact address")
 /**
   * Flag to indicate that this is the primary contact address
  **/
  private Boolean primary = null;

  @ApiModelProperty(value = "Street Address, including building number")
 /**
   * Street Address, including building number
  **/
  private String streetAddress = null;

  @ApiModelProperty(value = "Postal Town")
 /**
   * Postal Town
  **/
  private String town = null;

  @ApiModelProperty(value = "Type of postal address")
 /**
   * Type of postal address
  **/
  private String type = null;
 /**
   * Additional address line
   * @return addressLine2
  **/
  @JsonProperty("AddressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public OrganisationPostalAddresses addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

 /**
   * Address Country in full
   * @return country
  **/
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrganisationPostalAddresses country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Country or regional devision
   * @return county
  **/
  @JsonProperty("County")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public OrganisationPostalAddresses county(String county) {
    this.county = county;
    return this;
  }

 /**
   * Name of addressee
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganisationPostalAddresses name(String name) {
    this.name = name;
    return this;
  }

 /**
   * PO Box assosiated with address
   * @return poBox
  **/
  @JsonProperty("POBox")
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public OrganisationPostalAddresses poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

 /**
   * Post or ZIP Code
   * @return postCode
  **/
  @JsonProperty("PostCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OrganisationPostalAddresses postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

 /**
   * Flag to indicate that this is the primary contact address
   * @return primary
  **/
  @JsonProperty("Primary")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public OrganisationPostalAddresses primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

 /**
   * Street Address, including building number
   * @return streetAddress
  **/
  @JsonProperty("StreetAddress")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public OrganisationPostalAddresses streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

 /**
   * Postal Town
   * @return town
  **/
  @JsonProperty("Town")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public OrganisationPostalAddresses town(String town) {
    this.town = town;
    return this;
  }

 /**
   * Type of postal address
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganisationPostalAddresses type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationPostalAddresses {\n");
    
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

