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

public class OBQualifiedTrustServiceProvidersServiceExtensions  {
  
  @ApiModelProperty(value = "'<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'")
 /**
   * '<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'
  **/
  private String additionalInfoLang = null;

  @ApiModelProperty(value = "'<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'")
 /**
   * '<AdditionalServiceInformation> <URI xml:lang=''en''> http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication </URI> </AdditionalServiceInformation>'
  **/
  private String additionalInfoURI = null;

  @ApiModelProperty(value = "<Extension Critical='true'>")
 /**
   * <Extension Critical='true'>
  **/
  private Boolean critical = null;
 /**
   * &#39;&lt;AdditionalServiceInformation&gt; &lt;URI xml:lang&#x3D;&#39;&#39;en&#39;&#39;&gt; http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication &lt;/URI&gt; &lt;/AdditionalServiceInformation&gt;&#39;
   * @return additionalInfoLang
  **/
  @JsonProperty("AdditionalInfoLang")
  public String getAdditionalInfoLang() {
    return additionalInfoLang;
  }

  public void setAdditionalInfoLang(String additionalInfoLang) {
    this.additionalInfoLang = additionalInfoLang;
  }

  public OBQualifiedTrustServiceProvidersServiceExtensions additionalInfoLang(String additionalInfoLang) {
    this.additionalInfoLang = additionalInfoLang;
    return this;
  }

 /**
   * &#39;&lt;AdditionalServiceInformation&gt; &lt;URI xml:lang&#x3D;&#39;&#39;en&#39;&#39;&gt; http://uri.etsi.org/TrstSvc/TrustedList/SvcInfoExt/ForWebSiteAuthentication &lt;/URI&gt; &lt;/AdditionalServiceInformation&gt;&#39;
   * @return additionalInfoURI
  **/
  @JsonProperty("AdditionalInfoURI")
  public String getAdditionalInfoURI() {
    return additionalInfoURI;
  }

  public void setAdditionalInfoURI(String additionalInfoURI) {
    this.additionalInfoURI = additionalInfoURI;
  }

  public OBQualifiedTrustServiceProvidersServiceExtensions additionalInfoURI(String additionalInfoURI) {
    this.additionalInfoURI = additionalInfoURI;
    return this;
  }

 /**
   * &lt;Extension Critical&#x3D;&#39;true&#39;&gt;
   * @return critical
  **/
  @JsonProperty("Critical")
  public Boolean isCritical() {
    return critical;
  }

  public void setCritical(Boolean critical) {
    this.critical = critical;
  }

  public OBQualifiedTrustServiceProvidersServiceExtensions critical(Boolean critical) {
    this.critical = critical;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

