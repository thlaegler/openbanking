package com.laegler.openbanking.model;

import com.laegler.openbanking.model.LegalAuthotiryClaimsLegalAuthorityClaims;
import io.swagger.annotations.ApiModel;
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

/**
  * Claims sourced from a legal authority(e.g. Companies House) - can be applied to either TPPs to ASPSP
 **/
@ApiModel(description="Claims sourced from a legal authority(e.g. Companies House) - can be applied to either TPPs to ASPSP")
public class LegalAuthotiryClaims  {
  
  @ApiModelProperty(value = "Details of each Company Registration Authority with which the Company is registered")
 /**
   * Details of each Company Registration Authority with which the Company is registered
  **/
  private List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims = null;
 /**
   * Details of each Company Registration Authority with which the Company is registered
   * @return legalAuthorityClaims
  **/
  @JsonProperty("LegalAuthorityClaims")
  public List<LegalAuthotiryClaimsLegalAuthorityClaims> getLegalAuthorityClaims() {
    return legalAuthorityClaims;
  }

  public void setLegalAuthorityClaims(List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims) {
    this.legalAuthorityClaims = legalAuthorityClaims;
  }

  public LegalAuthotiryClaims legalAuthorityClaims(List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims) {
    this.legalAuthorityClaims = legalAuthorityClaims;
    return this;
  }

  public LegalAuthotiryClaims addLegalAuthorityClaimsItem(LegalAuthotiryClaimsLegalAuthorityClaims legalAuthorityClaimsItem) {
    this.legalAuthorityClaims.add(legalAuthorityClaimsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalAuthotiryClaims {\n");
    
    sb.append("    legalAuthorityClaims: ").append(toIndentedString(legalAuthorityClaims)).append("\n");
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

