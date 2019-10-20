package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.LegalAuthotiryClaimsLegalAuthorityClaims;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Claims sourced from a legal authority(e.g. Companies House) - can be applied to either TPPs to ASPSP
 */
@ApiModel(description = "Claims sourced from a legal authority(e.g. Companies House) - can be applied to either TPPs to ASPSP")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class LegalAuthotiryClaims   {
  @JsonProperty("LegalAuthorityClaims")
  @Valid
  private List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims = null;

  public LegalAuthotiryClaims legalAuthorityClaims(List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims) {
    this.legalAuthorityClaims = legalAuthorityClaims;
    return this;
  }

  public LegalAuthotiryClaims addLegalAuthorityClaimsItem(LegalAuthotiryClaimsLegalAuthorityClaims legalAuthorityClaimsItem) {
    if (this.legalAuthorityClaims == null) {
      this.legalAuthorityClaims = new ArrayList<>();
    }
    this.legalAuthorityClaims.add(legalAuthorityClaimsItem);
    return this;
  }

  /**
   * Details of each Company Registration Authority with which the Company is registered
   * @return legalAuthorityClaims
  **/
  @ApiModelProperty(value = "Details of each Company Registration Authority with which the Company is registered")

  @Valid

  public List<LegalAuthotiryClaimsLegalAuthorityClaims> getLegalAuthorityClaims() {
    return legalAuthorityClaims;
  }

  public void setLegalAuthorityClaims(List<LegalAuthotiryClaimsLegalAuthorityClaims> legalAuthorityClaims) {
    this.legalAuthorityClaims = legalAuthorityClaims;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalAuthotiryClaims legalAuthotiryClaims = (LegalAuthotiryClaims) o;
    return Objects.equals(this.legalAuthorityClaims, legalAuthotiryClaims.legalAuthorityClaims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalAuthorityClaims);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

