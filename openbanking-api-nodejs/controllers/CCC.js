'use strict';

var utils = require('../utils/writer.js');
var CCC = require('../service/CCCService');

module.exports.commercial_credit_cardsGET = function commercial_credit_cardsGET (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  CCC.commercial_credit_cardsGET(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.commercial_credit_cardsHEAD = function commercial_credit_cardsHEAD (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  CCC.commercial_credit_cardsHEAD(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
