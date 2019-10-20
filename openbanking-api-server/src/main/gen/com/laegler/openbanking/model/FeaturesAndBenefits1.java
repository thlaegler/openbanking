package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefits1FeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefits1FeatureBenefitItem;
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
  * Feature And Benefits Details
 **/
@ApiModel(description="Feature And Benefits Details")
public class FeaturesAndBenefits1  {
  
  @ApiModelProperty(value = "FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).")
  @Valid
 /**
   * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).
  **/
  private List<FeaturesAndBenefits1FeatureBenefitGroup> featureBenefitGroup = null;

  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
  @Valid
 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
  **/
  private List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem = null;
 /**
   * FeatureBenefitGroup can be used to group features &amp; benefits in to packages (which may be chargeable at the group level).
   * @return featureBenefitGroup
  **/
  @JsonProperty("FeatureBenefitGroup")
  public List<FeaturesAndBenefits1FeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefits1FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits1 featureBenefitGroup(List<FeaturesAndBenefits1FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits1 addFeatureBenefitGroupItem(FeaturesAndBenefits1FeatureBenefitGroup featureBenefitGroupItem) {
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @JsonProperty("FeatureBenefitItem")
  public List<FeaturesAndBenefits1FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits1 featureBenefitItem(List<FeaturesAndBenefits1FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits1 addFeatureBenefitItemItem(FeaturesAndBenefits1FeatureBenefitItem featureBenefitItemItem) {
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits1 {\n");
    
    sb.append("    featureBenefitGroup: ").append(toIndentedString(featureBenefitGroup)).append("\n");
    sb.append("    featureBenefitItem: ").append(toIndentedString(featureBenefitItem)).append("\n");
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

