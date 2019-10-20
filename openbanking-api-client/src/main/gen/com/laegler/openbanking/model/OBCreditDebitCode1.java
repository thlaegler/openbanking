package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


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
  public String toString() {
    return String.valueOf(value);
  }

  public static OBCreditDebitCode1 fromValue(String text) {
    for (OBCreditDebitCode1 b : OBCreditDebitCode1.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

