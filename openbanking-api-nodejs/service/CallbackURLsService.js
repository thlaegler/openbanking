'use strict';


/**
 * Delete a callback URI
 *
 * callbackUrlId String CallbackUrlId
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * no response value expected for this operation
 **/
exports.callback_urlsCallbackUrlIdDELETE = function(callbackUrlId,authorization,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Amend a callback URI
 *
 * callbackUrlId String CallbackUrlId
 * oBCallbackUrl1Param OBCallbackUrl1 Create an Callback URI
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xJwsSignature String Header containing a detached JWS signature of the body of the payload.
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBCallbackUrlResponse1
 **/
exports.callback_urlsCallbackUrlIdPUT = function(callbackUrlId,oBCallbackUrl1Param,authorization,xJwsSignature,xFapiInteractionId) {
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
    "Version" : "Version",
    "CallbackUrlId" : "CallbackUrlId",
    "Url" : "Url"
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
 * Read all callback URLs
 *
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBCallbackUrlsResponse1
 **/
exports.callback_urlsGET = function(authorization,xFapiInteractionId) {
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
    "CallbackUrl" : [ {
      "Version" : "Version",
      "CallbackUrlId" : "CallbackUrlId",
      "Url" : "Url"
    }, {
      "Version" : "Version",
      "CallbackUrlId" : "CallbackUrlId",
      "Url" : "Url"
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
 * Create a callback URL
 *
 * oBCallbackUrl1Param OBCallbackUrl1 Create an Callback URI
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * xJwsSignature String Header containing a detached JWS signature of the body of the payload.
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * returns OBCallbackUrlResponse1
 **/
exports.callback_urlsPOST = function(oBCallbackUrl1Param,authorization,xJwsSignature,xFapiInteractionId) {
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
    "Version" : "Version",
    "CallbackUrlId" : "CallbackUrlId",
    "Url" : "Url"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

