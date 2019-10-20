package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Status of a transaction entry on the books of the account servicer.
 */
public enum OBEntryStatus1Code {
  
  BOOKED("Booked"),
  
  PENDING("Pending");

  private String value;

  OBEntryStatus1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBEntryStatus1Code fromValue(String text) {
    for (OBEntryStatus1Code b : OBEntryStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

