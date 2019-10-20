package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBPostalAddress6;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Financial institution servicing an account for the creditor.
 */
@ApiModel(description = "Financial institution servicing an account for the creditor.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBWriteInternational2DataInitiationCreditorAgent   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress = null;

  @JsonProperty("SchemeName")
  private String schemeName = null;

  public OBWriteInternational2DataInitiationCreditorAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
   * @return identification
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBWriteInternational2DataInitiationCreditorAgent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
  **/
  @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")

@Size(min=1,max=140) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteInternational2DataInitiationCreditorAgent postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public OBWriteInternational2DataInitiationCreditorAgent schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")


  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternational2DataInitiationCreditorAgent obWriteInternational2DataInitiationCreditorAgent = (OBWriteInternational2DataInitiationCreditorAgent) o;
    return Objects.equals(this.identification, obWriteInternational2DataInitiationCreditorAgent.identification) &&
        Objects.equals(this.name, obWriteInternational2DataInitiationCreditorAgent.name) &&
        Objects.equals(this.postalAddress, obWriteInternational2DataInitiationCreditorAgent.postalAddress) &&
        Objects.equals(this.schemeName, obWriteInternational2DataInitiationCreditorAgent.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, postalAddress, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternational2DataInitiationCreditorAgent {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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

