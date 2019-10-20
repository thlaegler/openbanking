package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBRegistrationProperties1;
import com.laegler.openbanking.model.SupportedAlgorithms;
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

public class OBClientRegistration1  {
  

@XmlType(name="ApplicationTypeEnum")
@XmlEnum(String.class)
public enum ApplicationTypeEnum {

@XmlEnumValue("web") WEB(String.valueOf("web")), @XmlEnumValue("mobile") MOBILE(String.valueOf("mobile"));


    private String value;

    ApplicationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ApplicationTypeEnum fromValue(String v) {
        for (ApplicationTypeEnum b : ApplicationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private ApplicationTypeEnum applicationType = null;

  @ApiModelProperty(value = "OAuth 2.0 client identifier string")
 /**
   * OAuth 2.0 client identifier string
  **/
  private String clientId = null;

  @ApiModelProperty(value = "Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")
 /**
   * Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
  **/
  private Integer clientIdIssuedAt = null;

  @ApiModelProperty(value = "OAuth 2.0 client secret string")
 /**
   * OAuth 2.0 client secret string
  **/
  private String clientSecret = null;

  @ApiModelProperty(value = "Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire")
 /**
   * Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire
  **/
  private Integer clientSecretExpiresAt = null;


@XmlType(name="GrantTypesEnum")
@XmlEnum(String.class)
public enum GrantTypesEnum {

@XmlEnumValue("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials")), @XmlEnumValue("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")), @XmlEnumValue("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token"));


    private String value;

    GrantTypesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GrantTypesEnum fromValue(String v) {
        for (GrantTypesEnum b : GrantTypesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private List<GrantTypesEnum> grantTypes = new ArrayList<GrantTypesEnum>();

  @ApiModelProperty(required = true, value = "")
  private SupportedAlgorithms idTokenSignedResponseAlg = null;

  @ApiModelProperty(required = true, value = "")
  private List<String> redirectUris = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private SupportedAlgorithms requestObjectSigningAlg = null;


@XmlType(name="ResponseTypesEnum")
@XmlEnum(String.class)
public enum ResponseTypesEnum {

@XmlEnumValue("code") CODE(String.valueOf("code")), @XmlEnumValue("codeIdToken") CODEIDTOKEN(String.valueOf("codeIdToken"));


    private String value;

    ResponseTypesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResponseTypesEnum fromValue(String v) {
        for (ResponseTypesEnum b : ResponseTypesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private List<ResponseTypesEnum> responseTypes = null;

  @ApiModelProperty(required = true, value = "")
  private String scope = null;

  @ApiModelProperty(value = "")
  private String softwareId = null;

  @ApiModelProperty(required = true, value = "")
  private String softwareStatement = null;

  @ApiModelProperty(value = "")
  private String tlsClientAuthSubjectDn = null;


@XmlType(name="TokenEndpointAuthMethodEnum")
@XmlEnum(String.class)
public enum TokenEndpointAuthMethodEnum {

@XmlEnumValue("private_key_jwt") PRIVATE_KEY_JWT(String.valueOf("private_key_jwt")), @XmlEnumValue("client_secret_jwt") CLIENT_SECRET_JWT(String.valueOf("client_secret_jwt")), @XmlEnumValue("client_secret_basic") CLIENT_SECRET_BASIC(String.valueOf("client_secret_basic")), @XmlEnumValue("client_secret_post") CLIENT_SECRET_POST(String.valueOf("client_secret_post")), @XmlEnumValue("tls_client_auth") TLS_CLIENT_AUTH(String.valueOf("tls_client_auth"));


    private String value;

    TokenEndpointAuthMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TokenEndpointAuthMethodEnum fromValue(String v) {
        for (TokenEndpointAuthMethodEnum b : TokenEndpointAuthMethodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private TokenEndpointAuthMethodEnum tokenEndpointAuthMethod = null;

  @ApiModelProperty(value = "")
  private SupportedAlgorithms tokenEndpointAuthSigningAlg = null;

  @ApiModelProperty(required = true, value = "The audience for the request. This should be the unique identifier for the ASPSP issued by the issuer of the software statement. Implemented as Base62 encoded GUID ")
 /**
   * The audience for the request. This should be the unique identifier for the ASPSP issued by the issuer of the software statement. Implemented as Base62 encoded GUID 
  **/
  private String aud = null;

  @ApiModelProperty(required = true, value = "The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")
 /**
   * The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
  **/
  private Integer exp = null;

  @ApiModelProperty(required = true, value = "The time at which the request was issued by the TPP  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")
 /**
   * The time at which the request was issued by the TPP  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
  **/
  private Integer iat = null;

  @ApiModelProperty(required = true, value = "Unique identifier for the TPP. Implemented as Base62 encoded GUID")
 /**
   * Unique identifier for the TPP. Implemented as Base62 encoded GUID
  **/
  private String iss = null;

  @ApiModelProperty(required = true, value = "Unique identifier for the JWT implemented as UUID v4")
 /**
   * Unique identifier for the JWT implemented as UUID v4
  **/
  private String jti = null;
 /**
   * Get applicationType
   * @return applicationType
  **/
  @JsonProperty("application_type")
  public String getApplicationType() {
    if (applicationType == null) {
      return null;
    }
    return applicationType.value();
  }

  public void setApplicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
  }

  public OBClientRegistration1 applicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
    return this;
  }

 /**
   * OAuth 2.0 client identifier string
   * @return clientId
  **/
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OBClientRegistration1 clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * minimum: 0
   * @return clientIdIssuedAt
  **/
  @JsonProperty("client_id_issued_at")
  public Integer getClientIdIssuedAt() {
    return clientIdIssuedAt;
  }

  public void setClientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
  }

  public OBClientRegistration1 clientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
    return this;
  }

 /**
   * OAuth 2.0 client secret string
   * @return clientSecret
  **/
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OBClientRegistration1 clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

 /**
   * Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire
   * minimum: 0
   * @return clientSecretExpiresAt
  **/
  @JsonProperty("client_secret_expires_at")
  public Integer getClientSecretExpiresAt() {
    return clientSecretExpiresAt;
  }

  public void setClientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
  }

  public OBClientRegistration1 clientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
    return this;
  }

 /**
   * Get grantTypes
   * @return grantTypes
  **/
  @JsonProperty("grant_types")
  public List<GrantTypesEnum> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OBClientRegistration1 grantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public OBClientRegistration1 addGrantTypesItem(GrantTypesEnum grantTypesItem) {
    this.grantTypes.add(grantTypesItem);
    return this;
  }

 /**
   * Get idTokenSignedResponseAlg
   * @return idTokenSignedResponseAlg
  **/
  @JsonProperty("id_token_signed_response_alg")
  public SupportedAlgorithms getIdTokenSignedResponseAlg() {
    return idTokenSignedResponseAlg;
  }

  public void setIdTokenSignedResponseAlg(SupportedAlgorithms idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
  }

  public OBClientRegistration1 idTokenSignedResponseAlg(SupportedAlgorithms idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
    return this;
  }

 /**
   * Get redirectUris
   * @return redirectUris
  **/
  @JsonProperty("redirect_uris")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OBClientRegistration1 redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public OBClientRegistration1 addRedirectUrisItem(String redirectUrisItem) {
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

 /**
   * Get requestObjectSigningAlg
   * @return requestObjectSigningAlg
  **/
  @JsonProperty("request_object_signing_alg")
  public SupportedAlgorithms getRequestObjectSigningAlg() {
    return requestObjectSigningAlg;
  }

  public void setRequestObjectSigningAlg(SupportedAlgorithms requestObjectSigningAlg) {
    this.requestObjectSigningAlg = requestObjectSigningAlg;
  }

  public OBClientRegistration1 requestObjectSigningAlg(SupportedAlgorithms requestObjectSigningAlg) {
    this.requestObjectSigningAlg = requestObjectSigningAlg;
    return this;
  }

 /**
   * Get responseTypes
   * @return responseTypes
  **/
  @JsonProperty("response_types")
  public List<ResponseTypesEnum> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<ResponseTypesEnum> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public OBClientRegistration1 responseTypes(List<ResponseTypesEnum> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public OBClientRegistration1 addResponseTypesItem(ResponseTypesEnum responseTypesItem) {
    this.responseTypes.add(responseTypesItem);
    return this;
  }

 /**
   * Get scope
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OBClientRegistration1 scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * Get softwareId
   * @return softwareId
  **/
  @JsonProperty("software_id")
  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public OBClientRegistration1 softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

 /**
   * Get softwareStatement
   * @return softwareStatement
  **/
  @JsonProperty("software_statement")
  public String getSoftwareStatement() {
    return softwareStatement;
  }

  public void setSoftwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
  }

  public OBClientRegistration1 softwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
    return this;
  }

 /**
   * Get tlsClientAuthSubjectDn
   * @return tlsClientAuthSubjectDn
  **/
  @JsonProperty("tls_client_auth_subject_dn")
  public String getTlsClientAuthSubjectDn() {
    return tlsClientAuthSubjectDn;
  }

  public void setTlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
  }

  public OBClientRegistration1 tlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
    return this;
  }

