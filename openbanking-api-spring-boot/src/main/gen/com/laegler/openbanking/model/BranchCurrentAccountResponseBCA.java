package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.BranchCurrentAccountResponseBCAMarketingState;
import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BCA means a Business Current Account.
 */
@ApiModel(description = "BCA means a Business Current Account.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class BranchCurrentAccountResponseBCA   {
  @JsonProperty("BCAMarketingState")
  @Valid
  private List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState = new ArrayList<>();

  @JsonProperty("FeeFreeLength")
  private Float feeFreeLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   */
  public enum FeeFreeLengthPeriodEnum {
    DAY("Day"),
    
    HALFYEAR("HalfYear"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
    YEAR("Year");

    private String value;

    FeeFreeLengthPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeFreeLengthPeriodEnum fromValue(String text) {
      for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("FeeFreeLengthPeriod")
  private FeeFreeLengthPeriodEnum feeFreeLengthPeriod = null;

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
  private List<BranchCurrentAccountResponseOtherSegment> otherSegment = null;

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
   */
  public enum SegmentEnum {
    CLIENTACCOUNT("ClientAccount"),
    
    STANDARD("Standard"),
    
    NONCOMMERCIALCHAITIESCLBSOC("NonCommercialChaitiesClbSoc"),
    
    NONCOMMERCIALPUBLICAUTHGOVT("NonCommercialPublicAuthGovt"),
    
    OTHER("Other"),
    
    RELIGIOUS("Religious"),
    
    SECTORSPECIFIC("SectorSpecific"),
    
    STARTUP("Startup"),
    
    SWITCHER("Switcher"),
    
    NONCOMMERCIAL("NonCommercial");

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

  public BranchCurrentAccountResponseBCA bcAMarketingState(List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState) {
    this.bcAMarketingState = bcAMarketingState;
    return this;
  }

  public BranchCurrentAccountResponseBCA addBcAMarketingStateItem(BranchCurrentAccountResponseBCAMarketingState bcAMarketingStateItem) {
    this.bcAMarketingState.add(bcAMarketingStateItem);
    return this;
  }

  /**
   * The marketing state (promotional or regular) of the BCA Product.
   * @return bcAMarketingState
  **/
  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the BCA Product.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<BranchCurrentAccountResponseBCAMarketingState> getBcAMarketingState() {
    return bcAMarketingState;
  }

  public void setBcAMarketingState(List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState) {
    this.bcAMarketingState = bcAMarketingState;
  }

  public BranchCurrentAccountResponseBCA feeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

  /**
   * The length/duration of the fee free period
   * @return feeFreeLength
  **/
  @ApiModelProperty(value = "The length/duration of the fee free period")


  public Float getFeeFreeLength() {
    return feeFreeLength;
  }

  public void setFeeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public BranchCurrentAccountResponseBCA feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")


  public FeeFreeLengthPeriodEnum getFeeFreeLengthPeriod() {
    return feeFreeLengthPeriod;
  }

  public void setFeeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public BranchCurrentAccountResponseBCA identification(String identification) {
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

  public BranchCurrentAccountResponseBCA name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the BCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the BCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  @NotNull

@Size(min=1,max=350) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchCurrentAccountResponseBCA notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseBCA addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseBCA onSaleIndicator(Boolean onSaleIndicator) {
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

  public BranchCurrentAccountResponseBCA otherSegment(List<BranchCurrentAccountResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public BranchCurrentAccountResponseBCA addOtherSegmentItem(BranchCurrentAccountResponseOtherSegment otherSegmentItem) {
    if (this.otherSegment == null) {
      this.otherSegment = new ArrayList<>();
    }
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

  /**
   * Other Segment not available in the standard segment list
   * @return otherSegment
  **/
  @ApiModelProperty(value = "Other Segment not available in the standard segment list")

  @Valid

  public List<BranchCurrentAccountResponseOtherSegment> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<BranchCurrentAccountResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
  }

  public BranchCurrentAccountResponseBCA segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public BranchCurrentAccountResponseBCA addSegmentItem(SegmentEnum segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.")


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
    BranchCurrentAccountResponseBCA branchCurrentAccountResponseBCA = (BranchCurrentAccountResponseBCA) o;
    return Objects.equals(this.bcAMarketingState, branchCurrentAccountResponseBCA.bcAMarketingState) &&
        Objects.equals(this.feeFreeLength, branchCurrentAccountResponseBCA.feeFreeLength) &&
        Objects.equals(this.feeFreeLengthPeriod, branchCurrentAccountResponseBCA.feeFreeLengthPeriod) &&
        Objects.equals(this.identification, branchCurrentAccountResponseBCA.identification) &&
        Objects.equals(this.name, branchCurrentAccountResponseBCA.name) &&
        Objects.equals(this.notes, branchCurrentAccountResponseBCA.notes) &&
        Objects.equals(this.onSaleIndicator, branchCurrentAccountResponseBCA.onSaleIndicator) &&
        Objects.equals(this.otherSegment, branchCurrentAccountResponseBCA.otherSegment) &&
        Objects.equals(this.segment, branchCurrentAccountResponseBCA.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcAMarketingState, feeFreeLength, feeFreeLengthPeriod, identification, name, notes, onSaleIndicator, otherSegment, segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseBCA {\n");
    
    sb.append("    bcAMarketingState: ").append(toIndentedString(bcAMarketingState)).append("\n");
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    onSaleIndicator: ").append(toIndentedString(onSaleIndicator)).append("\n");
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

