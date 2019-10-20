
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
 * Provides further details on a statement resource.
 * 
 * <p>Java class for OBStatement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBStatement2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StatementAmount" type="{http://laegler.com/openbanking/soap/model}StatementAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementBenefit" type="{http://laegler.com/openbanking/soap/model}StatementBenefit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementDateTime" type="{http://laegler.com/openbanking/soap/model}StatementDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatementFee" type="{http://laegler.com/openbanking/soap/model}StatementFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatementInterest" type="{http://laegler.com/openbanking/soap/model}StatementInterest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementRate" type="{http://laegler.com/openbanking/soap/model}StatementRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StatementReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatementValue" type="{http://laegler.com/openbanking/soap/model}StatementValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://laegler.com/openbanking/soap/model}OBExternalStatementType1Code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBStatement2", propOrder = {
    "accountId",
    "creationDateTime",
    "endDateTime",
    "startDateTime",
    "statementAmount",
    "statementBenefit",
    "statementDateTime",
    "statementDescription",
    "statementFee",
    "statementId",
    "statementInterest",
    "statementRate",
    "statementReference",
    "statementValue",
    "type"
})
public class OBStatement2 {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "EndDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "StartDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "StatementAmount")
    protected List<StatementAmount> statementAmount;
    @XmlElement(name = "StatementBenefit")
    protected List<StatementBenefit> statementBenefit;
    @XmlElement(name = "StatementDateTime")
    protected List<StatementDateTime> statementDateTime;
    @XmlElement(name = "StatementDescription")
    protected List<String> statementDescription;
    @XmlElement(name = "StatementFee")
    protected List<StatementFee> statementFee;
    @XmlElement(name = "StatementId")
    protected String statementId;
    @XmlElement(name = "StatementInterest")
    protected List<StatementInterest> statementInterest;
    @XmlElement(name = "StatementRate")
    protected List<StatementRate> statementRate;
    @XmlElement(name = "StatementReference")
    protected String statementReference;
    @XmlElement(name = "StatementValue")
    protected List<StatementValue> statementValue;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OBExternalStatementType1Code type;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
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
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the statementAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementAmount }
     * 
     * 
     */
    public List<StatementAmount> getStatementAmount() {
        if (statementAmount == null) {
            statementAmount = new ArrayList<StatementAmount>();
        }
        return this.statementAmount;
    }

    /**
     * Gets the value of the statementBenefit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementBenefit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementBenefit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementBenefit }
     * 
     * 
     */
    public List<StatementBenefit> getStatementBenefit() {
        if (statementBenefit == null) {
            statementBenefit = new ArrayList<StatementBenefit>();
        }
        return this.statementBenefit;
    }

    /**
     * Gets the value of the statementDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementDateTime }
     * 
     * 
     */
    public List<StatementDateTime> getStatementDateTime() {
        if (statementDateTime == null) {
            statementDateTime = new ArrayList<StatementDateTime>();
        }
        return this.statementDateTime;
    }

    /**
     * Gets the value of the statementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatementDescription() {
        if (statementDescription == null) {
            statementDescription = new ArrayList<String>();
        }
        return this.statementDescription;
    }

    /**
     * Gets the value of the statementFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementFee }
     * 
     * 
     */
    public List<StatementFee> getStatementFee() {
        if (statementFee == null) {
            statementFee = new ArrayList<StatementFee>();
        }
        return this.statementFee;
    }

    /**
     * Gets the value of the statementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementId(String value) {
        this.statementId = value;
    }

    /**
     * Gets the value of the statementInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementInterest }
     * 
     * 
     */
    public List<StatementInterest> getStatementInterest() {
        if (statementInterest == null) {
            statementInterest = new ArrayList<StatementInterest>();
        }
        return this.statementInterest;
    }

    /**
     * Gets the value of the statementRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementRate }
     * 
     * 
     */
    public List<StatementRate> getStatementRate() {
        if (statementRate == null) {
            statementRate = new ArrayList<StatementRate>();
        }
        return this.statementRate;
    }

    /**
     * Gets the value of the statementReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementReference() {
        return statementReference;
    }

    /**
     * Sets the value of the statementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementReference(String value) {
        this.statementReference = value;
    }

    /**
     * Gets the value of the statementValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementValue }
     * 
     * 
     */
    public List<StatementValue> getStatementValue() {
        if (statementValue == null) {
            statementValue = new ArrayList<StatementValue>();
        }
        return this.statementValue;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OBExternalStatementType1Code }
     *     
     */
    public OBExternalStatementType1Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBExternalStatementType1Code }
     *     
     */
    public void setType(OBExternalStatementType1Code value) {
        this.type = value;
    }

}
