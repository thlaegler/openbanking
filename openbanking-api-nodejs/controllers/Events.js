'use strict';

var utils = require('../utils/writer.js');
var Events = require('../service/EventsService');

module.exports.createEvents = function createEvents (req, res, next) {
  var oBEventPolling1Param = req.swagger.params['OBEventPolling1Param'].value;
  var authorization = req.swagger.params['Authorization'].value;
  var xFapiAuthDate = req.swagger.params['x-fapi-auth-date'].value;
  var xFapiCustomerIpAddress = req.swagger.params['x-fapi-customer-ip-address'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  Events.createEvents(oBEventPolling1Param,authorization,xFapiAuthDate,xFapiCustomerIpAddress,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
