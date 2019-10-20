
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Party's relationships with other resources.
 * 
 * <p>Java class for OBPartyRelationships1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBPartyRelationships1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://laegler.com/openbanking/soap/model}Account4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBPartyRelationships1", propOrder = {
    "account"
})
public class OBPartyRelationships1 {

    @XmlElement(name = "Account")
    protected Account4 account;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account4 }
     *     
     */
    public Account4 getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account4 }
     *     
     */
    public void setAccount(Account4 value) {
        this.account = value;
    }

}
