package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseBCAMarketingState;
import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherSegment;
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
  * BCA means a Business Current Account.
 **/
@ApiModel(description="BCA means a Business Current Account.")
public class BranchCurrentAccountResponseBCA  {
  
  @ApiModelProperty(required = true, value = "The marketing state (promotional or regular) of the BCA Product.")
 /**
   * The marketing state (promotional or regular) of the BCA Product.
  **/
  private List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState = new ArrayList<BranchCurrentAccountResponseBCAMarketingState>();

  @ApiModelProperty(value = "The length/duration of the fee free period")
 /**
   * The length/duration of the fee free period
  **/
  private Float feeFreeLength = null;


@XmlType(name="FeeFreeLengthPeriodEnum")
@XmlEnum(String.class)
public enum FeeFreeLengthPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("HalfYear") HALFYEAR(String.valueOf("HalfYear")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    FeeFreeLengthPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeFreeLengthPeriodEnum fromValue(String v) {
        for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")
 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
  **/
  private FeeFreeLengthPeriodEnum feeFreeLengthPeriod = null;

  @ApiModelProperty(required = true, value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
  **/
  private String identification = null;

  @ApiModelProperty(required = true, value = "The name of the BCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
 /**
   * The name of the BCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
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

  @ApiModelProperty(value = "Other Segment not available in the standard segment list")
 /**
   * Other Segment not available in the standard segment list
  **/
  private List<BranchCurrentAccountResponseOtherSegment> otherSegment = null;


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("ClientAccount") CLIENTACCOUNT(String.valueOf("ClientAccount")), @XmlEnumValue("Standard") STANDARD(String.valueOf("Standard")), @XmlEnumValue("NonCommercialChaitiesClbSoc") NONCOMMERCIALCHAITIESCLBSOC(String.valueOf("NonCommercialChaitiesClbSoc")), @XmlEnumValue("NonCommercialPublicAuthGovt") NONCOMMERCIALPUBLICAUTHGOVT(String.valueOf("NonCommercialPublicAuthGovt")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Religious") RELIGIOUS(String.valueOf("Religious")), @XmlEnumValue("SectorSpecific") SECTORSPECIFIC(String.valueOf("SectorSpecific")), @XmlEnumValue("Startup") STARTUP(String.valueOf("Startup")), @XmlEnumValue("Switcher") SWITCHER(String.valueOf("Switcher")), @XmlEnumValue("NonCommercial") NONCOMMERCIAL(String.valueOf("NonCommercial"));


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

  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
  **/
  private List<SegmentEnum> segment = null;
 /**
   * The marketing state (promotional or regular) of the BCA Product.
   * @return bcAMarketingState
  **/
  @JsonProperty("BCAMarketingState")
  public List<BranchCurrentAccountResponseBCAMarketingState> getBcAMarketingState() {
    return bcAMarketingState;
  }

  public void setBcAMarketingState(List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState) {
    this.bcAMarketingState = bcAMarketingState;
  }

  public BranchCurrentAccountResponseBCA bcAMarketingState(List<BranchCurrentAccountResponseBCAMarketingState> bcAMarketingState) {
    this.bcAMarketingState = bcAMarketingState;
    return this;
  }

  public BranchCurrentAccountResponseBCA addBcAMarketingStateItem(BranchCurrentAccountResponseBCAMarketingState bcAMarketingStateItem) {
    this.bcAMarketingState.add(bcAMarketingStateItem);
    return this;
  }

 /**
   * The length/duration of the fee free period
   * @return feeFreeLength
  **/
  @JsonProperty("FeeFreeLength")
  public Float getFeeFreeLength() {
    return feeFreeLength;
  }

  public void setFeeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public BranchCurrentAccountResponseBCA feeFreeLength(Float feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

 /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
  **/
  @JsonProperty("FeeFreeLengthPeriod")
  public String getFeeFreeLengthPeriod() {
    if (feeFreeLengthPeriod == null) {
      return null;
    }
    return feeFreeLengthPeriod.value();
  }

  public void setFeeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public BranchCurrentAccountResponseBCA feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

 /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BranchCurrentAccountResponseBCA identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * The name of the BCA product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchCurrentAccountResponseBCA name(String name) {
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

  public BranchCurrentAccountResponseBCA notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public BranchCurrentAccountResponseBCA addNotesItem(String notesItem) {
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

  public BranchCurrentAccountResponseBCA onSaleIndicator(Boolean onSaleIndicator) {
    this.onSaleIndicator = onSaleIndicator;
    return this;
  }

 /**
   * Other Segment not available in the standard segment list
   * @return otherSegment
  **/
  @JsonProperty("OtherSegment")
  public List<BranchCurrentAccountResponseOtherSegment> getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(List<BranchCurrentAccountResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
  }

  public BranchCurrentAccountResponseBCA otherSegment(List<BranchCurrentAccountResponseOtherSegment> otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  public BranchCurrentAccountResponseBCA addOtherSegmentItem(BranchCurrentAccountResponseOtherSegment otherSegmentItem) {
    this.otherSegment.add(otherSegmentItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  Follow us: Investopedia on Facebook With respect to BCA products, they are segmented in relation to different markets that they wish to focus on.
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public BranchCurrentAccountResponseBCA segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public BranchCurrentAccountResponseBCA addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

