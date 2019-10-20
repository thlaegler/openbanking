package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Relationship to the Account resource.
 **/
@ApiModel(description="Relationship to the Account resource.")
public class OBPartyRelationships1Account  {
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Absolute URI to the related resource.")
 /**
   * Absolute URI to the related resource.
  **/
  private String related = null;
 /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
  **/
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Absolute URI to the related resource.
   * @return related
  **/
  @JsonProperty("Related")
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public OBPartyRelationships1Account related(String related) {
    this.related = related;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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

