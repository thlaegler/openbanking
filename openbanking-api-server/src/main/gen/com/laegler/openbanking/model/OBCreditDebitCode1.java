package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether the transaction is a credit or a debit entry.
 */
public enum OBCreditDebitCode1 {
  
  CREDIT("Credit"),
  
  DEBIT("Debit");

  private String value;

  OBCreditDebitCode1(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBCreditDebitCode1 fromValue(String text) {
    for (OBCreditDebitCode1 b : OBCreditDebitCode1.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

