'use strict';


/**
 * Create International Payment Consents
 *
 * oBWriteInternationalConsent3Param OBWriteInternationalConsent3 Default
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xIdempotencyKey String Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteInternationalConsentResponse3
 **/
exports.createInternationalPaymentConsents = function(oBWriteInternationalConsent3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
  "Risk" : {
    "DeliveryAddress" : {
      "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
      "StreetName" : { },
      "AddressLine" : [ "AddressLine", "AddressLine" ],
      "BuildingNumber" : { },
      "TownName" : { },
      "Country" : "Country",
      "PostCode" : { }
    },
    "PaymentContextCode" : "BillPayment",
    "MerchantCategoryCode" : "MerchantCategoryCode",
    "MerchantCustomerIdentification" : "MerchantCustomerIdentification"
  },
  "Data" : {
    "SCASupportData" : {
      "RequestedSCAExemptionType" : "BillPayment",
      "AppliedAuthenticationApproach" : "CA",
      "ReferencePaymentOrderId" : "ReferencePaymentOrderId"
    },
    "Status" : "Authorised",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExpectedExecutionDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CutOffDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExchangeRateInformation" : {
      "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "RateType" : "Actual",
      "ContractIdentification" : "ContractIdentification",
      "UnitCurrency" : "UnitCurrency"
    },
    "Authorisation" : {
      "CompletionDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AuthorisationType" : "Any"
    },
    "Charges" : [ {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    }, {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    } ],
    "ConsentId" : "ConsentId",
    "Initiation" : {
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
        "Identification" : "Identification",
        "SchemeName" : "SchemeName",
        "Name" : "Name"
      },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "EndToEndIdentification" : "EndToEndIdentification",
      "CurrencyOfTransfer" : "CurrencyOfTransfer",
      "InstructionIdentification" : "InstructionIdentification",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "ChargeBearer" : { },
      "Purpose" : "Purpose",
      "InstructionPriority" : "Normal",
      "LocalInstrument" : { },
      "RemittanceInformation" : {
        "Unstructured" : "Unstructured",
        "Reference" : "Reference"
      },
      "ExchangeRateInformation" : {
        "ExchangeRate" : 6.02745618307040320615897144307382404804229736328125,
        "RateType" : "Actual",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency"
      },
      "Creditor" : {
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
        "Name" : "Name"
      },
      "InstructedAmount" : { }
    },
    "ExpectedSettlementDateTime" : "2000-01-23T04:56:07.000+00:00"
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
 * Create International Payments
 *
 * oBWriteInternational2Param OBWriteInternational2 Default
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xIdempotencyKey String Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteInternationalResponse3
 **/
