'use strict';


/**
 * Get Transactions
 *
 * statementId String StatementId
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBReadTransaction5
 **/
exports.getAccountsAccountIdStatementsStatementIdTransactions = function(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Transaction" : [ {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
    }, {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
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
 * Get Transactions
 *
 * accountId String AccountId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * fromBookingDateTime Date The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * toBookingDateTime Date The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * returns OBReadTransaction5
 **/
exports.getAccountsAccountIdTransactions = function(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromBookingDateTime,toBookingDateTime) {
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
    "Transaction" : [ {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
    }, {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
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
 * Get Transactions
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * fromBookingDateTime Date The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * toBookingDateTime Date The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. (optional)
 * returns OBReadTransaction5
 **/
exports.getTransactions = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromBookingDateTime,toBookingDateTime) {
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
    "Transaction" : [ {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
    }, {
      "Status" : { },
      "SupplementaryData" : { },
      "CreditorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "DebtorAccount" : { },
      "AccountId" : { },
      "ProprietaryBankTransactionCode" : {
        "Issuer" : "Issuer",
        "Code" : "Code"
      },
      "TransactionReference" : { },
      "AddressLine" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : { }
      },
      "CreditDebitIndicator" : { },
      "CurrencyExchange" : {
        "SourceCurrency" : "SourceCurrency",
        "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
        "QuotationDate" : "2000-01-23T04:56:07.000+00:00",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency",
        "InstructedAmount" : { },
        "TargetCurrency" : "TargetCurrency"
      },
      "StatementReference" : [ { }, { } ],
      "ChargeAmount" : { },
      "TransactionId" : { },
      "TransactionInformation" : { },
      "BookingDateTime" : { },
      "BankTransactionCode" : {
        "SubCode" : "SubCode",
        "Code" : "Code"
      },
      "MerchantDetails" : {
        "MerchantName" : "MerchantName",
        "MerchantCategoryCode" : "MerchantCategoryCode"
      },
      "CardInstrument" : {
        "AuthorisationType" : "ConsumerDevice",
        "Identification" : "Identification",
        "CardSchemeName" : "AmericanExpress",
        "Name" : "Name"
      },
      "ValueDateTime" : { },
      "DebtorAgent" : {
        "PostalAddress" : {
          "CountrySubDivision" : { },
          "StreetName" : { },
          "Department" : { },
          "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
          "BuildingNumber" : { },
          "TownName" : { },
          "Country" : { },
          "SubDepartment" : { },
          "AddressType" : { },
          "PostCode" : { }
        }
      },
      "Balance" : {
        "Type" : { },
        "Amount" : { },
        "CreditDebitIndicator" : { }
      }
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

