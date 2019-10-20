package com.laegler.openbanking.model;

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
  * Core feature of the PCA product which can be associated to a particular Marketing State
 **/
@ApiModel(description="Core feature of the PCA product which can be associated to a particular Marketing State")
public class CoreProduct2  {
  
  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
  **/
  private String monthlyMaximumCharge = null;

  @ApiModelProperty(value = "The description of the PCA product used for marketing purposes from a customer perspective.")
 /**
   * The description of the PCA product used for marketing purposes from a customer perspective.
  **/
  private String productDescription = null;

  @ApiModelProperty(value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")
 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
  **/
  private String productURL = null;


@XmlType(name="SalesAccessChannelsEnum")
@XmlEnum(String.class)
public enum SalesAccessChannelsEnum {

@XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager"));


    private String value;

    SalesAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SalesAccessChannelsEnum fromValue(String v) {
        for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Channels through which a customer can open an account.")
 /**
   * Channels through which a customer can open an account.
  **/
  private List<SalesAccessChannelsEnum> salesAccessChannels = null;


@XmlType(name="ServicingAccessChannelsEnum")
@XmlEnum(String.class)
public enum ServicingAccessChannelsEnum {

@XmlEnumValue("ATM") ATM(String.valueOf("ATM")), @XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("MobileBankingApp") MOBILEBANKINGAPP(String.valueOf("MobileBankingApp")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("PostOffice") POSTOFFICE(String.valueOf("PostOffice")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager")), @XmlEnumValue("Text") TEXT(String.valueOf("Text"));


    private String value;

    ServicingAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ServicingAccessChannelsEnum fromValue(String v) {
        for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Methods by which a customer can access the services associated to the PCA product")
 /**
   * Methods by which a customer can access the services associated to the PCA product
  **/
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = null;

  @ApiModelProperty(value = "URL provided by the financial institution which redirects to the PCA T&Cs on an external website")
 /**
   * URL provided by the financial institution which redirects to the PCA T&Cs on an external website
  **/
  private String tcsAndCsURL = null;
 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @JsonProperty("MonthlyMaximumCharge")
  public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public CoreProduct2 monthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
    return this;
  }

 /**
   * The description of the PCA product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @JsonProperty("ProductDescription")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct2 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @JsonProperty("ProductURL")
  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public CoreProduct2 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

 /**
   * Channels through which a customer can open an account.
   * @return salesAccessChannels
  **/
  @JsonProperty("SalesAccessChannels")
  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct2 salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct2 addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

 /**
   * Methods by which a customer can access the services associated to the PCA product
   * @return servicingAccessChannels
  **/
  @JsonProperty("ServicingAccessChannels")
  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct2 servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct2 addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

 /**
   * URL provided by the financial institution which redirects to the PCA T&amp;Cs on an external website
   * @return tcsAndCsURL
  **/
  @JsonProperty("TcsAndCsURL")
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }

  public CoreProduct2 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreProduct2 {\n");
    
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productURL: ").append(toIndentedString(productURL)).append("\n");
    sb.append("    salesAccessChannels: ").append(toIndentedString(salesAccessChannels)).append("\n");
    sb.append("    servicingAccessChannels: ").append(toIndentedString(servicingAccessChannels)).append("\n");
    sb.append("    tcsAndCsURL: ").append(toIndentedString(tcsAndCsURL)).append("\n");
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

