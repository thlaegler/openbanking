
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBCreditDebitCode_2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBCreditDebitCode_2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBCreditDebitCode_2")
@XmlEnum
public enum OBCreditDebitCode2 {

    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Debit")
    DEBIT("Debit");
    private final String value;

    OBCreditDebitCode2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBCreditDebitCode2 fromValue(String v) {
        for (OBCreditDebitCode2 c: OBCreditDebitCode2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
