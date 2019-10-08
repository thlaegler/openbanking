package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBRegistrationProperties1;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse201  {
  
  @ApiModelProperty(value = "")
  private OBRegistrationProperties1 obRegistrationProperties1 = null;
 /**
   * Get obRegistrationProperties1
   * @return obRegistrationProperties1
  **/
  @JsonProperty("OBRegistrationProperties1")
  public OBRegistrationProperties1 getObRegistrationProperties1() {
    return obRegistrationProperties1;
  }

  public void setObRegistrationProperties1(OBRegistrationProperties1 obRegistrationProperties1) {
    this.obRegistrationProperties1 = obRegistrationProperties1;
  }

  public InlineResponse201 obRegistrationProperties1(OBRegistrationProperties1 obRegistrationProperties1) {
    this.obRegistrationProperties1 = obRegistrationProperties1;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    obRegistrationProperties1: ").append(toIndentedString(obRegistrationProperties1)).append("\n");
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

