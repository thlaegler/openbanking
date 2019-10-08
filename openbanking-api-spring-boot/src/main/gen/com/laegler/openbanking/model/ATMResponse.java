package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.ATMResponseData;
import com.laegler.openbanking.model.MetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ATMResponse
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class ATMResponse   {
  @JsonProperty("data")
  @Valid
  private List<ATMResponseData> data = new ArrayList<>();

  @JsonProperty("meta")
  private MetaData meta = null;

  public ATMResponse data(List<ATMResponseData> data) {
    this.data = data;
    return this;
  }

  public ATMResponse addDataItem(ATMResponseData dataItem) {
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

  public List<ATMResponseData> getData() {
    return data;
  }

  public void setData(List<ATMResponseData> data) {
    this.data = data;
  }

  public ATMResponse meta(MetaData meta) {
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
    ATMResponse atMResponse = (ATMResponse) o;
    return Objects.equals(this.data, atMResponse.data) &&
        Objects.equals(this.meta, atMResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMResponse {\n");
    
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

