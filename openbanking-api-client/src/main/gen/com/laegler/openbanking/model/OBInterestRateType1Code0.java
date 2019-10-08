package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 */
public enum OBInterestRateType1Code0 {
  
  INBB("INBB"),
  
  INFR("INFR"),
  
  INGR("INGR"),
  
  INLR("INLR"),
  
  INNE("INNE"),
  
  INOT("INOT");

  private String value;

  OBInterestRateType1Code0(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBInterestRateType1Code0 fromValue(String text) {
    for (OBInterestRateType1Code0 b : OBInterestRateType1Code0.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

