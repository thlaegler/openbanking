package com.laegler.openbanking.model;

import com.laegler.openbanking.model.SoftwareStatement1SoftwareStatements;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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

/**
  * Software Statement Schema as defined by Open Banking
 **/
@ApiModel(description="Software Statement Schema as defined by Open Banking")
public class SoftwareStatement1  {
  
  @ApiModelProperty(value = "Software Statement Attribute")
  @Valid
 /**
   * Software Statement Attribute
  **/
  private List<SoftwareStatement1SoftwareStatements> softwareStatements = null;
 /**
   * Software Statement Attribute
   * @return softwareStatements
  **/
  @JsonProperty("SoftwareStatements")
  public List<SoftwareStatement1SoftwareStatements> getSoftwareStatements() {
    return softwareStatements;
  }

  public void setSoftwareStatements(List<SoftwareStatement1SoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
  }

  public SoftwareStatement1 softwareStatements(List<SoftwareStatement1SoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
    return this;
  }

  public SoftwareStatement1 addSoftwareStatementsItem(SoftwareStatement1SoftwareStatements softwareStatementsItem) {
    this.softwareStatements.add(softwareStatementsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareStatement1 {\n");
    
    sb.append("    softwareStatements: ").append(toIndentedString(softwareStatements)).append("\n");
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

