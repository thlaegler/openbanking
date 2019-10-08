package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBAccount3Account;
import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification50;
import com.laegler.openbanking.model.OBExternalAccountSubType1Code;
import com.laegler.openbanking.model.OBExternalAccountType1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBAccount3Detail   {
  @JsonProperty("Account")
  @Valid
  private List<OBAccount3Account> account = new ArrayList<>();

  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType = null;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Nickname")
  private String nickname = null;

  @JsonProperty("Servicer")
  private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

  public OBAccount3Detail account(List<OBAccount3Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount3Detail addAccountItem(OBAccount3Account accountItem) {
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<OBAccount3Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount3Account> account) {
    this.account = account;
  }

  public OBAccount3Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount3Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount3Detail accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount3Detail currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[A-Z]{3,3}$") 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount3Detail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=35) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount3Detail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Get nickname
   * @return nickname
  **/
  @ApiModelProperty(value = "")

@Size(min=1,max=70) 
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount3Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount3Detail obAccount3Detail = (OBAccount3Detail) o;
    return Objects.equals(this.account, obAccount3Detail.account) &&
        Objects.equals(this.accountId, obAccount3Detail.accountId) &&
        Objects.equals(this.accountSubType, obAccount3Detail.accountSubType) &&
        Objects.equals(this.accountType, obAccount3Detail.accountType) &&
        Objects.equals(this.currency, obAccount3Detail.currency) &&
        Objects.equals(this.description, obAccount3Detail.description) &&
        Objects.equals(this.nickname, obAccount3Detail.nickname) &&
        Objects.equals(this.servicer, obAccount3Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountId, accountSubType, accountType, currency, description, nickname, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount3Detail {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

