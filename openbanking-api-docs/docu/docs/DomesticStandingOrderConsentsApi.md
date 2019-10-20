# DomesticStandingOrderConsentsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomesticStandingOrderConsents**](DomesticStandingOrderConsentsApi.md#createDomesticStandingOrderConsents) | **POST** /domestic-standing-order-consents | Create Domestic Standing Order Consents
[**getDomesticStandingOrderConsentsConsentId**](DomesticStandingOrderConsentsApi.md#getDomesticStandingOrderConsentsConsentId) | **GET** /domestic-standing-order-consents/{ConsentId} | Get Domestic Standing Order Consents


<a name="createDomesticStandingOrderConsents"></a>
# **createDomesticStandingOrderConsents**
> OBWriteDomesticStandingOrderConsentResponse4 createDomesticStandingOrderConsents(obWriteDomesticStandingOrderConsent4Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Domestic Standing Order Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticStandingOrderConsentsApi;

DomesticStandingOrderConsentsApi apiInstance = new DomesticStandingOrderConsentsApi();
OBWriteDomesticStandingOrderConsent4 obWriteDomesticStandingOrderConsent4Param = new OBWriteDomesticStandingOrderConsent4(); // OBWriteDomesticStandingOrderConsent4 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticStandingOrderConsentResponse4 result = apiInstance.createDomesticStandingOrderConsents(obWriteDomesticStandingOrderConsent4Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticStandingOrderConsentsApi#createDomesticStandingOrderConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteDomesticStandingOrderConsent4Param** | [**OBWriteDomesticStandingOrderConsent4**](OBWriteDomesticStandingOrderConsent4.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticStandingOrderConsentResponse4**](OBWriteDomesticStandingOrderConsentResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticStandingOrderConsentsConsentId"></a>
# **getDomesticStandingOrderConsentsConsentId**
> OBWriteDomesticStandingOrderConsentResponse4 getDomesticStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Domestic Standing Order Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticStandingOrderConsentsApi;

DomesticStandingOrderConsentsApi apiInstance = new DomesticStandingOrderConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticStandingOrderConsentResponse4 result = apiInstance.getDomesticStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticStandingOrderConsentsApi#getDomesticStandingOrderConsentsConsentId");
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

[**OBWriteDomesticStandingOrderConsentResponse4**](OBWriteDomesticStandingOrderConsentResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

