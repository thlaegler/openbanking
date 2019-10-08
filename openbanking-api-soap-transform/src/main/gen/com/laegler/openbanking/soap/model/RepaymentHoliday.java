
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
 * Details of capital repayment holiday if any
 * 
 * <p>Java class for RepaymentHoliday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepaymentHoliday"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxHolidayLength" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxHolidayPeriod" type="{http://laegler.com/openbanking/soap/model}MaxHolidayPeriod" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
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
@XmlType(name = "RepaymentHoliday", propOrder = {
    "maxHolidayLength",
    "maxHolidayPeriod",
    "notes"
})
public class RepaymentHoliday {

    @XmlElement(name = "MaxHolidayLength")
    protected BigInteger maxHolidayLength;
    @XmlElement(name = "MaxHolidayPeriod")
    @XmlSchemaType(name = "string")
    protected MaxHolidayPeriod maxHolidayPeriod;
    @XmlElement(name = "Notes")
    protected List<String> notes;

    /**
     * Gets the value of the maxHolidayLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxHolidayLength() {
        return maxHolidayLength;
    }

    /**
     * Sets the value of the maxHolidayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxHolidayLength(BigInteger value) {
        this.maxHolidayLength = value;
    }

    /**
     * Gets the value of the maxHolidayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MaxHolidayPeriod }
     *     
     */
    public MaxHolidayPeriod getMaxHolidayPeriod() {
        return maxHolidayPeriod;
    }

    /**
     * Sets the value of the maxHolidayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxHolidayPeriod }
     *     
     */
    public void setMaxHolidayPeriod(MaxHolidayPeriod value) {
        this.maxHolidayPeriod = value;
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

}
