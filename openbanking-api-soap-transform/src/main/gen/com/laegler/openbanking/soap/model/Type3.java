
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type3"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AnyBusinessCustomer"/&gt;
 *     &lt;enumeration value="MinimumAnniversary"/&gt;
 *     &lt;enumeration value="ExistingCustomers"/&gt;
 *     &lt;enumeration value="MinimumDeposit"/&gt;
 *     &lt;enumeration value="MinimumTransactions"/&gt;
 *     &lt;enumeration value="NewCustomersOnly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="SwitchersOnly"/&gt;
 *     &lt;enumeration value="StartUp"/&gt;
 *     &lt;enumeration value="SoleUkAccount"/&gt;
 *     &lt;enumeration value="ThirdSectorOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type3")
@XmlEnum
public enum Type3 {

    @XmlEnumValue("AnyBusinessCustomer")
    ANY_BUSINESS_CUSTOMER("AnyBusinessCustomer"),
    @XmlEnumValue("MinimumAnniversary")
    MINIMUM_ANNIVERSARY("MinimumAnniversary"),
    @XmlEnumValue("ExistingCustomers")
    EXISTING_CUSTOMERS("ExistingCustomers"),
    @XmlEnumValue("MinimumDeposit")
    MINIMUM_DEPOSIT("MinimumDeposit"),
    @XmlEnumValue("MinimumTransactions")
    MINIMUM_TRANSACTIONS("MinimumTransactions"),
    @XmlEnumValue("NewCustomersOnly")
    NEW_CUSTOMERS_ONLY("NewCustomersOnly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SwitchersOnly")
    SWITCHERS_ONLY("SwitchersOnly"),
    @XmlEnumValue("StartUp")
    START_UP("StartUp"),
    @XmlEnumValue("SoleUkAccount")
    SOLE_UK_ACCOUNT("SoleUkAccount"),
    @XmlEnumValue("ThirdSectorOnly")
    THIRD_SECTOR_ONLY("ThirdSectorOnly");
    private final String value;

    Type3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type3 fromValue(String v) {
        for (Type3 c: Type3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
