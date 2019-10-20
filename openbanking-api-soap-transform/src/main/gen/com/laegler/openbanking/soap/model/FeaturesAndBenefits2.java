
package com.laegler.openbanking.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Feature And Benefits Details
 * 
 * <p>Java class for FeaturesAndBenefits2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturesAndBenefits2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Card" type="{http://laegler.com/openbanking/soap/model}Card1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeatureBenefitGroup" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitGroup2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeatureBenefitItem" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitItem4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MobileWallet" type="{http://laegler.com/openbanking/soap/model}MobileWallet1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesAndBenefits2", propOrder = {
    "card",
    "featureBenefitGroup",
    "featureBenefitItem",
    "mobileWallet"
})
public class FeaturesAndBenefits2 {

    @XmlElement(name = "Card")
    protected List<Card1> card;
    @XmlElement(name = "FeatureBenefitGroup")
    protected List<FeatureBenefitGroup2> featureBenefitGroup;
    @XmlElement(name = "FeatureBenefitItem")
    protected List<FeatureBenefitItem4> featureBenefitItem;
    @XmlElement(name = "MobileWallet")
    protected List<MobileWallet1> mobileWallet;

    /**
     * Gets the value of the card property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the card property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Card1 }
     * 
     * 
     */
    public List<Card1> getCard() {
        if (card == null) {
            card = new ArrayList<Card1>();
        }
        return this.card;
    }

    /**
     * Gets the value of the featureBenefitGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBenefitGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBenefitGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureBenefitGroup2 }
     * 
     * 
     */
    public List<FeatureBenefitGroup2> getFeatureBenefitGroup() {
        if (featureBenefitGroup == null) {
            featureBenefitGroup = new ArrayList<FeatureBenefitGroup2>();
        }
        return this.featureBenefitGroup;
    }

    /**
     * Gets the value of the featureBenefitItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureBenefitItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureBenefitItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureBenefitItem4 }
     * 
     * 
     */
    public List<FeatureBenefitItem4> getFeatureBenefitItem() {
        if (featureBenefitItem == null) {
            featureBenefitItem = new ArrayList<FeatureBenefitItem4>();
        }
        return this.featureBenefitItem;
    }

    /**
     * Gets the value of the mobileWallet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileWallet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileWallet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileWallet1 }
     * 
     * 
     */
    public List<MobileWallet1> getMobileWallet() {
        if (mobileWallet == null) {
            mobileWallet = new ArrayList<MobileWallet1>();
        }
        return this.mobileWallet;
    }

}
