package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.OBQualifiedTrustServiceProvidersServiceExtensions;
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
  * eIDAS Qualified Trust Service Provider
 **/
@ApiModel(description="eIDAS Qualified Trust Service Provider")
public class OBQualifiedTrustServiceProviders  {
  
  @ApiModelProperty(required = true, value = "SHA-256 Certificate Fingerprint")
 /**
   * SHA-256 Certificate Fingerprint
  **/
  private String certificateFingerprint = null;

  @ApiModelProperty(value = "OB Creation Timestamp")
 /**
   * OB Creation Timestamp
  **/
  private String createTimestamp = null;

  @ApiModelProperty(value = "OB Modification Timestamp")
 /**
   * OB Modification Timestamp
  **/
  private String modifyTimestamp = null;

  @ApiModelProperty(required = true, value = "'<SchemeOperatorAddress> <PostalAddresses> <PostalAddress xml:lang=''en''> <StreetAddress>NG III - Koning Albert II-laan 16</StreetAddress> <Locality>Brussels</Locality> <StateOrProvince>Brussels</StateOrProvince> <PostalCode>1000</PostalCode> <CountryName>BE</CountryName>'")
 /**
   * '<SchemeOperatorAddress> <PostalAddresses> <PostalAddress xml:lang=''en''> <StreetAddress>NG III - Koning Albert II-laan 16</StreetAddress> <Locality>Brussels</Locality> <StateOrProvince>Brussels</StateOrProvince> <PostalCode>1000</PostalCode> <CountryName>BE</CountryName>'
  **/
  private String serviceCountry = null;

  @ApiModelProperty(required = true, value = "<ServiceInformationExtensions> ... </ServiceInformationExtensions>")
  @Valid
 /**
   * <ServiceInformationExtensions> ... </ServiceInformationExtensions>
  **/
  private List<OBQualifiedTrustServiceProvidersServiceExtensions> serviceExtensions = new ArrayList<OBQualifiedTrustServiceProvidersServiceExtensions>();

  @ApiModelProperty(required = true, value = "<Name xml:lang='en'>TeleSec ServerPass</Name>")
 /**
   * <Name xml:lang='en'>TeleSec ServerPass</Name>
  **/
  private String serviceLanguage = null;

  @ApiModelProperty(required = true, value = "<Name xml:lang='en'>TeleSec ServerPass</Name>")
 /**
   * <Name xml:lang='en'>TeleSec ServerPass</Name>
  **/
  private String serviceName = null;

  @ApiModelProperty(required = true, value = "<ServiceStatus> http://uri.etsi.org/TrstSvc/TrustedList/Svcstatus/granted</ServiceStatus>")
 /**
   * <ServiceStatus> http://uri.etsi.org/TrstSvc/TrustedList/Svcstatus/granted</ServiceStatus>
  **/
  private String serviceStatus = null;

  @ApiModelProperty(required = true, value = "")
  private String serviceType = null;

  @ApiModelProperty(required = true, value = "<StatusStartingTime>2017-11-20T09:00:00Z</StatusStartingTime>")
 /**
   * <StatusStartingTime>2017-11-20T09:00:00Z</StatusStartingTime>
  **/
  private String statusStartingTime = null;

  @ApiModelProperty(required = true, value = "<X509Certificate> MIIF1DCCBLygAwIBAgIIF00 .... </X509Certificate>")
 /**
   * <X509Certificate> MIIF1DCCBLygAwIBAgIIF00 .... </X509Certificate>
  **/
  private String x509Certificate = null;

  @ApiModelProperty(required = true, value = "<X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>")
 /**
   * <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>
  **/
  private String x509SKI = null;

  @ApiModelProperty(required = true, value = "<X509SubjectName> CN=TeleSec ServerPass Ex ... </X509SubjectName> <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>")
 /**
   * <X509SubjectName> CN=TeleSec ServerPass Ex ... </X509SubjectName> <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>
  **/
  private String x509SubjectName = null;