 /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
  **/
  @JsonProperty("token_endpoint_auth_method")
  public String getTokenEndpointAuthMethod() {
    if (tokenEndpointAuthMethod == null) {
      return null;
    }
    return tokenEndpointAuthMethod.value();
  }

  public void setTokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public OBClientRegistration1 tokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

 /**
   * Get tokenEndpointAuthSigningAlg
   * @return tokenEndpointAuthSigningAlg
  **/
  @JsonProperty("token_endpoint_auth_signing_alg")
  public SupportedAlgorithms getTokenEndpointAuthSigningAlg() {
    return tokenEndpointAuthSigningAlg;
  }

  public void setTokenEndpointAuthSigningAlg(SupportedAlgorithms tokenEndpointAuthSigningAlg) {
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
  }

  public OBClientRegistration1 tokenEndpointAuthSigningAlg(SupportedAlgorithms tokenEndpointAuthSigningAlg) {
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
    return this;
  }

 /**
   * The audience for the request. This should be the unique identifier for the ASPSP issued by the issuer of the software statement. Implemented as Base62 encoded GUID 
   * @return aud
  **/
  @JsonProperty("aud")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBClientRegistration1 aud(String aud) {
    this.aud = aud;
    return this;
  }

 /**
   * The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * @return exp
  **/
  @JsonProperty("exp")
  public Integer getExp() {
    return exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public OBClientRegistration1 exp(Integer exp) {
    this.exp = exp;
    return this;
  }

 /**
   * The time at which the request was issued by the TPP  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * @return iat
  **/
  @JsonProperty("iat")
  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public OBClientRegistration1 iat(Integer iat) {
    this.iat = iat;
    return this;
  }

 /**
   * Unique identifier for the TPP. Implemented as Base62 encoded GUID
   * @return iss
  **/
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBClientRegistration1 iss(String iss) {
    this.iss = iss;
    return this;
  }

 /**
   * Unique identifier for the JWT implemented as UUID v4
   * @return jti
  **/
  @JsonProperty("jti")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public OBClientRegistration1 jti(String jti) {
    this.jti = jti;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBClientRegistration1 {\n");
    
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientIdIssuedAt: ").append(toIndentedString(clientIdIssuedAt)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientSecretExpiresAt: ").append(toIndentedString(clientSecretExpiresAt)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    idTokenSignedResponseAlg: ").append(toIndentedString(idTokenSignedResponseAlg)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    requestObjectSigningAlg: ").append(toIndentedString(requestObjectSigningAlg)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    softwareId: ").append(toIndentedString(softwareId)).append("\n");
    sb.append("    softwareStatement: ").append(toIndentedString(softwareStatement)).append("\n");
    sb.append("    tlsClientAuthSubjectDn: ").append(toIndentedString(tlsClientAuthSubjectDn)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    tokenEndpointAuthSigningAlg: ").append(toIndentedString(tokenEndpointAuthSigningAlg)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
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

