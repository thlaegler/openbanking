package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseData;
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

public class BranchCurrentAccountResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private List<BranchCurrentAccountResponseData> data = new ArrayList<BranchCurrentAccountResponseData>();

  @ApiModelProperty(required = true, value = "")
  private MetaData meta = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<BranchCurrentAccountResponseData> getData() {
    return data;
  }

  public void setData(List<BranchCurrentAccountResponseData> data) {
    this.data = data;
  }

  public BranchCurrentAccountResponse data(List<BranchCurrentAccountResponseData> data) {
    this.data = data;
    return this;
  }

  public BranchCurrentAccountResponse addDataItem(BranchCurrentAccountResponseData dataItem) {
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

  public BranchCurrentAccountResponse meta(MetaData meta) {
    this.meta = meta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponse {\n");
    
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

