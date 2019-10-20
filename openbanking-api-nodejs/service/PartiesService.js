'use strict';


/**
 * Get Parties
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadParty3
 **/
exports.getAccountsAccountIdParties = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Meta" : {
    "FirstAvailableDateTime" : { },
    "TotalPages" : 0
  },
  "Links" : {
    "Last" : "http://example.com/aeiou",
    "Prev" : "http://example.com/aeiou",
    "Next" : "http://example.com/aeiou",
    "First" : "http://example.com/aeiou",
    "Self" : "http://example.com/aeiou"
  },
  "Data" : {
    "Party" : [ {
      "BeneficialOwnership" : true,
      "Address" : [ {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      }, {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      } ],
      "AccountRole" : { },
      "Mobile" : { },
      "EmailAddress" : { },
      "LegalStructure" : { },
      "Name" : { },
      "PartyNumber" : { },
      "Relationships" : {
        "Account" : {
          "Related" : "http://example.com/aeiou",
          "Id" : "Id"
        }
      },
      "FullLegalName" : { },
      "PartyId" : { },
      "Phone" : { },
      "PartyType" : { }
    }, {
      "BeneficialOwnership" : true,
      "Address" : [ {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      }, {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      } ],
      "AccountRole" : { },
      "Mobile" : { },
      "EmailAddress" : { },
      "LegalStructure" : { },
      "Name" : { },
      "PartyNumber" : { },
      "Relationships" : {
        "Account" : {
          "Related" : "http://example.com/aeiou",
          "Id" : "Id"
        }
      },
      "FullLegalName" : { },
      "PartyId" : { },
      "Phone" : { },
      "PartyType" : { }
    } ]
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
 * Get Parties
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadParty2
 **/
exports.getAccountsAccountIdParty = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Meta" : {
    "FirstAvailableDateTime" : { },
    "TotalPages" : 0
  },
  "Links" : {
    "Last" : "http://example.com/aeiou",
    "Prev" : "http://example.com/aeiou",
    "Next" : "http://example.com/aeiou",
    "First" : "http://example.com/aeiou",
    "Self" : "http://example.com/aeiou"
  },
  "Data" : {
    "Party" : {
      "BeneficialOwnership" : true,
      "Address" : [ {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      }, {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      } ],
      "AccountRole" : { },
      "Mobile" : { },
      "EmailAddress" : { },
      "LegalStructure" : { },
      "Name" : { },
      "PartyNumber" : { },
      "Relationships" : {
        "Account" : {
          "Related" : "http://example.com/aeiou",
          "Id" : "Id"
        }
      },
      "FullLegalName" : { },
      "PartyId" : { },
      "Phone" : { },
      "PartyType" : { }
    }
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
 * Get Parties
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadParty2
 **/
exports.getParty = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "Meta" : {
    "FirstAvailableDateTime" : { },
    "TotalPages" : 0
  },
  "Links" : {
    "Last" : "http://example.com/aeiou",
    "Prev" : "http://example.com/aeiou",
    "Next" : "http://example.com/aeiou",
    "First" : "http://example.com/aeiou",
    "Self" : "http://example.com/aeiou"
  },
  "Data" : {
    "Party" : {
      "BeneficialOwnership" : true,
      "Address" : [ {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      }, {
        "CountrySubDivision" : { },
        "StreetName" : { },
        "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
        "BuildingNumber" : { },
        "TownName" : { },
        "Country" : { },
        "AddressType" : { },
        "PostCode" : { }
      } ],
      "AccountRole" : { },
      "Mobile" : { },
      "EmailAddress" : { },
      "LegalStructure" : { },
      "Name" : { },
      "PartyNumber" : { },
      "Relationships" : {
        "Account" : {
          "Related" : "http://example.com/aeiou",
          "Id" : "Id"
        }
      },
      "FullLegalName" : { },
      "PartyId" : { },
      "Phone" : { },
      "PartyType" : { }
    }
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

