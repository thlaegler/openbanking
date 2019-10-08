package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBBeneficiary3;
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

public class OBReadBeneficiary3Data  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<OBBeneficiary3> beneficiary = null;
 /**
   * Get beneficiary
   * @return beneficiary
  **/
  @JsonProperty("Beneficiary")
  public List<OBBeneficiary3> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary3> beneficiary) {
    this.beneficiary = beneficiary;
  }

  public OBReadBeneficiary3Data beneficiary(List<OBBeneficiary3> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary3Data addBeneficiaryItem(OBBeneficiary3 beneficiaryItem) {
    this.beneficiary.add(beneficiaryItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

