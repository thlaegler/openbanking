package com.laegler.openbanking.model;

import com.laegler.openbanking.model.UnsecuredSMELendingResponseOtherSegment;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseSMELoanMarketingState;
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
  * SMELoan means SME unsecured loan.
 **/
@ApiModel(description="SMELoan means SME unsecured loan.")
public class UnsecuredSMELendingResponseSMELoan  {
  
  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
  **/
  private String identification = null;

  @ApiModelProperty(required = true, value = "The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
  **/
  private String name = null;

  @ApiModelProperty(value = "Other segment code which is not available in the standard code set")
  @Valid
 /**
   * Other segment code which is not available in the standard code set
  **/
  private List<UnsecuredSMELendingResponseOtherSegment> otherSegment = null;

  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the SME Loan Product.")
  @Valid
 /**
   * The marketing state (promotional or regular) of the SME Loan Product.
  **/
  private List<UnsecuredSMELendingResponseSMELoanMarketingState> smELoanMarketingState = new ArrayList<UnsecuredSMELendingResponseSMELoanMarketingState>();


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("AgricultureSector") AGRICULTURESECTOR(String.valueOf("AgricultureSector")), @XmlEnumValue("Business") BUSINESS(String.valueOf("Business")), @XmlEnumValue("FlexibleBusinessLoan") FLEXIBLEBUSINESSLOAN(String.valueOf("FlexibleBusinessLoan")), @XmlEnumValue("FixedGroup") FIXEDGROUP(String.valueOf("FixedGroup")), @XmlEnumValue("GovernmentScheme") GOVERNMENTSCHEME(String.valueOf("GovernmentScheme")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("SectorSpecific") SECTORSPECIFIC(String.valueOf("SectorSpecific"));


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

  @ApiModelProperty(required = true, value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.
  **/
  private List<SegmentEnum> segment = new ArrayList<SegmentEnum>();
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

  public UnsecuredSMELendingResponseSMELoan identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
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

  public UnsecuredSMELendingResponseSMELoan name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Other segment code which is not available in the standard code set
   * @return otherSegment
  **/
  @JsonProperty("OtherSegment")
  public List<UnsecuredSMELendingResponseOtherSegment> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<UnsecuredSMELendingResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
  }

  public UnsecuredSMELendingResponseSMELoan otherSegment(List<UnsecuredSMELendingResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoan addOtherSegmentItem(UnsecuredSMELendingResponseOtherSegment otherSegmentItem) {
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

 /**
   * The marketing state (promotional or regular) of the SME Loan Product.
   * @return smELoanMarketingState
  **/
  @JsonProperty("SMELoanMarketingState")
  @NotNull
 @Size(min=1)  public List<UnsecuredSMELendingResponseSMELoanMarketingState> getSmELoanMarketingState() {
    return smELoanMarketingState;
  }

  public void setSmELoanMarketingState(List<UnsecuredSMELendingResponseSMELoanMarketingState> smELoanMarketingState) {
    this.smELoanMarketingState = smELoanMarketingState;
  }

  public UnsecuredSMELendingResponseSMELoan smELoanMarketingState(List<UnsecuredSMELendingResponseSMELoanMarketingState> smELoanMarketingState) {
    this.smELoanMarketingState = smELoanMarketingState;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoan addSmELoanMarketingStateItem(UnsecuredSMELendingResponseSMELoanMarketingState smELoanMarketingStateItem) {
    this.smELoanMarketingState.add(smELoanMarketingStateItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @JsonProperty("Segment")
  @NotNull
 @Size(min=1)  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public UnsecuredSMELendingResponseSMELoan segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoan addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponseSMELoan {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
    sb.append("    smELoanMarketingState: ").append(toIndentedString(smELoanMarketingState)).append("\n");
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

