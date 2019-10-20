
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
 * <p>Java class for Repayment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repayment2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountType" type="{http://laegler.com/openbanking/soap/model}AmountType1" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherAmountType" type="{http://laegler.com/openbanking/soap/model}OtherAmountType1" minOccurs="0"/&gt;
 *         &lt;element name="OtherRepaymentFrequency" type="{http://laegler.com/openbanking/soap/model}OtherRepaymentFrequency1" minOccurs="0"/&gt;
 *         &lt;element name="OtherRepaymentType" type="{http://laegler.com/openbanking/soap/model}OtherRepaymentType1" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentFeeCharges" type="{http://laegler.com/openbanking/soap/model}RepaymentFeeCharges1" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentFrequency" type="{http://laegler.com/openbanking/soap/model}RepaymentFrequency1" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentHoliday" type="{http://laegler.com/openbanking/soap/model}RepaymentHoliday1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentType" type="{http://laegler.com/openbanking/soap/model}RepaymentType1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repayment2", propOrder = {
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
public class Repayment2 {

    @XmlElement(name = "AmountType")
    @XmlSchemaType(name = "string")
    protected AmountType1 amountType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherAmountType")
    protected OtherAmountType1 otherAmountType;
    @XmlElement(name = "OtherRepaymentFrequency")
    protected OtherRepaymentFrequency1 otherRepaymentFrequency;
    @XmlElement(name = "OtherRepaymentType")
    protected OtherRepaymentType1 otherRepaymentType;
    @XmlElement(name = "RepaymentFeeCharges")
    protected RepaymentFeeCharges1 repaymentFeeCharges;
    @XmlElement(name = "RepaymentFrequency")
    @XmlSchemaType(name = "string")
    protected RepaymentFrequency1 repaymentFrequency;
    @XmlElement(name = "RepaymentHoliday")
    protected List<RepaymentHoliday1> repaymentHoliday;
    @XmlElement(name = "RepaymentType")
    @XmlSchemaType(name = "string")
    protected RepaymentType1 repaymentType;

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType1 }
     *     
     */
    public AmountType1 getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType1 }
     *     
     */
    public void setAmountType(AmountType1 value) {
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
     *     {@link OtherAmountType1 }
     *     
     */
    public OtherAmountType1 getOtherAmountType() {
        return otherAmountType;
    }

    /**
     * Sets the value of the otherAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmountType1 }
     *     
     */
    public void setOtherAmountType(OtherAmountType1 value) {
        this.otherAmountType = value;
    }

    /**
     * Gets the value of the otherRepaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link OtherRepaymentFrequency1 }
     *     
     */
    public OtherRepaymentFrequency1 getOtherRepaymentFrequency() {
        return otherRepaymentFrequency;
    }

    /**
     * Sets the value of the otherRepaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherRepaymentFrequency1 }
     *     
     */
    public void setOtherRepaymentFrequency(OtherRepaymentFrequency1 value) {
        this.otherRepaymentFrequency = value;
    }

    /**
     * Gets the value of the otherRepaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherRepaymentType1 }
     *     
     */
    public OtherRepaymentType1 getOtherRepaymentType() {
        return otherRepaymentType;
    }

    /**
     * Sets the value of the otherRepaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherRepaymentType1 }
     *     
     */
    public void setOtherRepaymentType(OtherRepaymentType1 value) {
        this.otherRepaymentType = value;
    }

    /**
     * Gets the value of the repaymentFeeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentFeeCharges1 }
     *     
     */
    public RepaymentFeeCharges1 getRepaymentFeeCharges() {
        return repaymentFeeCharges;
    }

    /**
     * Sets the value of the repaymentFeeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentFeeCharges1 }
     *     
     */
    public void setRepaymentFeeCharges(RepaymentFeeCharges1 value) {
        this.repaymentFeeCharges = value;
    }

    /**
     * Gets the value of the repaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentFrequency1 }
     *     
     */
    public RepaymentFrequency1 getRepaymentFrequency() {
        return repaymentFrequency;
    }

    /**
     * Sets the value of the repaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentFrequency1 }
     *     
     */
    public void setRepaymentFrequency(RepaymentFrequency1 value) {
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
     * {@link RepaymentHoliday1 }
     * 
     * 
     */
    public List<RepaymentHoliday1> getRepaymentHoliday() {
        if (repaymentHoliday == null) {
            repaymentHoliday = new ArrayList<RepaymentHoliday1>();
        }
        return this.repaymentHoliday;
    }

    /**
     * Gets the value of the repaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentType1 }
     *     
     */
    public RepaymentType1 getRepaymentType() {
        return repaymentType;
    }

    /**
     * Sets the value of the repaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentType1 }
     *     
     */
    public void setRepaymentType(RepaymentType1 value) {
        this.repaymentType = value;
    }

}
