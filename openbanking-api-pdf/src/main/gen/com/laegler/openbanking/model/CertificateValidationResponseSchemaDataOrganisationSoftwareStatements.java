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
 * CertificateValidationResponseSchemaDataOrganisationSoftwareStatements
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CertificateValidationResponseSchemaDataOrganisationSoftwareStatements   {
  @JsonProperty("software_id")
  private String softwareId = null;

  public CertificateValidationResponseSchemaDataOrganisationSoftwareStatements softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Get softwareId
   * @return softwareId
  **/
  @ApiModelProperty(value = "")


  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisationSoftwareStatements certificateValidationResponseSchemaDataOrganisationSoftwareStatements = (CertificateValidationResponseSchemaDataOrganisationSoftwareStatements) o;
    return Objects.equals(this.softwareId, certificateValidationResponseSchemaDataOrganisationSoftwareStatements.softwareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationSoftwareStatements {\n");
    
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
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

