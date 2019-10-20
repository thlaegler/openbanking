# FilePaymentsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFilePayments**](FilePaymentsApi.md#createFilePayments) | **POST** /file-payments | Create File Payments
[**getFilePaymentsFilePaymentId**](FilePaymentsApi.md#getFilePaymentsFilePaymentId) | **GET** /file-payments/{FilePaymentId} | Get File Payments
[**getFilePaymentsFilePaymentIdPaymentDetails**](FilePaymentsApi.md#getFilePaymentsFilePaymentIdPaymentDetails) | **GET** /file-payments/{FilePaymentId}/payment-details | Get Payment Details
[**getFilePaymentsFilePaymentIdReportFile**](FilePaymentsApi.md#getFilePaymentsFilePaymentIdReportFile) | **GET** /file-payments/{FilePaymentId}/report-file | Get File Payments


<a name="createFilePayments"></a>
# **createFilePayments**
> OBWriteFileResponse2 createFilePayments(obWriteFile2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Create File Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FilePaymentsApi;

FilePaymentsApi apiInstance = new FilePaymentsApi();
OBWriteFile2 obWriteFile2Param = new OBWriteFile2(); // OBWriteFile2 | Default
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
String xJwsSignature = "xJwsSignature_example"; // String | A detached JWS signature of the body of the payload.
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteFileResponse2 result = apiInstance.createFilePayments(obWriteFile2Param, authorization, xIdempotencyKey, xJwsSignature, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilePaymentsApi#createFilePayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **obWriteFile2Param** | [**OBWriteFile2**](OBWriteFile2.md)| Default |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  |
 **xJwsSignature** | **String**| A detached JWS signature of the body of the payload. |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteFileResponse2**](OBWriteFileResponse2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getFilePaymentsFilePaymentId"></a>
# **getFilePaymentsFilePaymentId**
> OBWriteFileResponse2 getFilePaymentsFilePaymentId(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get File Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FilePaymentsApi;

FilePaymentsApi apiInstance = new FilePaymentsApi();
String filePaymentId = "filePaymentId_example"; // String | FilePaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWriteFileResponse2 result = apiInstance.getFilePaymentsFilePaymentId(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilePaymentsApi#getFilePaymentsFilePaymentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePaymentId** | **String**| FilePaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBWriteFileResponse2**](OBWriteFileResponse2.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getFilePaymentsFilePaymentIdPaymentDetails"></a>
# **getFilePaymentsFilePaymentIdPaymentDetails**
> OBWritePaymentDetailsResponse1 getFilePaymentsFilePaymentIdPaymentDetails(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Payment Details

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FilePaymentsApi;

FilePaymentsApi apiInstance = new FilePaymentsApi();
String filePaymentId = "filePaymentId_example"; // String | FilePaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBWritePaymentDetailsResponse1 result = apiInstance.getFilePaymentsFilePaymentIdPaymentDetails(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilePaymentsApi#getFilePaymentsFilePaymentIdPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePaymentId** | **String**| FilePaymentId |
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

<a name="getFilePaymentsFilePaymentIdReportFile"></a>
# **getFilePaymentsFilePaymentIdReportFile**
> java.io.File getFilePaymentsFilePaymentIdReportFile(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get File Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.FilePaymentsApi;

FilePaymentsApi apiInstance = new FilePaymentsApi();
String filePaymentId = "filePaymentId_example"; // String | FilePaymentId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    java.io.File result = apiInstance.getFilePaymentsFilePaymentIdReportFile(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilePaymentsApi#getFilePaymentsFilePaymentIdReportFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePaymentId** | **String**| FilePaymentId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

