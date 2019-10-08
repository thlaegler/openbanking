
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
 * <p>Java class for Data46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data46"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authorisation" type="{http://laegler.com/openbanking/soap/model}Authorisation2" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://laegler.com/openbanking/soap/model}Charge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConsentId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CutOffDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRateInformation" type="{http://laegler.com/openbanking/soap/model}ExchangeRateInformation2" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedSettlementDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Initiation" type="{http://laegler.com/openbanking/soap/model}Initiation16"/&gt;
 *         &lt;element name="SCASupportData" type="{http://laegler.com/openbanking/soap/model}SCASupportData" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://laegler.com/openbanking/soap/model}Status2"/&gt;
 *         &lt;element name="StatusUpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data46", propOrder = {
    "authorisation",
    "charges",
    "consentId",
    "creationDateTime",
    "cutOffDateTime",
    "exchangeRateInformation",
    "expectedExecutionDateTime",
    "expectedSettlementDateTime",
    "initiation",
    "scaSupportData",
    "status",
    "statusUpdateDateTime"
})
public class Data46 {

    @XmlElement(name = "Authorisation")
    protected Authorisation2 authorisation;
    @XmlElement(name = "Charges")
    protected List<Charge> charges;
    @XmlElement(name = "ConsentId", required = true)
    protected String consentId;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "CutOffDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutOffDateTime;
    @XmlElement(name = "ExchangeRateInformation")
    protected ExchangeRateInformation2 exchangeRateInformation;
    @XmlElement(name = "ExpectedExecutionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedExecutionDateTime;
    @XmlElement(name = "ExpectedSettlementDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedSettlementDateTime;
    @XmlElement(name = "Initiation", required = true)
    protected Initiation16 initiation;
    @XmlElement(name = "SCASupportData")
    protected SCASupportData scaSupportData;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected Status2 status;
    @XmlElement(name = "StatusUpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateDateTime;

    /**
     * Gets the value of the authorisation property.
     * 
     * @return
     *     possible object is
     *     {@link Authorisation2 }
     *     
     */
    public Authorisation2 getAuthorisation() {
        return authorisation;
    }

    /**
     * Sets the value of the authorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorisation2 }
     *     
     */
    public void setAuthorisation(Authorisation2 value) {
        this.authorisation = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge }
     * 
     * 
     */
    public List<Charge> getCharges() {
        if (charges == null) {
            charges = new ArrayList<Charge>();
        }
        return this.charges;
    }

    /**
     * Gets the value of the consentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentId() {
        return consentId;
    }

    /**
     * Sets the value of the consentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentId(String value) {
        this.consentId = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the cutOffDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutOffDateTime() {
        return cutOffDateTime;
    }

    /**
     * Sets the value of the cutOffDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutOffDateTime(XMLGregorianCalendar value) {
        this.cutOffDateTime = value;
    }

    /**
     * Gets the value of the exchangeRateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateInformation2 }
     *     
     */
    public ExchangeRateInformation2 getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    /**
     * Sets the value of the exchangeRateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateInformation2 }
     *     
     */
    public void setExchangeRateInformation(ExchangeRateInformation2 value) {
        this.exchangeRateInformation = value;
    }

    /**
     * Gets the value of the expectedExecutionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    /**
     * Sets the value of the expectedExecutionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedExecutionDateTime(XMLGregorianCalendar value) {
        this.expectedExecutionDateTime = value;
    }

    /**
     * Gets the value of the expectedSettlementDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    /**
     * Sets the value of the expectedSettlementDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedSettlementDateTime(XMLGregorianCalendar value) {
        this.expectedSettlementDateTime = value;
    }

    /**
     * Gets the value of the initiation property.
     * 
     * @return
     *     possible object is
     *     {@link Initiation16 }
     *     
     */
    public Initiation16 getInitiation() {
        return initiation;
    }

    /**
     * Sets the value of the initiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Initiation16 }
     *     
     */
    public void setInitiation(Initiation16 value) {
        this.initiation = value;
    }

    /**
     * Gets the value of the scaSupportData property.
     * 
     * @return
     *     possible object is
     *     {@link SCASupportData }
     *     
     */
    public SCASupportData getSCASupportData() {
        return scaSupportData;
    }

    /**
     * Sets the value of the scaSupportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCASupportData }
     *     
     */
    public void setSCASupportData(SCASupportData value) {
        this.scaSupportData = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status2 }
     *     
     */
    public Status2 getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status2 }
     *     
     */
    public void setStatus(Status2 value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    /**
     * Sets the value of the statusUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdateDateTime(XMLGregorianCalendar value) {
        this.statusUpdateDateTime = value;
    }

}
