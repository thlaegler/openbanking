package com.laegler.openbanking.model;

import com.laegler.openbanking.model.PersonalCurrentAccountResponsePCA;
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
  * Brand registered by the banking group at https://register.fca.org.uk/
 **/
@ApiModel(description="Brand registered by the banking group at https://register.fca.org.uk/")
public class PersonalCurrentAccountResponseBrand  {
  
  @ApiModelProperty(required = true, value = "Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/")
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
  **/
  private String brandName = null;

  @ApiModelProperty(required = true, value = "PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.")
 /**
   * PCA' means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.
  **/
  private List<PersonalCurrentAccountResponsePCA> PCA = new ArrayList<PersonalCurrentAccountResponsePCA>();
 /**
   * Brand Name that an organisation uses to market its products or services to a consumer as registered at https://register.fca.org.uk/
   * @return brandName
  **/
  @JsonProperty("BrandName")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public PersonalCurrentAccountResponseBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

 /**
   * PCA&#39; means a personal current account. That is an account marketed to individuals rather than businesses, which provides the facility to place funds, withdraw cash, hold deposits and to execute payment transaction to and from third parties but does not include any of the following types of accounts:  (a) an account in which money is held on deposit in a currency other than sterling;  (b) current account mortgage, ie a single account comprising both a personal current account and a mortgage, which is regulated and marketed principally as a mortgage;   (c) savings accounts (including instant access savings accounts);   (d) credit card accounts where funds are usually paid in for the sole purpose of repaying a credit card debt; and  (e) e-money accounts.
   * @return PCA
  **/
  @JsonProperty("PCA")
  public List<PersonalCurrentAccountResponsePCA> getPCA() {
    return PCA;
  }

  public void setPCA(List<PersonalCurrentAccountResponsePCA> PCA) {
    this.PCA = PCA;
  }

  public PersonalCurrentAccountResponseBrand PCA(List<PersonalCurrentAccountResponsePCA> PCA) {
    this.PCA = PCA;
    return this;
  }

  public PersonalCurrentAccountResponseBrand addPCAItem(PersonalCurrentAccountResponsePCA PCAItem) {
    this.PCA.add(PCAItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalCurrentAccountResponseBrand {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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

