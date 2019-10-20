package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CertificateValidationResponseSchemaDataOrganisationPassportsNcaName;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CertificateValidationResponseSchemaDataOrganisationPassports  {
  
  @ApiModelProperty(value = "")
  private CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName = null;
 /**
   * Get ncaName
   * @return ncaName
  **/
  @JsonProperty("nca_name")
  public CertificateValidationResponseSchemaDataOrganisationPassportsNcaName getNcaName() {
    return ncaName;
  }

  public void setNcaName(CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName) {
    this.ncaName = ncaName;
  }

  public CertificateValidationResponseSchemaDataOrganisationPassports ncaName(CertificateValidationResponseSchemaDataOrganisationPassportsNcaName ncaName) {
    this.ncaName = ncaName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidationResponseSchemaDataOrganisationPassports {\n");
    
    sb.append("    ncaName: ").append(toIndentedString(ncaName)).append("\n");
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

