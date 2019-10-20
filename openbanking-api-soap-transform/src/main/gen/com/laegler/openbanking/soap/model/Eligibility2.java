
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eligibility details for this product i.e. the criteria that an accountholder has to meet in order to be eligible for the PCA product.
 * 
 * <p>Java class for Eligibility2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eligibility2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgeEligibility" type="{http://laegler.com/openbanking/soap/model}AgeEligibility2" minOccurs="0"/&gt;
 *         &lt;element name="CreditCheck" type="{http://laegler.com/openbanking/soap/model}CreditCheck" minOccurs="0"/&gt;
 *         &lt;element name="IDVerificationCheck" type="{http://laegler.com/openbanking/soap/model}IDVerificationCheck" minOccurs="0"/&gt;
 *         &lt;element name="OtherEligibility" type="{http://laegler.com/openbanking/soap/model}OtherEligibility2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResidencyEligibility" type="{http://laegler.com/openbanking/soap/model}ResidencyEligibility2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility2", propOrder = {
    "ageEligibility",
    "creditCheck",
    "idVerificationCheck",
    "otherEligibility",
    "residencyEligibility"
})
public class Eligibility2 {

    @XmlElement(name = "AgeEligibility")
    protected AgeEligibility2 ageEligibility;
    @XmlElement(name = "CreditCheck")
    protected CreditCheck creditCheck;
    @XmlElement(name = "IDVerificationCheck")
    protected IDVerificationCheck idVerificationCheck;
    @XmlElement(name = "OtherEligibility")
    protected List<OtherEligibility2> otherEligibility;
    @XmlElement(name = "ResidencyEligibility")
    protected List<ResidencyEligibility2> residencyEligibility;

    /**
     * Gets the value of the ageEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link AgeEligibility2 }
     *     
     */
    public AgeEligibility2 getAgeEligibility() {
        return ageEligibility;
    }

    /**
     * Sets the value of the ageEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeEligibility2 }
     *     
     */
    public void setAgeEligibility(AgeEligibility2 value) {
        this.ageEligibility = value;
    }

    /**
     * Gets the value of the creditCheck property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCheck }
     *     
     */
    public CreditCheck getCreditCheck() {
        return creditCheck;
    }

    /**
     * Sets the value of the creditCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCheck }
     *     
     */
    public void setCreditCheck(CreditCheck value) {
        this.creditCheck = value;
    }

    /**
     * Gets the value of the idVerificationCheck property.
     * 
     * @return
     *     possible object is
     *     {@link IDVerificationCheck }
     *     
     */
    public IDVerificationCheck getIDVerificationCheck() {
        return idVerificationCheck;
    }

    /**
     * Sets the value of the idVerificationCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDVerificationCheck }
     *     
     */
    public void setIDVerificationCheck(IDVerificationCheck value) {
        this.idVerificationCheck = value;
    }

    /**
     * Gets the value of the otherEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherEligibility2 }
     * 
     * 
     */
    public List<OtherEligibility2> getOtherEligibility() {
        if (otherEligibility == null) {
            otherEligibility = new ArrayList<OtherEligibility2>();
        }
        return this.otherEligibility;
    }

    /**
     * Gets the value of the residencyEligibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residencyEligibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidencyEligibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidencyEligibility2 }
     * 
     * 
     */
    public List<ResidencyEligibility2> getResidencyEligibility() {
        if (residencyEligibility == null) {
            residencyEligibility = new ArrayList<ResidencyEligibility2>();
        }
        return this.residencyEligibility;
    }

}
