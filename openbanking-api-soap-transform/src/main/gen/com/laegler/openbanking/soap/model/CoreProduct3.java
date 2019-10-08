
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * SME Loan core product details.
 * 
 * <p>Java class for CoreProduct3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProduct3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EarlyPaymentFeeApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FullEarlyRepaymentAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoanApplicationFeeChargeType" type="{http://laegler.com/openbanking/soap/model}LoanApplicationFeeChargeType"/&gt;
 *         &lt;element name="Notes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OverPaymentFeeApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OverpaymentAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductURL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SalesAccessChannels" type="{http://laegler.com/openbanking/soap/model}SalesAccessChannel3" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ServicingAccessChannels" type="{http://laegler.com/openbanking/soap/model}ServicingAccessChannel3" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TcsAndCsURL"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreProduct3", propOrder = {
    "earlyPaymentFeeApplicable",
    "fullEarlyRepaymentAllowedIndicator",
    "loanApplicationFeeChargeType",
    "notes",
    "overPaymentFeeApplicable",
    "overpaymentAllowedIndicator",
    "productDescription",
    "productURL",
    "salesAccessChannels",
    "servicingAccessChannels",
    "tcsAndCsURL"
})
public class CoreProduct3 {

    @XmlElement(name = "EarlyPaymentFeeApplicable")
    protected boolean earlyPaymentFeeApplicable;
    @XmlElement(name = "FullEarlyRepaymentAllowedIndicator")
    protected Boolean fullEarlyRepaymentAllowedIndicator;
    @XmlElement(name = "LoanApplicationFeeChargeType", required = true)
    @XmlSchemaType(name = "string")
    protected LoanApplicationFeeChargeType loanApplicationFeeChargeType;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "OverPaymentFeeApplicable")
    protected boolean overPaymentFeeApplicable;
    @XmlElement(name = "OverpaymentAllowedIndicator")
    protected Boolean overpaymentAllowedIndicator;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductURL", required = true)
    protected String productURL;
    @XmlElement(name = "SalesAccessChannels", required = true)
    @XmlSchemaType(name = "string")
    protected List<SalesAccessChannel3> salesAccessChannels;
    @XmlElement(name = "ServicingAccessChannels", required = true)
    @XmlSchemaType(name = "string")
    protected List<ServicingAccessChannel3> servicingAccessChannels;
    @XmlElement(name = "TcsAndCsURL", required = true)
    protected String tcsAndCsURL;

    /**
     * Gets the value of the earlyPaymentFeeApplicable property.
     * 
     */
    public boolean isEarlyPaymentFeeApplicable() {
        return earlyPaymentFeeApplicable;
    }

    /**
     * Sets the value of the earlyPaymentFeeApplicable property.
     * 
     */
    public void setEarlyPaymentFeeApplicable(boolean value) {
        this.earlyPaymentFeeApplicable = value;
    }

    /**
     * Gets the value of the fullEarlyRepaymentAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullEarlyRepaymentAllowedIndicator() {
        return fullEarlyRepaymentAllowedIndicator;
    }

    /**
     * Sets the value of the fullEarlyRepaymentAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullEarlyRepaymentAllowedIndicator(Boolean value) {
        this.fullEarlyRepaymentAllowedIndicator = value;
    }

    /**
     * Gets the value of the loanApplicationFeeChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link LoanApplicationFeeChargeType }
     *     
     */
    public LoanApplicationFeeChargeType getLoanApplicationFeeChargeType() {
        return loanApplicationFeeChargeType;
    }

    /**
     * Sets the value of the loanApplicationFeeChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanApplicationFeeChargeType }
     *     
     */
    public void setLoanApplicationFeeChargeType(LoanApplicationFeeChargeType value) {
        this.loanApplicationFeeChargeType = value;
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
     * Gets the value of the overPaymentFeeApplicable property.
     * 
     */
    public boolean isOverPaymentFeeApplicable() {
        return overPaymentFeeApplicable;
    }

    /**
     * Sets the value of the overPaymentFeeApplicable property.
     * 
     */
    public void setOverPaymentFeeApplicable(boolean value) {
        this.overPaymentFeeApplicable = value;
    }

    /**
     * Gets the value of the overpaymentAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverpaymentAllowedIndicator() {
        return overpaymentAllowedIndicator;
    }

    /**
     * Sets the value of the overpaymentAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverpaymentAllowedIndicator(Boolean value) {
        this.overpaymentAllowedIndicator = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductURL() {
        return productURL;
    }

    /**
     * Sets the value of the productURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductURL(String value) {
        this.productURL = value;
    }

    /**
     * Gets the value of the salesAccessChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAccessChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAccessChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAccessChannel3 }
     * 
     * 
     */
    public List<SalesAccessChannel3> getSalesAccessChannels() {
        if (salesAccessChannels == null) {
            salesAccessChannels = new ArrayList<SalesAccessChannel3>();
        }
        return this.salesAccessChannels;
    }

    /**
     * Gets the value of the servicingAccessChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicingAccessChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicingAccessChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicingAccessChannel3 }
     * 
     * 
     */
    public List<ServicingAccessChannel3> getServicingAccessChannels() {
        if (servicingAccessChannels == null) {
            servicingAccessChannels = new ArrayList<ServicingAccessChannel3>();
        }
        return this.servicingAccessChannels;
    }

    /**
     * Gets the value of the tcsAndCsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcsAndCsURL() {
        return tcsAndCsURL;
    }

    /**
     * Sets the value of the tcsAndCsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcsAndCsURL(String value) {
        this.tcsAndCsURL = value;
    }

}
