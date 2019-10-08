
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
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
 * <p>Java class for LoanInterestTierBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanInterestTierBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FixedVariableInterestRateType" type="{http://laegler.com/openbanking/soap/model}OB_InterestFixedVariableType1Code"/&gt;
 *         &lt;element name="Identification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanInterestFeesCharges" type="{http://laegler.com/openbanking/soap/model}LoanInterestFeesCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoanProviderInterestRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LoanProviderInterestRateType" type="{http://laegler.com/openbanking/soap/model}LoanProviderInterestRateType" minOccurs="0"/&gt;
 *         &lt;element name="MaxTermPeriod" type="{http://laegler.com/openbanking/soap/model}MaxTermPeriod" minOccurs="0"/&gt;
 *         &lt;element name="MinTermPeriod" type="{http://laegler.com/openbanking/soap/model}MinTermPeriod"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherLoanProviderInterestRateType" type="{http://laegler.com/openbanking/soap/model}OtherLoanProviderInterestRateType" minOccurs="0"/&gt;
 *         &lt;element name="RepAPR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMaxTerm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMaximum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TierValueMinTerm"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
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
@XmlType(name = "LoanInterestTierBand", propOrder = {
    "fixedVariableInterestRateType",
    "identification",
    "loanInterestFeesCharges",
    "loanProviderInterestRate",
    "loanProviderInterestRateType",
    "maxTermPeriod",
    "minTermPeriod",
    "notes",
    "otherLoanProviderInterestRateType",
    "repAPR",
    "tierValueMaxTerm",
    "tierValueMaximum",
    "tierValueMinTerm",
    "tierValueMinimum"
})
public class LoanInterestTierBand {

    @XmlElement(name = "FixedVariableInterestRateType", required = true)
    @XmlSchemaType(name = "string")
    protected OBInterestFixedVariableType1Code fixedVariableInterestRateType;
    @XmlElement(name = "Identification")
    protected String identification;
    @XmlElement(name = "LoanInterestFeesCharges")
    protected List<LoanInterestFeesCharge> loanInterestFeesCharges;
    @XmlElement(name = "LoanProviderInterestRate")
    protected String loanProviderInterestRate;
    @XmlElement(name = "LoanProviderInterestRateType")
    @XmlSchemaType(name = "string")
    protected LoanProviderInterestRateType loanProviderInterestRateType;
    @XmlElement(name = "MaxTermPeriod")
    @XmlSchemaType(name = "string")
    protected MaxTermPeriod maxTermPeriod;
    @XmlElement(name = "MinTermPeriod", required = true)
    @XmlSchemaType(name = "string")
    protected MinTermPeriod minTermPeriod;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherLoanProviderInterestRateType")
    protected OtherLoanProviderInterestRateType otherLoanProviderInterestRateType;
    @XmlElement(name = "RepAPR", required = true)
    protected String repAPR;
    @XmlElement(name = "TierValueMaxTerm")
    protected BigInteger tierValueMaxTerm;
    @XmlElement(name = "TierValueMaximum")
    protected String tierValueMaximum;
    @XmlElement(name = "TierValueMinTerm", required = true)
    protected BigInteger tierValueMinTerm;
    @XmlElement(name = "TierValueMinimum", required = true)
    protected String tierValueMinimum;

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
     * Gets the value of the loanInterestFeesCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanInterestFeesCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanInterestFeesCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanInterestFeesCharge }
     * 
     * 
     */
    public List<LoanInterestFeesCharge> getLoanInterestFeesCharges() {
        if (loanInterestFeesCharges == null) {
            loanInterestFeesCharges = new ArrayList<LoanInterestFeesCharge>();
        }
        return this.loanInterestFeesCharges;
    }

    /**
     * Gets the value of the loanProviderInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProviderInterestRate() {
        return loanProviderInterestRate;
    }

    /**
     * Sets the value of the loanProviderInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProviderInterestRate(String value) {
        this.loanProviderInterestRate = value;
    }

    /**
     * Gets the value of the loanProviderInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link LoanProviderInterestRateType }
     *     
     */
    public LoanProviderInterestRateType getLoanProviderInterestRateType() {
        return loanProviderInterestRateType;
    }

    /**
     * Sets the value of the loanProviderInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanProviderInterestRateType }
     *     
     */
    public void setLoanProviderInterestRateType(LoanProviderInterestRateType value) {
        this.loanProviderInterestRateType = value;
    }

    /**
     * Gets the value of the maxTermPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MaxTermPeriod }
     *     
     */
    public MaxTermPeriod getMaxTermPeriod() {
        return maxTermPeriod;
    }

    /**
     * Sets the value of the maxTermPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxTermPeriod }
     *     
     */
    public void setMaxTermPeriod(MaxTermPeriod value) {
        this.maxTermPeriod = value;
    }

    /**
     * Gets the value of the minTermPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MinTermPeriod }
     *     
     */
    public MinTermPeriod getMinTermPeriod() {
        return minTermPeriod;
    }

    /**
     * Sets the value of the minTermPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinTermPeriod }
     *     
     */
    public void setMinTermPeriod(MinTermPeriod value) {
        this.minTermPeriod = value;
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
     * Gets the value of the otherLoanProviderInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLoanProviderInterestRateType }
     *     
     */
    public OtherLoanProviderInterestRateType getOtherLoanProviderInterestRateType() {
        return otherLoanProviderInterestRateType;
    }

    /**
     * Sets the value of the otherLoanProviderInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLoanProviderInterestRateType }
     *     
     */
    public void setOtherLoanProviderInterestRateType(OtherLoanProviderInterestRateType value) {
        this.otherLoanProviderInterestRateType = value;
    }

    /**
     * Gets the value of the repAPR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepAPR() {
        return repAPR;
    }

    /**
     * Sets the value of the repAPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepAPR(String value) {
        this.repAPR = value;
    }

    /**
     * Gets the value of the tierValueMaxTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierValueMaxTerm() {
        return tierValueMaxTerm;
    }

    /**
     * Sets the value of the tierValueMaxTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierValueMaxTerm(BigInteger value) {
        this.tierValueMaxTerm = value;
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
     * Gets the value of the tierValueMinTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierValueMinTerm() {
        return tierValueMinTerm;
    }

    /**
     * Sets the value of the tierValueMinTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierValueMinTerm(BigInteger value) {
        this.tierValueMinTerm = value;
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
