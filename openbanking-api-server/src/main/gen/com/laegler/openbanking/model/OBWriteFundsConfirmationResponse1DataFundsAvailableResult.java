package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Result of a funds availability check.
 **/
@ApiModel(description="Result of a funds availability check.")
public class OBWriteFundsConfirmationResponse1DataFundsAvailableResult  {
  
  @ApiModelProperty(required = true, value = "Flag to indicate the availability of funds given the Amount in the consent request.")
 /**
   * Flag to indicate the availability of funds given the Amount in the consent request.
  **/
  private Boolean fundsAvailable = null;

  @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String fundsAvailableDateTime = null;
 /**
   * Flag to indicate the availability of funds given the Amount in the consent request.
   * @return fundsAvailable
  **/
  @JsonProperty("FundsAvailable")
  @NotNull
  public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

 /**
   * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return fundsAvailableDateTime
  **/
  @JsonProperty("FundsAvailableDateTime")
  @NotNull
  public String getFundsAvailableDateTime() {
    return fundsAvailableDateTime;
  }

  public void setFundsAvailableDateTime(String fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
  }

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableDateTime(String fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFundsConfirmationResponse1DataFundsAvailableResult {\n");
    
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
    sb.append("    fundsAvailableDateTime: ").append(toIndentedString(fundsAvailableDateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

