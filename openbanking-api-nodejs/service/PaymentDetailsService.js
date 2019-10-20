'use strict';


/**
 * Get Payment Details
 *
 * domesticPaymentId String DomesticPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getDomesticPaymentsDomesticPaymentIdPaymentDetails = function(domesticPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * domesticScheduledPaymentId String DomesticScheduledPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails = function(domesticScheduledPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * domesticStandingOrderId String DomesticStandingOrderId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails = function(domesticStandingOrderId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * filePaymentId String FilePaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getFilePaymentsFilePaymentIdPaymentDetails = function(filePaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * internationalPaymentId String InternationalPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getInternationalPaymentsInternationalPaymentIdPaymentDetails = function(internationalPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * internationalScheduledPaymentId String InternationalScheduledPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails = function(internationalScheduledPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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
 * Get Payment Details
 *
 * internationalStandingOrderPaymentId String InternationalStandingOrderPaymentId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBWritePaymentDetailsResponse1
 **/
exports.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails = function(internationalStandingOrderPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "PaymentStatus" : [ {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
      }
    }, {
      "PaymentTransactionId" : "PaymentTransactionId",
      "Status" : "Accepted",
      "StatusUpdateDateTime" : "2000-01-23T04:56:07.000+00:00",
      "StatusDetail" : {
        "Status" : "Status",
        "LocalInstrument" : { },
        "StatusReason" : "Cancelled",
        "StatusReasonDescription" : "StatusReasonDescription"
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

