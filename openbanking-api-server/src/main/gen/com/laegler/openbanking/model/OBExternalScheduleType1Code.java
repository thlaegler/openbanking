package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalScheduleType1Code fromValue(String text) {
    for (OBExternalScheduleType1Code b : OBExternalScheduleType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

