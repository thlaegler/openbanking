
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data25 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data25"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StandingOrder" type="{http://laegler.com/openbanking/soap/model}OBStandingOrder4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data25", propOrder = {
    "standingOrder"
})
public class Data25 {

    @XmlElement(name = "StandingOrder")
    protected List<OBStandingOrder4> standingOrder;

    /**
     * Gets the value of the standingOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standingOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandingOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBStandingOrder4 }
     * 
     * 
     */
    public List<OBStandingOrder4> getStandingOrder() {
        if (standingOrder == null) {
            standingOrder = new ArrayList<OBStandingOrder4>();
        }
        return this.standingOrder;
    }

}
