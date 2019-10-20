
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tier Band Details
 * 
 * <p>Java class for TierBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankInterestRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankInterestRateType" type="{http://laegler.com/openbanking/soap/model}BankInterestRateType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherApplicationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherBankInterestType" type="{http://laegler.com/openbanking/soap/model}OtherBankInterestType" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierBand", propOrder = {
    "aer",
    "bankInterestRate",
    "bankInterestRateType",
    "notes",
    "otherApplicationFrequency",
    "otherBankInterestType",
    "otherCalculationFrequency"
})
public class TierBand {

    @XmlElement(name = "AER", required = true)
    protected String aer;
    @XmlElement(name = "BankInterestRate")
    protected String bankInterestRate;
    @XmlElement(name = "BankInterestRateType")
    @XmlSchemaType(name = "string")
    protected BankInterestRateType bankInterestRateType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency otherApplicationFrequency;
    @XmlElement(name = "OtherBankInterestType")
    protected OtherBankInterestType otherBankInterestType;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency otherCalculationFrequency;

    /**
     * Gets the value of the aer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAER() {
        return aer;
    }

    /**
     * Sets the value of the aer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAER(String value) {
        this.aer = value;
    }

    /**
     * Gets the value of the bankInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    /**
     * Sets the value of the bankInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankInterestRate(String value) {
        this.bankInterestRate = value;
    }

    /**
     * Gets the value of the bankInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link BankInterestRateType }
     *     
     */
    public BankInterestRateType getBankInterestRateType() {
        return bankInterestRateType;
    }

    /**
     * Sets the value of the bankInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInterestRateType }
     *     
     */
    public void setBankInterestRateType(BankInterestRateType value) {
        this.bankInterestRateType = value;
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
     * Gets the value of the otherApplicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherApplicationFrequency }
     *     
     */
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherApplicationFrequency }
     *     
     */
    public void setOtherApplicationFrequency(OtherApplicationFrequency value) {
        this.otherApplicationFrequency = value;
    }

    /**
     * Gets the value of the otherBankInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherBankInterestType }
     *     
     */
    public OtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    /**
     * Sets the value of the otherBankInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherBankInterestType }
     *     
     */
    public void setOtherBankInterestType(OtherBankInterestType value) {
        this.otherBankInterestType = value;
    }

    /**
     * Gets the value of the otherCalculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCalculationFrequency }
     *     
     */
    public void setOtherCalculationFrequency(OtherCalculationFrequency value) {
        this.otherCalculationFrequency = value;
    }

}
