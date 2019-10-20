
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
 * <p>Java class for TierBand2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierBand2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency11"/&gt;
 *         &lt;element name="BankInterestRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankInterestRateType" type="{http://laegler.com/openbanking/soap/model}BankInterestRateType2" minOccurs="0"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency11" minOccurs="0"/&gt;
 *         &lt;element name="DepositInterestAppliedCoverage" type="{http://laegler.com/openbanking/soap/model}DepositInterestAppliedCoverage1" minOccurs="0"/&gt;
 *         &lt;element name="FixedVariableInterestRateType" type="{http://laegler.com/openbanking/soap/model}OB_InterestFixedVariableType1Code"/&gt;
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
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_1" minOccurs="0"/&gt;
 *         &lt;element name="OtherBankInterestType" type="{http://laegler.com/openbanking/soap/model}OtherBankInterestType2" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_2" minOccurs="0"/&gt;
 *         &lt;element name="TierValueMaximum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMinimum"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
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
@XmlType(name = "TierBand2", propOrder = {
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
public class TierBand2 {

    @XmlElement(name = "AER", required = true)
    protected String aer;
    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency11 applicationFrequency;
    @XmlElement(name = "BankInterestRate")
    protected String bankInterestRate;
    @XmlElement(name = "BankInterestRateType")
    @XmlSchemaType(name = "string")
    protected BankInterestRateType2 bankInterestRateType;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected CalculationFrequency11 calculationFrequency;
    @XmlElement(name = "DepositInterestAppliedCoverage")
    @XmlSchemaType(name = "string")
    protected DepositInterestAppliedCoverage1 depositInterestAppliedCoverage;
    @XmlElement(name = "FixedVariableInterestRateType", required = true)
    @XmlSchemaType(name = "string")
    protected OBInterestFixedVariableType1Code fixedVariableInterestRateType;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OBOtherCodeType11 otherApplicationFrequency;
    @XmlElement(name = "OtherBankInterestType")
    protected OtherBankInterestType2 otherBankInterestType;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OBOtherCodeType12 otherCalculationFrequency;
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
     *     {@link ApplicationFrequency11 }
     *     
     */
    public ApplicationFrequency11 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency11 }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency11 value) {
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
     *     {@link BankInterestRateType2 }
     *     
     */
    public BankInterestRateType2 getBankInterestRateType() {
        return bankInterestRateType;
    }

    /**
     * Sets the value of the bankInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInterestRateType2 }
     *     
     */
    public void setBankInterestRateType(BankInterestRateType2 value) {
        this.bankInterestRateType = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency11 }
     *     
     */
    public CalculationFrequency11 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency11 }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency11 value) {
        this.calculationFrequency = value;
    }

    /**
     * Gets the value of the depositInterestAppliedCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link DepositInterestAppliedCoverage1 }
     *     
     */
    public DepositInterestAppliedCoverage1 getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    /**
     * Sets the value of the depositInterestAppliedCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositInterestAppliedCoverage1 }
     *     
     */
    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverage1 value) {
        this.depositInterestAppliedCoverage = value;
    }

    /**
     * Gets the value of the fixedVariableInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OBInterestFixedVariableType1Code }
     *     
     */
    public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    /**
     * Sets the value of the fixedVariableInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBInterestFixedVariableType1Code }
     *     
     */
    public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code value) {
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
     *     {@link OBOtherCodeType11 }
     *     
     */
    public OBOtherCodeType11 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    /**
     * Sets the value of the otherApplicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType11 }
     *     
     */
    public void setOtherApplicationFrequency(OBOtherCodeType11 value) {
        this.otherApplicationFrequency = value;
    }

    /**
     * Gets the value of the otherBankInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherBankInterestType2 }
     *     
     */
    public OtherBankInterestType2 getOtherBankInterestType() {
        return otherBankInterestType;
    }

    /**
     * Sets the value of the otherBankInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherBankInterestType2 }
     *     
     */
    public void setOtherBankInterestType(OtherBankInterestType2 value) {
        this.otherBankInterestType = value;
    }

    /**
     * Gets the value of the otherCalculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType12 }
     *     
     */
    public OBOtherCodeType12 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    /**
     * Sets the value of the otherCalculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType12 }
     *     
     */
    public void setOtherCalculationFrequency(OBOtherCodeType12 value) {
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
