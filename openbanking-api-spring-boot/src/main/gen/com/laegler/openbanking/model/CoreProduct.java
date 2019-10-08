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
 * BCA core product details.
 */
@ApiModel(description = "BCA core product details.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CoreProduct   {
  @JsonProperty("MonthlyCharge")
  private String monthlyCharge = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  @JsonProperty("ProductURL")
  private String productURL = null;

  /**
   * Channels via which a customer can open a BCA.
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
   * Channels via which customers can access BCA services.
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

  public CoreProduct monthlyCharge(String monthlyCharge) {
    this.monthlyCharge = monthlyCharge;
    return this;
  }

  /**
   * Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge.
   * @return monthlyCharge
  **/
  @ApiModelProperty(value = "Any fees which can be included in a MonthlyCharge. A new field IncludedInMonthlyChargeIndicator in OtherFeeCharges section indicates whether the fees can be grouped in MonthlyCharge.")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMonthlyCharge() {
    return monthlyCharge;
  }

  public void setMonthlyCharge(String monthlyCharge) {
    this.monthlyCharge = monthlyCharge;
  }

  public CoreProduct notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Core product details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * The description of the BCA product used for marketing purposes from a customer perspective.
   * @return productDescription
  **/
  @ApiModelProperty(value = "The description of the BCA product used for marketing purposes from a customer perspective.")

@Size(min=1,max=2000) 
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct productURL(String productURL) {
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

  public CoreProduct salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    if (this.salesAccessChannels == null) {
      this.salesAccessChannels = new ArrayList<>();
    }
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

  /**
   * Channels via which a customer can open a BCA.
   * @return salesAccessChannels
  **/
  @ApiModelProperty(value = "Channels via which a customer can open a BCA.")


  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    if (this.servicingAccessChannels == null) {
      this.servicingAccessChannels = new ArrayList<>();
    }
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

  /**
   * Channels via which customers can access BCA services.
   * @return servicingAccessChannels
  **/
  @ApiModelProperty(value = "Channels via which customers can access BCA services.")


  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }

  /**
   * URL provided by the financial institution which redirects to the BCA T&Cs on an external website
   * @return tcsAndCsURL
  **/
  @ApiModelProperty(value = "URL provided by the financial institution which redirects to the BCA T&Cs on an external website")

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
    CoreProduct coreProduct = (CoreProduct) o;
    return Objects.equals(this.monthlyCharge, coreProduct.monthlyCharge) &&
        Objects.equals(this.notes, coreProduct.notes) &&
        Objects.equals(this.productDescription, coreProduct.productDescription) &&
        Objects.equals(this.productURL, coreProduct.productURL) &&
        Objects.equals(this.salesAccessChannels, coreProduct.salesAccessChannels) &&
        Objects.equals(this.servicingAccessChannels, coreProduct.servicingAccessChannels) &&
        Objects.equals(this.tcsAndCsURL, coreProduct.tcsAndCsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyCharge, notes, productDescription, productURL, salesAccessChannels, servicingAccessChannels, tcsAndCsURL);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

