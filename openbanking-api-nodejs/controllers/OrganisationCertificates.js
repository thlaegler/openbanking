'use strict';

var utils = require('../utils/writer.js');
var OrganisationCertificates = require('../service/OrganisationCertificatesService');

module.exports.organisationOrganisationTypeOrganisationIdCertificateGET = function organisationOrganisationTypeOrganisationIdCertificateGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  OrganisationCertificates.organisationOrganisationTypeOrganisationIdCertificateGET(organisationType,organisationId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDELETE = function organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDELETE (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var certificateOrKeyId = req.swagger.params['CertificateOrKeyId'].value;
  OrganisationCertificates.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdDELETE(organisationType,organisationId,certificateOrKeyId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGET = function organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var certificateOrKeyId = req.swagger.params['CertificateOrKeyId'].value;
  OrganisationCertificates.organisationOrganisationTypeOrganisationIdCertificateKidCertificateOrKeyIdGET(organisationType,organisationId,certificateOrKeyId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGET = function organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var organisationCertificateType = req.swagger.params['OrganisationCertificateType'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  OrganisationCertificates.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypeGET(organisationType,organisationId,organisationCertificateType,softwareStatementId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePOST = function organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var organisationCertificateType = req.swagger.params['OrganisationCertificateType'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var certificateOrCSROrJWS = req.swagger.params['CertificateOrCSROrJWS'].value;
  OrganisationCertificates.organisationOrganisationTypeOrganisationIdCertificateOrganisationCertificateTypePOST(organisationType,organisationId,organisationCertificateType,softwareStatementId,certificateOrCSROrJWS)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
