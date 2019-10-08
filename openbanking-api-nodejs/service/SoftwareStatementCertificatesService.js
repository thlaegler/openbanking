'use strict';


/**
 * Get certificates for the given software statement
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * softwareStatementId String The software statement ID
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateGET = function(organisationType,organisationId,softwareStatementId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get the certificate of the given type and ID for the given software statement
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * softwareStatementId String The software statement ID
 * organisationAssociativeCertificateType String The certificate type that can be associated with a software statement
 * certificateOrKeyId String The certificate or key Id
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGET = function(organisationType,organisationId,softwareStatementId,organisationAssociativeCertificateType,certificateOrKeyId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get the certificates of the given type for the given software statement
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * softwareStatementId String The software statement ID
 * softwareStatementCertificateOrKeyType String The certificate or key type that can be associated with a software statement
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGET = function(organisationType,organisationId,softwareStatementId,softwareStatementCertificateOrKeyType) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Add a key or create a new certificate for the given software statement
 *
 * organisationType String OB Organisation Type
 * organisationId String The organsation ID
 * softwareStatementId String The software statement ID
 * softwareStatementCertificateOrKeyType String The certificate or key type that can be associated with a software statement
 * cSROrKey CertificateOrKeyGetSchema PEM file -- the contents of the PEM file will differ depending upon *SoftwareStatementCertificateOrKeyType*. If *SoftwareStatementCertificateOrKeyType* is set to *obsigning* or *obtransport* then the PEM file should contain a Certificate Signing Request (CSR) for an OB signing or OB transport certificate respectively; if *SoftwareStatementCertificateOrKeyType* is set to *sigkey*, *enckey* then the PEM file should contain a public signing or encryption key respectively.
 * no response value expected for this operation
 **/
exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePOST = function(organisationType,organisationId,softwareStatementId,softwareStatementCertificateOrKeyType,cSROrKey) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

