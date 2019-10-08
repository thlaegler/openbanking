
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.
 * 
 * <p>Java class for Initiation12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Initiation12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControlSum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DebtorAccount" type="{http://laegler.com/openbanking/soap/model}DebtorAccount2" minOccurs="0"/&gt;
 *         &lt;element name="FileHash"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="44"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FileReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FileType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalInstrument" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumberOfTransactions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{1,15}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RemittanceInformation" type="{http://laegler.com/openbanking/soap/model}RemittanceInformation" minOccurs="0"/&gt;
 *         &lt;element name="RequestedExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SupplementaryData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Initiation12", propOrder = {
    "controlSum",
    "debtorAccount",
    "fileHash",
    "fileReference",
    "fileType",
    "localInstrument",
    "numberOfTransactions",
    "remittanceInformation",
    "requestedExecutionDateTime",
    "supplementaryData"
})
public class Initiation12 {

    @XmlElement(name = "ControlSum")
    protected Double controlSum;
    @XmlElement(name = "DebtorAccount")
    protected DebtorAccount2 debtorAccount;
    @XmlElement(name = "FileHash", required = true)
    protected String fileHash;
    @XmlElement(name = "FileReference")
    protected String fileReference;
    @XmlElement(name = "FileType", required = true)
    protected String fileType;
    @XmlElement(name = "LocalInstrument")
    protected String localInstrument;
    @XmlElement(name = "NumberOfTransactions")
    protected String numberOfTransactions;
    @XmlElement(name = "RemittanceInformation")
    protected RemittanceInformation remittanceInformation;
    @XmlElement(name = "RequestedExecutionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedExecutionDateTime;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the controlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getControlSum() {
        return controlSum;
    }

    /**
     * Sets the value of the controlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setControlSum(Double value) {
        this.controlSum = value;
    }

    /**
     * Gets the value of the debtorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorAccount2 }
     *     
     */
    public DebtorAccount2 getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Sets the value of the debtorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorAccount2 }
     *     
     */
    public void setDebtorAccount(DebtorAccount2 value) {
        this.debtorAccount = value;
    }

    /**
     * Gets the value of the fileHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * Sets the value of the fileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHash(String value) {
        this.fileHash = value;
    }

    /**
     * Gets the value of the fileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReference() {
        return fileReference;
    }

    /**
     * Sets the value of the fileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReference(String value) {
        this.fileReference = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the localInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalInstrument() {
        return localInstrument;
    }

    /**
     * Sets the value of the localInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalInstrument(String value) {
        this.localInstrument = value;
    }

    /**
     * Gets the value of the numberOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    /**
     * Sets the value of the numberOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfTransactions(String value) {
        this.numberOfTransactions = value;
    }

    /**
     * Gets the value of the remittanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation }
     *     
     */
    public RemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * Sets the value of the remittanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation }
     *     
     */
    public void setRemittanceInformation(RemittanceInformation value) {
        this.remittanceInformation = value;
    }

    /**
     * Gets the value of the requestedExecutionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    /**
     * Sets the value of the requestedExecutionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedExecutionDateTime(XMLGregorianCalendar value) {
        this.requestedExecutionDateTime = value;
    }

    /**
     * Gets the value of the supplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplementaryData() {
        return supplementaryData;
    }

    /**
     * Sets the value of the supplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplementaryData(Object value) {
        this.supplementaryData = value;
    }

}
