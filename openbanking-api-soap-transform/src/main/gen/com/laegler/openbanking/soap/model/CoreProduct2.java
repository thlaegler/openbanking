
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Core feature of the PCA product which can be associated to a particular Marketing State
 * 
 * <p>Java class for CoreProduct2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProduct2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonthlyMaximumCharge" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
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
 *         &lt;element name="SalesAccessChannels" type="{http://laegler.com/openbanking/soap/model}SalesAccessChannel2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServicingAccessChannels" type="{http://laegler.com/openbanking/soap/model}ServicingAccessChannel2" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CoreProduct2", propOrder = {
    "monthlyMaximumCharge",
    "productDescription",
    "productURL",
    "salesAccessChannels",
    "servicingAccessChannels",
    "tcsAndCsURL"
})
public class CoreProduct2 {

    @XmlElement(name = "MonthlyMaximumCharge")
    protected String monthlyMaximumCharge;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductURL")
    protected String productURL;
    @XmlElement(name = "SalesAccessChannels")
    @XmlSchemaType(name = "string")
    protected List<SalesAccessChannel2> salesAccessChannels;
    @XmlElement(name = "ServicingAccessChannels")
    @XmlSchemaType(name = "string")
    protected List<ServicingAccessChannel2> servicingAccessChannels;
    @XmlElement(name = "TcsAndCsURL")
    protected String tcsAndCsURL;

    /**
     * Gets the value of the monthlyMaximumCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyMaximumCharge() {
        return monthlyMaximumCharge;
    }

    /**
     * Sets the value of the monthlyMaximumCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyMaximumCharge(String value) {
        this.monthlyMaximumCharge = value;
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
     * {@link SalesAccessChannel2 }
     * 
     * 
     */
    public List<SalesAccessChannel2> getSalesAccessChannels() {
        if (salesAccessChannels == null) {
            salesAccessChannels = new ArrayList<SalesAccessChannel2>();
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
     * {@link ServicingAccessChannel2 }
     * 
     * 
     */
    public List<ServicingAccessChannel2> getServicingAccessChannels() {
        if (servicingAccessChannels == null) {
            servicingAccessChannels = new ArrayList<ServicingAccessChannel2>();
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
