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

public class SearchRequest  {
  
  @ApiModelProperty(value = "")
  private List<String> attributes = null;

  @ApiModelProperty(value = "An integer indicating the desired maximum number of query results per page.")
 /**
   * An integer indicating the desired maximum number of query results per page.
  **/
  private Integer count = null;

  @ApiModelProperty(value = "")
  private List<String> excludedAttributes = null;

  @ApiModelProperty(value = "The filter string used to request a subset of resources.")
 /**
   * The filter string used to request a subset of resources.
  **/
  private String filter = null;


@XmlType(name="SchemasEnum")
@XmlEnum(String.class)
public enum SchemasEnum {

@XmlEnumValue("urn:ietf:params:scim:api:messages:2.0:SearchRequest") URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_SEARCHREQUEST(String.valueOf("urn:ietf:params:scim:api:messages:2.0:SearchRequest"));


    private String value;

    SchemasEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SchemasEnum fromValue(String v) {
        for (SchemasEnum b : SchemasEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.")
 /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
  **/
  private List<SchemasEnum> schemas = new ArrayList<SchemasEnum>();

  @ApiModelProperty(value = "A string indicating the attribute whose value shall be used to order the returned responses.")
 /**
   * A string indicating the attribute whose value shall be used to order the returned responses.
  **/
  private String sortBy = null;


@XmlType(name="SortOrderEnum")
@XmlEnum(String.class)
public enum SortOrderEnum {

@XmlEnumValue("ascending") ASCENDING(String.valueOf("ascending")), @XmlEnumValue("descending") DESCENDING(String.valueOf("descending"));


    private String value;

    SortOrderEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String v) {
        for (SortOrderEnum b : SortOrderEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "A string indicating the order in which the 'sortBy' parameter is applied.")
 /**
   * A string indicating the order in which the 'sortBy' parameter is applied.
  **/
  private SortOrderEnum sortOrder = null;

  @ApiModelProperty(value = "An integer indicating the 1-based index of the first query result.")
 /**
   * An integer indicating the 1-based index of the first query result.
  **/
  private Integer startIndex = null;
 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public SearchRequest attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SearchRequest addAttributesItem(String attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

 /**
   * An integer indicating the desired maximum number of query results per page.
   * minimum: 0
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SearchRequest count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get excludedAttributes
   * @return excludedAttributes
  **/
  @JsonProperty("excludedAttributes")
  public List<String> getExcludedAttributes() {
    return excludedAttributes;
  }

  public void setExcludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
  }

  public SearchRequest excludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public SearchRequest addExcludedAttributesItem(String excludedAttributesItem) {
    this.excludedAttributes.add(excludedAttributesItem);
    return this;
  }

 /**
   * The filter string used to request a subset of resources.
   * @return filter
  **/
  @JsonProperty("filter")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public SearchRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

 /**
   * Contains a list of one or more URIs that indicate included SCIM schemas that are used to indicate the attributes contained within a resource.
   * @return schemas
  **/
  @JsonProperty("schemas")
  public List<SchemasEnum> getSchemas() {
    return schemas;
  }

  public void setSchemas(List<SchemasEnum> schemas) {
    this.schemas = schemas;
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
   * A string indicating the attribute whose value shall be used to order the returned responses.
   * @return sortBy
  **/
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public SearchRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

 /**
   * A string indicating the order in which the &#39;sortBy&#39; parameter is applied.
   * @return sortOrder
  **/
  @JsonProperty("sortOrder")
  public String getSortOrder() {
    if (sortOrder == null) {
      return null;
    }
    return sortOrder.value();
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public SearchRequest sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

 /**
   * An integer indicating the 1-based index of the first query result.
   * minimum: 1
   * @return startIndex
  **/
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public SearchRequest startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

