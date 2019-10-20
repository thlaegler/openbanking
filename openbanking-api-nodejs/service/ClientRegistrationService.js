'use strict';


/**
 * Delete a client by way of Client ID
 *
 * clientId String The client ID
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * no response value expected for this operation
 **/
exports.registerClientIdDELETE = function(clientId,authorization) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get a client by way of Client ID
 *
 * clientId String The client ID
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * returns inline_response_201
 **/
exports.registerClientIdGET = function(clientId,authorization) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "OBRegistrationProperties1" : {
    "grant_types" : [ "client_credentials", "client_credentials" ],
    "application_type" : "web",
    "tls_client_auth_subject_dn" : "tls_client_auth_subject_dn",
    "redirect_uris" : [ "http://example.com/aeiou", "http://example.com/aeiou" ],
    "client_id" : "client_id",
    "token_endpoint_auth_method" : "private_key_jwt",
    "software_id" : "software_id",
    "software_statement" : "software_statement",
    "client_secret_expires_at" : 0,
    "scope" : "scope",
    "client_id_issued_at" : 0,
    "client_secret" : "client_secret",
    "id_token_signed_response_alg" : { },
    "response_types" : [ "code", "code" ]
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
 * Update a client by way of Client ID
 *
 * clientId String The client ID
 * authorization String An Authorisation Token as per https://tools.ietf.org/html/rfc6750
 * requestBody String A request to register a Software Statement Assertion with an ASPSP (optional)
 * returns inline_response_201
 **/
exports.registerClientIdPUT = function(clientId,authorization,requestBody) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "OBRegistrationProperties1" : {
    "grant_types" : [ "client_credentials", "client_credentials" ],
    "application_type" : "web",
    "tls_client_auth_subject_dn" : "tls_client_auth_subject_dn",
    "redirect_uris" : [ "http://example.com/aeiou", "http://example.com/aeiou" ],
    "client_id" : "client_id",
    "token_endpoint_auth_method" : "private_key_jwt",
    "software_id" : "software_id",
    "software_statement" : "software_statement",
    "client_secret_expires_at" : 0,
    "scope" : "scope",
    "client_id_issued_at" : 0,
    "client_secret" : "client_secret",
    "id_token_signed_response_alg" : { },
    "response_types" : [ "code", "code" ]
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
 * Register a client by way of a Software Statement Assertion
 * Endpoint will be secured by way of Mutual Authentication over TLS
 *
 * requestBody String A request to register a Software Statement Assertion with an ASPSP (optional)
 * returns inline_response_201
 **/
exports.registerPOST = function(requestBody) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "OBRegistrationProperties1" : {
    "grant_types" : [ "client_credentials", "client_credentials" ],
    "application_type" : "web",
    "tls_client_auth_subject_dn" : "tls_client_auth_subject_dn",
    "redirect_uris" : [ "http://example.com/aeiou", "http://example.com/aeiou" ],
    "client_id" : "client_id",
    "token_endpoint_auth_method" : "private_key_jwt",
    "software_id" : "software_id",
    "software_statement" : "software_statement",
    "client_secret_expires_at" : 0,
    "scope" : "scope",
    "client_id_issued_at" : 0,
    "client_secret" : "client_secret",
    "id_token_signed_response_alg" : { },
    "response_types" : [ "code", "code" ]
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

