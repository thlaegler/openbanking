
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Other product type details associated with the account.
 * 
 * <p>Java class for OtherProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditInterest" type="{http://laegler.com/openbanking/soap/model}CreditInterest2" minOccurs="0"/&gt;
 *         &lt;element name="Description"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanInterest" type="{http://laegler.com/openbanking/soap/model}LoanInterest" minOccurs="0"/&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherFeesCharges" type="{http://laegler.com/openbanking/soap/model}OtherFeesCharges2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Overdraft" type="{http://laegler.com/openbanking/soap/model}Overdraft2" minOccurs="0"/&gt;
 *         &lt;element name="ProductDetails" type="{http://laegler.com/openbanking/soap/model}ProductDetails1" minOccurs="0"/&gt;
 *         &lt;element name="Repayment" type="{http://laegler.com/openbanking/soap/model}Repayment1" minOccurs="0"/&gt;
 *         &lt;element name="SupplementaryData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherProductType", propOrder = {
    "creditInterest",
    "description",
    "loanInterest",
    "name",
    "otherFeesCharges",
    "overdraft",
    "productDetails",
    "repayment",
    "supplementaryData"
})
public class OtherProductType {

    @XmlElement(name = "CreditInterest")
    protected CreditInterest2 creditInterest;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "LoanInterest")
    protected LoanInterest loanInterest;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OtherFeesCharges")
    protected List<OtherFeesCharges2> otherFeesCharges;
    @XmlElement(name = "Overdraft")
    protected Overdraft2 overdraft;
    @XmlElement(name = "ProductDetails")
    protected ProductDetails1 productDetails;
    @XmlElement(name = "Repayment")
    protected Repayment1 repayment;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the creditInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CreditInterest2 }
     *     
     */
    public CreditInterest2 getCreditInterest() {
        return creditInterest;
    }

    /**
     * Sets the value of the creditInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditInterest2 }
     *     
     */
    public void setCreditInterest(CreditInterest2 value) {
        this.creditInterest = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the loanInterest property.
     * 
     * @return
     *     possible object is
     *     {@link LoanInterest }
     *     
     */
    public LoanInterest getLoanInterest() {
        return loanInterest;
    }

    /**
     * Sets the value of the loanInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanInterest }
     *     
     */
    public void setLoanInterest(LoanInterest value) {
        this.loanInterest = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * {@link OtherFeesCharges2 }
     * 
     * 
     */
    public List<OtherFeesCharges2> getOtherFeesCharges() {
        if (otherFeesCharges == null) {
            otherFeesCharges = new ArrayList<OtherFeesCharges2>();
        }
        return this.otherFeesCharges;
    }

    /**
     * Gets the value of the overdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Overdraft2 }
     *     
     */
    public Overdraft2 getOverdraft() {
        return overdraft;
    }

    /**
     * Sets the value of the overdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overdraft2 }
     *     
     */
    public void setOverdraft(Overdraft2 value) {
        this.overdraft = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetails1 }
     *     
     */
    public ProductDetails1 getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetails1 }
     *     
     */
    public void setProductDetails(ProductDetails1 value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the repayment property.
     * 
     * @return
     *     possible object is
     *     {@link Repayment1 }
     *     
     */
    public Repayment1 getRepayment() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repayment1 }
     *     
     */
    public void setRepayment(Repayment1 value) {
        this.repayment = value;
    }

    /**
     * Gets the value of the supplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * Sets the value of the supplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplementaryData(Object value) {
        this.supplementaryData = value;
    }

}
