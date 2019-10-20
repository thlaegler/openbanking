
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Segment5.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Segment5"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="BenefitAndReward"/&gt;
 *     &lt;enumeration value="CreditInterest"/&gt;
 *     &lt;enumeration value="Cashback"/&gt;
 *     &lt;enumeration value="General"/&gt;
 *     &lt;enumeration value="Graduate"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Overdraft"/&gt;
 *     &lt;enumeration value="Packaged"/&gt;
 *     &lt;enumeration value="Premium"/&gt;
 *     &lt;enumeration value="Reward"/&gt;
 *     &lt;enumeration value="Student"/&gt;
 *     &lt;enumeration value="YoungAdult"/&gt;
 *     &lt;enumeration value="Youth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Segment5")
@XmlEnum
public enum Segment5 {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("BenefitAndReward")
    BENEFIT_AND_REWARD("BenefitAndReward"),
    @XmlEnumValue("CreditInterest")
    CREDIT_INTEREST("CreditInterest"),
    @XmlEnumValue("Cashback")
    CASHBACK("Cashback"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Graduate")
    GRADUATE("Graduate"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Overdraft")
    OVERDRAFT("Overdraft"),
    @XmlEnumValue("Packaged")
    PACKAGED("Packaged"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Reward")
    REWARD("Reward"),
    @XmlEnumValue("Student")
    STUDENT("Student"),
    @XmlEnumValue("YoungAdult")
    YOUNG_ADULT("YoungAdult"),
    @XmlEnumValue("Youth")
    YOUTH("Youth");
    private final String value;

    Segment5(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Segment5 fromValue(String v) {
        for (Segment5 c: Segment5 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
