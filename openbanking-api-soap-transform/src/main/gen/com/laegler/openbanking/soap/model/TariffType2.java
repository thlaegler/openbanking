
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TariffType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TTEL"/&gt;
 *     &lt;enumeration value="TTMX"/&gt;
 *     &lt;enumeration value="TTOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TariffType2")
@XmlEnum
public enum TariffType2 {

    TTEL,
    TTMX,
    TTOT;

    public String value() {
        return name();
    }

    public static TariffType2 fromValue(String v) {
        return valueOf(v);
    }

}
