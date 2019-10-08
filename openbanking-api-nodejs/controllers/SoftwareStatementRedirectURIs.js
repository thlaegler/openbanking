'use strict';

var utils = require('../utils/writer.js');
var SoftwareStatementRedirectURIs = require('../service/SoftwareStatementRedirectURIsService');

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdRedirect_uriPOST = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdRedirect_uriPOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var softwareStatementRedirectURI = req.swagger.params['SoftwareStatementRedirectURI'].value;
  SoftwareStatementRedirectURIs.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdRedirect_uriPOST(organisationType,organisationId,softwareStatementId,softwareStatementRedirectURI)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
