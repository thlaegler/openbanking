
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedAlgorithms.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedAlgorithms"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RS256"/&gt;
 *     &lt;enumeration value="PS256"/&gt;
 *     &lt;enumeration value="ES256"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupportedAlgorithms")
@XmlEnum
public enum SupportedAlgorithms {

    @XmlEnumValue("RS256")
    RS_256("RS256"),
    @XmlEnumValue("PS256")
    PS_256("PS256"),
    @XmlEnumValue("ES256")
    ES_256("ES256");
    private final String value;

    SupportedAlgorithms(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportedAlgorithms fromValue(String v) {
        for (SupportedAlgorithms c: SupportedAlgorithms.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
