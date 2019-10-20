package com.laegler.openbanking.model;

import com.laegler.openbanking.model.FeaturesAndBenefits2Card;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitGroup;
import com.laegler.openbanking.model.FeaturesAndBenefits2FeatureBenefitItem;
import com.laegler.openbanking.model.FeaturesAndBenefits2MobileWallet;
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
  * Feature And Benefits Details
 **/
@ApiModel(description="Feature And Benefits Details")
public class FeaturesAndBenefits2  {
  
  @ApiModelProperty(value = "Payment Card Details")
 /**
   * Payment Card Details
  **/
  private List<FeaturesAndBenefits2Card> card = null;

  @ApiModelProperty(value = "Used to group multiple features/benefits where a charge is applied")
 /**
   * Used to group multiple features/benefits where a charge is applied
  **/
  private List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup = null;

  @ApiModelProperty(value = "Detailed features or benefits which may or may not be a part of a feature/benefit group/pack")
 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
  **/
  private List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem = null;

  @ApiModelProperty(value = "Details about the mobile application services that may be available with the PCA product")
 /**
   * Details about the mobile application services that may be available with the PCA product
  **/
  private List<FeaturesAndBenefits2MobileWallet> mobileWallet = null;
 /**
   * Payment Card Details
   * @return card
  **/
  @JsonProperty("Card")
  public List<FeaturesAndBenefits2Card> getCard() {
    return card;
  }

  public void setCard(List<FeaturesAndBenefits2Card> card) {
    this.card = card;
  }

  public FeaturesAndBenefits2 card(List<FeaturesAndBenefits2Card> card) {
    this.card = card;
    return this;
  }

  public FeaturesAndBenefits2 addCardItem(FeaturesAndBenefits2Card cardItem) {
    this.card.add(cardItem);
    return this;
  }

 /**
   * Used to group multiple features/benefits where a charge is applied
   * @return featureBenefitGroup
  **/
  @JsonProperty("FeatureBenefitGroup")
  public List<FeaturesAndBenefits2FeatureBenefitGroup> getFeatureBenefitGroup() {
    return featureBenefitGroup;
  }

  public void setFeatureBenefitGroup(List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
  }

  public FeaturesAndBenefits2 featureBenefitGroup(List<FeaturesAndBenefits2FeatureBenefitGroup> featureBenefitGroup) {
    this.featureBenefitGroup = featureBenefitGroup;
    return this;
  }

  public FeaturesAndBenefits2 addFeatureBenefitGroupItem(FeaturesAndBenefits2FeatureBenefitGroup featureBenefitGroupItem) {
    this.featureBenefitGroup.add(featureBenefitGroupItem);
    return this;
  }

 /**
   * Detailed features or benefits which may or may not be a part of a feature/benefit group/pack
   * @return featureBenefitItem
  **/
  @JsonProperty("FeatureBenefitItem")
  public List<FeaturesAndBenefits2FeatureBenefitItem> getFeatureBenefitItem() {
    return featureBenefitItem;
  }

  public void setFeatureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
  }

  public FeaturesAndBenefits2 featureBenefitItem(List<FeaturesAndBenefits2FeatureBenefitItem> featureBenefitItem) {
    this.featureBenefitItem = featureBenefitItem;
    return this;
  }

  public FeaturesAndBenefits2 addFeatureBenefitItemItem(FeaturesAndBenefits2FeatureBenefitItem featureBenefitItemItem) {
    this.featureBenefitItem.add(featureBenefitItemItem);
    return this;
  }

 /**
   * Details about the mobile application services that may be available with the PCA product
   * @return mobileWallet
  **/
  @JsonProperty("MobileWallet")
  public List<FeaturesAndBenefits2MobileWallet> getMobileWallet() {
    return mobileWallet;
  }

  public void setMobileWallet(List<FeaturesAndBenefits2MobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
  }

  public FeaturesAndBenefits2 mobileWallet(List<FeaturesAndBenefits2MobileWallet> mobileWallet) {
    this.mobileWallet = mobileWallet;
    return this;
  }

  public FeaturesAndBenefits2 addMobileWalletItem(FeaturesAndBenefits2MobileWallet mobileWalletItem) {
    this.mobileWallet.add(mobileWalletItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

