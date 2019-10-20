package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Specifies the status of the standing order in code form.
 */
public enum OBExternalStandingOrderStatus1Code {
  
  ACTIVE("Active"),
  
  INACTIVE("Inactive");

  private String value;

  OBExternalStandingOrderStatus1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBExternalStandingOrderStatus1Code fromValue(String text) {
    for (OBExternalStandingOrderStatus1Code b : OBExternalStandingOrderStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

