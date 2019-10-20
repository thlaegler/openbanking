package com.laegler.openbanking.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse  {
  
  @ApiModelProperty(value = "A detailed, human readable message.")
 /**
   * A detailed, human readable message.
  **/
  private String detail = null;

  @ApiModelProperty(required = true, value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")
 /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
  **/
  private List<String> schemas = new ArrayList<String>();

  @ApiModelProperty(value = "A SCIM detailed error keyword.")
 /**
   * A SCIM detailed error keyword.
  **/
  private String scimType = null;

  @ApiModelProperty(value = "The HTTP status code (see Section 6 [RFC7231]) expressed as a JSON String.")
 /**
   * The HTTP status code (see Section 6 [RFC7231]) expressed as a JSON String.
  **/
  private String status = null;
 /**
   * A detailed, human readable message.
   * @return detail
  **/
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorResponse detail(String detail) {
    this.detail = detail;
    return this;
  }

 /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
   * @return schemas
  **/
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
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
   * A SCIM detailed error keyword.
   * @return scimType
  **/
  @JsonProperty("scimType")
  public String getScimType() {
    return scimType;
  }

  public void setScimType(String scimType) {
    this.scimType = scimType;
  }

  public ErrorResponse scimType(String scimType) {
    this.scimType = scimType;
    return this;
  }

 /**
   * The HTTP status code (see Section 6 [RFC7231]) expressed as a JSON String.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

