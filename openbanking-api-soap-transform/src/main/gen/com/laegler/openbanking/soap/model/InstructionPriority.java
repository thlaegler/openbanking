
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionPriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Urgent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionPriority")
@XmlEnum
public enum InstructionPriority {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Urgent")
    URGENT("Urgent");
    private final String value;

    InstructionPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionPriority fromValue(String v) {
        for (InstructionPriority c: InstructionPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
