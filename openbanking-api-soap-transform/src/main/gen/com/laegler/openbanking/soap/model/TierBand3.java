
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
 * <p>Java class for TierBand3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBand3"&gt;
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
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency12"/&gt;
 *         &lt;element name="BankInterestRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankInterestRateType" type="{http://laegler.com/openbanking/soap/model}BankInterestRateType3" minOccurs="0"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency12" minOccurs="0"/&gt;
 *         &lt;element name="DepositInterestAppliedCoverage" type="{http://laegler.com/openbanking/soap/model}DepositInterestAppliedCoverage2" minOccurs="0"/&gt;
 *         &lt;element name="FixedVariableInterestRateType" type="{http://laegler.com/openbanking/soap/model}FixedVariableInterestRateType"/&gt;
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
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherApplicationFrequency1" minOccurs="0"/&gt;
 *         &lt;element name="OtherBankInterestType" type="{http://laegler.com/openbanking/soap/model}OtherBankInterestType" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency1" minOccurs="0"/&gt;
 *         &lt;element name="TierValueMaximum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMinimum"&gt;
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
@XmlType(name = "TierBand3", propOrder = {
    "aer",
    "applicationFrequency",
    "bankInterestRate",
    "bankInterestRateType",
    "calculationFrequency",
    "depositInterestAppliedCoverage",
    "fixedVariableInterestRateType",
    "identification",
    "notes",
    "otherApplicationFrequency",
    "otherBankInterestType",
    "otherCalculationFrequency",
    "tierValueMaximum",
    "tierValueMinimum"
})
public class TierBand3 {

    @XmlElement(name = "AER", required = true)
    protected String aer;
    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency12 applicationFrequency;
    @XmlElement(name = "BankInterestRate")
    protected String bankInterestRate;
    @XmlElement(name = "BankInterestRateType")
    @XmlSchemaType(name = "string")
    protected BankInterestRateType3 bankInterestRateType;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected CalculationFrequency12 calculationFrequency;
    @XmlElement(name = "DepositInterestAppliedCoverage")
    @XmlSchemaType(name = "string")
    protected DepositInterestAppliedCoverage2 depositInterestAppliedCoverage;
    @XmlElement(name = "FixedVariableInterestRateType", required = true)
    @XmlSchemaType(name = "string")
    protected FixedVariableInterestRateType fixedVariableInterestRateType;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency1 otherApplicationFrequency;
    @XmlElement(name = "OtherBankInterestType")
    protected OtherBankInterestType otherBankInterestType;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency1 otherCalculationFrequency;
    @XmlElement(name = "TierValueMaximum")
    protected String tierValueMaximum;
    @XmlElement(name = "TierValueMinimum", required = true)
    protected String tierValueMinimum;

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
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFrequency12 }
     *     
     */
    public ApplicationFrequency12 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency12 }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency12 value) {
        this.applicationFrequency = value;
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
     *     {@link BankInterestRateType3 }
     *     
     */
    public BankInterestRateType3 getBankInterestRateType() {
        return bankInterestRateType;
    }

    /**
     * Sets the value of the bankInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInterestRateType3 }
     *     
     */
    public void setBankInterestRateType(BankInterestRateType3 value) {
        this.bankInterestRateType = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency12 }
     *     
     */
    public CalculationFrequency12 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency12 }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency12 value) {
        this.calculationFrequency = value;
    }

    /**
     * Gets the value of the depositInterestAppliedCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link DepositInterestAppliedCoverage2 }
     *     
     */
    public DepositInterestAppliedCoverage2 getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    /**
     * Sets the value of the depositInterestAppliedCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositInterestAppliedCoverage2 }
     *     
     */
    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverage2 value) {
        this.depositInterestAppliedCoverage = value;
    }

    /**
     * Gets the value of the fixedVariableInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link FixedVariableInterestRateType }
     *     
     */
    public FixedVariableInterestRateType getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    /**
     * Sets the value of the fixedVariableInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedVariableInterestRateType }
     *     
     */
    public void setFixedVariableInterestRateType(FixedVariableInterestRateType value) {
        this.fixedVariableInterestRateType = value;
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
     * Gets the value of the otherApplicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherApplicationFrequency1 }
     *     
     */
    public OtherApplicationFrequency1 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherApplicationFrequency1 }
     *     
     */
    public void setOtherApplicationFrequency(OtherApplicationFrequency1 value) {
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
     *     {@link OtherCalculationFrequency1 }
     *     
     */
    public OtherCalculationFrequency1 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCalculationFrequency1 }
     *     
     */
    public void setOtherCalculationFrequency(OtherCalculationFrequency1 value) {
        this.otherCalculationFrequency = value;
    }

    /**
     * Gets the value of the tierValueMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    /**
     * Sets the value of the tierValueMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierValueMaximum(String value) {
        this.tierValueMaximum = value;
    }

    /**
     * Gets the value of the tierValueMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    /**
     * Sets the value of the tierValueMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierValueMinimum(String value) {
        this.tierValueMinimum = value;
    }

}
