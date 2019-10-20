package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchRequest
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class SearchRequest   {
  @JsonProperty("attributes")
  @Valid
  private List<String> attributes = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("excludedAttributes")
  @Valid
  private List<String> excludedAttributes = null;

  @JsonProperty("filter")
  private String filter = null;

  /**
   * Gets or Sets schemas
   */
  public enum SchemasEnum {
    URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_SEARCHREQUEST("urn:ietf:params:scim:api:messages:2.0:SearchRequest");

    private String value;

    SchemasEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SchemasEnum fromValue(String text) {
      for (SchemasEnum b : SchemasEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("schemas")
  @Valid
  private List<SchemasEnum> schemas = new ArrayList<>();

  @JsonProperty("sortBy")
  private String sortBy = null;

  /**
   * A string indicating the order in which the 'sortBy' parameter is applied.
   */
  public enum SortOrderEnum {
    ASCENDING("ascending"),
    
    DESCENDING("descending");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortOrderEnum fromValue(String text) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sortOrder")
  private SortOrderEnum sortOrder = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public SearchRequest attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SearchRequest addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")


  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public SearchRequest count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * An integer indicating the desired maximum number of query results per page.
   * minimum: 0
   * @return count
  **/
  @ApiModelProperty(value = "An integer indicating the desired maximum number of query results per page.")

@Min(0)
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SearchRequest excludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public SearchRequest addExcludedAttributesItem(String excludedAttributesItem) {
    if (this.excludedAttributes == null) {
      this.excludedAttributes = new ArrayList<>();
    }
    this.excludedAttributes.add(excludedAttributesItem);
    return this;
  }

  /**
   * Get excludedAttributes
   * @return excludedAttributes
  **/
  @ApiModelProperty(value = "")


  public List<String> getExcludedAttributes() {
    return excludedAttributes;
  }

  public void setExcludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
  }

  public SearchRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The filter string used to request a subset of resources.
   * @return filter
  **/
  @ApiModelProperty(value = "The filter string used to request a subset of resources.")


  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public SearchRequest schemas(List<SchemasEnum> schemas) {
    this.schemas = schemas;
    return this;
  }

  public SearchRequest addSchemasItem(SchemasEnum schemasItem) {
    this.schemas.add(schemasItem);
    return this;
  }

  /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
   * @return schemas
  **/
  @ApiModelProperty(required = true, value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")
  @NotNull


  public List<SchemasEnum> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<SchemasEnum> schemas) {
    this.schemas = schemas;
  }

  public SearchRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * A string indicating the attribute whose value shall be used to order the returned responses.
   * @return sortBy
  **/
  @ApiModelProperty(value = "A string indicating the attribute whose value shall be used to order the returned responses.")


  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public SearchRequest sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * A string indicating the order in which the 'sortBy' parameter is applied.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "A string indicating the order in which the 'sortBy' parameter is applied.")


  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public SearchRequest startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * An integer indicating the 1-based index of the first query result.
   * minimum: 1
   * @return startIndex
  **/
  @ApiModelProperty(value = "An integer indicating the 1-based index of the first query result.")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.attributes, searchRequest.attributes) &&
        Objects.equals(this.count, searchRequest.count) &&
        Objects.equals(this.excludedAttributes, searchRequest.excludedAttributes) &&
        Objects.equals(this.filter, searchRequest.filter) &&
        Objects.equals(this.schemas, searchRequest.schemas) &&
        Objects.equals(this.sortBy, searchRequest.sortBy) &&
        Objects.equals(this.sortOrder, searchRequest.sortOrder) &&
        Objects.equals(this.startIndex, searchRequest.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, count, excludedAttributes, filter, schemas, sortBy, sortOrder, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    excludedAttributes: ").append(toIndentedString(excludedAttributes)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

