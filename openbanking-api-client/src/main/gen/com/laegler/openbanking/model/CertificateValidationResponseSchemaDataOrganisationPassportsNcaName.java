package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions;
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

public class CertificateValidationResponseSchemaDataOrganisationPassportsNcaName  {
  
  @ApiModelProperty(value = "")
  private List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions = null;

  @ApiModelProperty(value = "")
  private List<String> roles = null;
 /**
   * Get permissions
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions) {
    this.permissions = permissions;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName permissions(List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName addPermissionsItem(CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions permissionsItem) {
    this.permissions.add(permissionsItem);
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

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationPassportsNcaName {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

