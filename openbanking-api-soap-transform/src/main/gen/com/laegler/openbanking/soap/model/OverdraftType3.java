
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftType3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverdraftType3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Committed"/&gt;
 *     &lt;enumeration value="OnDemand"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverdraftType3")
@XmlEnum
public enum OverdraftType3 {

    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("OnDemand")
    ON_DEMAND("OnDemand"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OverdraftType3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverdraftType3 fromValue(String v) {
        for (OverdraftType3 c: OverdraftType3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
