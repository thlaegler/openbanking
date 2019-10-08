'use strict';

var utils = require('../utils/writer.js');
var InternationalPayments = require('../service/InternationalPaymentsService');

module.exports.createInternationalPaymentConsents = function createInternationalPaymentConsents (req, res, next) {
  var oBWriteInternationalConsent3Param = req.swagger.params['OBWriteInternationalConsent3Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalPayments.createInternationalPaymentConsents(oBWriteInternationalConsent3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createInternationalPayments = function createInternationalPayments (req, res, next) {
  var oBWriteInternational2Param = req.swagger.params['OBWriteInternational2Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalPayments.createInternationalPayments(oBWriteInternational2Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalPaymentConsentsConsentId = function getInternationalPaymentConsentsConsentId (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalPayments.getInternationalPaymentConsentsConsentId(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalPaymentConsentsConsentIdFundsConfirmation = function getInternationalPaymentConsentsConsentIdFundsConfirmation (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalPayments.getInternationalPaymentConsentsConsentIdFundsConfirmation(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalPaymentsInternationalPaymentId = function getInternationalPaymentsInternationalPaymentId (req, res, next) {
  var internationalPaymentId = req.swagger.params['InternationalPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalPayments.getInternationalPaymentsInternationalPaymentId(internationalPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
