
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ascending"/&gt;
 *     &lt;enumeration value="descending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortOrder")
@XmlEnum
public enum SortOrder {

    @XmlEnumValue("ascending")
    ASCENDING("ascending"),
    @XmlEnumValue("descending")
    DESCENDING("descending");
    private final String value;

    SortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrder fromValue(String v) {
        for (SortOrder c: SortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
