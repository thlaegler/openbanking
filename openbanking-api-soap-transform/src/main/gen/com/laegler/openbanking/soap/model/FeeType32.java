
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType32.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType32"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ServiceCAccountFee"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeMonthly"/&gt;
 *     &lt;enumeration value="ServiceCOther"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType32")
@XmlEnum
public enum FeeType32 {

    @XmlEnumValue("ServiceCAccountFee")
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    @XmlEnumValue("ServiceCAccountFeeMonthly")
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    @XmlEnumValue("ServiceCOther")
    SERVICE_C_OTHER("ServiceCOther"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FeeType32(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType32 fromValue(String v) {
        for (FeeType32 c: FeeType32 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
