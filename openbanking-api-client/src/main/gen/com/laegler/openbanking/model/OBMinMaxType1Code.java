package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Min Max type
 */
public enum OBMinMaxType1Code {
  
  FMMN("FMMN"),
  
  FMMX("FMMX");

  private String value;

  OBMinMaxType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBMinMaxType1Code fromValue(String text) {
    for (OBMinMaxType1Code b : OBMinMaxType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

