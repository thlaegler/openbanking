
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCreditCardResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialCreditCardResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://laegler.com/openbanking/soap/model}Data4" maxOccurs="unbounded"/&gt;
 *         &lt;element name="meta" type="{http://laegler.com/openbanking/soap/model}Metadata5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialCreditCardResponse", propOrder = {
    "data",
    "meta"
})
public class CommercialCreditCardResponse {

    @XmlElement(required = true)
    protected List<Data4> data;
    @XmlElement(required = true)
    protected Metadata5 meta;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Data4 }
     * 
     * 
     */
    public List<Data4> getData() {
        if (data == null) {
            data = new ArrayList<Data4>();
        }
        return this.data;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata5 }
     *     
     */
    public Metadata5 getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata5 }
     *     
     */
    public void setMeta(Metadata5 value) {
        this.meta = value;
    }

}
