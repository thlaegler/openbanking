package com.laegler.openbanking.model;

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

public class Enrol400BadRequestResponseSchema  {
  

@XmlType(name="ErrorEnum")
@XmlEnum(String.class)
public enum ErrorEnum {

@XmlEnumValue("invalid_redirect_uri") INVALID_REDIRECT_URI(String.valueOf("invalid_redirect_uri")), @XmlEnumValue("invalid_client_metadata") INVALID_CLIENT_METADATA(String.valueOf("invalid_client_metadata")), @XmlEnumValue("invalid_software_statement") INVALID_SOFTWARE_STATEMENT(String.valueOf("invalid_software_statement")), @XmlEnumValue("unapproved_software_statement") UNAPPROVED_SOFTWARE_STATEMENT(String.valueOf("unapproved_software_statement"));


    private String value;

    ErrorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ErrorEnum fromValue(String v) {
        for (ErrorEnum b : ErrorEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Error type")
 /**
   * Error type
  **/
  private ErrorEnum error = null;

  @ApiModelProperty(value = "A more detailed error description")
 /**
   * A more detailed error description
  **/
  private String errorDescription = null;
 /**
   * Error type
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    if (error == null) {
      return null;
    }
    return error.value();
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public Enrol400BadRequestResponseSchema error(ErrorEnum error) {
    this.error = error;
    return this;
  }

 /**
   * A more detailed error description
   * @return errorDescription
  **/
  @JsonProperty("error_description")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public Enrol400BadRequestResponseSchema errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

