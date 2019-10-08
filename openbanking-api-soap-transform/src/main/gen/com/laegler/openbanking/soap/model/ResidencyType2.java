
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidencyType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResidencyType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Householder"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResidencyType2")
@XmlEnum
public enum ResidencyType2 {

    @XmlEnumValue("Householder")
    HOUSEHOLDER("Householder"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResidencyType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResidencyType2 fromValue(String v) {
        for (ResidencyType2 c: ResidencyType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
