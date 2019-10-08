package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Specifies the type of account (personal or business).
 */
public enum OBExternalAccountType1Code {
  
  BUSINESS("Business"),
  
  PERSONAL("Personal");

  private String value;

  OBExternalAccountType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBExternalAccountType1Code fromValue(String text) {
    for (OBExternalAccountType1Code b : OBExternalAccountType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

