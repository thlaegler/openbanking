package com.laegler.openbanking.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompetentAuthorityClaimsAuthorisations  {
  
  @ApiModelProperty(value = "Indicator to show if this claim is active")
 /**
   * Indicator to show if this claim is active
  **/
  private Boolean active = null;

  @ApiModelProperty(value = "Member State giving the authorisation")
 /**
   * Member State giving the authorisation
  **/
  private String memberState = null;

  @ApiModelProperty(value = "Psd2 Role in which institution authorised")
 /**
   * Psd2 Role in which institution authorised
  **/
  private String psd2Role = null;
 /**
   * Indicator to show if this claim is active
   * @return active
  **/
  @JsonProperty("Active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CompetentAuthorityClaimsAuthorisations active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Member State giving the authorisation
   * @return memberState
  **/
  @JsonProperty("MemberState")
  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CompetentAuthorityClaimsAuthorisations memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

 /**
   * Psd2 Role in which institution authorised
   * @return psd2Role
  **/
  @JsonProperty("Psd2Role")
  public String getPsd2Role() {
    return psd2Role;
  }

  public void setPsd2Role(String psd2Role) {
    this.psd2Role = psd2Role;
  }

  public CompetentAuthorityClaimsAuthorisations psd2Role(String psd2Role) {
    this.psd2Role = psd2Role;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetentAuthorityClaimsAuthorisations {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    memberState: ").append(toIndentedString(memberState)).append("\n");
    sb.append("    psd2Role: ").append(toIndentedString(psd2Role)).append("\n");
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

