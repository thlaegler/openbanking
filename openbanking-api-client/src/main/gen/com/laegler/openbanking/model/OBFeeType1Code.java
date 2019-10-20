package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Fee/Charge Type
 */
public enum OBFeeType1Code {
  
  FEPF("FEPF"),
  
  FTOT("FTOT"),
  
  FYAF("FYAF"),
  
  FYAM("FYAM"),
  
  FYAQ("FYAQ"),
  
  FYCP("FYCP"),
  
  FYDB("FYDB"),
  
  FYMI("FYMI"),
  
  FYXX("FYXX");

  private String value;

  OBFeeType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBFeeType1Code fromValue(String text) {
    for (OBFeeType1Code b : OBFeeType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

