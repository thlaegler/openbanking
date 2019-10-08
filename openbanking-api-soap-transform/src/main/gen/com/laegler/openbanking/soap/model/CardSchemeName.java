
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSchemeName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardSchemeName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AmericanExpress"/&gt;
 *     &lt;enumeration value="Diners"/&gt;
 *     &lt;enumeration value="Discover"/&gt;
 *     &lt;enumeration value="MasterCard"/&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardSchemeName")
@XmlEnum
public enum CardSchemeName {

    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("Diners")
    DINERS("Diners"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    VISA("VISA");
    private final String value;

    CardSchemeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardSchemeName fromValue(String v) {
        for (CardSchemeName c: CardSchemeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
