'use strict';

var utils = require('../utils/writer.js');
var SoftwareStatements = require('../service/SoftwareStatementsService');

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementGET = function organisationOrganisationTypeOrganisationIdSoftware_statementGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  SoftwareStatements.organisationOrganisationTypeOrganisationIdSoftware_statementGET(organisationType,organisationId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementPOST = function organisationOrganisationTypeOrganisationIdSoftware_statementPOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatement = req.swagger.params['SoftwareStatement'].value;
  SoftwareStatements.organisationOrganisationTypeOrganisationIdSoftware_statementPOST(organisationType,organisationId,softwareStatement)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdGET = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  SoftwareStatements.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdGET(organisationType,organisationId,softwareStatementId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdPUT = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdPUT (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var softwareStatementState = req.swagger.params['SoftwareStatementState'].value;
  SoftwareStatements.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdPUT(organisationType,organisationId,softwareStatementId,softwareStatementState)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
