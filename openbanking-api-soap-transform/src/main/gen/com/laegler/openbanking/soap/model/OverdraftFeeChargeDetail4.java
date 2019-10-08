
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
 * <p>Java class for OverdraftFeeChargeDetail4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftFeeChargeDetail4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_FeeFrequency1Code_0"/&gt;
 *         &lt;element name="CalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_FeeFrequency1Code_1" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeeRateType" type="{http://laegler.com/openbanking/soap/model}OB_InterestRateType1Code_0" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://laegler.com/openbanking/soap/model}OB_OverdraftFeeType1Code"/&gt;
 *         &lt;element name="IncrementalBorrowingAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NegotiableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherApplicationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_1" minOccurs="0"/&gt;
 *         &lt;element name="OtherCalculationFrequency" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_2" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeRateType" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_4" minOccurs="0"/&gt;
 *         &lt;element name="OtherFeeType" type="{http://laegler.com/openbanking/soap/model}OB_OtherCodeType1_3" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftControlIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverdraftFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}OverdraftFeeChargeCap8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftFeeChargeDetail4", propOrder = {
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeRate",
    "feeRateType",
    "feeType",
    "incrementalBorrowingAmount",
    "negotiableIndicator",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeRateType",
    "otherFeeType",
    "overdraftControlIndicator",
    "overdraftFeeChargeCap"
})
public class OverdraftFeeChargeDetail4 {

    @XmlElement(name = "ApplicationFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected OBFeeFrequency1Code0 applicationFrequency;
    @XmlElement(name = "CalculationFrequency")
    @XmlSchemaType(name = "string")
    protected OBFeeFrequency1Code1 calculationFrequency;
    @XmlElement(name = "FeeAmount")
    protected String feeAmount;
    @XmlElement(name = "FeeRate")
    protected String feeRate;
    @XmlElement(name = "FeeRateType")
    @XmlSchemaType(name = "string")
    protected OBInterestRateType1Code0 feeRateType;
    @XmlElement(name = "FeeType", required = true)
    @XmlSchemaType(name = "string")
    protected OBOverdraftFeeType1Code feeType;
    @XmlElement(name = "IncrementalBorrowingAmount")
    protected String incrementalBorrowingAmount;
    @XmlElement(name = "NegotiableIndicator")
    protected Boolean negotiableIndicator;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherApplicationFrequency")
    protected OBOtherCodeType11 otherApplicationFrequency;
    @XmlElement(name = "OtherCalculationFrequency")
    protected OBOtherCodeType12 otherCalculationFrequency;
    @XmlElement(name = "OtherFeeRateType")
    protected OBOtherCodeType14 otherFeeRateType;
    @XmlElement(name = "OtherFeeType")
    protected OBOtherCodeType13 otherFeeType;
    @XmlElement(name = "OverdraftControlIndicator")
    protected Boolean overdraftControlIndicator;
    @XmlElement(name = "OverdraftFeeChargeCap")
    protected List<OverdraftFeeChargeCap8> overdraftFeeChargeCap;

    /**
     * Gets the value of the applicationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeFrequency1Code0 }
     *     
     */
    public OBFeeFrequency1Code0 getApplicationFrequency() {
        return applicationFrequency;
    }

    /**
     * Sets the value of the applicationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeFrequency1Code0 }
     *     
     */
    public void setApplicationFrequency(OBFeeFrequency1Code0 value) {
        this.applicationFrequency = value;
    }

    /**
     * Gets the value of the calculationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OBFeeFrequency1Code1 }
     *     
     */
    public OBFeeFrequency1Code1 getCalculationFrequency() {
        return calculationFrequency;
    }

    /**
     * Sets the value of the calculationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBFeeFrequency1Code1 }
     *     
     */
    public void setCalculationFrequency(OBFeeFrequency1Code1 value) {
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
     *     {@link OBInterestRateType1Code0 }
     *     
     */
    public OBInterestRateType1Code0 getFeeRateType() {
        return feeRateType;
    }

    /**
     * Sets the value of the feeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBInterestRateType1Code0 }
     *     
     */
    public void setFeeRateType(OBInterestRateType1Code0 value) {
        this.feeRateType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOverdraftFeeType1Code }
     *     
     */
    public OBOverdraftFeeType1Code getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOverdraftFeeType1Code }
     *     
     */
    public void setFeeType(OBOverdraftFeeType1Code value) {
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
     * Gets the value of the otherFeeRateType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType14 }
     *     
     */
    public OBOtherCodeType14 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    /**
     * Sets the value of the otherFeeRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType14 }
     *     
     */
    public void setOtherFeeRateType(OBOtherCodeType14 value) {
        this.otherFeeRateType = value;
    }

    /**
     * Gets the value of the otherFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link OBOtherCodeType13 }
     *     
     */
    public OBOtherCodeType13 getOtherFeeType() {
        return otherFeeType;
    }

    /**
     * Sets the value of the otherFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBOtherCodeType13 }
     *     
     */
    public void setOtherFeeType(OBOtherCodeType13 value) {
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFeeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFeeChargeCap8 }
     * 
     * 
     */
    public List<OverdraftFeeChargeCap8> getOverdraftFeeChargeCap() {
        if (overdraftFeeChargeCap == null) {
            overdraftFeeChargeCap = new ArrayList<OverdraftFeeChargeCap8>();
        }
        return this.overdraftFeeChargeCap;
    }

}
