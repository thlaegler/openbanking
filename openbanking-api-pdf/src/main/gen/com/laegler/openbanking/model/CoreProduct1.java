package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CoreProduct1OtherCardScheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CCC core product details.
 */
@ApiModel(description = "CCC core product details.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CoreProduct1   {
  @JsonProperty("APR")
  private String APR = null;

  /**
   * Operator of Card Scheme
   */
  public enum CardSchemeEnum {
    MASTERCARD("Mastercard"),
    
    OTHER("Other"),
    
    VISA("Visa");

    private String value;

    CardSchemeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardSchemeEnum fromValue(String text) {
      for (CardSchemeEnum b : CardSchemeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CardScheme")
  @Valid
  private List<CardSchemeEnum> cardScheme = new ArrayList<>();

  @JsonProperty("ContactlessIndicator")
  private Boolean contactlessIndicator = null;

  @JsonProperty("MaxCreditLimit")
  private String maxCreditLimit = null;

  @JsonProperty("MaxDailyCardWithdrawalLimit")
  private String maxDailyCardWithdrawalLimit = null;

  @JsonProperty("MaxPurchaseInterestFreeLengthDays")
  private Integer maxPurchaseInterestFreeLengthDays = null;

  @JsonProperty("MinCreditLimit")
  private String minCreditLimit = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherCardScheme")
  @Valid
  private List<CoreProduct1OtherCardScheme> otherCardScheme = null;

  @JsonProperty("PeriodicFee")
  private String periodicFee = null;

  /**
   * The unit of period (days, weeks, months etc.) of the Periodic Fee
   */
  public enum PeriodicFeePeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    PeriodicFeePeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodicFeePeriodEnum fromValue(String text) {
      for (PeriodicFeePeriodEnum b : PeriodicFeePeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("PeriodicFeePeriod")
  private PeriodicFeePeriodEnum periodicFeePeriod = null;

  @JsonProperty("ProductDescription")
  private String productDescription = null;

  @JsonProperty("ProductURL")
  private String productURL = null;

  /**
   * Channels via which a customer can open a CCC.
   */
  public enum SalesAccessChannelsEnum {
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    ONLINE("Online"),
    
    RELATIONSHIPMANAGER("RelationshipManager");

    private String value;

    SalesAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SalesAccessChannelsEnum fromValue(String text) {
      for (SalesAccessChannelsEnum b : SalesAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SalesAccessChannels")
  @Valid
  private List<SalesAccessChannelsEnum> salesAccessChannels = new ArrayList<>();

  /**
   * Channels via which customers can access CCC services.
   */
  public enum ServicingAccessChannelsEnum {
    ATM("ATM"),
    
    BRANCH("Branch"),
    
    CALLCENTRE("CallCentre"),
    
    POST("Post"),
    
    MOBILEBANKINGAPP("MobileBankingApp"),
    
    ONLINE("Online"),
    
    POSTOFFICE("PostOffice"),
    
    RELATIONSHIPMANAGER("RelationshipManager"),
    
    TEXT("Text");

    private String value;

    ServicingAccessChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServicingAccessChannelsEnum fromValue(String text) {
      for (ServicingAccessChannelsEnum b : ServicingAccessChannelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ServicingAccessChannels")
  @Valid
  private List<ServicingAccessChannelsEnum> servicingAccessChannels = new ArrayList<>();

  @JsonProperty("TcsAndCsURL")
  private String tcsAndCsURL = null;

  public CoreProduct1 APR(String APR) {
    this.APR = APR;
    return this;
  }

  /**
   * Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees.
   * @return APR
  **/
  @ApiModelProperty(required = true, value = "Annual Percentage Rate (APR) is a measure that attempts to calculate what percentage of the principal youâ€™ll pay per period (in this case a year), taking every charge â€“ monthly payments over the course of the loan, upfront fees, etc. â€“ into account. For commercial credit cards, this APR is the representative APR which includes any account fees.")
  @NotNull

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getAPR() {
    return APR;
  }

  public void setAPR(String APR) {
    this.APR = APR;
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
   * Operator of Card Scheme
   * @return cardScheme
  **/
  @ApiModelProperty(required = true, value = "Operator of Card Scheme")
  @NotNull

@Size(min=1) 
  public List<CardSchemeEnum> getCardScheme() {
    return cardScheme;
  }

  public void setCardScheme(List<CardSchemeEnum> cardScheme) {
    this.cardScheme = cardScheme;
  }

  public CoreProduct1 contactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
    return this;
  }

  /**
   * Indicates whether the card can be used with a contactless terminal
   * @return contactlessIndicator
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the card can be used with a contactless terminal")
  @NotNull


  public Boolean isContactlessIndicator() {
    return contactlessIndicator;
  }

  public void setContactlessIndicator(Boolean contactlessIndicator) {
    this.contactlessIndicator = contactlessIndicator;
  }

  public CoreProduct1 maxCreditLimit(String maxCreditLimit) {
    this.maxCreditLimit = maxCreditLimit;
    return this;
  }

  /**
   * The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€
   * @return maxCreditLimit
  **/
  @ApiModelProperty(value = "The maximum amount of credit that the bank will offer against the card account and is normally â€œsubject to statusâ€")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMaxCreditLimit() {
    return maxCreditLimit;
  }

  public void setMaxCreditLimit(String maxCreditLimit) {
    this.maxCreditLimit = maxCreditLimit;
  }

  public CoreProduct1 maxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
    return this;
  }

  /**
   * The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit)
   * @return maxDailyCardWithdrawalLimit
  **/
  @ApiModelProperty(value = "The maximum amount of money that you can withdraw per day (so long as you do not exceed your available credit limit)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMaxDailyCardWithdrawalLimit() {
    return maxDailyCardWithdrawalLimit;
  }

  public void setMaxDailyCardWithdrawalLimit(String maxDailyCardWithdrawalLimit) {
    this.maxDailyCardWithdrawalLimit = maxDailyCardWithdrawalLimit;
  }

  public CoreProduct1 maxPurchaseInterestFreeLengthDays(Integer maxPurchaseInterestFreeLengthDays) {
    this.maxPurchaseInterestFreeLengthDays = maxPurchaseInterestFreeLengthDays;
    return this;
  }

  /**
   * The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges
   * @return maxPurchaseInterestFreeLengthDays
  **/
  @ApiModelProperty(value = "The maximum number of days that you have between making a purchase via the credit card and having to repay the balance without incurring interest charges")


  public Integer getMaxPurchaseInterestFreeLengthDays() {
    return maxPurchaseInterestFreeLengthDays;
  }

  public void setMaxPurchaseInterestFreeLengthDays(Integer maxPurchaseInterestFreeLengthDays) {
    this.maxPurchaseInterestFreeLengthDays = maxPurchaseInterestFreeLengthDays;
  }

  public CoreProduct1 minCreditLimit(String minCreditLimit) {
    this.minCreditLimit = minCreditLimit;
    return this;
  }

  /**
   * The minimum amount of credit that the bank will offer against the card account
   * @return minCreditLimit
  **/
  @ApiModelProperty(value = "The minimum amount of credit that the bank will offer against the card account")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getMinCreditLimit() {
    return minCreditLimit;
  }

  public void setMinCreditLimit(String minCreditLimit) {
    this.minCreditLimit = minCreditLimit;
  }

  public CoreProduct1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CoreProduct1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for adding details for core product.
   * @return notes
  **/
  @ApiModelProperty(value = "Free text for adding details for core product.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CoreProduct1 otherCardScheme(List<CoreProduct1OtherCardScheme> otherCardScheme) {
    this.otherCardScheme = otherCardScheme;
    return this;
  }

  public CoreProduct1 addOtherCardSchemeItem(CoreProduct1OtherCardScheme otherCardSchemeItem) {
    if (this.otherCardScheme == null) {
      this.otherCardScheme = new ArrayList<>();
    }
    this.otherCardScheme.add(otherCardSchemeItem);
    return this;
  }

  /**
   * Other card scheme which is not available in the standard code list
   * @return otherCardScheme
  **/
  @ApiModelProperty(value = "Other card scheme which is not available in the standard code list")

  @Valid

  public List<CoreProduct1OtherCardScheme> getOtherCardScheme() {
    return otherCardScheme;
  }

  public void setOtherCardScheme(List<CoreProduct1OtherCardScheme> otherCardScheme) {
    this.otherCardScheme = otherCardScheme;
  }

  public CoreProduct1 periodicFee(String periodicFee) {
    this.periodicFee = periodicFee;
    return this;
  }

  /**
   * Charge made on a periodic basis for the card account e.g. Annual Fee
   * @return periodicFee
  **/
  @ApiModelProperty(value = "Charge made on a periodic basis for the card account e.g. Annual Fee")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getPeriodicFee() {
    return periodicFee;
  }

  public void setPeriodicFee(String periodicFee) {
    this.periodicFee = periodicFee;
  }

  public CoreProduct1 periodicFeePeriod(PeriodicFeePeriodEnum periodicFeePeriod) {
    this.periodicFeePeriod = periodicFeePeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the Periodic Fee
   * @return periodicFeePeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the Periodic Fee")


  public PeriodicFeePeriodEnum getPeriodicFeePeriod() {
    return periodicFeePeriod;
  }

  public void setPeriodicFeePeriod(PeriodicFeePeriodEnum periodicFeePeriod) {
    this.periodicFeePeriod = periodicFeePeriod;
  }

  public CoreProduct1 productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productDescription
  **/
  @ApiModelProperty(value = "The description of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")

@Size(min=1,max=2000) 
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public CoreProduct1 productURL(String productURL) {
    this.productURL = productURL;
    return this;
  }

  /**
   * URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.
   * @return productURL
  **/
  @ApiModelProperty(required = true, value = "URL provided by the organisation which redirects to the product (on live products only) available on an external website. There might be more than one product at a given URL.")
  @NotNull

@Size(min=1,max=500) 
  public String getProductURL() {
    return productURL;
  }

  public void setProductURL(String productURL) {
    this.productURL = productURL;
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
   * Channels via which a customer can open a CCC.
   * @return salesAccessChannels
  **/
  @ApiModelProperty(required = true, value = "Channels via which a customer can open a CCC.")
  @NotNull

@Size(min=1) 
  public List<SalesAccessChannelsEnum> getSalesAccessChannels() {
    return salesAccessChannels;
  }

  public void setSalesAccessChannels(List<SalesAccessChannelsEnum> salesAccessChannels) {
    this.salesAccessChannels = salesAccessChannels;
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
   * Channels via which customers can access CCC services.
   * @return servicingAccessChannels
  **/
  @ApiModelProperty(required = true, value = "Channels via which customers can access CCC services.")
  @NotNull

@Size(min=1) 
  public List<ServicingAccessChannelsEnum> getServicingAccessChannels() {
    return servicingAccessChannels;
  }

  public void setServicingAccessChannels(List<ServicingAccessChannelsEnum> servicingAccessChannels) {
    this.servicingAccessChannels = servicingAccessChannels;
  }

  public CoreProduct1 tcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
    return this;
  }

  /**
   * URL provided by the financial institution which redirects to the CCC T&Cs on an external website
   * @return tcsAndCsURL
  **/
  @ApiModelProperty(required = true, value = "URL provided by the financial institution which redirects to the CCC T&Cs on an external website")
  @NotNull

@Size(min=1,max=500) 
  public String getTcsAndCsURL() {
    return tcsAndCsURL;
  }

  public void setTcsAndCsURL(String tcsAndCsURL) {
    this.tcsAndCsURL = tcsAndCsURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreProduct1 coreProduct1 = (CoreProduct1) o;
    return Objects.equals(this.APR, coreProduct1.APR) &&
        Objects.equals(this.cardScheme, coreProduct1.cardScheme) &&
        Objects.equals(this.contactlessIndicator, coreProduct1.contactlessIndicator) &&
        Objects.equals(this.maxCreditLimit, coreProduct1.maxCreditLimit) &&
        Objects.equals(this.maxDailyCardWithdrawalLimit, coreProduct1.maxDailyCardWithdrawalLimit) &&
        Objects.equals(this.maxPurchaseInterestFreeLengthDays, coreProduct1.maxPurchaseInterestFreeLengthDays) &&
        Objects.equals(this.minCreditLimit, coreProduct1.minCreditLimit) &&
        Objects.equals(this.notes, coreProduct1.notes) &&
        Objects.equals(this.otherCardScheme, coreProduct1.otherCardScheme) &&
        Objects.equals(this.periodicFee, coreProduct1.periodicFee) &&
        Objects.equals(this.periodicFeePeriod, coreProduct1.periodicFeePeriod) &&
        Objects.equals(this.productDescription, coreProduct1.productDescription) &&
        Objects.equals(this.productURL, coreProduct1.productURL) &&
        Objects.equals(this.salesAccessChannels, coreProduct1.salesAccessChannels) &&
        Objects.equals(this.servicingAccessChannels, coreProduct1.servicingAccessChannels) &&
        Objects.equals(this.tcsAndCsURL, coreProduct1.tcsAndCsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(APR, cardScheme, contactlessIndicator, maxCreditLimit, maxDailyCardWithdrawalLimit, maxPurchaseInterestFreeLengthDays, minCreditLimit, notes, otherCardScheme, periodicFee, periodicFeePeriod, productDescription, productURL, salesAccessChannels, servicingAccessChannels, tcsAndCsURL);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

