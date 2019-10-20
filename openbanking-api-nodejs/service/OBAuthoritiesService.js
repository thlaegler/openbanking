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
 * returns inline_response_200_1
 **/
exports.oBAuthoritiesGET = function(attributes,excludedAttributes,filter,sortBy,sortOrder,startIndex,count) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "startIndex" : 6,
  "totalResults" : 1,
  "itemsPerPage" : 0,
  "schemas" : [ "urn:ietf:params:scim:api:messages:2.0:ListResponse", "urn:ietf:params:scim:api:messages:2.0:ListResponse" ],
  "Resources" : [ {
    "AuthorityId" : "AuthorityId",
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "Country" : "Country",
    "externalId" : "externalId",
    "id" : "id",
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
    },
    "AuthorityDescription" : "AuthorityDescription"
  }, {
    "AuthorityId" : "AuthorityId",
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "Country" : "Country",
    "externalId" : "externalId",
    "id" : "id",
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
    },
    "AuthorityDescription" : "AuthorityDescription"
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
 * returns OBAuthorities
 **/
exports.oBAuthoritiesIdGET = function(id,attributes,excludedAttributes) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "AuthorityId" : "AuthorityId",
  "meta" : {
    "created" : "2000-01-23T04:56:07.000+00:00",
    "location" : "http://example.com/aeiou",
    "lastModified" : "2000-01-23T04:56:07.000+00:00",
    "version" : "version",
    "resourceType" : "resourceType"
  },
  "schemas" : [ "schemas", "schemas" ],
  "Country" : "Country",
  "externalId" : "externalId",
  "id" : "id",
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
  },
  "AuthorityDescription" : "AuthorityDescription"
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
 * returns inline_response_200_1
 **/
exports.oBAuthorities_searchPOST = function(sCIM 2.0 Search Request Message) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "startIndex" : 6,
  "totalResults" : 1,
  "itemsPerPage" : 0,
  "schemas" : [ "urn:ietf:params:scim:api:messages:2.0:ListResponse", "urn:ietf:params:scim:api:messages:2.0:ListResponse" ],
  "Resources" : [ {
    "AuthorityId" : "AuthorityId",
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "Country" : "Country",
    "externalId" : "externalId",
    "id" : "id",
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
    },
    "AuthorityDescription" : "AuthorityDescription"
  }, {
    "AuthorityId" : "AuthorityId",
    "meta" : {
      "created" : "2000-01-23T04:56:07.000+00:00",
      "location" : "http://example.com/aeiou",
      "lastModified" : "2000-01-23T04:56:07.000+00:00",
      "version" : "version",
      "resourceType" : "resourceType"
    },
    "schemas" : [ "schemas", "schemas" ],
    "Country" : "Country",
    "externalId" : "externalId",
    "id" : "id",
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
    },
    "AuthorityDescription" : "AuthorityDescription"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

