package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEventSubject1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resource-Update Event.
 */
@ApiModel(description = "Resource-Update Event.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBEventResourceUpdate1   {
  @JsonProperty("subject")
  private OBEventSubject1 subject = null;

  public OBEventResourceUpdate1 subject(OBEventSubject1 subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBEventSubject1 getSubject() {
    return subject;
  }

  public void setSubject(OBEventSubject1 subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventResourceUpdate1 obEventResourceUpdate1 = (OBEventResourceUpdate1) o;
    return Objects.equals(this.subject, obEventResourceUpdate1.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventResourceUpdate1 {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

