
# OBWriteInternationalScheduled2DataInitiation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chargeBearer** | [**OBChargeBearerType1Code**](OBChargeBearerType1Code.md) |  |  [optional]
**creditor** | [**OBWriteInternational2DataInitiationCreditor**](OBWriteInternational2DataInitiationCreditor.md) |  |  [optional]
**creditorAccount** | [**OBWriteDomestic2DataInitiationCreditorAccount**](OBWriteDomestic2DataInitiationCreditorAccount.md) |  | 
**creditorAgent** | [**OBWriteInternational2DataInitiationCreditorAgent**](OBWriteInternational2DataInitiationCreditorAgent.md) |  |  [optional]
**currencyOfTransfer** | **String** | Specifies the currency of the to be transferred amount, which is different from the currency of the debtor&#39;s account. | 
**debtorAccount** | [**OBWriteDomestic2DataInitiationDebtorAccount**](OBWriteDomestic2DataInitiationDebtorAccount.md) |  |  [optional]
**endToEndIdentification** | **String** | Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field. |  [optional]
**exchangeRateInformation** | [**OBWriteInternational2DataInitiationExchangeRateInformation**](OBWriteInternational2DataInitiationExchangeRateInformation.md) |  |  [optional]
**instructedAmount** | [**OBWriteDomestic2DataInitiationInstructedAmount**](OBWriteDomestic2DataInitiationInstructedAmount.md) |  | 
**instructionIdentification** | **String** | Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**instructionPriority** | [**InstructionPriorityEnum**](#InstructionPriorityEnum) | Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction. |  [optional]
**localInstrument** | **String** |  |  [optional]
**purpose** | **String** | Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org. |  [optional]
**remittanceInformation** | [**OBWriteDomestic2DataInitiationRemittanceInformation**](OBWriteDomestic2DataInitiationRemittanceInformation.md) |  |  [optional]
**requestedExecutionDateTime** | **String** | Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 | 
**supplementaryData** | [**OBSupplementaryData1**](OBSupplementaryData1.md) |  |  [optional]


<a name="InstructionPriorityEnum"></a>
## Enum: InstructionPriorityEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
URGENT | &quot;Urgent&quot;



