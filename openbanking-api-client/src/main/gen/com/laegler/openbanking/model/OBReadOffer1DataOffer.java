package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadOffer1DataAmount;
import com.laegler.openbanking.model.OBReadOffer1DataFee;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadOffer1DataOffer  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(value = "")
  private OBReadOffer1DataAmount amount = null;

  @ApiModelProperty(value = "Further details of the offer.")
 /**
   * Further details of the offer.
  **/
  private String description = null;

  @ApiModelProperty(value = "Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String endDateTime = null;

  @ApiModelProperty(value = "")
  private OBReadOffer1DataFee fee = null;

  @ApiModelProperty(value = "A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.")
 /**
   * A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.
  **/
  private String offerId = null;


@XmlType(name="OfferTypeEnum")
@XmlEnum(String.class)
public enum OfferTypeEnum {

@XmlEnumValue("BalanceTransfer") BALANCETRANSFER(String.valueOf("BalanceTransfer")), @XmlEnumValue("LimitIncrease") LIMITINCREASE(String.valueOf("LimitIncrease")), @XmlEnumValue("MoneyTransfer") MONEYTRANSFER(String.valueOf("MoneyTransfer")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PromotionalRate") PROMOTIONALRATE(String.valueOf("PromotionalRate"));


    private String value;

    OfferTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OfferTypeEnum fromValue(String v) {
        for (OfferTypeEnum b : OfferTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Offer type, in a coded form.")
 /**
   * Offer type, in a coded form.
  **/
  private OfferTypeEnum offerType = null;

  @ApiModelProperty(value = "Rate associated with the offer type.")
 /**
   * Rate associated with the offer type.
  **/
  private String rate = null;

  @ApiModelProperty(value = "Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String startDateTime = null;

  @ApiModelProperty(value = "Further details of the term of the offer.")
 /**
   * Further details of the term of the offer.
  **/
  private String term = null;

  @ApiModelProperty(value = "URL (Uniform Resource Locator) where documentation on the offer can be found")
 /**
   * URL (Uniform Resource Locator) where documentation on the offer can be found
  **/
  private String URL = null;

  @ApiModelProperty(value = "Value associated with the offer type.")
 /**
   * Value associated with the offer type.
  **/
  private Integer value = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadOffer1DataOffer accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("Amount")
  public OBReadOffer1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadOffer1DataAmount amount) {
    this.amount = amount;
  }

  public OBReadOffer1DataOffer amount(OBReadOffer1DataAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Further details of the offer.
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadOffer1DataOffer description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  **/
  @JsonProperty("EndDateTime")
  public String getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBReadOffer1DataOffer endDateTime(String endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

 /**
   * Get fee
   * @return fee
  **/
  @JsonProperty("Fee")
  public OBReadOffer1DataFee getFee() {
    return fee;
  }

  public void setFee(OBReadOffer1DataFee fee) {
    this.fee = fee;
  }

  public OBReadOffer1DataOffer fee(OBReadOffer1DataFee fee) {
    this.fee = fee;
    return this;
  }

 /**
   * A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.
   * @return offerId
  **/
  @JsonProperty("OfferId")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OBReadOffer1DataOffer offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Offer type, in a coded form.
   * @return offerType
  **/
  @JsonProperty("OfferType")
  public String getOfferType() {
    if (offerType == null) {
      return null;
    }
    return offerType.value();
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  public OBReadOffer1DataOffer offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

 /**
   * Rate associated with the offer type.
   * @return rate
  **/
  @JsonProperty("Rate")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBReadOffer1DataOffer rate(String rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  **/
  @JsonProperty("StartDateTime")
  public String getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBReadOffer1DataOffer startDateTime(String startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

 /**
   * Further details of the term of the offer.
   * @return term
  **/
  @JsonProperty("Term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public OBReadOffer1DataOffer term(String term) {
    this.term = term;
    return this;
  }

 /**
   * URL (Uniform Resource Locator) where documentation on the offer can be found
   * @return URL
  **/
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public OBReadOffer1DataOffer URL(String URL) {
    this.URL = URL;
    return this;
  }

 /**
   * Value associated with the offer type.
   * @return value
  **/
  @JsonProperty("Value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public OBReadOffer1DataOffer value(Integer value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1DataOffer {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

