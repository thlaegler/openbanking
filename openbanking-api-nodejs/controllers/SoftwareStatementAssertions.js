'use strict';

var utils = require('../utils/writer.js');
var SoftwareStatementAssertions = require('../service/SoftwareStatementAssertionsService');

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdSoftware_statement_assertionGET = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdSoftware_statement_assertionGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  SoftwareStatementAssertions.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdSoftware_statement_assertionGET(organisationType,organisationId,softwareStatementId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
