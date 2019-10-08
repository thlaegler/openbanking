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
 * ErrorDefault
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class ErrorDefault   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("title")
  private String title = null;

  public ErrorDefault description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Further details describing the error
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Further details describing the error")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorDefault status(String status) {
    this.status = status;
    return this;
  }

  /**
   * This corresponds to the HTTP status code
   * @return status
  **/
  @ApiModelProperty(required = true, value = "This corresponds to the HTTP status code")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorDefault title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short title of the type of error
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A short title of the type of error")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDefault errorDefault = (ErrorDefault) o;
    return Objects.equals(this.description, errorDefault.description) &&
        Objects.equals(this.status, errorDefault.status) &&
        Objects.equals(this.title, errorDefault.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDefault {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

