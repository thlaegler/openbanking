package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Categorisation of fees and charges into standard categories.
 */
public enum OBFeeCategory1Code {
  
  FCOT("FCOT"),
  
  FCRE("FCRE"),
  
  FCSV("FCSV");

  private String value;

  OBFeeCategory1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBFeeCategory1Code fromValue(String text) {
    for (OBFeeCategory1Code b : OBFeeCategory1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

