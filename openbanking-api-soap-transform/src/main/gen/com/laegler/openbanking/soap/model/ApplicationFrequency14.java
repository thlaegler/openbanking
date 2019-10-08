
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationFrequency14.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationFrequency14"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AccountClosing"/&gt;
 *     &lt;enumeration value="AccountOpening"/&gt;
 *     &lt;enumeration value="AcademicTerm"/&gt;
 *     &lt;enumeration value="ChargingPeriod"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="PerItem"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="OnAccountAnniversary"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PerHour"/&gt;
 *     &lt;enumeration value="PerOccurrence"/&gt;
 *     &lt;enumeration value="PerSheet"/&gt;
 *     &lt;enumeration value="PerTransaction"/&gt;
 *     &lt;enumeration value="PerTransactionAmount"/&gt;
 *     &lt;enumeration value="PerTransactionPercentage"/&gt;
 *     &lt;enumeration value="Quarterly"/&gt;
 *     &lt;enumeration value="SixMonthly"/&gt;
 *     &lt;enumeration value="StatementMonthly"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationFrequency14")
@XmlEnum
public enum ApplicationFrequency14 {

    @XmlEnumValue("AccountClosing")
    ACCOUNT_CLOSING("AccountClosing"),
    @XmlEnumValue("AccountOpening")
    ACCOUNT_OPENING("AccountOpening"),
    @XmlEnumValue("AcademicTerm")
    ACADEMIC_TERM("AcademicTerm"),
    @XmlEnumValue("ChargingPeriod")
    CHARGING_PERIOD("ChargingPeriod"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("PerItem")
    PER_ITEM("PerItem"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("OnAccountAnniversary")
    ON_ACCOUNT_ANNIVERSARY("OnAccountAnniversary"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PerHour")
    PER_HOUR("PerHour"),
    @XmlEnumValue("PerOccurrence")
    PER_OCCURRENCE("PerOccurrence"),
    @XmlEnumValue("PerSheet")
    PER_SHEET("PerSheet"),
    @XmlEnumValue("PerTransaction")
    PER_TRANSACTION("PerTransaction"),
    @XmlEnumValue("PerTransactionAmount")
    PER_TRANSACTION_AMOUNT("PerTransactionAmount"),
    @XmlEnumValue("PerTransactionPercentage")
    PER_TRANSACTION_PERCENTAGE("PerTransactionPercentage"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("SixMonthly")
    SIX_MONTHLY("SixMonthly"),
    @XmlEnumValue("StatementMonthly")
    STATEMENT_MONTHLY("StatementMonthly"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    ApplicationFrequency14(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationFrequency14 fromValue(String v) {
        for (ApplicationFrequency14 c: ApplicationFrequency14 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
