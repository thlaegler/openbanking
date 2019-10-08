'use strict';


/**
 * Gets a list of all `Commerical Credit Card` objects.
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns CommercialCreditCardResponse
 **/
exports.commercial_credit_cardsGET = function(ifModifiedSince,ifNoneMatch) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "data" : [ {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "CCC" : [ {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      }, {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      } ]
    }, {
      "BrandName" : "BrandName",
      "CCC" : [ {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      }, {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      } ]
    } ]
  }, {
    "Brand" : [ {
      "BrandName" : "BrandName",
      "CCC" : [ {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      }, {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      } ]
    }, {
      "BrandName" : "BrandName",
      "CCC" : [ {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
      }, {
        "CCCMarketingState" : [ {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        }, {
          "StateTenurePeriod" : "Day",
          "FeaturesAndBenefits" : {
            "FeatureBenefitItem" : [ {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Identification" : "Identification",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "FeatureBenefitGroup" : [ {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            }, {
              "Type" : "AccountManagement",
              "ApplicationFrequency" : "Daily",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeatureBenefitItem" : [ {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AccountManagement",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Identification" : "Identification",
                "FeatureBenefitEligibility" : [ {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                }, {
                  "Type" : "AnyBusinessCustomer",
                  "Description" : "Description",
                  "Textual" : "Textual",
                  "Amount" : "Amount",
                  "Period" : "Day",
                  "OtherType" : {
                    "Description" : "Description",
                    "Code" : "Code",
                    "Name" : "Name"
                  },
                  "Indicator" : true,
                  "Notes" : [ "Notes", "Notes" ],
                  "Name" : "Name"
                } ],
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "CalculationFrequency" : "Daily",
              "Fee" : "Fee",
              "BenefitGroupNominalValue" : "BenefitGroupNominalValue",
              "FeatureBenefitEligibility" : [ {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              }, {
                "Type" : "AnyBusinessCustomer",
                "Description" : "Description",
                "Textual" : "Textual",
                "Amount" : "Amount",
                "Period" : "Day",
                "OtherType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "Indicator" : true,
                "Notes" : [ "Notes", "Notes" ],
                "Name" : "Name"
              } ],
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Name" : "Name"
            } ]
          },
          "Eligibility" : {
            "AgeEligibility" : {
              "MinimumAge" : 1.4658129,
              "MaximumAge" : 6.0274563,
              "Notes" : [ "Notes", "Notes" ]
            },
            "LegalStructureEligibility" : [ {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            }, {
              "OtherLegalStructure" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "LegalStructure" : "CIO"
            } ],
            "CreditCheckEligibility" : {
              "ScoringType" : "Hard",
              "Notes" : [ "Notes", "Notes" ]
            },
            "IndustryEligibility" : {
              "OtherSICCodeIncluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeIncluded" : [ "SICCodeIncluded", "SICCodeIncluded" ],
              "OtherSICCodeExcluded" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "SICCodeExcluded" : [ "SICCodeExcluded", "SICCodeExcluded" ],
              "Notes" : [ "Notes", "Notes" ]
            },
            "OfficerEligibility" : [ {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "OfficerType" : "Director",
              "MinAmount" : 5,
              "OtherOfficerType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "MaxAmount" : 5,
              "Notes" : [ "Notes", "Notes" ]
            } ],
            "IDEligibility" : {
              "Notes" : [ "Notes", "Notes" ],
              "URL" : "URL"
            },
            "OtherEligibility" : [ {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            }, {
              "Type" : "AnyBusinessCustomer",
              "Description" : "Description",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Daily",
              "OtherType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "Notes" : [ "Notes", "Notes" ],
              "Name" : "Name"
            } ],
            "ResidencyEligibility" : [ {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            }, {
              "ResidencyIncluded" : [ "ResidencyIncluded", "ResidencyIncluded" ],
              "OtherResidencyType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Notes" : [ "Notes", "Notes" ],
              "ResidencyType" : "Incorporated"
            } ],
            "TradingHistoryEligibility" : [ {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            }, {
              "TradingType" : "AnnualReturns",
              "Textual" : "Textual",
              "Amount" : "Amount",
              "Period" : "Day",
              "OtherTradingType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "Indicator" : true,
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ]
            } ]
          },
          "PredecessorID" : "PredecessorID",
          "LastMarketedDate" : "2000-01-23",
          "OtherFeesCharges" : {
            "FeeChargeCap" : [ {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            }, {
              "CappingPeriod" : "Day",
              "OtherFeeType" : [ {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              }, {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              } ],
              "FeeCapOccurrence" : 2.302136,
              "FeeType" : [ "AdditionalCard", "AdditionalCard" ],
              "MinMaxType" : "Minimum",
              "Notes" : [ "Notes", "Notes" ],
              "FeeCapAmount" : "FeeCapAmount"
            } ],
            "FeeChargeDetail" : [ {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            }, {
              "FeeApplicableRange" : {
                "MaximumRate" : "MaximumRate",
                "MaximumAmount" : "MaximumAmount",
                "MinimumAmount" : "MinimumAmount",
                "MinimumRate" : "MinimumRate"
              },
              "OtherFeeCategory" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "ApplicationFrequency" : "Daily",
              "OtherFeeType" : {
                "Description" : "Description",
                "FeeCategory" : "CashAdvance",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeType" : "AdditionalCard",
              "OtherCalculationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "FeeRate" : "FeeRate",
              "FeeRateType" : "Gross",
              "OtherApplicationFrequency" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "OtherFeeRateType" : {
                "Description" : "Description",
                "Code" : "Code",
                "Name" : "Name"
              },
              "NegotiableIndicator" : true,
              "IncludedInPeriodicFeeIndicator" : true,
              "CalculationFrequency" : "Daily",
              "FeeCategory" : "CashAdvance",
              "Notes" : [ "Notes", "Notes" ],
              "FeeAmount" : "FeeAmount"
            } ]
          },
          "Identification" : "Identification",
          "StateTenureLength" : 9.301444,
          "Repayment" : {
            "RepaymentAllocation" : {
              "Notes" : [ "Notes", "Notes" ]
            },
            "MinBalanceRepaymentAmount" : "MinBalanceRepaymentAmount",
            "MinBalanceRepaymentRate" : "MinBalanceRepaymentRate",
            "Notes" : [ "Notes", "Notes" ],
            "NonRepaymentFeeCharges" : [ {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            }, {
              "NonRepaymentFeeChargeCap" : [ {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              }, {
                "CappingPeriod" : "Day",
                "OtherFeeType" : [ {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }, {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                } ],
                "FeeCapOccurrence" : 7.0614014,
                "FeeType" : [ "LatePayment", "LatePayment" ],
                "MinMaxType" : "Minimum",
                "Notes" : [ "Notes", "Notes" ],
                "FeeCapAmount" : "FeeCapAmount"
              } ],
              "NonRepaymentFeeChargeDetail" : [ {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              }, {
                "NegotiableIndicator" : true,
                "ApplicationFrequency" : "Daily",
                "OtherFeeType" : {
                  "Description" : "Description",
                  "FeeCategory" : "CashAdvance",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeType" : "LatePayment",
                "OtherCalculationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeRate" : "FeeRate",
                "CalculationFrequency" : "Daily",
                "FeeRateType" : "Gross",
                "Notes" : [ "Notes", "Notes" ],
                "OtherApplicationFrequency" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                },
                "FeeAmount" : "FeeAmount",
                "OtherFeeRateType" : {
                  "Description" : "Description",
                  "Code" : "Code",
                  "Name" : "Name"
                }
              } ]
            } ]
          },
          "MarketingState" : "Promotional",
          "CoreProduct" : {
            "APR" : "APR",
            "ContactlessIndicator" : true,
            "PeriodicFeePeriod" : "Day",
            "ProductURL" : "ProductURL",
            "SalesAccessChannels" : [ "Branch", "Branch" ],
            "MaxDailyCardWithdrawalLimit" : "MaxDailyCardWithdrawalLimit",
            "CardScheme" : [ "Mastercard", "Mastercard" ],
            "MaxPurchaseInterestFreeLengthDays" : 0,
            "ServicingAccessChannels" : [ "ATM", "ATM" ],
            "OtherCardScheme" : [ {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            }, {
              "Description" : "Description",
              "Code" : "Code",
              "Name" : "Name"
            } ],
            "MaxCreditLimit" : "MaxCreditLimit",
            "ProductDescription" : "ProductDescription",
            "MinCreditLimit" : "MinCreditLimit",
            "Notes" : [ "Notes", "Notes" ],
            "PeriodicFee" : "PeriodicFee",
            "TcsAndCsURL" : "TcsAndCsURL"
          },
          "Notes" : [ "Notes", "Notes" ],
          "FirstMarketedDate" : "2000-01-23"
        } ],
        "OtherSegment" : [ {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        }, {
          "Description" : "Description",
          "Code" : "Code",
          "Name" : "Name"
        } ],
        "Identification" : "Identification",
        "Segment" : [ "General", "General" ],
        "Name" : "Name"
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
 * Gets header information on the current set of `Commerical Credit Card` data
 *
 * ifModifiedSince String Used for conditional request, to retrieve data only if modified since a given date (optional)
 * ifNoneMatch String Used for conditional request, to retrieve data only if the given Etag value does not match (optional)
 * returns Object
 **/
exports.commercial_credit_cardsHEAD = function(ifModifiedSince,ifNoneMatch) {
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

