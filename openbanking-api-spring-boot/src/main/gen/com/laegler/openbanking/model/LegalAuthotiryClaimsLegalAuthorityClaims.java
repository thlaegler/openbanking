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
 * LegalAuthotiryClaimsLegalAuthorityClaims
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class LegalAuthotiryClaimsLegalAuthorityClaims   {
  @JsonProperty("RegisteredId")
  private String registeredId = null;

  @JsonProperty("RegisteredName")
  private String registeredName = null;

  @JsonProperty("RegistrationAuthorityId")
  private String registrationAuthorityId = null;

  public LegalAuthotiryClaimsLegalAuthorityClaims registeredId(String registeredId) {
    this.registeredId = registeredId;
    return this;
  }

  /**
   * Company Registration Id
   * @return registeredId
  **/
  @ApiModelProperty(value = "Company Registration Id")


  public String getRegisteredId() {
    return registeredId;
  }

  public void setRegisteredId(String registeredId) {
    this.registeredId = registeredId;
  }

  public LegalAuthotiryClaimsLegalAuthorityClaims registeredName(String registeredName) {
    this.registeredName = registeredName;
    return this;
  }

  /**
   * Company Registered Name
   * @return registeredName
  **/
  @ApiModelProperty(value = "Company Registered Name")


  public String getRegisteredName() {
    return registeredName;
  }

  public void setRegisteredName(String registeredName) {
    this.registeredName = registeredName;
  }

  public LegalAuthotiryClaimsLegalAuthorityClaims registrationAuthorityId(String registrationAuthorityId) {
    this.registrationAuthorityId = registrationAuthorityId;
    return this;
  }

  /**
   * Identification of registering Authority
   * @return registrationAuthorityId
  **/
  @ApiModelProperty(value = "Identification of registering Authority")


  public String getRegistrationAuthorityId() {
    return registrationAuthorityId;
  }

  public void setRegistrationAuthorityId(String registrationAuthorityId) {
    this.registrationAuthorityId = registrationAuthorityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalAuthotiryClaimsLegalAuthorityClaims legalAuthotiryClaimsLegalAuthorityClaims = (LegalAuthotiryClaimsLegalAuthorityClaims) o;
    return Objects.equals(this.registeredId, legalAuthotiryClaimsLegalAuthorityClaims.registeredId) &&
        Objects.equals(this.registeredName, legalAuthotiryClaimsLegalAuthorityClaims.registeredName) &&
        Objects.equals(this.registrationAuthorityId, legalAuthotiryClaimsLegalAuthorityClaims.registrationAuthorityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registeredId, registeredName, registrationAuthorityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalAuthotiryClaimsLegalAuthorityClaims {\n");
    
    sb.append("    registeredId: ").append(toIndentedString(registeredId)).append("\n");
    sb.append("    registeredName: ").append(toIndentedString(registeredName)).append("\n");
    sb.append("    registrationAuthorityId: ").append(toIndentedString(registrationAuthorityId)).append("\n");
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

