package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEventLink1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The resource-update event.
 */
@ApiModel(description = "The resource-update event.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBEventSubject1   {
  @JsonProperty("http://openbanking.org.uk/rid")
  private String httpopenbankingOrgUkrid = null;

  @JsonProperty("http://openbanking.org.uk/rlk")
  @Valid
  private List<OBEventLink1> httpopenbankingOrgUkrlk = new ArrayList<>();

  @JsonProperty("http://openbanking.org.uk/rty")
  private String httpopenbankingOrgUkrty = null;

  @JsonProperty("subject_type")
  private String subjectType = null;

  public OBEventSubject1 httpopenbankingOrgUkrid(String httpopenbankingOrgUkrid) {
    this.httpopenbankingOrgUkrid = httpopenbankingOrgUkrid;
    return this;
  }

  /**
   * Resource Id for the updated resource.
   * @return httpopenbankingOrgUkrid
  **/
  @ApiModelProperty(required = true, value = "Resource Id for the updated resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getHttpopenbankingOrgUkrid() {
    return httpopenbankingOrgUkrid;
  }

  public void setHttpopenbankingOrgUkrid(String httpopenbankingOrgUkrid) {
    this.httpopenbankingOrgUkrid = httpopenbankingOrgUkrid;
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
   * Resource links to other available versions of the resource.
   * @return httpopenbankingOrgUkrlk
  **/
  @ApiModelProperty(required = true, value = "Resource links to other available versions of the resource.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<OBEventLink1> getHttpopenbankingOrgUkrlk() {
    return httpopenbankingOrgUkrlk;
  }

  public void setHttpopenbankingOrgUkrlk(List<OBEventLink1> httpopenbankingOrgUkrlk) {
    this.httpopenbankingOrgUkrlk = httpopenbankingOrgUkrlk;
  }

  public OBEventSubject1 httpopenbankingOrgUkrty(String httpopenbankingOrgUkrty) {
    this.httpopenbankingOrgUkrty = httpopenbankingOrgUkrty;
    return this;
  }

  /**
   * Resource Type for the updated resource.
   * @return httpopenbankingOrgUkrty
  **/
  @ApiModelProperty(required = true, value = "Resource Type for the updated resource.")
  @NotNull

@Size(min=1,max=128) 
  public String getHttpopenbankingOrgUkrty() {
    return httpopenbankingOrgUkrty;
  }

  public void setHttpopenbankingOrgUkrty(String httpopenbankingOrgUkrty) {
    this.httpopenbankingOrgUkrty = httpopenbankingOrgUkrty;
  }

  public OBEventSubject1 subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  /**
   * Subject type for the updated resource. 
   * @return subjectType
  **/
  @ApiModelProperty(required = true, value = "Subject type for the updated resource. ")
  @NotNull

@Size(min=1,max=128) 
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventSubject1 obEventSubject1 = (OBEventSubject1) o;
    return Objects.equals(this.httpopenbankingOrgUkrid, obEventSubject1.httpopenbankingOrgUkrid) &&
        Objects.equals(this.httpopenbankingOrgUkrlk, obEventSubject1.httpopenbankingOrgUkrlk) &&
        Objects.equals(this.httpopenbankingOrgUkrty, obEventSubject1.httpopenbankingOrgUkrty) &&
        Objects.equals(this.subjectType, obEventSubject1.subjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpopenbankingOrgUkrid, httpopenbankingOrgUkrlk, httpopenbankingOrgUkrty, subjectType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

