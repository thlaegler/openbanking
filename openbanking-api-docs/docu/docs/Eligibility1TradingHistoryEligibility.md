
# Eligibility1TradingHistoryEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Amount indicating the min max type |  [optional]
**indicator** | **Boolean** | Any eligibility criteria where the value can be indicated by a true or false value. e.g. PreviousCCJS is True or False |  [optional]
**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Min Max type |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the TradingHistoryEligibility details |  [optional]
**otherTradingType** | [**OtherTradingType**](OtherTradingType.md) |  |  [optional]
**period** | [**PeriodEnum**](#PeriodEnum) | The unit of period (days, weeks, months etc.) |  [optional]
**textual** | **String** | Any eligibility criteria where a long description is supplied |  [optional]
**tradingType** | [**TradingTypeEnum**](#TradingTypeEnum) | Trading type eligibility for the CCC product |  [optional]


<a name="MinMaxTypeEnum"></a>
## Enum: MinMaxTypeEnum
Name | Value
---- | -----
MINIMUM | &quot;Minimum&quot;
MAXIMUM | &quot;Maximum&quot;


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


<a name="TradingTypeEnum"></a>
## Enum: TradingTypeEnum
Name | Value
---- | -----
ANNUALRETURNS | &quot;AnnualReturns&quot;
PREVIOUSCCJSALLOWED | &quot;PreviousCCJSAllowed&quot;
GOODTRADINGHISTORY | &quot;GoodTradingHistory&quot;
OTHER | &quot;Other&quot;
PREVIOUSBANKRUPTCYALLOWED | &quot;PreviousBankruptcyAllowed&quot;
TRADINGLENGTH | &quot;TradingLength&quot;
TURNOVER | &quot;Turnover&quot;



