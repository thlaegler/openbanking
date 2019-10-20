
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBCallbackUrlsResponseData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBCallbackUrlsResponseData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallbackUrl" type="{http://laegler.com/openbanking/soap/model}OBCallbackUrlResponseData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBCallbackUrlsResponseData1", propOrder = {
    "callbackUrl"
})
public class OBCallbackUrlsResponseData1 {

    @XmlElement(name = "CallbackUrl")
    protected List<OBCallbackUrlResponseData1> callbackUrl;

    /**
     * Gets the value of the callbackUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callbackUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallbackUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBCallbackUrlResponseData1 }
     * 
     * 
     */
    public List<OBCallbackUrlResponseData1> getCallbackUrl() {
        if (callbackUrl == null) {
            callbackUrl = new ArrayList<OBCallbackUrlResponseData1>();
        }
        return this.callbackUrl;
    }

}
