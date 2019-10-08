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
 * CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("effective_from")
  private String effectiveFrom = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("permission")
  private String permission = null;

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @ApiModelProperty(value = "")


  public String getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions permission(String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(value = "")


  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions certificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions = (CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions) o;
    return Objects.equals(this.code, certificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions.code) &&
        Objects.equals(this.effectiveFrom, certificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions.effectiveFrom) &&
        Objects.equals(this.id, certificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions.id) &&
        Objects.equals(this.permission, certificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, effectiveFrom, id, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationPassportsNcaNamePermissions {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

