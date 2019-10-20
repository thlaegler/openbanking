
package com.laegler.openbanking.soap.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBEventPolling1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBEventPolling1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ack" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxEvents" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="returnImmediately" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="setErrs" type="{http://laegler.com/openbanking/soap/model}SetErrs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBEventPolling1", propOrder = {
    "ack",
    "maxEvents",
    "returnImmediately",
    "setErrs"
})
public class OBEventPolling1 {

    protected List<String> ack;
    protected BigInteger maxEvents;
    protected Boolean returnImmediately;
    protected SetErrs setErrs;

    /**
     * Gets the value of the ack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAck() {
        if (ack == null) {
            ack = new ArrayList<String>();
        }
        return this.ack;
    }

    /**
     * Gets the value of the maxEvents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxEvents() {
        return maxEvents;
    }

    /**
     * Sets the value of the maxEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxEvents(BigInteger value) {
        this.maxEvents = value;
    }

    /**
     * Gets the value of the returnImmediately property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnImmediately() {
        return returnImmediately;
    }

    /**
     * Sets the value of the returnImmediately property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnImmediately(Boolean value) {
        this.returnImmediately = value;
    }

    /**
     * Gets the value of the setErrs property.
     * 
     * @return
     *     possible object is
     *     {@link SetErrs }
     *     
     */
    public SetErrs getSetErrs() {
        return setErrs;
    }

    /**
     * Sets the value of the setErrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetErrs }
     *     
     */
    public void setSetErrs(SetErrs value) {
        this.setErrs = value;
    }

}
