'use strict';


/**
 * Gets a list of all `ATM` objects.
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns ATMResponse
 **/
exports.atmsGET = function(ifModifiedSince,ifNoneMatch) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "data" : [ {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "ATM" : [ {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      }, {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      } ]
    }, {
      "BrandName" : "BrandName",
      "ATM" : [ {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      }, {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      } ]
    } ]
  }, {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "ATM" : [ {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      }, {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      } ]
    }, {
      "BrandName" : "BrandName",
      "ATM" : [ {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      }, {
        "SupportedLanguages" : [ "SupportedLanguages", "SupportedLanguages" ],
        "MinimumPossibleAmount" : "MinimumPossibleAmount",
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "SupportedCurrencies" : [ "SupportedCurrencies", "SupportedCurrencies" ],
        "Accessibility" : [ "AudioCashMachine", "AudioCashMachine" ],
        "Branch" : {
          "Identification" : "Identification"
        },
        "ATMServices" : [ "Balance", "Balance" ],
        "Note" : [ "Note", "Note" ],
        "Identification" : "Identification",
        "Access24HoursIndicator" : true,
        "OtherATMServices" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Location" : {
          "PostalAddress" : {
            "CountrySubDivision" : [ "CountrySubDivision", "CountrySubDivision" ],
            "StreetName" : "StreetName",
            "AddressLine" : [ "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine", "AddressLine" ],
            "BuildingNumber" : "BuildingNumber",
            "TownName" : "TownName",
            "Country" : "Country",
            "GeoLocation" : {
              "GeographicCoordinates" : {
                "Latitude" : "Latitude",
                "Longitude" : "Longitude"
              }
            },
            "PostCode" : "PostCode"
          },
          "Site" : {
            "Identification" : "Identification",
            "Name" : "Name"
          },
          "LocationCategory" : [ "BranchExternal", "BranchExternal" ],
          "OtherLocationCategory" : [ {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          }, {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          } ]
        }
      } ]
    } ]
  } ],
  "meta" : {
    "Agreement" : "Use of the APIs and any related data will be subject to the terms of the Open Licence and subject to terms and conditions",
    "TermsOfUse" : "https://www.openbanking.org.uk/terms",
    "License" : "https://www.openbanking.org.uk/open-licence",
    "TotalResults" : 0,
    "LastUpdated" : "2000-01-23T04:56:07.000+00:00"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Gets header information on the current set of `ATM` data
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns Object
 **/
exports.atmsHEAD = function(ifModifiedSince,ifNoneMatch) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "{}";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

