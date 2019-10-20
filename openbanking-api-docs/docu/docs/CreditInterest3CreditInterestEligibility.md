
# CreditInterest3CreditInterestEligibility

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
**type** | [**TypeEnum**](#TypeEnum) | Eligibility type - method by which we group eligibilities for comparison purposes. | 


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALFYEAR | &quot;HalfYear&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
ACADEMICTERM | &quot;AcademicTerm&quot;
YEAR | &quot;Year&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DIRECTDEBITS | &quot;DirectDebits&quot;
EXISTINGCUSTOMERS | &quot;ExistingCustomers&quot;
MINIMUMOPERATINGBALANCE | &quot;MinimumOperatingBalance&quot;
MINIMUMDEPOSIT | &quot;MinimumDeposit&quot;
NEWCUSTOMERSONLY | &quot;NewCustomersOnly&quot;
PREVIOUSBANKRUPTCYALLOWED | &quot;PreviousBankruptcyAllowed&quot;
OTHER | &quot;Other&quot;
STUDENTSONLY | &quot;StudentsOnly&quot;
SOLESTUDENTACCOUNT | &quot;SoleStudentAccount&quot;
SOLEUKACCOUNT | &quot;SoleUkAccount&quot;
SWITCHERSONLY | &quot;SwitchersOnly&quot;
UCASFULLTIMETWOYEARS | &quot;UCASFulltimeTwoYears&quot;



