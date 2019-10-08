package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LocationOtherLocationCategory;
import com.laegler.openbanking.model.PostalAddress;
import com.laegler.openbanking.model.Site;
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
  * Location of the ATM.
 **/
@ApiModel(description="Location of the ATM.")
public class Location  {
  

@XmlType(name="LocationCategoryEnum")
@XmlEnum(String.class)
public enum LocationCategoryEnum {

@XmlEnumValue("BranchExternal") BRANCHEXTERNAL(String.valueOf("BranchExternal")), @XmlEnumValue("BranchInternal") BRANCHINTERNAL(String.valueOf("BranchInternal")), @XmlEnumValue("BranchLobby") BRANCHLOBBY(String.valueOf("BranchLobby")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("RetailerOutlet") RETAILEROUTLET(String.valueOf("RetailerOutlet")), @XmlEnumValue("RemoteUnit") REMOTEUNIT(String.valueOf("RemoteUnit"));


    private String value;

    LocationCategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LocationCategoryEnum fromValue(String v) {
        for (LocationCategoryEnum b : LocationCategoryEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Indicates the environment of the ATM.")
 /**
   * Indicates the environment of the ATM.
  **/
  private List<LocationCategoryEnum> locationCategory = null;

  @ApiModelProperty(value = "Enter a new code , name and description for any other location category")
 /**
   * Enter a new code , name and description for any other location category
  **/
  private List<LocationOtherLocationCategory> otherLocationCategory = null;

  @ApiModelProperty(required = true, value = "")
  private PostalAddress postalAddress = null;

  @ApiModelProperty(value = "")
  private Site site = null;
 /**
   * Indicates the environment of the ATM.
   * @return locationCategory
  **/
  @JsonProperty("LocationCategory")
  public List<LocationCategoryEnum> getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(List<LocationCategoryEnum> locationCategory) {
    this.locationCategory = locationCategory;
  }

  public Location locationCategory(List<LocationCategoryEnum> locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

  public Location addLocationCategoryItem(LocationCategoryEnum locationCategoryItem) {
    this.locationCategory.add(locationCategoryItem);
    return this;
  }

 /**
   * Enter a new code , name and description for any other location category
   * @return otherLocationCategory
  **/
  @JsonProperty("OtherLocationCategory")
  public List<LocationOtherLocationCategory> getOtherLocationCategory() {
    return otherLocationCategory;
  }

  public void setOtherLocationCategory(List<LocationOtherLocationCategory> otherLocationCategory) {
    this.otherLocationCategory = otherLocationCategory;
  }

  public Location otherLocationCategory(List<LocationOtherLocationCategory> otherLocationCategory) {
    this.otherLocationCategory = otherLocationCategory;
    return this;
  }

  public Location addOtherLocationCategoryItem(LocationOtherLocationCategory otherLocationCategoryItem) {
    this.otherLocationCategory.add(otherLocationCategoryItem);
    return this;
  }

 /**
   * Get postalAddress
   * @return postalAddress
  **/
  @JsonProperty("PostalAddress")
  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public Location postalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

 /**
   * Get site
   * @return site
  **/
  @JsonProperty("Site")
  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public Location site(Site site) {
    this.site = site;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

