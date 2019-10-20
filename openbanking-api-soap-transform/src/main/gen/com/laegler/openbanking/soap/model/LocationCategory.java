
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BranchExternal"/&gt;
 *     &lt;enumeration value="BranchInternal"/&gt;
 *     &lt;enumeration value="BranchLobby"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="RetailerOutlet"/&gt;
 *     &lt;enumeration value="RemoteUnit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCategory")
@XmlEnum
public enum LocationCategory {

    @XmlEnumValue("BranchExternal")
    BRANCH_EXTERNAL("BranchExternal"),
    @XmlEnumValue("BranchInternal")
    BRANCH_INTERNAL("BranchInternal"),
    @XmlEnumValue("BranchLobby")
    BRANCH_LOBBY("BranchLobby"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("RetailerOutlet")
    RETAILER_OUTLET("RetailerOutlet"),
    @XmlEnumValue("RemoteUnit")
    REMOTE_UNIT("RemoteUnit");
    private final String value;

    LocationCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCategory fromValue(String v) {
        for (LocationCategory c: LocationCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
