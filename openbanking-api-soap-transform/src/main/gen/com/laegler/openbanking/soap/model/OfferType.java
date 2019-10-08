
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfferType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BalanceTransfer"/&gt;
 *     &lt;enumeration value="LimitIncrease"/&gt;
 *     &lt;enumeration value="MoneyTransfer"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PromotionalRate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfferType")
@XmlEnum
public enum OfferType {

    @XmlEnumValue("BalanceTransfer")
    BALANCE_TRANSFER("BalanceTransfer"),
    @XmlEnumValue("LimitIncrease")
    LIMIT_INCREASE("LimitIncrease"),
    @XmlEnumValue("MoneyTransfer")
    MONEY_TRANSFER("MoneyTransfer"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PromotionalRate")
    PROMOTIONAL_RATE("PromotionalRate");
    private final String value;

    OfferType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferType fromValue(String v) {
        for (OfferType c: OfferType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
