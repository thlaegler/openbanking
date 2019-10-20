'use strict';

var utils = require('../utils/writer.js');
var EventSubscriptions = require('../service/EventSubscriptionsService');

module.exports.changeEventSubscriptionsEventSubscriptionId = function changeEventSubscriptionsEventSubscriptionId (req, res, next) {
  var oBEventSubscriptionResponse1Param = req.swagger.params['OBEventSubscriptionResponse1Param'].value;
  var eventSubscriptionId = req.swagger.params['EventSubscriptionId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  EventSubscriptions.changeEventSubscriptionsEventSubscriptionId(oBEventSubscriptionResponse1Param,eventSubscriptionId,authorization,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createEventSubscriptions = function createEventSubscriptions (req, res, next) {
  var oBEventSubscription1Param = req.swagger.params['OBEventSubscription1Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  EventSubscriptions.createEventSubscriptions(oBEventSubscription1Param,authorization,xJwsSignature,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteEventSubscriptionsEventSubscriptionId = function deleteEventSubscriptionsEventSubscriptionId (req, res, next) {
  var eventSubscriptionId = req.swagger.params['EventSubscriptionId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  EventSubscriptions.deleteEventSubscriptionsEventSubscriptionId(eventSubscriptionId,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getEventSubscriptions = function getEventSubscriptions (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  EventSubscriptions.getEventSubscriptions(authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
