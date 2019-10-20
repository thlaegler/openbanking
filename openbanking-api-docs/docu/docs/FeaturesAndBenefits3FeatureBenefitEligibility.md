
# FeaturesAndBenefits3FeatureBenefitEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Any eligibility criteria where an amount is required to be specified e.g. Minimum Age. |  [optional]
**description** | **String** | Full description for the eligibility criteria |  [optional]
**indicator** | **Boolean** | Any eligibility criteria where the value can be indicated by a true or false value. UKResident is True or False |  [optional]
**name** | **String** | Name provided for the eligibility criteria | 
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the eligibility conditions. |  [optional]
**otherType** | [**OtherType**](OtherType.md) |  |  [optional]
**period** | [**PeriodEnum**](#PeriodEnum) | Period for which the other eligibility criteria applies. |  [optional]
**textual** | **String** | Any eligibility criteria where a long description is supplied |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | eligibility type - method by which we group eligibilities for comparison purposes. | 


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BUSINESSONLY | &quot;BusinessOnly&quot;
CREDITSCORING | &quot;CreditScoring&quot;
EXISTINGCUSTOMERS | &quot;ExistingCustomers&quot;
IDANDV | &quot;IdAndV&quot;
MORTGAGE | &quot;Mortgage&quot;
NOARREARSONLOAN | &quot;NoArrearsOnLoan&quot;
NOCUSTOMERINARREARS | &quot;NoCustomerInArrears&quot;
NEWCUSTOMERSONLY | &quot;NewCustomersOnly&quot;
OTHER | &quot;Other&quot;
STARTUP | &quot;StartUp&quot;
TURNOVER | &quot;Turnover&quot;



