'use strict';


/**
 * Send an event notification
 *
 * oBEventNotification1Param String Create an Callback URI
 * xFapiFinancialId String The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
 * xFapiInteractionId String An RFC4122 UID used as a correlation id. (optional)
 * no response value expected for this operation
 **/
exports.createEventNotification = function(oBEventNotification1Param,xFapiFinancialId,xFapiInteractionId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

