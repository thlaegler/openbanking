
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 * 
 * <p>Java class for RepaymentFeeCharges1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepaymentFeeCharges1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepaymentFeeChargeCap" type="{http://laegler.com/openbanking/soap/model}RepaymentFeeChargeCap1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepaymentFeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}RepaymentFeeChargeDetail1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepaymentFeeCharges1", propOrder = {
    "repaymentFeeChargeCap",
    "repaymentFeeChargeDetail"
})
public class RepaymentFeeCharges1 {

    @XmlElement(name = "RepaymentFeeChargeCap")
    protected List<RepaymentFeeChargeCap1> repaymentFeeChargeCap;
    @XmlElement(name = "RepaymentFeeChargeDetail", required = true)
    protected List<RepaymentFeeChargeDetail1> repaymentFeeChargeDetail;

    /**
     * Gets the value of the repaymentFeeChargeCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentFeeChargeCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentFeeChargeCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentFeeChargeCap1 }
     * 
     * 
     */
    public List<RepaymentFeeChargeCap1> getRepaymentFeeChargeCap() {
        if (repaymentFeeChargeCap == null) {
            repaymentFeeChargeCap = new ArrayList<RepaymentFeeChargeCap1>();
        }
        return this.repaymentFeeChargeCap;
    }

    /**
     * Gets the value of the repaymentFeeChargeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentFeeChargeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentFeeChargeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentFeeChargeDetail1 }
     * 
     * 
     */
    public List<RepaymentFeeChargeDetail1> getRepaymentFeeChargeDetail() {
        if (repaymentFeeChargeDetail == null) {
            repaymentFeeChargeDetail = new ArrayList<RepaymentFeeChargeDetail1>();
        }
        return this.repaymentFeeChargeDetail;
    }

}
