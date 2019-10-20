'use strict';


/**
 * Get the certificates for the given organisation
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdCertificateGET = function(organisationType,organisationId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Revoke or remove a certificate with the given CertificateOrKeyId
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * certificateOrKeyId String The certificate or key Id
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDELETE = function(organisationType,organisationId,certificateOrKeyId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Retrieve a certificate with the given CertificateOrKeyId
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * certificateOrKeyId String The certificate or key Id
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGET = function(organisationType,organisationId,certificateOrKeyId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get the certificates of the given OrganisationCertificateType for the given oranisation
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * organisationCertificateType String The certificate type
 * softwareStatementId String The software statement ID
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGET = function(organisationType,organisationId,organisationCertificateType,softwareStatementId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Store or create a new certificate of the given OrganisationCertificateType for the given organisation
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * organisationCertificateType String The certificate type
 * softwareStatementId String The software statement ID
 * certificateOrCSROrJWS CertificateOrKeyGetSchema * __PEM file__ -- when the request `Content-Type` header is set to  `application/x-pem-file` the contents of the PEM file will differ depending upon `OrganisationCertificateType`. If `OrganisationCertificateType` is set to `qwac`, `qseal` then the PEM file should contain a *QWAC* or a *QSEAL* certificate respectively; if `OrganisationCertificateType` is set to `obwac` or `obseal` then the PEM file should contain a Certificate Signing Request (CSR) for an OB-issued *OBWAC* or *OBSEAL* certificate respectively. * __Signed JWT__ -- when the request `Content-Type` header is set to `application/jwt` the body of the signed JWT will contain a CSR or a certificate.  ### Requesting a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `csr` claim is the CSR in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"csr\": \"string\" } ```  ### Uploaing a Certificate using a signed JWT  The header `kid` claim is the ID of the QSealC certificate assigned to it by the OB JWKS store.  The body `x5c` claim is the array of certificate, issuer certificate, and root certificate in the DER format.  ``` {   \"typ\": \"JWT\",   \"alg\": \"ES256\",   \"kid\": \"ABCD1234\", } {   \"x5c\": [\"qsealc\", \"issuer certificate\", \"root certificate\"] } ```  EXAMPLE REQUEST PAYLOAD USING SIGNED JWT REQUESTS  ``` POST /organisation/tpp/123456789012345678/certificate/obwac HTTP/1.1 Content-Type: application/jwt Accept: application/json Host: matls-dirapi.openbanking.org.uk eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtpZCI6IkFCQ0QxMjM0IiwieDVjIjpbInFzZWFsYyIsImlzc3VlciBjZXJ0aWZpY2F0ZSIsInJvb3QgY2VydGlmaWNhdGUiXX0.eyJyZWRpcmVjdF91cmlzIjpbInN0cmluZyJdLCJ0b2tlbl9lbmRwb2ludF9hdXRoX21ldGhvZCI6InN0cmluZyIsImdyYW50X3R5cGVzIjpbInN0cmluZyJdLCJyZXNwb25zZV90eXBlcyI6WyJzdHJpbmcibSwiY2xpZW50X25hbWUiOiJzdHJpbmciLCJjbGllbnRfdXJpIjoic3RyaW5nIiwibG9nb191cmkiOiJzdHJpbmciLCJzY29wZSI6InN0cmluZyIsImNvbnRhY3RzIjpbInVzZXJAZXhhbXBsZS5jb20iXSwidG9zX3VyaSI6InN0cmluZyIsInBvbGljeV91cmkiOiJzdHJpbmciLCJqd2tzX3VyaSI6InN0cmluZyIsImp3a3MiOnt9LCJzb2Z0d2FyZV9pZCI6InN0cmluZyIsInNvZnR3YXJlX3ZlcnNpb24iOiJzdHJpbmcifQ.lMsADSHkFGUw5PtgdEqXslYArzqf6tbg0lo0kCitOUA ``` 
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePOST = function(organisationType,organisationId,organisationCertificateType,softwareStatementId,certificateOrCSROrJWS) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

