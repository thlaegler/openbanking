package com.laegler.openbanking.model;

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

public class ProductDetails  {
  
  @ApiModelProperty(value = "The length/duration of the fee free period")
 /**
   * The length/duration of the fee free period
  **/
  private Float feeFreeLength = null;


@XmlType(name="FeeFreeLengthPeriodEnum")
@XmlEnum(String.class)
public enum FeeFreeLengthPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("Half Year") HALF_YEAR(String.valueOf("Half Year")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


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

  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")
 /**
   * Optional additional notes to supplement the Core product details
  **/
  private List<String> notes = null;


@XmlType(name="SegmentEnum")
@XmlEnum(String.class)
public enum SegmentEnum {

@XmlEnumValue("ClientAccount") CLIENTACCOUNT(String.valueOf("ClientAccount")), @XmlEnumValue("Standard") STANDARD(String.valueOf("Standard")), @XmlEnumValue("NonCommercialChaitiesClbSoc") NONCOMMERCIALCHAITIESCLBSOC(String.valueOf("NonCommercialChaitiesClbSoc")), @XmlEnumValue("NonCommercialPublicAuthGovt") NONCOMMERCIALPUBLICAUTHGOVT(String.valueOf("NonCommercialPublicAuthGovt")), @XmlEnumValue("Religious") RELIGIOUS(String.valueOf("Religious")), @XmlEnumValue("SectorSpecific") SECTORSPECIFIC(String.valueOf("SectorSpecific")), @XmlEnumValue("Startup") STARTUP(String.valueOf("Startup")), @XmlEnumValue("Switcher") SWITCHER(String.valueOf("Switcher"));


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

  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. ")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. 
  **/
  private List<SegmentEnum> segment = null;
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

  public ProductDetails feeFreeLength(Float feeFreeLength) {
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

  public ProductDetails feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

 /**
   * Optional additional notes to supplement the Core product details
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public ProductDetails notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public ProductDetails addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to BCA products, they are segmented in relation to different markets that they wish to focus on. 
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public ProductDetails segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public ProductDetails addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails {\n");
    
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

