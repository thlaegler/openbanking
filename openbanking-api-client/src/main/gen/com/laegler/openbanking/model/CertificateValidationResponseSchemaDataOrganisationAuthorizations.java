package com.laegler.openbanking.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CertificateValidationResponseSchemaDataOrganisationAuthorizations  {
  
  @ApiModelProperty(value = "")
  private String memberState = null;

  @ApiModelProperty(value = "")
  private List<String> roles = null;
 /**
   * Get memberState
   * @return memberState
  **/
  @JsonProperty("member_state")
  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

 /**
   * Get roles
   * @return roles
  **/
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationAuthorizations {\n");
    
    sb.append("    memberState: ").append(toIndentedString(memberState)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

