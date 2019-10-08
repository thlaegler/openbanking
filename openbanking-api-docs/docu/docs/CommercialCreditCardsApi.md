# CommercialCreditCardsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commercialCreditCardsGet**](CommercialCreditCardsApi.md#commercialCreditCardsGet) | **GET** /commercial-credit-cards | 
[**commercialCreditCardsHead**](CommercialCreditCardsApi.md#commercialCreditCardsHead) | **HEAD** /commercial-credit-cards | 


<a name="commercialCreditCardsGet"></a>
# **commercialCreditCardsGet**
> CommercialCreditCardResponse commercialCreditCardsGet(ifModifiedSince, ifNoneMatch)



Gets a list of all &#x60;Commerical Credit Card&#x60; objects.

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CommercialCreditCardsApi;

CommercialCreditCardsApi apiInstance = new CommercialCreditCardsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    CommercialCreditCardResponse result = apiInstance.commercialCreditCardsGet(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialCreditCardsApi#commercialCreditCardsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **String**| Used for conditional request, to retrieve data only if modified since a given date | [optional]
 **ifNoneMatch** | **String**| Used for conditional request, to retrieve data only if the given Etag value does not match | [optional]

### Return type

[**CommercialCreditCardResponse**](CommercialCreditCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="commercialCreditCardsHead"></a>
# **commercialCreditCardsHead**
> Object commercialCreditCardsHead(ifModifiedSince, ifNoneMatch)



Gets header information on the current set of &#x60;Commerical Credit Card&#x60; data

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.CommercialCreditCardsApi;

CommercialCreditCardsApi apiInstance = new CommercialCreditCardsApi();
String ifModifiedSince = "ifModifiedSince_example"; // String | Used for conditional request, to retrieve data only if modified since a given date
String ifNoneMatch = "ifNoneMatch_example"; // String | Used for conditional request, to retrieve data only if the given Etag value does not match
try {
    Object result = apiInstance.commercialCreditCardsHead(ifModifiedSince, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommercialCreditCardsApi#commercialCreditCardsHead");
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

