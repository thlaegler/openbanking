package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassports;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationSoftwareStatements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CertificateValidationResponseSchemaDataOrganisation
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CertificateValidationResponseSchemaDataOrganisation   {
  @JsonProperty("competent_authority_claims")
  @Valid
  private List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims = null;

  @JsonProperty("onboarded_to_open_banking")
  private Boolean onboardedToOpenBanking = null;

  @JsonProperty("org_name")
  private String orgName = null;

  @JsonProperty("passports")
  private CertificateValidationResponseSchemaDataOrganisationPassports passports = null;

  @JsonProperty("software_statements")
  @Valid
  private List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements = null;

  public CertificateValidationResponseSchemaDataOrganisation competentAuthorityClaims(List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims) {
    this.competentAuthorityClaims = competentAuthorityClaims;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisation addCompetentAuthorityClaimsItem(CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims competentAuthorityClaimsItem) {
    if (this.competentAuthorityClaims == null) {
      this.competentAuthorityClaims = new ArrayList<>();
    }
    this.competentAuthorityClaims.add(competentAuthorityClaimsItem);
    return this;
  }

  /**
   * Get competentAuthorityClaims
   * @return competentAuthorityClaims
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> getCompetentAuthorityClaims() {
    return competentAuthorityClaims;
  }

  public void setCompetentAuthorityClaims(List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims) {
    this.competentAuthorityClaims = competentAuthorityClaims;
  }

  public CertificateValidationResponseSchemaDataOrganisation onboardedToOpenBanking(Boolean onboardedToOpenBanking) {
    this.onboardedToOpenBanking = onboardedToOpenBanking;
    return this;
  }

  /**
   * Get onboardedToOpenBanking
   * @return onboardedToOpenBanking
  **/
  @ApiModelProperty(value = "")


  public Boolean isOnboardedToOpenBanking() {
    return onboardedToOpenBanking;
  }

  public void setOnboardedToOpenBanking(Boolean onboardedToOpenBanking) {
    this.onboardedToOpenBanking = onboardedToOpenBanking;
  }

  public CertificateValidationResponseSchemaDataOrganisation orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * Get orgName
   * @return orgName
  **/
  @ApiModelProperty(value = "")


  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public CertificateValidationResponseSchemaDataOrganisation passports(CertificateValidationResponseSchemaDataOrganisationPassports passports) {
    this.passports = passports;
    return this;
  }

  /**
   * Get passports
   * @return passports
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CertificateValidationResponseSchemaDataOrganisationPassports getPassports() {
    return passports;
  }

  public void setPassports(CertificateValidationResponseSchemaDataOrganisationPassports passports) {
    this.passports = passports;
  }

  public CertificateValidationResponseSchemaDataOrganisation softwareStatements(List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisation addSoftwareStatementsItem(CertificateValidationResponseSchemaDataOrganisationSoftwareStatements softwareStatementsItem) {
    if (this.softwareStatements == null) {
      this.softwareStatements = new ArrayList<>();
    }
    this.softwareStatements.add(softwareStatementsItem);
    return this;
  }

  /**
   * Get softwareStatements
   * @return softwareStatements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> getSoftwareStatements() {
    return softwareStatements;
  }

  public void setSoftwareStatements(List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidationResponseSchemaDataOrganisation certificateValidationResponseSchemaDataOrganisation = (CertificateValidationResponseSchemaDataOrganisation) o;
    return Objects.equals(this.competentAuthorityClaims, certificateValidationResponseSchemaDataOrganisation.competentAuthorityClaims) &&
        Objects.equals(this.onboardedToOpenBanking, certificateValidationResponseSchemaDataOrganisation.onboardedToOpenBanking) &&
        Objects.equals(this.orgName, certificateValidationResponseSchemaDataOrganisation.orgName) &&
        Objects.equals(this.passports, certificateValidationResponseSchemaDataOrganisation.passports) &&
        Objects.equals(this.softwareStatements, certificateValidationResponseSchemaDataOrganisation.softwareStatements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competentAuthorityClaims, onboardedToOpenBanking, orgName, passports, softwareStatements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisation {\n");
    
    sb.append("    competentAuthorityClaims: ").append(toIndentedString(competentAuthorityClaims)).append("\n");
    sb.append("    onboardedToOpenBanking: ").append(toIndentedString(onboardedToOpenBanking)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    passports: ").append(toIndentedString(passports)).append("\n");
    sb.append("    softwareStatements: ").append(toIndentedString(softwareStatements)).append("\n");
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

