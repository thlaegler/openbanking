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
 * MetaData
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class MetaData   {
  @JsonProperty("Agreement")
  private String agreement = "Use of the APIs and any related data will be subject to the terms of the Open Licence and subject to terms and conditions";

  @JsonProperty("LastUpdated")
  private String lastUpdated = null;

  @JsonProperty("License")
  private String license = "https://www.openbanking.org.uk/open-licence";

  @JsonProperty("TermsOfUse")
  private String termsOfUse = "https://www.openbanking.org.uk/terms";

  @JsonProperty("TotalResults")
  private Integer totalResults = null;

  public MetaData agreement(String agreement) {
    this.agreement = agreement;
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAgreement() {
    return agreement;
  }

  public void setAgreement(String agreement) {
    this.agreement = agreement;
  }

  public MetaData lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public MetaData license(String license) {
    this.license = license;
    return this;
  }

  /**
   * Open Banking License
   * @return license
  **/
  @ApiModelProperty(required = true, value = "Open Banking License")
  @NotNull


  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public MetaData termsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
    return this;
  }

  /**
   * Open Banking Terms of Use
   * @return termsOfUse
  **/
  @ApiModelProperty(required = true, value = "Open Banking Terms of Use")
  @NotNull


  public String getTermsOfUse() {
    return termsOfUse;
  }

  public void setTermsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
  }

  public MetaData totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Get totalResults
   * @return totalResults
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaData metaData = (MetaData) o;
    return Objects.equals(this.agreement, metaData.agreement) &&
        Objects.equals(this.lastUpdated, metaData.lastUpdated) &&
        Objects.equals(this.license, metaData.license) &&
        Objects.equals(this.termsOfUse, metaData.termsOfUse) &&
        Objects.equals(this.totalResults, metaData.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreement, lastUpdated, license, termsOfUse, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaData {\n");
    
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

