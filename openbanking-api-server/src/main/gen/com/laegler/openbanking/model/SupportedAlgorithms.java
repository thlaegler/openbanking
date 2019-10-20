package com.laegler.openbanking.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets SupportedAlgorithms
 */
public enum SupportedAlgorithms {
  
  RS256("RS256"),
  
  PS256("PS256"),
  
  ES256("ES256");

  private String value;

  SupportedAlgorithms(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SupportedAlgorithms fromValue(String text) {
    for (SupportedAlgorithms b : SupportedAlgorithms.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

