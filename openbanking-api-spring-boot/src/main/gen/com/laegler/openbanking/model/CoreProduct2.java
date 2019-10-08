package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Core feature of the PCA product which can be associated to a particular Marketing State
 */
@ApiModel(description = "Core feature of the PCA product which can be associated to a particular Marketing State")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CoreProduct2   {
  @JsonProperty("MonthlyMaximumCharge")
  private String monthlyMaximumCharge = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  @JsonProperty("ProductURL")
  private String productURL = null;

  /**
   * Channels through which a customer can open an account.
   */
  public enum SalesAccessChannelsEnum {
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    ONLINE("Online"),
    
    RELATIONSHIPMANAGER("RelationshipManager");

    private String value;

    SalesAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SalesAccessChannelsEnum fromValue(String text) {
      for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SalesAccessChannels")
  @Valid
  private List<SalesAccessChannelsEnum> salesAccessChannels = null;

  /**
   * Methods by which a customer can access the services associated to the PCA product
   */
  public enum ServicingAccessChannelsEnum {
    ATM("ATM"),
    
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    MOBILEBANKINGAPP("MobileBankingApp"),
    
    ONLINE("Online"),
    
    POSTOFFICE("PostOffice"),
    
    RELATIONSHIPMANAGER("RelationshipManager"),
    
    TEXT("Text");

    private String value;

    ServicingAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServicingAccessChannelsEnum fromValue(String text) {
      for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ServicingAccessChannels")
  @Valid
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = null;

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

  public CoreProduct2 monthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
    return this;
  }

  /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public CoreProduct2 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * The description of the PCA product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @ApiModelProperty(value = "The description of the PCA product used for marketing purposes from a customer perspective.")

@Size(min=1,max=2000) 
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct2 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

  /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @ApiModelProperty(value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")

@Size(min=1,max=500) 
  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public CoreProduct2 salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct2 addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    if (this.salesAccessChannels == null) {
      this.salesAccessChannels = new ArrayList<>();
    }
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

  /**
   * Channels through which a customer can open an account.
   * @return salesAccessChannels
  **/
  @ApiModelProperty(value = "Channels through which a customer can open an account.")


  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct2 servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct2 addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    if (this.servicingAccessChannels == null) {
      this.servicingAccessChannels = new ArrayList<>();
    }
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

  /**
   * Methods by which a customer can access the services associated to the PCA product
   * @return servicingAccessChannels
  **/
  @ApiModelProperty(value = "Methods by which a customer can access the services associated to the PCA product")


  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct2 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }

  /**
   * URL provided by the financial institution which redirects to the PCA T&Cs on an external website
   * @return tcsAndCsURL
  **/
  @ApiModelProperty(value = "URL provided by the financial institution which redirects to the PCA T&Cs on an external website")

@Size(min=1,max=500) 
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreProduct2 coreProduct2 = (CoreProduct2) o;
    return Objects.equals(this.monthlyMaximumCharge, coreProduct2.monthlyMaximumCharge) &&
        Objects.equals(this.productDescription, coreProduct2.productDescription) &&
        Objects.equals(this.productURL, coreProduct2.productURL) &&
        Objects.equals(this.salesAccessChannels, coreProduct2.salesAccessChannels) &&
        Objects.equals(this.servicingAccessChannels, coreProduct2.servicingAccessChannels) &&
        Objects.equals(this.tcsAndCsURL, coreProduct2.tcsAndCsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyMaximumCharge, productDescription, productURL, salesAccessChannels, servicingAccessChannels, tcsAndCsURL);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

