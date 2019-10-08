
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment Card Details
 * 
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactlessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxDailyCardWithdrawalLimit" minOccurs="0"&gt;
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
 *         &lt;element name="OtherScheme" type="{http://laegler.com/openbanking/soap/model}OtherScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherType" type="{http://laegler.com/openbanking/soap/model}OtherType2" minOccurs="0"/&gt;
 *         &lt;element name="Scheme" type="{http://laegler.com/openbanking/soap/model}Scheme" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}Type2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "contactlessIndicator",
    "maxDailyCardWithdrawalLimit",
    "notes",
    "otherScheme",
    "otherType",
    "scheme",
    "type"
})
public class Card {

    @XmlElement(name = "ContactlessIndicator")
    protected boolean contactlessIndicator;
    @XmlElement(name = "MaxDailyCardWithdrawalLimit")
    protected String maxDailyCardWithdrawalLimit;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherScheme")
    protected List<OtherScheme> otherScheme;
    @XmlElement(name = "OtherType")
    protected OtherType2 otherType;
    @XmlElement(name = "Scheme", required = true)
    @XmlSchemaType(name = "string")
    protected List<Scheme> scheme;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected Type2 type;

    /**
     * Gets the value of the contactlessIndicator property.
     * 
     */
    public boolean isContactlessIndicator() {
        return contactlessIndicator;
    }

    /**
     * Sets the value of the contactlessIndicator property.
     * 
     */
    public void setContactlessIndicator(boolean value) {
        this.contactlessIndicator = value;
    }

    /**
     * Gets the value of the maxDailyCardWithdrawalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyCardWithdrawalLimit() {
        return maxDailyCardWithdrawalLimit;
    }

    /**
     * Sets the value of the maxDailyCardWithdrawalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyCardWithdrawalLimit(String value) {
        this.maxDailyCardWithdrawalLimit = value;
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
     * Gets the value of the otherScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherScheme }
     * 
     * 
     */
    public List<OtherScheme> getOtherScheme() {
        if (otherScheme == null) {
            otherScheme = new ArrayList<OtherScheme>();
        }
        return this.otherScheme;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherType2 }
     *     
     */
    public OtherType2 getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherType2 }
     *     
     */
    public void setOtherType(OtherType2 value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the scheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scheme }
     * 
     * 
     */
    public List<Scheme> getScheme() {
        if (scheme == null) {
            scheme = new ArrayList<Scheme>();
        }
        return this.scheme;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type2 }
     *     
     */
    public Type2 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type2 }
     *     
     */
    public void setType(Type2 value) {
        this.type = value;
    }

}
