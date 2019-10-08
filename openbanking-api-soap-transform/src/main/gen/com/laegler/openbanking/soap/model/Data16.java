
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Data16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Permissions" type="{http://laegler.com/openbanking/soap/model}Permission1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TransactionFromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TransactionToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data16", propOrder = {
    "expirationDateTime",
    "permissions",
    "transactionFromDateTime",
    "transactionToDateTime"
})
public class Data16 {

    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "Permissions", required = true)
    @XmlSchemaType(name = "string")
    protected List<Permission1> permissions;
    @XmlElement(name = "TransactionFromDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionFromDateTime;
    @XmlElement(name = "TransactionToDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionToDateTime;

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permission1 }
     * 
     * 
     */
    public List<Permission1> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<Permission1>();
        }
        return this.permissions;
    }

    /**
     * Gets the value of the transactionFromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    /**
     * Sets the value of the transactionFromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionFromDateTime(XMLGregorianCalendar value) {
        this.transactionFromDateTime = value;
    }

    /**
     * Gets the value of the transactionToDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionToDateTime() {
        return transactionToDateTime;
    }

    /**
     * Sets the value of the transactionToDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionToDateTime(XMLGregorianCalendar value) {
        this.transactionToDateTime = value;
    }

}
