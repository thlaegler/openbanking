# BranchesApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**branchesGet**](BranchesApi.md#branchesGet) | **GET** /branches | 
[**branchesHead**](BranchesApi.md#branchesHead) | **HEAD** /branches | 


<a name="branchesGet"></a>
# **branchesGet**
> BranchResponse branchesGet(ifModifiedSince, ifNoneMatch)



Gets a list of all &#x60;Branch&#x60; objects.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.BranchesApi;

BranchesApi apiInstance = new BranchesApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    BranchResponse result = apiInstance.branchesGet(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchesApi#branchesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

[**BranchResponse**](BranchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="branchesHead"></a>
# **branchesHead**
> Object branchesHead(ifModifiedSince, ifNoneMatch)



Gets header information on the current set of &#x60;Branch&#x60; data

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.BranchesApi;

BranchesApi apiInstance = new BranchesApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    Object result = apiInstance.branchesHead(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchesApi#branchesHead");
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

