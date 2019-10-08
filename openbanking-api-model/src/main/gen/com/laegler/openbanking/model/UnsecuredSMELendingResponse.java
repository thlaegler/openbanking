package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.MetaData;
import com.laegler.openbanking.model.UnsecuredSMELendingResponseData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UnsecuredSMELendingResponse
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class UnsecuredSMELendingResponse   {
  @JsonProperty("data")
  @Valid
  private List<UnsecuredSMELendingResponseData> data = new ArrayList<>();

  @JsonProperty("meta")
  private MetaData meta = null;

  public UnsecuredSMELendingResponse data(List<UnsecuredSMELendingResponseData> data) {
    this.data = data;
    return this;
  }

  public UnsecuredSMELendingResponse addDataItem(UnsecuredSMELendingResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<UnsecuredSMELendingResponseData> getData() {
    return data;
  }

  public void setData(List<UnsecuredSMELendingResponseData> data) {
    this.data = data;
  }

  public UnsecuredSMELendingResponse meta(MetaData meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MetaData getMeta() {
    return meta;
  }

  public void setMeta(MetaData meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsecuredSMELendingResponse unsecuredSMELendingResponse = (UnsecuredSMELendingResponse) o;
    return Objects.equals(this.data, unsecuredSMELendingResponse.data) &&
        Objects.equals(this.meta, unsecuredSMELendingResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsecuredSMELendingResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

