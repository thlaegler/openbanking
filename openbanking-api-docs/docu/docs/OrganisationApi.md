# OrganisationApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organisationOrganisationTypeGet**](OrganisationApi.md#organisationOrganisationTypeGet) | **GET** /organisation/{OrganisationType} | Get all organisations that the client is authorised to retrieve
[**organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete) | **DELETE** /organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId} | Delete an Authorisation Server
[**organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId} | Get .well-known entity
[**organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut) | **PUT** /organisation/{OrganisationType}/{OrganisationId}/authorisation-server/{AuthorisationServerId} | Update .well-known entity
[**organisationOrganisationTypeOrganisationIdAuthorisationServerGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdAuthorisationServerGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/authorisation-server | Get all Authorisation Servers for the given organisation
[**organisationOrganisationTypeOrganisationIdAuthorisationServerPost**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdAuthorisationServerPost) | **POST** /organisation/{OrganisationType}/{OrganisationId}/authorisation-server | Create an Authorisation Server for the given organisation
[**organisationOrganisationTypeOrganisationIdCertificateGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdCertificateGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/certificate | Get the certificates for the given organisation
[**organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete) | **DELETE** /organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId} | Revoke or remove a certificate with the given CertificateOrKeyId
[**organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/certificate/kid/{CertificateOrKeyId} | Retrieve a certificate with the given CertificateOrKeyId
[**organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType} | Get the certificates of the given OrganisationCertificateType for the given oranisation
[**organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost) | **POST** /organisation/{OrganisationType}/{OrganisationId}/certificate/{OrganisationCertificateType} | Store or create a new certificate of the given OrganisationCertificateType for the given organisation
[**organisationOrganisationTypeOrganisationIdContactContactTypeGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdContactContactTypeGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType} | Get the business or the technical contacts for the given organisation
[**organisationOrganisationTypeOrganisationIdContactContactTypePut**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdContactContactTypePut) | **PUT** /organisation/{OrganisationType}/{OrganisationId}/contact/{ContactType} | Update the business or the technical contacts for the given organisation
[**organisationOrganisationTypeOrganisationIdGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdGet) | **GET** /organisation/{OrganisationType}/{OrganisationId} | Get the given organisation&#39;s details
[**organisationOrganisationTypeOrganisationIdSoftwareStatementGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement | Get all software statements for the given organisation
[**organisationOrganisationTypeOrganisationIdSoftwareStatementPost**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementPost) | **POST** /organisation/{OrganisationType}/{OrganisationId}/software-statement | Create a software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate | Get certificates for the given software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId} | Get the certificate of the given type and ID for the given software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut) | **PUT** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{OrganisationAssociativeCertificateType}/{CertificateOrKeyId} | Associate/de-associate a QSEAL/OBSEAL certificate with the given software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType} | Get the certificates of the given type for the given software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost) | **POST** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/certificate/{SoftwareStatementCertificateOrKeyType} | Add a key or create a new certificate for the given software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId} | Get a software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut) | **PUT** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId} | Update a software statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost) | **POST** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/redirect-uri | Add a redirect URI to the given Software Statement
[**organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet**](OrganisationApi.md#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet) | **GET** /organisation/{OrganisationType}/{OrganisationId}/software-statement/{SoftwareStatementId}/software-statement-assertion | Get a Software Statement Assertion for the given SoftwareStatementID.
[**organisationOrganisationTypePost**](OrganisationApi.md#organisationOrganisationTypePost) | **POST** /organisation/{OrganisationType} | Enrol a eIDAS QWAC/QSealC-bearing participant


<a name="organisationOrganisationTypeGet"></a>
# **organisationOrganisationTypeGet**
> Void organisationOrganisationTypeGet(organisationType)

Get all organisations that the client is authorised to retrieve

Note that this was not in the original design but is included to inform the client

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
try {
    Void result = apiInstance.organisationOrganisationTypeGet(organisationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete"></a>
# **organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete**
> Void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete(organisationType, organisationId, authorisationServerId)

Delete an Authorisation Server

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String authorisationServerId = "authorisationServerId_example"; // String | The authorisation server Id
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete(organisationType, organisationId, authorisationServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **authorisationServerId** | **String**| The authorisation server Id |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet"></a>
# **organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet**
> Void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet(organisationType, organisationId, authorisationServerId)

Get .well-known entity

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String authorisationServerId = "authorisationServerId_example"; // String | The authorisation server Id
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet(organisationType, organisationId, authorisationServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **authorisationServerId** | **String**| The authorisation server Id |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut"></a>
# **organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut**
> Void organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut(organisationType, organisationId, authorisationServerId, authorisationServer)

Update .well-known entity

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String authorisationServerId = "authorisationServerId_example"; // String | The authorisation server Id
AuthorisationServerRequestSchema authorisationServer = new AuthorisationServerRequestSchema(); // AuthorisationServerRequestSchema | Properties to create/update authorisation server
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut(organisationType, organisationId, authorisationServerId, authorisationServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdAuthorisationServerAuthorisationServerIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **authorisationServerId** | **String**| The authorisation server Id |
 **authorisationServer** | [**AuthorisationServerRequestSchema**](AuthorisationServerRequestSchema.md)| Properties to create/update authorisation server |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdAuthorisationServerGet"></a>
# **organisationOrganisationTypeOrganisationIdAuthorisationServerGet**
> Void organisationOrganisationTypeOrganisationIdAuthorisationServerGet(organisationType, organisationId)

Get all Authorisation Servers for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdAuthorisationServerGet(organisationType, organisationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdAuthorisationServerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdAuthorisationServerPost"></a>
# **organisationOrganisationTypeOrganisationIdAuthorisationServerPost**
> Void organisationOrganisationTypeOrganisationIdAuthorisationServerPost(organisationType, organisationId, authorisationServer)

Create an Authorisation Server for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
AuthorisationServerRequestSchema authorisationServer = new AuthorisationServerRequestSchema(); // AuthorisationServerRequestSchema | Properties to create/update authorisation server
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdAuthorisationServerPost(organisationType, organisationId, authorisationServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdAuthorisationServerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **authorisationServer** | [**AuthorisationServerRequestSchema**](AuthorisationServerRequestSchema.md)| Properties to create/update authorisation server |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdCertificateGet"></a>
# **organisationOrganisationTypeOrganisationIdCertificateGet**
> Void organisationOrganisationTypeOrganisationIdCertificateGet(organisationType, organisationId)

Get the certificates for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdCertificateGet(organisationType, organisationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdCertificateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete"></a>
# **organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete**
> Void organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete(organisationType, organisationId, certificateOrKeyId)

Revoke or remove a certificate with the given CertificateOrKeyId

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String certificateOrKeyId = "certificateOrKeyId_example"; // String | The certificate or key Id
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete(organisationType, organisationId, certificateOrKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **certificateOrKeyId** | **String**| The certificate or key Id |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet"></a>
# **organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet**
> Void organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet(organisationType, organisationId, certificateOrKeyId)

Retrieve a certificate with the given CertificateOrKeyId

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String certificateOrKeyId = "certificateOrKeyId_example"; // String | The certificate or key Id
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet(organisationType, organisationId, certificateOrKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **certificateOrKeyId** | **String**| The certificate or key Id |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet"></a>
# **organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet**
> Void organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet(organisationType, organisationId, organisationCertificateType, softwareStatementId)

Get the certificates of the given OrganisationCertificateType for the given oranisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String organisationCertificateType = "organisationCertificateType_example"; // String | The certificate type
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet(organisationType, organisationId, organisationCertificateType, softwareStatementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **organisationCertificateType** | **String**| The certificate type | [enum: qwac, qseal, obwac, obseal]
 **softwareStatementId** | **String**| The software statement ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost"></a>
# **organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost**
> Void organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost(organisationType, organisationId, organisationCertificateType, softwareStatementId, certificateOrCSROrJWS)

Store or create a new certificate of the given OrganisationCertificateType for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String organisationCertificateType = "organisationCertificateType_example"; // String | The certificate type
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
CertificateOrKeyGetSchema certificateOrCSROrJWS = new CertificateOrKeyGetSchema(); // CertificateOrKeyGetSchema | * __PEM file__ -- when the request `Content-Type` header is set to  `application/x-pem-file` the contents of the PEM file will differ depending upon `OrganisationCertificateType`. If `OrganisationCertificateType` is set to `qwac`, `qseal` then the PEM file should contain a *QWAC* or a *QSEAL* certificate respectively; if `OrganisationCertificateType` is set to `obwac` or `obseal` then the PEM file should contain a Certificate Signing Request (CSR) for an OB-issued *OBWAC* or *OBSEAL* certificate respectively. * __Signed JWT__ -- when the request `Content-Type` header is set to `application/jwt` the body of the signed JWT will contain a CSR or a certificate.  ### Requesting a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `csr` claim is the CSR in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"csr\": \"string\" } ```  ### Uploaing a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `x5c` claim is the array of certificate, issuer certificate, and root certificate in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } ```  EXAMPLE REQUEST PAYLOAD USING SIGNED JWT REQUESTS  ``` POST /organisation/tpp/123456789012345678/certificate/obwac HTTP/1.1 Content-Type: application/jwt Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmcibSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` 
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost(organisationType, organisationId, organisationCertificateType, softwareStatementId, certificateOrCSROrJWS);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **organisationCertificateType** | **String**| The certificate type | [enum: qwac, qseal, obwac, obseal]
 **softwareStatementId** | **String**| The software statement ID |
 **certificateOrCSROrJWS** | [**CertificateOrKeyGetSchema**](CertificateOrKeyGetSchema.md)| * __PEM file__ -- when the request &#x60;Content-Type&#x60; header is set to  &#x60;application/x-pem-file&#x60; the contents of the PEM file will differ depending upon &#x60;OrganisationCertificateType&#x60;. If &#x60;OrganisationCertificateType&#x60; is set to &#x60;qwac&#x60;, &#x60;qseal&#x60; then the PEM file should contain a *QWAC* or a *QSEAL* certificate respectively; if &#x60;OrganisationCertificateType&#x60; is set to &#x60;obwac&#x60; or &#x60;obseal&#x60; then the PEM file should contain a Certificate Signing Request (CSR) for an OB-issued *OBWAC* or *OBSEAL* certificate respectively. * __Signed JWT__ -- when the request &#x60;Content-Type&#x60; header is set to &#x60;application/jwt&#x60; the body of the signed JWT will contain a CSR or a certificate.  ### Requesting a Certificate using a signed JWT  The header &#x60;kid&#x60; claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body &#x60;csr&#x60; claim is the CSR in the DER format.  &#x60;&#x60;&#x60; {   \&quot;typ\&quot;: \&quot;JWT\&quot;,   \&quot;alg\&quot;: \&quot;ES256\&quot;,   \&quot;kid\&quot;: \&quot;ABCD1234\&quot;, } {   \&quot;csr\&quot;: \&quot;string\&quot; } &#x60;&#x60;&#x60;  ### Uploaing a Certificate using a signed JWT  The header &#x60;kid&#x60; claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body &#x60;x5c&#x60; claim is the array of certificate, issuer certificate, and root certificate in the DER format.  &#x60;&#x60;&#x60; {   \&quot;typ\&quot;: \&quot;JWT\&quot;,   \&quot;alg\&quot;: \&quot;ES256\&quot;,   \&quot;kid\&quot;: \&quot;ABCD1234\&quot;, } {   \&quot;x5c\&quot;: [\&quot;qsealc\&quot;, \&quot;issuer certificate\&quot;, \&quot;root certificate\&quot;] } &#x60;&#x60;&#x60;  EXAMPLE REQUEST PAYLOAD USING SIGNED JWT REQUESTS  &#x60;&#x60;&#x60; POST /organisation/tpp/123456789012345678/certificate/obwac HTTP/1.1 Content-Type: application/jwt Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmcibSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA &#x60;&#x60;&#x60;  |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdContactContactTypeGet"></a>
# **organisationOrganisationTypeOrganisationIdContactContactTypeGet**
> Void organisationOrganisationTypeOrganisationIdContactContactTypeGet(organisationType, organisationId, contactType)

Get the business or the technical contacts for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String contactType = "contactType_example"; // String | The contact type
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdContactContactTypeGet(organisationType, organisationId, contactType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdContactContactTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **contactType** | **String**| The contact type | [enum: business, technical]

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdContactContactTypePut"></a>
# **organisationOrganisationTypeOrganisationIdContactContactTypePut**
> Void organisationOrganisationTypeOrganisationIdContactContactTypePut(organisationType, organisationId, contactType, contact)

Update the business or the technical contacts for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String contactType = "contactType_example"; // String | The contact type
ContactSchema contact = new ContactSchema(); // ContactSchema | Properties to update business/technical contacts
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdContactContactTypePut(organisationType, organisationId, contactType, contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdContactContactTypePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **contactType** | **String**| The contact type | [enum: business, technical]
 **contact** | [**ContactSchema**](ContactSchema.md)| Properties to update business/technical contacts |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdGet"></a>
# **organisationOrganisationTypeOrganisationIdGet**
> Void organisationOrganisationTypeOrganisationIdGet(organisationType, organisationId)

Get the given organisation&#39;s details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdGet(organisationType, organisationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementGet(organisationType, organisationId)

Get all software statements for the given organisation

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementGet(organisationType, organisationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementPost"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementPost**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementPost(organisationType, organisationId, softwareStatement)

Create a software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
SoftwareStatementCreateSchema softwareStatement = new SoftwareStatementCreateSchema(); // SoftwareStatementCreateSchema | Software Statement payload
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementPost(organisationType, organisationId, softwareStatement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatement** | [**SoftwareStatementCreateSchema**](SoftwareStatementCreateSchema.md)| Software Statement payload |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet(organisationType, organisationId, softwareStatementId)

Get certificates for the given software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet(organisationType, organisationId, softwareStatementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet(organisationType, organisationId, softwareStatementId, organisationAssociativeCertificateType, certificateOrKeyId)

Get the certificate of the given type and ID for the given software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
String organisationAssociativeCertificateType = "organisationAssociativeCertificateType_example"; // String | The certificate type that can be associated with a software statement
String certificateOrKeyId = "certificateOrKeyId_example"; // String | The certificate or key Id
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet(organisationType, organisationId, softwareStatementId, organisationAssociativeCertificateType, certificateOrKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **organisationAssociativeCertificateType** | **String**| The certificate type that can be associated with a software statement | [enum: qseal, obseal]
 **certificateOrKeyId** | **String**| The certificate or key Id |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut(organisationType, organisationId, softwareStatementId, organisationAssociativeCertificateType, certificateOrKeyId, certificateOrKeyAssociation)

Associate/de-associate a QSEAL/OBSEAL certificate with the given software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
String organisationAssociativeCertificateType = "organisationAssociativeCertificateType_example"; // String | The certificate type that can be associated with a software statement
String certificateOrKeyId = "certificateOrKeyId_example"; // String | The certificate or key Id
CertificateOrKeyAssociationSchema certificateOrKeyAssociation = new CertificateOrKeyAssociationSchema(); // CertificateOrKeyAssociationSchema | Certificate or Key Association Payload
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut(organisationType, organisationId, softwareStatementId, organisationAssociativeCertificateType, certificateOrKeyId, certificateOrKeyAssociation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **organisationAssociativeCertificateType** | **String**| The certificate type that can be associated with a software statement | [enum: qseal, obseal]
 **certificateOrKeyId** | **String**| The certificate or key Id |
 **certificateOrKeyAssociation** | [**CertificateOrKeyAssociationSchema**](CertificateOrKeyAssociationSchema.md)| Certificate or Key Association Payload |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType)

Get the certificates of the given type for the given software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
String softwareStatementCertificateOrKeyType = "softwareStatementCertificateOrKeyType_example"; // String | The certificate or key type that can be associated with a software statement
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **softwareStatementCertificateOrKeyType** | **String**| The certificate or key type that can be associated with a software statement | [enum: obtransport, obsigning, sigkey, enckey]

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType, csROrKey)

Add a key or create a new certificate for the given software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
String softwareStatementCertificateOrKeyType = "softwareStatementCertificateOrKeyType_example"; // String | The certificate or key type that can be associated with a software statement
CertificateOrKeyGetSchema csROrKey = new CertificateOrKeyGetSchema(); // CertificateOrKeyGetSchema | PEM file -- the contents of the PEM file will differ depending upon *SoftwareStatementCertificateOrKeyType*. If *SoftwareStatementCertificateOrKeyType* is set to *obsigning* or *obtransport* then the PEM file should contain a Certificate Signing Request (CSR) for an OB signing or OB transport certificate respectively; if *SoftwareStatementCertificateOrKeyType* is set to *sigkey*, *enckey* then the PEM file should contain a public signing or encryption key respectively.
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost(organisationType, organisationId, softwareStatementId, softwareStatementCertificateOrKeyType, csROrKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **softwareStatementCertificateOrKeyType** | **String**| The certificate or key type that can be associated with a software statement | [enum: obtransport, obsigning, sigkey, enckey]
 **csROrKey** | [**CertificateOrKeyGetSchema**](CertificateOrKeyGetSchema.md)| PEM file -- the contents of the PEM file will differ depending upon *SoftwareStatementCertificateOrKeyType*. If *SoftwareStatementCertificateOrKeyType* is set to *obsigning* or *obtransport* then the PEM file should contain a Certificate Signing Request (CSR) for an OB signing or OB transport certificate respectively; if *SoftwareStatementCertificateOrKeyType* is set to *sigkey*, *enckey* then the PEM file should contain a public signing or encryption key respectively. |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet(organisationType, organisationId, softwareStatementId)

Get a software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet(organisationType, organisationId, softwareStatementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut(organisationType, organisationId, softwareStatementId, softwareStatementState)

Update a software statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
SoftwareStatementStateSchema softwareStatementState = new SoftwareStatementStateSchema(); // SoftwareStatementStateSchema | Payload used to deactivate/reactivate a Software Statement
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut(organisationType, organisationId, softwareStatementId, softwareStatementState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **softwareStatementState** | [**SoftwareStatementStateSchema**](SoftwareStatementStateSchema.md)| Payload used to deactivate/reactivate a Software Statement |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost(organisationType, organisationId, softwareStatementId, softwareStatementRedirectURI)

Add a redirect URI to the given Software Statement

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
SoftwareStatementRedirectURISchema softwareStatementRedirectURI = new SoftwareStatementRedirectURISchema(); // SoftwareStatementRedirectURISchema | Software Statement Redirect URI
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost(organisationType, organisationId, softwareStatementId, softwareStatementRedirectURI);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdRedirectUriPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |
 **softwareStatementRedirectURI** | [**SoftwareStatementRedirectURISchema**](SoftwareStatementRedirectURISchema.md)| Software Statement Redirect URI |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadWriteOps](../README.md#OAuth2SecurityReadWriteOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet"></a>
# **organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet**
> Void organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet(organisationType, organisationId, softwareStatementId)

Get a Software Statement Assertion for the given SoftwareStatementID.

The response body is a signed JWT and the values found in the header and the payload of the SSA are specified below  # Terminology    This specification uses the terms \&quot;access token\&quot;, \&quot;authorization code\&quot;, \&quot;authorization endpoint\&quot;, \&quot;authorization grant\&quot;, \&quot;authorization server\&quot;, \&quot;client\&quot;, \&quot;client identifier\&quot;, \&quot;client secret\&quot;, \&quot;grant type\&quot;, \&quot;protected resource\&quot;, \&quot;redirection URI\&quot;, \&quot;refresh token\&quot;, \&quot;resource owner\&quot;, \&quot;resource server\&quot;, \&quot;response type\&quot;, and \&quot;token endpoint\&quot; defined by OAuth 2.0 [RFC6749] and uses the term \&quot;Claim\&quot; defined by JSON Web Token (JWT) [RFC7519].    * __Account Servicing Payment Services Provider (ASPSP)__ -- An organisation managing customer accounts (and operating banking APIs).   * __Primary Technical Contact__ -- The person at the TPP who creates an SSA and invokes a registration mechanism. This is an example of an [RFC7591] Client Developer.   * __OB Organisation ID__ -- The unique identifier for each OpenBanking participant. Both TPPs and ASPSPs have OB Organisation IDs.   * __OpenBanking Directory__ -- An implementation of a [PSD2] competent authority; acts as an Identity Provider, certificate authority, and registry governing the participants in the UK OpenBanking API scheme.   * __ASPSP Registration Endpoint__ -- OAuth 2.0 &amp; [RFC7591] compliant endpoint, exact value is discoverable from the [OIDCD] openid-configuration file of the ASPSP.   * __Software Statement Assertion (SSA)__ -- An implementation of an [RFC7591] software statement, signed by the OpenBanking Directory.   * __Trusted Third Party (TPP)__ -- An organization working to initiate payments or consume account information with/from an ASPSP.   * __TPP Client Software__ -- software implementing an OAuth2 client, interacting with an ASPSP registration endpoint.  # Software Statement Assertion (SSA)    The SSA is a JSON Web Token (JWT) containing client metadata about an instance of TPP client software. The JWT is issued and signed by the OpenBanking Directory.  ## SSA Payload    The payload of an OpenBanking SSA MUST be a compliant software statement according to [RFC7591]. The SSA MUST also be a compliant JWT according to [RFC7519]. The following metadata profiles the metadata in [RFC7591] and [RFC7519]:    | Metadata | Description | Source Specification |   |----------|-------------|----------------------|   |&#x60;software_id&#x60;|Unique Identifier for TPP Client Software|[RFC7591]|   |&#x60;iss&#x60;|SSA Issuer|[RFC7519]|   |&#x60;iat&#x60;|Time SSA issued|[RFC7519]|   |&#x60;jti&#x60;|JWT ID|[RFC7519]|    The following software metadata is additionally defined for this profile:    |Metadata |Description |Field Size |Default values |   |---------|------------|-----------|---------------|   |&#x60;software_client_id&#x60;|The Client ID Registered at OB used to access OB resources|Base62 GUID (22 chars)| |   |&#x60;software_client_description&#x60;|Human-readable detailed description of the client|Max256Text| |   |&#x60;software_client_name&#x60;|Human-readable Software Name|Max40Text| |   |&#x60;software_client_uri&#x60;|The website or resource root uri|Max256Text| |   |&#x60;software_version&#x60;|The version number of the software should a TPP choose to register and / or maintain it|decimal| |   |&#x60;software_environment&#x60;|Requested additional field to avoid certificate check|Max256Text| |   |&#x60;software_jwks_endpoint&#x60;|Contains all active signing and network certs for the software|Max256Text| |   |&#x60;software_jwks_revoked_endpoint&#x60;|Contains all revoked signing and network certs for the software|Max256Text| |   |&#x60;software_logo_uri&#x60;|Link to the TPP logo. Note, ASPSPs are not obliged to display images hosted by third parties|Max256Text| |   |&#x60;software_mode&#x60;|ASPSP Requested additional field to indicate that this software is &#x60;Test&#x60; or &#x60;Live&#x60; the default is &#x60;Live&#x60;. Impact and support for &#x60;Test&#x60; software is up to the ASPSP.|Max40Text| |   |&#x60;software_on_behalf_of_org&#x60;|A reference to fourth party organsiation resource on the OB Directory if the registering TPP is acting on behalf of another.|Max40Text| |   |&#x60;software_policy_uri&#x60;|A link to the software&#39;s policy page|Max256Text| |   |&#x60;software_redirect_uris&#x60;|Registered client callback endpoints as registered with Open Banking|A string array of Max256Text items|   |&#x60;software_roles&#x60;|A multi value list of PSD2 roles that this software is authorized to perform.|A string array of Max256Text items| |   |&#x60;software_tos_uri&#x60;|A link to the software&#39;s terms of service page|Max256Text| |    The following Organisational metadata is defined for this profile:    |Metadata |Description |Field Size | Default values |   |---------|------------|-----------|----------------|   |&#x60;organisation_competent_authority_claims&#x60;|Authorisations granted to the organsiation by an NCA|CodeList {&#x60;AISP&#x60;, &#x60;PISP&#x60;, &#x60;CBPII&#x60;, &#x60;ASPSP&#x60;}| |   |&#x60;org_status&#x60;|Included to cater for voluntary withdrawal from OB scenarios|&#x60;Active&#x60;, &#x60;Revoked&#x60;, or &#x60;Withdrawn&#x60;| |   |&#x60;org_id&#x60;|The Unique TPP or ASPSP ID held by OpenBanking.|Max35Text| |   |&#x60;org_name&#x60;|Legal Entity Identifier or other known organisation name|Max140Text| |   |&#x60;org_contacts&#x60;|JSON array of objects containing a triplet of name, email, and phone number|Each item Max256Text| |   |&#x60;org_jwks_endpoint&#x60;|Contains all active signing and network certs for the organisation|Max256Text| |   |&#x60;org_jwks_revoked_endpoint&#x60;|Contains all revoked signing and network certs for the organisation|Max256Text| |  ## SSA header    The SSA header MUST comply with [RFC7519].    |Metadata |Description |Comments |   |---------|------------|---------|   |&#x60;typ&#x60;|MUST be set to &#x60;JWT&#x60;| |   |&#x60;alg&#x60;|MUST be set to &#x60;ES256&#x60; or &#x60;PS256&#x60;| |   |&#x60;kid&#x60;|The kid will be kept the same as the &#x60;x5t&#x60; parameter. (X.509 Certificate SHA-1 Thumbprint) of the signing certificate.| |    ### Example SSA    The elements defined in the software statement will consist of the following values.    *Note that there are inconsistent applications of booleans or \&quot;Active\&quot; strings in the current data model.*    *Note that there are inconsistent applications of status flags case sensitivity.*    *The attributes required to be displayed by ASPSPs.*  &#x60;&#x60;&#x60; {   \&quot;typ\&quot;: \&quot;JWT\&quot;,   \&quot;alg\&quot;: \&quot;ES256\&quot;,   \&quot;kid\&quot;: \&quot;ABCD1234\&quot; } {   \&quot;iss\&quot;: \&quot;OpenBanking Ltd\&quot;,   \&quot;iat\&quot;: 1492756331,   \&quot;jti\&quot;: \&quot;id12345685439487678\&quot;,   \&quot;software_environment\&quot;: \&quot;production\&quot;,   \&quot;software_mode\&quot;: \&quot;live\&quot;,   \&quot;software_id\&quot;: \&quot;65d1f27c-4aea-4549-9c21-60e495a7a86f\&quot;,   \&quot;software_client_id\&quot;: \&quot;OpenBanking TPP Client Unique ID\&quot;,   \&quot;software_client_name\&quot;: \&quot;Amazon Prime Movies\&quot;,   \&quot;software_client_description\&quot;: \&quot;Amazon Prime Movies is a moving streaming service\&quot;,   \&quot;software_version\&quot;: \&quot;2.2\&quot;,   \&quot;software_client_uri\&quot;: \&quot;https://prime.amazon.com\&quot;,   \&quot;software_redirect_uris\&quot;: [     \&quot;https://prime.amazon.com/cb\&quot;,     \&quot;https://prime.amazon.co.uk/cb\&quot;   ],   \&quot;software_roles\&quot;: [     \&quot;PISP\&quot;,     \&quot;AISP\&quot;   ],   \&quot;organisation_competent_authority_claims\&quot;: {     \&quot;authority_id\&quot;: \&quot;FMA\&quot;, // Austrian Financial Market Authority     \&quot;registration_id\&quot;: \&quot;111111\&quot;,     \&quot;status\&quot;: \&quot;Active\&quot;,     \&quot;authorisations\&quot;:  [       {         \&quot;member_state\&quot;: \&quot;GB\&quot;,         \&quot;roles\&quot;: [           \&quot;PISP\&quot;,           \&quot;AISP\&quot;         ]       },       {         \&quot;member_state\&quot;: \&quot;IR\&quot;,         \&quot;roles\&quot;: [           \&quot;PISP\&quot;         ]       }     ]   },   \&quot;software_logo_uri\&quot;: \&quot;https://prime.amazon.com/logo.png\&quot;,   \&quot;org_status\&quot;: \&quot;Active\&quot;,   \&quot;org_id\&quot;: \&quot;Amazon TPPID\&quot;,   \&quot;org_name\&quot;: \&quot;OpenBanking TPP Registered Name\&quot;,   \&quot;org_contacts\&quot;: [     {       \&quot;name\&quot;: \&quot;contact name\&quot;,       \&quot;email\&quot;: \&quot;contact@contact.com\&quot;,       \&quot;phone\&quot;: \&quot;+447890130558\&quot;       \&quot;type\&quot;: \&quot;business\&quot;     },     {       \&quot;name\&quot;: \&quot;contact name\&quot;,       \&quot;email\&quot;: \&quot;contact@contact.com\&quot;,       \&quot;phone\&quot;: \&quot;+447890130558\&quot;,       \&quot;type\&quot;: \&quot;technical\&quot;     }   ],   \&quot;org_jwks_endpoint\&quot;: \&quot;https://jwks.openbanking.org.uk/org_id/org_id.jkws\&quot;,   \&quot;org_jwks_revoked_endpoint\&quot;: \&quot;https://jwks.openbanking.org.uk/org_id/revoked/org_id.jkws\&quot;,   \&quot;software_jwks_endpoint\&quot;: \&quot;https://jwks.openbanking.org.uk/org_id/software_id.jkws\&quot;,   \&quot;software_jwks_revoked_endpoint\&quot;: \&quot;https://jwks.openbanking.org.uk/org_id/revoked/software_id.jkws\&quot;,   \&quot;software_policy_uri\&quot;: \&quot;https://tpp.com/policy.html\&quot;,   \&quot;software_tos_uri\&quot;: \&quot;https://tpp.com/tos.html\&quot;,   \&quot;software_on_behalf_of_org\&quot;: \&quot;Acme Ltd\&quot; } {   Signature } &#x60;&#x60;&#x60;  # Automated Client Registration  A TPP MAY use automated client registration to submit an SSA to an ASPSP in exchange for client credentials for use as a client against an OAuth 2.0 Authorization Server. It is RECOMMENDED for ASPSPs to support the automated client registration mechanism. A large number of claims that OpenID Connect OPs could support as part of the RFC7591 request are detailed [https://openid.net/specs/openid-connect-registration-1_0.html#ClientMetadata](https://openid.net/specs/openid-connect-registration-1_0.html#ClientMetadata) and should be followed if not explicitly referenced in the Software Statement Assertion claim set.  ## Request Validation  Prior to issuing a client registration response, the ASPSP MUST perform the following checks  * The ASPSP SHOULD check whether the TPP that initiated the TLS connection is the same TPP as listed in the SSA. * In the case where a gateway or other piece of infrastructure pre-terminates the MATLS channel in front of the registration endpoint, the certificate used to initiate the connection or some part of that certificate (such as DN &amp; Issuer) SHOULD be made available to the ASPSP for validation against the claims in the SSA. * The registration request MUST be signed with a key contained in the JWKS referenced in the SSA included with the request. This ensures that a holder-of-key proof-of-possession is performed proving that the TPP app was the originally intended recipient of the SSA when the OB issued it. * The SSA MUST be validated according to [RFC7519], including validation of the signature and validity window.  JWT signature must be validated, this involves retrieving the jwks keyset for both the OB and the TPP. The OB keystore location will be published as part of the directory specification, The TPP&#39;s will be included in the software statement.  ### SSA Lifetime  The SSA&#39;s Lifetime / Validity period is not defined by Open Banking. ASPSPs in the Open Banking ecosystem are required to implement pragmatic time ranges in which to accept an SSA. For example, an ASPSP that has implemented Dynamic Client Registration may choose to accept SSA&#39;s that were issued no earlier than 1 minute prior to their presentation however ASPSPs that only support manual registration may need to accept SSAs that were issued 30 minutes prior as the elapsed time period between generation and use between these two flows is expected to differ significantly. 

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationId = "organisationId_example"; // String | The organsation ID
String softwareStatementId = "softwareStatementId_example"; // String | The software statement ID
try {
    Void result = apiInstance.organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet(organisationType, organisationId, softwareStatementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypeOrganisationIdSoftwareStatementSoftwareStatementIdSoftwareStatementAssertionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationId** | **String**| The organsation ID |
 **softwareStatementId** | **String**| The software statement ID |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="organisationOrganisationTypePost"></a>
# **organisationOrganisationTypePost**
> Void organisationOrganisationTypePost(organisationType, organisationTypeForQSealCOnboarding, enrol)

Enrol a eIDAS QWAC/QSealC-bearing participant

Enrol an eIDAS QWAC/QSealC certificate-bearing participant onto the Open Banking Directory. Currenty only TPPs can use this enrolment endpoint, so please set &#x60;OrganisationType&#x60; to &#x60;tpp&#x60;

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.OrganisationApi;

OrganisationApi apiInstance = new OrganisationApi();
String organisationType = "organisationType_example"; // String | OB Organisation Type
String organisationTypeForQSealCOnboarding = "organisationTypeForQSealCOnboarding_example"; // String | OB Organisation Type
EnrolSchema enrol = new EnrolSchema(); // EnrolSchema | The payload submitted when a TPP attempts to enrol with an eIDAS QWAC or QSealC certificate. It's format and contents will depend on the value of the `Content-Type` header:  TPP onto the Open Banking Directory (required fields to be validated). For eIDAS QSealC-bearing TPPs use a signed JWT (JWS).  * __application/json__ -- a JSON payload for QWAC onboarding. * __application/jwt__ -- a signed JWT (JWS) for QSealC onboarding. * __application/jose__ -- same as __application/jwt__.  ## QWAC-based Onboarding  Set `Content-Type` to `application/json` and send the payload conforming to the schema.  EXAMPLE REQUEST PAYLOAD FOR QWAC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/json Accept: application/json Host: matls-dirapi.openbanking.org.uk {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  ## QSealC-based Onboarding  Set `Content-Type` to `application/jwt` or `application/jose` and send the payload conforming to the schema as a signed JWT.  The QSealC, the issuing certificate, and the root certificate (all in DER format) must be used as the items of the array, which forms the value of the `x5c` claim in the JWT header.  The JWT MUST be signed using the private key associated with the QSealC listed in the `x5c` claim in the header.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\",   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  EXAMPLE REQUEST PAYLOAD FOR QSealC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/jwt | application/jose Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmciXSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` 
try {
    Void result = apiInstance.organisationOrganisationTypePost(organisationType, organisationTypeForQSealCOnboarding, enrol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganisationApi#organisationOrganisationTypePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organisationType** | **String**| OB Organisation Type | [enum: aspsp, tpp]
 **organisationTypeForQSealCOnboarding** | **String**| OB Organisation Type | [enum: tpp]
 **enrol** | [**EnrolSchema**](EnrolSchema.md)| The payload submitted when a TPP attempts to enrol with an eIDAS QWAC or QSealC certificate. It&#39;s format and contents will depend on the value of the &#x60;Content-Type&#x60; header:  TPP onto the Open Banking Directory (required fields to be validated). For eIDAS QSealC-bearing TPPs use a signed JWT (JWS).  * __application/json__ -- a JSON payload for QWAC onboarding. * __application/jwt__ -- a signed JWT (JWS) for QSealC onboarding. * __application/jose__ -- same as __application/jwt__.  ## QWAC-based Onboarding  Set &#x60;Content-Type&#x60; to &#x60;application/json&#x60; and send the payload conforming to the schema.  EXAMPLE REQUEST PAYLOAD FOR QWAC-BASED ONBOARDING  &#x60;&#x60;&#x60; POST /organisation/tpp HTTP/1.1 Content-Type: application/json Accept: application/json Host: matls-dirapi.openbanking.org.uk {   \&quot;client_name\&quot;: \&quot;string\&quot;,   \&quot;scope\&quot;: \&quot;string\&quot;,   \&quot;token_endpoint_auth_method\&quot;: \&quot;string\&quot;,   \&quot;tls_client_auth_subject_dn\&quot;: \&quot;string\&quot;,   \&quot;grant_types\&quot;: [     \&quot;string\&quot;   ],   \&quot;token_endpoint_auth_signing_alg\&quot;: \&quot;string\&quot; } &#x60;&#x60;&#x60;  ## QSealC-based Onboarding  Set &#x60;Content-Type&#x60; to &#x60;application/jwt&#x60; or &#x60;application/jose&#x60; and send the payload conforming to the schema as a signed JWT.  The QSealC, the issuing certificate, and the root certificate (all in DER format) must be used as the items of the array, which forms the value of the &#x60;x5c&#x60; claim in the JWT header.  The JWT MUST be signed using the private key associated with the QSealC listed in the &#x60;x5c&#x60; claim in the header.  &#x60;&#x60;&#x60; {   \&quot;typ\&quot;: \&quot;JWT\&quot;,   \&quot;alg\&quot;: \&quot;ES256\&quot;,   \&quot;kid\&quot;: \&quot;ABCD1234\&quot;,   \&quot;x5c\&quot;: [\&quot;qsealc\&quot;, \&quot;issuer certificate\&quot;, \&quot;root certificate\&quot;] } {   \&quot;client_name\&quot;: \&quot;string\&quot;,   \&quot;scope\&quot;: \&quot;string\&quot;,   \&quot;token_endpoint_auth_method\&quot;: \&quot;string\&quot;,   \&quot;tls_client_auth_subject_dn\&quot;: \&quot;string\&quot;,   \&quot;grant_types\&quot;: [     \&quot;string\&quot;   ],   \&quot;token_endpoint_auth_signing_alg\&quot;: \&quot;string\&quot; } &#x60;&#x60;&#x60;  EXAMPLE REQUEST PAYLOAD FOR QSealC-BASED ONBOARDING  &#x60;&#x60;&#x60; POST /organisation/tpp HTTP/1.1 Content-Type: application/jwt | application/jose Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmciXSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA &#x60;&#x60;&#x60;  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

