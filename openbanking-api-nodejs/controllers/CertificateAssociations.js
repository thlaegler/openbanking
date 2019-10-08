'use strict';

var utils = require('../utils/writer.js');
var CertificateAssociations = require('../service/CertificateAssociationsService');

module.exports.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPUT = function organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPUT (req, res, next) {
  var organisationType = req.swagger.params['OrganisationType'].value;
  var organisationId = req.swagger.params['OrganisationId'].value;
  var softwareStatementId = req.swagger.params['SoftwareStatementId'].value;
  var organisationAssociativeCertificateType = req.swagger.params['OrganisationAssociativeCertificateType'].value;
  var certificateOrKeyId = req.swagger.params['CertificateOrKeyId'].value;
  var certificateOrKeyAssociation = req.swagger.params['CertificateOrKeyAssociation'].value;
  CertificateAssociations.organisationOrganisationTypeOrganisationIdSoftware_statementSoftwareStatementIdCertificateOrganisationAssociativeCertificateTypeCertificateOrKeyIdPUT(organisationType,organisationId,softwareStatementId,organisationAssociativeCertificateType,certificateOrKeyId,certificateOrKeyAssociation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
