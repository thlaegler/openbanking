
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftInterestChargingCoverage1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverdraftInterestChargingCoverage1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Banded"/&gt;
 *     &lt;enumeration value="Tiered"/&gt;
 *     &lt;enumeration value="Whole"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverdraftInterestChargingCoverage1")
@XmlEnum
public enum OverdraftInterestChargingCoverage1 {

    @XmlEnumValue("Banded")
    BANDED("Banded"),
    @XmlEnumValue("Tiered")
    TIERED("Tiered"),
    @XmlEnumValue("Whole")
    WHOLE("Whole");
    private final String value;

    OverdraftInterestChargingCoverage1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverdraftInterestChargingCoverage1 fromValue(String v) {
        for (OverdraftInterestChargingCoverage1 c: OverdraftInterestChargingCoverage1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
