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

public class OBEventPolling1SetErrs  {
  
  @ApiModelProperty(required = true, value = "A human-readable string that provides additional diagnostic information")
 /**
   * A human-readable string that provides additional diagnostic information
  **/
  private String description = null;

  @ApiModelProperty(required = true, value = "A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes")
 /**
   * A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
  **/
  private String err = null;
 /**
   * A human-readable string that provides additional diagnostic information
   * @return description
  **/
  @JsonProperty("description")
  @NotNull
 @Size(min=1,max=256)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBEventPolling1SetErrs description(String description) {
    this.description = description;
    return this;
  }

 /**
   * A value from the IANA \&quot;Security Event Token Delivery Error Codes\&quot; registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
   * @return err
  **/
  @JsonProperty("err")
  @NotNull
 @Size(min=1,max=40)  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public OBEventPolling1SetErrs err(String err) {
    this.err = err;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventPolling1SetErrs {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
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

