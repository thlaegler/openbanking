
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type6.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type6"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccountManagement"/&gt;
 *     &lt;enumeration value="AccountOpeningOrSwitchingIncentive"/&gt;
 *     &lt;enumeration value="Cashback"/&gt;
 *     &lt;enumeration value="InternationalPaymentsSupport"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PreferentialRates"/&gt;
 *     &lt;enumeration value="RelationshipManager"/&gt;
 *     &lt;enumeration value="Rewards"/&gt;
 *     &lt;enumeration value="SecureCash"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type6")
@XmlEnum
public enum Type6 {

    @XmlEnumValue("AccountManagement")
    ACCOUNT_MANAGEMENT("AccountManagement"),
    @XmlEnumValue("AccountOpeningOrSwitchingIncentive")
    ACCOUNT_OPENING_OR_SWITCHING_INCENTIVE("AccountOpeningOrSwitchingIncentive"),
    @XmlEnumValue("Cashback")
    CASHBACK("Cashback"),
    @XmlEnumValue("InternationalPaymentsSupport")
    INTERNATIONAL_PAYMENTS_SUPPORT("InternationalPaymentsSupport"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PreferentialRates")
    PREFERENTIAL_RATES("PreferentialRates"),
    @XmlEnumValue("RelationshipManager")
    RELATIONSHIP_MANAGER("RelationshipManager"),
    @XmlEnumValue("Rewards")
    REWARDS("Rewards"),
    @XmlEnumValue("SecureCash")
    SECURE_CASH("SecureCash");
    private final String value;

    Type6(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type6 fromValue(String v) {
        for (Type6 c: Type6 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
