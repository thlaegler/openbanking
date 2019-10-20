
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SCIM2.0SearchRequestMessage" type="{http://laegler.com/openbanking/soap/model}SearchRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scim20SearchRequestMessage"
})
@XmlRootElement(name = "OBQualifiedTrustServiceProviders_POST_SearchforoneormoreresourcesusingHTTPPOST_InputMessage")
public class OBQualifiedTrustServiceProvidersPOSTSearchforoneormoreresourcesusingHTTPPOSTInputMessage {

    @XmlElement(name = "SCIM2.0SearchRequestMessage")
    protected SearchRequest scim20SearchRequestMessage;

    /**
     * Gets the value of the scim20SearchRequestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRequest }
     *     
     */
    public SearchRequest getSCIM20SearchRequestMessage() {
        return scim20SearchRequestMessage;
    }

    /**
     * Sets the value of the scim20SearchRequestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRequest }
     *     
     */
    public void setSCIM20SearchRequestMessage(SearchRequest value) {
        this.scim20SearchRequestMessage = value;
    }

}
