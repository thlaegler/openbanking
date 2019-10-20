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
  * BCA core product details.
 **/
@ApiModel(description="BCA core product details.")
public class CoreProduct  {
  
  @ApiModelProperty(value = "Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge.")
 /**
   * Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge.
  **/
  private String monthlyCharge = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")
 /**
   * Optional additional notes to supplement the Core product details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "The description of the BCA product used for marketing purposes from a customer perspective.")
 /**
   * The description of the BCA product used for marketing purposes from a customer perspective.
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

  @ApiModelProperty(value = "Channels via which a customer can open a BCA.")
 /**
   * Channels via which a customer can open a BCA.
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

  @ApiModelProperty(value = "Channels via which customers can access BCA services.")
 /**
   * Channels via which customers can access BCA services.
  **/
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = null;

  @ApiModelProperty(value = "URL provided by the financial institution which redirects to the BCA T&Cs on an external website")
 /**
   * URL provided by the financial institution which redirects to the BCA T&Cs on an external website
  **/
  private String tcsAndCsURL = null;
 /**
   * Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge.
   * @return monthlyCharge
  **/
  @JsonProperty("MonthlyCharge")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getMonthlyCharge() {
    return monthlyCharge;
  }

  public void setMonthlyCharge(String monthlyCharge) {
    this.monthlyCharge = monthlyCharge;
  }

  public CoreProduct monthlyCharge(String monthlyCharge) {
    this.monthlyCharge = monthlyCharge;
    return this;
  }

 /**
   * Optional additional notes to supplement the Core product details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * The description of the BCA product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @JsonProperty("ProductDescription")
 @Size(min=1,max=2000)  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @JsonProperty("ProductURL")
 @Size(min=1,max=500)  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public CoreProduct productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

 /**
   * Channels via which a customer can open a BCA.
   * @return salesAccessChannels
  **/
  @JsonProperty("SalesAccessChannels")
  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

 /**
   * Channels via which customers can access BCA services.
   * @return servicingAccessChannels
  **/
  @JsonProperty("ServicingAccessChannels")
  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

 /**
   * URL provided by the financial institution which redirects to the BCA T&amp;Cs on an external website
   * @return tcsAndCsURL
  **/
  @JsonProperty("TcsAndCsURL")
 @Size(min=1,max=500)  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }

  public CoreProduct tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreProduct {\n");
    
    sb.append("    monthlyCharge: ").append(toIndentedString(monthlyCharge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

