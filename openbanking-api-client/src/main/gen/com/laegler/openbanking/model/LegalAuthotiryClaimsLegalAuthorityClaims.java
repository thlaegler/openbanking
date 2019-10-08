package com.laegler.openbanking.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LegalAuthotiryClaimsLegalAuthorityClaims  {
  
  @ApiModelProperty(value = "Company Registration Id")
 /**
   * Company Registration Id
  **/
  private String registeredId = null;

  @ApiModelProperty(value = "Company Registered Name")
 /**
   * Company Registered Name
  **/
  private String registeredName = null;

  @ApiModelProperty(value = "Identification of registering Authority")
 /**
   * Identification of registering Authority
  **/
  private String registrationAuthorityId = null;
 /**
   * Company Registration Id
   * @return registeredId
  **/
  @JsonProperty("RegisteredId")
  public String getRegisteredId() {
    return registeredId;
  }

  public void setRegisteredId(String registeredId) {
    this.registeredId = registeredId;
  }

  public LegalAuthotiryClaimsLegalAuthorityClaims registeredId(String registeredId) {
    this.registeredId = registeredId;
    return this;
  }

 /**
   * Company Registered Name
   * @return registeredName
  **/
  @JsonProperty("RegisteredName")
  public String getRegisteredName() {
    return registeredName;
  }

  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }

  public LegalAuthotiryClaimsLegalAuthorityClaims registeredName(String registeredName) {
    this.registeredName = registeredName;
    return this;
  }

 /**
   * Identification of registering Authority
   * @return registrationAuthorityId
  **/
  @JsonProperty("RegistrationAuthorityId")
  public String getRegistrationAuthorityId() {
    return registrationAuthorityId;
  }

  public void setRegistrationAuthorityId(String registrationAuthorityId) {
    this.registrationAuthorityId = registrationAuthorityId;
  }

  public LegalAuthotiryClaimsLegalAuthorityClaims registrationAuthorityId(String registrationAuthorityId) {
    this.registrationAuthorityId = registrationAuthorityId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalAuthotiryClaimsLegalAuthorityClaims {\n");
    
    sb.append("    registeredId: ").append(toIndentedString(registeredId)).append("\n");
    sb.append("    registeredName: ").append(toIndentedString(registeredName)).append("\n");
    sb.append("    registrationAuthorityId: ").append(toIndentedString(registrationAuthorityId)).append("\n");
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

