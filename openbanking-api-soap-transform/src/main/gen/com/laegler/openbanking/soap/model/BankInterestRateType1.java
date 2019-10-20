
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInterestRateType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankInterestRateType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Gross"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BankInterestRateType1")
@XmlEnum
public enum BankInterestRateType1 {

    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BankInterestRateType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankInterestRateType1 fromValue(String v) {
        for (BankInterestRateType1 c: BankInterestRateType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
