'use strict';

var utils = require('../utils/writer.js');
var Statements = require('../service/StatementsService');

module.exports.getAccountsAccountIdStatements = function getAccountsAccountIdStatements (req, res, next) {
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  var fromStatementDateTime = req.swagger.params['fromStatementDateTime'].value;
  var toStatementDateTime = req.swagger.params['toStatementDateTime'].value;
  Statements.getAccountsAccountIdStatements(accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromStatementDateTime,toStatementDateTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAccountsAccountIdStatementsStatementId = function getAccountsAccountIdStatementsStatementId (req, res, next) {
  var statementId = req.swagger.params['StatementId'].value;
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  Statements.getAccountsAccountIdStatementsStatementId(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAccountsAccountIdStatementsStatementIdFile = function getAccountsAccountIdStatementsStatementIdFile (req, res, next) {
  var statementId = req.swagger.params['StatementId'].value;
  var accountId = req.swagger.params['AccountId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  Statements.getAccountsAccountIdStatementsStatementIdFile(statementId,accountId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getStatements = function getStatements (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  var fromStatementDateTime = req.swagger.params['fromStatementDateTime'].value;
  var toStatementDateTime = req.swagger.params['toStatementDateTime'].value;
  Statements.getStatements(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId,fromStatementDateTime,toStatementDateTime)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
