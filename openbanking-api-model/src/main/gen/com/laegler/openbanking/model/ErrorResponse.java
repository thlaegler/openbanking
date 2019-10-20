package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class ErrorResponse   {
  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("schemas")
  @Valid
  private List<String> schemas = new ArrayList<>();

  @JsonProperty("scimType")
  private String scimType = null;

  @JsonProperty("status")
  private String status = null;

  public ErrorResponse detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A detailed, human readable message.
   * @return detail
  **/
  @ApiModelProperty(value = "A detailed, human readable message.")


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorResponse schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public ErrorResponse addSchemasItem(String schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
   * @return schemas
  **/
  @ApiModelProperty(required = true, value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")
  @NotNull


  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  public ErrorResponse scimType(String scimType) {
    this.scimType = scimType;
    return this;
  }

  /**
   * A SCIM detailed error keyword.
   * @return scimType
  **/
  @ApiModelProperty(value = "A SCIM detailed error keyword.")


  public String getScimType() {
    return scimType;
  }

  public void setScimType(String scimType) {
    this.scimType = scimType;
  }

  public ErrorResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code (see Section 6 [RFC7231]) expressed as a JSON String.
   * @return status
  **/
  @ApiModelProperty(readOnly = true, value = "The HTTP status code (see Section 6 [RFC7231]) expressed as a JSON String.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.detail, errorResponse.detail) &&
        Objects.equals(this.schemas, errorResponse.schemas) &&
        Objects.equals(this.scimType, errorResponse.scimType) &&
        Objects.equals(this.status, errorResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, schemas, scimType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    scimType: ").append(toIndentedString(scimType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

