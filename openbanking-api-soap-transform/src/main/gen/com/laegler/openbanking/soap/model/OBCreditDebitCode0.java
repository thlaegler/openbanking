
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBCreditDebitCode_0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBCreditDebitCode_0"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Debit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBCreditDebitCode_0")
@XmlEnum
public enum OBCreditDebitCode0 {

    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Debit")
    DEBIT("Debit");
    private final String value;

    OBCreditDebitCode0(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBCreditDebitCode0 fromValue(String v) {
        for (OBCreditDebitCode0 c: OBCreditDebitCode0 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
