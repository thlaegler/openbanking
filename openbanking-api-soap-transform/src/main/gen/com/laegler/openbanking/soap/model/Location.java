
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Location of the ATM.
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationCategory" type="{http://laegler.com/openbanking/soap/model}LocationCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocationCategory" type="{http://laegler.com/openbanking/soap/model}OtherLocationCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://laegler.com/openbanking/soap/model}PostalAddress1"/&gt;
 *         &lt;element name="Site" type="{http://laegler.com/openbanking/soap/model}Site" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationCategory",
    "otherLocationCategory",
    "postalAddress",
    "site"
})
public class Location {

    @XmlElement(name = "LocationCategory")
    @XmlSchemaType(name = "string")
    protected List<LocationCategory> locationCategory;
    @XmlElement(name = "OtherLocationCategory")
    protected List<OtherLocationCategory> otherLocationCategory;
    @XmlElement(name = "PostalAddress", required = true)
    protected PostalAddress1 postalAddress;
    @XmlElement(name = "Site")
    protected Site site;

    /**
     * Gets the value of the locationCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCategory }
     * 
     * 
     */
    public List<LocationCategory> getLocationCategory() {
        if (locationCategory == null) {
            locationCategory = new ArrayList<LocationCategory>();
        }
        return this.locationCategory;
    }

    /**
     * Gets the value of the otherLocationCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLocationCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLocationCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherLocationCategory }
     * 
     * 
     */
    public List<OtherLocationCategory> getOtherLocationCategory() {
        if (otherLocationCategory == null) {
            otherLocationCategory = new ArrayList<OtherLocationCategory>();
        }
        return this.otherLocationCategory;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public void setPostalAddress(PostalAddress1 value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

}
