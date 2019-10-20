package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Specifies the status of account resource in code form.
 */
public enum OBAccountStatus1Code {
  
  DELETED("Deleted"),
  
  DISABLED("Disabled"),
  
  ENABLED("Enabled"),
  
  PENDING("Pending"),
  
  PROFORMA("ProForma");

  private String value;

  OBAccountStatus1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBAccountStatus1Code fromValue(String text) {
    for (OBAccountStatus1Code b : OBAccountStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

