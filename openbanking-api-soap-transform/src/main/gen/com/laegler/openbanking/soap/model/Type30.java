
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type30.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type30"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BusinessOnly"/&gt;
 *     &lt;enumeration value="CreditScoring"/&gt;
 *     &lt;enumeration value="ExistingCustomers"/&gt;
 *     &lt;enumeration value="IdAndV"/&gt;
 *     &lt;enumeration value="Mortgage"/&gt;
 *     &lt;enumeration value="NoArrearsOnLoan"/&gt;
 *     &lt;enumeration value="NoCustomerInArrears"/&gt;
 *     &lt;enumeration value="NewCustomersOnly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="StartUp"/&gt;
 *     &lt;enumeration value="Turnover"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type30")
@XmlEnum
public enum Type30 {

    @XmlEnumValue("BusinessOnly")
    BUSINESS_ONLY("BusinessOnly"),
    @XmlEnumValue("CreditScoring")
    CREDIT_SCORING("CreditScoring"),
    @XmlEnumValue("ExistingCustomers")
    EXISTING_CUSTOMERS("ExistingCustomers"),
    @XmlEnumValue("IdAndV")
    ID_AND_V("IdAndV"),
    @XmlEnumValue("Mortgage")
    MORTGAGE("Mortgage"),
    @XmlEnumValue("NoArrearsOnLoan")
    NO_ARREARS_ON_LOAN("NoArrearsOnLoan"),
    @XmlEnumValue("NoCustomerInArrears")
    NO_CUSTOMER_IN_ARREARS("NoCustomerInArrears"),
    @XmlEnumValue("NewCustomersOnly")
    NEW_CUSTOMERS_ONLY("NewCustomersOnly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("StartUp")
    START_UP("StartUp"),
    @XmlEnumValue("Turnover")
    TURNOVER("Turnover");
    private final String value;

    Type30(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type30 fromValue(String v) {
        for (Type30 c: Type30 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
