
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditInterest" type="{http://laegler.com/openbanking/soap/model}CreditInterest3" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharges3" minOccurs="0"/&gt;
 *         &lt;element name="Overdraft" type="{http://laegler.com/openbanking/soap/model}Overdraft3" minOccurs="0"/&gt;
 *         &lt;element name="ProductDetails" type="{http://laegler.com/openbanking/soap/model}ProductDetails2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCA", propOrder = {
    "creditInterest",
    "otherFeesCharges",
    "overdraft",
    "productDetails"
})
public class PCA {

    @XmlElement(name = "CreditInterest")
    protected CreditInterest3 creditInterest;
    @XmlElement(name = "OtherFeesCharges")
    protected OtherFeesCharges3 otherFeesCharges;
    @XmlElement(name = "Overdraft")
    protected Overdraft3 overdraft;
    @XmlElement(name = "ProductDetails")
    protected ProductDetails2 productDetails;

    /**
     * Gets the value of the creditInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditInterest3 }
     *     
     */
    public CreditInterest3 getCreditInterest() {
        return creditInterest;
    }

    /**
     * Sets the value of the creditInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditInterest3 }
     *     
     */
    public void setCreditInterest(CreditInterest3 value) {
        this.creditInterest = value;
    }

    /**
     * Gets the value of the otherFeesCharges property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeesCharges3 }
     *     
     */
    public OtherFeesCharges3 getOtherFeesCharges() {
        return otherFeesCharges;
    }

    /**
     * Sets the value of the otherFeesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeesCharges3 }
     *     
     */
    public void setOtherFeesCharges(OtherFeesCharges3 value) {
        this.otherFeesCharges = value;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Overdraft3 }
     *     
     */
    public Overdraft3 getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overdraft3 }
     *     
     */
    public void setOverdraft(Overdraft3 value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetails2 }
     *     
     */
    public ProductDetails2 getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetails2 }
     *     
     */
    public void setProductDetails(ProductDetails2 value) {
        this.productDetails = value;
    }

}
