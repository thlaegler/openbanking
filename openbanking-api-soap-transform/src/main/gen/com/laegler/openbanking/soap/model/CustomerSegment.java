
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSegment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerSegment"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Corporate"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Premier"/&gt;
 *     &lt;enumeration value="Select"/&gt;
 *     &lt;enumeration value="SME"/&gt;
 *     &lt;enumeration value="Wealth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerSegment")
@XmlEnum
public enum CustomerSegment {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Premier")
    PREMIER("Premier"),
    @XmlEnumValue("Select")
    SELECT("Select"),
    SME("SME"),
    @XmlEnumValue("Wealth")
    WEALTH("Wealth");
    private final String value;

    CustomerSegment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerSegment fromValue(String v) {
        for (CustomerSegment c: CustomerSegment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
