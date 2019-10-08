
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
 * <p>Java class for FeaturesAndBenefits1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturesAndBenefits1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeatureBenefitGroup" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitGroup1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeatureBenefitItem" type="{http://laegler.com/openbanking/soap/model}FeatureBenefitItem2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesAndBenefits1", propOrder = {
    "featureBenefitGroup",
    "featureBenefitItem"
})
public class FeaturesAndBenefits1 {

    @XmlElement(name = "FeatureBenefitGroup")
    protected List<FeatureBenefitGroup1> featureBenefitGroup;
    @XmlElement(name = "FeatureBenefitItem")
    protected List<FeatureBenefitItem2> featureBenefitItem;

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
     * {@link FeatureBenefitGroup1 }
     * 
     * 
     */
    public List<FeatureBenefitGroup1> getFeatureBenefitGroup() {
        if (featureBenefitGroup == null) {
            featureBenefitGroup = new ArrayList<FeatureBenefitGroup1>();
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
     * {@link FeatureBenefitItem2 }
     * 
     * 
     */
    public List<FeatureBenefitItem2> getFeatureBenefitItem() {
        if (featureBenefitItem == null) {
            featureBenefitItem = new ArrayList<FeatureBenefitItem2>();
        }
        return this.featureBenefitItem;
    }

}
