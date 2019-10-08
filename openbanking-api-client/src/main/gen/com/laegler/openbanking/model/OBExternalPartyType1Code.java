package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Party type, in a coded form.
 */
public enum OBExternalPartyType1Code {
  
  DELEGATE("Delegate"),
  
  JOINT("Joint"),
  
  SOLE("Sole");

  private String value;

  OBExternalPartyType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBExternalPartyType1Code fromValue(String text) {
    for (OBExternalPartyType1Code b : OBExternalPartyType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

