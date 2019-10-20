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
 * OrganisationPostalAddresses
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OrganisationPostalAddresses   {
  @JsonProperty("AddressLine2")
  private String addressLine2 = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("County")
  private String county = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("POBox")
  private String poBox = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("Primary")
  private Boolean primary = null;

  @JsonProperty("StreetAddress")
  private String streetAddress = null;

  @JsonProperty("Town")
  private String town = null;

  @JsonProperty("Type")
  private String type = null;

  public OrganisationPostalAddresses addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Additional address line
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Additional address line")


  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public OrganisationPostalAddresses country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Address Country in full
   * @return country
  **/
  @ApiModelProperty(value = "Address Country in full")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrganisationPostalAddresses county(String county) {
    this.county = county;
    return this;
  }

  /**
   * Country or regional devision
   * @return county
  **/
  @ApiModelProperty(value = "Country or regional devision")


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public OrganisationPostalAddresses name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of addressee
   * @return name
  **/
  @ApiModelProperty(value = "Name of addressee")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganisationPostalAddresses poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * PO Box assosiated with address
   * @return poBox
  **/
  @ApiModelProperty(value = "PO Box assosiated with address")


  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public OrganisationPostalAddresses postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Post or ZIP Code
   * @return postCode
  **/
  @ApiModelProperty(value = "Post or ZIP Code")


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OrganisationPostalAddresses primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Flag to indicate that this is the primary contact address
   * @return primary
  **/
  @ApiModelProperty(value = "Flag to indicate that this is the primary contact address")


  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public OrganisationPostalAddresses streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Street Address, including building number
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street Address, including building number")


  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public OrganisationPostalAddresses town(String town) {
    this.town = town;
    return this;
  }

  /**
   * Postal Town
   * @return town
  **/
  @ApiModelProperty(value = "Postal Town")


  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public OrganisationPostalAddresses type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of postal address
   * @return type
  **/
  @ApiModelProperty(value = "Type of postal address")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationPostalAddresses organisationPostalAddresses = (OrganisationPostalAddresses) o;
    return Objects.equals(this.addressLine2, organisationPostalAddresses.addressLine2) &&
        Objects.equals(this.country, organisationPostalAddresses.country) &&
        Objects.equals(this.county, organisationPostalAddresses.county) &&
        Objects.equals(this.name, organisationPostalAddresses.name) &&
        Objects.equals(this.poBox, organisationPostalAddresses.poBox) &&
        Objects.equals(this.postCode, organisationPostalAddresses.postCode) &&
        Objects.equals(this.primary, organisationPostalAddresses.primary) &&
        Objects.equals(this.streetAddress, organisationPostalAddresses.streetAddress) &&
        Objects.equals(this.town, organisationPostalAddresses.town) &&
        Objects.equals(this.type, organisationPostalAddresses.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine2, country, county, name, poBox, postCode, primary, streetAddress, town, type);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

