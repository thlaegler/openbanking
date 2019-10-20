
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides overdraft details for a specific tier or band
 * 
 * <p>Java class for OverdraftTierBand3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftTierBand3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankGuaranteedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EAR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverdraftFeesCharges" type="{http://laegler.com/openbanking/soap/model}OverdraftFeesCharge7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftInterestChargingCoverage" type="{http://laegler.com/openbanking/soap/model}OverdraftInterestChargingCoverage3" minOccurs="0"/&gt;
 *         &lt;element name="TierValueMax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMin"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
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
@XmlType(name = "OverdraftTierBand3", propOrder = {
    "bankGuaranteedIndicator",
    "ear",
    "identification",
    "notes",
    "overdraftFeesCharges",
    "overdraftInterestChargingCoverage",
    "tierValueMax",
    "tierValueMin"
})
public class OverdraftTierBand3 {

    @XmlElement(name = "BankGuaranteedIndicator")
    protected Boolean bankGuaranteedIndicator;
    @XmlElement(name = "EAR")
    protected String ear;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OverdraftFeesCharges")
    protected List<OverdraftFeesCharge7> overdraftFeesCharges;
    @XmlElement(name = "OverdraftInterestChargingCoverage")
    @XmlSchemaType(name = "string")
    protected OverdraftInterestChargingCoverage3 overdraftInterestChargingCoverage;
    @XmlElement(name = "TierValueMax")
    protected String tierValueMax;
    @XmlElement(name = "TierValueMin", required = true)
    protected String tierValueMin;

    /**
     * Gets the value of the bankGuaranteedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankGuaranteedIndicator() {
        return bankGuaranteedIndicator;
    }

    /**
     * Sets the value of the bankGuaranteedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankGuaranteedIndicator(Boolean value) {
        this.bankGuaranteedIndicator = value;
    }

    /**
     * Gets the value of the ear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAR() {
        return ear;
    }

    /**
     * Sets the value of the ear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAR(String value) {
        this.ear = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the overdraftFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFeesCharge7 }
     * 
     * 
     */
    public List<OverdraftFeesCharge7> getOverdraftFeesCharges() {
        if (overdraftFeesCharges == null) {
            overdraftFeesCharges = new ArrayList<OverdraftFeesCharge7>();
        }
        return this.overdraftFeesCharges;
    }

    /**
     * Gets the value of the overdraftInterestChargingCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link OverdraftInterestChargingCoverage3 }
     *     
     */
    public OverdraftInterestChargingCoverage3 getOverdraftInterestChargingCoverage() {
        return overdraftInterestChargingCoverage;
    }

    /**
     * Sets the value of the overdraftInterestChargingCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdraftInterestChargingCoverage3 }
     *     
     */
    public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverage3 value) {
        this.overdraftInterestChargingCoverage = value;
    }

    /**
     * Gets the value of the tierValueMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierValueMax() {
        return tierValueMax;
    }

    /**
     * Sets the value of the tierValueMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierValueMax(String value) {
        this.tierValueMax = value;
    }

    /**
     * Gets the value of the tierValueMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierValueMin() {
        return tierValueMin;
    }

    /**
     * Sets the value of the tierValueMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierValueMin(String value) {
        this.tierValueMin = value;
    }

}
