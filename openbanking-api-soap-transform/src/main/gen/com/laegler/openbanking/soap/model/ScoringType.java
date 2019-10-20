
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScoringType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hard"/&gt;
 *     &lt;enumeration value="Soft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScoringType")
@XmlEnum
public enum ScoringType {

    @XmlEnumValue("Hard")
    HARD("Hard"),
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    ScoringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScoringType fromValue(String v) {
        for (ScoringType c: ScoringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
