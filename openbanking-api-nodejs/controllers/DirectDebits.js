'use strict';

var utils = require('../utils/writer.js');
var DirectDebits = require('../service/DirectDebitsService');

module.exports.getAccountsAccountIdDirectDebits = function getAccountsAccountIdDirectDebits (req, res, next) {
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DirectDebits.getAccountsAccountIdDirectDebits(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDirectDebits = function getDirectDebits (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DirectDebits.getDirectDebits(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
