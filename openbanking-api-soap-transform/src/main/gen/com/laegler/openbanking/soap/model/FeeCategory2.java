
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeCategory2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeCategory2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CashAdvance"/&gt;
 *     &lt;enumeration value="BalanceTransfer"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="Cheque"/&gt;
 *     &lt;enumeration value="Card"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *     &lt;enumeration value="Servicing"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeCategory2")
@XmlEnum
public enum FeeCategory2 {

    @XmlEnumValue("CashAdvance")
    CASH_ADVANCE("CashAdvance"),
    @XmlEnumValue("BalanceTransfer")
    BALANCE_TRANSFER("BalanceTransfer"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Cheque")
    CHEQUE("Cheque"),
    @XmlEnumValue("Card")
    CARD("Card"),
    FX("FX"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty"),
    @XmlEnumValue("Servicing")
    SERVICING("Servicing"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FeeCategory2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeCategory2 fromValue(String v) {
        for (FeeCategory2 c: FeeCategory2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
