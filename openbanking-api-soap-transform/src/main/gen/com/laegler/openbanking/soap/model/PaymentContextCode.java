
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentContextCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentContextCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BillPayment"/&gt;
 *     &lt;enumeration value="EcommerceGoods"/&gt;
 *     &lt;enumeration value="EcommerceServices"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PartyToParty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentContextCode")
@XmlEnum
public enum PaymentContextCode {

    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),
    @XmlEnumValue("EcommerceGoods")
    ECOMMERCE_GOODS("EcommerceGoods"),
    @XmlEnumValue("EcommerceServices")
    ECOMMERCE_SERVICES("EcommerceServices"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PartyToParty")
    PARTY_TO_PARTY("PartyToParty");
    private final String value;

    PaymentContextCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentContextCode fromValue(String v) {
        for (PaymentContextCode c: PaymentContextCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
