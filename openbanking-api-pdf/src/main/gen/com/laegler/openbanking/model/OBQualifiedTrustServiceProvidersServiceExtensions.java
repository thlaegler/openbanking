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
 * OBQualifiedTrustServiceProvidersServiceExtensions
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBQualifiedTrustServiceProvidersServiceExtensions   {
  @JsonProperty("AdditionalInfoLang")
  private String additionalInfoLang = null;

  @JsonProperty("AdditionalInfoURI")
  private String additionalInfoURI = null;

  @JsonProperty("Critical")
  private Boolean critical = null;

  public OBQualifiedTrustServiceProvidersServiceExtensions additionalInfoLang(String additionalInfoLang) {
    this.additionalInfoLang = additionalInfoLang;
    return this;
  }

  /**
   * '<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'
   * @return additionalInfoLang
  **/
  @ApiModelProperty(value = "'<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'")


  public String getAdditionalInfoLang() {
    return additionalInfoLang;
  }

  public void setAdditionalInfoLang(String additionalInfoLang) {
    this.additionalInfoLang = additionalInfoLang;
  }

  public OBQualifiedTrustServiceProvidersServiceExtensions additionalInfoURI(String additionalInfoURI) {
    this.additionalInfoURI = additionalInfoURI;
    return this;
  }

  /**
   * '<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'
   * @return additionalInfoURI
  **/
  @ApiModelProperty(value = "'<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'")


  public String getAdditionalInfoURI() {
    return additionalInfoURI;
  }

  public void setAdditionalInfoURI(String additionalInfoURI) {
    this.additionalInfoURI = additionalInfoURI;
  }

  public OBQualifiedTrustServiceProvidersServiceExtensions critical(Boolean critical) {
    this.critical = critical;
    return this;
  }

  /**
   * <Extension Critical='true'>
   * @return critical
  **/
  @ApiModelProperty(value = "<Extension Critical='true'>")


  public Boolean isCritical() {
    return critical;
  }

  public void setCritical(Boolean critical) {
    this.critical = critical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBQualifiedTrustServiceProvidersServiceExtensions obQualifiedTrustServiceProvidersServiceExtensions = (OBQualifiedTrustServiceProvidersServiceExtensions) o;
    return Objects.equals(this.additionalInfoLang, obQualifiedTrustServiceProvidersServiceExtensions.additionalInfoLang) &&
        Objects.equals(this.additionalInfoURI, obQualifiedTrustServiceProvidersServiceExtensions.additionalInfoURI) &&
        Objects.equals(this.critical, obQualifiedTrustServiceProvidersServiceExtensions.critical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfoLang, additionalInfoURI, critical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBQualifiedTrustServiceProvidersServiceExtensions {\n");
    
    sb.append("    additionalInfoLang: ").append(toIndentedString(additionalInfoLang)).append("\n");
    sb.append("    additionalInfoURI: ").append(toIndentedString(additionalInfoURI)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
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

