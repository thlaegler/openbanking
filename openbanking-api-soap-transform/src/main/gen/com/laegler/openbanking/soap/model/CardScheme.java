
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardScheme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mastercard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Visa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardScheme")
@XmlEnum
public enum CardScheme {

    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Visa")
    VISA("Visa");
    private final String value;

    CardScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardScheme fromValue(String v) {
        for (CardScheme c: CardScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
