package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseOtherSegment;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseSMELoanMarketingState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SMELoan means SME unsecured loan.
 */
@ApiModel(description = "SMELoan means SME unsecured loan.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class UnsecuredSMELendingResponseSMELoan   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("OtherSegment")
  @Valid
  private List<UnsecuredSMELendingResponseOtherSegment> otherSegment = null;

  @JsonProperty("SMELoanMarketingState")
  @Valid
  private List<UnsecuredSMELendingResponseSMELoanMarketingState> smELoanMarketingState = new ArrayList<>();

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.
   */
  public enum SegmentEnum {
    AGRICULTURESECTOR("AgricultureSector"),
    
    BUSINESS("Business"),
    
    FLEXIBLEBUSINESSLOAN("FlexibleBusinessLoan"),
    
    FIXEDGROUP("FixedGroup"),
    
    GOVERNMENTSCHEME("GovernmentScheme"),
    
    OTHER("Other"),
    
    SECTORSPECIFIC("SectorSpecific");

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

  public UnsecuredSMELendingResponseSMELoan identification(String identification) {
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

  public UnsecuredSMELendingResponseSMELoan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the SME Loan product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnsecuredSMELendingResponseSMELoan otherSegment(List<UnsecuredSMELendingResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoan addOtherSegmentItem(UnsecuredSMELendingResponseOtherSegment otherSegmentItem) {
    if (this.otherSegment == null) {
      this.otherSegment = new ArrayList<>();
    }
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

  /**
   * Other segment code which is not available in the standard code set
   * @return otherSegment
  **/
  @ApiModelProperty(value = "Other segment code which is not available in the standard code set")

  @Valid

  public List<UnsecuredSMELendingResponseOtherSegment> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<UnsecuredSMELendingResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
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
   * The marketing state (promotional or regular) of the SME Loan Product.
   * @return smELoanMarketingState
  **/
  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the SME Loan Product.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<UnsecuredSMELendingResponseSMELoanMarketingState> getSmELoanMarketingState() {
    return smELoanMarketingState;
  }

  public void setSmELoanMarketingState(List<UnsecuredSMELendingResponseSMELoanMarketingState> smELoanMarketingState) {
    this.smELoanMarketingState = smELoanMarketingState;
  }

  public UnsecuredSMELendingResponseSMELoan segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public UnsecuredSMELendingResponseSMELoan addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @ApiModelProperty(required = true, value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook  With respect to SME Loan products, they are segmented in relation to different markets that they wish to focus on.")
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
    UnsecuredSMELendingResponseSMELoan unsecuredSMELendingResponseSMELoan = (UnsecuredSMELendingResponseSMELoan) o;
    return Objects.equals(this.identification, unsecuredSMELendingResponseSMELoan.identification) &&
        Objects.equals(this.name, unsecuredSMELendingResponseSMELoan.name) &&
        Objects.equals(this.otherSegment, unsecuredSMELendingResponseSMELoan.otherSegment) &&
        Objects.equals(this.smELoanMarketingState, unsecuredSMELendingResponseSMELoan.smELoanMarketingState) &&
        Objects.equals(this.segment, unsecuredSMELendingResponseSMELoan.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, otherSegment, smELoanMarketingState, segment);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

