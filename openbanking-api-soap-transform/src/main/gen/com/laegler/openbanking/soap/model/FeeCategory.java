
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="BankersDrafts"/&gt;
 *     &lt;enumeration value="CashCentre"/&gt;
 *     &lt;enumeration value="Card"/&gt;
 *     &lt;enumeration value="Cheque"/&gt;
 *     &lt;enumeration value="CounterServices"/&gt;
 *     &lt;enumeration value="DirectDebit"/&gt;
 *     &lt;enumeration value="Deeds"/&gt;
 *     &lt;enumeration value="Foreign"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="Investigation"/&gt;
 *     &lt;enumeration value="Legal"/&gt;
 *     &lt;enumeration value="Loan"/&gt;
 *     &lt;enumeration value="NightSafe"/&gt;
 *     &lt;enumeration value="Online"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PostOffice"/&gt;
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
@XmlType(name = "FeeCategory")
@XmlEnum
public enum FeeCategory {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
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
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),
    @XmlEnumValue("Deeds")
    DEEDS("Deeds"),
    @XmlEnumValue("Foreign")
    FOREIGN("Foreign"),
    FX("FX"),
    @XmlEnumValue("International")
    INTERNATIONAL("International"),
    @XmlEnumValue("Investigation")
    INVESTIGATION("Investigation"),
    @XmlEnumValue("Legal")
    LEGAL("Legal"),
    @XmlEnumValue("Loan")
    LOAN("Loan"),
    @XmlEnumValue("NightSafe")
    NIGHT_SAFE("NightSafe"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PostOffice")
    POST_OFFICE("PostOffice"),
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

    FeeCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeCategory fromValue(String v) {
        for (FeeCategory c: FeeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
