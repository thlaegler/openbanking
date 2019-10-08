
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of fees and charges which are not associated with either loan interest or repayments
 * 
 * <p>Java class for OtherFeesCharges5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFeesCharges5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeChargeCap" type="{http://laegler.com/openbanking/soap/model}FeeChargeCap9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}FeeChargeDetail6" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFeesCharges5", propOrder = {
    "feeChargeCap",
    "feeChargeDetail"
})
public class OtherFeesCharges5 {

    @XmlElement(name = "FeeChargeCap")
    protected List<FeeChargeCap9> feeChargeCap;
    @XmlElement(name = "FeeChargeDetail", required = true)
    protected List<FeeChargeDetail6> feeChargeDetail;

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
     * {@link FeeChargeCap9 }
     * 
     * 
     */
    public List<FeeChargeCap9> getFeeChargeCap() {
        if (feeChargeCap == null) {
            feeChargeCap = new ArrayList<FeeChargeCap9>();
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
     * {@link FeeChargeDetail6 }
     * 
     * 
     */
    public List<FeeChargeDetail6> getFeeChargeDetail() {
        if (feeChargeDetail == null) {
            feeChargeDetail = new ArrayList<FeeChargeDetail6>();
        }
        return this.feeChargeDetail;
    }

}
