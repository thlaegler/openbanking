package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.CommercialCreditCardResponseCCCMarketingState;
import com.laegler.openbanking.model.OtherFeeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CCC means a Commercial Credit Card.
 */
@ApiModel(description = "CCC means a Commercial Credit Card.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class CommercialCreditCardResponseCCC   {
  @JsonProperty("CCCMarketingState")
  @Valid
  private List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState = new ArrayList<>();

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("OtherSegment")
  @Valid
  private List<OtherFeeCategory> otherSegment = null;

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.
   */
  public enum SegmentEnum {
    GENERAL("General"),
    
    OTHER("Other");

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
  private List<SegmentEnum> segment = new ArrayList<>();

  public CommercialCreditCardResponseCCC ccCMarketingState(List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState) {
    this.ccCMarketingState = ccCMarketingState;
    return this;
  }

  public CommercialCreditCardResponseCCC addCcCMarketingStateItem(CommercialCreditCardResponseCCCMarketingState ccCMarketingStateItem) {
    this.ccCMarketingState.add(ccCMarketingStateItem);
    return this;
  }

  /**
   * The marketing state (promotional or regular) of the CCC Product.
   * @return ccCMarketingState
  **/
  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the CCC Product.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<CommercialCreditCardResponseCCCMarketingState> getCcCMarketingState() {
    return ccCMarketingState;
  }

  public void setCcCMarketingState(List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState) {
    this.ccCMarketingState = ccCMarketingState;
  }

  public CommercialCreditCardResponseCCC identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers.")
  @NotNull

@Size(min=1,max=40) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CommercialCreditCardResponseCCC name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommercialCreditCardResponseCCC otherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public CommercialCreditCardResponseCCC addOtherSegmentItem(OtherFeeCategory otherSegmentItem) {
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

  public CommercialCreditCardResponseCCC segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public CommercialCreditCardResponseCCC addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @ApiModelProperty(required = true, value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.")
  @NotNull

@Size(min=1) 
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
    CommercialCreditCardResponseCCC commercialCreditCardResponseCCC = (CommercialCreditCardResponseCCC) o;
    return Objects.equals(this.ccCMarketingState, commercialCreditCardResponseCCC.ccCMarketingState) &&
        Objects.equals(this.identification, commercialCreditCardResponseCCC.identification) &&
        Objects.equals(this.name, commercialCreditCardResponseCCC.name) &&
        Objects.equals(this.otherSegment, commercialCreditCardResponseCCC.otherSegment) &&
        Objects.equals(this.segment, commercialCreditCardResponseCCC.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccCMarketingState, identification, name, otherSegment, segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialCreditCardResponseCCC {\n");
    
    sb.append("    ccCMarketingState: ").append(toIndentedString(ccCMarketingState)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
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

