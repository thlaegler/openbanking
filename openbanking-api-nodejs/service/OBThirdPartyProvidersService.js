'use strict';


/**
 * Search for one or more resources
 *
 * attributes String A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified. (optional)
 * excludedAttributes String A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified. (optional)
 * filter String The filter string used to request a subset of resources. (optional)
 * sortBy String A string indicating the attribute whose value shall be used to order the returned responses. (optional)
 * sortOrder String A string indicating the order in which the 'sortBy' parameter is applied. (optional)
 * startIndex Integer An integer indicating the 1-based index of the first query result. (optional)
 * count Integer An integer indicating the desired maximum number of query results per page. (optional)
 * returns inline_response_200_3
 **/
exports.oBThirdPartyProvidersGET = function(attributes,excludedAttributes,filter,sortBy,sortOrder,startIndex,count) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "startIndex" : 1,
  "totalResults" : 5,
  "itemsPerPage" : 6,
  "schemas" : [ "urn:ietf:params:scim:api:messages:2.0:ListResponse", "urn:ietf:params:scim:api:messages:2.0:ListResponse" ],
  "Resources" : [ {
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "externalId" : "externalId",
    "urn:openbanking:legalauthorityclaims:1.0" : {
      "LegalAuthorityClaims" : [ {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      }, {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      } ]
    },
    "id" : "id",
    "urn:openbanking:softwarestatement:1.0" : {
      "SoftwareStatements" : [ {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      }, {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      } ]
    },
    "urn:openbanking:competentauthorityclaims:1.0" : {
      "EtsiIdentifier" : "EtsiIdentifier",
      "AuthorityId" : "AuthorityId",
      "RegistrationId" : "RegistrationId",
      "MemberState" : "MemberState",
      "Authorisations" : [ {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      }, {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      } ]
    },
    "urn:openbanking:organisation:1.0" : {
      "OBAuthorisationState" : "OBAuthorisationState",
      "PhoneNumbers" : [ {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "OrganisationCommonName" : "OrganisationCommonName",
      "StatusDescription" : "StatusDescription",
      "PersonalAccountRoles" : [ {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      }, {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      } ],
      "ModifyTimestamp" : "ModifyTimestamp",
      "OBOrganisationId" : "OBOrganisationId",
      "EmailAddresses" : [ {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "PostalAddresses" : [ {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      }, {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      } ],
      "CreateTimestamp" : "CreateTimestamp",
      "status" : "status"
    }
  }, {
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "externalId" : "externalId",
    "urn:openbanking:legalauthorityclaims:1.0" : {
      "LegalAuthorityClaims" : [ {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      }, {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      } ]
    },
    "id" : "id",
    "urn:openbanking:softwarestatement:1.0" : {
      "SoftwareStatements" : [ {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      }, {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      } ]
    },
    "urn:openbanking:competentauthorityclaims:1.0" : {
      "EtsiIdentifier" : "EtsiIdentifier",
      "AuthorityId" : "AuthorityId",
      "RegistrationId" : "RegistrationId",
      "MemberState" : "MemberState",
      "Authorisations" : [ {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      }, {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      } ]
    },
    "urn:openbanking:organisation:1.0" : {
      "OBAuthorisationState" : "OBAuthorisationState",
      "PhoneNumbers" : [ {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "OrganisationCommonName" : "OrganisationCommonName",
      "StatusDescription" : "StatusDescription",
      "PersonalAccountRoles" : [ {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      }, {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      } ],
      "ModifyTimestamp" : "ModifyTimestamp",
      "OBOrganisationId" : "OBOrganisationId",
      "EmailAddresses" : [ {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "PostalAddresses" : [ {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      }, {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      } ],
      "CreateTimestamp" : "CreateTimestamp",
      "status" : "status"
    }
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve the resource
 *
 * id String The resource identifier (value of the 'id' attribute).
 * attributes String A comma separated list of strings indicating the names of resource attributes to return in the response, overriding the set of attributes that would be returned by default. 'excludedAttributes' must not also be specified if this is specified. (optional)
 * excludedAttributes String A comma separated list of strings indicating the names of resource attributes to be removed from the default set of attributes to return. 'attributes' must not also be specified if this is specified. (optional)
 * returns OBThirdPartyProviders
 **/
exports.oBThirdPartyProvidersIdGET = function(id,attributes,excludedAttributes) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "meta" : {
    "created" : "2000-01-23T04:56:07.000+00:00",
    "location" : "http://example.com/aeiou",
    "lastModified" : "2000-01-23T04:56:07.000+00:00",
    "version" : "version",
    "resourceType" : "resourceType"
  },
  "schemas" : [ "schemas", "schemas" ],
  "externalId" : "externalId",
  "urn:openbanking:legalauthorityclaims:1.0" : {
    "LegalAuthorityClaims" : [ {
      "RegisteredName" : "RegisteredName",
      "RegistrationAuthorityId" : "RegistrationAuthorityId",
      "RegisteredId" : "RegisteredId"
    }, {
      "RegisteredName" : "RegisteredName",
      "RegistrationAuthorityId" : "RegistrationAuthorityId",
      "RegisteredId" : "RegisteredId"
    } ]
  },
  "id" : "id",
  "urn:openbanking:softwarestatement:1.0" : {
    "SoftwareStatements" : [ {
      "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
      "Description" : "Description",
      "LogoUri" : "LogoUri",
      "PolicyUri" : "PolicyUri",
      "Mode" : "Mode",
      "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
      "Roles" : [ "Roles", "Roles" ],
      "TermsOfServiceUri" : "TermsOfServiceUri",
      "Active" : true,
      "ClientName" : "ClientName",
      "ClientUri" : "ClientUri",
      "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
      "Version" : 0.80082819046101150206595775671303272247314453125,
      "ClientId" : "ClientId",
      "Id" : "Id",
      "ObClientCreated" : true,
      "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
    }, {
      "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
      "Description" : "Description",
      "LogoUri" : "LogoUri",
      "PolicyUri" : "PolicyUri",
      "Mode" : "Mode",
      "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
      "Roles" : [ "Roles", "Roles" ],
      "TermsOfServiceUri" : "TermsOfServiceUri",
      "Active" : true,
      "ClientName" : "ClientName",
      "ClientUri" : "ClientUri",
      "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
      "Version" : 0.80082819046101150206595775671303272247314453125,
      "ClientId" : "ClientId",
      "Id" : "Id",
      "ObClientCreated" : true,
      "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
    } ]
  },
  "urn:openbanking:competentauthorityclaims:1.0" : {
    "EtsiIdentifier" : "EtsiIdentifier",
    "AuthorityId" : "AuthorityId",
    "RegistrationId" : "RegistrationId",
    "MemberState" : "MemberState",
    "Authorisations" : [ {
      "Psd2Role" : "Psd2Role",
      "Active" : true,
      "MemberState" : "MemberState"
    }, {
      "Psd2Role" : "Psd2Role",
      "Active" : true,
      "MemberState" : "MemberState"
    } ]
  },
  "urn:openbanking:organisation:1.0" : {
    "OBAuthorisationState" : "OBAuthorisationState",
    "PhoneNumbers" : [ {
      "Type" : "Type",
      "Verified" : true,
      "Value" : "Value",
      "Name" : "Name"
    }, {
      "Type" : "Type",
      "Verified" : true,
      "Value" : "Value",
      "Name" : "Name"
    } ],
    "OrganisationCommonName" : "OrganisationCommonName",
    "StatusDescription" : "StatusDescription",
    "PersonalAccountRoles" : [ {
      "Role" : "Role",
      "UserName" : "http://example.com/aeiou"
    }, {
      "Role" : "Role",
      "UserName" : "http://example.com/aeiou"
    } ],
    "ModifyTimestamp" : "ModifyTimestamp",
    "OBOrganisationId" : "OBOrganisationId",
    "EmailAddresses" : [ {
      "Type" : "Type",
      "Primary" : true,
      "Value" : "Value",
      "Name" : "Name"
    }, {
      "Type" : "Type",
      "Primary" : true,
      "Value" : "Value",
      "Name" : "Name"
    } ],
    "PostalAddresses" : [ {
      "POBox" : "POBox",
      "AddressLine2" : "AddressLine2",
      "StreetAddress" : "StreetAddress",
      "Type" : "Type",
      "Town" : "Town",
      "Primary" : true,
      "Country" : "Country",
      "PostCode" : "PostCode",
      "County" : "County",
      "Name" : "Name"
    }, {
      "POBox" : "POBox",
      "AddressLine2" : "AddressLine2",
      "StreetAddress" : "StreetAddress",
      "Type" : "Type",
      "Town" : "Town",
      "Primary" : true,
      "Country" : "Country",
      "PostCode" : "PostCode",
      "County" : "County",
      "Name" : "Name"
    } ],
    "CreateTimestamp" : "CreateTimestamp",
    "status" : "status"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Search for one or more resources using HTTP POST
 * Useful for executing searches without passing parameters that may contain sensitive information on the URL.
 *
 * sCIM 2.0 Search Request Message SearchRequest  (optional)
 * returns inline_response_200_3
 **/
exports.oBThirdPartyProviders_searchPOST = function(sCIM 2.0 Search Request Message) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "startIndex" : 1,
  "totalResults" : 5,
  "itemsPerPage" : 6,
  "schemas" : [ "urn:ietf:params:scim:api:messages:2.0:ListResponse", "urn:ietf:params:scim:api:messages:2.0:ListResponse" ],
  "Resources" : [ {
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "externalId" : "externalId",
    "urn:openbanking:legalauthorityclaims:1.0" : {
      "LegalAuthorityClaims" : [ {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      }, {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      } ]
    },
    "id" : "id",
    "urn:openbanking:softwarestatement:1.0" : {
      "SoftwareStatements" : [ {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      }, {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      } ]
    },
    "urn:openbanking:competentauthorityclaims:1.0" : {
      "EtsiIdentifier" : "EtsiIdentifier",
      "AuthorityId" : "AuthorityId",
      "RegistrationId" : "RegistrationId",
      "MemberState" : "MemberState",
      "Authorisations" : [ {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      }, {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      } ]
    },
    "urn:openbanking:organisation:1.0" : {
      "OBAuthorisationState" : "OBAuthorisationState",
      "PhoneNumbers" : [ {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "OrganisationCommonName" : "OrganisationCommonName",
      "StatusDescription" : "StatusDescription",
      "PersonalAccountRoles" : [ {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      }, {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      } ],
      "ModifyTimestamp" : "ModifyTimestamp",
      "OBOrganisationId" : "OBOrganisationId",
      "EmailAddresses" : [ {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "PostalAddresses" : [ {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      }, {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      } ],
      "CreateTimestamp" : "CreateTimestamp",
      "status" : "status"
    }
  }, {
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "externalId" : "externalId",
    "urn:openbanking:legalauthorityclaims:1.0" : {
      "LegalAuthorityClaims" : [ {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      }, {
        "RegisteredName" : "RegisteredName",
        "RegistrationAuthorityId" : "RegistrationAuthorityId",
        "RegisteredId" : "RegisteredId"
      } ]
    },
    "id" : "id",
    "urn:openbanking:softwarestatement:1.0" : {
      "SoftwareStatements" : [ {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      }, {
        "TransportKeyIds" : [ "TransportKeyIds", "TransportKeyIds" ],
        "Description" : "Description",
        "LogoUri" : "LogoUri",
        "PolicyUri" : "PolicyUri",
        "Mode" : "Mode",
        "RedirectUri" : [ "RedirectUri", "RedirectUri" ],
        "Roles" : [ "Roles", "Roles" ],
        "TermsOfServiceUri" : "TermsOfServiceUri",
        "Active" : true,
        "ClientName" : "ClientName",
        "ClientUri" : "ClientUri",
        "OnBehalfOfObOrganisation" : "OnBehalfOfObOrganisation",
        "Version" : 0.80082819046101150206595775671303272247314453125,
        "ClientId" : "ClientId",
        "Id" : "Id",
        "ObClientCreated" : true,
        "SigningKeyIds" : [ "SigningKeyIds", "SigningKeyIds" ]
      } ]
    },
    "urn:openbanking:competentauthorityclaims:1.0" : {
      "EtsiIdentifier" : "EtsiIdentifier",
      "AuthorityId" : "AuthorityId",
      "RegistrationId" : "RegistrationId",
      "MemberState" : "MemberState",
      "Authorisations" : [ {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      }, {
        "Psd2Role" : "Psd2Role",
        "Active" : true,
        "MemberState" : "MemberState"
      } ]
    },
    "urn:openbanking:organisation:1.0" : {
      "OBAuthorisationState" : "OBAuthorisationState",
      "PhoneNumbers" : [ {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Verified" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "OrganisationCommonName" : "OrganisationCommonName",
      "StatusDescription" : "StatusDescription",
      "PersonalAccountRoles" : [ {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      }, {
        "Role" : "Role",
        "UserName" : "http://example.com/aeiou"
      } ],
      "ModifyTimestamp" : "ModifyTimestamp",
      "OBOrganisationId" : "OBOrganisationId",
      "EmailAddresses" : [ {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      }, {
        "Type" : "Type",
        "Primary" : true,
        "Value" : "Value",
        "Name" : "Name"
      } ],
      "PostalAddresses" : [ {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      }, {
        "POBox" : "POBox",
        "AddressLine2" : "AddressLine2",
        "StreetAddress" : "StreetAddress",
        "Type" : "Type",
        "Town" : "Town",
        "Primary" : true,
        "Country" : "Country",
        "PostCode" : "PostCode",
        "County" : "County",
        "Name" : "Name"
      } ],
      "CreateTimestamp" : "CreateTimestamp",
      "status" : "status"
    }
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

