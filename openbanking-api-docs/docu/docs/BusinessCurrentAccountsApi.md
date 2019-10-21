# BusinessCurrentAccountsApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessCurrentAccountsGet**](BusinessCurrentAccountsApi.md#businessCurrentAccountsGet) | **GET** /business-current-accounts | 
[**businessCurrentAccountsHead**](BusinessCurrentAccountsApi.md#businessCurrentAccountsHead) | **HEAD** /business-current-accounts | 


<a name="businessCurrentAccountsGet"></a>
# **businessCurrentAccountsGet**
> BranchCurrentAccountResponse businessCurrentAccountsGet(ifModifiedSince, ifNoneMatch)



Gets a list of all &#x60;Branch Current Account&#x60; objects.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.BusinessCurrentAccountsApi;

BusinessCurrentAccountsApi apiInstance = new BusinessCurrentAccountsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    BranchCurrentAccountResponse result = apiInstance.businessCurrentAccountsGet(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessCurrentAccountsApi#businessCurrentAccountsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

[**BranchCurrentAccountResponse**](BranchCurrentAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="businessCurrentAccountsHead"></a>
# **businessCurrentAccountsHead**
> Object businessCurrentAccountsHead(ifModifiedSince, ifNoneMatch)



Gets header information on the current set of &#x60;Business Current Account&#x60; data

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.BusinessCurrentAccountsApi;

BusinessCurrentAccountsApi apiInstance = new BusinessCurrentAccountsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    Object result = apiInstance.businessCurrentAccountsHead(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessCurrentAccountsApi#businessCurrentAccountsHead");
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

