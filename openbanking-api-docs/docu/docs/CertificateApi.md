# CertificateApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**certificateValidatePost**](CertificateApi.md#certificateValidatePost) | **POST** /certificate/validate | Validate certificate


<a name="certificateValidatePost"></a>
# **certificateValidatePost**
> Void certificateValidatePost(certificateValidationRequestBody)

Validate certificate

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CertificateApi;

CertificateApi apiInstance = new CertificateApi();
String certificateValidationRequestBody = "certificateValidationRequestBody_example"; // String | Certificate Validation Payload
try {
    Void result = apiInstance.certificateValidatePost(certificateValidationRequestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#certificateValidatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateValidationRequestBody** | [**String**](String.md)| Certificate Validation Payload |

### Return type

[**Void**](.md)

### Authorization

[OAuth2SecurityReadOps](../README.md#OAuth2SecurityReadOps)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

