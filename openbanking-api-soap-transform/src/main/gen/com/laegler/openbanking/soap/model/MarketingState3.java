
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingState3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingState3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Promotional"/&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketingState3")
@XmlEnum
public enum MarketingState3 {

    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Regular")
    REGULAR("Regular");
    private final String value;

    MarketingState3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketingState3 fromValue(String v) {
        for (MarketingState3 c: MarketingState3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
