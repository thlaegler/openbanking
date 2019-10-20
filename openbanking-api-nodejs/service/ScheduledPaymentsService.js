'use strict';


/**
 * Get Scheduled Payments
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadScheduledPayment2
 **/
exports.getAccountsAccountIdScheduledPayments = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "ScheduledPayment" : [ {
      "CreditorAgent" : {
        "Identification" : { },
        "SchemeName" : { }
      },
      "AccountId" : { },
      "Reference" : { },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : "Identification",
        "SchemeName" : { },
        "Name" : { }
      },
      "InstructedAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ScheduledPaymentDateTime" : { },
      "ScheduledPaymentId" : { },
      "ScheduledType" : { }
    }, {
      "CreditorAgent" : {
        "Identification" : { },
        "SchemeName" : { }
      },
      "AccountId" : { },
      "Reference" : { },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : "Identification",
        "SchemeName" : { },
        "Name" : { }
      },
      "InstructedAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ScheduledPaymentDateTime" : { },
      "ScheduledPaymentId" : { },
      "ScheduledType" : { }
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
 * Get Scheduled Payments
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadScheduledPayment2
 **/
exports.getScheduledPayments = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "ScheduledPayment" : [ {
      "CreditorAgent" : {
        "Identification" : { },
        "SchemeName" : { }
      },
      "AccountId" : { },
      "Reference" : { },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : "Identification",
        "SchemeName" : { },
        "Name" : { }
      },
      "InstructedAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ScheduledPaymentDateTime" : { },
      "ScheduledPaymentId" : { },
      "ScheduledType" : { }
    }, {
      "CreditorAgent" : {
        "Identification" : { },
        "SchemeName" : { }
      },
      "AccountId" : { },
      "Reference" : { },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : "Identification",
        "SchemeName" : { },
        "Name" : { }
      },
      "InstructedAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ScheduledPaymentDateTime" : { },
      "ScheduledPaymentId" : { },
      "ScheduledType" : { }
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

