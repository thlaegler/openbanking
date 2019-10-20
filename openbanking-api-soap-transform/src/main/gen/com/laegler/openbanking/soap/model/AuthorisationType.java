
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorisationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ConsumerDevice"/&gt;
 *     &lt;enumeration value="Contactless"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="PIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorisationType")
@XmlEnum
public enum AuthorisationType {

    @XmlEnumValue("ConsumerDevice")
    CONSUMER_DEVICE("ConsumerDevice"),
    @XmlEnumValue("Contactless")
    CONTACTLESS("Contactless"),
    @XmlEnumValue("None")
    NONE("None"),
    PIN("PIN");
    private final String value;

    AuthorisationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorisationType fromValue(String v) {
        for (AuthorisationType c: AuthorisationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
