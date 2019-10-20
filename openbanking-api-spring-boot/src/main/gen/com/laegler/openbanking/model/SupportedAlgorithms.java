package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

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

