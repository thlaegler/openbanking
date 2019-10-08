# DomesticPaymentConsentsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomesticPaymentConsents**](DomesticPaymentConsentsApi.md#createDomesticPaymentConsents) | **POST** /domestic-payment-consents | Create Domestic Payment Consents
[**getDomesticPaymentConsentsConsentId**](DomesticPaymentConsentsApi.md#getDomesticPaymentConsentsConsentId) | **GET** /domestic-payment-consents/{ConsentId} | Get Domestic Payment Consents
[**getDomesticPaymentConsentsConsentIdFundsConfirmation**](DomesticPaymentConsentsApi.md#getDomesticPaymentConsentsConsentIdFundsConfirmation) | **GET** /domestic-payment-consents/{ConsentId}/funds-confirmation | Get Domestic Payment Consents


<a name="createDomesticPaymentConsents"></a>
# **createDomesticPaymentConsents**
> OBWriteDomesticConsentResponse3 createDomesticPaymentConsents(obWriteDomesticConsent3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Domestic Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticPaymentConsentsApi;

DomesticPaymentConsentsApi apiInstance = new DomesticPaymentConsentsApi();
OBWriteDomesticConsent3 obWriteDomesticConsent3Param = new OBWriteDomesticConsent3(); // OBWriteDomesticConsent3 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticConsentResponse3 result = apiInstance.createDomesticPaymentConsents(obWriteDomesticConsent3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticPaymentConsentsApi#createDomesticPaymentConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteDomesticConsent3Param** | [**OBWriteDomesticConsent3**](OBWriteDomesticConsent3.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticConsentResponse3**](OBWriteDomesticConsentResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticPaymentConsentsConsentId"></a>
# **getDomesticPaymentConsentsConsentId**
> OBWriteDomesticConsentResponse3 getDomesticPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Domestic Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticPaymentConsentsApi;

DomesticPaymentConsentsApi apiInstance = new DomesticPaymentConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticConsentResponse3 result = apiInstance.getDomesticPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticPaymentConsentsApi#getDomesticPaymentConsentsConsentId");
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

[**OBWriteDomesticConsentResponse3**](OBWriteDomesticConsentResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticPaymentConsentsConsentIdFundsConfirmation"></a>
# **getDomesticPaymentConsentsConsentIdFundsConfirmation**
> OBWriteFundsConfirmationResponse1 getDomesticPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Domestic Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticPaymentConsentsApi;

DomesticPaymentConsentsApi apiInstance = new DomesticPaymentConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteFundsConfirmationResponse1 result = apiInstance.getDomesticPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticPaymentConsentsApi#getDomesticPaymentConsentsConsentIdFundsConfirmation");
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

[**OBWriteFundsConfirmationResponse1**](OBWriteFundsConfirmationResponse1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

