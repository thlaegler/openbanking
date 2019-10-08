
# OBWriteInternationalConsentResponse3Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorisation** | [**OBWriteDomesticConsent3DataAuthorisation**](OBWriteDomesticConsent3DataAuthorisation.md) |  |  [optional]
**charges** | [**List&lt;OBWriteDomesticConsentResponse3DataCharges&gt;**](OBWriteDomesticConsentResponse3DataCharges.md) |  |  [optional]
**consentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource. | 
**creationDateTime** | **String** | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**cutOffDateTime** | **String** | Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**exchangeRateInformation** | [**OBWriteInternationalConsentResponse3DataExchangeRateInformation**](OBWriteInternationalConsentResponse3DataExchangeRateInformation.md) |  |  [optional]
**expectedExecutionDateTime** | **String** | Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**expectedSettlementDateTime** | **String** | Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**initiation** | [**OBWriteInternational2DataInitiation**](OBWriteInternational2DataInitiation.md) |  | 
**scASupportData** | [**OBWriteDomesticConsent3DataSCASupportData**](OBWriteDomesticConsent3DataSCASupportData.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of consent resource in code form. | 
**statusUpdateDateTime** | **String** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORISED | &quot;Authorised&quot;
AWAITINGAUTHORISATION | &quot;AwaitingAuthorisation&quot;
CONSUMED | &quot;Consumed&quot;
REJECTED | &quot;Rejected&quot;



