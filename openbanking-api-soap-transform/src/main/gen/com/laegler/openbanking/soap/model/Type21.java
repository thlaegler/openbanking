
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type21.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type21"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CashCard"/&gt;
 *     &lt;enumeration value="DebitCard"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="POCACard"/&gt;
 *     &lt;enumeration value="PrepaidDebitCard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type21")
@XmlEnum
public enum Type21 {

    @XmlEnumValue("CashCard")
    CASH_CARD("CashCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("POCACard")
    POCA_CARD("POCACard"),
    @XmlEnumValue("PrepaidDebitCard")
    PREPAID_DEBIT_CARD("PrepaidDebitCard");
    private final String value;

    Type21(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type21 fromValue(String v) {
        for (Type21 c: Type21 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
