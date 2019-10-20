
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OverdraftType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVCO"/&gt;
 *     &lt;enumeration value="OVOD"/&gt;
 *     &lt;enumeration value="OVOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverdraftType2")
@XmlEnum
public enum OverdraftType2 {

    OVCO,
    OVOD,
    OVOT;

    public String value() {
        return name();
    }

    public static OverdraftType2 fromValue(String v) {
        return valueOf(v);
    }

}
