package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventSubscription1Data;
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

public class OBEventSubscription1  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBEventSubscription1Data data = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("Data")
  @NotNull
  public OBEventSubscription1Data getData() {
    return data;
  }

  public void setData(OBEventSubscription1Data data) {
    this.data = data;
  }

  public OBEventSubscription1 data(OBEventSubscription1Data data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubscription1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

