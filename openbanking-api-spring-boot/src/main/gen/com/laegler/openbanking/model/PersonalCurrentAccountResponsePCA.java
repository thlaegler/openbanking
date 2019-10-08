package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherFeeCategory;
import com.laegler.openbanking.model.PersonalCurrentAccountResponsePCAMarketingState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PCA&#39; means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.
 */
@ApiModel(description = "PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class PersonalCurrentAccountResponsePCA   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OnSaleIndicator")
  private Boolean onSaleIndicator = null;

  @JsonProperty("OtherSegment")
  @Valid
  private List<OtherFeeCategory> otherSegment = null;

  @JsonProperty("PCAMarketingState")
  @Valid
  private List<PersonalCurrentAccountResponsePCAMarketingState> pcAMarketingState = new ArrayList<>();

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.
   */
  public enum SegmentEnum {
    BASIC("Basic"),
    
    BENEFITANDREWARD("BenefitAndReward"),
    
    CREDITINTEREST("CreditInterest"),
    
    CASHBACK("Cashback"),
    
    GENERAL("General"),
    
    GRADUATE("Graduate"),
    
    OTHER("Other"),
    
    OVERDRAFT("Overdraft"),
    
    PACKAGED("Packaged"),
    
    PREMIUM("Premium"),
    
    REWARD("Reward"),
    
    STUDENT("Student"),
    
    YOUNGADULT("YoungAdult"),
    
    YOUTH("Youth");

    private String value;

    SegmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SegmentEnum fromValue(String text) {
      for (SegmentEnum b : SegmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Segment")
  @Valid
  private List<SegmentEnum> segment = null;

  public PersonalCurrentAccountResponsePCA identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
  @NotNull

@Size(min=1,max=40) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PersonalCurrentAccountResponsePCA name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the PCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalCurrentAccountResponsePCA notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the product details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the product details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public PersonalCurrentAccountResponsePCA onSaleIndicator(Boolean onSaleIndicator) {
    this.onSaleIndicator = onSaleIndicator;
    return this;
  }

  /**
   * Indicates that the published product is OnSale(value 1) or Back Book (value 0)
   * @return onSaleIndicator
  **/
  @ApiModelProperty(value = "Indicates that the published product is OnSale(value 1) or Back Book (value 0)")


  public Boolean isOnSaleIndicator() {
    return onSaleIndicator;
  }

  public void setOnSaleIndicator(Boolean onSaleIndicator) {
    this.onSaleIndicator = onSaleIndicator;
  }

  public PersonalCurrentAccountResponsePCA otherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addOtherSegmentItem(OtherFeeCategory otherSegmentItem) {
    if (this.otherSegment == null) {
      this.otherSegment = new ArrayList<>();
    }
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

  /**
   * Get otherSegment
   * @return otherSegment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OtherFeeCategory> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
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
   * Describes the type of the known state (regular, promotional )  of the product.
   * @return pcAMarketingState
  **/
  @ApiModelProperty(required = true, value = "Describes the type of the known state (regular, promotional )  of the product.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<PersonalCurrentAccountResponsePCAMarketingState> getPcAMarketingState() {
    return pcAMarketingState;
  }

  public void setPcAMarketingState(List<PersonalCurrentAccountResponsePCAMarketingState> pcAMarketingState) {
    this.pcAMarketingState = pcAMarketingState;
  }

  public PersonalCurrentAccountResponsePCA segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public PersonalCurrentAccountResponsePCA addSegmentItem(SegmentEnum segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.
   * @return segment
  **/
  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. For example, Basic PCA products target consumers with poor credit history, Reward PCA products target consumers who spend a lot, and Premium products target High Net Worth individuals.")


  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalCurrentAccountResponsePCA personalCurrentAccountResponsePCA = (PersonalCurrentAccountResponsePCA) o;
    return Objects.equals(this.identification, personalCurrentAccountResponsePCA.identification) &&
        Objects.equals(this.name, personalCurrentAccountResponsePCA.name) &&
        Objects.equals(this.notes, personalCurrentAccountResponsePCA.notes) &&
        Objects.equals(this.onSaleIndicator, personalCurrentAccountResponsePCA.onSaleIndicator) &&
        Objects.equals(this.otherSegment, personalCurrentAccountResponsePCA.otherSegment) &&
        Objects.equals(this.pcAMarketingState, personalCurrentAccountResponsePCA.pcAMarketingState) &&
        Objects.equals(this.segment, personalCurrentAccountResponsePCA.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, notes, onSaleIndicator, otherSegment, pcAMarketingState, segment);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

