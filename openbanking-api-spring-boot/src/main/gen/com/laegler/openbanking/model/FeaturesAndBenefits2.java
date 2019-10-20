package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.FeaturesAndBenefits2Card;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitItem;
import com.laegler.openbanking.model.FeaturesAndBenefits2MobileWallet;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class FeaturesAndBenefits2   {
  @JsonProperty("Card")
  @Valid
  private List<FeaturesAndBenefits2Card> card = null;

  @JsonProperty("FeatureBenefitGroup")
  @Valid
  private List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup = null;

  @JsonProperty("FeatureBenefitItem")
  @Valid
  private List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem = null;

  @JsonProperty("MobileWallet")
  @Valid
  private List<FeaturesAndBenefits2MobileWallet> mobileWallet = null;

  public FeaturesAndBenefits2 card(List<FeaturesAndBenefits2Card> card) {
    this.card = card;
    return this;
  }

  public FeaturesAndBenefits2 addCardItem(FeaturesAndBenefits2Card cardItem) {
    if (this.card == null) {
      this.card = new ArrayList<>();
    }
    this.card.add(cardItem);
    return this;
  }

  /**
   * Payment Card Details
   * @return card
  **/
  @ApiModelProperty(value = "Payment Card Details")

  @Valid

  public List<FeaturesAndBenefits2Card> getCard() {
    return card;
  }

  public void setCard(List<FeaturesAndBenefits2Card> card) {
    this.card = card;
  }

  public FeaturesAndBenefits2 featureBenefitGroup(List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits2 addFeatureBenefitGroupItem(FeaturesAndBenefits2FeatureBenefitGroup featureBenefitGroupItem) {
    if (this.featureBenefitGroup == null) {
      this.featureBenefitGroup = new ArrayList<>();
    }
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

  /**
   * Used to group multiple features/benefits where a charge is applied
   * @return featureBenefitGroup
  **/
  @ApiModelProperty(value = "Used to group multiple features/benefits where a charge is applied")

  @Valid

  public List<FeaturesAndBenefits2FeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits2 featureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits2 addFeatureBenefitItemItem(FeaturesAndBenefits2FeatureBenefitItem featureBenefitItemItem) {
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

  public List<FeaturesAndBenefits2FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits2 mobileWallet(List<FeaturesAndBenefits2MobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
    return this;
  }

  public FeaturesAndBenefits2 addMobileWalletItem(FeaturesAndBenefits2MobileWallet mobileWalletItem) {
    if (this.mobileWallet == null) {
      this.mobileWallet = new ArrayList<>();
    }
    this.mobileWallet.add(mobileWalletItem);
    return this;
  }

  /**
   * Details about the mobile application services that may be available with the PCA product
   * @return mobileWallet
  **/
  @ApiModelProperty(value = "Details about the mobile application services that may be available with the PCA product")

  @Valid

  public List<FeaturesAndBenefits2MobileWallet> getMobileWallet() {
    return mobileWallet;
  }

  public void setMobileWallet(List<FeaturesAndBenefits2MobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesAndBenefits2 featuresAndBenefits2 = (FeaturesAndBenefits2) o;
    return Objects.equals(this.card, featuresAndBenefits2.card) &&
        Objects.equals(this.featureBenefitGroup, featuresAndBenefits2.featureBenefitGroup) &&
        Objects.equals(this.featureBenefitItem, featuresAndBenefits2.featureBenefitItem) &&
        Objects.equals(this.mobileWallet, featuresAndBenefits2.mobileWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, featureBenefitGroup, featureBenefitItem, mobileWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits2 {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    featureBenefitGroup: ").append(toIndentedString(featureBenefitGroup)).append("\n");
    sb.append("    featureBenefitItem: ").append(toIndentedString(featureBenefitItem)).append("\n");
    sb.append("    mobileWallet: ").append(toIndentedString(mobileWallet)).append("\n");
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

