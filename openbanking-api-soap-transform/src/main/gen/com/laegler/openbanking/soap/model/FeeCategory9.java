
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCategory9.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCategory9"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="BankersDrafts"/&gt;
 *     &lt;enumeration value="CashCentre"/&gt;
 *     &lt;enumeration value="Card"/&gt;
 *     &lt;enumeration value="Cheque"/&gt;
 *     &lt;enumeration value="CounterServices"/&gt;
 *     &lt;enumeration value="Foreign"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="Investigation"/&gt;
 *     &lt;enumeration value="Legal"/&gt;
 *     &lt;enumeration value="NightSafe"/&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PaymentScheme"/&gt;
 *     &lt;enumeration value="Report"/&gt;
 *     &lt;enumeration value="Safekeeping"/&gt;
 *     &lt;enumeration value="Servicing"/&gt;
 *     &lt;enumeration value="Transaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeCategory9")
@XmlEnum
public enum FeeCategory9 {

    AUTO("AUTO"),
    ATM("ATM"),
    @XmlEnumValue("BankersDrafts")
    BANKERS_DRAFTS("BankersDrafts"),
    @XmlEnumValue("CashCentre")
    CASH_CENTRE("CashCentre"),
    @XmlEnumValue("Card")
    CARD("Card"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("CounterServices")
    COUNTER_SERVICES("CounterServices"),
    @XmlEnumValue("Foreign")
    FOREIGN("Foreign"),
    FX("FX"),
    @XmlEnumValue("International")
    INTERNATIONAL("International"),
    @XmlEnumValue("Investigation")
    INVESTIGATION("Investigation"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("NightSafe")
    NIGHT_SAFE("NightSafe"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PaymentScheme")
    PAYMENT_SCHEME("PaymentScheme"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("Safekeeping")
    SAFEKEEPING("Safekeeping"),
    @XmlEnumValue("Servicing")
    SERVICING("Servicing"),
    @XmlEnumValue("Transaction")
    TRANSACTION("Transaction");
    private final String value;

    FeeCategory9(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeCategory9 fromValue(String v) {
        for (FeeCategory9 c: FeeCategory9 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
