package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomesticConsent3DataAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataSCASupportData;
import com.laegler.openbanking.model.OBWriteDomesticScheduled2DataInitiation;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBWriteDomesticScheduledConsent3Data  {
  
  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomesticScheduled2DataInitiation initiation = null;


@XmlType(name="PermissionEnum")
@XmlEnum(String.class)
public enum PermissionEnum {

@XmlEnumValue("Create") CREATE(String.valueOf("Create"));


    private String value;

    PermissionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String v) {
        for (PermissionEnum b : PermissionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
 /**
   * Specifies the Open Banking service request types.
  **/
  private PermissionEnum permission = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;
 /**
   * Get authorisation
   * @return authorisation
  **/
  @JsonProperty("Authorisation")
  public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteDomesticScheduledConsent3Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

 /**
   * Get initiation
   * @return initiation
  **/
  @JsonProperty("Initiation")
  public OBWriteDomesticScheduled2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomesticScheduled2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticScheduledConsent3Data initiation(OBWriteDomesticScheduled2DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

 /**
   * Specifies the Open Banking service request types.
   * @return permission
  **/
  @JsonProperty("Permission")
  public String getPermission() {
    if (permission == null) {
      return null;
    }
    return permission.value();
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public OBWriteDomesticScheduledConsent3Data permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

 /**
   * Get scASupportData
   * @return scASupportData
  **/
  @JsonProperty("SCASupportData")
  public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }

  public OBWriteDomesticScheduledConsent3Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticScheduledConsent3Data {\n");
    
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

