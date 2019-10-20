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

public class ProductDetails1  {
  
  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
  **/
  private String monthlyMaximumCharge = null;

  @ApiModelProperty(value = "Optional additional notes to supplement the Core product details")
 /**
   * Optional additional notes to supplement the Core product details
  **/
  private List<String> notes = null;


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

  @ApiModelProperty(value = "Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. ")
 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
  **/
  private List<SegmentEnum> segment = null;
 /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @JsonProperty("MonthlyMaximumCharge")
  public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public ProductDetails1 monthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
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

  public ProductDetails1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public ProductDetails1 addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on. 
   * @return segment
  **/
  @JsonProperty("Segment")
  public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public ProductDetails1 segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public ProductDetails1 addSegmentItem(SegmentEnum segmentItem) {
    this.segment.add(segmentItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails1 {\n");
    
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
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

