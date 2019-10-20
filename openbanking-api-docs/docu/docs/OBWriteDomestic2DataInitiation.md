
# OBWriteDomestic2DataInitiation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creditorAccount** | [**OBWriteDomestic2DataInitiationCreditorAccount**](OBWriteDomestic2DataInitiationCreditorAccount.md) |  | 
**creditorPostalAddress** | [**OBPostalAddress6**](OBPostalAddress6.md) |  |  [optional]
**debtorAccount** | [**OBWriteDomestic2DataInitiationDebtorAccount**](OBWriteDomestic2DataInitiationDebtorAccount.md) |  |  [optional]
**endToEndIdentification** | **String** | Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field. | 
**instructedAmount** | [**OBWriteDomestic2DataInitiationInstructedAmount**](OBWriteDomestic2DataInitiationInstructedAmount.md) |  | 
**instructionIdentification** | **String** | Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction. | 
**localInstrument** | **String** |  |  [optional]
**remittanceInformation** | [**OBWriteDomestic2DataInitiationRemittanceInformation**](OBWriteDomestic2DataInitiationRemittanceInformation.md) |  |  [optional]
**supplementaryData** | [**OBSupplementaryData1**](OBSupplementaryData1.md) |  |  [optional]



