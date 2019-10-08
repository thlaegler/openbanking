
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Promotional"/&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketingState")
@XmlEnum
public enum MarketingState {

    @XmlEnumValue("Promotional")
    PROMOTIONAL("Promotional"),
    @XmlEnumValue("Regular")
    REGULAR("Regular");
    private final String value;

    MarketingState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketingState fromValue(String v) {
        for (MarketingState c: MarketingState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
