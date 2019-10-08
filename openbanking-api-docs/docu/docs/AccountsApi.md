# AccountsApi

All URIs are relative to *https://localhost:8080/open-banking/v2.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /accounts | Get Accounts
[**getAccountsAccountId**](AccountsApi.md#getAccountsAccountId) | **GET** /accounts/{AccountId} | Get Accounts
[**getAccountsAccountIdBalances**](AccountsApi.md#getAccountsAccountIdBalances) | **GET** /accounts/{AccountId}/balances | Get Balances
[**getAccountsAccountIdBeneficiaries**](AccountsApi.md#getAccountsAccountIdBeneficiaries) | **GET** /accounts/{AccountId}/beneficiaries | Get Beneficiaries
[**getAccountsAccountIdDirectDebits**](AccountsApi.md#getAccountsAccountIdDirectDebits) | **GET** /accounts/{AccountId}/direct-debits | Get Direct Debits
[**getAccountsAccountIdOffers**](AccountsApi.md#getAccountsAccountIdOffers) | **GET** /accounts/{AccountId}/offers | Get Offers
[**getAccountsAccountIdParties**](AccountsApi.md#getAccountsAccountIdParties) | **GET** /accounts/{AccountId}/parties | Get Parties
[**getAccountsAccountIdParty**](AccountsApi.md#getAccountsAccountIdParty) | **GET** /accounts/{AccountId}/party | Get Parties
[**getAccountsAccountIdProduct**](AccountsApi.md#getAccountsAccountIdProduct) | **GET** /accounts/{AccountId}/product | Get Products
[**getAccountsAccountIdScheduledPayments**](AccountsApi.md#getAccountsAccountIdScheduledPayments) | **GET** /accounts/{AccountId}/scheduled-payments | Get Scheduled Payments
[**getAccountsAccountIdStandingOrders**](AccountsApi.md#getAccountsAccountIdStandingOrders) | **GET** /accounts/{AccountId}/standing-orders | Get Standing Orders
[**getAccountsAccountIdStatements**](AccountsApi.md#getAccountsAccountIdStatements) | **GET** /accounts/{AccountId}/statements | Get Statements
[**getAccountsAccountIdStatementsStatementId**](AccountsApi.md#getAccountsAccountIdStatementsStatementId) | **GET** /accounts/{AccountId}/statements/{StatementId} | Get Statements
[**getAccountsAccountIdStatementsStatementIdFile**](AccountsApi.md#getAccountsAccountIdStatementsStatementIdFile) | **GET** /accounts/{AccountId}/statements/{StatementId}/file | Get Statements
[**getAccountsAccountIdStatementsStatementIdTransactions**](AccountsApi.md#getAccountsAccountIdStatementsStatementIdTransactions) | **GET** /accounts/{AccountId}/statements/{StatementId}/transactions | Get Transactions
[**getAccountsAccountIdTransactions**](AccountsApi.md#getAccountsAccountIdTransactions) | **GET** /accounts/{AccountId}/transactions | Get Transactions


<a name="getAccounts"></a>
# **getAccounts**
> OBReadAccount4 getAccounts(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Accounts

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadAccount4 result = apiInstance.getAccounts(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadAccount4**](OBReadAccount4.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountId"></a>
# **getAccountsAccountId**
> OBReadAccount4 getAccountsAccountId(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Accounts

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadAccount4 result = apiInstance.getAccountsAccountId(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadAccount4**](OBReadAccount4.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdBalances"></a>
# **getAccountsAccountIdBalances**
> OBReadBalance1 getAccountsAccountIdBalances(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Balances

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadBalance1 result = apiInstance.getAccountsAccountIdBalances(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadBalance1**](OBReadBalance1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdBeneficiaries"></a>
# **getAccountsAccountIdBeneficiaries**
> OBReadBeneficiary3 getAccountsAccountIdBeneficiaries(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Beneficiaries

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadBeneficiary3 result = apiInstance.getAccountsAccountIdBeneficiaries(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdBeneficiaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadBeneficiary3**](OBReadBeneficiary3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdDirectDebits"></a>
# **getAccountsAccountIdDirectDebits**
> OBReadDirectDebit1 getAccountsAccountIdDirectDebits(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Direct Debits

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadDirectDebit1 result = apiInstance.getAccountsAccountIdDirectDebits(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdDirectDebits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadDirectDebit1**](OBReadDirectDebit1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdOffers"></a>
# **getAccountsAccountIdOffers**
> OBReadOffer1 getAccountsAccountIdOffers(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Offers

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadOffer1 result = apiInstance.getAccountsAccountIdOffers(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadOffer1**](OBReadOffer1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdParties"></a>
# **getAccountsAccountIdParties**
> OBReadParty3 getAccountsAccountIdParties(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Parties

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadParty3 result = apiInstance.getAccountsAccountIdParties(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdParties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadParty3**](OBReadParty3.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdParty"></a>
# **getAccountsAccountIdParty**
> OBReadParty2 getAccountsAccountIdParty(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Parties

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadParty2 result = apiInstance.getAccountsAccountIdParty(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdParty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadParty2**](OBReadParty2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdProduct"></a>
# **getAccountsAccountIdProduct**
> OBReadProduct2 getAccountsAccountIdProduct(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Products

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadProduct2 result = apiInstance.getAccountsAccountIdProduct(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadProduct2**](OBReadProduct2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdScheduledPayments"></a>
# **getAccountsAccountIdScheduledPayments**
> OBReadScheduledPayment2 getAccountsAccountIdScheduledPayments(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Scheduled Payments

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadScheduledPayment2 result = apiInstance.getAccountsAccountIdScheduledPayments(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdScheduledPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadScheduledPayment2**](OBReadScheduledPayment2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdStandingOrders"></a>
# **getAccountsAccountIdStandingOrders**
> OBReadStandingOrder5 getAccountsAccountIdStandingOrders(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Standing Orders

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadStandingOrder5 result = apiInstance.getAccountsAccountIdStandingOrders(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdStandingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadStandingOrder5**](OBReadStandingOrder5.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdStatements"></a>
# **getAccountsAccountIdStatements**
> OBReadStatement2 getAccountsAccountIdStatements(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromStatementDateTime, toStatementDateTime)

Get Statements

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
String fromStatementDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
String toStatementDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
try {
    OBReadStatement2 result = apiInstance.getAccountsAccountIdStatements(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromStatementDateTime, toStatementDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]
 **fromStatementDateTime** | **String**| The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]
 **toStatementDateTime** | **String**| The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdStatementsStatementId"></a>
# **getAccountsAccountIdStatementsStatementId**
> OBReadStatement2 getAccountsAccountIdStatementsStatementId(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Statements

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String statementId = "statementId_example"; // String | StatementId
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadStatement2 result = apiInstance.getAccountsAccountIdStatementsStatementId(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdStatementsStatementId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**| StatementId |
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadStatement2**](OBReadStatement2.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdStatementsStatementIdFile"></a>
# **getAccountsAccountIdStatementsStatementIdFile**
> java.io.File getAccountsAccountIdStatementsStatementIdFile(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Statements

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String statementId = "statementId_example"; // String | StatementId
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    java.io.File result = apiInstance.getAccountsAccountIdStatementsStatementIdFile(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdStatementsStatementIdFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**| StatementId |
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdStatementsStatementIdTransactions"></a>
# **getAccountsAccountIdStatementsStatementIdTransactions**
> OBReadTransaction5 getAccountsAccountIdStatementsStatementIdTransactions(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId)

Get Transactions

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String statementId = "statementId_example"; // String | StatementId
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    OBReadTransaction5 result = apiInstance.getAccountsAccountIdStatementsStatementIdTransactions(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdStatementsStatementIdTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**| StatementId |
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**OBReadTransaction5**](OBReadTransaction5.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

<a name="getAccountsAccountIdTransactions"></a>
# **getAccountsAccountIdTransactions**
> OBReadTransaction5 getAccountsAccountIdTransactions(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromBookingDateTime, toBookingDateTime)

Get Transactions

### Example
```java
// Import classes:
//import com.laegler.openbanking.api.AccountsApi;

AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | AccountId
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiAuthDate = "xFapiAuthDate_example"; // String | The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
String fromBookingDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
String toBookingDateTime = "2013-10-20T19:20:30+01:00"; // String | The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
try {
    OBReadTransaction5 result = apiInstance.getAccountsAccountIdTransactions(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromBookingDateTime, toBookingDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsAccountIdTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| AccountId |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]
 **fromBookingDateTime** | **String**| The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]
 **toBookingDateTime** | **String**| The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional]

### Return type

[**OBReadTransaction5**](OBReadTransaction5.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8, application/jose+jwe, application/jose, application/scim+json
 - **Accept**: application/prs.openbanking.opendata.v2.3+json, application/json; charset=utf-8, application/jose+jwe, application/json, application/scim+json

