package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBBranchAndFinancialInstitutionIdentification50   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("SchemeName")
  private String schemeName = null;

  public OBBranchAndFinancialInstitutionIdentification50 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification50 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Get schemeName
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification50 obBranchAndFinancialInstitutionIdentification50 = (OBBranchAndFinancialInstitutionIdentification50) o;
    return Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification50.identification) &&
        Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification50.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification50 {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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

