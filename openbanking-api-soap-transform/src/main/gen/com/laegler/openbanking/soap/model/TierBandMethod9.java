
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierBandMethod9.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TierBandMethod9"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tiered"/&gt;
 *     &lt;enumeration value="Whole"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TierBandMethod9")
@XmlEnum
public enum TierBandMethod9 {

    @XmlEnumValue("Tiered")
    TIERED("Tiered"),
    @XmlEnumValue("Whole")
    WHOLE("Whole");
    private final String value;

    TierBandMethod9(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TierBandMethod9 fromValue(String v) {
        for (TierBandMethod9 c: TierBandMethod9 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
