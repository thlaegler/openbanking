'use strict';


/**
 * Gets a list of all `Branch` objects.
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns BranchResponse
 **/
exports.branchesGET = function(ifModifiedSince,ifNoneMatch) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "data" : [ {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "Branch" : [ {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      }, {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      } ]
    }, {
      "BrandName" : "BrandName",
      "Branch" : [ {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      }, {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      } ]
    } ]
  }, {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "Branch" : [ {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      }, {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      } ]
    }, {
      "BrandName" : "BrandName",
      "Branch" : [ {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
      }, {
        "Availability" : {
          "StandardAvailability" : {
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ]
          },
          "NonStandardAvailability" : [ {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          }, {
            "StartDate" : "2000-01-23",
            "Day" : [ {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            }, {
              "Notes" : "Notes",
              "Name" : "Friday",
              "OpeningHours" : [ {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              }, {
                "ClosingTime" : "ClosingTime",
                "OpeningTime" : "OpeningTime"
              } ]
            } ],
            "EndDate" : "2000-01-23",
            "Notes" : "Notes",
            "Name" : "Name"
          } ]
        },
        "OtherAccessibility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "CustomerSegment" : [ "Business", "Business" ],
        "Accessibility" : [ "AutomaticDoors", "AutomaticDoors" ],
        "Identification" : "Identification",
        "Photo" : "Photo",
        "SortCode" : [ "SortCode", "SortCode" ],
        "Name" : "Name",
        "OtherServiceAndFacility" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
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
        "Type" : "Mobile",
        "ServiceAndFacility" : [ "AssistedServiceCounter", "AssistedServiceCounter" ],
        "Note" : "Note",
        "SequenceNumber" : "SequenceNumber",
        "ContactInfo" : [ {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        }, {
          "ContactType" : "AlternateEmail",
          "OtherContactType" : {
            "Description" : "Description",
            "Code" : "Code",
            "Name" : "Name"
          },
          "ContactContent" : "ContactContent",
          "ContactDescription" : "ContactDescription"
        } ],
        "OtherCustomerSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ]
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
 * Gets header information on the current set of `Branch` data
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns Object
 **/
exports.branchesHEAD = function(ifModifiedSince,ifNoneMatch) {
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

