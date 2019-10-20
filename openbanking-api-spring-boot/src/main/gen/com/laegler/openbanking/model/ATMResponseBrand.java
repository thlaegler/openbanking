package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.ATMResponseATM;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand of the Acquirer of transactions captured by the ATM
 */
@ApiModel(description = "Brand of the Acquirer of transactions captured by the ATM")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class ATMResponseBrand   {
  @JsonProperty("ATM")
  @Valid
  private List<ATMResponseATM> ATM = new ArrayList<>();

  @JsonProperty("BrandName")
  private String brandName = null;

  public ATMResponseBrand ATM(List<ATMResponseATM> ATM) {
    this.ATM = ATM;
    return this;
  }

  public ATMResponseBrand addATMItem(ATMResponseATM ATMItem) {
    this.ATM.add(ATMItem);
    return this;
  }

  /**
   * ATM information.
   * @return ATM
  **/
  @ApiModelProperty(required = true, value = "ATM information.")
  @NotNull

  @Valid
@Size(min=1) 
  public List<ATMResponseATM> getATM() {
    return ATM;
  }

  public void setATM(List<ATMResponseATM> ATM) {
    this.ATM = ATM;
  }

  public ATMResponseBrand brandName(String brandName) {
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
    ATMResponseBrand atMResponseBrand = (ATMResponseBrand) o;
    return Objects.equals(this.ATM, atMResponseBrand.ATM) &&
        Objects.equals(this.brandName, atMResponseBrand.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ATM, brandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMResponseBrand {\n");
    
    sb.append("    ATM: ").append(toIndentedString(ATM)).append("\n");
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

