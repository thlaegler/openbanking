package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Result of a funds availability check.
 */
@ApiModel(description = "Result of a funds availability check.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBWriteFundsConfirmationResponse1DataFundsAvailableResult   {
  @JsonProperty("FundsAvailable")
  private Boolean fundsAvailable = null;

  @JsonProperty("FundsAvailableDateTime")
  private String fundsAvailableDateTime = null;

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Flag to indicate the availability of funds given the Amount in the consent request.
   * @return fundsAvailable
  **/
  @ApiModelProperty(required = true, value = "Flag to indicate the availability of funds given the Amount in the consent request.")
  @NotNull


  public Boolean isFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(Boolean fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableDateTime(String fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
    return this;
  }

  /**
   * Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return fundsAvailableDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull


  public String getFundsAvailableDateTime() {
    return fundsAvailableDateTime;
  }

  public void setFundsAvailableDateTime(String fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteFundsConfirmationResponse1DataFundsAvailableResult obWriteFundsConfirmationResponse1DataFundsAvailableResult = (OBWriteFundsConfirmationResponse1DataFundsAvailableResult) o;
    return Objects.equals(this.fundsAvailable, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailable) &&
        Objects.equals(this.fundsAvailableDateTime, obWriteFundsConfirmationResponse1DataFundsAvailableResult.fundsAvailableDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailable, fundsAvailableDateTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

