package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CreditInterest1TierBandSet;
import io.swagger.annotations.ApiModel;
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

/**
  * Details about the interest that may be payable to the BCA account holders
 **/
@ApiModel(description="Details about the interest that may be payable to the BCA account holders")
public class CreditInterest1  {
  
  @ApiModelProperty(required = true, value = "The group of tiers or bands for which credit interest can be applied.")
 /**
   * The group of tiers or bands for which credit interest can be applied.
  **/
  private List<CreditInterest1TierBandSet> tierBandSet = new ArrayList<CreditInterest1TierBandSet>();
 /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
  **/
  @JsonProperty("TierBandSet")
  public List<CreditInterest1TierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public CreditInterest1 tierBandSet(List<CreditInterest1TierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest1 addTierBandSetItem(CreditInterest1TierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1 {\n");
    
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

