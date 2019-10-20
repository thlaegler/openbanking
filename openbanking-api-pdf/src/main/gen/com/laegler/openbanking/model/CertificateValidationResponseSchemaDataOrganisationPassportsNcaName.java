package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaDataOrganisationPassportsNcaName
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CertificateValidationResponseSchemaDataOrganisationPassportsNcaName   {
  @JsonProperty("permissions")
  @Valid
  private List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName permissions(List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName addPermissionsItem(CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions> permissions) {
    this.permissions = permissions;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisationPassportsNcaName certificateValidationResponseSchemaDataOrganisationPassportsNcaName = (CertificateValidationResponseSchemaDataOrganisationPassportsNcaName) o;
    return Objects.equals(this.permissions, certificateValidationResponseSchemaDataOrganisationPassportsNcaName.permissions) &&
        Objects.equals(this.roles, certificateValidationResponseSchemaDataOrganisationPassportsNcaName.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, roles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

