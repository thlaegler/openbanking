package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBExternalPartyType1Code;
import com.laegler.openbanking.model.OBParty2Address;
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

public class OBReadParty1DataParty  {
  
  @ApiModelProperty(value = "")
  private List<OBParty2Address> address = null;

  @ApiModelProperty(value = "")
  private String emailAddress = null;

  @ApiModelProperty(value = "")
  private String mobile = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(required = true, value = "")
  private String partyId = null;

  @ApiModelProperty(value = "")
  private String partyNumber = null;

  @ApiModelProperty(value = "")
  private OBExternalPartyType1Code partyType = null;

  @ApiModelProperty(value = "")
  private String phone = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("Address")
  public List<OBParty2Address> getAddress() {
    return address;
  }

  public void setAddress(List<OBParty2Address> address) {
    this.address = address;
  }

  public OBReadParty1DataParty address(List<OBParty2Address> address) {
    this.address = address;
    return this;
  }

  public OBReadParty1DataParty addAddressItem(OBParty2Address addressItem) {
    this.address.add(addressItem);
    return this;
  }

 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("EmailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public OBReadParty1DataParty emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get mobile
   * @return mobile
  **/
  @JsonProperty("Mobile")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public OBReadParty1DataParty mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadParty1DataParty name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get partyId
   * @return partyId
  **/
  @JsonProperty("PartyId")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public OBReadParty1DataParty partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

 /**
   * Get partyNumber
   * @return partyNumber
  **/
  @JsonProperty("PartyNumber")
  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }

  public OBReadParty1DataParty partyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
    return this;
  }

 /**
   * Get partyType
   * @return partyType
  **/
  @JsonProperty("PartyType")
  public OBExternalPartyType1Code getPartyType() {
    return partyType;
  }

  public void setPartyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
  }

  public OBReadParty1DataParty partyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  @JsonProperty("Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OBReadParty1DataParty phone(String phone) {
    this.phone = phone;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty1DataParty {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

