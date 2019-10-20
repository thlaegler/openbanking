package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
 */
public enum OBCreditDebitCode2 {
  
  CREDIT("Credit"),
  
  DEBIT("Debit");

  private String value;

  OBCreditDebitCode2(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBCreditDebitCode2 fromValue(String text) {
    for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

