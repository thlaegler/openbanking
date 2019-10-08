package com.laegler.openbanking.model;

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

public class OrganisationPersonalAccountRoles  {
  
  @ApiModelProperty(value = "Role which the individual holds")
 /**
   * Role which the individual holds
  **/
  private String role = null;

  @ApiModelProperty(value = "User's name, email address or other identifying label")
 /**
   * User's name, email address or other identifying label
  **/
  private String userName = null;
 /**
   * Role which the individual holds
   * @return role
  **/
  @JsonProperty("Role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OrganisationPersonalAccountRoles role(String role) {
    this.role = role;
    return this;
  }

 /**
   * User&#39;s name, email address or other identifying label
   * @return userName
  **/
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public OrganisationPersonalAccountRoles userName(String userName) {
    this.userName = userName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationPersonalAccountRoles {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

