
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
 * <p>Java class for Data47 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data47"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="ExchangeRateInformation" type="{http://laegler.com/openbanking/soap/model}ExchangeRateInformation2" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedSettlementDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Initiation" type="{http://laegler.com/openbanking/soap/model}Initiation16"/&gt;
 *         &lt;element name="InternationalPaymentId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MultiAuthorisation" type="{http://laegler.com/openbanking/soap/model}MultiAuthorisation" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://laegler.com/openbanking/soap/model}Status4"/&gt;
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
@XmlType(name = "Data47", propOrder = {
    "charges",
    "consentId",
    "creationDateTime",
    "exchangeRateInformation",
    "expectedExecutionDateTime",
    "expectedSettlementDateTime",
    "initiation",
    "internationalPaymentId",
    "multiAuthorisation",
    "status",
    "statusUpdateDateTime"
})
public class Data47 {

    @XmlElement(name = "Charges")
    protected List<Charge> charges;
    @XmlElement(name = "ConsentId", required = true)
    protected String consentId;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
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
    @XmlElement(name = "InternationalPaymentId", required = true)
    protected String internationalPaymentId;
    @XmlElement(name = "MultiAuthorisation")
    protected MultiAuthorisation multiAuthorisation;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected Status4 status;
    @XmlElement(name = "StatusUpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdateDateTime;

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
     * Gets the value of the internationalPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPaymentId() {
        return internationalPaymentId;
    }

    /**
     * Sets the value of the internationalPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPaymentId(String value) {
        this.internationalPaymentId = value;
    }

    /**
     * Gets the value of the multiAuthorisation property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAuthorisation }
     *     
     */
    public MultiAuthorisation getMultiAuthorisation() {
        return multiAuthorisation;
    }

    /**
     * Sets the value of the multiAuthorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAuthorisation }
     *     
     */
    public void setMultiAuthorisation(MultiAuthorisation value) {
        this.multiAuthorisation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status4 }
     *     
     */
    public Status4 getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4 }
     *     
     */
    public void setStatus(Status4 value) {
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
