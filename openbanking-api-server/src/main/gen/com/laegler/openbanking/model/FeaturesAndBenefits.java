package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefitsCard;
import com.laegler.openbanking.model.FeaturesAndBenefitsFeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefitsFeatureBenefitItem;
import com.laegler.openbanking.model.FeaturesAndBenefitsMobileWallet;
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
public class FeaturesAndBenefits  {
  
  @ApiModelProperty(value = "Payment Card Details")
  @Valid
 /**
   * Payment Card Details
  **/
  private List<FeaturesAndBenefitsCard> card = null;

  @ApiModelProperty(value = "FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages")
  @Valid
 /**
   * FeatureBenefitGroup can be used to group features & benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages
  **/
  private List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup = null;

  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
  @Valid
 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
  **/
  private List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem = null;

  @ApiModelProperty(value = "Details about the mobile application services that may be available with the BCA product")
  @Valid
 /**
   * Details about the mobile application services that may be available with the BCA product
  **/
  private List<FeaturesAndBenefitsMobileWallet> mobileWallet = null;
 /**
   * Payment Card Details
   * @return card
  **/
  @JsonProperty("Card")
  public List<FeaturesAndBenefitsCard> getCard() {
    return card;
  }

  public void setCard(List<FeaturesAndBenefitsCard> card) {
    this.card = card;
  }

  public FeaturesAndBenefits card(List<FeaturesAndBenefitsCard> card) {
    this.card = card;
    return this;
  }

  public FeaturesAndBenefits addCardItem(FeaturesAndBenefitsCard cardItem) {
    this.card.add(cardItem);
    return this;
  }

 /**
   * FeatureBenefitGroup can be used to group features &amp; benefits in to packages (which may be chargeable at the group level). E.g. Barclays Student Account allows you to purchase extra benefits packages
   * @return featureBenefitGroup
  **/
  @JsonProperty("FeatureBenefitGroup")
  public List<FeaturesAndBenefitsFeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits featureBenefitGroup(List<FeaturesAndBenefitsFeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits addFeatureBenefitGroupItem(FeaturesAndBenefitsFeatureBenefitGroup featureBenefitGroupItem) {
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @JsonProperty("FeatureBenefitItem")
  public List<FeaturesAndBenefitsFeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits featureBenefitItem(List<FeaturesAndBenefitsFeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits addFeatureBenefitItemItem(FeaturesAndBenefitsFeatureBenefitItem featureBenefitItemItem) {
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }

 /**
   * Details about the mobile application services that may be available with the BCA product
   * @return mobileWallet
  **/
  @JsonProperty("MobileWallet")
  public List<FeaturesAndBenefitsMobileWallet> getMobileWallet() {
    return mobileWallet;
  }

  public void setMobileWallet(List<FeaturesAndBenefitsMobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
  }

  public FeaturesAndBenefits mobileWallet(List<FeaturesAndBenefitsMobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
    return this;
  }

  public FeaturesAndBenefits addMobileWalletItem(FeaturesAndBenefitsMobileWallet mobileWalletItem) {
    this.mobileWallet.add(mobileWalletItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

