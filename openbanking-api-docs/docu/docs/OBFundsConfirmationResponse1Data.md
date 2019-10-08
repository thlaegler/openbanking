
# OBFundsConfirmationResponse1Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentId** | **String** | Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource. | 
**creationDateTime** | **String** | Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**fundsAvailable** | **Boolean** | Flag to indicate the result of a confirmation of funds check. | 
**fundsConfirmationId** | **String** | Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource. | 
**instructedAmount** | [**OBFundsConfirmation1DataInstructedAmount**](OBFundsConfirmation1DataInstructedAmount.md) |  | 
**reference** | **String** | Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction. | 



