package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BCA;
import com.laegler.openbanking.model.OBReadProduct2DataOtherProductType;
import com.laegler.openbanking.model.PCA;
import io.swagger.annotations.ApiModel;
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
  * Product details associated with the Account
 **/
@ApiModel(description="Product details associated with the Account")
public class OBReadProduct2DataProduct  {
  
  @ApiModelProperty(required = true, value = "Account Identification of the customer for Product Details")
 /**
   * Account Identification of the customer for Product Details
  **/
  private String accountId = null;

  @ApiModelProperty(value = "")
  @Valid
  private BCA BCA = null;

  @ApiModelProperty(value = "Unique and unambiguous identification of a  Product Marketing State.")
 /**
   * Unique and unambiguous identification of a  Product Marketing State.
  **/
  private String marketingStateId = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBReadProduct2DataOtherProductType otherProductType = null;

  @ApiModelProperty(value = "")
  @Valid
  private PCA PCA = null;

  @ApiModelProperty(value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
  **/
  private String productId = null;

  @ApiModelProperty(value = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
  **/
  private String productName = null;


@XmlType(name="ProductTypeEnum")
@XmlEnum(String.class)
public enum ProductTypeEnum {

@XmlEnumValue("BusinessCurrentAccount") BUSINESSCURRENTACCOUNT(String.valueOf("BusinessCurrentAccount")), @XmlEnumValue("CommercialCreditCard") COMMERCIALCREDITCARD(String.valueOf("CommercialCreditCard")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PersonalCurrentAccount") PERSONALCURRENTACCOUNT(String.valueOf("PersonalCurrentAccount")), @XmlEnumValue("SMELoan") SMELOAN(String.valueOf("SMELoan"));


    private String value;

    ProductTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String v) {
        for (ProductTypeEnum b : ProductTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Product type : Personal Current Account, Business Current Account")
 /**
   * Product type : Personal Current Account, Business Current Account
  **/
  private ProductTypeEnum productType = null;

  @ApiModelProperty(value = "Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.")
 /**
   * Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.
  **/
  private String secondaryProductId = null;
 /**
   * Account Identification of the customer for Product Details
   * @return accountId
  **/
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadProduct2DataProduct accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get BCA
   * @return BCA
  **/
  @JsonProperty("BCA")
  public BCA getBCA() {
    return BCA;
  }

  public void setBCA(BCA BCA) {
    this.BCA = BCA;
  }

  public OBReadProduct2DataProduct BCA(BCA BCA) {
    this.BCA = BCA;
    return this;
  }

 /**
   * Unique and unambiguous identification of a  Product Marketing State.
   * @return marketingStateId
  **/
  @JsonProperty("MarketingStateId")
 @Size(min=1,max=35)  public String getMarketingStateId() {
    return marketingStateId;
  }

  public void setMarketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBReadProduct2DataProduct marketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

 /**
   * Get otherProductType
   * @return otherProductType
  **/
  @JsonProperty("OtherProductType")
  public OBReadProduct2DataOtherProductType getOtherProductType() {
    return otherProductType;
  }

  public void setOtherProductType(OBReadProduct2DataOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBReadProduct2DataProduct otherProductType(OBReadProduct2DataOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

 /**
   * Get PCA
   * @return PCA
  **/
  @JsonProperty("PCA")
  public PCA getPCA() {
    return PCA;
  }

  public void setPCA(PCA PCA) {
    this.PCA = PCA;
  }

  public OBReadProduct2DataProduct PCA(PCA PCA) {
    this.PCA = PCA;
    return this;
  }

 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return productId
  **/
  @JsonProperty("ProductId")
 @Size(min=1,max=40)  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OBReadProduct2DataProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

 /**
   * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  **/
  @JsonProperty("ProductName")
 @Size(min=1,max=350)  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBReadProduct2DataProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

 /**
   * Product type : Personal Current Account, Business Current Account
   * @return productType
  **/
  @JsonProperty("ProductType")
  @NotNull
  public String getProductType() {
    if (productType == null) {
      return null;
    }
    return productType.value();
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public OBReadProduct2DataProduct productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

 /**
   * Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.
   * @return secondaryProductId
  **/
  @JsonProperty("SecondaryProductId")
 @Size(min=1,max=70)  public String getSecondaryProductId() {
    return secondaryProductId;
  }

  public void setSecondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBReadProduct2DataProduct secondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProduct {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
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

