package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBTransaction5;
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

public class OBReadDataTransaction5  {
  
  @ApiModelProperty(value = "")
  private List<OBTransaction5> transaction = null;
 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("Transaction")
  public List<OBTransaction5> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<OBTransaction5> transaction) {
    this.transaction = transaction;
  }

  public OBReadDataTransaction5 transaction(List<OBTransaction5> transaction) {
    this.transaction = transaction;
    return this;
  }

  public OBReadDataTransaction5 addTransactionItem(OBTransaction5 transactionItem) {
    this.transaction.add(transactionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDataTransaction5 {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

