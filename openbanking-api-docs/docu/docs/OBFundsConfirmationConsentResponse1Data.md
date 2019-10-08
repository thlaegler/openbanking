
# OBFundsConfirmationConsentResponse1Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentId** | **String** | Unique identification as assigned to identify the funds confirmation consent resource. | 
**creationDateTime** | **String** | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00 | 
**debtorAccount** | [**OBFundsConfirmationConsentResponse1DataDebtorAccount**](OBFundsConfirmationConsentResponse1DataDebtorAccount.md) |  | 
**expirationDateTime** | **String** | Specified date and time the funds confirmation authorisation will expire.\\nIf this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format. \\nAll date-time fields in responses must include the timezone. An example is below:\\n2017-04-05T10:43:07+00:00 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of consent resource in code form. | 
**statusUpdateDateTime** | **String** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORISED | &quot;Authorised&quot;
AWAITINGAUTHORISATION | &quot;AwaitingAuthorisation&quot;
REJECTED | &quot;Rejected&quot;
REVOKED | &quot;Revoked&quot;