exports.createInternationalPayments = function(oBWriteInternational2Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Status" : "AcceptedCreditSettlementCompleted",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExpectedExecutionDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExchangeRateInformation" : {
      "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "RateType" : "Actual",
      "ContractIdentification" : "ContractIdentification",
      "UnitCurrency" : "UnitCurrency"
    },
    "Charges" : [ {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    }, {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    } ],
    "InternationalPaymentId" : "InternationalPaymentId",
    "ConsentId" : "ConsentId",
    "Initiation" : {
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
        "Identification" : "Identification",
        "SchemeName" : "SchemeName",
        "Name" : "Name"
      },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "EndToEndIdentification" : "EndToEndIdentification",
      "CurrencyOfTransfer" : "CurrencyOfTransfer",
      "InstructionIdentification" : "InstructionIdentification",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "ChargeBearer" : { },
      "Purpose" : "Purpose",
      "InstructionPriority" : "Normal",
      "LocalInstrument" : { },
      "RemittanceInformation" : {
        "Unstructured" : "Unstructured",
        "Reference" : "Reference"
      },
      "ExchangeRateInformation" : {
        "ExchangeRate" : 6.02745618307040320615897144307382404804229736328125,
        "RateType" : "Actual",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency"
      },
      "Creditor" : {
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
        "Name" : "Name"
      },
      "InstructedAmount" : { }
    },
    "ExpectedSettlementDateTime" : "2000-01-23T04:56:07.000+00:00",
    "MultiAuthorisation" : {
      "Status" : "Authorised",
      "LastUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberReceived" : 0,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberRequired" : 6
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
 * Get International Payment Consents
 *
 * consentId String ConsentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteInternationalConsentResponse3
 **/
exports.getInternationalPaymentConsentsConsentId = function(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
  "Risk" : {
    "DeliveryAddress" : {
      "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
      "StreetName" : { },
      "AddressLine" : [ "AddressLine", "AddressLine" ],
      "BuildingNumber" : { },
      "TownName" : { },
      "Country" : "Country",
      "PostCode" : { }
    },
    "PaymentContextCode" : "BillPayment",
    "MerchantCategoryCode" : "MerchantCategoryCode",
    "MerchantCustomerIdentification" : "MerchantCustomerIdentification"
  },
  "Data" : {
    "SCASupportData" : {
      "RequestedSCAExemptionType" : "BillPayment",
      "AppliedAuthenticationApproach" : "CA",
      "ReferencePaymentOrderId" : "ReferencePaymentOrderId"
    },
    "Status" : "Authorised",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExpectedExecutionDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CutOffDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExchangeRateInformation" : {
      "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "RateType" : "Actual",
      "ContractIdentification" : "ContractIdentification",
      "UnitCurrency" : "UnitCurrency"
    },
    "Authorisation" : {
      "CompletionDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AuthorisationType" : "Any"
    },
    "Charges" : [ {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    }, {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    } ],
    "ConsentId" : "ConsentId",
    "Initiation" : {
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
        "Identification" : "Identification",
        "SchemeName" : "SchemeName",
        "Name" : "Name"
      },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "EndToEndIdentification" : "EndToEndIdentification",
      "CurrencyOfTransfer" : "CurrencyOfTransfer",
      "InstructionIdentification" : "InstructionIdentification",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "ChargeBearer" : { },
      "Purpose" : "Purpose",
      "InstructionPriority" : "Normal",
      "LocalInstrument" : { },
      "RemittanceInformation" : {
        "Unstructured" : "Unstructured",
        "Reference" : "Reference"
      },
      "ExchangeRateInformation" : {
        "ExchangeRate" : 6.02745618307040320615897144307382404804229736328125,
        "RateType" : "Actual",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency"
      },
      "Creditor" : {
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
        "Name" : "Name"
      },
      "InstructedAmount" : { }
    },
    "ExpectedSettlementDateTime" : "2000-01-23T04:56:07.000+00:00"
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
 * Get International Payment Consents
 *
 * consentId String ConsentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteFundsConfirmationResponse1
 **/
exports.getInternationalPaymentConsentsConsentIdFundsConfirmation = function(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "SupplementaryData" : { },
    "FundsAvailableResult" : {
      "FundsAvailableDateTime" : "2000-01-23T04:56:07.000+00:00",
      "FundsAvailable" : true
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
 * Get International Payments
 *
 * internationalPaymentId String InternationalPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteInternationalResponse3
 **/
exports.getInternationalPaymentsInternationalPaymentId = function(internationalPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Status" : "AcceptedCreditSettlementCompleted",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExpectedExecutionDateTime" : "2000-01-23T04:56:07.000+00:00",
    "ExchangeRateInformation" : {
      "ExchangeRate" : 0.80082819046101150206595775671303272247314453125,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "RateType" : "Actual",
      "ContractIdentification" : "ContractIdentification",
      "UnitCurrency" : "UnitCurrency"
    },
    "Charges" : [ {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    }, {
      "Type" : { },
      "Amount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "ChargeBearer" : { }
    } ],
    "InternationalPaymentId" : "InternationalPaymentId",
    "ConsentId" : "ConsentId",
    "Initiation" : {
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
        "Identification" : "Identification",
        "SchemeName" : "SchemeName",
        "Name" : "Name"
      },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "EndToEndIdentification" : "EndToEndIdentification",
      "CurrencyOfTransfer" : "CurrencyOfTransfer",
      "InstructionIdentification" : "InstructionIdentification",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "ChargeBearer" : { },
      "Purpose" : "Purpose",
      "InstructionPriority" : "Normal",
      "LocalInstrument" : { },
      "RemittanceInformation" : {
        "Unstructured" : "Unstructured",
        "Reference" : "Reference"
      },
      "ExchangeRateInformation" : {
        "ExchangeRate" : 6.02745618307040320615897144307382404804229736328125,
        "RateType" : "Actual",
        "ContractIdentification" : "ContractIdentification",
        "UnitCurrency" : "UnitCurrency"
      },
      "Creditor" : {
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
        "Name" : "Name"
      },
      "InstructedAmount" : { }
    },
    "ExpectedSettlementDateTime" : "2000-01-23T04:56:07.000+00:00",
    "MultiAuthorisation" : {
      "Status" : "Authorised",
      "LastUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberReceived" : 0,
      "ExpirationDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberRequired" : 6
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

