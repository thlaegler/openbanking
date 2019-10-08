package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBRisk1DeliveryAddress   {
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

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("StreetName")
  private String streetName = null;

  @JsonProperty("TownName")
  private String townName = null;

  public OBRisk1DeliveryAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBRisk1DeliveryAddress addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=2) 
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBRisk1DeliveryAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=16) 
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBRisk1DeliveryAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Nation with its own government, occupying a particular territory.")
  @NotNull

@Pattern(regexp="^[A-Z]{2,2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBRisk1DeliveryAddress countrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  public OBRisk1DeliveryAddress addCountrySubDivisionItem(String countrySubDivisionItem) {
    if (this.countrySubDivision == null) {
      this.countrySubDivision = new ArrayList<>();
    }
    this.countrySubDivision.add(countrySubDivisionItem);
    return this;
  }

  /**
   * Get countrySubDivision
   * @return countrySubDivision
  **/
  @ApiModelProperty(value = "")

@Size(min=0,max=2) 
  public List<String> getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBRisk1DeliveryAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=16) 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBRisk1DeliveryAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=70) 
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBRisk1DeliveryAddress townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Get townName
   * @return townName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    OBRisk1DeliveryAddress obRisk1DeliveryAddress = (OBRisk1DeliveryAddress) o;
    return Objects.equals(this.addressLine, obRisk1DeliveryAddress.addressLine) &&
        Objects.equals(this.buildingNumber, obRisk1DeliveryAddress.buildingNumber) &&
        Objects.equals(this.country, obRisk1DeliveryAddress.country) &&
        Objects.equals(this.countrySubDivision, obRisk1DeliveryAddress.countrySubDivision) &&
        Objects.equals(this.postCode, obRisk1DeliveryAddress.postCode) &&
        Objects.equals(this.streetName, obRisk1DeliveryAddress.streetName) &&
        Objects.equals(this.townName, obRisk1DeliveryAddress.townName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, buildingNumber, country, countrySubDivision, postCode, streetName, townName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

