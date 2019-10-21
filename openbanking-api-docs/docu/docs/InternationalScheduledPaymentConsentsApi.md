# InternationalScheduledPaymentConsentsApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInternationalScheduledPaymentConsents**](InternationalScheduledPaymentConsentsApi.md#createInternationalScheduledPaymentConsents) | **POST** /international-scheduled-payment-consents | Create International Scheduled Payment Consents
[**getInternationalScheduledPaymentConsentsConsentId**](InternationalScheduledPaymentConsentsApi.md#getInternationalScheduledPaymentConsentsConsentId) | **GET** /international-scheduled-payment-consents/{ConsentId} | Get International Scheduled Payment Consents
[**getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation**](InternationalScheduledPaymentConsentsApi.md#getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation) | **GET** /international-scheduled-payment-consents/{ConsentId}/funds-confirmation | Get International Scheduled Payment Consents


<a name="createInternationalScheduledPaymentConsents"></a>
# **createInternationalScheduledPaymentConsents**
> OBWriteInternationalScheduledConsentResponse3 createInternationalScheduledPaymentConsents(obWriteInternationalScheduledConsent3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create International Scheduled Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentConsentsApi;

InternationalScheduledPaymentConsentsApi apiInstance = new InternationalScheduledPaymentConsentsApi();
OBWriteInternationalScheduledConsent3 obWriteInternationalScheduledConsent3Param = new OBWriteInternationalScheduledConsent3(); // OBWriteInternationalScheduledConsent3 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalScheduledConsentResponse3 result = apiInstance.createInternationalScheduledPaymentConsents(obWriteInternationalScheduledConsent3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentConsentsApi#createInternationalScheduledPaymentConsents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteInternationalScheduledConsent3Param** | [**OBWriteInternationalScheduledConsent3**](OBWriteInternationalScheduledConsent3.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalScheduledConsentResponse3**](OBWriteInternationalScheduledConsentResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalScheduledPaymentConsentsConsentId"></a>
# **getInternationalScheduledPaymentConsentsConsentId**
> OBWriteInternationalScheduledConsentResponse3 getInternationalScheduledPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get International Scheduled Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentConsentsApi;

InternationalScheduledPaymentConsentsApi apiInstance = new InternationalScheduledPaymentConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalScheduledConsentResponse3 result = apiInstance.getInternationalScheduledPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentConsentsApi#getInternationalScheduledPaymentConsentsConsentId");
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

[**OBWriteInternationalScheduledConsentResponse3**](OBWriteInternationalScheduledConsentResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation"></a>
# **getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation**
> OBWriteFundsConfirmationResponse1 getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get International Scheduled Payment Consents

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentConsentsApi;

InternationalScheduledPaymentConsentsApi apiInstance = new InternationalScheduledPaymentConsentsApi();
String consentId = "consentId_example"; // String | ConsentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteFundsConfirmationResponse1 result = apiInstance.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentConsentsApi#getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation");
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

