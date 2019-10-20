
# OBWriteDomesticConsent3DataSCASupportData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedAuthenticationApproach** | [**AppliedAuthenticationApproachEnum**](#AppliedAuthenticationApproachEnum) | Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP |  [optional]
**referencePaymentOrderId** | **String** | Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. |  [optional]
**requestedSCAExemptionType** | [**RequestedSCAExemptionTypeEnum**](#RequestedSCAExemptionTypeEnum) | This field allows a PISP to request specific SCA Exemption for a Payment Initiation |  [optional]


<a name="AppliedAuthenticationApproachEnum"></a>
## Enum: AppliedAuthenticationApproachEnum
Name | Value
---- | -----
CA | &quot;CA&quot;
SCA | &quot;SCA&quot;


<a name="RequestedSCAExemptionTypeEnum"></a>
## Enum: RequestedSCAExemptionTypeEnum
Name | Value
---- | -----
BILLPAYMENT | &quot;BillPayment&quot;
CONTACTLESSTRAVEL | &quot;ContactlessTravel&quot;
ECOMMERCEGOODS | &quot;EcommerceGoods&quot;
ECOMMERCESERVICES | &quot;EcommerceServices&quot;
KIOSK | &quot;Kiosk&quot;
PARKING | &quot;Parking&quot;
PARTYTOPARTY | &quot;PartyToParty&quot;



