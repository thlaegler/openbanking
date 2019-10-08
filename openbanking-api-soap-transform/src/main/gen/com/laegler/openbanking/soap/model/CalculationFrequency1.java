
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationFrequency1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationFrequency1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnClosing"/&gt;
 *     &lt;enumeration value="OnOpening"/&gt;
 *     &lt;enumeration value="ChargingPeriod"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="PerItem"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="OnAnniversary"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PerHundredPounds"/&gt;
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
@XmlType(name = "CalculationFrequency1")
@XmlEnum
public enum CalculationFrequency1 {

    @XmlEnumValue("OnClosing")
    ON_CLOSING("OnClosing"),
    @XmlEnumValue("OnOpening")
    ON_OPENING("OnOpening"),
    @XmlEnumValue("ChargingPeriod")
    CHARGING_PERIOD("ChargingPeriod"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("PerItem")
    PER_ITEM("PerItem"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("OnAnniversary")
    ON_ANNIVERSARY("OnAnniversary"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PerHundredPounds")
    PER_HUNDRED_POUNDS("PerHundredPounds"),
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

    CalculationFrequency1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationFrequency1 fromValue(String v) {
        for (CalculationFrequency1 c: CalculationFrequency1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
