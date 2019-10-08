
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type24.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type24"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccountManagement"/&gt;
 *     &lt;enumeration value="AccountOpeningOrSwitchingIncentive"/&gt;
 *     &lt;enumeration value="Cashback"/&gt;
 *     &lt;enumeration value="Entertainment"/&gt;
 *     &lt;enumeration value="HomeInsurance"/&gt;
 *     &lt;enumeration value="HomeProtection"/&gt;
 *     &lt;enumeration value="InternationalPaymentSupport"/&gt;
 *     &lt;enumeration value="Lifestyle"/&gt;
 *     &lt;enumeration value="MotorBreakdown"/&gt;
 *     &lt;enumeration value="OverdraftControl"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PremiumService"/&gt;
 *     &lt;enumeration value="PreferentialRates"/&gt;
 *     &lt;enumeration value="PassiveSaving"/&gt;
 *     &lt;enumeration value="RelationshipManager"/&gt;
 *     &lt;enumeration value="Rewards"/&gt;
 *     &lt;enumeration value="TechnologyInsurance"/&gt;
 *     &lt;enumeration value="TravelInsurance"/&gt;
 *     &lt;enumeration value="Travel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type24")
@XmlEnum
public enum Type24 {

    @XmlEnumValue("AccountManagement")
    ACCOUNT_MANAGEMENT("AccountManagement"),
    @XmlEnumValue("AccountOpeningOrSwitchingIncentive")
    ACCOUNT_OPENING_OR_SWITCHING_INCENTIVE("AccountOpeningOrSwitchingIncentive"),
    @XmlEnumValue("Cashback")
    CASHBACK("Cashback"),
    @XmlEnumValue("Entertainment")
    ENTERTAINMENT("Entertainment"),
    @XmlEnumValue("HomeInsurance")
    HOME_INSURANCE("HomeInsurance"),
    @XmlEnumValue("HomeProtection")
    HOME_PROTECTION("HomeProtection"),
    @XmlEnumValue("InternationalPaymentSupport")
    INTERNATIONAL_PAYMENT_SUPPORT("InternationalPaymentSupport"),
    @XmlEnumValue("Lifestyle")
    LIFESTYLE("Lifestyle"),
    @XmlEnumValue("MotorBreakdown")
    MOTOR_BREAKDOWN("MotorBreakdown"),
    @XmlEnumValue("OverdraftControl")
    OVERDRAFT_CONTROL("OverdraftControl"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PremiumService")
    PREMIUM_SERVICE("PremiumService"),
    @XmlEnumValue("PreferentialRates")
    PREFERENTIAL_RATES("PreferentialRates"),
    @XmlEnumValue("PassiveSaving")
    PASSIVE_SAVING("PassiveSaving"),
    @XmlEnumValue("RelationshipManager")
    RELATIONSHIP_MANAGER("RelationshipManager"),
    @XmlEnumValue("Rewards")
    REWARDS("Rewards"),
    @XmlEnumValue("TechnologyInsurance")
    TECHNOLOGY_INSURANCE("TechnologyInsurance"),
    @XmlEnumValue("TravelInsurance")
    TRAVEL_INSURANCE("TravelInsurance"),
    @XmlEnumValue("Travel")
    TRAVEL("Travel");
    private final String value;

    Type24(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type24 fromValue(String v) {
        for (Type24 c: Type24 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
