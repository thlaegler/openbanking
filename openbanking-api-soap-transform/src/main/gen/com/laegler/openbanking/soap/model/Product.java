
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product details associated with the Account
 * 
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCA" type="{http://laegler.com/openbanking/soap/model}BCA1" minOccurs="0"/&gt;
 *         &lt;element name="MarketingStateId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherProductType" type="{http://laegler.com/openbanking/soap/model}OtherProductType" minOccurs="0"/&gt;
 *         &lt;element name="PCA" type="{http://laegler.com/openbanking/soap/model}PCA" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductType" type="{http://laegler.com/openbanking/soap/model}ProductType"/&gt;
 *         &lt;element name="SecondaryProductId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "accountId",
    "bca",
    "marketingStateId",
    "otherProductType",
    "pca",
    "productId",
    "productName",
    "productType",
    "secondaryProductId"
})
public class Product {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "BCA")
    protected BCA1 bca;
    @XmlElement(name = "MarketingStateId")
    protected String marketingStateId;
    @XmlElement(name = "OtherProductType")
    protected OtherProductType otherProductType;
    @XmlElement(name = "PCA")
    protected PCA pca;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductType", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType productType;
    @XmlElement(name = "SecondaryProductId")
    protected String secondaryProductId;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the bca property.
     * 
     * @return
     *     possible object is
     *     {@link BCA1 }
     *     
     */
    public BCA1 getBCA() {
        return bca;
    }

    /**
     * Sets the value of the bca property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCA1 }
     *     
     */
    public void setBCA(BCA1 value) {
        this.bca = value;
    }

    /**
     * Gets the value of the marketingStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingStateId() {
        return marketingStateId;
    }

    /**
     * Sets the value of the marketingStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingStateId(String value) {
        this.marketingStateId = value;
    }

    /**
     * Gets the value of the otherProductType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherProductType }
     *     
     */
    public OtherProductType getOtherProductType() {
        return otherProductType;
    }

    /**
     * Sets the value of the otherProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherProductType }
     *     
     */
    public void setOtherProductType(OtherProductType value) {
        this.otherProductType = value;
    }

    /**
     * Gets the value of the pca property.
     * 
     * @return
     *     possible object is
     *     {@link PCA }
     *     
     */
    public PCA getPCA() {
        return pca;
    }

    /**
     * Sets the value of the pca property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCA }
     *     
     */
    public void setPCA(PCA value) {
        this.pca = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the secondaryProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryProductId() {
        return secondaryProductId;
    }

    /**
     * Sets the value of the secondaryProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryProductId(String value) {
        this.secondaryProductId = value;
    }

}
