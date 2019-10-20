
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Schema.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Schema"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="urn:ietf:params:scim:api:messages:2.0:SearchRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Schema")
@XmlEnum
public enum Schema {

    @XmlEnumValue("urn:ietf:params:scim:api:messages:2.0:SearchRequest")
    URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_SEARCH_REQUEST("urn:ietf:params:scim:api:messages:2.0:SearchRequest");
    private final String value;

    Schema(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Schema fromValue(String v) {
        for (Schema c: Schema.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
