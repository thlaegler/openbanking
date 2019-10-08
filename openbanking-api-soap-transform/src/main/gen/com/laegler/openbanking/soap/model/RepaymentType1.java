
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepaymentType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RepaymentType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Balloon"/&gt;
 *     &lt;enumeration value="Bullet"/&gt;
 *     &lt;enumeration value="CapitalAndInterest"/&gt;
 *     &lt;enumeration value="CustomSchedule"/&gt;
 *     &lt;enumeration value="EarlyRepayment"/&gt;
 *     &lt;enumeration value="FixedCapitalFullyAmortising"/&gt;
 *     &lt;enumeration value="FixedCapitalWithBullet"/&gt;
 *     &lt;enumeration value="FixedCapitalAndInterestReducingBalance"/&gt;
 *     &lt;enumeration value="InterestOnly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PrepaymentFee"/&gt;
 *     &lt;enumeration value="RepaymentWithBullet"/&gt;
 *     &lt;enumeration value="StraightLineInterestOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RepaymentType1")
@XmlEnum
public enum RepaymentType1 {

    @XmlEnumValue("Balloon")
    BALLOON("Balloon"),
    @XmlEnumValue("Bullet")
    BULLET("Bullet"),
    @XmlEnumValue("CapitalAndInterest")
    CAPITAL_AND_INTEREST("CapitalAndInterest"),
    @XmlEnumValue("CustomSchedule")
    CUSTOM_SCHEDULE("CustomSchedule"),
    @XmlEnumValue("EarlyRepayment")
    EARLY_REPAYMENT("EarlyRepayment"),
    @XmlEnumValue("FixedCapitalFullyAmortising")
    FIXED_CAPITAL_FULLY_AMORTISING("FixedCapitalFullyAmortising"),
    @XmlEnumValue("FixedCapitalWithBullet")
    FIXED_CAPITAL_WITH_BULLET("FixedCapitalWithBullet"),
    @XmlEnumValue("FixedCapitalAndInterestReducingBalance")
    FIXED_CAPITAL_AND_INTEREST_REDUCING_BALANCE("FixedCapitalAndInterestReducingBalance"),
    @XmlEnumValue("InterestOnly")
    INTEREST_ONLY("InterestOnly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PrepaymentFee")
    PREPAYMENT_FEE("PrepaymentFee"),
    @XmlEnumValue("RepaymentWithBullet")
    REPAYMENT_WITH_BULLET("RepaymentWithBullet"),
    @XmlEnumValue("StraightLineInterestOnly")
    STRAIGHT_LINE_INTEREST_ONLY("StraightLineInterestOnly");
    private final String value;

    RepaymentType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RepaymentType1 fromValue(String v) {
        for (RepaymentType1 c: RepaymentType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
