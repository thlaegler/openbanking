
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts: 
 * (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;  
 * (c) savings accounts (including instant access savings accounts);  
 * (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and 
 * (e) e-money accounts.
 * 
 * <p>Java class for PCA1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCA1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
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
 *         &lt;element name="OnSaleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OtherSegment" type="{http://laegler.com/openbanking/soap/model}OtherSegment1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PCAMarketingState" type="{http://laegler.com/openbanking/soap/model}PCAMarketingState" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Segment" type="{http://laegler.com/openbanking/soap/model}Segment5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCA1", propOrder = {
    "identification",
    "name",
    "notes",
    "onSaleIndicator",
    "otherSegment",
    "pcaMarketingState",
    "segment"
})
public class PCA1 {

    @XmlElement(name = "Identification", required = true)
    protected String identification;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OnSaleIndicator")
    protected Boolean onSaleIndicator;
    @XmlElement(name = "OtherSegment")
    protected List<OtherSegment1> otherSegment;
    @XmlElement(name = "PCAMarketingState", required = true)
    protected List<PCAMarketingState> pcaMarketingState;
    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected List<Segment5> segment;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the onSaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnSaleIndicator() {
        return onSaleIndicator;
    }

    /**
     * Sets the value of the onSaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnSaleIndicator(Boolean value) {
        this.onSaleIndicator = value;
    }

    /**
     * Gets the value of the otherSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherSegment1 }
     * 
     * 
     */
    public List<OtherSegment1> getOtherSegment() {
        if (otherSegment == null) {
            otherSegment = new ArrayList<OtherSegment1>();
        }
        return this.otherSegment;
    }

    /**
     * Gets the value of the pcaMarketingState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pcaMarketingState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCAMarketingState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCAMarketingState }
     * 
     * 
     */
    public List<PCAMarketingState> getPCAMarketingState() {
        if (pcaMarketingState == null) {
            pcaMarketingState = new ArrayList<PCAMarketingState>();
        }
        return this.pcaMarketingState;
    }

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment5 }
     * 
     * 
     */
    public List<Segment5> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment5>();
        }
        return this.segment;
    }

}
