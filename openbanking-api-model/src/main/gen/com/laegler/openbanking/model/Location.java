package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.LocationOtherLocationCategory;
import com.laegler.openbanking.model.PostalAddress;
import com.laegler.openbanking.model.Site;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location of the ATM.
 */
@ApiModel(description = "Location of the ATM.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class Location   {
  /**
   * Indicates the environment of the ATM.
   */
  public enum LocationCategoryEnum {
    BRANCHEXTERNAL("BranchExternal"),
    
    BRANCHINTERNAL("BranchInternal"),
    
    BRANCHLOBBY("BranchLobby"),
    
    OTHER("Other"),
    
    RETAILEROUTLET("RetailerOutlet"),
    
    REMOTEUNIT("RemoteUnit");

    private String value;

    LocationCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocationCategoryEnum fromValue(String text) {
      for (LocationCategoryEnum b : LocationCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("LocationCategory")
  @Valid
  private List<LocationCategoryEnum> locationCategory = null;

  @JsonProperty("OtherLocationCategory")
  @Valid
  private List<LocationOtherLocationCategory> otherLocationCategory = null;

  @JsonProperty("PostalAddress")
  private PostalAddress postalAddress = null;

  @JsonProperty("Site")
  private Site site = null;

  public Location locationCategory(List<LocationCategoryEnum> locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

  public Location addLocationCategoryItem(LocationCategoryEnum locationCategoryItem) {
    if (this.locationCategory == null) {
      this.locationCategory = new ArrayList<>();
    }
    this.locationCategory.add(locationCategoryItem);
    return this;
  }

  /**
   * Indicates the environment of the ATM.
   * @return locationCategory
  **/
  @ApiModelProperty(value = "Indicates the environment of the ATM.")


  public List<LocationCategoryEnum> getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(List<LocationCategoryEnum> locationCategory) {
    this.locationCategory = locationCategory;
  }

  public Location otherLocationCategory(List<LocationOtherLocationCategory> otherLocationCategory) {
    this.otherLocationCategory = otherLocationCategory;
    return this;
  }

  public Location addOtherLocationCategoryItem(LocationOtherLocationCategory otherLocationCategoryItem) {
    if (this.otherLocationCategory == null) {
      this.otherLocationCategory = new ArrayList<>();
    }
    this.otherLocationCategory.add(otherLocationCategoryItem);
    return this;
  }

  /**
   * Enter a new code , name and description for any other location category
   * @return otherLocationCategory
  **/
  @ApiModelProperty(value = "Enter a new code , name and description for any other location category")

  @Valid

  public List<LocationOtherLocationCategory> getOtherLocationCategory() {
    return otherLocationCategory;
  }

  public void setOtherLocationCategory(List<LocationOtherLocationCategory> otherLocationCategory) {
    this.otherLocationCategory = otherLocationCategory;
  }

  public Location postalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public Location site(Site site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.locationCategory, location.locationCategory) &&
        Objects.equals(this.otherLocationCategory, location.otherLocationCategory) &&
        Objects.equals(this.postalAddress, location.postalAddress) &&
        Objects.equals(this.site, location.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationCategory, otherLocationCategory, postalAddress, site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    locationCategory: ").append(toIndentedString(locationCategory)).append("\n");
    sb.append("    otherLocationCategory: ").append(toIndentedString(otherLocationCategory)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

