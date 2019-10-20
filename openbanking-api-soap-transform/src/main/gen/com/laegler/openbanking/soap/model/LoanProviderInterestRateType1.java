
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanProviderInterestRateType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanProviderInterestRateType1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOEBaseRate"/&gt;
 *     &lt;enumeration value="FixedRate"/&gt;
 *     &lt;enumeration value="Gross"/&gt;
 *     &lt;enumeration value="LoanProviderBaseRate"/&gt;
 *     &lt;enumeration value="Net"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanProviderInterestRateType1")
@XmlEnum
public enum LoanProviderInterestRateType1 {

    @XmlEnumValue("BOEBaseRate")
    BOE_BASE_RATE("BOEBaseRate"),
    @XmlEnumValue("FixedRate")
    FIXED_RATE("FixedRate"),
    @XmlEnumValue("Gross")
    GROSS("Gross"),
    @XmlEnumValue("LoanProviderBaseRate")
    LOAN_PROVIDER_BASE_RATE("LoanProviderBaseRate"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LoanProviderInterestRateType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanProviderInterestRateType1 fromValue(String v) {
        for (LoanProviderInterestRateType1 c: LoanProviderInterestRateType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
