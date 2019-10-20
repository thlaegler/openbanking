package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBThirdPartyProviders;
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

public class InlineResponse2003  {
  
  @ApiModelProperty(value = "A multi-valued list of complex objects containing the requested resources.")
  @Valid
 /**
   * A multi-valued list of complex objects containing the requested resources.
  **/
  private List<OBThirdPartyProviders> resources = null;

  @ApiModelProperty(value = "The number of resources returned in a list response page.")
 /**
   * The number of resources returned in a list response page.
  **/
  private Integer itemsPerPage = null;

  @ApiModelProperty(value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")
 /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
  **/
  private List<String> schemas = null;

  @ApiModelProperty(value = "The 1-based index of the first result in the current set of list results.")
 /**
   * The 1-based index of the first result in the current set of list results.
  **/
  private Integer startIndex = null;

  @ApiModelProperty(value = "The total number of results returned by the list or query operation.")
 /**
   * The total number of results returned by the list or query operation.
  **/
  private Integer totalResults = null;
 /**
   * A multi-valued list of complex objects containing the requested resources.
   * @return resources
  **/
  @JsonProperty("Resources")
  public List<OBThirdPartyProviders> getResources() {
    return resources;
  }

  public void setResources(List<OBThirdPartyProviders> resources) {
    this.resources = resources;
  }

  public InlineResponse2003 resources(List<OBThirdPartyProviders> resources) {
    this.resources = resources;
    return this;
  }

  public InlineResponse2003 addResourcesItem(OBThirdPartyProviders resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

 /**
   * The number of resources returned in a list response page.
   * @return itemsPerPage
  **/
  @JsonProperty("itemsPerPage")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public InlineResponse2003 itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
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

  public InlineResponse2003 schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public InlineResponse2003 addSchemasItem(String schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

 /**
   * The 1-based index of the first result in the current set of list results.
   * @return startIndex
  **/
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public InlineResponse2003 startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
   * The total number of results returned by the list or query operation.
   * @return totalResults
  **/
  @JsonProperty("totalResults")
  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public InlineResponse2003 totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

