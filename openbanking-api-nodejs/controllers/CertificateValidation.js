'use strict';

var utils = require('../utils/writer.js');
var CertificateValidation = require('../service/CertificateValidationService');

module.exports.certificateValidatePOST = function certificateValidatePOST (req, res, next) {
  var certificateValidationRequestBody = req.swagger.params['CertificateValidationRequestBody'].value;
  CertificateValidation.certificateValidatePOST(certificateValidationRequestBody)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
