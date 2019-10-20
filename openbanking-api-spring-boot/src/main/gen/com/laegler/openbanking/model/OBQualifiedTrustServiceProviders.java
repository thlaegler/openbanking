package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.Meta;
import com.laegler.openbanking.model.OBQualifiedTrustServiceProvidersServiceExtensions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * eIDAS Qualified Trust Service Provider
 */
@ApiModel(description = "eIDAS Qualified Trust Service Provider")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBQualifiedTrustServiceProviders   {
  @JsonProperty("CertificateFingerprint")
  private String certificateFingerprint = null;

  @JsonProperty("CreateTimestamp")
  private String createTimestamp = null;

  @JsonProperty("ModifyTimestamp")
  private String modifyTimestamp = null;

  @JsonProperty("ServiceCountry")
  private String serviceCountry = null;

  @JsonProperty("ServiceExtensions")
  @Valid
  private List<OBQualifiedTrustServiceProvidersServiceExtensions> serviceExtensions = new ArrayList<>();

  @JsonProperty("ServiceLanguage")
  private String serviceLanguage = null;

  @JsonProperty("ServiceName")
  private String serviceName = null;

  @JsonProperty("ServiceStatus")
  private String serviceStatus = null;

  @JsonProperty("ServiceType")
  private String serviceType = null;

  @JsonProperty("StatusStartingTime")
  private String statusStartingTime = null;

  @JsonProperty("X509Certificate")
  private String x509Certificate = null;

  @JsonProperty("X509SKI")
  private String x509SKI = null;

  @JsonProperty("X509SubjectName")
  private String x509SubjectName = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("meta")
  private Meta meta = null;

  @JsonProperty("schemas")
  @Valid
  private List<String> schemas = new ArrayList<>();

  public OBQualifiedTrustServiceProviders certificateFingerprint(String certificateFingerprint) {
    this.certificateFingerprint = certificateFingerprint;
    return this;
  }

  /**
   * SHA-256 Certificate Fingerprint
   * @return certificateFingerprint
  **/
  @ApiModelProperty(required = true, value = "SHA-256 Certificate Fingerprint")
  @NotNull


  public String getCertificateFingerprint() {
    return certificateFingerprint;
  }

  public void setCertificateFingerprint(String certificateFingerprint) {
    this.certificateFingerprint = certificateFingerprint;
  }

  public OBQualifiedTrustServiceProviders createTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  /**
   * OB Creation Timestamp
   * @return createTimestamp
  **/
  @ApiModelProperty(readOnly = true, value = "OB Creation Timestamp")


  public String getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public OBQualifiedTrustServiceProviders modifyTimestamp(String modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
    return this;
  }

  /**
   * OB Modification Timestamp
   * @return modifyTimestamp
  **/
  @ApiModelProperty(readOnly = true, value = "OB Modification Timestamp")


  public String getModifyTimestamp() {
    return modifyTimestamp;
  }

  public void setModifyTimestamp(String modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
  }

  public OBQualifiedTrustServiceProviders serviceCountry(String serviceCountry) {
    this.serviceCountry = serviceCountry;
    return this;
  }

  /**
   * '<SchemeOperatorAddress> <PostalAddresses> <PostalAddress xml:lang=''en''> <StreetAddress>NG III - Koning Albert II-laan 16</StreetAddress> <Locality>Brussels</Locality> <StateOrProvince>Brussels</StateOrProvince> <PostalCode>1000</PostalCode> <CountryName>BE</CountryName>'
   * @return serviceCountry
  **/
  @ApiModelProperty(required = true, value = "'<SchemeOperatorAddress> <PostalAddresses> <PostalAddress xml:lang=''en''> <StreetAddress>NG III - Koning Albert II-laan 16</StreetAddress> <Locality>Brussels</Locality> <StateOrProvince>Brussels</StateOrProvince> <PostalCode>1000</PostalCode> <CountryName>BE</CountryName>'")
  @NotNull


  public String getServiceCountry() {
    return serviceCountry;
  }

  public void setServiceCountry(String serviceCountry) {
    this.serviceCountry = serviceCountry;
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
   * <ServiceInformationExtensions> ... </ServiceInformationExtensions>
   * @return serviceExtensions
  **/
  @ApiModelProperty(required = true, value = "<ServiceInformationExtensions> ... </ServiceInformationExtensions>")
  @NotNull

  @Valid

  public List<OBQualifiedTrustServiceProvidersServiceExtensions> getServiceExtensions() {
    return serviceExtensions;
  }

  public void setServiceExtensions(List<OBQualifiedTrustServiceProvidersServiceExtensions> serviceExtensions) {
    this.serviceExtensions = serviceExtensions;
  }

  public OBQualifiedTrustServiceProviders serviceLanguage(String serviceLanguage) {
    this.serviceLanguage = serviceLanguage;
    return this;
  }

  /**
   * <Name xml:lang='en'>TeleSec ServerPass</Name>
   * @return serviceLanguage
  **/
  @ApiModelProperty(required = true, value = "<Name xml:lang='en'>TeleSec ServerPass</Name>")
  @NotNull


  public String getServiceLanguage() {
    return serviceLanguage;
  }

  public void setServiceLanguage(String serviceLanguage) {
    this.serviceLanguage = serviceLanguage;
  }

  public OBQualifiedTrustServiceProviders serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * <Name xml:lang='en'>TeleSec ServerPass</Name>
   * @return serviceName
  **/
  @ApiModelProperty(required = true, value = "<Name xml:lang='en'>TeleSec ServerPass</Name>")
  @NotNull


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public OBQualifiedTrustServiceProviders serviceStatus(String serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

  /**
   * <ServiceStatus> http://uri.etsi.org/TrstSvc/TrustedList/Svcstatus/granted</ServiceStatus>
   * @return serviceStatus
  **/
  @ApiModelProperty(required = true, value = "<ServiceStatus> http://uri.etsi.org/TrstSvc/TrustedList/Svcstatus/granted</ServiceStatus>")
  @NotNull


  public String getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(String serviceStatus) {
    this.serviceStatus = serviceStatus;
  }

  public OBQualifiedTrustServiceProviders serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public OBQualifiedTrustServiceProviders statusStartingTime(String statusStartingTime) {
    this.statusStartingTime = statusStartingTime;
    return this;
  }

  /**
   * <StatusStartingTime>2017-11-20T09:00:00Z</StatusStartingTime>
   * @return statusStartingTime
  **/
  @ApiModelProperty(required = true, value = "<StatusStartingTime>2017-11-20T09:00:00Z</StatusStartingTime>")
  @NotNull


  public String getStatusStartingTime() {
    return statusStartingTime;
  }

  public void setStatusStartingTime(String statusStartingTime) {
    this.statusStartingTime = statusStartingTime;
  }

  public OBQualifiedTrustServiceProviders x509Certificate(String x509Certificate) {
    this.x509Certificate = x509Certificate;
    return this;
  }

  /**
   * <X509Certificate> MIIF1DCCBLygAwIBAgIIF00 .... </X509Certificate>
   * @return x509Certificate
  **/
  @ApiModelProperty(required = true, value = "<X509Certificate> MIIF1DCCBLygAwIBAgIIF00 .... </X509Certificate>")
  @NotNull


  public String getX509Certificate() {
    return x509Certificate;
  }

  public void setX509Certificate(String x509Certificate) {
    this.x509Certificate = x509Certificate;
  }

  public OBQualifiedTrustServiceProviders x509SKI(String x509SKI) {
    this.x509SKI = x509SKI;
    return this;
  }

  /**
   * <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>
   * @return x509SKI
  **/
  @ApiModelProperty(required = true, value = "<X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>")
  @NotNull


  public String getX509SKI() {
    return x509SKI;
  }

  public void setX509SKI(String x509SKI) {
    this.x509SKI = x509SKI;
  }

  public OBQualifiedTrustServiceProviders x509SubjectName(String x509SubjectName) {
    this.x509SubjectName = x509SubjectName;
    return this;
  }

  /**
   * <X509SubjectName> CN=TeleSec ServerPass Ex ... </X509SubjectName> <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>
   * @return x509SubjectName
  **/
  @ApiModelProperty(required = true, value = "<X509SubjectName> CN=TeleSec ServerPass Ex ... </X509SubjectName> <X509SKI>MCzVT9II0T3jp4KSgjeJbWa5D68=</X509SKI>")
  @NotNull


  public String getX509SubjectName() {
    return x509SubjectName;
  }

  public void setX509SubjectName(String x509SubjectName) {
    this.x509SubjectName = x509SubjectName;
  }

  public OBQualifiedTrustServiceProviders externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OBQualifiedTrustServiceProviders id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBQualifiedTrustServiceProviders meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public OBQualifiedTrustServiceProviders schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public OBQualifiedTrustServiceProviders addSchemasItem(String schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Get schemas
   * @return schemas
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBQualifiedTrustServiceProviders obQualifiedTrustServiceProviders = (OBQualifiedTrustServiceProviders) o;
    return Objects.equals(this.certificateFingerprint, obQualifiedTrustServiceProviders.certificateFingerprint) &&
        Objects.equals(this.createTimestamp, obQualifiedTrustServiceProviders.createTimestamp) &&
        Objects.equals(this.modifyTimestamp, obQualifiedTrustServiceProviders.modifyTimestamp) &&
        Objects.equals(this.serviceCountry, obQualifiedTrustServiceProviders.serviceCountry) &&
        Objects.equals(this.serviceExtensions, obQualifiedTrustServiceProviders.serviceExtensions) &&
        Objects.equals(this.serviceLanguage, obQualifiedTrustServiceProviders.serviceLanguage) &&
        Objects.equals(this.serviceName, obQualifiedTrustServiceProviders.serviceName) &&
        Objects.equals(this.serviceStatus, obQualifiedTrustServiceProviders.serviceStatus) &&
        Objects.equals(this.serviceType, obQualifiedTrustServiceProviders.serviceType) &&
        Objects.equals(this.statusStartingTime, obQualifiedTrustServiceProviders.statusStartingTime) &&
        Objects.equals(this.x509Certificate, obQualifiedTrustServiceProviders.x509Certificate) &&
        Objects.equals(this.x509SKI, obQualifiedTrustServiceProviders.x509SKI) &&
        Objects.equals(this.x509SubjectName, obQualifiedTrustServiceProviders.x509SubjectName) &&
        Objects.equals(this.externalId, obQualifiedTrustServiceProviders.externalId) &&
        Objects.equals(this.id, obQualifiedTrustServiceProviders.id) &&
        Objects.equals(this.meta, obQualifiedTrustServiceProviders.meta) &&
        Objects.equals(this.schemas, obQualifiedTrustServiceProviders.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateFingerprint, createTimestamp, modifyTimestamp, serviceCountry, serviceExtensions, serviceLanguage, serviceName, serviceStatus, serviceType, statusStartingTime, x509Certificate, x509SKI, x509SubjectName, externalId, id, meta, schemas);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

