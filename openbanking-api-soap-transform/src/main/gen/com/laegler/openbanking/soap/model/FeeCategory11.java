
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCategory11.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCategory11"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BankersDrafts"/&gt;
 *     &lt;enumeration value="CounterServices"/&gt;
 *     &lt;enumeration value="Foreign"/&gt;
 *     &lt;enumeration value="Legal"/&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PaymentScheme"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *     &lt;enumeration value="Repayment"/&gt;
 *     &lt;enumeration value="Report"/&gt;
 *     &lt;enumeration value="Safekeeping"/&gt;
 *     &lt;enumeration value="Servicing"/&gt;
 *     &lt;enumeration value="Transaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeCategory11")
@XmlEnum
public enum FeeCategory11 {

    @XmlEnumValue("BankersDrafts")
    BANKERS_DRAFTS("BankersDrafts"),
    @XmlEnumValue("CounterServices")
    COUNTER_SERVICES("CounterServices"),
    @XmlEnumValue("Foreign")
    FOREIGN("Foreign"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PaymentScheme")
    PAYMENT_SCHEME("PaymentScheme"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty"),
    @XmlEnumValue("Repayment")
    REPAYMENT("Repayment"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("Safekeeping")
    SAFEKEEPING("Safekeeping"),
    @XmlEnumValue("Servicing")
    SERVICING("Servicing"),
    @XmlEnumValue("Transaction")
    TRANSACTION("Transaction");
    private final String value;

    FeeCategory11(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeCategory11 fromValue(String v) {
        for (FeeCategory11 c: FeeCategory11 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
