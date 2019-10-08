
# BranchResponseContactInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactContent** | **String** | Collection of information that identifies a phone/Fax number/ email, as defined by telecom services. | 
**contactDescription** | **String** | Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email |  [optional]
**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) | Contact type such Phone, Fax and email | 
**otherContactType** | [**OtherContactType**](OtherContactType.md) |  |  [optional]


<a name="ContactTypeEnum"></a>
## Enum: ContactTypeEnum
Name | Value
---- | -----
ALTERNATEEMAIL | &quot;AlternateEmail&quot;
ALTERNATEFAX | &quot;AlternateFax&quot;
ALTERNATEPHONE | &quot;AlternatePhone&quot;
EMAIL | &quot;Email&quot;
FAX | &quot;Fax&quot;
OTHER | &quot;Other&quot;
PHONE | &quot;Phone&quot;



