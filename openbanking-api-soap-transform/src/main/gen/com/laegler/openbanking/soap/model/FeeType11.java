
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType11.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType11"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LatePayment"/&gt;
 *     &lt;enumeration value="OverCreditLimit"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="ReturnPayment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType11")
@XmlEnum
public enum FeeType11 {

    @XmlEnumValue("LatePayment")
    LATE_PAYMENT("LatePayment"),
    @XmlEnumValue("OverCreditLimit")
    OVER_CREDIT_LIMIT("OverCreditLimit"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ReturnPayment")
    RETURN_PAYMENT("ReturnPayment");
    private final String value;

    FeeType11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType11 fromValue(String v) {
        for (FeeType11 c: FeeType11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
