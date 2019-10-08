package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet;
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
  * Details about the interest that may be payable to the Account holders
 **/
@ApiModel(description="Details about the interest that may be payable to the Account holders")
public class OBReadProduct2DataOtherProductTypeCreditInterest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet>();
 /**
   * Get tierBandSet
   * @return tierBandSet
  **/
  @JsonProperty("TierBandSet")
  @NotNull
 @Size(min=1)  public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterest tierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterest {\n");
    
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

