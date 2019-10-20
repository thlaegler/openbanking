package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaDataOrganisationAuthorizations
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CertificateValidationResponseSchemaDataOrganisationAuthorizations   {
  @JsonProperty("member_state")
  private String memberState = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

  /**
   * Get memberState
   * @return memberState
  **/
  @ApiModelProperty(value = "")


  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisationAuthorizations addRolesItem(String rolesItem) {
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
    CertificateValidationResponseSchemaDataOrganisationAuthorizations certificateValidationResponseSchemaDataOrganisationAuthorizations = (CertificateValidationResponseSchemaDataOrganisationAuthorizations) o;
    return Objects.equals(this.memberState, certificateValidationResponseSchemaDataOrganisationAuthorizations.memberState) &&
        Objects.equals(this.roles, certificateValidationResponseSchemaDataOrganisationAuthorizations.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberState, roles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

