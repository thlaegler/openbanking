'use strict';

var utils = require('../utils/writer.js');
var EventNotification = require('../service/EventNotificationService');

module.exports.createEventNotification = function createEventNotification (req, res, next) {
  var oBEventNotification1Param = req.swagger.params['OBEventNotification1Param'].value;
  var xFapiFinancialId = req.swagger.params['x-fapi-financial-id'].value;
  var xFapiInteractionId = req.swagger.params['x-fapi-interaction-id'].value;
  EventNotification.createEventNotification(oBEventNotification1Param,xFapiFinancialId,xFapiInteractionId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
