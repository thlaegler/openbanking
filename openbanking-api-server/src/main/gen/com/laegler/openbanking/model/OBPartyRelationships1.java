package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBPartyRelationships1Account;
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
  * The Party's relationships with other resources.
 **/
@ApiModel(description="The Party's relationships with other resources.")
public class OBPartyRelationships1  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OBPartyRelationships1Account account = null;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("Account")
  public OBPartyRelationships1Account getAccount() {
    return account;
  }

  public void setAccount(OBPartyRelationships1Account account) {
    this.account = account;
  }

  public OBPartyRelationships1 account(OBPartyRelationships1Account account) {
    this.account = account;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

