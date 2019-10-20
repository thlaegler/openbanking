# DomesticScheduledPaymentsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomesticScheduledPayments**](DomesticScheduledPaymentsApi.md#createDomesticScheduledPayments) | **POST** /domestic-scheduled-payments | Create Domestic Scheduled Payments
[**getDomesticScheduledPaymentsDomesticScheduledPaymentId**](DomesticScheduledPaymentsApi.md#getDomesticScheduledPaymentsDomesticScheduledPaymentId) | **GET** /domestic-scheduled-payments/{DomesticScheduledPaymentId} | Get Domestic Scheduled Payments
[**getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails**](DomesticScheduledPaymentsApi.md#getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails) | **GET** /domestic-scheduled-payments/{DomesticScheduledPaymentId}/payment-details | Get Payment Details


<a name="createDomesticScheduledPayments"></a>
# **createDomesticScheduledPayments**
> OBWriteDomesticScheduledResponse3 createDomesticScheduledPayments(obWriteDomesticScheduled2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create Domestic Scheduled Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticScheduledPaymentsApi;

DomesticScheduledPaymentsApi apiInstance = new DomesticScheduledPaymentsApi();
OBWriteDomesticScheduled2 obWriteDomesticScheduled2Param = new OBWriteDomesticScheduled2(); // OBWriteDomesticScheduled2 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticScheduledResponse3 result = apiInstance.createDomesticScheduledPayments(obWriteDomesticScheduled2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticScheduledPaymentsApi#createDomesticScheduledPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteDomesticScheduled2Param** | [**OBWriteDomesticScheduled2**](OBWriteDomesticScheduled2.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticScheduledResponse3**](OBWriteDomesticScheduledResponse3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticScheduledPaymentsDomesticScheduledPaymentId"></a>
# **getDomesticScheduledPaymentsDomesticScheduledPaymentId**
> OBWriteDomesticScheduledResponse3 getDomesticScheduledPaymentsDomesticScheduledPaymentId(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Domestic Scheduled Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticScheduledPaymentsApi;

DomesticScheduledPaymentsApi apiInstance = new DomesticScheduledPaymentsApi();
String domesticScheduledPaymentId = "domesticScheduledPaymentId_example"; // String | DomesticScheduledPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteDomesticScheduledResponse3 result = apiInstance.getDomesticScheduledPaymentsDomesticScheduledPaymentId(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticScheduledPaymentsApi#getDomesticScheduledPaymentsDomesticScheduledPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domesticScheduledPaymentId** | **String**| DomesticScheduledPaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteDomesticScheduledResponse3**](OBWriteDomesticScheduledResponse3.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails"></a>
# **getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails**
> OBWritePaymentDetailsResponse1 getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Payment Details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.DomesticScheduledPaymentsApi;

DomesticScheduledPaymentsApi apiInstance = new DomesticScheduledPaymentsApi();
String domesticScheduledPaymentId = "domesticScheduledPaymentId_example"; // String | DomesticScheduledPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWritePaymentDetailsResponse1 result = apiInstance.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomesticScheduledPaymentsApi#getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domesticScheduledPaymentId** | **String**| DomesticScheduledPaymentId |
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

