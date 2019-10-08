package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.BranchResponseBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Environment of the branch
 */
@ApiModel(description = "Environment of the branch")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class BranchResponseData   {
  @JsonProperty("Brand")
  @Valid
  private List<BranchResponseBrand> brand = new ArrayList<>();

  public BranchResponseData brand(List<BranchResponseBrand> brand) {
    this.brand = brand;
    return this;
  }

  public BranchResponseData addBrandItem(BranchResponseBrand brandItem) {
    this.brand.add(brandItem);
    return this;
  }

  /**
   * Brand owned by an organisation
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "Brand owned by an organisation")
  @NotNull

  @Valid
@Size(min=1) 
  public List<BranchResponseBrand> getBrand() {
    return brand;
  }

  public void setBrand(List<BranchResponseBrand> brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchResponseData branchResponseData = (BranchResponseData) o;
    return Objects.equals(this.brand, branchResponseData.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseData {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

