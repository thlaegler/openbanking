
# OBWriteFile2DataInitiation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controlSum** | [**BigDecimal**](BigDecimal.md) | Total of all individual amounts included in the group, irrespective of currencies. |  [optional]
**debtorAccount** | [**OBWriteDomestic2DataInitiationDebtorAccount**](OBWriteDomestic2DataInitiationDebtorAccount.md) |  |  [optional]
**fileHash** | **String** | A base64 encoding of a SHA256 hash of the file to be uploaded. | 
**fileReference** | **String** | Reference for the file. |  [optional]
**fileType** | **String** | Specifies the payment file type. | 
**localInstrument** | **String** |  |  [optional]
**numberOfTransactions** | **String** | Number of individual transactions contained in the payment information group. |  [optional]
**remittanceInformation** | [**OBWriteDomestic2DataInitiationRemittanceInformation**](OBWriteDomestic2DataInitiationRemittanceInformation.md) |  |  [optional]
**requestedExecutionDateTime** | **String** | Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional]
**supplementaryData** | [**OBSupplementaryData1**](OBSupplementaryData1.md) |  |  [optional]



