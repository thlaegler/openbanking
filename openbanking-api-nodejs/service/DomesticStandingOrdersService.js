'use strict';


/**
 * Create Domestic Standing Order Consents
 *
 * oBWriteDomesticStandingOrderConsent4Param OBWriteDomesticStandingOrderConsent4 Default
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xIdempotencyKey String Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteDomesticStandingOrderConsentResponse4
 **/
exports.createDomesticStandingOrderConsents = function(oBWriteDomesticStandingOrderConsent4Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "CutOffDateTime" : "2000-01-23T04:56:07.000+00:00",
    "Authorisation" : {
      "CompletionDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AuthorisationType" : "Any"
    },
    "Permission" : "Create",
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
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "RecurringPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "Reference" : "Reference",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "RecurringPaymentAmount" : { },
      "FirstPaymentAmount" : { },
      "Frequency" : "Frequency",
      "FinalPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "FirstPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberOfPayments" : "NumberOfPayments",
      "FinalPaymentDateTime" : "2000-01-23T04:56:07.000+00:00"
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
 * Create Domestic Standing Orders
 *
 * oBWriteDomesticStandingOrder3Param OBWriteDomesticStandingOrder3 Default
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xIdempotencyKey String Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. 
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteDomesticStandingOrderResponse4
 **/
exports.createDomesticStandingOrders = function(oBWriteDomesticStandingOrder3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Status" : "Cancelled",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
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
    "DomesticStandingOrderId" : "DomesticStandingOrderId",
    "ConsentId" : "ConsentId",
    "Initiation" : {
      "SupplementaryData" : { },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "RecurringPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "Reference" : "Reference",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "RecurringPaymentAmount" : { },
      "FirstPaymentAmount" : { },
      "Frequency" : "Frequency",
      "FinalPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "FirstPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberOfPayments" : "NumberOfPayments",
      "FinalPaymentDateTime" : "2000-01-23T04:56:07.000+00:00"
    },
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
 * Get Domestic Standing Order Consents
 *
 * consentId String ConsentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteDomesticStandingOrderConsentResponse4
 **/
exports.getDomesticStandingOrderConsentsConsentId = function(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "CutOffDateTime" : "2000-01-23T04:56:07.000+00:00",
    "Authorisation" : {
      "CompletionDateTime" : "2000-01-23T04:56:07.000+00:00",
      "AuthorisationType" : "Any"
    },
    "Permission" : "Create",
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
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "RecurringPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "Reference" : "Reference",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "RecurringPaymentAmount" : { },
      "FirstPaymentAmount" : { },
      "Frequency" : "Frequency",
      "FinalPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "FirstPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberOfPayments" : "NumberOfPayments",
      "FinalPaymentDateTime" : "2000-01-23T04:56:07.000+00:00"
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
 * Get Domestic Standing Orders
 *
 * domesticStandingOrderId String DomesticStandingOrderId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWriteDomesticStandingOrderResponse4
 **/
exports.getDomesticStandingOrdersDomesticStandingOrderId = function(domesticStandingOrderId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "Status" : "Cancelled",
    "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
    "CreationDateTime" : "2000-01-23T04:56:07.000+00:00",
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
    "DomesticStandingOrderId" : "DomesticStandingOrderId",
    "ConsentId" : "ConsentId",
    "Initiation" : {
      "SupplementaryData" : { },
      "DebtorAccount" : {
        "Name" : "Name"
      },
      "RecurringPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "Reference" : "Reference",
      "CreditorAccount" : {
        "SecondaryIdentification" : { },
        "Identification" : { },
        "SchemeName" : { },
        "Name" : "Name"
      },
      "RecurringPaymentAmount" : { },
      "FirstPaymentAmount" : { },
      "Frequency" : "Frequency",
      "FinalPaymentAmount" : {
        "Amount" : { },
        "Currency" : { }
      },
      "FirstPaymentDateTime" : "2000-01-23T04:56:07.000+00:00",
      "NumberOfPayments" : "NumberOfPayments",
      "FinalPaymentDateTime" : "2000-01-23T04:56:07.000+00:00"
    },
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

