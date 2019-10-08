'use strict';

var utils = require('../utils/writer.js');
var ATM = require('../service/ATMService');

module.exports.atmsGET = function atmsGET (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  ATM.atmsGET(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.atmsHEAD = function atmsHEAD (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  ATM.atmsHEAD(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
