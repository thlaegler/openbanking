
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType14.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType14"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="ServiceCAccountFee"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeMonthly"/&gt;
 *     &lt;enumeration value="ServiceCAccountFeeQuarterly"/&gt;
 *     &lt;enumeration value="ServiceCFixedTariff"/&gt;
 *     &lt;enumeration value="ServiceCBusiDepAccBreakage"/&gt;
 *     &lt;enumeration value="ServiceCMinimumMonthlyFee"/&gt;
 *     &lt;enumeration value="ServiceCOther"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType14")
@XmlEnum
public enum FeeType14 {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("ServiceCAccountFee")
    SERVICE_C_ACCOUNT_FEE("ServiceCAccountFee"),
    @XmlEnumValue("ServiceCAccountFeeMonthly")
    SERVICE_C_ACCOUNT_FEE_MONTHLY("ServiceCAccountFeeMonthly"),
    @XmlEnumValue("ServiceCAccountFeeQuarterly")
    SERVICE_C_ACCOUNT_FEE_QUARTERLY("ServiceCAccountFeeQuarterly"),
    @XmlEnumValue("ServiceCFixedTariff")
    SERVICE_C_FIXED_TARIFF("ServiceCFixedTariff"),
    @XmlEnumValue("ServiceCBusiDepAccBreakage")
    SERVICE_C_BUSI_DEP_ACC_BREAKAGE("ServiceCBusiDepAccBreakage"),
    @XmlEnumValue("ServiceCMinimumMonthlyFee")
    SERVICE_C_MINIMUM_MONTHLY_FEE("ServiceCMinimumMonthlyFee"),
    @XmlEnumValue("ServiceCOther")
    SERVICE_C_OTHER("ServiceCOther");
    private final String value;

    FeeType14(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType14 fromValue(String v) {
        for (FeeType14 c: FeeType14 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
