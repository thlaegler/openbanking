package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBCallbackUrlResponseData1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBCallbackUrlsResponseData1
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBCallbackUrlsResponseData1   {
  @JsonProperty("CallbackUrl")
  @Valid
  private List<OBCallbackUrlResponseData1> callbackUrl = null;

  public OBCallbackUrlsResponseData1 callbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  public OBCallbackUrlsResponseData1 addCallbackUrlItem(OBCallbackUrlResponseData1 callbackUrlItem) {
    if (this.callbackUrl == null) {
      this.callbackUrl = new ArrayList<>();
    }
    this.callbackUrl.add(callbackUrlItem);
    return this;
  }

  /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBCallbackUrlResponseData1> getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCallbackUrlsResponseData1 obCallbackUrlsResponseData1 = (OBCallbackUrlsResponseData1) o;
    return Objects.equals(this.callbackUrl, obCallbackUrlsResponseData1.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

