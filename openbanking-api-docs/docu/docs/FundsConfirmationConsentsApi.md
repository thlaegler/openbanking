# FundsConfirmationConsentsApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFundsConfirmationConsents**](FundsConfirmationConsentsApi.md#createFundsConfirmationConsents) | **POST** /funds-confirmation-consents | Create Funds Confirmation Consent
[**deleteFundsConfirmationConsentsConsentId**](FundsConfirmationConsentsApi.md#deleteFundsConfirmationConsentsConsentId) | **DELETE** /funds-confirmation-consents/{ConsentId} | Delete Funds Confirmation Consent
[**getFundsConfirmationConsentsConsentId**](FundsConfirmationConsentsApi.md#getFundsConfirmationConsentsConsentId) | **GET** /funds-confirmation-consents/{ConsentId} | Get Funds Confirmation Consent


<a name="createFundsConfirmationConsents"></a>
# **createFundsConfirmationConsents**
> OBFundsConfirmationConsentResponse1 createFundsConfirmationConsents(obFundsConfirmationConsent1Param, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Funds Confirmation Consent

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FundsConfirmationConsentsApi;

FundsConfirmationConsentsApi apiInstance = new FundsConfirmationConsentsApi();
OBFundsConfirmationConsent1 obFundsConfirmationConsent1Param = new OBFundsConfirmationConsent1(); // OBFundsConfirmationConsent1 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBFundsConfirmationConsentResponse1 result = apiInstance.createFundsConfirmationConsents(obFundsConfirmationConsent1Param, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsConfirmationConsentsApi#createFundsConfirmationConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obFundsConfirmationConsent1Param** | [**OBFundsConfirmationConsent1**](OBFundsConfirmationConsent1.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBFundsConfirmationConsentResponse1**](OBFundsConfirmationConsentResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="deleteFundsConfirmationConsentsConsentId"></a>
# **deleteFundsConfirmationConsentsConsentId**
> Void deleteFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Delete Funds Confirmation Consent

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FundsConfirmationConsentsApi;

FundsConfirmationConsentsApi apiInstance = new FundsConfirmationConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    Void result = apiInstance.deleteFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsConfirmationConsentsApi#deleteFundsConfirmationConsentsConsentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| ConsentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**Void**](.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getFundsConfirmationConsentsConsentId"></a>
# **getFundsConfirmationConsentsConsentId**
> OBFundsConfirmationConsentResponse1 getFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Funds Confirmation Consent

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FundsConfirmationConsentsApi;

FundsConfirmationConsentsApi apiInstance = new FundsConfirmationConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBFundsConfirmationConsentResponse1 result = apiInstance.getFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundsConfirmationConsentsApi#getFundsConfirmationConsentsConsentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| ConsentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBFundsConfirmationConsentResponse1**](OBFundsConfirmationConsentResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

