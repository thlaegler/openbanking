
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Repayment details of the Loan product
 * 
 * <p>Java class for Repayment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repayment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountType" type="{http://laegler.com/openbanking/soap/model}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherAmountType" type="{http://laegler.com/openbanking/soap/model}OtherAmountType" minOccurs="0"/&gt;
 *         &lt;element name="OtherRepaymentFrequency" type="{http://laegler.com/openbanking/soap/model}OtherRepaymentFrequency" minOccurs="0"/&gt;
 *         &lt;element name="OtherRepaymentType" type="{http://laegler.com/openbanking/soap/model}OtherRepaymentType" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentFeeCharges" type="{http://laegler.com/openbanking/soap/model}RepaymentFeeCharges" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentFrequency" type="{http://laegler.com/openbanking/soap/model}RepaymentFrequency" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentHoliday" type="{http://laegler.com/openbanking/soap/model}RepaymentHoliday" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentType" type="{http://laegler.com/openbanking/soap/model}RepaymentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repayment1", propOrder = {
    "amountType",
    "notes",
    "otherAmountType",
    "otherRepaymentFrequency",
    "otherRepaymentType",
    "repaymentFeeCharges",
    "repaymentFrequency",
    "repaymentHoliday",
    "repaymentType"
})
public class Repayment1 {

    @XmlElement(name = "AmountType")
    @XmlSchemaType(name = "string")
    protected AmountType amountType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherAmountType")
    protected OtherAmountType otherAmountType;
    @XmlElement(name = "OtherRepaymentFrequency")
    protected OtherRepaymentFrequency otherRepaymentFrequency;
    @XmlElement(name = "OtherRepaymentType")
    protected OtherRepaymentType otherRepaymentType;
    @XmlElement(name = "RepaymentFeeCharges")
    protected RepaymentFeeCharges repaymentFeeCharges;
    @XmlElement(name = "RepaymentFrequency")
    @XmlSchemaType(name = "string")
    protected RepaymentFrequency repaymentFrequency;
    @XmlElement(name = "RepaymentHoliday")
    protected List<RepaymentHoliday> repaymentHoliday;
    @XmlElement(name = "RepaymentType")
    @XmlSchemaType(name = "string")
    protected RepaymentType repaymentType;

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountType(AmountType value) {
        this.amountType = value;
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
     * Gets the value of the otherAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmountType }
     *     
     */
    public OtherAmountType getOtherAmountType() {
        return otherAmountType;
    }

    /**
     * Sets the value of the otherAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmountType }
     *     
     */
    public void setOtherAmountType(OtherAmountType value) {
        this.otherAmountType = value;
    }

    /**
     * Gets the value of the otherRepaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherRepaymentFrequency }
     *     
     */
    public OtherRepaymentFrequency getOtherRepaymentFrequency() {
        return otherRepaymentFrequency;
    }

    /**
     * Sets the value of the otherRepaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherRepaymentFrequency }
     *     
     */
    public void setOtherRepaymentFrequency(OtherRepaymentFrequency value) {
        this.otherRepaymentFrequency = value;
    }

    /**
     * Gets the value of the otherRepaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherRepaymentType }
     *     
     */
    public OtherRepaymentType getOtherRepaymentType() {
        return otherRepaymentType;
    }

    /**
     * Sets the value of the otherRepaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherRepaymentType }
     *     
     */
    public void setOtherRepaymentType(OtherRepaymentType value) {
        this.otherRepaymentType = value;
    }

    /**
     * Gets the value of the repaymentFeeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentFeeCharges }
     *     
     */
    public RepaymentFeeCharges getRepaymentFeeCharges() {
        return repaymentFeeCharges;
    }

    /**
     * Sets the value of the repaymentFeeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentFeeCharges }
     *     
     */
    public void setRepaymentFeeCharges(RepaymentFeeCharges value) {
        this.repaymentFeeCharges = value;
    }

    /**
     * Gets the value of the repaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentFrequency }
     *     
     */
    public RepaymentFrequency getRepaymentFrequency() {
        return repaymentFrequency;
    }

    /**
     * Sets the value of the repaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentFrequency }
     *     
     */
    public void setRepaymentFrequency(RepaymentFrequency value) {
        this.repaymentFrequency = value;
    }

    /**
     * Gets the value of the repaymentHoliday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentHoliday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentHoliday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentHoliday }
     * 
     * 
     */
    public List<RepaymentHoliday> getRepaymentHoliday() {
        if (repaymentHoliday == null) {
            repaymentHoliday = new ArrayList<RepaymentHoliday>();
        }
        return this.repaymentHoliday;
    }

    /**
     * Gets the value of the repaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentType }
     *     
     */
    public RepaymentType getRepaymentType() {
        return repaymentType;
    }

    /**
     * Sets the value of the repaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentType }
     *     
     */
    public void setRepaymentType(RepaymentType value) {
        this.repaymentType = value;
    }

}
