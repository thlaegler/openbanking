package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteFundsConfirmationResponse1DataFundsAvailableResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteFundsConfirmationResponse1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBWriteFundsConfirmationResponse1Data   {
  @JsonProperty("FundsAvailableResult")
  private OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBWriteFundsConfirmationResponse1Data fundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
    return this;
  }

  /**
   * Get fundsAvailableResult
   * @return fundsAvailableResult
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteFundsConfirmationResponse1DataFundsAvailableResult getFundsAvailableResult() {
    return fundsAvailableResult;
  }

  public void setFundsAvailableResult(OBWriteFundsConfirmationResponse1DataFundsAvailableResult fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
  }

  public OBWriteFundsConfirmationResponse1Data supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteFundsConfirmationResponse1Data obWriteFundsConfirmationResponse1Data = (OBWriteFundsConfirmationResponse1Data) o;
    return Objects.equals(this.fundsAvailableResult, obWriteFundsConfirmationResponse1Data.fundsAvailableResult) &&
        Objects.equals(this.supplementaryData, obWriteFundsConfirmationResponse1Data.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableResult, supplementaryData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

