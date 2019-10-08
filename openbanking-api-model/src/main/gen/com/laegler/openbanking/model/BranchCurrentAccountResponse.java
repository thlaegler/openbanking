package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.BranchCurrentAccountResponseData;
import com.laegler.openbanking.model.MetaData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchCurrentAccountResponse
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BranchCurrentAccountResponse   {
  @JsonProperty("data")
  @Valid
  private List<BranchCurrentAccountResponseData> data = new ArrayList<>();

  @JsonProperty("meta")
  private MetaData meta = null;

  public BranchCurrentAccountResponse data(List<BranchCurrentAccountResponseData> data) {
    this.data = data;
    return this;
  }

  public BranchCurrentAccountResponse addDataItem(BranchCurrentAccountResponseData dataItem) {
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

  public List<BranchCurrentAccountResponseData> getData() {
    return data;
  }

  public void setData(List<BranchCurrentAccountResponseData> data) {
    this.data = data;
  }

  public BranchCurrentAccountResponse meta(MetaData meta) {
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
    BranchCurrentAccountResponse branchCurrentAccountResponse = (BranchCurrentAccountResponse) o;
    return Objects.equals(this.data, branchCurrentAccountResponse.data) &&
        Objects.equals(this.meta, branchCurrentAccountResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

