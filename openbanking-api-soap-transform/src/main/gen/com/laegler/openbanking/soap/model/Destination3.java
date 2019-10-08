
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Destination3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Destination3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PayAway"/&gt;
 *     &lt;enumeration value="SelfCredit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Destination3")
@XmlEnum
public enum Destination3 {

    @XmlEnumValue("PayAway")
    PAY_AWAY("PayAway"),
    @XmlEnumValue("SelfCredit")
    SELF_CREDIT("SelfCredit");
    private final String value;

    Destination3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Destination3 fromValue(String v) {
        for (Destination3 c: Destination3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
