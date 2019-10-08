
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="requestBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "requestBody"
})
@XmlRootElement(name = "POST_RegisteraclientbywayofaSoftwareStatementAssertion_InputMessage")
public class POSTRegisteraclientbywayofaSoftwareStatementAssertionInputMessage {

    protected String requestBody;

    /**
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBody(String value) {
        this.requestBody = value;
    }

}
