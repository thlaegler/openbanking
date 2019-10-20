package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompetentAuthorityClaimsAuthorisations
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class CompetentAuthorityClaimsAuthorisations   {
  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("MemberState")
  private String memberState = null;

  @JsonProperty("Psd2Role")
  private String psd2Role = null;

  public CompetentAuthorityClaimsAuthorisations active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Indicator to show if this claim is active
   * @return active
  **/
  @ApiModelProperty(value = "Indicator to show if this claim is active")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CompetentAuthorityClaimsAuthorisations memberState(String memberState) {
    this.memberState = memberState;
    return this;
  }

  /**
   * Member State giving the authorisation
   * @return memberState
  **/
  @ApiModelProperty(value = "Member State giving the authorisation")


  public String getMemberState() {
    return memberState;
  }

  public void setMemberState(String memberState) {
    this.memberState = memberState;
  }

  public CompetentAuthorityClaimsAuthorisations psd2Role(String psd2Role) {
    this.psd2Role = psd2Role;
    return this;
  }

  /**
   * Psd2 Role in which institution authorised
   * @return psd2Role
  **/
  @ApiModelProperty(value = "Psd2 Role in which institution authorised")


  public String getPsd2Role() {
    return psd2Role;
  }

  public void setPsd2Role(String psd2Role) {
    this.psd2Role = psd2Role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetentAuthorityClaimsAuthorisations competentAuthorityClaimsAuthorisations = (CompetentAuthorityClaimsAuthorisations) o;
    return Objects.equals(this.active, competentAuthorityClaimsAuthorisations.active) &&
        Objects.equals(this.memberState, competentAuthorityClaimsAuthorisations.memberState) &&
        Objects.equals(this.psd2Role, competentAuthorityClaimsAuthorisations.psd2Role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, memberState, psd2Role);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

