package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.CompetentAuthorityClaimsAuthorisations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Claims sourced from a competent authority(e.g. FCA) - can be applied to either TPPs to ASPSP
 */
@ApiModel(description = "Claims sourced from a competent authority(e.g. FCA) - can be applied to either TPPs to ASPSP")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CompetentAuthorityClaims   {
  @JsonProperty("Authorisations")
  @Valid
  private List<CompetentAuthorityClaimsAuthorisations> authorisations = null;

  @JsonProperty("AuthorityId")
  private String authorityId = null;

  @JsonProperty("EtsiIdentifier")
  private String etsiIdentifier = null;

  @JsonProperty("MemberState")
  private String memberState = null;

  @JsonProperty("RegistrationId")
  private String registrationId = null;

  public CompetentAuthorityClaims authorisations(List<CompetentAuthorityClaimsAuthorisations> authorisations) {
    this.authorisations = authorisations;
    return this;
  }

  public CompetentAuthorityClaims addAuthorisationsItem(CompetentAuthorityClaimsAuthorisations authorisationsItem) {
    if (this.authorisations == null) {
      this.authorisations = new ArrayList<>();
    }
    this.authorisations.add(authorisationsItem);
    return this;
  }

  /**
   * Home or Passported Authorisations
   * @return authorisations
  **/
  @ApiModelProperty(value = "Home or Passported Authorisations")

  @Valid

  public List<CompetentAuthorityClaimsAuthorisations> getAuthorisations() {
    return authorisations;
  }

  public void setAuthorisations(List<CompetentAuthorityClaimsAuthorisations> authorisations) {
    this.authorisations = authorisations;
  }

  public CompetentAuthorityClaims authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * The ID of the accrediting authority.
   * @return authorityId
  **/
  @ApiModelProperty(value = "The ID of the accrediting authority.")


  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public CompetentAuthorityClaims etsiIdentifier(String etsiIdentifier) {
    this.etsiIdentifier = etsiIdentifier;
    return this;
  }

  /**
   * European Telecommunications Standards Institute Organisation Identifier
   * @return etsiIdentifier
  **/
  @ApiModelProperty(value = "European Telecommunications Standards Institute Organisation Identifier")


  public String getEtsiIdentifier() {
    return etsiIdentifier;
  }

  public void setEtsiIdentifier(String etsiIdentifier) {
    this.etsiIdentifier = etsiIdentifier;
  }

  public CompetentAuthorityClaims memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

  /**
   * Member State of the Authority
   * @return memberState
  **/
  @ApiModelProperty(value = "Member State of the Authority")


  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CompetentAuthorityClaims registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Registration Id with the principle authority
   * @return registrationId
  **/
  @ApiModelProperty(value = "Registration Id with the principle authority")


  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetentAuthorityClaims competentAuthorityClaims = (CompetentAuthorityClaims) o;
    return Objects.equals(this.authorisations, competentAuthorityClaims.authorisations) &&
        Objects.equals(this.authorityId, competentAuthorityClaims.authorityId) &&
        Objects.equals(this.etsiIdentifier, competentAuthorityClaims.etsiIdentifier) &&
        Objects.equals(this.memberState, competentAuthorityClaims.memberState) &&
        Objects.equals(this.registrationId, competentAuthorityClaims.registrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisations, authorityId, etsiIdentifier, memberState, registrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetentAuthorityClaims {\n");
    
    sb.append("    authorisations: ").append(toIndentedString(authorisations)).append("\n");
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    etsiIdentifier: ").append(toIndentedString(etsiIdentifier)).append("\n");
    sb.append("    memberState: ").append(toIndentedString(memberState)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
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

