'use strict';

var utils = require('../utils/writer.js');
var BCA = require('../service/BCAService');

module.exports.business_current_accountsGET = function business_current_accountsGET (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  BCA.business_current_accountsGET(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.business_current_accountsHEAD = function business_current_accountsHEAD (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  BCA.business_current_accountsHEAD(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
