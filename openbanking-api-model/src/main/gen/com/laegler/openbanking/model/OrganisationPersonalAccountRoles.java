package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrganisationPersonalAccountRoles
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OrganisationPersonalAccountRoles   {
  @JsonProperty("Role")
  private String role = null;

  @JsonProperty("UserName")
  private String userName = null;

  public OrganisationPersonalAccountRoles role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role which the individual holds
   * @return role
  **/
  @ApiModelProperty(value = "Role which the individual holds")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OrganisationPersonalAccountRoles userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * User's name, email address or other identifying label
   * @return userName
  **/
  @ApiModelProperty(value = "User's name, email address or other identifying label")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationPersonalAccountRoles organisationPersonalAccountRoles = (OrganisationPersonalAccountRoles) o;
    return Objects.equals(this.role, organisationPersonalAccountRoles.role) &&
        Objects.equals(this.userName, organisationPersonalAccountRoles.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationPersonalAccountRoles {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

