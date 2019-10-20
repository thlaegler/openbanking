
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type15.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type15"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccountManagement"/&gt;
 *     &lt;enumeration value="CashBack"/&gt;
 *     &lt;enumeration value="CreditReports"/&gt;
 *     &lt;enumeration value="Lifestyle"/&gt;
 *     &lt;enumeration value="MotorBreakdown"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PaymentHolidays"/&gt;
 *     &lt;enumeration value="SpendLimits"/&gt;
 *     &lt;enumeration value="TravelInsurance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type15")
@XmlEnum
public enum Type15 {

    @XmlEnumValue("AccountManagement")
    ACCOUNT_MANAGEMENT("AccountManagement"),
    @XmlEnumValue("CashBack")
    CASH_BACK("CashBack"),
    @XmlEnumValue("CreditReports")
    CREDIT_REPORTS("CreditReports"),
    @XmlEnumValue("Lifestyle")
    LIFESTYLE("Lifestyle"),
    @XmlEnumValue("MotorBreakdown")
    MOTOR_BREAKDOWN("MotorBreakdown"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PaymentHolidays")
    PAYMENT_HOLIDAYS("PaymentHolidays"),
    @XmlEnumValue("SpendLimits")
    SPEND_LIMITS("SpendLimits"),
    @XmlEnumValue("TravelInsurance")
    TRAVEL_INSURANCE("TravelInsurance");
    private final String value;

    Type15(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type15 fromValue(String v) {
        for (Type15 c: Type15 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
