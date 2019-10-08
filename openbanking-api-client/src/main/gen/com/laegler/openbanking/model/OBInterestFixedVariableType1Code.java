package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Type of interest rate, Fixed or Variable
 */
public enum OBInterestFixedVariableType1Code {
  
  INFI("INFI"),
  
  INVA("INVA");

  private String value;

  OBInterestFixedVariableType1Code(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBInterestFixedVariableType1Code fromValue(String text) {
    for (OBInterestFixedVariableType1Code b : OBInterestFixedVariableType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

