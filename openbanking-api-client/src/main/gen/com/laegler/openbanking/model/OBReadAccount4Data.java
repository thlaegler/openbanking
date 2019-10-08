package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBAccount4;
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

public class OBReadAccount4Data  {
  
  @ApiModelProperty(value = "")
  private List<OBAccount4> account = null;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("Account")
  public List<OBAccount4> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount4> account) {
    this.account = account;
  }

  public OBReadAccount4Data account(List<OBAccount4> account) {
    this.account = account;
    return this;
  }

  public OBReadAccount4Data addAccountItem(OBAccount4 accountItem) {
    this.account.add(accountItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount4Data {\n");
    
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

