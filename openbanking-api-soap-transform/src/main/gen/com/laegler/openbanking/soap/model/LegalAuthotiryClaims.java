
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Claims sourced from a legal authority(e.g. Companies House) - can be applied to either TPPs to ASPSP
 * 
 * <p>Java class for LegalAuthotiryClaims complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalAuthotiryClaims"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalAuthorityClaims" type="{http://laegler.com/openbanking/soap/model}LegalAuthorityClaim" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalAuthotiryClaims", propOrder = {
    "legalAuthorityClaims"
})
public class LegalAuthotiryClaims {

    @XmlElement(name = "LegalAuthorityClaims")
    protected List<LegalAuthorityClaim> legalAuthorityClaims;

    /**
     * Gets the value of the legalAuthorityClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalAuthorityClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalAuthorityClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalAuthorityClaim }
     * 
     * 
     */
    public List<LegalAuthorityClaim> getLegalAuthorityClaims() {
        if (legalAuthorityClaims == null) {
            legalAuthorityClaims = new ArrayList<LegalAuthorityClaim>();
        }
        return this.legalAuthorityClaims;
    }

}
