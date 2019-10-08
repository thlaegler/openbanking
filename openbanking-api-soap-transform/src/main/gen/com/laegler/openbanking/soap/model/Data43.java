
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data43"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FundsAvailableResult" type="{http://laegler.com/openbanking/soap/model}FundsAvailableResult" minOccurs="0"/&gt;
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
@XmlType(name = "Data43", propOrder = {
    "fundsAvailableResult",
    "supplementaryData"
})
public class Data43 {

    @XmlElement(name = "FundsAvailableResult")
    protected FundsAvailableResult fundsAvailableResult;
    @XmlElement(name = "SupplementaryData")
    protected Object supplementaryData;

    /**
     * Gets the value of the fundsAvailableResult property.
     * 
     * @return
     *     possible object is
     *     {@link FundsAvailableResult }
     *     
     */
    public FundsAvailableResult getFundsAvailableResult() {
        return fundsAvailableResult;
    }

    /**
     * Sets the value of the fundsAvailableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundsAvailableResult }
     *     
     */
    public void setFundsAvailableResult(FundsAvailableResult value) {
        this.fundsAvailableResult = value;
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
