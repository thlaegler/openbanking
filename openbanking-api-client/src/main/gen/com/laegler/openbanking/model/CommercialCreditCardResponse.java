package com.laegler.openbanking.model;

import com.laegler.openbanking.model.CommercialCreditCardResponseData;
import com.laegler.openbanking.model.MetaData;
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

public class CommercialCreditCardResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private List<CommercialCreditCardResponseData> data = new ArrayList<CommercialCreditCardResponseData>();

  @ApiModelProperty(required = true, value = "")
  private MetaData meta = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<CommercialCreditCardResponseData> getData() {
    return data;
  }

  public void setData(List<CommercialCreditCardResponseData> data) {
    this.data = data;
  }

  public CommercialCreditCardResponse data(List<CommercialCreditCardResponseData> data) {
    this.data = data;
    return this;
  }

  public CommercialCreditCardResponse addDataItem(CommercialCreditCardResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public MetaData getMeta() {
    return meta;
  }

  public void setMeta(MetaData meta) {
    this.meta = meta;
  }

  public CommercialCreditCardResponse meta(MetaData meta) {
    this.meta = meta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialCreditCardResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

