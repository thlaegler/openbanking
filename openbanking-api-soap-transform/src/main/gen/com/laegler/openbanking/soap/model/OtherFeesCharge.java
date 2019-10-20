
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 * 
 * <p>Java class for OtherFeesCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFeesCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeChargeCap" type="{http://laegler.com/openbanking/soap/model}FeeChargeCap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeChargeDetail" type="{http://laegler.com/openbanking/soap/model}FeeChargeDetail" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OtherTariffType" type="{http://laegler.com/openbanking/soap/model}OtherTariffType" minOccurs="0"/&gt;
 *         &lt;element name="TariffName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="350"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TariffType" type="{http://laegler.com/openbanking/soap/model}TariffType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFeesCharge", propOrder = {
    "feeChargeCap",
    "feeChargeDetail",
    "otherTariffType",
    "tariffName",
    "tariffType"
})
public class OtherFeesCharge {

    @XmlElement(name = "FeeChargeCap")
    protected List<FeeChargeCap> feeChargeCap;
    @XmlElement(name = "FeeChargeDetail", required = true)
    protected List<FeeChargeDetail> feeChargeDetail;
    @XmlElement(name = "OtherTariffType")
    protected OtherTariffType otherTariffType;
    @XmlElement(name = "TariffName")
    protected String tariffName;
    @XmlElement(name = "TariffType")
    @XmlSchemaType(name = "string")
    protected TariffType tariffType;

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
     * {@link FeeChargeCap }
     * 
     * 
     */
    public List<FeeChargeCap> getFeeChargeCap() {
        if (feeChargeCap == null) {
            feeChargeCap = new ArrayList<FeeChargeCap>();
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
     * {@link FeeChargeDetail }
     * 
     * 
     */
    public List<FeeChargeDetail> getFeeChargeDetail() {
        if (feeChargeDetail == null) {
            feeChargeDetail = new ArrayList<FeeChargeDetail>();
        }
        return this.feeChargeDetail;
    }

    /**
     * Gets the value of the otherTariffType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTariffType }
     *     
     */
    public OtherTariffType getOtherTariffType() {
        return otherTariffType;
    }

    /**
     * Sets the value of the otherTariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTariffType }
     *     
     */
    public void setOtherTariffType(OtherTariffType value) {
        this.otherTariffType = value;
    }

    /**
     * Gets the value of the tariffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffName() {
        return tariffName;
    }

    /**
     * Sets the value of the tariffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffName(String value) {
        this.tariffName = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link TariffType }
     *     
     */
    public TariffType getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffType }
     *     
     */
    public void setTariffType(TariffType value) {
        this.tariffType = value;
    }

}
