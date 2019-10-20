
# Eligibility3OfficerEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxAmount** | **Integer** | Maximum amount of officers (for a particular officer type) required to the SME Loan product |  [optional]
**minAmount** | **Integer** | Minimum amount of officers (for a particular officer type) required to the SME Loan product |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the OfficerEligibility details |  [optional]
**officerType** | [**OfficerTypeEnum**](#OfficerTypeEnum) | Defines the types of officers eligible for the SME Loan product. Examples are Directors, Owners etc. |  [optional]
**otherOfficerType** | [**OtherOfficerType**](OtherOfficerType.md) |  |  [optional]


<a name="OfficerTypeEnum"></a>
## Enum: OfficerTypeEnum
Name | Value
---- | -----
DIRECTOR | &quot;Director&quot;
OWNER | &quot;Owner&quot;
OTHER | &quot;Other&quot;
PARTNER | &quot;Partner&quot;
SIGNIFICANTCONTROL | &quot;SignificantControl&quot;



