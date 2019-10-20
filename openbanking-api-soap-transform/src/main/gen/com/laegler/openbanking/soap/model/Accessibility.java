
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accessibility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Accessibility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AudioCashMachine"/&gt;
 *     &lt;enumeration value="AutomaticDoors"/&gt;
 *     &lt;enumeration value="ExternalRamp"/&gt;
 *     &lt;enumeration value="InductionLoop"/&gt;
 *     &lt;enumeration value="InternalRamp"/&gt;
 *     &lt;enumeration value="LevelAccess"/&gt;
 *     &lt;enumeration value="LowerLevelCounter"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="WheelchairAccess"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Accessibility")
@XmlEnum
public enum Accessibility {

    @XmlEnumValue("AudioCashMachine")
    AUDIO_CASH_MACHINE("AudioCashMachine"),
    @XmlEnumValue("AutomaticDoors")
    AUTOMATIC_DOORS("AutomaticDoors"),
    @XmlEnumValue("ExternalRamp")
    EXTERNAL_RAMP("ExternalRamp"),
    @XmlEnumValue("InductionLoop")
    INDUCTION_LOOP("InductionLoop"),
    @XmlEnumValue("InternalRamp")
    INTERNAL_RAMP("InternalRamp"),
    @XmlEnumValue("LevelAccess")
    LEVEL_ACCESS("LevelAccess"),
    @XmlEnumValue("LowerLevelCounter")
    LOWER_LEVEL_COUNTER("LowerLevelCounter"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("WheelchairAccess")
    WHEELCHAIR_ACCESS("WheelchairAccess");
    private final String value;

    Accessibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Accessibility fromValue(String v) {
        for (Accessibility c: Accessibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
