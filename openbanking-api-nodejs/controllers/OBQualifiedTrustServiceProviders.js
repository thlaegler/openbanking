'use strict';

var utils = require('../utils/writer.js');
var OBQualifiedTrustServiceProviders = require('../service/OBQualifiedTrustServiceProvidersService');

module.exports.oBQualifiedTrustServiceProvidersGET = function oBQualifiedTrustServiceProvidersGET (req, res, next) {
  var attributes = req.swagger.params['attributes'].value;
  var excludedAttributes = req.swagger.params['excludedAttributes'].value;
  var filter = req.swagger.params['filter'].value;
  var sortBy = req.swagger.params['sortBy'].value;
  var sortOrder = req.swagger.params['sortOrder'].value;
  var startIndex = req.swagger.params['startIndex'].value;
  var count = req.swagger.params['count'].value;
  OBQualifiedTrustServiceProviders.oBQualifiedTrustServiceProvidersGET(attributes,excludedAttributes,filter,sortBy,sortOrder,startIndex,count)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.oBQualifiedTrustServiceProvidersIdGET = function oBQualifiedTrustServiceProvidersIdGET (req, res, next) {
  var id = req.swagger.params['id'].value;
  var attributes = req.swagger.params['attributes'].value;
  var excludedAttributes = req.swagger.params['excludedAttributes'].value;
  OBQualifiedTrustServiceProviders.oBQualifiedTrustServiceProvidersIdGET(id,attributes,excludedAttributes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.oBQualifiedTrustServiceProviders_searchPOST = function oBQualifiedTrustServiceProviders_searchPOST (req, res, next) {
  var sCIM 2.0 Search Request Message = req.swagger.params['SCIM 2.0 Search Request Message'].value;
  OBQualifiedTrustServiceProviders.oBQualifiedTrustServiceProviders_searchPOST(sCIM 2.0 Search Request Message)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
