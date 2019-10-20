
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Agreed"/&gt;
 *     &lt;enumeration value="Indicative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateType")
@XmlEnum
public enum RateType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Agreed")
    AGREED("Agreed"),
    @XmlEnumValue("Indicative")
    INDICATIVE("Indicative");
    private final String value;

    RateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateType fromValue(String v) {
        for (RateType c: RateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
