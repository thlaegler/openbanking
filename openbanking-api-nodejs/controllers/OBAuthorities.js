'use strict';

var utils = require('../utils/writer.js');
var OBAuthorities = require('../service/OBAuthoritiesService');

module.exports.oBAuthoritiesGET = function oBAuthoritiesGET (req, res, next) {
  var attributes = req.swagger.params['attributes'].value;
  var excludedAttributes = req.swagger.params['excludedAttributes'].value;
  var filter = req.swagger.params['filter'].value;
  var sortBy = req.swagger.params['sortBy'].value;
  var sortOrder = req.swagger.params['sortOrder'].value;
  var startIndex = req.swagger.params['startIndex'].value;
  var count = req.swagger.params['count'].value;
  OBAuthorities.oBAuthoritiesGET(attributes,excludedAttributes,filter,sortBy,sortOrder,startIndex,count)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.oBAuthoritiesIdGET = function oBAuthoritiesIdGET (req, res, next) {
  var id = req.swagger.params['id'].value;
  var attributes = req.swagger.params['attributes'].value;
  var excludedAttributes = req.swagger.params['excludedAttributes'].value;
  OBAuthorities.oBAuthoritiesIdGET(id,attributes,excludedAttributes)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.oBAuthorities_searchPOST = function oBAuthorities_searchPOST (req, res, next) {
  var sCIM 2.0 Search Request Message = req.swagger.params['SCIM 2.0 Search Request Message'].value;
  OBAuthorities.oBAuthorities_searchPOST(sCIM 2.0 Search Request Message)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
