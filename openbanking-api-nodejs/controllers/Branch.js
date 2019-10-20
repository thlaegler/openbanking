'use strict';

var utils = require('../utils/writer.js');
var Branch = require('../service/BranchService');

module.exports.branchesGET = function branchesGET (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  Branch.branchesGET(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.branchesHEAD = function branchesHEAD (req, res, next) {
  var ifModifiedSince = req.swagger.params['If-Modified-Since'].value;
  var ifNoneMatch = req.swagger.params['If-None-Match'].value;
  Branch.branchesHEAD(ifModifiedSince,ifNoneMatch)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
