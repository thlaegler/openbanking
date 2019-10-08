
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the interest that may be payable to the BCA account holders
 * 
 * <p>Java class for CreditInterest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditInterest1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierBandSet" type="{http://laegler.com/openbanking/soap/model}TierBandSet1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditInterest1", propOrder = {
    "tierBandSet"
})
public class CreditInterest1 {

    @XmlElement(name = "TierBandSet", required = true)
    protected List<TierBandSet1> tierBandSet;

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
     * {@link TierBandSet1 }
     * 
     * 
     */
    public List<TierBandSet1> getTierBandSet() {
        if (tierBandSet == null) {
            tierBandSet = new ArrayList<TierBandSet1>();
        }
        return this.tierBandSet;
    }

}
