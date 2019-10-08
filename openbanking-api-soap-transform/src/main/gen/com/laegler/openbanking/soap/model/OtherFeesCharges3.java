
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 * 
 * <p>Java class for OtherFeesCharges3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFeesCharges3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeChargeCap" type="{http://laegler.com/openbanking/soap/model}FeeChargeCap6" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}FeeChargeDetail4" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFeesCharges3", propOrder = {
    "feeChargeCap",
    "feeChargeDetail"
})
public class OtherFeesCharges3 {

    @XmlElement(name = "FeeChargeCap")
    protected List<FeeChargeCap6> feeChargeCap;
    @XmlElement(name = "FeeChargeDetail", required = true)
    protected List<FeeChargeDetail4> feeChargeDetail;

    /**
     * Gets the value of the feeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeChargeCap6 }
     * 
     * 
     */
    public List<FeeChargeCap6> getFeeChargeCap() {
        if (feeChargeCap == null) {
            feeChargeCap = new ArrayList<FeeChargeCap6>();
        }
        return this.feeChargeCap;
    }

    /**
     * Gets the value of the feeChargeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeChargeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeChargeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeChargeDetail4 }
     * 
     * 
     */
    public List<FeeChargeDetail4> getFeeChargeDetail() {
        if (feeChargeDetail == null) {
            feeChargeDetail = new ArrayList<FeeChargeDetail4>();
        }
        return this.feeChargeDetail;
    }

}
