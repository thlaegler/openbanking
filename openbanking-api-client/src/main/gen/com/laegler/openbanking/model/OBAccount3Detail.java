package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBAccount3Account;
import com.laegler.openbanking.model.OBBranchAndFinancialInstitutionIdentification50;
import com.laegler.openbanking.model.OBExternalAccountSubType1Code;
import com.laegler.openbanking.model.OBExternalAccountType1Code;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Unambiguous identification of the account to which credit and debit entries are made.
 **/
@ApiModel(description="Unambiguous identification of the account to which credit and debit entries are made.")
public class OBAccount3Detail  {
  
  @ApiModelProperty(required = true, value = "")
  private List<OBAccount3Account> account = new ArrayList<OBAccount3Account>();

  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(required = true, value = "")
  private OBExternalAccountSubType1Code accountSubType = null;

  @ApiModelProperty(required = true, value = "")
  private OBExternalAccountType1Code accountType = null;

  @ApiModelProperty(required = true, value = "")
  private String currency = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private String nickname = null;

  @ApiModelProperty(value = "")
  private OBBranchAndFinancialInstitutionIdentification50 servicer = null;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("Account")
  public List<OBAccount3Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount3Account> account) {
    this.account = account;
  }

  public OBAccount3Detail account(List<OBAccount3Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount3Detail addAccountItem(OBAccount3Account accountItem) {
    this.account.add(accountItem);
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount3Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get accountSubType
   * @return accountSubType
  **/
  @JsonProperty("AccountSubType")
  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount3Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("AccountType")
  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount3Detail accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount3Detail currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount3Detail description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get nickname
   * @return nickname
  **/
  @JsonProperty("Nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount3Detail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

 /**
   * Get servicer
   * @return servicer
  **/
  @JsonProperty("Servicer")
  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }

  public OBAccount3Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

