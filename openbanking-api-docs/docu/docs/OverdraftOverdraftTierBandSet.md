
# OverdraftOverdraftTierBandSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorisedIndicator** | **Boolean** | Indicates if the Overdraft is authorised (Y) or unauthorised (N) |  [optional]
**bufferAmount** | **String** | When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply. |  [optional]
**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft product. |  [optional]
**minimumArrangedOverdraftAmount** | **String** | An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it or not enough to cover the withdrawal. Some banking products require an accountholder to take an Arranged Overdraft(minimum) of at least GBP X, or else a bank will not process an Arranged Overdraft request. |  [optional]
**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the overdraft Tier Band Set details |  [optional]
**overdraftFeesCharges** | [**List&lt;OverdraftOverdraftFeesCharges&gt;**](OverdraftOverdraftFeesCharges.md) | Overdraft fees and charges details |  [optional]
**overdraftTierBand** | [**List&lt;OverdraftOverdraftTierBand&gt;**](OverdraftOverdraftTierBand.md) | Provides overdraft details for a specific tier or band | 
**overdraftType** | [**OverdraftTypeEnum**](#OverdraftTypeEnum) | An overdraft can either be committed which means that the facility cannot be withdrawn without reasonable notification before its agreed end date, or on demand which means that the financial institution can demand repayment at any point in time. |  [optional]
**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how overdraft is charged. It can be: Whole  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  Tiered Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation Banded Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation. | 


<a name="OverdraftTypeEnum"></a>
## Enum: OverdraftTypeEnum
Name | Value
---- | -----
COMMITTED | &quot;Committed&quot;
ONDEMAND | &quot;OnDemand&quot;


<a name="TierBandMethodEnum"></a>
## Enum: TierBandMethodEnum
Name | Value
---- | -----
BANDED | &quot;Banded&quot;
TIERED | &quot;Tiered&quot;
WHOLE | &quot;Whole&quot;


