
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AnnualReturns"/&gt;
 *     &lt;enumeration value="PreviousCCJSAllowed"/&gt;
 *     &lt;enumeration value="GoodTradingHistory"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PreviousBankruptcyAllowed"/&gt;
 *     &lt;enumeration value="TradingLength"/&gt;
 *     &lt;enumeration value="Turnover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingType")
@XmlEnum
public enum TradingType {

    @XmlEnumValue("AnnualReturns")
    ANNUAL_RETURNS("AnnualReturns"),
    @XmlEnumValue("PreviousCCJSAllowed")
    PREVIOUS_CCJS_ALLOWED("PreviousCCJSAllowed"),
    @XmlEnumValue("GoodTradingHistory")
    GOOD_TRADING_HISTORY("GoodTradingHistory"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PreviousBankruptcyAllowed")
    PREVIOUS_BANKRUPTCY_ALLOWED("PreviousBankruptcyAllowed"),
    @XmlEnumValue("TradingLength")
    TRADING_LENGTH("TradingLength"),
    @XmlEnumValue("Turnover")
    TURNOVER("Turnover");
    private final String value;

    TradingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradingType fromValue(String v) {
        for (TradingType c: TradingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
