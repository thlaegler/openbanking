package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.PersonalCurrentAccountResponsePCAMarketingState;
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
  * PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.
 **/
@ApiModel(description="PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.")
public class PersonalCurrentAccountResponsePCA  {
  
  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
  **/
  private String identification = null;

  @ApiModelProperty(required = true, value = "The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
  **/
  private String name = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the product details")
 /**
   * Optional additional notes to supplement the product details
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Indicates that the published product is OnSale(value 1) or Back Book (value 0)")
 /**
   * Indicates that the published product is OnSale(value 1) or Back Book (value 0)
  **/
  private Boolean onSaleIndicator = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OtherFeeCategory> otherSegment = null;

  @ApiModelProperty(required = true, value = "Describes the type of the known state (regular, promotional )  of the product.")
  @Valid
 /**
   * Describes the type of the known state (regular, promotional )  of the product.
  **/
  private List<PersonalCurrentAccountResponsePCAMarketingState> pcAMarketingState = new ArrayList<PersonalCurrentAccountResponsePCAMarketingState>();


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("Basic") BASIC(String.valueOf("Basic")), @XmlEnumValue("BenefitAndReward") BENEFITANDREWARD(String.valueOf("BenefitAndReward")), @XmlEnumValue("CreditInterest") CREDITINTEREST(String.valueOf("CreditInterest")), @XmlEnumValue("Cashback") CASHBACK(String.valueOf("Cashback")), @XmlEnumValue("General") GENERAL(String.valueOf("General")), @XmlEnumValue("Graduate") GRADUATE(String.valueOf("Graduate")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Overdraft") OVERDRAFT(String.valueOf("Overdraft")), @XmlEnumValue("Packaged") PACKAGED(String.valueOf("Packaged")), @XmlEnumValue("Premium") PREMIUM(String.valueOf("Premium")), @XmlEnumValue("Reward") REWARD(String.valueOf("Reward")), @XmlEnumValue("Student") STUDENT(String.valueOf("Student")), @XmlEnumValue("YoungAdult") YOUNGADULT(String.valueOf("YoungAdult")), @XmlEnumValue("Youth") YOUTH(String.valueOf("Youth"));


    private String value;

    SegmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SegmentEnum fromValue(String v) {
        for (SegmentEnum b : SegmentEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.
  **/
  private List<SegmentEnum> segment = null;
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
 @Size(min=1,max=40)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PersonalCurrentAccountResponsePCA identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=350)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalCurrentAccountResponsePCA name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Optional additional notes to supplement the product details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public PersonalCurrentAccountResponsePCA notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Indicates that the published product is OnSale(value 1) or Back Book (value 0)
   * @return onSaleIndicator
  **/
  @JsonProperty("OnSaleIndicator")
  public Boolean isOnSaleIndicator() {
    return onSaleIndicator;
  }

  public void setOnSaleIndicator(Boolean onSaleIndicator) {
    this.onSaleIndicator = onSaleIndicator;
  }

  public PersonalCurrentAccountResponsePCA onSaleIndicator(Boolean onSaleIndicator) {
    this.onSaleIndicator = onSaleIndicator;
    return this;
  }

 /**
   * Get otherSegment
   * @return otherSegment
  **/
  @JsonProperty("OtherSegment")
  public List<OtherFeeCategory> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
  }

  public PersonalCurrentAccountResponsePCA otherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addOtherSegmentItem(OtherFeeCategory otherSegmentItem) {
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

 /**
   * Describes the type of the known state (regular, promotional )  of the product.
   * @return pcAMarketingState
  **/
  @JsonProperty("PCAMarketingState")
  @NotNull
 @Size(min=1)  public List<PersonalCurrentAccountResponsePCAMarketingState> getPcAMarketingState() {
    return pcAMarketingState;
  }

  public void setPcAMarketingState(List<PersonalCurrentAccountResponsePCAMarketingState> pcAMarketingState) {
    this.pcAMarketingState = pcAMarketingState;
  }

  public PersonalCurrentAccountResponsePCA pcAMarketingState(List<PersonalCurrentAccountResponsePCAMarketingState> pcAMarketingState) {
    this.pcAMarketingState = pcAMarketingState;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addPcAMarketingStateItem(PersonalCurrentAccountResponsePCAMarketingState pcAMarketingStateItem) {
    this.pcAMarketingState.add(pcAMarketingStateItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public PersonalCurrentAccountResponsePCA segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCurrentAccountResponsePCA {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    onSaleIndicator: ").append(toIndentedString(onSaleIndicator)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
    sb.append("    pcAMarketingState: ").append(toIndentedString(pcAMarketingState)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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

