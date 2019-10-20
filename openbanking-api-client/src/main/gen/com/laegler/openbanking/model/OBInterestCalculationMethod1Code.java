package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Methods of calculating interest
 */
public enum OBInterestCalculationMethod1Code {
  
  ITCO("ITCO"),
  
  ITOT("ITOT"),
  
  ITSI("ITSI");

  private String value;

  OBInterestCalculationMethod1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBInterestCalculationMethod1Code fromValue(String text) {
    for (OBInterestCalculationMethod1Code b : OBInterestCalculationMethod1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

