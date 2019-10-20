
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Other fees/charges details
 * 
 * <p>Java class for FeeChargeDetail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeChargeDetail1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency5"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency5"/&gt;
 *         &lt;element name="FeeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeApplicableRange" type="{http://laegler.com/openbanking/soap/model}FeeApplicableRange" minOccurs="0"/&gt;
 *         &lt;element name="FeeCategory" type="{http://laegler.com/openbanking/soap/model}FeeCategory2"/&gt;
 *         &lt;element name="FeeRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRateType" type="{http://laegler.com/openbanking/soap/model}FeeRateType" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}FeeType9"/&gt;
 *         &lt;element name="IncludedInPeriodicFeeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NegotiableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherApplicationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeCategory" type="{http://laegler.com/openbanking/soap/model}OtherFeeCategory" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeRateType" type="{http://laegler.com/openbanking/soap/model}OtherFeeRateType" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OtherFeeType9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeChargeDetail1", propOrder = {
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeApplicableRange",
    "feeCategory",
    "feeRate",
    "feeRateType",
    "feeType",
    "includedInPeriodicFeeIndicator",
    "negotiableIndicator",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeCategory",
    "otherFeeRateType",
    "otherFeeType"
})
public class FeeChargeDetail1 {

    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency5 applicationFrequency;
    @XmlElement(name = "CalculationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationFrequency5 calculationFrequency;
    @XmlElement(name = "FeeAmount")
    protected String feeAmount;
    @XmlElement(name = "FeeApplicableRange")
    protected FeeApplicableRange feeApplicableRange;
    @XmlElement(name = "FeeCategory", required = true)
    @XmlSchemaType(name = "string")
    protected FeeCategory2 feeCategory;
    @XmlElement(name = "FeeRate")
    protected String feeRate;
    @XmlElement(name = "FeeRateType")
    @XmlSchemaType(name = "string")
    protected FeeRateType feeRateType;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected FeeType9 feeType;
    @XmlElement(name = "IncludedInPeriodicFeeIndicator")
    protected Boolean includedInPeriodicFeeIndicator;
    @XmlElement(name = "NegotiableIndicator")
    protected Boolean negotiableIndicator;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency otherCalculationFrequency;
    @XmlElement(name = "OtherFeeCategory")
    protected OtherFeeCategory otherFeeCategory;
    @XmlElement(name = "OtherFeeRateType")
    protected OtherFeeRateType otherFeeRateType;
    @XmlElement(name = "OtherFeeType")
    protected OtherFeeType9 otherFeeType;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFrequency5 }
     *     
     */
    public ApplicationFrequency5 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency5 }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency5 value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency5 }
     *     
     */
    public CalculationFrequency5 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency5 }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency5 value) {
        this.calculationFrequency = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAmount(String value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeApplicableRange property.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplicableRange }
     *     
     */
    public FeeApplicableRange getFeeApplicableRange() {
        return feeApplicableRange;
    }

    /**
     * Sets the value of the feeApplicableRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplicableRange }
     *     
     */
    public void setFeeApplicableRange(FeeApplicableRange value) {
        this.feeApplicableRange = value;
    }

    /**
     * Gets the value of the feeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link FeeCategory2 }
     *     
     */
    public FeeCategory2 getFeeCategory() {
        return feeCategory;
    }

    /**
     * Sets the value of the feeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCategory2 }
     *     
     */
    public void setFeeCategory(FeeCategory2 value) {
        this.feeCategory = value;
    }

    /**
     * Gets the value of the feeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRate() {
        return feeRate;
    }

    /**
     * Sets the value of the feeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRate(String value) {
        this.feeRate = value;
    }

    /**
     * Gets the value of the feeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeRateType }
     *     
     */
    public FeeRateType getFeeRateType() {
        return feeRateType;
    }

    /**
     * Sets the value of the feeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeRateType }
     *     
     */
    public void setFeeRateType(FeeRateType value) {
        this.feeRateType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType9 }
     *     
     */
    public FeeType9 getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType9 }
     *     
     */
    public void setFeeType(FeeType9 value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the includedInPeriodicFeeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInPeriodicFeeIndicator() {
        return includedInPeriodicFeeIndicator;
    }

    /**
     * Sets the value of the includedInPeriodicFeeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInPeriodicFeeIndicator(Boolean value) {
        this.includedInPeriodicFeeIndicator = value;
    }

    /**
     * Gets the value of the negotiableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiableIndicator() {
        return negotiableIndicator;
    }

    /**
     * Sets the value of the negotiableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiableIndicator(Boolean value) {
        this.negotiableIndicator = value;
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

    /**
     * Gets the value of the otherFeeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeCategory }
     *     
     */
    public OtherFeeCategory getOtherFeeCategory() {
        return otherFeeCategory;
    }

    /**
     * Sets the value of the otherFeeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeCategory }
     *     
     */
    public void setOtherFeeCategory(OtherFeeCategory value) {
        this.otherFeeCategory = value;
    }

    /**
     * Gets the value of the otherFeeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeRateType }
     *     
     */
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    /**
     * Sets the value of the otherFeeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeRateType }
     *     
     */
    public void setOtherFeeRateType(OtherFeeRateType value) {
        this.otherFeeRateType = value;
    }

    /**
     * Gets the value of the otherFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeType9 }
     *     
     */
    public OtherFeeType9 getOtherFeeType() {
        return otherFeeType;
    }

    /**
     * Sets the value of the otherFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeType9 }
     *     
     */
    public void setOtherFeeType(OtherFeeType9 value) {
        this.otherFeeType = value;
    }

}
