
# OBRegistrationProperties1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationType** | [**ApplicationTypeEnum**](#ApplicationTypeEnum) |  | 
**clientId** | **String** | OAuth 2.0 client identifier string |  [optional]
**clientIdIssuedAt** | **Integer** | Time at which the client identifier was issued expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC |  [optional]
**clientSecret** | **String** | OAuth 2.0 client secret string |  [optional]
**clientSecretExpiresAt** | **Integer** | Time at which the client secret will expire expressed as seconds since 1970-01-01T00:00:00Z as measured in UTC. Set to 0 if does not expire |  [optional]
**grantTypes** | [**List&lt;GrantTypesEnum&gt;**](#List&lt;GrantTypesEnum&gt;) |  | 
**idTokenSignedResponseAlg** | [**SupportedAlgorithms**](SupportedAlgorithms.md) |  | 
**redirectUris** | **List&lt;String&gt;** |  | 
**requestObjectSigningAlg** | [**SupportedAlgorithms**](SupportedAlgorithms.md) |  | 
**responseTypes** | [**List&lt;ResponseTypesEnum&gt;**](#List&lt;ResponseTypesEnum&gt;) |  |  [optional]
**scope** | **String** |  | 
**softwareId** | **String** |  |  [optional]
**softwareStatement** | **String** |  | 
**tlsClientAuthSubjectDn** | **String** |  |  [optional]
**tokenEndpointAuthMethod** | [**TokenEndpointAuthMethodEnum**](#TokenEndpointAuthMethodEnum) |  | 
**tokenEndpointAuthSigningAlg** | [**SupportedAlgorithms**](SupportedAlgorithms.md) |  |  [optional]


<a name="ApplicationTypeEnum"></a>
## Enum: ApplicationTypeEnum
Name | Value
---- | -----
WEB | &quot;web&quot;
MOBILE | &quot;mobile&quot;


<a name="List<GrantTypesEnum>"></a>
## Enum: List&lt;GrantTypesEnum&gt;
Name | Value
---- | -----
CLIENT_CREDENTIALS | &quot;client_credentials&quot;
AUTHORIZATION_CODE | &quot;authorization_code&quot;
REFRESH_TOKEN | &quot;refresh_token&quot;


<a name="List<ResponseTypesEnum>"></a>
## Enum: List&lt;ResponseTypesEnum&gt;
Name | Value
---- | -----
CODE | &quot;code&quot;
CODEIDTOKEN | &quot;codeIdToken&quot;


<a name="TokenEndpointAuthMethodEnum"></a>
## Enum: TokenEndpointAuthMethodEnum
Name | Value
---- | -----
PRIVATE_KEY_JWT | &quot;private_key_jwt&quot;
CLIENT_SECRET_JWT | &quot;client_secret_jwt&quot;
CLIENT_SECRET_BASIC | &quot;client_secret_basic&quot;
CLIENT_SECRET_POST | &quot;client_secret_post&quot;
TLS_CLIENT_AUTH | &quot;tls_client_auth&quot;



