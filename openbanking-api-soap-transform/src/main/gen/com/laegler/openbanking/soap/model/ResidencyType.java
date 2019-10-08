
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Incorporated"/&gt;
 *     &lt;enumeration value="Owner"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Trading"/&gt;
 *     &lt;enumeration value="CompanyTax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidencyType")
@XmlEnum
public enum ResidencyType {

    @XmlEnumValue("Incorporated")
    INCORPORATED("Incorporated"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Trading")
    TRADING("Trading"),
    @XmlEnumValue("CompanyTax")
    COMPANY_TAX("CompanyTax");
    private final String value;

    ResidencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidencyType fromValue(String v) {
        for (ResidencyType c: ResidencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
