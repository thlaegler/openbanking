package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.PersonalCurrentAccountResponsePCA;
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
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class PersonalCurrentAccountResponseBrand   {
  @JsonProperty("BrandName")
  private String brandName = null;

  @JsonProperty("PCA")
  @Valid
  private List<PersonalCurrentAccountResponsePCA> PCA = new ArrayList<>();

  public PersonalCurrentAccountResponseBrand brandName(String brandName) {
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

  public PersonalCurrentAccountResponseBrand PCA(List<PersonalCurrentAccountResponsePCA> PCA) {
    this.PCA = PCA;
    return this;
  }

  public PersonalCurrentAccountResponseBrand addPCAItem(PersonalCurrentAccountResponsePCA PCAItem) {
    this.PCA.add(PCAItem);
    return this;
  }

  /**
   * PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.
   * @return PCA
  **/
  @ApiModelProperty(required = true, value = "PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<PersonalCurrentAccountResponsePCA> getPCA() {
    return PCA;
  }

  public void setPCA(List<PersonalCurrentAccountResponsePCA> PCA) {
    this.PCA = PCA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalCurrentAccountResponseBrand personalCurrentAccountResponseBrand = (PersonalCurrentAccountResponseBrand) o;
    return Objects.equals(this.brandName, personalCurrentAccountResponseBrand.brandName) &&
        Objects.equals(this.PCA, personalCurrentAccountResponseBrand.PCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, PCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCurrentAccountResponseBrand {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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

