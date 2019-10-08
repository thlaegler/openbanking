package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBBeneficiary3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadBeneficiary3Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBReadBeneficiary3Data   {
  @JsonProperty("Beneficiary")
  @Valid
  private List<OBBeneficiary3> beneficiary = null;

  public OBReadBeneficiary3Data beneficiary(List<OBBeneficiary3> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary3Data addBeneficiaryItem(OBBeneficiary3 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBBeneficiary3> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary3> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary3Data obReadBeneficiary3Data = (OBReadBeneficiary3Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary3Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary3Data {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

