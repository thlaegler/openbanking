package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBCallbackUrlResponseData1;
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

public class OBCallbackUrlsResponseData1  {
  
  @ApiModelProperty(value = "")
  private List<OBCallbackUrlResponseData1> callbackUrl = null;
 /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @JsonProperty("CallbackUrl")
  public List<OBCallbackUrlResponseData1> getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public OBCallbackUrlsResponseData1 callbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  public OBCallbackUrlsResponseData1 addCallbackUrlItem(OBCallbackUrlResponseData1 callbackUrlItem) {
    this.callbackUrl.add(callbackUrlItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCallbackUrlsResponseData1 {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