  @ApiModelProperty(value = "")
  private String externalId = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private Meta meta = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> schemas = new ArrayList<String>();
 /**
   * SHA-256 Certificate Fingerprint
   * @return certificateFingerprint
  **/
  @JsonProperty("CertificateFingerprint")
  @NotNull
  public String getCertificateFingerprint() {
    return certificateFingerprint;
  }

  public void setCertificateFingerprint(String certificateFingerprint) {
    this.certificateFingerprint = certificateFingerprint;
  }

  public OBQualifiedTrustServiceProviders certificateFingerprint(String certificateFingerprint) {
    this.certificateFingerprint = certificateFingerprint;
    return this;
  }

 /**
   * OB Creation Timestamp
   * @return createTimestamp
  **/
  @JsonProperty("CreateTimestamp")
  public String getCreateTimestamp() {
    return createTimestamp;
  }


 /**
   * OB Modification Timestamp
   * @return modifyTimestamp
  **/
  @JsonProperty("ModifyTimestamp")
  public String getModifyTimestamp() {
    return modifyTimestamp;
  }


 /**
   * &#39;&lt;SchemeOperatorAddress&gt; &lt;PostalAddresses&gt; &lt;PostalAddress xml:lang&#x3D;&#39;&#39;en&#39;&#39;&gt; &lt;StreetAddress&gt;NG III - Koning Albert II-laan 16&lt;/StreetAddress&gt; &lt;Locality&gt;Brussels&lt;/Locality&gt; &lt;StateOrProvince&gt;Brussels&lt;/StateOrProvince&gt; &lt;PostalCode&gt;1000&lt;/PostalCode&gt; &lt;CountryName&gt;BE&lt;/CountryName&gt;&#39;
   * @return serviceCountry
  **/
  @JsonProperty("ServiceCountry")
  @NotNull
  public String getServiceCountry() {
    return serviceCountry;
  }

  public void setServiceCountry(String serviceCountry) {
    this.serviceCountry = serviceCountry;
  }

  public OBQualifiedTrustServiceProviders serviceCountry(String serviceCountry) {
    this.serviceCountry = serviceCountry;
    return this;
  }

 /**
   * &lt;ServiceInformationExtensions&gt; ... &lt;/ServiceInformationExtensions&gt;
   * @return serviceExtensions
  **/
  @JsonProperty("ServiceExtensions")
  @NotNull
  public List<OBQualifiedTrustServiceProvidersServiceExtensions> getServiceExtensions() {
    return serviceExtensions;
  }

  public void setServiceExtensions(List<OBQualifiedTrustServiceProvidersServiceExtensions> serviceExtensions) {
    this.serviceExtensions = serviceExtensions;
  }

  public OBQualifiedTrustServiceProviders serviceExtensions(List<OBQualifiedTrustServiceProvidersServiceExtensions> serviceExtensions) {
    this.serviceExtensions = serviceExtensions;
    return this;
  }

  public OBQualifiedTrustServiceProviders addServiceExtensionsItem(OBQualifiedTrustServiceProvidersServiceExtensions serviceExtensionsItem) {
    this.serviceExtensions.add(serviceExtensionsItem);
    return this;
  }

 /**
   * &lt;Name xml:lang&#x3D;&#39;en&#39;&gt;TeleSec ServerPass&lt;/Name&gt;
   * @return serviceLanguage
  **/
  @JsonProperty("ServiceLanguage")
  @NotNull
  public String getServiceLanguage() {
    return serviceLanguage;
  }

  public void setServiceLanguage(String serviceLanguage) {
    this.serviceLanguage = serviceLanguage;
  }

  public OBQualifiedTrustServiceProviders serviceLanguage(String serviceLanguage) {
    this.serviceLanguage = serviceLanguage;
    return this;
  }

 /**
   * &lt;Name xml:lang&#x3D;&#39;en&#39;&gt;TeleSec ServerPass&lt;/Name&gt;
   * @return serviceName
  **/
  @JsonProperty("ServiceName")
  @NotNull
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public OBQualifiedTrustServiceProviders serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * &lt;ServiceStatus&gt; http://uri.etsi.org/TrstSvc/TrustedList/Svcstatus/granted&lt;/ServiceStatus&gt;
   * @return serviceStatus
  **/
  @JsonProperty("ServiceStatus")
  @NotNull
  public String getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(String serviceStatus) {
    this.serviceStatus = serviceStatus;
  }

