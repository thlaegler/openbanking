package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBExternalPartyType1Code;
import com.laegler.openbanking.model.OBParty2Address;
import com.laegler.openbanking.model.OBPartyRelationships1;
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

public class OBParty2  {
  
  @ApiModelProperty(value = "")
  private String accountRole = null;

  @ApiModelProperty(value = "")
  private List<OBParty2Address> address = null;

  @ApiModelProperty(value = "")
  private Boolean beneficialOwnership = null;

  @ApiModelProperty(value = "")
  private String emailAddress = null;

  @ApiModelProperty(value = "")
  private String fullLegalName = null;

  @ApiModelProperty(value = "")
  private String legalStructure = null;

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

  @ApiModelProperty(value = "")
  private OBPartyRelationships1 relationships = null;
 /**
   * Get accountRole
   * @return accountRole
  **/
  @JsonProperty("AccountRole")
  public String getAccountRole() {
    return accountRole;
  }

  public void setAccountRole(String accountRole) {
    this.accountRole = accountRole;
  }

  public OBParty2 accountRole(String accountRole) {
    this.accountRole = accountRole;
    return this;
  }

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

  public OBParty2 address(List<OBParty2Address> address) {
    this.address = address;
    return this;
  }

  public OBParty2 addAddressItem(OBParty2Address addressItem) {
    this.address.add(addressItem);
    return this;
  }

 /**
   * Get beneficialOwnership
   * @return beneficialOwnership
  **/
  @JsonProperty("BeneficialOwnership")
  public Boolean isBeneficialOwnership() {
    return beneficialOwnership;
  }

  public void setBeneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
  }

  public OBParty2 beneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
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

  public OBParty2 emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get fullLegalName
   * @return fullLegalName
  **/
  @JsonProperty("FullLegalName")
  public String getFullLegalName() {
    return fullLegalName;
  }

  public void setFullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
  }

  public OBParty2 fullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
    return this;
  }

 /**
   * Get legalStructure
   * @return legalStructure
  **/
  @JsonProperty("LegalStructure")
  public String getLegalStructure() {
    return legalStructure;
  }

  public void setLegalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
  }

  public OBParty2 legalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
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

  public OBParty2 mobile(String mobile) {
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

  public OBParty2 name(String name) {
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

  public OBParty2 partyId(String partyId) {
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

  public OBParty2 partyNumber(String partyNumber) {
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

  public OBParty2 partyType(OBExternalPartyType1Code partyType) {
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

  public OBParty2 phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get relationships
   * @return relationships
  **/
  @JsonProperty("Relationships")
  public OBPartyRelationships1 getRelationships() {
    return relationships;
  }

  public void setRelationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
  }

  public OBParty2 relationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2 {\n");
    
    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    beneficialOwnership: ").append(toIndentedString(beneficialOwnership)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    fullLegalName: ").append(toIndentedString(fullLegalName)).append("\n");
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

