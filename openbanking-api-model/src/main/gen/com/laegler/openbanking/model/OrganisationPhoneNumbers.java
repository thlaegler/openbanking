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
 * OrganisationPhoneNumbers
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OrganisationPhoneNumbers   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Value")
  private String value = null;

  @JsonProperty("Verified")
  private Boolean verified = null;

  public OrganisationPhoneNumbers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name of a person or an office to which this phonenumber belongs.
   * @return name
  **/
  @ApiModelProperty(value = "A name of a person or an office to which this phonenumber belongs.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganisationPhoneNumbers type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of phone contact
   * @return type
  **/
  @ApiModelProperty(value = "Type of phone contact")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganisationPhoneNumbers value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of phone number through which the organisationcan be contacted
   * @return value
  **/
  @ApiModelProperty(value = "Value of phone number through which the organisationcan be contacted")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OrganisationPhoneNumbers verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Flag to show that the phone number has been verified
   * @return verified
  **/
  @ApiModelProperty(value = "Flag to show that the phone number has been verified")


  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationPhoneNumbers organisationPhoneNumbers = (OrganisationPhoneNumbers) o;
    return Objects.equals(this.name, organisationPhoneNumbers.name) &&
        Objects.equals(this.type, organisationPhoneNumbers.type) &&
        Objects.equals(this.value, organisationPhoneNumbers.value) &&
        Objects.equals(this.verified, organisationPhoneNumbers.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationPhoneNumbers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

