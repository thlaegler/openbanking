
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInterestRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankInterestRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Gross"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BankInterestRateType")
@XmlEnum
public enum BankInterestRateType {

    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BankInterestRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankInterestRateType fromValue(String v) {
        for (BankInterestRateType c: BankInterestRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
