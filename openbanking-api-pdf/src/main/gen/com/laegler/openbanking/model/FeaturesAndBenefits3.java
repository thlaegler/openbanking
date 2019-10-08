package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.FeaturesAndBenefits3FeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefits3FeatureBenefitItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Feature And Benefits Details
 */
@ApiModel(description = "Feature And Benefits Details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class FeaturesAndBenefits3   {
  @JsonProperty("FeatureBenefitGroup")
  @Valid
  private List<FeaturesAndBenefits3FeatureBenefitGroup> featureBenefitGroup = null;

  @JsonProperty("FeatureBenefitItem")
  @Valid
  private List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem = null;

  public FeaturesAndBenefits3 featureBenefitGroup(List<FeaturesAndBenefits3FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits3 addFeatureBenefitGroupItem(FeaturesAndBenefits3FeatureBenefitGroup featureBenefitGroupItem) {
    if (this.featureBenefitGroup == null) {
      this.featureBenefitGroup = new ArrayList<>();
    }
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

  /**
   * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).
   * @return featureBenefitGroup
  **/
  @ApiModelProperty(value = "FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level).")

  @Valid

  public List<FeaturesAndBenefits3FeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefits3FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits3 featureBenefitItem(List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits3 addFeatureBenefitItemItem(FeaturesAndBenefits3FeatureBenefitItem featureBenefitItemItem) {
    if (this.featureBenefitItem == null) {
      this.featureBenefitItem = new ArrayList<>();
    }
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }

  /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")

  @Valid

  public List<FeaturesAndBenefits3FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits3FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesAndBenefits3 featuresAndBenefits3 = (FeaturesAndBenefits3) o;
    return Objects.equals(this.featureBenefitGroup, featuresAndBenefits3.featureBenefitGroup) &&
        Objects.equals(this.featureBenefitItem, featuresAndBenefits3.featureBenefitItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureBenefitGroup, featureBenefitItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits3 {\n");
    
    sb.append("    featureBenefitGroup: ").append(toIndentedString(featureBenefitGroup)).append("\n");
    sb.append("    featureBenefitItem: ").append(toIndentedString(featureBenefitItem)).append("\n");
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

