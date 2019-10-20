package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBAccount3;
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

public class OBReadAccount3Data  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<OBAccount3> account = null;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("Account")
  public List<OBAccount3> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount3> account) {
    this.account = account;
  }

  public OBReadAccount3Data account(List<OBAccount3> account) {
    this.account = account;
    return this;
  }

  public OBReadAccount3Data addAccountItem(OBAccount3 accountItem) {
    this.account.add(accountItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount3Data {\n");
    
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

