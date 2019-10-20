'use strict';

var utils = require('../utils/writer.js');
var Transactions = require('../service/TransactionsService');

module.exports.getAccountsAccountIdStatementsStatementIdTransactions = function getAccountsAccountIdStatementsStatementIdTransactions (req, res, next) {
  var statementId = req.swagger.params['StatementId'].value;
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  Transactions.getAccountsAccountIdStatementsStatementIdTransactions(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAccountsAccountIdTransactions = function getAccountsAccountIdTransactions (req, res, next) {
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  var fromBookingDateTime = req.swagger.params['fromBookingDateTime'].value;
  var toBookingDateTime = req.swagger.params['toBookingDateTime'].value;
  Transactions.getAccountsAccountIdTransactions(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromBookingDateTime,toBookingDateTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getTransactions = function getTransactions (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  var fromBookingDateTime = req.swagger.params['fromBookingDateTime'].value;
  var toBookingDateTime = req.swagger.params['toBookingDateTime'].value;
  Transactions.getTransactions(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromBookingDateTime,toBookingDateTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
