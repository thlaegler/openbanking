
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
 *         &lt;element name="If-Modified-Since" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="If-None-Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ifModifiedSince",
    "ifNoneMatch"
})
@XmlRootElement(name = "GET_Branches_GET_InputMessage")
public class GETBranchesGETInputMessage {

    @XmlElement(name = "If-Modified-Since")
    protected String ifModifiedSince;
    @XmlElement(name = "If-None-Match")
    protected String ifNoneMatch;

    /**
     * Gets the value of the ifModifiedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfModifiedSince() {
        return ifModifiedSince;
    }

    /**
     * Sets the value of the ifModifiedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfModifiedSince(String value) {
        this.ifModifiedSince = value;
    }

    /**
     * Gets the value of the ifNoneMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    /**
     * Sets the value of the ifNoneMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoneMatch(String value) {
        this.ifNoneMatch = value;
    }

}
