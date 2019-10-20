package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteFundsConfirmationResponse1DataFundsAvailableResult;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBWriteFundsConfirmationResponse1Data  {
  
  @ApiModelProperty(value = "")
  private OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult = null;

  @ApiModelProperty(value = "")
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Get fundsAvailableResult
   * @return fundsAvailableResult
  **/
  @JsonProperty("FundsAvailableResult")
  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult getFundsAvailableResult() {
    return fundsAvailableResult;
  }

  public void setFundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
  }

  public OBWriteFundsConfirmationResponse1Data fundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
    return this;
  }

 /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBWriteFundsConfirmationResponse1Data supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFundsConfirmationResponse1Data {\n");
    
    sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

