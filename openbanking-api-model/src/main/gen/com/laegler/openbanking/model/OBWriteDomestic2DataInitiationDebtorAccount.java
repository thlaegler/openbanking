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
 * Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.
 */
@ApiModel(description = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBWriteDomestic2DataInitiationDebtorAccount   {
  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("SchemeName")
  private String schemeName = null;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification = null;

  public OBWriteDomestic2DataInitiationDebtorAccount identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=256) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBWriteDomestic2DataInitiationDebtorAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
   * @return name
  **/
  @ApiModelProperty(value = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.")

@Size(min=1,max=70) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBWriteDomestic2DataInitiationDebtorAccount schemeName(String schemeName) {
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

  public OBWriteDomestic2DataInitiationDebtorAccount secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * Get secondaryIdentification
   * @return secondaryIdentification
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=34) 
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomestic2DataInitiationDebtorAccount obWriteDomestic2DataInitiationDebtorAccount = (OBWriteDomestic2DataInitiationDebtorAccount) o;
    return Objects.equals(this.identification, obWriteDomestic2DataInitiationDebtorAccount.identification) &&
        Objects.equals(this.name, obWriteDomestic2DataInitiationDebtorAccount.name) &&
        Objects.equals(this.schemeName, obWriteDomestic2DataInitiationDebtorAccount.schemeName) &&
        Objects.equals(this.secondaryIdentification, obWriteDomestic2DataInitiationDebtorAccount.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, schemeName, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomestic2DataInitiationDebtorAccount {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

