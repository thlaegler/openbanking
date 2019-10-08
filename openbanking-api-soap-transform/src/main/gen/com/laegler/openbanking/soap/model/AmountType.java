
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RABD"/&gt;
 *     &lt;enumeration value="RABL"/&gt;
 *     &lt;enumeration value="RACI"/&gt;
 *     &lt;enumeration value="RAFC"/&gt;
 *     &lt;enumeration value="RAIO"/&gt;
 *     &lt;enumeration value="RALT"/&gt;
 *     &lt;enumeration value="USOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountType")
@XmlEnum
public enum AmountType {

    RABD,
    RABL,
    RACI,
    RAFC,
    RAIO,
    RALT,
    USOT;

    public String value() {
        return name();
    }

    public static AmountType fromValue(String v) {
        return valueOf(v);
    }

}
