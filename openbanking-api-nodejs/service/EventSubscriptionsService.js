'use strict';


/**
 * Change Event Subscription
 *
 * oBEventSubscriptionResponse1Param OBEventSubscriptionResponse1 Default
 * eventSubscriptionId String EventSubscriptionId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBEventSubscriptionResponse1
 **/
exports.changeEventSubscriptionsEventSubscriptionId = function(oBEventSubscriptionResponse1Param,eventSubscriptionId,authorization,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "CallbackUrl" : "http://example.com/aeiou",
    "Version" : { },
    "EventSubscriptionId" : "EventSubscriptionId",
    "EventTypes" : [ "EventTypes", "EventTypes" ]
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
 * Create Event Subscription
 *
 * oBEventSubscription1Param OBEventSubscription1 Default
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xJwsSignature String A detached JWS signature of the body of the payload.
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBEventSubscriptionResponse1
 **/
exports.createEventSubscriptions = function(oBEventSubscription1Param,authorization,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "CallbackUrl" : "http://example.com/aeiou",
    "Version" : { },
    "EventSubscriptionId" : "EventSubscriptionId",
    "EventTypes" : [ "EventTypes", "EventTypes" ]
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
 * Delete Event Subscription
 *
 * eventSubscriptionId String EventSubscriptionId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * no response value expected for this operation
 **/
exports.deleteEventSubscriptionsEventSubscriptionId = function(eventSubscriptionId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get Event Subscription
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiAuthDate String The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
 * xFapiCustomerIpAddress String The PSU's IP address if the PSU is currently logged in with the TPP. (optional)
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBEventSubscriptionsResponse1
 **/
exports.getEventSubscriptions = function(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId) {
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
    "EventSubscription" : [ {
      "CallbackUrl" : "http://example.com/aeiou",
      "Version" : { },
      "EventSubscriptionId" : "EventSubscriptionId",
      "EventTypes" : [ "EventTypes", "EventTypes" ]
    }, {
      "CallbackUrl" : "http://example.com/aeiou",
      "Version" : { },
      "EventSubscriptionId" : "EventSubscriptionId",
      "EventTypes" : [ "EventTypes", "EventTypes" ]
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

