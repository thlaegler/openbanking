package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OBRegistrationProperties1;
import com.laegler.openbanking.model.SupportedAlgorithms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBClientRegistration1
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBClientRegistration1   {
  /**
   * Gets or Sets applicationType
   */
  public enum ApplicationTypeEnum {
    WEB("web"),
    
    MOBILE("mobile");

    private String value;

    ApplicationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplicationTypeEnum fromValue(String text) {
      for (ApplicationTypeEnum b : ApplicationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("application_type")
  private ApplicationTypeEnum applicationType = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_id_issued_at")
  private Integer clientIdIssuedAt = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("client_secret_expires_at")
  private Integer clientSecretExpiresAt = null;

  /**
   * Gets or Sets grantTypes
   */
  public enum GrantTypesEnum {
    CLIENT_CREDENTIALS("client_credentials"),
    
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypesEnum fromValue(String text) {
      for (GrantTypesEnum b : GrantTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grant_types")
  @Valid
  private List<GrantTypesEnum> grantTypes = new ArrayList<>();

  @JsonProperty("id_token_signed_response_alg")
  private SupportedAlgorithms idTokenSignedResponseAlg = null;

  @JsonProperty("redirect_uris")
  @Valid
  private List<String> redirectUris = new ArrayList<>();

  @JsonProperty("request_object_signing_alg")
  private SupportedAlgorithms requestObjectSigningAlg = null;

  /**
   * Gets or Sets responseTypes
   */
  public enum ResponseTypesEnum {
    CODE("code"),
    
    CODEIDTOKEN("codeIdToken");

    private String value;

    ResponseTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseTypesEnum fromValue(String text) {
      for (ResponseTypesEnum b : ResponseTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("response_types")
  @Valid
  private List<ResponseTypesEnum> responseTypes = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("software_id")
  private String softwareId = null;

  @JsonProperty("software_statement")
  private String softwareStatement = null;

  @JsonProperty("tls_client_auth_subject_dn")
  private String tlsClientAuthSubjectDn = null;

  /**
   * Gets or Sets tokenEndpointAuthMethod
   */
  public enum TokenEndpointAuthMethodEnum {
    PRIVATE_KEY_JWT("private_key_jwt"),
    
    CLIENT_SECRET_JWT("client_secret_jwt"),
    
    CLIENT_SECRET_BASIC("client_secret_basic"),
    
    CLIENT_SECRET_POST("client_secret_post"),
    
    TLS_CLIENT_AUTH("tls_client_auth");

    private String value;

    TokenEndpointAuthMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TokenEndpointAuthMethodEnum fromValue(String text) {
      for (TokenEndpointAuthMethodEnum b : TokenEndpointAuthMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("token_endpoint_auth_method")
  private TokenEndpointAuthMethodEnum tokenEndpointAuthMethod = null;

  @JsonProperty("token_endpoint_auth_signing_alg")
  private SupportedAlgorithms tokenEndpointAuthSigningAlg = null;

  @JsonProperty("aud")
  private String aud = null;

  @JsonProperty("exp")
  private Integer exp = null;

  @JsonProperty("iat")
  private Integer iat = null;

  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("jti")
  private String jti = null;

  public OBClientRegistration1 applicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ApplicationTypeEnum getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
  }

  public OBClientRegistration1 clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth 2.0 client identifier string
   * @return clientId
  **/
  @ApiModelProperty(value = "OAuth 2.0 client identifier string")

@Size(min=1,max=36) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OBClientRegistration1 clientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
    return this;
  }

  /**
   * Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * minimum: 0
   * @return clientIdIssuedAt
  **/
  @ApiModelProperty(value = "Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")

@Min(0)
  public Integer getClientIdIssuedAt() {
    return clientIdIssuedAt;
  }

  public void setClientIdIssuedAt(Integer clientIdIssuedAt) {
    this.clientIdIssuedAt = clientIdIssuedAt;
  }

  public OBClientRegistration1 clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth 2.0 client secret string
   * @return clientSecret
  **/
  @ApiModelProperty(value = "OAuth 2.0 client secret string")

@Size(min=1,max=36) 
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OBClientRegistration1 clientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
    return this;
  }

  /**
   * Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire
   * minimum: 0
   * @return clientSecretExpiresAt
  **/
  @ApiModelProperty(value = "Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire")

@Min(0)
  public Integer getClientSecretExpiresAt() {
    return clientSecretExpiresAt;
  }

  public void setClientSecretExpiresAt(Integer clientSecretExpiresAt) {
    this.clientSecretExpiresAt = clientSecretExpiresAt;
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
   * Get grantTypes
   * @return grantTypes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1) 
  public List<GrantTypesEnum> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<GrantTypesEnum> grantTypes) {
    this.grantTypes = grantTypes;
  }

  public OBClientRegistration1 idTokenSignedResponseAlg(SupportedAlgorithms idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
    return this;
  }

  /**
   * Get idTokenSignedResponseAlg
   * @return idTokenSignedResponseAlg
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SupportedAlgorithms getIdTokenSignedResponseAlg() {
    return idTokenSignedResponseAlg;
  }

  public void setIdTokenSignedResponseAlg(SupportedAlgorithms idTokenSignedResponseAlg) {
    this.idTokenSignedResponseAlg = idTokenSignedResponseAlg;
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
   * Get redirectUris
   * @return redirectUris
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public OBClientRegistration1 requestObjectSigningAlg(SupportedAlgorithms requestObjectSigningAlg) {
    this.requestObjectSigningAlg = requestObjectSigningAlg;
    return this;
  }

  /**
   * Get requestObjectSigningAlg
   * @return requestObjectSigningAlg
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SupportedAlgorithms getRequestObjectSigningAlg() {
    return requestObjectSigningAlg;
  }

  public void setRequestObjectSigningAlg(SupportedAlgorithms requestObjectSigningAlg) {
    this.requestObjectSigningAlg = requestObjectSigningAlg;
  }

  public OBClientRegistration1 responseTypes(List<ResponseTypesEnum> responseTypes) {
    this.responseTypes = responseTypes;
    return this;
  }

  public OBClientRegistration1 addResponseTypesItem(ResponseTypesEnum responseTypesItem) {
    if (this.responseTypes == null) {
      this.responseTypes = new ArrayList<>();
    }
    this.responseTypes.add(responseTypesItem);
    return this;
  }

  /**
   * Get responseTypes
   * @return responseTypes
  **/
  @ApiModelProperty(value = "")


  public List<ResponseTypesEnum> getResponseTypes() {
    return responseTypes;
  }

  public void setResponseTypes(List<ResponseTypesEnum> responseTypes) {
    this.responseTypes = responseTypes;
  }

  public OBClientRegistration1 scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=256) 
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OBClientRegistration1 softwareId(String softwareId) {
    this.softwareId = softwareId;
    return this;
  }

  /**
   * Get softwareId
   * @return softwareId
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[0-9a-zA-Z]{1,22}$") @Size(min=1,max=22) 
  public String getSoftwareId() {
    return softwareId;
  }

  public void setSoftwareId(String softwareId) {
    this.softwareId = softwareId;
  }

  public OBClientRegistration1 softwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
    return this;
  }

  /**
   * Get softwareStatement
   * @return softwareStatement
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSoftwareStatement() {
    return softwareStatement;
  }

  public void setSoftwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
  }

  public OBClientRegistration1 tlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
    return this;
  }

  /**
   * Get tlsClientAuthSubjectDn
   * @return tlsClientAuthSubjectDn
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=128) 
  public String getTlsClientAuthSubjectDn() {
    return tlsClientAuthSubjectDn;
  }

  public void setTlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
  }

  public OBClientRegistration1 tokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TokenEndpointAuthMethodEnum getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

  public void setTokenEndpointAuthMethod(TokenEndpointAuthMethodEnum tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public OBClientRegistration1 tokenEndpointAuthSigningAlg(SupportedAlgorithms tokenEndpointAuthSigningAlg) {
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
    return this;
  }

  /**
   * Get tokenEndpointAuthSigningAlg
   * @return tokenEndpointAuthSigningAlg
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SupportedAlgorithms getTokenEndpointAuthSigningAlg() {
    return tokenEndpointAuthSigningAlg;
  }

  public void setTokenEndpointAuthSigningAlg(SupportedAlgorithms tokenEndpointAuthSigningAlg) {
    this.tokenEndpointAuthSigningAlg = tokenEndpointAuthSigningAlg;
  }

  public OBClientRegistration1 aud(String aud) {
    this.aud = aud;
    return this;
  }

  /**
   * The audience for the request. This should be the unique identifier for the ASPSP issued by the issuer of the software statement. Implemented as Base62 encoded GUID 
   * @return aud
  **/
  @ApiModelProperty(required = true, value = "The audience for the request. This should be the unique identifier for the ASPSP issued by the issuer of the software statement. Implemented as Base62 encoded GUID ")
  @NotNull

@Pattern(regexp="^[0-9a-zA-Z]{1,18}$") @Size(min=1,max=18) 
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBClientRegistration1 exp(Integer exp) {
    this.exp = exp;
    return this;
  }

  /**
   * The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * @return exp
  **/
  @ApiModelProperty(required = true, value = "The time at which the request expires expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")
  @NotNull


  public Integer getExp() {
    return exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public OBClientRegistration1 iat(Integer iat) {
    this.iat = iat;
    return this;
  }

  /**
   * The time at which the request was issued by the TPP  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC
   * @return iat
  **/
  @ApiModelProperty(required = true, value = "The time at which the request was issued by the TPP  expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC")
  @NotNull


  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public OBClientRegistration1 iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Unique identifier for the TPP. Implemented as Base62 encoded GUID
   * @return iss
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the TPP. Implemented as Base62 encoded GUID")
  @NotNull

@Pattern(regexp="^[0-9a-zA-Z]{1,22}$") @Size(min=1,max=22) 
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBClientRegistration1 jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * Unique identifier for the JWT implemented as UUID v4
   * @return jti
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the JWT implemented as UUID v4")
  @NotNull

@Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-4[0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$") @Size(min=36,max=36) 
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBClientRegistration1 obClientRegistration1 = (OBClientRegistration1) o;
    return Objects.equals(this.applicationType, obClientRegistration1.applicationType) &&
        Objects.equals(this.clientId, obClientRegistration1.clientId) &&
        Objects.equals(this.clientIdIssuedAt, obClientRegistration1.clientIdIssuedAt) &&
        Objects.equals(this.clientSecret, obClientRegistration1.clientSecret) &&
        Objects.equals(this.clientSecretExpiresAt, obClientRegistration1.clientSecretExpiresAt) &&
        Objects.equals(this.grantTypes, obClientRegistration1.grantTypes) &&
        Objects.equals(this.idTokenSignedResponseAlg, obClientRegistration1.idTokenSignedResponseAlg) &&
        Objects.equals(this.redirectUris, obClientRegistration1.redirectUris) &&
        Objects.equals(this.requestObjectSigningAlg, obClientRegistration1.requestObjectSigningAlg) &&
        Objects.equals(this.responseTypes, obClientRegistration1.responseTypes) &&
        Objects.equals(this.scope, obClientRegistration1.scope) &&
        Objects.equals(this.softwareId, obClientRegistration1.softwareId) &&
        Objects.equals(this.softwareStatement, obClientRegistration1.softwareStatement) &&
        Objects.equals(this.tlsClientAuthSubjectDn, obClientRegistration1.tlsClientAuthSubjectDn) &&
        Objects.equals(this.tokenEndpointAuthMethod, obClientRegistration1.tokenEndpointAuthMethod) &&
        Objects.equals(this.tokenEndpointAuthSigningAlg, obClientRegistration1.tokenEndpointAuthSigningAlg) &&
        Objects.equals(this.aud, obClientRegistration1.aud) &&
        Objects.equals(this.exp, obClientRegistration1.exp) &&
        Objects.equals(this.iat, obClientRegistration1.iat) &&
        Objects.equals(this.iss, obClientRegistration1.iss) &&
        Objects.equals(this.jti, obClientRegistration1.jti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationType, clientId, clientIdIssuedAt, clientSecret, clientSecretExpiresAt, grantTypes, idTokenSignedResponseAlg, redirectUris, requestObjectSigningAlg, responseTypes, scope, softwareId, softwareStatement, tlsClientAuthSubjectDn, tokenEndpointAuthMethod, tokenEndpointAuthSigningAlg, aud, exp, iat, iss, jti);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

