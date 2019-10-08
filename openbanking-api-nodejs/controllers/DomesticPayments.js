'use strict';

var utils = require('../utils/writer.js');
var DomesticPayments = require('../service/DomesticPaymentsService');

module.exports.createDomesticPaymentConsents = function createDomesticPaymentConsents (req, res, next) {
  var oBWriteDomesticConsent3Param = req.swagger.params['OBWriteDomesticConsent3Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticPayments.createDomesticPaymentConsents(oBWriteDomesticConsent3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDomesticPayments = function createDomesticPayments (req, res, next) {
  var oBWriteDomestic2Param = req.swagger.params['OBWriteDomestic2Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticPayments.createDomesticPayments(oBWriteDomestic2Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticPaymentConsentsConsentId = function getDomesticPaymentConsentsConsentId (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticPayments.getDomesticPaymentConsentsConsentId(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticPaymentConsentsConsentIdFundsConfirmation = function getDomesticPaymentConsentsConsentIdFundsConfirmation (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticPayments.getDomesticPaymentConsentsConsentIdFundsConfirmation(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticPaymentsDomesticPaymentId = function getDomesticPaymentsDomesticPaymentId (req, res, next) {
  var domesticPaymentId = req.swagger.params['DomesticPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticPayments.getDomesticPaymentsDomesticPaymentId(domesticPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
