package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.SoftwareStatementSoftwareStatements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Software Statement Schema as defined by Open Banking
 */
@ApiModel(description = "Software Statement Schema as defined by Open Banking")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class SoftwareStatement   {
  @JsonProperty("SoftwareStatements")
  @Valid
  private List<SoftwareStatementSoftwareStatements> softwareStatements = null;

  public SoftwareStatement softwareStatements(List<SoftwareStatementSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
    return this;
  }

  public SoftwareStatement addSoftwareStatementsItem(SoftwareStatementSoftwareStatements softwareStatementsItem) {
    if (this.softwareStatements == null) {
      this.softwareStatements = new ArrayList<>();
    }
    this.softwareStatements.add(softwareStatementsItem);
    return this;
  }

  /**
   * Software Statement Attribute
   * @return softwareStatements
  **/
  @ApiModelProperty(value = "Software Statement Attribute")

  @Valid

  public List<SoftwareStatementSoftwareStatements> getSoftwareStatements() {
    return softwareStatements;
  }

  public void setSoftwareStatements(List<SoftwareStatementSoftwareStatements> softwareStatements) {
    this.softwareStatements = softwareStatements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareStatement softwareStatement = (SoftwareStatement) o;
    return Objects.equals(this.softwareStatements, softwareStatement.softwareStatements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareStatements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareStatement {\n");
    
    sb.append("    softwareStatements: ").append(toIndentedString(softwareStatements)).append("\n");
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

