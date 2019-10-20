# PersonalCurrentAccountsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personalCurrentAccountsGet**](PersonalCurrentAccountsApi.md#personalCurrentAccountsGet) | **GET** /personal-current-accounts | 
[**personalCurrentAccountsHead**](PersonalCurrentAccountsApi.md#personalCurrentAccountsHead) | **HEAD** /personal-current-accounts | 


<a name="personalCurrentAccountsGet"></a>
# **personalCurrentAccountsGet**
> PersonalCurrentAccountResponse personalCurrentAccountsGet(ifModifiedSince, ifNoneMatch)



Gets a list of all &#x60;Personal Current Account&#x60; objects.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.PersonalCurrentAccountsApi;

PersonalCurrentAccountsApi apiInstance = new PersonalCurrentAccountsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    PersonalCurrentAccountResponse result = apiInstance.personalCurrentAccountsGet(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalCurrentAccountsApi#personalCurrentAccountsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

[**PersonalCurrentAccountResponse**](PersonalCurrentAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="personalCurrentAccountsHead"></a>
# **personalCurrentAccountsHead**
> Object personalCurrentAccountsHead(ifModifiedSince, ifNoneMatch)



Gets header information on the current set of &#x60;Personal Current Account&#x60; data

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.PersonalCurrentAccountsApi;

PersonalCurrentAccountsApi apiInstance = new PersonalCurrentAccountsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    Object result = apiInstance.personalCurrentAccountsHead(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalCurrentAccountsApi#personalCurrentAccountsHead");
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

