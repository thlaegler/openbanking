package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;


/**
 * Identifies the nature of the postal address.
 */
public enum OBAddressTypeCode {
  
  BUSINESS("Business"),
  
  CORRESPONDENCE("Correspondence"),
  
  DELIVERYTO("DeliveryTo"),
  
  MAILTO("MailTo"),
  
  POBOX("POBox"),
  
  POSTAL("Postal"),
  
  RESIDENTIAL("Residential"),
  
  STATEMENT("Statement");

  private String value;

  OBAddressTypeCode(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBAddressTypeCode fromValue(String text) {
    for (OBAddressTypeCode b : OBAddressTypeCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

