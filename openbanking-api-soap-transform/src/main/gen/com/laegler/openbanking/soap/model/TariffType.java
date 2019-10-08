
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TariffType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Electronic"/&gt;
 *     &lt;enumeration value="Mixed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TariffType")
@XmlEnum
public enum TariffType {

    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Mixed")
    MIXED("Mixed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TariffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TariffType fromValue(String v) {
        for (TariffType c: TariffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
