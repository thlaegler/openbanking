# InternationalScheduledPaymentsApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInternationalScheduledPayments**](InternationalScheduledPaymentsApi.md#createInternationalScheduledPayments) | **POST** /international-scheduled-payments | Create International Scheduled Payments
[**getInternationalScheduledPaymentsInternationalScheduledPaymentId**](InternationalScheduledPaymentsApi.md#getInternationalScheduledPaymentsInternationalScheduledPaymentId) | **GET** /international-scheduled-payments/{InternationalScheduledPaymentId} | Get International Scheduled Payments
[**getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails**](InternationalScheduledPaymentsApi.md#getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails) | **GET** /international-scheduled-payments/{InternationalScheduledPaymentId}/payment-details | Get Payment Details


<a name="createInternationalScheduledPayments"></a>
# **createInternationalScheduledPayments**
> OBWriteInternationalScheduledResponse3 createInternationalScheduledPayments(obWriteInternationalScheduled2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create International Scheduled Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentsApi;

InternationalScheduledPaymentsApi apiInstance = new InternationalScheduledPaymentsApi();
OBWriteInternationalScheduled2 obWriteInternationalScheduled2Param = new OBWriteInternationalScheduled2(); // OBWriteInternationalScheduled2 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalScheduledResponse3 result = apiInstance.createInternationalScheduledPayments(obWriteInternationalScheduled2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentsApi#createInternationalScheduledPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteInternationalScheduled2Param** | [**OBWriteInternationalScheduled2**](OBWriteInternationalScheduled2.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalScheduledResponse3**](OBWriteInternationalScheduledResponse3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalScheduledPaymentsInternationalScheduledPaymentId"></a>
# **getInternationalScheduledPaymentsInternationalScheduledPaymentId**
> OBWriteInternationalScheduledResponse3 getInternationalScheduledPaymentsInternationalScheduledPaymentId(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get International Scheduled Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentsApi;

InternationalScheduledPaymentsApi apiInstance = new InternationalScheduledPaymentsApi();
String internationalScheduledPaymentId = "internationalScheduledPaymentId_example"; // String | InternationalScheduledPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalScheduledResponse3 result = apiInstance.getInternationalScheduledPaymentsInternationalScheduledPaymentId(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentsApi#getInternationalScheduledPaymentsInternationalScheduledPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **internationalScheduledPaymentId** | **String**| InternationalScheduledPaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalScheduledResponse3**](OBWriteInternationalScheduledResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails"></a>
# **getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails**
> OBWritePaymentDetailsResponse1 getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Payment Details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalScheduledPaymentsApi;

InternationalScheduledPaymentsApi apiInstance = new InternationalScheduledPaymentsApi();
String internationalScheduledPaymentId = "internationalScheduledPaymentId_example"; // String | InternationalScheduledPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWritePaymentDetailsResponse1 result = apiInstance.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalScheduledPaymentsApi#getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **internationalScheduledPaymentId** | **String**| InternationalScheduledPaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWritePaymentDetailsResponse1**](OBWritePaymentDetailsResponse1.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

