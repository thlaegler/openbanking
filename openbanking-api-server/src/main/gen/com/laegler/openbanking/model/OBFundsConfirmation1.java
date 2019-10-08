package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBFundsConfirmation1Data;
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

public class OBFundsConfirmation1  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBFundsConfirmation1Data data = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("Data")
  @NotNull
  public OBFundsConfirmation1Data getData() {
    return data;
  }

  public void setData(OBFundsConfirmation1Data data) {
    this.data = data;
  }

  public OBFundsConfirmation1 data(OBFundsConfirmation1Data data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmation1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

