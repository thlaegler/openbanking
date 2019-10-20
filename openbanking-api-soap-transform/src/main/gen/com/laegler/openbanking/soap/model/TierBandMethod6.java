
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierBandMethod6.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TierBandMethod6"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INBA"/&gt;
 *     &lt;enumeration value="INTI"/&gt;
 *     &lt;enumeration value="INWH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TierBandMethod6")
@XmlEnum
public enum TierBandMethod6 {

    INBA,
    INTI,
    INWH;

    public String value() {
        return name();
    }

    public static TierBandMethod6 fromValue(String v) {
        return valueOf(v);
    }

}