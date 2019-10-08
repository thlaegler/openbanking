# InternationalStandingOrdersApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInternationalStandingOrders**](InternationalStandingOrdersApi.md#createInternationalStandingOrders) | **POST** /international-standing-orders | Create International Standing Orders
[**getInternationalStandingOrdersInternationalStandingOrderPaymentId**](InternationalStandingOrdersApi.md#getInternationalStandingOrdersInternationalStandingOrderPaymentId) | **GET** /international-standing-orders/{InternationalStandingOrderPaymentId} | Get International Standing Orders
[**getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails**](InternationalStandingOrdersApi.md#getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails) | **GET** /international-standing-orders/{InternationalStandingOrderPaymentId}/payment-details | Get Payment Details


<a name="createInternationalStandingOrders"></a>
# **createInternationalStandingOrders**
> OBWriteInternationalStandingOrderResponse4 createInternationalStandingOrders(obWriteInternationalStandingOrder3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create International Standing Orders

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalStandingOrdersApi;

InternationalStandingOrdersApi apiInstance = new InternationalStandingOrdersApi();
OBWriteInternationalStandingOrder3 obWriteInternationalStandingOrder3Param = new OBWriteInternationalStandingOrder3(); // OBWriteInternationalStandingOrder3 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalStandingOrderResponse4 result = apiInstance.createInternationalStandingOrders(obWriteInternationalStandingOrder3Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalStandingOrdersApi#createInternationalStandingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteInternationalStandingOrder3Param** | [**OBWriteInternationalStandingOrder3**](OBWriteInternationalStandingOrder3.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalStandingOrderResponse4**](OBWriteInternationalStandingOrderResponse4.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalStandingOrdersInternationalStandingOrderPaymentId"></a>
# **getInternationalStandingOrdersInternationalStandingOrderPaymentId**
> OBWriteInternationalStandingOrderResponse4 getInternationalStandingOrdersInternationalStandingOrderPaymentId(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get International Standing Orders

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalStandingOrdersApi;

InternationalStandingOrdersApi apiInstance = new InternationalStandingOrdersApi();
String internationalStandingOrderPaymentId = "internationalStandingOrderPaymentId_example"; // String | InternationalStandingOrderPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteInternationalStandingOrderResponse4 result = apiInstance.getInternationalStandingOrdersInternationalStandingOrderPaymentId(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalStandingOrdersApi#getInternationalStandingOrdersInternationalStandingOrderPaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **internationalStandingOrderPaymentId** | **String**| InternationalStandingOrderPaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteInternationalStandingOrderResponse4**](OBWriteInternationalStandingOrderResponse4.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails"></a>
# **getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails**
> OBWritePaymentDetailsResponse1 getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Payment Details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.InternationalStandingOrdersApi;

InternationalStandingOrdersApi apiInstance = new InternationalStandingOrdersApi();
String internationalStandingOrderPaymentId = "internationalStandingOrderPaymentId_example"; // String | InternationalStandingOrderPaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWritePaymentDetailsResponse1 result = apiInstance.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternationalStandingOrdersApi#getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **internationalStandingOrderPaymentId** | **String**| InternationalStandingOrderPaymentId |
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

