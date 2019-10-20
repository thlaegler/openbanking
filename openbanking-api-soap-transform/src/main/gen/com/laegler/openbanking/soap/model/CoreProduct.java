
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * BCA core product details.
 * 
 * <p>Java class for CoreProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonthlyCharge" minOccurs="0"&gt;
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
 *         &lt;element name="ProductDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesAccessChannels" type="{http://laegler.com/openbanking/soap/model}SalesAccessChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServicingAccessChannels" type="{http://laegler.com/openbanking/soap/model}ServicingAccessChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TcsAndCsURL" minOccurs="0"&gt;
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
@XmlType(name = "CoreProduct", propOrder = {
    "monthlyCharge",
    "notes",
    "productDescription",
    "productURL",
    "salesAccessChannels",
    "servicingAccessChannels",
    "tcsAndCsURL"
})
public class CoreProduct {

    @XmlElement(name = "MonthlyCharge")
    protected String monthlyCharge;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductURL")
    protected String productURL;
    @XmlElement(name = "SalesAccessChannels")
    @XmlSchemaType(name = "string")
    protected List<SalesAccessChannel> salesAccessChannels;
    @XmlElement(name = "ServicingAccessChannels")
    @XmlSchemaType(name = "string")
    protected List<ServicingAccessChannel> servicingAccessChannels;
    @XmlElement(name = "TcsAndCsURL")
    protected String tcsAndCsURL;

    /**
     * Gets the value of the monthlyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyCharge() {
        return monthlyCharge;
    }

    /**
     * Sets the value of the monthlyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyCharge(String value) {
        this.monthlyCharge = value;
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
     * {@link SalesAccessChannel }
     * 
     * 
     */
    public List<SalesAccessChannel> getSalesAccessChannels() {
        if (salesAccessChannels == null) {
            salesAccessChannels = new ArrayList<SalesAccessChannel>();
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
     * {@link ServicingAccessChannel }
     * 
     * 
     */
    public List<ServicingAccessChannel> getServicingAccessChannels() {
        if (servicingAccessChannels == null) {
            servicingAccessChannels = new ArrayList<ServicingAccessChannel>();
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
