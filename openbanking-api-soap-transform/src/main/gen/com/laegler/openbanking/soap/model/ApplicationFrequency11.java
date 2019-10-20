
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationFrequency11.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationFrequency11"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FQAT"/&gt;
 *     &lt;enumeration value="FQDY"/&gt;
 *     &lt;enumeration value="FQHY"/&gt;
 *     &lt;enumeration value="FQMY"/&gt;
 *     &lt;enumeration value="FQOT"/&gt;
 *     &lt;enumeration value="FQQY"/&gt;
 *     &lt;enumeration value="FQSD"/&gt;
 *     &lt;enumeration value="FQWY"/&gt;
 *     &lt;enumeration value="FQYY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationFrequency11")
@XmlEnum
public enum ApplicationFrequency11 {

    FQAT,
    FQDY,
    FQHY,
    FQMY,
    FQOT,
    FQQY,
    FQSD,
    FQWY,
    FQYY;

    public String value() {
        return name();
    }

    public static ApplicationFrequency11 fromValue(String v) {
        return valueOf(v);
    }

}
