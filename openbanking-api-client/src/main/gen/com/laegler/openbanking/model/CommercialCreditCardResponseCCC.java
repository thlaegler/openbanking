package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CommercialCreditCardResponseCCCMarketingState;
import com.laegler.openbanking.model.OtherFeeCategory;
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
  * CCC means a Commercial Credit Card.
 **/
@ApiModel(description="CCC means a Commercial Credit Card.")
public class CommercialCreditCardResponseCCC  {
  
  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the CCC Product.")
 /**
   * The marketing state (promotional or regular) of the CCC Product.
  **/
  private List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState = new ArrayList<CommercialCreditCardResponseCCCMarketingState>();

  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers.")
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers.
  **/
  private String identification = null;

  @ApiModelProperty(required = true, value = "The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private List<OtherFeeCategory> otherSegment = null;


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("General") GENERAL(String.valueOf("General")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


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

  @ApiModelProperty(required = true, value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.
  **/
  private List<SegmentEnum> segment = new ArrayList<SegmentEnum>();
 /**
   * The marketing state (promotional or regular) of the CCC Product.
   * @return ccCMarketingState
  **/
  @JsonProperty("CCCMarketingState")
  public List<CommercialCreditCardResponseCCCMarketingState> getCcCMarketingState() {
    return ccCMarketingState;
  }

  public void setCcCMarketingState(List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState) {
    this.ccCMarketingState = ccCMarketingState;
  }

  public CommercialCreditCardResponseCCC ccCMarketingState(List<CommercialCreditCardResponseCCCMarketingState> ccCMarketingState) {
    this.ccCMarketingState = ccCMarketingState;
    return this;
  }

  public CommercialCreditCardResponseCCC addCcCMarketingStateItem(CommercialCreditCardResponseCCCMarketingState ccCMarketingStateItem) {
    this.ccCMarketingState.add(ccCMarketingStateItem);
    return this;
  }

 /**
   * The unique ID that has been internally assigned by the financial institution to each of the Commercial Credit Card products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public CommercialCreditCardResponseCCC identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * The name of the CCC product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommercialCreditCardResponseCCC name(String name) {
    this.name = name;
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

  public CommercialCreditCardResponseCCC otherSegment(List<OtherFeeCategory> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public CommercialCreditCardResponseCCC addOtherSegmentItem(OtherFeeCategory otherSegmentItem) {
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd Follow us: Investopedia on Facebook With respect to CCC products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public CommercialCreditCardResponseCCC segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public CommercialCreditCardResponseCCC addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

