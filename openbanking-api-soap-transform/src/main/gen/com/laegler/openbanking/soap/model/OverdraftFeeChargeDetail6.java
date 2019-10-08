
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the fees/charges
 * 
 * <p>Java class for OverdraftFeeChargeDetail6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftFeeChargeDetail6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}ApplicationFrequency14"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}CalculationFrequency14" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRateType" type="{http://laegler.com/openbanking/soap/model}FeeRateType9" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}FeeType2"/&gt;
 *         &lt;element name="IncrementalBorrowingAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
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
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OtherCalculationFrequency1" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeRateType" type="{http://laegler.com/openbanking/soap/model}OtherFeeRateType1" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OtherFeeType3" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftControlIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}OverdraftFeeChargeCap12" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftFeeChargeDetail6", propOrder = {
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeRate",
    "feeRateType",
    "feeType",
    "incrementalBorrowingAmount",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeRateType",
    "otherFeeType",
    "overdraftControlIndicator",
    "overdraftFeeChargeCap"
})
public class OverdraftFeeChargeDetail6 {

    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected ApplicationFrequency14 applicationFrequency;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected CalculationFrequency14 calculationFrequency;
    @XmlElement(name = "FeeAmount")
    protected String feeAmount;
    @XmlElement(name = "FeeRate")
    protected String feeRate;
    @XmlElement(name = "FeeRateType")
    @XmlSchemaType(name = "string")
    protected FeeRateType9 feeRateType;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected FeeType2 feeType;
    @XmlElement(name = "IncrementalBorrowingAmount")
    protected String incrementalBorrowingAmount;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OtherApplicationFrequency1 otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OtherCalculationFrequency1 otherCalculationFrequency;
    @XmlElement(name = "OtherFeeRateType")
    protected OtherFeeRateType1 otherFeeRateType;
    @XmlElement(name = "OtherFeeType")
    protected OtherFeeType3 otherFeeType;
    @XmlElement(name = "OverdraftControlIndicator")
    protected Boolean overdraftControlIndicator;
    @XmlElement(name = "OverdraftFeeChargeCap")
    protected OverdraftFeeChargeCap12 overdraftFeeChargeCap;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFrequency14 }
     *     
     */
    public ApplicationFrequency14 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFrequency14 }
     *     
     */
    public void setApplicationFrequency(ApplicationFrequency14 value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationFrequency14 }
     *     
     */
    public CalculationFrequency14 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationFrequency14 }
     *     
     */
    public void setCalculationFrequency(CalculationFrequency14 value) {
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
     *     {@link FeeRateType9 }
     *     
     */
    public FeeRateType9 getFeeRateType() {
        return feeRateType;
    }

    /**
     * Sets the value of the feeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeRateType9 }
     *     
     */
    public void setFeeRateType(FeeRateType9 value) {
        this.feeRateType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType2 }
     *     
     */
    public FeeType2 getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType2 }
     *     
     */
    public void setFeeType(FeeType2 value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the incrementalBorrowingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementalBorrowingAmount() {
        return incrementalBorrowingAmount;
    }

    /**
     * Sets the value of the incrementalBorrowingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementalBorrowingAmount(String value) {
        this.incrementalBorrowingAmount = value;
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
     * Gets the value of the otherFeeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeRateType1 }
     *     
     */
    public OtherFeeRateType1 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    /**
     * Sets the value of the otherFeeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeRateType1 }
     *     
     */
    public void setOtherFeeRateType(OtherFeeRateType1 value) {
        this.otherFeeRateType = value;
    }

    /**
     * Gets the value of the otherFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherFeeType3 }
     *     
     */
    public OtherFeeType3 getOtherFeeType() {
        return otherFeeType;
    }

    /**
     * Sets the value of the otherFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherFeeType3 }
     *     
     */
    public void setOtherFeeType(OtherFeeType3 value) {
        this.otherFeeType = value;
    }

    /**
     * Gets the value of the overdraftControlIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    /**
     * Sets the value of the overdraftControlIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverdraftControlIndicator(Boolean value) {
        this.overdraftControlIndicator = value;
    }

    /**
     * Gets the value of the overdraftFeeChargeCap property.
     * 
     * @return
     *     possible object is
     *     {@link OverdraftFeeChargeCap12 }
     *     
     */
    public OverdraftFeeChargeCap12 getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    /**
     * Sets the value of the overdraftFeeChargeCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdraftFeeChargeCap12 }
     *     
     */
    public void setOverdraftFeeChargeCap(OverdraftFeeChargeCap12 value) {
        this.overdraftFeeChargeCap = value;
    }

}
