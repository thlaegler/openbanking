'use strict';

var utils = require('../utils/writer.js');
var InternationalScheduledPayments = require('../service/InternationalScheduledPaymentsService');

module.exports.createInternationalScheduledPaymentConsents = function createInternationalScheduledPaymentConsents (req, res, next) {
  var oBWriteInternationalScheduledConsent3Param = req.swagger.params['OBWriteInternationalScheduledConsent3Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalScheduledPayments.createInternationalScheduledPaymentConsents(oBWriteInternationalScheduledConsent3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createInternationalScheduledPayments = function createInternationalScheduledPayments (req, res, next) {
  var oBWriteInternationalScheduled2Param = req.swagger.params['OBWriteInternationalScheduled2Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalScheduledPayments.createInternationalScheduledPayments(oBWriteInternationalScheduled2Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalScheduledPaymentConsentsConsentId = function getInternationalScheduledPaymentConsentsConsentId (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalScheduledPayments.getInternationalScheduledPaymentConsentsConsentId(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation = function getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalScheduledPayments.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalScheduledPaymentsInternationalScheduledPaymentId = function getInternationalScheduledPaymentsInternationalScheduledPaymentId (req, res, next) {
  var internationalScheduledPaymentId = req.swagger.params['InternationalScheduledPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  InternationalScheduledPayments.getInternationalScheduledPaymentsInternationalScheduledPaymentId(internationalScheduledPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
