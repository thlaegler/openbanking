package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassportsNcaName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaDataOrganisationPassports
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CertificateValidationResponseSchemaDataOrganisationPassports   {
  @JsonProperty("nca_name")
  private CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName = null;

  public CertificateValidationResponseSchemaDataOrganisationPassports ncaName(CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName) {
    this.ncaName = ncaName;
    return this;
  }

  /**
   * Get ncaName
   * @return ncaName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName getNcaName() {
    return ncaName;
  }

  public void setNcaName(CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName) {
    this.ncaName = ncaName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisationPassports certificateValidationResponseSchemaDataOrganisationPassports = (CertificateValidationResponseSchemaDataOrganisationPassports) o;
    return Objects.equals(this.ncaName, certificateValidationResponseSchemaDataOrganisationPassports.ncaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ncaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationPassports {\n");
    
    sb.append("    ncaName: ").append(toIndentedString(ncaName)).append("\n");
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

