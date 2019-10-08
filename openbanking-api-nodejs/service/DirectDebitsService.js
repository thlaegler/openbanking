'use strict';


/**
 * Get Direct Debits
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadDirectDebit1
 **/
exports.getAccountsAccountIdDirectDebits = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "DirectDebit" : [ {
      "PreviousPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AccountId" : { },
      "MandateIdentification" : "MandateIdentification",
      "DirectDebitStatusCode" : "Active",
      "DirectDebitId" : "DirectDebitId",
      "PreviousPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "Name" : "Name"
    }, {
      "PreviousPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AccountId" : { },
      "MandateIdentification" : "MandateIdentification",
      "DirectDebitStatusCode" : "Active",
      "DirectDebitId" : "DirectDebitId",
      "PreviousPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "Name" : "Name"
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
 * Get Direct Debits
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadDirectDebit1
 **/
exports.getDirectDebits = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "DirectDebit" : [ {
      "PreviousPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AccountId" : { },
      "MandateIdentification" : "MandateIdentification",
      "DirectDebitStatusCode" : "Active",
      "DirectDebitId" : "DirectDebitId",
      "PreviousPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "Name" : "Name"
    }, {
      "PreviousPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AccountId" : { },
      "MandateIdentification" : "MandateIdentification",
      "DirectDebitStatusCode" : "Active",
      "DirectDebitId" : "DirectDebitId",
      "PreviousPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "Name" : "Name"
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

