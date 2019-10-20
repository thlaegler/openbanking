
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
 * CCC core product details.
 * 
 * <p>Java class for CoreProduct1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProduct1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="APR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardScheme" type="{http://laegler.com/openbanking/soap/model}CardScheme" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ContactlessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxCreditLimit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxDailyCardWithdrawalLimit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MaxPurchaseInterestFreeLengthDays" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MinCreditLimit" minOccurs="0"&gt;
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
 *         &lt;element name="OtherCardScheme" type="{http://laegler.com/openbanking/soap/model}OtherCardScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicFee" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PeriodicFeePeriod" type="{http://laegler.com/openbanking/soap/model}PeriodicFeePeriod" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductURL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesAccessChannels" type="{http://laegler.com/openbanking/soap/model}SalesAccessChannel1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ServicingAccessChannels" type="{http://laegler.com/openbanking/soap/model}ServicingAccessChannel1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TcsAndCsURL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
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
@XmlType(name = "CoreProduct1", propOrder = {
    "apr",
    "cardScheme",
    "contactlessIndicator",
    "maxCreditLimit",
    "maxDailyCardWithdrawalLimit",
    "maxPurchaseInterestFreeLengthDays",
    "minCreditLimit",
    "notes",
    "otherCardScheme",
    "periodicFee",
    "periodicFeePeriod",
    "productDescription",
    "productURL",
    "salesAccessChannels",
    "servicingAccessChannels",
    "tcsAndCsURL"
})
public class CoreProduct1 {

    @XmlElement(name = "APR", required = true)
    protected String apr;
    @XmlElement(name = "CardScheme", required = true)
    @XmlSchemaType(name = "string")
    protected List<CardScheme> cardScheme;
    @XmlElement(name = "ContactlessIndicator")
    protected boolean contactlessIndicator;
    @XmlElement(name = "MaxCreditLimit")
    protected String maxCreditLimit;
    @XmlElement(name = "MaxDailyCardWithdrawalLimit")
    protected String maxDailyCardWithdrawalLimit;
    @XmlElement(name = "MaxPurchaseInterestFreeLengthDays")
    protected BigInteger maxPurchaseInterestFreeLengthDays;
    @XmlElement(name = "MinCreditLimit")
    protected String minCreditLimit;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OtherCardScheme")
    protected List<OtherCardScheme> otherCardScheme;
    @XmlElement(name = "PeriodicFee")
    protected String periodicFee;
    @XmlElement(name = "PeriodicFeePeriod")
    @XmlSchemaType(name = "string")
    protected PeriodicFeePeriod periodicFeePeriod;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductURL", required = true)
    protected String productURL;
    @XmlElement(name = "SalesAccessChannels", required = true)
    @XmlSchemaType(name = "string")
    protected List<SalesAccessChannel1> salesAccessChannels;
    @XmlElement(name = "ServicingAccessChannels", required = true)
    @XmlSchemaType(name = "string")
    protected List<ServicingAccessChannel1> servicingAccessChannels;
    @XmlElement(name = "TcsAndCsURL", required = true)
    protected String tcsAndCsURL;

    /**
     * Gets the value of the apr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPR() {
        return apr;
    }

    /**
     * Sets the value of the apr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPR(String value) {
        this.apr = value;
    }

    /**
     * Gets the value of the cardScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardScheme }
     * 
     * 
     */
    public List<CardScheme> getCardScheme() {
        if (cardScheme == null) {
            cardScheme = new ArrayList<CardScheme>();
        }
        return this.cardScheme;
    }

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
     * Gets the value of the maxCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCreditLimit() {
        return maxCreditLimit;
    }

    /**
     * Sets the value of the maxCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCreditLimit(String value) {
        this.maxCreditLimit = value;
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
     * Gets the value of the maxPurchaseInterestFreeLengthDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPurchaseInterestFreeLengthDays() {
        return maxPurchaseInterestFreeLengthDays;
    }

    /**
     * Sets the value of the maxPurchaseInterestFreeLengthDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPurchaseInterestFreeLengthDays(BigInteger value) {
        this.maxPurchaseInterestFreeLengthDays = value;
    }

    /**
     * Gets the value of the minCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCreditLimit() {
        return minCreditLimit;
    }

    /**
     * Sets the value of the minCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCreditLimit(String value) {
        this.minCreditLimit = value;
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
     * Gets the value of the otherCardScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCardScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCardScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCardScheme }
     * 
     * 
     */
    public List<OtherCardScheme> getOtherCardScheme() {
        if (otherCardScheme == null) {
            otherCardScheme = new ArrayList<OtherCardScheme>();
        }
        return this.otherCardScheme;
    }

    /**
     * Gets the value of the periodicFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicFee() {
        return periodicFee;
    }

    /**
     * Sets the value of the periodicFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicFee(String value) {
        this.periodicFee = value;
    }

    /**
     * Gets the value of the periodicFeePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicFeePeriod }
     *     
     */
    public PeriodicFeePeriod getPeriodicFeePeriod() {
        return periodicFeePeriod;
    }

    /**
     * Sets the value of the periodicFeePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicFeePeriod }
     *     
     */
    public void setPeriodicFeePeriod(PeriodicFeePeriod value) {
        this.periodicFeePeriod = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductURL() {
        return productURL;
    }

    /**
     * Sets the value of the productURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductURL(String value) {
        this.productURL = value;
    }

    /**
     * Gets the value of the salesAccessChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccessChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccessChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccessChannel1 }
     * 
     * 
     */
    public List<SalesAccessChannel1> getSalesAccessChannels() {
        if (salesAccessChannels == null) {
            salesAccessChannels = new ArrayList<SalesAccessChannel1>();
        }
        return this.salesAccessChannels;
    }

    /**
     * Gets the value of the servicingAccessChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicingAccessChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicingAccessChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicingAccessChannel1 }
     * 
     * 
     */
    public List<ServicingAccessChannel1> getServicingAccessChannels() {
        if (servicingAccessChannels == null) {
            servicingAccessChannels = new ArrayList<ServicingAccessChannel1>();
        }
        return this.servicingAccessChannels;
    }

    /**
     * Gets the value of the tcsAndCsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcsAndCsURL() {
        return tcsAndCsURL;
    }

    /**
     * Sets the value of the tcsAndCsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcsAndCsURL(String value) {
        this.tcsAndCsURL = value;
    }

}
