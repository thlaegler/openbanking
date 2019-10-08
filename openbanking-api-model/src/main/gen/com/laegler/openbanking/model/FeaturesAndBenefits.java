package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.FeaturesAndBenefitsCard;
import com.laegler.openbanking.model.FeaturesAndBenefitsFeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefitsFeatureBenefitItem;
import com.laegler.openbanking.model.FeaturesAndBenefitsMobileWallet;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class FeaturesAndBenefits   {
  @JsonProperty("Card")
  @Valid
  private List<FeaturesAndBenefitsCard> card = null;

  @JsonProperty("FeatureBenefitGroup")
  @Valid
  private List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup = null;

  @JsonProperty("FeatureBenefitItem")
  @Valid
  private List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem = null;

  @JsonProperty("MobileWallet")
  @Valid
  private List<FeaturesAndBenefitsMobileWallet> mobileWallet = null;

  public FeaturesAndBenefits card(List<FeaturesAndBenefitsCard> card) {
    this.card = card;
    return this;
  }

  public FeaturesAndBenefits addCardItem(FeaturesAndBenefitsCard cardItem) {
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

  public List<FeaturesAndBenefitsCard> getCard() {
    return card;
  }

  public void setCard(List<FeaturesAndBenefitsCard> card) {
    this.card = card;
  }

  public FeaturesAndBenefits featureBenefitGroup(List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits addFeatureBenefitGroupItem(FeaturesAndBenefitsFeatureBenefitGroup featureBenefitGroupItem) {
    if (this.featureBenefitGroup == null) {
      this.featureBenefitGroup = new ArrayList<>();
    }
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

  /**
   * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages
   * @return featureBenefitGroup
  **/
  @ApiModelProperty(value = "FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages")

  @Valid

  public List<FeaturesAndBenefitsFeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits featureBenefitItem(List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits addFeatureBenefitItemItem(FeaturesAndBenefitsFeatureBenefitItem featureBenefitItemItem) {
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

  public List<FeaturesAndBenefitsFeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits mobileWallet(List<FeaturesAndBenefitsMobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
    return this;
  }

  public FeaturesAndBenefits addMobileWalletItem(FeaturesAndBenefitsMobileWallet mobileWalletItem) {
    if (this.mobileWallet == null) {
      this.mobileWallet = new ArrayList<>();
    }
    this.mobileWallet.add(mobileWalletItem);
    return this;
  }

  /**
   * Details about the mobile application services that may be available with the BCA product
   * @return mobileWallet
  **/
  @ApiModelProperty(value = "Details about the mobile application services that may be available with the BCA product")

  @Valid

  public List<FeaturesAndBenefitsMobileWallet> getMobileWallet() {
    return mobileWallet;
  }

  public void setMobileWallet(List<FeaturesAndBenefitsMobileWallet> mobileWallet) {
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
    FeaturesAndBenefits featuresAndBenefits = (FeaturesAndBenefits) o;
    return Objects.equals(this.card, featuresAndBenefits.card) &&
        Objects.equals(this.featureBenefitGroup, featuresAndBenefits.featureBenefitGroup) &&
        Objects.equals(this.featureBenefitItem, featuresAndBenefits.featureBenefitItem) &&
        Objects.equals(this.mobileWallet, featuresAndBenefits.mobileWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, featureBenefitGroup, featureBenefitItem, mobileWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesAndBenefits {\n");
    
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

