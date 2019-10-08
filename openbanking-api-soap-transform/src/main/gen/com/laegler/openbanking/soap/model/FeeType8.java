
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType8.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType8"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AdditionalCard"/&gt;
 *     &lt;enumeration value="BalanceTransfer"/&gt;
 *     &lt;enumeration value="CashAdvance"/&gt;
 *     &lt;enumeration value="Card"/&gt;
 *     &lt;enumeration value="ChequeIssue"/&gt;
 *     &lt;enumeration value="CashWithdrawal"/&gt;
 *     &lt;enumeration value="EmergencyCard"/&gt;
 *     &lt;enumeration value="ForeignCash"/&gt;
 *     &lt;enumeration value="Handling"/&gt;
 *     &lt;enumeration value="Maintenance"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="Penalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeeType8")
@XmlEnum
public enum FeeType8 {

    @XmlEnumValue("AdditionalCard")
    ADDITIONAL_CARD("AdditionalCard"),
    @XmlEnumValue("BalanceTransfer")
    BALANCE_TRANSFER("BalanceTransfer"),
    @XmlEnumValue("CashAdvance")
    CASH_ADVANCE("CashAdvance"),
    @XmlEnumValue("Card")
    CARD("Card"),
    @XmlEnumValue("ChequeIssue")
    CHEQUE_ISSUE("ChequeIssue"),
    @XmlEnumValue("CashWithdrawal")
    CASH_WITHDRAWAL("CashWithdrawal"),
    @XmlEnumValue("EmergencyCard")
    EMERGENCY_CARD("EmergencyCard"),
    @XmlEnumValue("ForeignCash")
    FOREIGN_CASH("ForeignCash"),
    @XmlEnumValue("Handling")
    HANDLING("Handling"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    FeeType8(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeType8 fromValue(String v) {
        for (FeeType8 c: FeeType8 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
