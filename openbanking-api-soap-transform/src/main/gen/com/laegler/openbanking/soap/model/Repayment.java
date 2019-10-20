
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Repayment details of the CCC product
 * 
 * <p>Java class for Repayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinBalanceRepaymentAmount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,14}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MinBalanceRepaymentRate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NonRepaymentFeeCharges" type="{http://laegler.com/openbanking/soap/model}NonRepaymentFeeCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RepaymentAllocation" type="{http://laegler.com/openbanking/soap/model}RepaymentAllocation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repayment", propOrder = {
    "minBalanceRepaymentAmount",
    "minBalanceRepaymentRate",
    "nonRepaymentFeeCharges",
    "notes",
    "repaymentAllocation"
})
public class Repayment {

    @XmlElement(name = "MinBalanceRepaymentAmount")
    protected String minBalanceRepaymentAmount;
    @XmlElement(name = "MinBalanceRepaymentRate")
    protected String minBalanceRepaymentRate;
    @XmlElement(name = "NonRepaymentFeeCharges")
    protected List<NonRepaymentFeeCharge> nonRepaymentFeeCharges;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "RepaymentAllocation", required = true)
    protected RepaymentAllocation repaymentAllocation;

    /**
     * Gets the value of the minBalanceRepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinBalanceRepaymentAmount() {
        return minBalanceRepaymentAmount;
    }

    /**
     * Sets the value of the minBalanceRepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinBalanceRepaymentAmount(String value) {
        this.minBalanceRepaymentAmount = value;
    }

    /**
     * Gets the value of the minBalanceRepaymentRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinBalanceRepaymentRate() {
        return minBalanceRepaymentRate;
    }

    /**
     * Sets the value of the minBalanceRepaymentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinBalanceRepaymentRate(String value) {
        this.minBalanceRepaymentRate = value;
    }

    /**
     * Gets the value of the nonRepaymentFeeCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonRepaymentFeeCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonRepaymentFeeCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonRepaymentFeeCharge }
     * 
     * 
     */
    public List<NonRepaymentFeeCharge> getNonRepaymentFeeCharges() {
        if (nonRepaymentFeeCharges == null) {
            nonRepaymentFeeCharges = new ArrayList<NonRepaymentFeeCharge>();
        }
        return this.nonRepaymentFeeCharges;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the repaymentAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentAllocation }
     *     
     */
    public RepaymentAllocation getRepaymentAllocation() {
        return repaymentAllocation;
    }

    /**
     * Sets the value of the repaymentAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentAllocation }
     *     
     */
    public void setRepaymentAllocation(RepaymentAllocation value) {
        this.repaymentAllocation = value;
    }

}
