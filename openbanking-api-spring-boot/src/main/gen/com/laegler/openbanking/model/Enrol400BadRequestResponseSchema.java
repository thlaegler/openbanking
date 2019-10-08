package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Enrol400BadRequestResponseSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class Enrol400BadRequestResponseSchema   {
  /**
   * Error type
   */
  public enum ErrorEnum {
    INVALID_REDIRECT_URI("invalid_redirect_uri"),
    
    INVALID_CLIENT_METADATA("invalid_client_metadata"),
    
    INVALID_SOFTWARE_STATEMENT("invalid_software_statement"),
    
    UNAPPROVED_SOFTWARE_STATEMENT("unapproved_software_statement");

    private String value;

    ErrorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorEnum fromValue(String text) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("error")
  private ErrorEnum error = null;

  @JsonProperty("error_description")
  private String errorDescription = null;

  public Enrol400BadRequestResponseSchema error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Error type
   * @return error
  **/
  @ApiModelProperty(value = "Error type")


  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public Enrol400BadRequestResponseSchema errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * A more detailed error description
   * @return errorDescription
  **/
  @ApiModelProperty(value = "A more detailed error description")


  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrol400BadRequestResponseSchema enrol400BadRequestResponseSchema = (Enrol400BadRequestResponseSchema) o;
    return Objects.equals(this.error, enrol400BadRequestResponseSchema.error) &&
        Objects.equals(this.errorDescription, enrol400BadRequestResponseSchema.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrol400BadRequestResponseSchema {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

