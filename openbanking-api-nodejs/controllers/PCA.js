'use strict';

var utils = require('../utils/writer.js');
var PCA = require('../service/PCAService');

module.exports.personal_current_accountsGET = function personal_current_accountsGET (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  PCA.personal_current_accountsGET(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.personal_current_accountsHEAD = function personal_current_accountsHEAD (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  PCA.personal_current_accountsHEAD(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
