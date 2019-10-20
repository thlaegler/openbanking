'use strict';

var utils = require('../utils/writer.js');
var ClientRegistration = require('../service/ClientRegistrationService');

module.exports.registerClientIdDELETE = function registerClientIdDELETE (req, res, next) {
  var clientId = req.swagger.params['ClientId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  ClientRegistration.registerClientIdDELETE(clientId,authorization)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.registerClientIdGET = function registerClientIdGET (req, res, next) {
  var clientId = req.swagger.params['ClientId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  ClientRegistration.registerClientIdGET(clientId,authorization)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.registerClientIdPUT = function registerClientIdPUT (req, res, next) {
  var clientId = req.swagger.params['ClientId'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var requestBody = req.swagger.params['requestBody'].value;
  ClientRegistration.registerClientIdPUT(clientId,authorization,requestBody)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.registerPOST = function registerPOST (req, res, next) {
  var requestBody = req.swagger.params['requestBody'].value;
  ClientRegistration.registerPOST(requestBody)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