  public OBQualifiedTrustServiceProviders serviceStatus(String serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

 /**
   * Get serviceType
   * @return serviceType
  **/
  @JsonProperty("ServiceType")
  @NotNull
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public OBQualifiedTrustServiceProviders serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

 /**
   * &lt;StatusStartingTime&gt;2017-11-20T09:00:00Z&lt;/StatusStartingTime&gt;
   * @return statusStartingTime
  **/
  @JsonProperty("StatusStartingTime")
  @NotNull
  public String getStatusStartingTime() {
    return statusStartingTime;
  }

  public void setStatusStartingTime(String statusStartingTime) {
    this.statusStartingTime = statusStartingTime;
  }

  public OBQualifiedTrustServiceProviders statusStartingTime(String statusStartingTime) {
    this.statusStartingTime = statusStartingTime;
    return this;
  }

 /**
   * &lt;X509Certificate&gt; MIIF1DCCBLygAwIBAgIIF00 .... &lt;/X509Certificate&gt;
   * @return x509Certificate
  **/
  @JsonProperty("X509Certificate")
  @NotNull
  public String getX509Certificate() {
    return x509Certificate;
  }

  public void setX509Certificate(String x509Certificate) {
    this.x509Certificate = x509Certificate;
  }

  public OBQualifiedTrustServiceProviders x509Certificate(String x509Certificate) {
    this.x509Certificate = x509Certificate;
    return this;
  }

 /**
   * &lt;X509SKI&gt;MCzVT9II0T3jp4KSgjeJbWa5D68&#x3D;&lt;/X509SKI&gt;
   * @return x509SKI
  **/
  @JsonProperty("X509SKI")
  @NotNull
  public String getX509SKI() {
    return x509SKI;
  }

  public void setX509SKI(String x509SKI) {
    this.x509SKI = x509SKI;
  }

  public OBQualifiedTrustServiceProviders x509SKI(String x509SKI) {
    this.x509SKI = x509SKI;
    return this;
  }

 /**
   * &lt;X509SubjectName&gt; CN&#x3D;TeleSec ServerPass Ex ... &lt;/X509SubjectName&gt; &lt;X509SKI&gt;MCzVT9II0T3jp4KSgjeJbWa5D68&#x3D;&lt;/X509SKI&gt;
   * @return x509SubjectName
  **/
  @JsonProperty("X509SubjectName")
  @NotNull
  public String getX509SubjectName() {
    return x509SubjectName;
  }

  public void setX509SubjectName(String x509SubjectName) {
    this.x509SubjectName = x509SubjectName;
  }

  public OBQualifiedTrustServiceProviders x509SubjectName(String x509SubjectName) {
    this.x509SubjectName = x509SubjectName;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OBQualifiedTrustServiceProviders externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public OBQualifiedTrustServiceProviders meta(Meta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get schemas
   * @return schemas
  **/
  @JsonProperty("schemas")
  @NotNull
  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  public OBQualifiedTrustServiceProviders schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OBQualifiedTrustServiceProviders addSchemasItem(String schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBQualifiedTrustServiceProviders {\n");
    
    sb.append("    certificateFingerprint: ").append(toIndentedString(certificateFingerprint)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    modifyTimestamp: ").append(toIndentedString(modifyTimestamp)).append("\n");
    sb.append("    serviceCountry: ").append(toIndentedString(serviceCountry)).append("\n");
    sb.append("    serviceExtensions: ").append(toIndentedString(serviceExtensions)).append("\n");
    sb.append("    serviceLanguage: ").append(toIndentedString(serviceLanguage)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    statusStartingTime: ").append(toIndentedString(statusStartingTime)).append("\n");
    sb.append("    x509Certificate: ").append(toIndentedString(x509Certificate)).append("\n");
    sb.append("    x509SKI: ").append(toIndentedString(x509SKI)).append("\n");
    sb.append("    x509SubjectName: ").append(toIndentedString(x509SubjectName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

