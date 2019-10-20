
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCategory5.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCategory5"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Servicing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeCategory5")
@XmlEnum
public enum FeeCategory5 {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Servicing")
    SERVICING("Servicing");
    private final String value;

    FeeCategory5(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeCategory5 fromValue(String v) {
        for (FeeCategory5 c: FeeCategory5 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
