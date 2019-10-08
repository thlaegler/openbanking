'use strict';


/**
 * Get all organisations that the client is authorised to retrieve
 * Note that this was not in the original design but is included to inform the client
 *
 * organisationType String OB Organisation Type
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeGET = function(organisationType) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get the given organisation's details
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdGET = function(organisationType,organisationId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Enrol a eIDAS QWAC/QSealC-bearing participant
 * Enrol an eIDAS QWAC/QSealC certificate-bearing participant onto the Open Banking Directory. Currenty only TPPs can use this enrolment endpoint, so please set `OrganisationType` to `tpp`
 *
 * organisationType String OB Organisation Type
 * organisationTypeForQSealCOnboarding String OB Organisation Type
 * enrol EnrolSchema The payload submitted when a TPP attempts to enrol with an eIDAS QWAC or QSealC certificate. It's format and contents will depend on the value of the `Content-Type` header:  TPP onto the Open Banking Directory (required fields to be validated). For eIDAS QSealC-bearing TPPs use a signed JWT (JWS).  * __application/json__ -- a JSON payload for QWAC onboarding. * __application/jwt__ -- a signed JWT (JWS) for QSealC onboarding. * __application/jose__ -- same as __application/jwt__.  ## QWAC-based Onboarding  Set `Content-Type` to `application/json` and send the payload conforming to the schema.  EXAMPLE REQUEST PAYLOAD FOR QWAC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/json Accept: application/json Host: matls-dirapi.openbanking.org.uk {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  ## QSealC-based Onboarding  Set `Content-Type` to `application/jwt` or `application/jose` and send the payload conforming to the schema as a signed JWT.  The QSealC, the issuing certificate, and the root certificate (all in DER format) must be used as the items of the array, which forms the value of the `x5c` claim in the JWT header.  The JWT MUST be signed using the private key associated with the QSealC listed in the `x5c` claim in the header.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\",   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } {   \"client_name\": \"string\",   \"scope\": \"string\",   \"token_endpoint_auth_method\": \"string\",   \"tls_client_auth_subject_dn\": \"string\",   \"grant_types\": [     \"string\"   ],   \"token_endpoint_auth_signing_alg\": \"string\" } ```  EXAMPLE REQUEST PAYLOAD FOR QSealC-BASED ONBOARDING  ``` POST /organisation/tpp HTTP/1.1 Content-Type: application/jwt | application/jose Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmciXSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` 
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypePOST = function(organisationType,organisationTypeForQSealCOnboarding,enrol) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

