package com.laegler.openbanking.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBCallbackUrlData1  {
  
  @ApiModelProperty(required = true, value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
 /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
  **/
  private String url = null;

  @ApiModelProperty(required = true, value = "Version for the event notification.")
 /**
   * Version for the event notification.
  **/
  private String version = null;
 /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
   * @return url
  **/
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OBCallbackUrlData1 url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Version for the event notification.
   * @return version
  **/
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public OBCallbackUrlData1 version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCallbackUrlData1 {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

