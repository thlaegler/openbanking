'use strict';

var utils = require('../utils/writer.js');
var Contacts = require('../service/ContactsService');

module.exports.organisationOrganisationTypeOrganisationIdContactContactTypeGET = function organisationOrganisationTypeOrganisationIdContactContactTypeGET (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var contactType = req.swagger.params['ContactType'].value;
  Contacts.organisationOrganisationTypeOrganisationIdContactContactTypeGET(organisationType,organisationId,contactType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.organisationOrganisationTypeOrganisationIdContactContactTypePUT = function organisationOrganisationTypeOrganisationIdContactContactTypePUT (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var contactType = req.swagger.params['ContactType'].value;
  var contact = req.swagger.params['Contact'].value;
  Contacts.organisationOrganisationTypeOrganisationIdContactContactTypePUT(organisationType,organisationId,contactType,contact)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
