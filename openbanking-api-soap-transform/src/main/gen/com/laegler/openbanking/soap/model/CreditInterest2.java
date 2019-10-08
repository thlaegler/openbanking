
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the interest that may be payable to the Account holders
 * 
 * <p>Java class for CreditInterest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditInterest2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierBandSet" type="{http://laegler.com/openbanking/soap/model}TierBandSet2" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditInterest2", propOrder = {
    "tierBandSet"
})
public class CreditInterest2 {

    @XmlElement(name = "TierBandSet", required = true)
    protected List<TierBandSet2> tierBandSet;

    /**
     * Gets the value of the tierBandSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tierBandSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTierBandSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TierBandSet2 }
     * 
     * 
     */
    public List<TierBandSet2> getTierBandSet() {
        if (tierBandSet == null) {
            tierBandSet = new ArrayList<TierBandSet2>();
        }
        return this.tierBandSet;
    }

}
