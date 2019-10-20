
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type11.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type11"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AnyBusinessCustomer"/&gt;
 *     &lt;enumeration value="BusinessCurrentAccount"/&gt;
 *     &lt;enumeration value="CreditScoring"/&gt;
 *     &lt;enumeration value="OtherFinancialHolding"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="MinimumTurnover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type11")
@XmlEnum
public enum Type11 {

    @XmlEnumValue("AnyBusinessCustomer")
    ANY_BUSINESS_CUSTOMER("AnyBusinessCustomer"),
    @XmlEnumValue("BusinessCurrentAccount")
    BUSINESS_CURRENT_ACCOUNT("BusinessCurrentAccount"),
    @XmlEnumValue("CreditScoring")
    CREDIT_SCORING("CreditScoring"),
    @XmlEnumValue("OtherFinancialHolding")
    OTHER_FINANCIAL_HOLDING("OtherFinancialHolding"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("MinimumTurnover")
    MINIMUM_TURNOVER("MinimumTurnover");
    private final String value;

    Type11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type11 fromValue(String v) {
        for (Type11 c: Type11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
