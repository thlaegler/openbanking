
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalAccountSubType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalAccountSubType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ChargeCard"/&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *     &lt;enumeration value="CurrentAccount"/&gt;
 *     &lt;enumeration value="EMoney"/&gt;
 *     &lt;enumeration value="Loan"/&gt;
 *     &lt;enumeration value="Mortgage"/&gt;
 *     &lt;enumeration value="PrePaidCard"/&gt;
 *     &lt;enumeration value="Savings"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalAccountSubType1Code")
@XmlEnum
public enum OBExternalAccountSubType1Code {

    @XmlEnumValue("ChargeCard")
    CHARGE_CARD("ChargeCard"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("CurrentAccount")
    CURRENT_ACCOUNT("CurrentAccount"),
    @XmlEnumValue("EMoney")
    E_MONEY("EMoney"),
    @XmlEnumValue("Loan")
    LOAN("Loan"),
    @XmlEnumValue("Mortgage")
    MORTGAGE("Mortgage"),
    @XmlEnumValue("PrePaidCard")
    PRE_PAID_CARD("PrePaidCard"),
    @XmlEnumValue("Savings")
    SAVINGS("Savings");
    private final String value;

    OBExternalAccountSubType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalAccountSubType1Code fromValue(String v) {
        for (OBExternalAccountSubType1Code c: OBExternalAccountSubType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
