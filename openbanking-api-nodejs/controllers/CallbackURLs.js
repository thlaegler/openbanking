'use strict';

var utils = require('../utils/writer.js');
var CallbackURLs = require('../service/CallbackURLsService');

module.exports.callback_urlsCallbackUrlIdDELETE = function callback_urlsCallbackUrlIdDELETE (req, res, next) {
  var callbackUrlId = req.swagger.params['CallbackUrlId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  CallbackURLs.callback_urlsCallbackUrlIdDELETE(callbackUrlId,authorization,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.callback_urlsCallbackUrlIdPUT = function callback_urlsCallbackUrlIdPUT (req, res, next) {
  var callbackUrlId = req.swagger.params['CallbackUrlId'].value;
  var oBCallbackUrl1Param = req.swagger.params['OBCallbackUrl1Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  CallbackURLs.callback_urlsCallbackUrlIdPUT(callbackUrlId,oBCallbackUrl1Param,authorization,xJwsSignature,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.callback_urlsGET = function callback_urlsGET (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  CallbackURLs.callback_urlsGET(authorization,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.callback_urlsPOST = function callback_urlsPOST (req, res, next) {
  var oBCallbackUrl1Param = req.swagger.params['OBCallbackUrl1Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xJwsSignature = req.swagger.params['x-jws-signature'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  CallbackURLs.callback_urlsPOST(oBCallbackUrl1Param,authorization,xJwsSignature,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
