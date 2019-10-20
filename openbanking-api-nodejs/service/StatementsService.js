'use strict';


/**
 * Get Statements
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * fromStatementDateTime Date The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * toStatementDateTime Date The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * returns OBReadStatement2
 **/
exports.getAccountsAccountIdStatements = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromStatementDateTime,toStatementDateTime) {
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
    "Statement" : [ {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
    }, {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
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
 * Get Statements
 *
 * statementId String StatementId
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadStatement2
 **/
exports.getAccountsAccountIdStatementsStatementId = function(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Statement" : [ {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
    }, {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
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
 * Get Statements
 *
 * statementId String StatementId
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns File
 **/
exports.getAccountsAccountIdStatementsStatementIdFile = function(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get Statements
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * fromStatementDateTime Date The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * toStatementDateTime Date The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * returns OBReadStatement2
 **/
exports.getStatements = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromStatementDateTime,toStatementDateTime) {
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
    "Statement" : [ {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
    }, {
      "AccountId" : { },
      "StatementReference" : { },
      "StatementDateTime" : [ {
        "Type" : { },
        "DateTime" : { }
      }, {
        "Type" : { },
        "DateTime" : { }
      } ],
      "StatementInterest" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "Type" : { },
      "CreationDateTime" : { },
      "StartDateTime" : { },
      "StatementRate" : [ {
        "Type" : { },
        "Rate" : { }
      }, {
        "Type" : { },
        "Rate" : { }
      } ],
      "EndDateTime" : { },
      "StatementId" : { },
      "StatementValue" : [ {
        "Type" : { },
        "Value" : { }
      }, {
        "Type" : { },
        "Value" : { }
      } ],
      "StatementBenefit" : [ {
        "Type" : { },
        "Amount" : { }
      }, {
        "Type" : { },
        "Amount" : { }
      } ],
      "StatementFee" : [ {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      }, {
        "Type" : { },
        "Description" : { },
        "Rate" : { },
        "Amount" : { },
        "Frequency" : { },
        "RateType" : { }
      } ],
      "StatementAmount" : [ {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      }, {
        "Type" : { },
        "Amount" : {
          "Amount" : { },
          "Currency" : { }
        },
        "CreditDebitIndicator" : { }
      } ],
      "StatementDescription" : [ "StatementDescription", "StatementDescription" ]
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

