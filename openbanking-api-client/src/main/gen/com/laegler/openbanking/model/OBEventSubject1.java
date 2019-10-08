package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventLink1;
import io.swagger.annotations.ApiModel;
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

/**
  * The resource-update event.
 **/
@ApiModel(description="The resource-update event.")
public class OBEventSubject1  {
  
  @ApiModelProperty(required = true, value = "Resource Id for the updated resource.")
 /**
   * Resource Id for the updated resource.
  **/
  private String httpopenbankingOrgUkrid = null;

  @ApiModelProperty(required = true, value = "Resource links to other available versions of the resource.")
 /**
   * Resource links to other available versions of the resource.
  **/
  private List<OBEventLink1> httpopenbankingOrgUkrlk = new ArrayList<OBEventLink1>();

  @ApiModelProperty(required = true, value = "Resource Type for the updated resource.")
 /**
   * Resource Type for the updated resource.
  **/
  private String httpopenbankingOrgUkrty = null;

  @ApiModelProperty(required = true, value = "Subject type for the updated resource. ")
 /**
   * Subject type for the updated resource. 
  **/
  private String subjectType = null;
 /**
   * Resource Id for the updated resource.
   * @return httpopenbankingOrgUkrid
  **/
  @JsonProperty("http://openbanking.org.uk/rid")
  public String getHttpopenbankingOrgUkrid() {
    return httpopenbankingOrgUkrid;
  }

  public void setHttpopenbankingOrgUkrid(String httpopenbankingOrgUkrid) {
    this.httpopenbankingOrgUkrid = httpopenbankingOrgUkrid;
  }

  public OBEventSubject1 httpopenbankingOrgUkrid(String httpopenbankingOrgUkrid) {
    this.httpopenbankingOrgUkrid = httpopenbankingOrgUkrid;
    return this;
  }

 /**
   * Resource links to other available versions of the resource.
   * @return httpopenbankingOrgUkrlk
  **/
  @JsonProperty("http://openbanking.org.uk/rlk")
  public List<OBEventLink1> getHttpopenbankingOrgUkrlk() {
    return httpopenbankingOrgUkrlk;
  }

  public void setHttpopenbankingOrgUkrlk(List<OBEventLink1> httpopenbankingOrgUkrlk) {
    this.httpopenbankingOrgUkrlk = httpopenbankingOrgUkrlk;
  }

  public OBEventSubject1 httpopenbankingOrgUkrlk(List<OBEventLink1> httpopenbankingOrgUkrlk) {
    this.httpopenbankingOrgUkrlk = httpopenbankingOrgUkrlk;
    return this;
  }

  public OBEventSubject1 addHttpopenbankingOrgUkrlkItem(OBEventLink1 httpopenbankingOrgUkrlkItem) {
    this.httpopenbankingOrgUkrlk.add(httpopenbankingOrgUkrlkItem);
    return this;
  }

 /**
   * Resource Type for the updated resource.
   * @return httpopenbankingOrgUkrty
  **/
  @JsonProperty("http://openbanking.org.uk/rty")
  public String getHttpopenbankingOrgUkrty() {
    return httpopenbankingOrgUkrty;
  }

  public void setHttpopenbankingOrgUkrty(String httpopenbankingOrgUkrty) {
    this.httpopenbankingOrgUkrty = httpopenbankingOrgUkrty;
  }

  public OBEventSubject1 httpopenbankingOrgUkrty(String httpopenbankingOrgUkrty) {
    this.httpopenbankingOrgUkrty = httpopenbankingOrgUkrty;
    return this;
  }

 /**
   * Subject type for the updated resource. 
   * @return subjectType
  **/
  @JsonProperty("subject_type")
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public OBEventSubject1 subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventSubject1 {\n");
    
    sb.append("    httpopenbankingOrgUkrid: ").append(toIndentedString(httpopenbankingOrgUkrid)).append("\n");
    sb.append("    httpopenbankingOrgUkrlk: ").append(toIndentedString(httpopenbankingOrgUkrlk)).append("\n");
    sb.append("    httpopenbankingOrgUkrty: ").append(toIndentedString(httpopenbankingOrgUkrty)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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

