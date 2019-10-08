'use strict';

var utils = require('../utils/writer.js');
var PaymentDetails = require('../service/PaymentDetailsService');

module.exports.getDomesticPaymentsDomesticPaymentIdPaymentDetails = function getDomesticPaymentsDomesticPaymentIdPaymentDetails (req, res, next) {
  var domesticPaymentId = req.swagger.params['DomesticPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getDomesticPaymentsDomesticPaymentIdPaymentDetails(domesticPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails = function getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails (req, res, next) {
  var domesticScheduledPaymentId = req.swagger.params['DomesticScheduledPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails(domesticScheduledPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails = function getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails (req, res, next) {
  var domesticStandingOrderId = req.swagger.params['DomesticStandingOrderId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails(domesticStandingOrderId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getFilePaymentsFilePaymentIdPaymentDetails = function getFilePaymentsFilePaymentIdPaymentDetails (req, res, next) {
  var filePaymentId = req.swagger.params['FilePaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getFilePaymentsFilePaymentIdPaymentDetails(filePaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalPaymentsInternationalPaymentIdPaymentDetails = function getInternationalPaymentsInternationalPaymentIdPaymentDetails (req, res, next) {
  var internationalPaymentId = req.swagger.params['InternationalPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getInternationalPaymentsInternationalPaymentIdPaymentDetails(internationalPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails = function getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails (req, res, next) {
  var internationalScheduledPaymentId = req.swagger.params['InternationalScheduledPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails(internationalScheduledPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails = function getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails (req, res, next) {
  var internationalStandingOrderPaymentId = req.swagger.params['InternationalStandingOrderPaymentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  PaymentDetails.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails(internationalStandingOrderPaymentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
