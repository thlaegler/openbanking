
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OB_MinMaxType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OB_MinMaxType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FMMN"/&gt;
 *     &lt;enumeration value="FMMX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OB_MinMaxType1Code")
@XmlEnum
public enum OBMinMaxType1Code {

    FMMN,
    FMMX;

    public String value() {
        return name();
    }

    public static OBMinMaxType1Code fromValue(String v) {
        return valueOf(v);
    }

}
