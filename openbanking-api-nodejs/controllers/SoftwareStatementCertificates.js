'use strict';

var utils = require('../utils/writer.js');
var SoftwareStatementCertificates = require('../service/SoftwareStatementCertificatesService');

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateGET = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  SoftwareStatementCertificates.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateGET(organisationType,organisationId,softwareStatementId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGET = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var organisationAssociativeCertificateType = req.swagger.params['OrganisationAssociativeCertificateType'].value;
  var certificateOrKeyId = req.swagger.params['CertificateOrKeyId'].value;
  SoftwareStatementCertificates.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdGET(organisationType,organisationId,softwareStatementId,organisationAssociativeCertificateType,certificateOrKeyId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGET = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var softwareStatementCertificateOrKeyType = req.swagger.params['SoftwareStatementCertificateOrKeyType'].value;
  SoftwareStatementCertificates.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypeGET(organisationType,organisationId,softwareStatementId,softwareStatementCertificateOrKeyType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePOST = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var softwareStatementCertificateOrKeyType = req.swagger.params['SoftwareStatementCertificateOrKeyType'].value;
  var cSROrKey = req.swagger.params['CSROrKey'].value;
  SoftwareStatementCertificates.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateSoftwareStatementCertificateOrKeyTypePOST(organisationType,organisationId,softwareStatementId,softwareStatementCertificateOrKeyType,cSROrKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
