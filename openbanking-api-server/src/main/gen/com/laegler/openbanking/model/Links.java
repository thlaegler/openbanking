package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Links relevant to the payload
 **/
@ApiModel(description="Links relevant to the payload")
public class Links  {
  
  @ApiModelProperty(value = "")
  private String first = null;

  @ApiModelProperty(value = "")
  private String last = null;

  @ApiModelProperty(value = "")
  private String next = null;

  @ApiModelProperty(value = "")
  private String prev = null;

  @ApiModelProperty(required = true, value = "")
  private String self = null;
 /**
   * Get first
   * @return first
  **/
  @JsonProperty("First")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public Links first(String first) {
    this.first = first;
    return this;
  }

 /**
   * Get last
   * @return last
  **/
  @JsonProperty("Last")
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public Links last(String last) {
    this.last = last;
    return this;
  }

 /**
   * Get next
   * @return next
  **/
  @JsonProperty("Next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public Links next(String next) {
    this.next = next;
    return this;
  }

 /**
   * Get prev
   * @return prev
  **/
  @JsonProperty("Prev")
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public Links prev(String prev) {
    this.prev = prev;
    return this;
  }

 /**
   * Get self
   * @return self
  **/
  @JsonProperty("Self")
  @NotNull
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links self(String self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

