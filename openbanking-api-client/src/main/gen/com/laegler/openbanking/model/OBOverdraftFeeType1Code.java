package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Overdraft fee type
 */
public enum OBOverdraftFeeType1Code {
  
  FBAO("FBAO"),
  
  FBAR("FBAR"),
  
  FBEB("FBEB"),
  
  FBIT("FBIT"),
  
  FBOR("FBOR"),
  
  FBOS("FBOS"),
  
  FBSC("FBSC"),
  
  FBTO("FBTO"),
  
  FBUB("FBUB"),
  
  FBUT("FBUT"),
  
  FTOT("FTOT"),
  
  FTUT("FTUT");

  private String value;

  OBOverdraftFeeType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBOverdraftFeeType1Code fromValue(String text) {
    for (OBOverdraftFeeType1Code b : OBOverdraftFeeType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

