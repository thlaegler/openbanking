package com.laegler.openbanking.model;

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

public class MetaData  {
  
  @ApiModelProperty(required = true, value = "")
  private String agreement = "Use of the APIs and any related data will be subject to the terms of the Open Licence and subject to terms and conditions";

  @ApiModelProperty(required = true, value = "")
  private String lastUpdated = null;

  @ApiModelProperty(required = true, value = "Open Banking License")
 /**
   * Open Banking License
  **/
  private String license = "https://www.openbanking.org.uk/open-licence";

  @ApiModelProperty(required = true, value = "Open Banking Terms of Use")
 /**
   * Open Banking Terms of Use
  **/
  private String termsOfUse = "https://www.openbanking.org.uk/terms";

  @ApiModelProperty(required = true, value = "")
  private Integer totalResults = null;
 /**
   * Get agreement
   * @return agreement
  **/
  @JsonProperty("Agreement")
  @NotNull
  public String getAgreement() {
    return agreement;
  }

  public void setAgreement(String agreement) {
    this.agreement = agreement;
  }

  public MetaData agreement(String agreement) {
    this.agreement = agreement;
    return this;
  }

 /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @JsonProperty("LastUpdated")
  @NotNull
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public MetaData lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

 /**
   * Open Banking License
   * @return license
  **/
  @JsonProperty("License")
  @NotNull
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public MetaData license(String license) {
    this.license = license;
    return this;
  }

 /**
   * Open Banking Terms of Use
   * @return termsOfUse
  **/
  @JsonProperty("TermsOfUse")
  @NotNull
  public String getTermsOfUse() {
    return termsOfUse;
  }

  public void setTermsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
  }

  public MetaData termsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
    return this;
  }

 /**
   * Get totalResults
   * @return totalResults
  **/
  @JsonProperty("TotalResults")
  @NotNull
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public MetaData totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

