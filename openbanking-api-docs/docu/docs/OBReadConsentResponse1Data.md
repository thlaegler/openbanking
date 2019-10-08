
# OBReadConsentResponse1Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentId** | **String** | Unique identification as assigned to identify the account access consent resource. | 
**creationDateTime** | **String** |  | 
**expirationDateTime** | **String** | Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) |  | 
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of consent resource in code form. | 
**statusUpdateDateTime** | **String** |  | 
**transactionFromDateTime** | **String** | Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**transactionToDateTime** | **String** | Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]


<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
READACCOUNTSBASIC | &quot;ReadAccountsBasic&quot;
READACCOUNTSDETAIL | &quot;ReadAccountsDetail&quot;
READBALANCES | &quot;ReadBalances&quot;
READBENEFICIARIESBASIC | &quot;ReadBeneficiariesBasic&quot;
READBENEFICIARIESDETAIL | &quot;ReadBeneficiariesDetail&quot;
READDIRECTDEBITS | &quot;ReadDirectDebits&quot;
READOFFERS | &quot;ReadOffers&quot;
READPAN | &quot;ReadPAN&quot;
READPARTY | &quot;ReadParty&quot;
READPARTYPSU | &quot;ReadPartyPSU&quot;
READPRODUCTS | &quot;ReadProducts&quot;
READSCHEDULEDPAYMENTSBASIC | &quot;ReadScheduledPaymentsBasic&quot;
READSCHEDULEDPAYMENTSDETAIL | &quot;ReadScheduledPaymentsDetail&quot;
READSTANDINGORDERSBASIC | &quot;ReadStandingOrdersBasic&quot;
READSTANDINGORDERSDETAIL | &quot;ReadStandingOrdersDetail&quot;
READSTATEMENTSBASIC | &quot;ReadStatementsBasic&quot;
READSTATEMENTSDETAIL | &quot;ReadStatementsDetail&quot;
READTRANSACTIONSBASIC | &quot;ReadTransactionsBasic&quot;
READTRANSACTIONSCREDITS | &quot;ReadTransactionsCredits&quot;
READTRANSACTIONSDEBITS | &quot;ReadTransactionsDebits&quot;
READTRANSACTIONSDETAIL | &quot;ReadTransactionsDetail&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORISED | &quot;Authorised&quot;
AWAITINGAUTHORISATION | &quot;AwaitingAuthorisation&quot;
REJECTED | &quot;Rejected&quot;
REVOKED | &quot;Revoked&quot;



