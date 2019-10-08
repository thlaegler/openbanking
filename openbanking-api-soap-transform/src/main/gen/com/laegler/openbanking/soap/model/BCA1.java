
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCA1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCA1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditInterest" type="{http://laegler.com/openbanking/soap/model}CreditInterest1" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharges1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Overdraft" type="{http://laegler.com/openbanking/soap/model}Overdraft1" minOccurs="0"/&gt;
 *         &lt;element name="ProductDetails" type="{http://laegler.com/openbanking/soap/model}ProductDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCA1", propOrder = {
    "creditInterest",
    "otherFeesCharges",
    "overdraft",
    "productDetails"
})
public class BCA1 {

    @XmlElement(name = "CreditInterest")
    protected CreditInterest1 creditInterest;
    @XmlElement(name = "OtherFeesCharges")
    protected List<OtherFeesCharges1> otherFeesCharges;
    @XmlElement(name = "Overdraft")
    protected Overdraft1 overdraft;
    @XmlElement(name = "ProductDetails")
    protected ProductDetails productDetails;

    /**
     * Gets the value of the creditInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditInterest1 }
     *     
     */
    public CreditInterest1 getCreditInterest() {
        return creditInterest;
    }

    /**
     * Sets the value of the creditInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditInterest1 }
     *     
     */
    public void setCreditInterest(CreditInterest1 value) {
        this.creditInterest = value;
    }

    /**
     * Gets the value of the otherFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherFeesCharges1 }
     * 
     * 
     */
    public List<OtherFeesCharges1> getOtherFeesCharges() {
        if (otherFeesCharges == null) {
            otherFeesCharges = new ArrayList<OtherFeesCharges1>();
        }
        return this.otherFeesCharges;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Overdraft1 }
     *     
     */
    public Overdraft1 getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overdraft1 }
     *     
     */
    public void setOverdraft(Overdraft1 value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetails }
     *     
     */
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetails }
     *     
     */
    public void setProductDetails(ProductDetails value) {
        this.productDetails = value;
    }

}
