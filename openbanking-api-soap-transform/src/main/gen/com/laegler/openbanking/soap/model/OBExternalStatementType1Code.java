
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBExternalStatementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OBExternalStatementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccountClosure"/&gt;
 *     &lt;enumeration value="AccountOpening"/&gt;
 *     &lt;enumeration value="Annual"/&gt;
 *     &lt;enumeration value="Interim"/&gt;
 *     &lt;enumeration value="RegularPeriodic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OBExternalStatementType1Code")
@XmlEnum
public enum OBExternalStatementType1Code {

    @XmlEnumValue("AccountClosure")
    ACCOUNT_CLOSURE("AccountClosure"),
    @XmlEnumValue("AccountOpening")
    ACCOUNT_OPENING("AccountOpening"),
    @XmlEnumValue("Annual")
    ANNUAL("Annual"),
    @XmlEnumValue("Interim")
    INTERIM("Interim"),
    @XmlEnumValue("RegularPeriodic")
    REGULAR_PERIODIC("RegularPeriodic");
    private final String value;

    OBExternalStatementType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OBExternalStatementType1Code fromValue(String v) {
        for (OBExternalStatementType1Code c: OBExternalStatementType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
