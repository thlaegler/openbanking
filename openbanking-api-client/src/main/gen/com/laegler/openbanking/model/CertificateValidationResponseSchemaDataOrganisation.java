package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassports;
import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationSoftwareStatements;
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

public class CertificateValidationResponseSchemaDataOrganisation  {
  
  @ApiModelProperty(value = "")
  private List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims = null;

  @ApiModelProperty(value = "")
  private Boolean onboardedToOpenBanking = null;

  @ApiModelProperty(value = "")
  private String orgName = null;

  @ApiModelProperty(value = "")
  private CertificateValidationResponseSchemaDataOrganisationPassports passports = null;

  @ApiModelProperty(value = "")
  private List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements = null;
 /**
   * Get competentAuthorityClaims
   * @return competentAuthorityClaims
  **/
  @JsonProperty("competent_authority_claims")
  public List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> getCompetentAuthorityClaims() {
    return competentAuthorityClaims;
  }

  public void setCompetentAuthorityClaims(List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims) {
    this.competentAuthorityClaims = competentAuthorityClaims;
  }

  public CertificateValidationResponseSchemaDataOrganisation competentAuthorityClaims(List<CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims> competentAuthorityClaims) {
    this.competentAuthorityClaims = competentAuthorityClaims;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisation addCompetentAuthorityClaimsItem(CertificateValidationResponseSchemaDataOrganisationCompetentAuthorityClaims competentAuthorityClaimsItem) {
    this.competentAuthorityClaims.add(competentAuthorityClaimsItem);
    return this;
  }

 /**
   * Get onboardedToOpenBanking
   * @return onboardedToOpenBanking
  **/
  @JsonProperty("onboarded_to_open_banking")
  public Boolean isOnboardedToOpenBanking() {
    return onboardedToOpenBanking;
  }

  public void setOnboardedToOpenBanking(Boolean onboardedToOpenBanking) {
    this.onboardedToOpenBanking = onboardedToOpenBanking;
  }

  public CertificateValidationResponseSchemaDataOrganisation onboardedToOpenBanking(Boolean onboardedToOpenBanking) {
    this.onboardedToOpenBanking = onboardedToOpenBanking;
    return this;
  }

 /**
   * Get orgName
   * @return orgName
  **/
  @JsonProperty("org_name")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public CertificateValidationResponseSchemaDataOrganisation orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

 /**
   * Get passports
   * @return passports
  **/
  @JsonProperty("passports")
  public CertificateValidationResponseSchemaDataOrganisationPassports getPassports() {
    return passports;
  }

  public void setPassports(CertificateValidationResponseSchemaDataOrganisationPassports passports) {
    this.passports = passports;
  }

  public CertificateValidationResponseSchemaDataOrganisation passports(CertificateValidationResponseSchemaDataOrganisationPassports passports) {
    this.passports = passports;
    return this;
  }

 /**
   * Get softwareStatements
   * @return softwareStatements
  **/
  @JsonProperty("software_statements")
  public List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> getSoftwareStatements() {
    return softwareStatements;
  }

  public void setSoftwareStatements(List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
  }

  public CertificateValidationResponseSchemaDataOrganisation softwareStatements(List<CertificateValidationResponseSchemaDataOrganisationSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
    return this;
  }

  public CertificateValidationResponseSchemaDataOrganisation addSoftwareStatementsItem(CertificateValidationResponseSchemaDataOrganisationSoftwareStatements softwareStatementsItem) {
    this.softwareStatements.add(softwareStatementsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

