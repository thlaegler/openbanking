package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CoreProduct1OtherCardScheme;
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
  * CCC core product details.
 **/
@ApiModel(description="CCC core product details.")
public class CoreProduct1  {
  
  @ApiModelProperty(required = true, value = "Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees.")
 /**
   * Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees.
  **/
  private String APR = null;


@XmlType(name="CardSchemeEnum")
@XmlEnum(String.class)
public enum CardSchemeEnum {

@XmlEnumValue("Mastercard") MASTERCARD(String.valueOf("Mastercard")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Visa") VISA(String.valueOf("Visa"));


    private String value;

    CardSchemeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CardSchemeEnum fromValue(String v) {
        for (CardSchemeEnum b : CardSchemeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Operator of Card Scheme")
 /**
   * Operator of Card Scheme
  **/
  private List<CardSchemeEnum> cardScheme = new ArrayList<CardSchemeEnum>();

  @ApiModelProperty(required = true, value = "Indicates whether the card can be used with a contactless terminal")
 /**
   * Indicates whether the card can be used with a contactless terminal
  **/
  private Boolean contactlessIndicator = null;

  @ApiModelProperty(value = "The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€")
 /**
   * The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€
  **/
  private String maxCreditLimit = null;

  @ApiModelProperty(value = "The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit)")
 /**
   * The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit)
  **/
  private String maxDailyCardWithdrawalLimit = null;

  @ApiModelProperty(value = "The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges")
 /**
   * The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges
  **/
  private Integer maxPurchaseInterestFreeLengthDays = null;

  @ApiModelProperty(value = "The minimum amount of credit that the bank will offer against the card account")
 /**
   * The minimum amount of credit that the bank will offer against the card account
  **/
  private String minCreditLimit = null;

  @ApiModelProperty(value = "Free text for adding details for core product.")
 /**
   * Free text for adding details for core product.
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other card scheme which is not available in the standard code list")
 /**
   * Other card scheme which is not available in the standard code list
  **/
  private List<CoreProduct1OtherCardScheme> otherCardScheme = null;

  @ApiModelProperty(value = "Charge made on a periodic basis for the card account e.g. Annual Fee")
 /**
   * Charge made on a periodic basis for the card account e.g. Annual Fee
  **/
  private String periodicFee = null;


@XmlType(name="PeriodicFeePeriodEnum")
@XmlEnum(String.class)
public enum PeriodicFeePeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    PeriodicFeePeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PeriodicFeePeriodEnum fromValue(String v) {
        for (PeriodicFeePeriodEnum b : PeriodicFeePeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the Periodic Fee")
 /**
   * The unit of period (days, weeks, months etc.) of the Periodic Fee
  **/
  private PeriodicFeePeriodEnum periodicFeePeriod = null;

  @ApiModelProperty(value = "The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
  **/
  private String productDescription = null;

  @ApiModelProperty(required = true, value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")
 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
  **/
  private String productURL = null;


@XmlType(name="SalesAccessChannelsEnum")
@XmlEnum(String.class)
public enum SalesAccessChannelsEnum {

@XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager"));


    private String value;

    SalesAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SalesAccessChannelsEnum fromValue(String v) {
        for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Channels via which a customer can open a CCC.")
 /**
   * Channels via which a customer can open a CCC.
  **/
  private List<SalesAccessChannelsEnum> salesAccessChannels = new ArrayList<SalesAccessChannelsEnum>();


@XmlType(name="ServicingAccessChannelsEnum")
@XmlEnum(String.class)
public enum ServicingAccessChannelsEnum {

@XmlEnumValue("ATM") ATM(String.valueOf("ATM")), @XmlEnumValue("Branch") BRANCH(String.valueOf("Branch")), @XmlEnumValue("CallCentre") CALLCENTRE(String.valueOf("CallCentre")), @XmlEnumValue("Post") POST(String.valueOf("Post")), @XmlEnumValue("MobileBankingApp") MOBILEBANKINGAPP(String.valueOf("MobileBankingApp")), @XmlEnumValue("Online") ONLINE(String.valueOf("Online")), @XmlEnumValue("PostOffice") POSTOFFICE(String.valueOf("PostOffice")), @XmlEnumValue("RelationshipManager") RELATIONSHIPMANAGER(String.valueOf("RelationshipManager")), @XmlEnumValue("Text") TEXT(String.valueOf("Text"));


    private String value;

    ServicingAccessChannelsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ServicingAccessChannelsEnum fromValue(String v) {
        for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Channels via which customers can access CCC services.")
 /**
   * Channels via which customers can access CCC services.
  **/
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = new ArrayList<ServicingAccessChannelsEnum>();

  @ApiModelProperty(required = true, value = "URL provided by the financial institution which redirects to the CCC T&Cs on an external website")
 /**
   * URL provided by the financial institution which redirects to the CCC T&Cs on an external website
  **/
  private String tcsAndCsURL = null;
 /**
   * Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees.
   * @return APR
  **/
  @JsonProperty("APR")
  public String getAPR() {
    return APR;
  }

  public void setAPR(String APR) {
    this.APR = APR;
  }

  public CoreProduct1 APR(String APR) {
    this.APR = APR;
    return this;
  }

 /**
   * Operator of Card Scheme
   * @return cardScheme
  **/
  @JsonProperty("CardScheme")
  public List<CardSchemeEnum> getCardScheme() {
    return cardScheme;
  }

  public void setCardScheme(List<CardSchemeEnum> cardScheme) {
    this.cardScheme = cardScheme;
  }

  public CoreProduct1 cardScheme(List<CardSchemeEnum> cardScheme) {
    this.cardScheme = cardScheme;
    return this;
  }

  public CoreProduct1 addCardSchemeItem(CardSchemeEnum cardSchemeItem) {
    this.cardScheme.add(cardSchemeItem);
    return this;
  }

 /**
   * Indicates whether the card can be used with a contactless terminal
   * @return contactlessIndicator
  **/
  @JsonProperty("ContactlessIndicator")
  public Boolean isContactlessIndicator() {
    return contactlessIndicator;
  }

  public void setContactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
  }

  public CoreProduct1 contactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
    return this;
  }

 /**
   * The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€
   * @return maxCreditLimit
  **/
  @JsonProperty("MaxCreditLimit")
  public String getMaxCreditLimit() {
    return maxCreditLimit;
  }

  public void setMaxCreditLimit(String maxCreditLimit) {
    this.maxCreditLimit = maxCreditLimit;
  }

  public CoreProduct1 maxCreditLimit(String maxCreditLimit) {
    this.maxCreditLimit = maxCreditLimit;
    return this;
  }

 /**
   * The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit)
   * @return maxDailyCardWithdrawalLimit
  **/
  @JsonProperty("MaxDailyCardWithdrawalLimit")
  public String getMaxDailyCardWithdrawalLimit() {
    return maxDailyCardWithdrawalLimit;
  }

  public void setMaxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
  }

  public CoreProduct1 maxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
    return this;
  }

 /**
   * The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges
   * @return maxPurchaseInterestFreeLengthDays
  **/
  @JsonProperty("MaxPurchaseInterestFreeLengthDays")
  public Integer getMaxPurchaseInterestFreeLengthDays() {
    return maxPurchaseInterestFreeLengthDays;
  }

  public void setMaxPurchaseInterestFreeLengthDays(Integer maxPurchaseInterestFreeLengthDays) {
    this.maxPurchaseInterestFreeLengthDays = maxPurchaseInterestFreeLengthDays;
  }

  public CoreProduct1 maxPurchaseInterestFreeLengthDays(Integer maxPurchaseInterestFreeLengthDays) {
    this.maxPurchaseInterestFreeLengthDays = maxPurchaseInterestFreeLengthDays;
    return this;
  }

 /**
   * The minimum amount of credit that the bank will offer against the card account
   * @return minCreditLimit
  **/
  @JsonProperty("MinCreditLimit")
  public String getMinCreditLimit() {
    return minCreditLimit;
  }

  public void setMinCreditLimit(String minCreditLimit) {
    this.minCreditLimit = minCreditLimit;
  }

  public CoreProduct1 minCreditLimit(String minCreditLimit) {
    this.minCreditLimit = minCreditLimit;
    return this;
  }

 /**
   * Free text for adding details for core product.
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct1 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other card scheme which is not available in the standard code list
   * @return otherCardScheme
  **/
  @JsonProperty("OtherCardScheme")
  public List<CoreProduct1OtherCardScheme> getOtherCardScheme() {
    return otherCardScheme;
  }

  public void setOtherCardScheme(List<CoreProduct1OtherCardScheme> otherCardScheme) {
    this.otherCardScheme = otherCardScheme;
  }

  public CoreProduct1 otherCardScheme(List<CoreProduct1OtherCardScheme> otherCardScheme) {
    this.otherCardScheme = otherCardScheme;
    return this;
  }

  public CoreProduct1 addOtherCardSchemeItem(CoreProduct1OtherCardScheme otherCardSchemeItem) {
    this.otherCardScheme.add(otherCardSchemeItem);
    return this;
  }

 /**
   * Charge made on a periodic basis for the card account e.g. Annual Fee
   * @return periodicFee
  **/
  @JsonProperty("PeriodicFee")
  public String getPeriodicFee() {
    return periodicFee;
  }

  public void setPeriodicFee(String periodicFee) {
    this.periodicFee = periodicFee;
  }

  public CoreProduct1 periodicFee(String periodicFee) {
    this.periodicFee = periodicFee;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the Periodic Fee
   * @return periodicFeePeriod
  **/
  @JsonProperty("PeriodicFeePeriod")
  public String getPeriodicFeePeriod() {
    if (periodicFeePeriod == null) {
      return null;
    }
    return periodicFeePeriod.value();
  }

  public void setPeriodicFeePeriod(PeriodicFeePeriodEnum periodicFeePeriod) {
    this.periodicFeePeriod = periodicFeePeriod;
  }

  public CoreProduct1 periodicFeePeriod(PeriodicFeePeriodEnum periodicFeePeriod) {
    this.periodicFeePeriod = periodicFeePeriod;
    return this;
  }

 /**
   * The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productDescription
  **/
  @JsonProperty("ProductDescription")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct1 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

 /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @JsonProperty("ProductURL")
  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
  }

  public CoreProduct1 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

 /**
   * Channels via which a customer can open a CCC.
   * @return salesAccessChannels
  **/
  @JsonProperty("SalesAccessChannels")
  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
  }

  public CoreProduct1 salesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
    return this;
  }

  public CoreProduct1 addSalesAccessChannelsItem(SalesAccessChannelsEnum salesAccessChannelsItem) {
    this.salesAccessChannels.add(salesAccessChannelsItem);
    return this;
  }

 /**
   * Channels via which customers can access CCC services.
   * @return servicingAccessChannels
  **/
  @JsonProperty("ServicingAccessChannels")
  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct1 servicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
    return this;
  }

  public CoreProduct1 addServicingAccessChannelsItem(ServicingAccessChannelsEnum servicingAccessChannelsItem) {
    this.servicingAccessChannels.add(servicingAccessChannelsItem);
    return this;
  }

 /**
   * URL provided by the financial institution which redirects to the CCC T&amp;Cs on an external website
   * @return tcsAndCsURL
  **/
  @JsonProperty("TcsAndCsURL")
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }

  public CoreProduct1 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreProduct1 {\n");
    
    sb.append("    APR: ").append(toIndentedString(APR)).append("\n");
    sb.append("    cardScheme: ").append(toIndentedString(cardScheme)).append("\n");
    sb.append("    contactlessIndicator: ").append(toIndentedString(contactlessIndicator)).append("\n");
    sb.append("    maxCreditLimit: ").append(toIndentedString(maxCreditLimit)).append("\n");
    sb.append("    maxDailyCardWithdrawalLimit: ").append(toIndentedString(maxDailyCardWithdrawalLimit)).append("\n");
    sb.append("    maxPurchaseInterestFreeLengthDays: ").append(toIndentedString(maxPurchaseInterestFreeLengthDays)).append("\n");
    sb.append("    minCreditLimit: ").append(toIndentedString(minCreditLimit)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCardScheme: ").append(toIndentedString(otherCardScheme)).append("\n");
    sb.append("    periodicFee: ").append(toIndentedString(periodicFee)).append("\n");
    sb.append("    periodicFeePeriod: ").append(toIndentedString(periodicFeePeriod)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productURL: ").append(toIndentedString(productURL)).append("\n");
    sb.append("    salesAccessChannels: ").append(toIndentedString(salesAccessChannels)).append("\n");
    sb.append("    servicingAccessChannels: ").append(toIndentedString(servicingAccessChannels)).append("\n");
    sb.append("    tcsAndCsURL: ").append(toIndentedString(tcsAndCsURL)).append("\n");
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

