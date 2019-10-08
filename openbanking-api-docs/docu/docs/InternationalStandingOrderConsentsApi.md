# InternationalStandingOrderConsentsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInternationalStandingOrderConsents**](InternationalStandingOrderConsentsApi.md#createInternationalStandingOrderConsents) | **POST** /international-standing-order-consents | Create International Standing Order Consents
[**getInternationalStandingOrderConsentsConsentId**](InternationalStandingOrderConsentsApi.md#getInternationalStandingOrderConsentsConsentId) | **GET** /international-standing-order-consents/{ConsentId} | Get International Standing Order Consents


<a name="createInternationalStandingOrderConsents"></a>
# **createInternationalStandingOrderConsents**
> OBWriteInternationalStandingOrderConsentResponse4 createInternationalStandingOrderConsents(obWriteInternationalStandingOrderConsent4Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create International Standing Order Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalStandingOrderConsentsApi;

InternationalStandingOrderConsentsApi apiInstance = new InternationalStandingOrderConsentsApi();
OBWriteInternationalStandingOrderConsent4 obWriteInternationalStandingOrderConsent4Param = new OBWriteInternationalStandingOrderConsent4(); // OBWriteInternationalStandingOrderConsent4 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalStandingOrderConsentResponse4 result = apiInstance.createInternationalStandingOrderConsents(obWriteInternationalStandingOrderConsent4Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalStandingOrderConsentsApi#createInternationalStandingOrderConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteInternationalStandingOrderConsent4Param** | [**OBWriteInternationalStandingOrderConsent4**](OBWriteInternationalStandingOrderConsent4.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalStandingOrderConsentResponse4**](OBWriteInternationalStandingOrderConsentResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalStandingOrderConsentsConsentId"></a>
# **getInternationalStandingOrderConsentsConsentId**
> OBWriteInternationalStandingOrderConsentResponse4 getInternationalStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get International Standing Order Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalStandingOrderConsentsApi;

InternationalStandingOrderConsentsApi apiInstance = new InternationalStandingOrderConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalStandingOrderConsentResponse4 result = apiInstance.getInternationalStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalStandingOrderConsentsApi#getInternationalStandingOrderConsentsConsentId");
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

[**OBWriteInternationalStandingOrderConsentResponse4**](OBWriteInternationalStandingOrderConsentResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

