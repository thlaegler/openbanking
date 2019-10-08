
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Destination2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Destination2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INOT"/&gt;
 *     &lt;enumeration value="INPA"/&gt;
 *     &lt;enumeration value="INSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Destination2")
@XmlEnum
public enum Destination2 {

    INOT,
    INPA,
    INSC;

    public String value() {
        return name();
    }

    public static Destination2 fromValue(String v) {
        return valueOf(v);
    }

}
