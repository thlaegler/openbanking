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
 * OrganisationEmailAddresses
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OrganisationEmailAddresses   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Primary")
  private Boolean primary = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Value")
  private String value = null;

  public OrganisationEmailAddresses name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name of a person or an office to which this email belongs.
   * @return name
  **/
  @ApiModelProperty(value = "A name of a person or an office to which this email belongs.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganisationEmailAddresses primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Indicator to show is this is the primary email address
   * @return primary
  **/
  @ApiModelProperty(value = "Indicator to show is this is the primary email address")


  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public OrganisationEmailAddresses type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of email address
   * @return type
  **/
  @ApiModelProperty(value = "Type of email address")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganisationEmailAddresses value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of email address
   * @return value
  **/
  @ApiModelProperty(value = "Value of email address")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationEmailAddresses organisationEmailAddresses = (OrganisationEmailAddresses) o;
    return Objects.equals(this.name, organisationEmailAddresses.name) &&
        Objects.equals(this.primary, organisationEmailAddresses.primary) &&
        Objects.equals(this.type, organisationEmailAddresses.type) &&
        Objects.equals(this.value, organisationEmailAddresses.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, primary, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationEmailAddresses {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

