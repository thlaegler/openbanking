
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverdraftType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Committed"/&gt;
 *     &lt;enumeration value="OnDemand"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverdraftType1")
@XmlEnum
public enum OverdraftType1 {

    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("OnDemand")
    ON_DEMAND("OnDemand");
    private final String value;

    OverdraftType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverdraftType1 fromValue(String v) {
        for (OverdraftType1 c: OverdraftType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
