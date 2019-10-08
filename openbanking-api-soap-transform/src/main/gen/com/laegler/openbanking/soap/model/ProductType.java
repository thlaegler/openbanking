
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BusinessCurrentAccount"/&gt;
 *     &lt;enumeration value="CommercialCreditCard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PersonalCurrentAccount"/&gt;
 *     &lt;enumeration value="SMELoan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {

    @XmlEnumValue("BusinessCurrentAccount")
    BUSINESS_CURRENT_ACCOUNT("BusinessCurrentAccount"),
    @XmlEnumValue("CommercialCreditCard")
    COMMERCIAL_CREDIT_CARD("CommercialCreditCard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PersonalCurrentAccount")
    PERSONAL_CURRENT_ACCOUNT("PersonalCurrentAccount"),
    @XmlEnumValue("SMELoan")
    SME_LOAN("SMELoan");
    private final String value;

    ProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductType fromValue(String v) {
        for (ProductType c: ProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
