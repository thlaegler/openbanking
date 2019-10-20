'use strict';

var utils = require('../utils/writer.js');
var FilePayments = require('../service/FilePaymentsService');

module.exports.createFilePaymentConsents = function createFilePaymentConsents (req, res, next) {
  var oBWriteFileConsent3Param = req.swagger.params['OBWriteFileConsent3Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.createFilePaymentConsents(oBWriteFileConsent3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createFilePaymentConsentsConsentIdFile = function createFilePaymentConsentsConsentIdFile (req, res, next) {
  var fileParam = req.swagger.params['FileParam'].value;
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.createFilePaymentConsentsConsentIdFile(fileParam,consentId,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createFilePayments = function createFilePayments (req, res, next) {
  var oBWriteFile2Param = req.swagger.params['OBWriteFile2Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.createFilePayments(oBWriteFile2Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFilePaymentConsentsConsentId = function getFilePaymentConsentsConsentId (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.getFilePaymentConsentsConsentId(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFilePaymentConsentsConsentIdFile = function getFilePaymentConsentsConsentIdFile (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.getFilePaymentConsentsConsentIdFile(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFilePaymentsFilePaymentId = function getFilePaymentsFilePaymentId (req, res, next) {
  var filePaymentId = req.swagger.params['FilePaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.getFilePaymentsFilePaymentId(filePaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFilePaymentsFilePaymentIdReportFile = function getFilePaymentsFilePaymentIdReportFile (req, res, next) {
  var filePaymentId = req.swagger.params['FilePaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  FilePayments.getFilePaymentsFilePaymentIdReportFile(filePaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
