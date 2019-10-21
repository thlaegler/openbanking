# UnsecuredSmeLoansApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unsecuredSmeLoansGet**](UnsecuredSmeLoansApi.md#unsecuredSmeLoansGet) | **GET** /unsecured-sme-loans | 
[**unsecuredSmeLoansHead**](UnsecuredSmeLoansApi.md#unsecuredSmeLoansHead) | **HEAD** /unsecured-sme-loans | 


<a name="unsecuredSmeLoansGet"></a>
# **unsecuredSmeLoansGet**
> UnsecuredSMELendingResponse unsecuredSmeLoansGet(ifModifiedSince, ifNoneMatch)



Gets a list of all &#x60;Unsercured SME Lending&#x60; objects.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.UnsecuredSmeLoansApi;

UnsecuredSmeLoansApi apiInstance = new UnsecuredSmeLoansApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    UnsecuredSMELendingResponse result = apiInstance.unsecuredSmeLoansGet(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnsecuredSmeLoansApi#unsecuredSmeLoansGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

[**UnsecuredSMELendingResponse**](UnsecuredSMELendingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="unsecuredSmeLoansHead"></a>
# **unsecuredSmeLoansHead**
> Object unsecuredSmeLoansHead(ifModifiedSince, ifNoneMatch)



Gets header information on the current set of &#x60;Unsercured SME Lending&#x60; data

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.UnsecuredSmeLoansApi;

UnsecuredSmeLoansApi apiInstance = new UnsecuredSmeLoansApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    Object result = apiInstance.unsecuredSmeLoansHead(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnsecuredSmeLoansApi#unsecuredSmeLoansHead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

