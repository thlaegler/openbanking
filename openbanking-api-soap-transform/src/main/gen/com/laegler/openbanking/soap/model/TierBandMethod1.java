
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierBandMethod1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TierBandMethod1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Banded"/&gt;
 *     &lt;enumeration value="Tiered"/&gt;
 *     &lt;enumeration value="Whole"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TierBandMethod1")
@XmlEnum
public enum TierBandMethod1 {

    @XmlEnumValue("Banded")
    BANDED("Banded"),
    @XmlEnumValue("Tiered")
    TIERED("Tiered"),
    @XmlEnumValue("Whole")
    WHOLE("Whole");
    private final String value;

    TierBandMethod1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TierBandMethod1 fromValue(String v) {
        for (TierBandMethod1 c: TierBandMethod1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
