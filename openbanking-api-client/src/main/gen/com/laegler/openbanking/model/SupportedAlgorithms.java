package com.laegler.openbanking.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static SupportedAlgorithms fromValue(String text) {
    for (SupportedAlgorithms b : SupportedAlgorithms.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

