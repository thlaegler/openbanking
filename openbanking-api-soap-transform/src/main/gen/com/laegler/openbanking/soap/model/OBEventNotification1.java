
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The resource-update event.
 * 
 * <p>Java class for OBEventNotification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEventNotification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aud"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="events" type="{http://laegler.com/openbanking/soap/model}OBEvent1"/&gt;
 *         &lt;element name="iat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="iss"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jti"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sub"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toe"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="txn"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
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
@XmlType(name = "OBEventNotification1", propOrder = {
    "aud",
    "events",
    "iat",
    "iss",
    "jti",
    "sub",
    "toe",
    "txn"
})
public class OBEventNotification1 {

    @XmlElement(required = true)
    protected String aud;
    @XmlElement(required = true)
    protected OBEvent1 events;
    @XmlElement(required = true)
    protected BigInteger iat;
    @XmlElement(required = true)
    protected String iss;
    @XmlElement(required = true)
    protected String jti;
    @XmlElement(required = true)
    protected String sub;
    @XmlElement(required = true)
    protected BigInteger toe;
    @XmlElement(required = true)
    protected String txn;

    /**
     * Gets the value of the aud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAud() {
        return aud;
    }

    /**
     * Sets the value of the aud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAud(String value) {
        this.aud = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link OBEvent1 }
     *     
     */
    public OBEvent1 getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBEvent1 }
     *     
     */
    public void setEvents(OBEvent1 value) {
        this.events = value;
    }

    /**
     * Gets the value of the iat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIat() {
        return iat;
    }

    /**
     * Sets the value of the iat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIat(BigInteger value) {
        this.iat = value;
    }

    /**
     * Gets the value of the iss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIss() {
        return iss;
    }

    /**
     * Sets the value of the iss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIss(String value) {
        this.iss = value;
    }

    /**
     * Gets the value of the jti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJti() {
        return jti;
    }

    /**
     * Sets the value of the jti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJti(String value) {
        this.jti = value;
    }

    /**
     * Gets the value of the sub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub() {
        return sub;
    }

    /**
     * Sets the value of the sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub(String value) {
        this.sub = value;
    }

    /**
     * Gets the value of the toe property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToe() {
        return toe;
    }

    /**
     * Sets the value of the toe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToe(BigInteger value) {
        this.toe = value;
    }

    /**
     * Gets the value of the txn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxn(String value) {
        this.txn = value;
    }

}
