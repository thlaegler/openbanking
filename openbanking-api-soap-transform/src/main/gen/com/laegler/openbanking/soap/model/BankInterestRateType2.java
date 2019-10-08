
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInterestRateType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankInterestRateType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INBB"/&gt;
 *     &lt;enumeration value="INFR"/&gt;
 *     &lt;enumeration value="INGR"/&gt;
 *     &lt;enumeration value="INLR"/&gt;
 *     &lt;enumeration value="INNE"/&gt;
 *     &lt;enumeration value="INOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BankInterestRateType2")
@XmlEnum
public enum BankInterestRateType2 {

    INBB,
    INFR,
    INGR,
    INLR,
    INNE,
    INOT;

    public String value() {
        return name();
    }

    public static BankInterestRateType2 fromValue(String v) {
        return valueOf(v);
    }

}
