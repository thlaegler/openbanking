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

public class OBError1  {
  
  @ApiModelProperty(required = true, value = "Low level textual error code, e.g., UK.OBIE.Field.Missing")
 /**
   * Low level textual error code, e.g., UK.OBIE.Field.Missing
  **/
  private String errorCode = null;

  @ApiModelProperty(required = true, value = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field")
 /**
   * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBIE doesn't standardise this field
  **/
  private String message = null;

  @ApiModelProperty(value = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
 /**
   * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
  **/
  private String path = null;

  @ApiModelProperty(value = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc")
 /**
   * URL to help remediate the problem, or provide more information, or to API Reference, or help etc
  **/
  private String url = null;
 /**
   * Low level textual error code, e.g., UK.OBIE.Field.Missing
   * @return errorCode
  **/
  @JsonProperty("ErrorCode")
  @NotNull
 @Size(min=1,max=128)  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public OBError1 errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * A description of the error that occurred. e.g., &#39;A mandatory field isn&#39;t supplied&#39; or &#39;RequestedExecutionDateTime must be in future&#39; OBIE doesn&#39;t standardise this field
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

  public OBError1 message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
   * @return path
  **/
  @JsonProperty("Path")
 @Size(min=1,max=500)  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public OBError1 path(String path) {
    this.path = path;
    return this;
  }

 /**
   * URL to help remediate the problem, or provide more information, or to API Reference, or help etc
   * @return url
  **/
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OBError1 url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBError1 {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

