
# OBReadBalance1DataCreditLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OBReadBalance1DataAmount1**](OBReadBalance1DataAmount1.md) |  |  [optional]
**included** | **Boolean** | Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account. | 
**type** | [**TypeEnum**](#TypeEnum) | Limit type, in a coded form. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AVAILABLE | &quot;Available&quot;
CREDIT | &quot;Credit&quot;
EMERGENCY | &quot;Emergency&quot;
PREAGREED | &quot;PreAgreed&quot;
TEMPORARY | &quot;Temporary&quot;



