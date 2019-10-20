package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Specifies the scheduled payment date type requested
 */
public enum OBExternalScheduleType1Code {
  
  ARRIVAL("Arrival"),
  
  EXECUTION("Execution");

  private String value;

  OBExternalScheduleType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBExternalScheduleType1Code fromValue(String text) {
    for (OBExternalScheduleType1Code b : OBExternalScheduleType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

