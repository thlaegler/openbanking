package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.BranchCurrentAccountResponseBCA;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand registered by the banking group at https://register.fca.org.uk/
 */
@ApiModel(description = "Brand registered by the banking group at https://register.fca.org.uk/")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class BranchCurrentAccountResponseBrand   {
  @JsonProperty("BCA")
  @Valid
  private List<BranchCurrentAccountResponseBCA> BCA = new ArrayList<>();

  @JsonProperty("BrandName")
  private String brandName = null;

  public BranchCurrentAccountResponseBrand BCA(List<BranchCurrentAccountResponseBCA> BCA) {
    this.BCA = BCA;
    return this;
  }

  public BranchCurrentAccountResponseBrand addBCAItem(BranchCurrentAccountResponseBCA BCAItem) {
    this.BCA.add(BCAItem);
    return this;
  }

  /**
   * BCA means a Business Current Account.
   * @return BCA
  **/
  @ApiModelProperty(required = true, value = "BCA means a Business Current Account.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<BranchCurrentAccountResponseBCA> getBCA() {
    return BCA;
  }

  public void setBCA(List<BranchCurrentAccountResponseBCA> BCA) {
    this.BCA = BCA;
  }

  public BranchCurrentAccountResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
   * @return brandName
  **/
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
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
    BranchCurrentAccountResponseBrand branchCurrentAccountResponseBrand = (BranchCurrentAccountResponseBrand) o;
    return Objects.equals(this.BCA, branchCurrentAccountResponseBrand.BCA) &&
        Objects.equals(this.brandName, branchCurrentAccountResponseBrand.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BCA, brandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchCurrentAccountResponseBrand {\n");
    
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
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

