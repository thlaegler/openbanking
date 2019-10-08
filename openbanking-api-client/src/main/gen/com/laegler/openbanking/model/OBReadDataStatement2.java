package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBStatement2;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadDataStatement2  {
  
  @ApiModelProperty(value = "")
  private List<OBStatement2> statement = null;
 /**
   * Get statement
   * @return statement
  **/
  @JsonProperty("Statement")
  public List<OBStatement2> getStatement() {
    return statement;
  }

  public void setStatement(List<OBStatement2> statement) {
    this.statement = statement;
  }

  public OBReadDataStatement2 statement(List<OBStatement2> statement) {
    this.statement = statement;
    return this;
  }

  public OBReadDataStatement2 addStatementItem(OBStatement2 statementItem) {
    this.statement.add(statementItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDataStatement2 {\n");
    
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

