
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Scheme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MasterCard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Scheme")
@XmlEnum
public enum Scheme {

    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    Scheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Scheme fromValue(String v) {
        for (Scheme c: Scheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
