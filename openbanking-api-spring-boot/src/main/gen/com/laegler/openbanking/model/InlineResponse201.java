package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBRegistrationProperties1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse201
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class InlineResponse201   {
  @JsonProperty("OBRegistrationProperties1")
  private OBRegistrationProperties1 obRegistrationProperties1 = null;

  public InlineResponse201 obRegistrationProperties1(OBRegistrationProperties1 obRegistrationProperties1) {
    this.obRegistrationProperties1 = obRegistrationProperties1;
    return this;
  }

  /**
   * Get obRegistrationProperties1
   * @return obRegistrationProperties1
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRegistrationProperties1 getObRegistrationProperties1() {
    return obRegistrationProperties1;
  }

  public void setObRegistrationProperties1(OBRegistrationProperties1 obRegistrationProperties1) {
    this.obRegistrationProperties1 = obRegistrationProperties1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.obRegistrationProperties1, inlineResponse201.obRegistrationProperties1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obRegistrationProperties1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    obRegistrationProperties1: ").append(toIndentedString(obRegistrationProperties1)).append("\n");
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

