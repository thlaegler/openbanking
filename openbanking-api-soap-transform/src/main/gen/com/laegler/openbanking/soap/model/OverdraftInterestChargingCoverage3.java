
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftInterestChargingCoverage3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverdraftInterestChargingCoverage3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tiered"/&gt;
 *     &lt;enumeration value="Whole"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverdraftInterestChargingCoverage3")
@XmlEnum
public enum OverdraftInterestChargingCoverage3 {

    @XmlEnumValue("Tiered")
    TIERED("Tiered"),
    @XmlEnumValue("Whole")
    WHOLE("Whole");
    private final String value;

    OverdraftInterestChargingCoverage3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverdraftInterestChargingCoverage3 fromValue(String v) {
        for (OverdraftInterestChargingCoverage3 c: OverdraftInterestChargingCoverage3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
