package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.BranchResponseBranch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand owned by an organisation
 */
@ApiModel(description = "Brand owned by an organisation")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BranchResponseBrand   {
  @JsonProperty("Branch")
  @Valid
  private List<BranchResponseBranch> branch = new ArrayList<>();

  @JsonProperty("BrandName")
  private String brandName = null;

  public BranchResponseBrand branch(List<BranchResponseBranch> branch) {
    this.branch = branch;
    return this;
  }

  public BranchResponseBrand addBranchItem(BranchResponseBranch branchItem) {
    this.branch.add(branchItem);
    return this;
  }

  /**
   * Information that locates and identifies a specific branch of a financial institution.
   * @return branch
  **/
  @ApiModelProperty(required = true, value = "Information that locates and identifies a specific branch of a financial institution.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<BranchResponseBranch> getBranch() {
    return branch;
  }

  public void setBranch(List<BranchResponseBranch> branch) {
    this.branch = branch;
  }

  public BranchResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Brand Name that an organisation uses to market its products or services to a consumer
   * @return brandName
  **/
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer")
  @NotNull

@Size(min=1,max=140) 
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchResponseBrand branchResponseBrand = (BranchResponseBrand) o;
    return Objects.equals(this.branch, branchResponseBrand.branch) &&
        Objects.equals(this.brandName, branchResponseBrand.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, brandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseBrand {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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

