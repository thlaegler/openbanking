package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventSubject1;
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
  * Resource-Update Event.
 **/
@ApiModel(description="Resource-Update Event.")
public class OBEventResourceUpdate1  {
  
  @ApiModelProperty(required = true, value = "")
  private OBEventSubject1 subject = null;
 /**
   * Get subject
   * @return subject
  **/
  @JsonProperty("subject")
  public OBEventSubject1 getSubject() {
    return subject;
  }

  public void setSubject(OBEventSubject1 subject) {
    this.subject = subject;
  }

  public OBEventResourceUpdate1 subject(OBEventSubject1 subject) {
    this.subject = subject;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventResourceUpdate1 {\n");
    
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

