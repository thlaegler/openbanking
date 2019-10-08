package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CompetentAuthorityClaimsAuthorisations;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Claims sourced from a competent authority(e.g. FCA) - can be applied to either TPPs to ASPSP
 **/
@ApiModel(description="Claims sourced from a competent authority(e.g. FCA) - can be applied to either TPPs to ASPSP")
public class CompetentAuthorityClaims  {
  
  @ApiModelProperty(value = "Home or Passported Authorisations")
  @Valid
 /**
   * Home or Passported Authorisations
  **/
  private List<CompetentAuthorityClaimsAuthorisations> authorisations = null;

  @ApiModelProperty(value = "The ID of the accrediting authority.")
 /**
   * The ID of the accrediting authority.
  **/
  private String authorityId = null;

  @ApiModelProperty(value = "European Telecommunications Standards Institute Organisation Identifier")
 /**
   * European Telecommunications Standards Institute Organisation Identifier
  **/
  private String etsiIdentifier = null;

  @ApiModelProperty(value = "Member State of the Authority")
 /**
   * Member State of the Authority
  **/
  private String memberState = null;

  @ApiModelProperty(value = "Registration Id with the principle authority")
 /**
   * Registration Id with the principle authority
  **/
  private String registrationId = null;
 /**
   * Home or Passported Authorisations
   * @return authorisations
  **/
  @JsonProperty("Authorisations")
  public List<CompetentAuthorityClaimsAuthorisations> getAuthorisations() {
    return authorisations;
  }

  public void setAuthorisations(List<CompetentAuthorityClaimsAuthorisations> authorisations) {
    this.authorisations = authorisations;
  }

  public CompetentAuthorityClaims authorisations(List<CompetentAuthorityClaimsAuthorisations> authorisations) {
    this.authorisations = authorisations;
    return this;
  }

  public CompetentAuthorityClaims addAuthorisationsItem(CompetentAuthorityClaimsAuthorisations authorisationsItem) {
    this.authorisations.add(authorisationsItem);
    return this;
  }

 /**
   * The ID of the accrediting authority.
   * @return authorityId
  **/
  @JsonProperty("AuthorityId")
  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public CompetentAuthorityClaims authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

 /**
   * European Telecommunications Standards Institute Organisation Identifier
   * @return etsiIdentifier
  **/
  @JsonProperty("EtsiIdentifier")
  public String getEtsiIdentifier() {
    return etsiIdentifier;
  }

  public void setEtsiIdentifier(String etsiIdentifier) {
    this.etsiIdentifier = etsiIdentifier;
  }

  public CompetentAuthorityClaims etsiIdentifier(String etsiIdentifier) {
    this.etsiIdentifier = etsiIdentifier;
    return this;
  }

 /**
   * Member State of the Authority
   * @return memberState
  **/
  @JsonProperty("MemberState")
  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CompetentAuthorityClaims memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

 /**
   * Registration Id with the principle authority
   * @return registrationId
  **/
  @JsonProperty("RegistrationId")
  public String getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(String registrationId) {
    this.registrationId = registrationId;
  }

  public CompetentAuthorityClaims registrationId(String registrationId) {
    this.registrationId = registrationId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

