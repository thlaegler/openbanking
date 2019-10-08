
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Data15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Data15"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beneficiary" type="{http://laegler.com/openbanking/soap/model}OBBeneficiary3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Data15", propOrder = {
    "beneficiary"
})
public class Data15 {

    @XmlElement(name = "Beneficiary")
    protected List<OBBeneficiary3> beneficiary;

    /**
     * Gets the value of the beneficiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBBeneficiary3 }
     * 
     * 
     */
    public List<OBBeneficiary3> getBeneficiary() {
        if (beneficiary == null) {
            beneficiary = new ArrayList<OBBeneficiary3>();
        }
        return this.beneficiary;
    }

}
