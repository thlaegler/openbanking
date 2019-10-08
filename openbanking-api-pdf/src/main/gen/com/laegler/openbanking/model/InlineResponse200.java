package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBAccountPaymentServiceProviders;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class InlineResponse200   {
  @JsonProperty("Resources")
  @Valid
  private List<OBAccountPaymentServiceProviders> resources = null;

  @JsonProperty("itemsPerPage")
  private Integer itemsPerPage = null;

  @JsonProperty("schemas")
  @Valid
  private List<String> schemas = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("totalResults")
  private Integer totalResults = null;

  public InlineResponse200 resources(List<OBAccountPaymentServiceProviders> resources) {
    this.resources = resources;
    return this;
  }

  public InlineResponse200 addResourcesItem(OBAccountPaymentServiceProviders resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * A multi-valued list of complex objects containing the requested resources.
   * @return resources
  **/
  @ApiModelProperty(value = "A multi-valued list of complex objects containing the requested resources.")

  @Valid

  public List<OBAccountPaymentServiceProviders> getResources() {
    return resources;
  }

  public void setResources(List<OBAccountPaymentServiceProviders> resources) {
    this.resources = resources;
  }

  public InlineResponse200 itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * The number of resources returned in a list response page.
   * @return itemsPerPage
  **/
  @ApiModelProperty(value = "The number of resources returned in a list response page.")


  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public InlineResponse200 schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public InlineResponse200 addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
   * @return schemas
  **/
  @ApiModelProperty(value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")


  public List<String> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  public InlineResponse200 startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The 1-based index of the first result in the current set of list results.
   * @return startIndex
  **/
  @ApiModelProperty(value = "The 1-based index of the first result in the current set of list results.")


  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public InlineResponse200 totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * The total number of results returned by the list or query operation.
   * @return totalResults
  **/
  @ApiModelProperty(value = "The total number of results returned by the list or query operation.")


  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.resources, inlineResponse200.resources) &&
        Objects.equals(this.itemsPerPage, inlineResponse200.itemsPerPage) &&
        Objects.equals(this.schemas, inlineResponse200.schemas) &&
        Objects.equals(this.startIndex, inlineResponse200.startIndex) &&
        Objects.equals(this.totalResults, inlineResponse200.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources, itemsPerPage, schemas, startIndex, totalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

