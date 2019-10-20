
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type19.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type19"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DirectDebits"/&gt;
 *     &lt;enumeration value="ExistingCustomers"/&gt;
 *     &lt;enumeration value="MinimumOperatingBalance"/&gt;
 *     &lt;enumeration value="MinimumDeposit"/&gt;
 *     &lt;enumeration value="NewCustomersOnly"/&gt;
 *     &lt;enumeration value="PreviousBankruptcyAllowed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="StudentsOnly"/&gt;
 *     &lt;enumeration value="SoleStudentAccount"/&gt;
 *     &lt;enumeration value="SoleUkAccount"/&gt;
 *     &lt;enumeration value="SwitchersOnly"/&gt;
 *     &lt;enumeration value="UCASFulltimeTwoYears"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type19")
@XmlEnum
public enum Type19 {

    @XmlEnumValue("DirectDebits")
    DIRECT_DEBITS("DirectDebits"),
    @XmlEnumValue("ExistingCustomers")
    EXISTING_CUSTOMERS("ExistingCustomers"),
    @XmlEnumValue("MinimumOperatingBalance")
    MINIMUM_OPERATING_BALANCE("MinimumOperatingBalance"),
    @XmlEnumValue("MinimumDeposit")
    MINIMUM_DEPOSIT("MinimumDeposit"),
    @XmlEnumValue("NewCustomersOnly")
    NEW_CUSTOMERS_ONLY("NewCustomersOnly"),
    @XmlEnumValue("PreviousBankruptcyAllowed")
    PREVIOUS_BANKRUPTCY_ALLOWED("PreviousBankruptcyAllowed"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("StudentsOnly")
    STUDENTS_ONLY("StudentsOnly"),
    @XmlEnumValue("SoleStudentAccount")
    SOLE_STUDENT_ACCOUNT("SoleStudentAccount"),
    @XmlEnumValue("SoleUkAccount")
    SOLE_UK_ACCOUNT("SoleUkAccount"),
    @XmlEnumValue("SwitchersOnly")
    SWITCHERS_ONLY("SwitchersOnly"),
    @XmlEnumValue("UCASFulltimeTwoYears")
    UCAS_FULLTIME_TWO_YEARS("UCASFulltimeTwoYears");
    private final String value;

    Type19(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type19 fromValue(String v) {
        for (Type19 c: Type19 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
