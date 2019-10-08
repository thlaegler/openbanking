
# UnsecuredSMELendingResponseRepayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountType** | [**AmountTypeEnum**](#AmountTypeEnum) | The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Repayment |  [optional]
**otherAmountType** | [**OtherAmountType**](OtherAmountType.md) |  |  [optional]
**otherRepaymentFrequency** | [**OtherRepaymentFrequency**](OtherRepaymentFrequency.md) |  |  [optional]
**otherRepaymentType** | [**OtherRepaymentType**](OtherRepaymentType.md) |  |  [optional]
**repaymentFeeCharges** | [**RepaymentFeeCharges**](RepaymentFeeCharges.md) |  |  [optional]
**repaymentFrequency** | [**RepaymentFrequencyEnum**](#RepaymentFrequencyEnum) | Repayment frequency |  [optional]
**repaymentHoliday** | [**List&lt;UnsecuredSMELendingResponseRepaymentHoliday&gt;**](UnsecuredSMELendingResponseRepaymentHoliday.md) | Details of capital repayment holiday if any |  [optional]
**repaymentType** | [**RepaymentTypeEnum**](#RepaymentTypeEnum) | Repayment type |  [optional]


<a name="AmountTypeEnum"></a>
## Enum: AmountTypeEnum
Name | Value
---- | -----
BALANCETODATE | &quot;BalanceToDate&quot;
BALLOON | &quot;Balloon&quot;
CAPITALANDINTEREST | &quot;CapitalAndInterest&quot;
FEECHARGECAP | &quot;FeeChargeCap&quot;
INTERESTONLY | &quot;InterestOnly&quot;
BULLET | &quot;Bullet&quot;
OTHER | &quot;Other&quot;


<a name="RepaymentFrequencyEnum"></a>
## Enum: RepaymentFrequencyEnum
Name | Value
---- | -----
DAILY | &quot;Daily&quot;
FLEXIBLE | &quot;Flexible&quot;
FORTNIGHTLY | &quot;Fortnightly&quot;
HALFYEARLY | &quot;HalfYearly&quot;
MONTHLY | &quot;Monthly&quot;
OTHER | &quot;Other&quot;
QUARTERLY | &quot;Quarterly&quot;
WEEKLY | &quot;Weekly&quot;
YEARLY | &quot;Yearly&quot;


<a name="RepaymentTypeEnum"></a>
## Enum: RepaymentTypeEnum
Name | Value
---- | -----
BALLOON | &quot;Balloon&quot;
BULLET | &quot;Bullet&quot;
CAPITALANDINTEREST | &quot;CapitalAndInterest&quot;
CUSTOMSCHEDULE | &quot;CustomSchedule&quot;
EARLYREPAYMENT | &quot;EarlyRepayment&quot;
FIXEDCAPITALFULLYAMORTISING | &quot;FixedCapitalFullyAmortising&quot;
FIXEDCAPITALWITHBULLET | &quot;FixedCapitalWithBullet&quot;
FIXEDCAPITALANDINTERESTREDUCINGBALANCE | &quot;FixedCapitalAndInterestReducingBalance&quot;
INTERESTONLY | &quot;InterestOnly&quot;
OTHER | &quot;Other&quot;
PREPAYMENTFEE | &quot;PrepaymentFee&quot;
REPAYMENTWITHBULLET | &quot;RepaymentWithBullet&quot;
STRAIGHTLINEINTERESTONLY | &quot;StraightLineInterestOnly&quot;



