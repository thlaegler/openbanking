'use strict';

var utils = require('../utils/writer.js');
var DomesticStandingOrders = require('../service/DomesticStandingOrdersService');

module.exports.createDomesticStandingOrderConsents = function createDomesticStandingOrderConsents (req, res, next) {
  var oBWriteDomesticStandingOrderConsent4Param = req.swagger.params['OBWriteDomesticStandingOrderConsent4Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticStandingOrders.createDomesticStandingOrderConsents(oBWriteDomesticStandingOrderConsent4Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createDomesticStandingOrders = function createDomesticStandingOrders (req, res, next) {
  var oBWriteDomesticStandingOrder3Param = req.swagger.params['OBWriteDomesticStandingOrder3Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xIdempotencyKey = req.swagger.params['x-idempotency-key'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticStandingOrders.createDomesticStandingOrders(oBWriteDomesticStandingOrder3Param,authorization,xIdempotencyKey,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticStandingOrderConsentsConsentId = function getDomesticStandingOrderConsentsConsentId (req, res, next) {
  var consentId = req.swagger.params['ConsentId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticStandingOrders.getDomesticStandingOrderConsentsConsentId(consentId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getDomesticStandingOrdersDomesticStandingOrderId = function getDomesticStandingOrdersDomesticStandingOrderId (req, res, next) {
  var domesticStandingOrderId = req.swagger.params['DomesticStandingOrderId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  DomesticStandingOrders.getDomesticStandingOrdersDomesticStandingOrderId(domesticStandingOrderId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
