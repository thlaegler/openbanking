
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * ATM information.
 * 
 * <p>Java class for ATM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATMServices" type="{http://laegler.com/openbanking/soap/model}ATMService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Access24HoursIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Accessibility" type="{http://laegler.com/openbanking/soap/model}Accessibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Branch" type="{http://laegler.com/openbanking/soap/model}Branch" minOccurs="0"/&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Location" type="{http://laegler.com/openbanking/soap/model}Location"/&gt;
 *         &lt;element name="MinimumPossibleAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^-?\d{1,10}\.?\d{0,2}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Note" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherATMServices" type="{http://laegler.com/openbanking/soap/model}OtherATMService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherAccessibility" type="{http://laegler.com/openbanking/soap/model}OtherAccessibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupportedCurrencies" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z]{3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupportedLanguages" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-z]{2}"/&gt;
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
@XmlType(name = "ATM", propOrder = {
    "atmServices",
    "access24HoursIndicator",
    "accessibility",
    "branch",
    "identification",
    "location",
    "minimumPossibleAmount",
    "note",
    "otherATMServices",
    "otherAccessibility",
    "supportedCurrencies",
    "supportedLanguages"
})
public class ATM {

    @XmlElement(name = "ATMServices")
    @XmlSchemaType(name = "string")
    protected List<ATMService> atmServices;
    @XmlElement(name = "Access24HoursIndicator")
    protected Boolean access24HoursIndicator;
    @XmlElement(name = "Accessibility")
    @XmlSchemaType(name = "string")
    protected List<Accessibility> accessibility;
    @XmlElement(name = "Branch")
    protected Branch branch;
    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Location", required = true)
    protected Location location;
    @XmlElement(name = "MinimumPossibleAmount")
    protected String minimumPossibleAmount;
    @XmlElement(name = "Note")
    protected List<String> note;
    @XmlElement(name = "OtherATMServices")
    protected List<OtherATMService> otherATMServices;
    @XmlElement(name = "OtherAccessibility")
    protected List<OtherAccessibility> otherAccessibility;
    @XmlElement(name = "SupportedCurrencies", required = true)
    protected List<String> supportedCurrencies;
    @XmlElement(name = "SupportedLanguages")
    protected List<String> supportedLanguages;

    /**
     * Gets the value of the atmServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atmServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService }
     * 
     * 
     */
    public List<ATMService> getATMServices() {
        if (atmServices == null) {
            atmServices = new ArrayList<ATMService>();
        }
        return this.atmServices;
    }

    /**
     * Gets the value of the access24HoursIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccess24HoursIndicator() {
        return access24HoursIndicator;
    }

    /**
     * Sets the value of the access24HoursIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccess24HoursIndicator(Boolean value) {
        this.access24HoursIndicator = value;
    }

    /**
     * Gets the value of the accessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accessibility }
     * 
     * 
     */
    public List<Accessibility> getAccessibility() {
        if (accessibility == null) {
            accessibility = new ArrayList<Accessibility>();
        }
        return this.accessibility;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the minimumPossibleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumPossibleAmount() {
        return minimumPossibleAmount;
    }

    /**
     * Sets the value of the minimumPossibleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumPossibleAmount(String value) {
        this.minimumPossibleAmount = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

    /**
     * Gets the value of the otherATMServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherATMServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherATMServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherATMService }
     * 
     * 
     */
    public List<OtherATMService> getOtherATMServices() {
        if (otherATMServices == null) {
            otherATMServices = new ArrayList<OtherATMService>();
        }
        return this.otherATMServices;
    }

    /**
     * Gets the value of the otherAccessibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAccessibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAccessibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAccessibility }
     * 
     * 
     */
    public List<OtherAccessibility> getOtherAccessibility() {
        if (otherAccessibility == null) {
            otherAccessibility = new ArrayList<OtherAccessibility>();
        }
        return this.otherAccessibility;
    }

    /**
     * Gets the value of the supportedCurrencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCurrencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCurrencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedCurrencies() {
        if (supportedCurrencies == null) {
            supportedCurrencies = new ArrayList<String>();
        }
        return this.supportedCurrencies;
    }

    /**
     * Gets the value of the supportedLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedLanguages() {
        if (supportedLanguages == null) {
            supportedLanguages = new ArrayList<String>();
        }
        return this.supportedLanguages;
    }

}
