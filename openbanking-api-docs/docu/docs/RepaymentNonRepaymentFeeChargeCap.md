
# RepaymentNonRepaymentFeeChargeCap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional]
**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional]
**feeCapOccurrence** | **Float** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional]
**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped | 
**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Min Max type | 
**notes** | **List&lt;String&gt;** | Free text for adding  extra details for fee charge cap |  [optional]
**otherFeeType** | [**List&lt;BranchCurrentAccountResponseOtherFeeType&gt;**](BranchCurrentAccountResponseOtherFeeType.md) | Other fee type code which is not available in the standard code set |  [optional]


<a name="CappingPeriodEnum"></a>
## Enum: CappingPeriodEnum
Name | Value
---- | -----
DAY | &quot;Day&quot;
HALF_YEAR | &quot;Half Year&quot;
MONTH | &quot;Month&quot;
QUARTER | &quot;Quarter&quot;
WEEK | &quot;Week&quot;
YEAR | &quot;Year&quot;


<a name="List<FeeTypeEnum>"></a>
## Enum: List&lt;FeeTypeEnum&gt;
Name | Value
---- | -----
LATEPAYMENT | &quot;LatePayment&quot;
OVERCREDITLIMIT | &quot;OverCreditLimit&quot;
OTHER | &quot;Other&quot;
RETURNPAYMENT | &quot;ReturnPayment&quot;


<a name="MinMaxTypeEnum"></a>
## Enum: MinMaxTypeEnum
Name | Value
---- | -----
MINIMUM | &quot;Minimum&quot;
MAXIMUM | &quot;Maximum&quot;



