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
 * OBEventPolling1SetErrs
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBEventPolling1SetErrs   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("err")
  private String err = null;

  public OBEventPolling1SetErrs description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable string that provides additional diagnostic information
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A human-readable string that provides additional diagnostic information")
  @NotNull

@Size(min=1,max=256) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBEventPolling1SetErrs err(String err) {
    this.err = err;
    return this;
  }

  /**
   * A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes
   * @return err
  **/
  @ApiModelProperty(required = true, value = "A value from the IANA \"Security Event Token Delivery Error Codes\" registry that identifies the error as defined here  https://tools.ietf.org/id/draft-ietf-secevent-http-push-03.html#error_codes")
  @NotNull

@Size(min=1,max=40) 
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventPolling1SetErrs obEventPolling1SetErrs = (OBEventPolling1SetErrs) o;
    return Objects.equals(this.description, obEventPolling1SetErrs.description) &&
        Objects.equals(this.err, obEventPolling1SetErrs.err);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, err);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

