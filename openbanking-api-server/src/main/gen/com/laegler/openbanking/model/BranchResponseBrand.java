package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchResponseBranch;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Brand owned by an organisation
 **/
@ApiModel(description="Brand owned by an organisation")
public class BranchResponseBrand  {
  
  @ApiModelProperty(required = true, value = "Information that locates and identifies a specific branch of a financial institution.")
  @Valid
 /**
   * Information that locates and identifies a specific branch of a financial institution.
  **/
  private List<BranchResponseBranch> branch = new ArrayList<BranchResponseBranch>();

  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer
  **/
  private String brandName = null;
 /**
   * Information that locates and identifies a specific branch of a financial institution.
   * @return branch
  **/
  @JsonProperty("Branch")
  @NotNull
 @Size(min=1)  public List<BranchResponseBranch> getBranch() {
    return branch;
  }

  public void setBranch(List<BranchResponseBranch> branch) {
    this.branch = branch;
  }

  public BranchResponseBrand branch(List<BranchResponseBranch> branch) {
    this.branch = branch;
    return this;
  }

  public BranchResponseBrand addBranchItem(BranchResponseBranch branchItem) {
    this.branch.add(branchItem);
    return this;
  }

 /**
   * Brand Name that an organisation uses to market its products or services to a consumer
   * @return brandName
  **/
  @JsonProperty("BrandName")
  @NotNull
 @Size(min=1,max=140)  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public BranchResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

