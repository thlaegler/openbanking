'use strict';

var utils = require('../utils/writer.js');
var AuthorisationServers = require('../service/AuthorisationServersService');

module.exports.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdDELETE = function organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdDELETE (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var authorisationServerId = req.swagger.params['AuthorisationServerId'].value;
  AuthorisationServers.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdDELETE(organisationType,organisationId,authorisationServerId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdGET = function organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var authorisationServerId = req.swagger.params['AuthorisationServerId'].value;
  AuthorisationServers.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdGET(organisationType,organisationId,authorisationServerId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdPUT = function organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdPUT (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var authorisationServerId = req.swagger.params['AuthorisationServerId'].value;
  var authorisationServer = req.swagger.params['AuthorisationServer'].value;
  AuthorisationServers.organisationOrganisationTypeOrganisationIdAuthorisation_serverAuthorisationServerIdPUT(organisationType,organisationId,authorisationServerId,authorisationServer)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdAuthorisation_serverGET = function organisationOrganisationTypeOrganisationIdAuthorisation_serverGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  AuthorisationServers.organisationOrganisationTypeOrganisationIdAuthorisation_serverGET(organisationType,organisationId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdAuthorisation_serverPOST = function organisationOrganisationTypeOrganisationIdAuthorisation_serverPOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var authorisationServer = req.swagger.params['AuthorisationServer'].value;
  AuthorisationServers.organisationOrganisationTypeOrganisationIdAuthorisation_serverPOST(organisationType,organisationId,authorisationServer)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
