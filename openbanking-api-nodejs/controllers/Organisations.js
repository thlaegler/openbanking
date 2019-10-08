'use strict';

var utils = require('../utils/writer.js');
var Organisations = require('../service/OrganisationsService');

module.exports.organisationOrganisationTypeGET = function organisationOrganisationTypeGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  Organisations.organisationOrganisationTypeGET(organisationType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdGET = function organisationOrganisationTypeOrganisationIdGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  Organisations.organisationOrganisationTypeOrganisationIdGET(organisationType,organisationId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypePOST = function organisationOrganisationTypePOST (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationTypeForQSealCOnboarding = req.swagger.params['OrganisationTypeForQSealCOnboarding'].value;
  var enrol = req.swagger.params['Enrol'].value;
  Organisations.organisationOrganisationTypePOST(organisationType,organisationTypeForQSealCOnboarding,enrol)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
