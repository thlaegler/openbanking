package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBError1;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 **/
@ApiModel(description="An array of detail error codes, and messages, and URLs to documentation to help remediation.")
public class OBErrorResponse1  {
  
  @ApiModelProperty(required = true, value = "High level textual error code, to help categorize the errors.")
 /**
   * High level textual error code, to help categorize the errors.
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<OBError1> errors = new ArrayList<OBError1>();

  @ApiModelProperty(value = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
 /**
   * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Brief Error message, e.g., 'There is something wrong with the request parameters provided'")
 /**
   * Brief Error message, e.g., 'There is something wrong with the request parameters provided'
  **/
  private String message = null;
 /**
   * High level textual error code, to help categorize the errors.
   * @return code
  **/
  @JsonProperty("Code")
  @NotNull
 @Size(min=1,max=40)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBErrorResponse1 code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get errors
   * @return errors
  **/
  @JsonProperty("Errors")
  @NotNull
 @Size(min=1)  public List<OBError1> getErrors() {
    return errors;
  }

  public void setErrors(List<OBError1> errors) {
    this.errors = errors;
  }

  public OBErrorResponse1 errors(List<OBError1> errors) {
    this.errors = errors;
    return this;
  }

  public OBErrorResponse1 addErrorsItem(OBError1 errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
   * A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
   * @return id
  **/
  @JsonProperty("Id")
 @Size(min=1,max=40)  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBErrorResponse1 id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Brief Error message, e.g., &#39;There is something wrong with the request parameters provided&#39;
   * @return message
  **/
  @JsonProperty("Message")
  @NotNull
 @Size(min=1,max=500)  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OBErrorResponse1 message(String message) {
    this.message = message;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBErrorResponse1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

