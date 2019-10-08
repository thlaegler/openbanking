package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBCallbackUrlResponseData1
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBCallbackUrlResponseData1   {
  @JsonProperty("CallbackUrlId")
  private String callbackUrlId = null;

  @JsonProperty("Url")
  private String url = null;

  @JsonProperty("Version")
  private String version = null;

  public OBCallbackUrlResponseData1 callbackUrlId(String callbackUrlId) {
    this.callbackUrlId = callbackUrlId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.
   * @return callbackUrlId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getCallbackUrlId() {
    return callbackUrlId;
  }

  public void setCallbackUrlId(String callbackUrlId) {
    this.callbackUrlId = callbackUrlId;
  }

  public OBCallbackUrlResponseData1 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
  @NotNull


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OBCallbackUrlResponseData1 version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version for the event notification.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Version for the event notification.")
  @NotNull

@Size(min=1,max=10) 
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCallbackUrlResponseData1 obCallbackUrlResponseData1 = (OBCallbackUrlResponseData1) o;
    return Objects.equals(this.callbackUrlId, obCallbackUrlResponseData1.callbackUrlId) &&
        Objects.equals(this.url, obCallbackUrlResponseData1.url) &&
        Objects.equals(this.version, obCallbackUrlResponseData1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrlId, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCallbackUrlResponseData1 {\n");
    
    sb.append("    callbackUrlId: ").append(toIndentedString(callbackUrlId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

