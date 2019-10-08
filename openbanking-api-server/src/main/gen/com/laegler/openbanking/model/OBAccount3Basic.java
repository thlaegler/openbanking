package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBExternalAccountSubType1Code;
import com.laegler.openbanking.model.OBExternalAccountType1Code;
import io.swagger.annotations.ApiModel;
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
  * Unambiguous identification of the account to which credit and debit entries are made.
 **/
@ApiModel(description="Unambiguous identification of the account to which credit and debit entries are made.")
public class OBAccount3Basic  {
  
  @ApiModelProperty(required = true, value = "")
  private String accountId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBExternalAccountSubType1Code accountSubType = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBExternalAccountType1Code accountType = null;

  @ApiModelProperty(required = true, value = "")
  private String currency = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private String nickname = null;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBAccount3Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get accountSubType
   * @return accountSubType
  **/
  @JsonProperty("AccountSubType")
  @NotNull
  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount3Basic accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("AccountType")
  @NotNull
  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount3Basic accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("Currency")
  @NotNull
 @Pattern(regexp="^[A-Z]{3,3}$")  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount3Basic currency(String currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("Description")
 @Size(min=1,max=35)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount3Basic description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get nickname
   * @return nickname
  **/
  @JsonProperty("Nickname")
 @Size(min=1,max=70)  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount3Basic nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount3Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

