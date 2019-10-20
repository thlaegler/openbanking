package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OrganisationEmailAddresses;
import com.laegler.openbanking.model.OrganisationPersonalAccountRoles;
import com.laegler.openbanking.model.OrganisationPhoneNumbers;
import com.laegler.openbanking.model.OrganisationPostalAddresses;
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
  * Account details for an open banking organisation which are used for SCIM access to the Directory on behalf of an accredited organisation.
 **/
@ApiModel(description="Account details for an open banking organisation which are used for SCIM access to the Directory on behalf of an accredited organisation.")
public class Organisation  {
  
  @ApiModelProperty(value = "Creation Timestamp")
 /**
   * Creation Timestamp
  **/
  private String createTimestamp = null;

  @ApiModelProperty(value = "Email addresses associated with the organisation")
 /**
   * Email addresses associated with the organisation
  **/
  private List<OrganisationEmailAddresses> emailAddresses = null;

  @ApiModelProperty(value = "Modification Timestamp")
 /**
   * Modification Timestamp
  **/
  private String modifyTimestamp = null;

  @ApiModelProperty(value = "OB Participant Authorisation State")
 /**
   * OB Participant Authorisation State
  **/
  private String obAuthorisationState = null;

  @ApiModelProperty(value = "Open Banking Organisation Identifier")
 /**
   * Open Banking Organisation Identifier
  **/
  private String obOrganisationId = null;

  @ApiModelProperty(value = "The common name of the organisation")
 /**
   * The common name of the organisation
  **/
  private String organisationCommonName = null;

  @ApiModelProperty(value = "Individuals who have authorised access to the organisation")
 /**
   * Individuals who have authorised access to the organisation
  **/
  private List<OrganisationPersonalAccountRoles> personalAccountRoles = null;

  @ApiModelProperty(value = "Phone numbers by which an organisation can be contacted")
 /**
   * Phone numbers by which an organisation can be contacted
  **/
  private List<OrganisationPhoneNumbers> phoneNumbers = null;

  @ApiModelProperty(value = "Organisations's Postal Addresses")
 /**
   * Organisations's Postal Addresses
  **/
  private List<OrganisationPostalAddresses> postalAddresses = null;

  @ApiModelProperty(value = "Organisation status description")
 /**
   * Organisation status description
  **/
  private String statusDescription = null;

  @ApiModelProperty(value = "Organisation status")
 /**
   * Organisation status
  **/
  private String status = null;
 /**
   * Creation Timestamp
   * @return createTimestamp
  **/
  @JsonProperty("CreateTimestamp")
  public String getCreateTimestamp() {
    return createTimestamp;
  }


 /**
   * Email addresses associated with the organisation
   * @return emailAddresses
  **/
  @JsonProperty("EmailAddresses")
  public List<OrganisationEmailAddresses> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<OrganisationEmailAddresses> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public Organisation emailAddresses(List<OrganisationEmailAddresses> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Organisation addEmailAddressesItem(OrganisationEmailAddresses emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

 /**
   * Modification Timestamp
   * @return modifyTimestamp
  **/
  @JsonProperty("ModifyTimestamp")
  public String getModifyTimestamp() {
    return modifyTimestamp;
  }


 /**
   * OB Participant Authorisation State
   * @return obAuthorisationState
  **/
  @JsonProperty("OBAuthorisationState")
  public String getObAuthorisationState() {
    return obAuthorisationState;
  }

  public void setObAuthorisationState(String obAuthorisationState) {
    this.obAuthorisationState = obAuthorisationState;
  }

  public Organisation obAuthorisationState(String obAuthorisationState) {
    this.obAuthorisationState = obAuthorisationState;
    return this;
  }

 /**
   * Open Banking Organisation Identifier
   * @return obOrganisationId
  **/
  @JsonProperty("OBOrganisationId")
  public String getObOrganisationId() {
    return obOrganisationId;
  }

  public void setObOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
  }

  public Organisation obOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
    return this;
  }

 /**
   * The common name of the organisation
   * @return organisationCommonName
  **/
  @JsonProperty("OrganisationCommonName")
  public String getOrganisationCommonName() {
    return organisationCommonName;
  }

  public void setOrganisationCommonName(String organisationCommonName) {
    this.organisationCommonName = organisationCommonName;
  }

  public Organisation organisationCommonName(String organisationCommonName) {
    this.organisationCommonName = organisationCommonName;
    return this;
  }

 /**
   * Individuals who have authorised access to the organisation
   * @return personalAccountRoles
  **/
  @JsonProperty("PersonalAccountRoles")
  public List<OrganisationPersonalAccountRoles> getPersonalAccountRoles() {
    return personalAccountRoles;
  }

  public void setPersonalAccountRoles(List<OrganisationPersonalAccountRoles> personalAccountRoles) {
    this.personalAccountRoles = personalAccountRoles;
  }

  public Organisation personalAccountRoles(List<OrganisationPersonalAccountRoles> personalAccountRoles) {
    this.personalAccountRoles = personalAccountRoles;
    return this;
  }

  public Organisation addPersonalAccountRolesItem(OrganisationPersonalAccountRoles personalAccountRolesItem) {
    this.personalAccountRoles.add(personalAccountRolesItem);
    return this;
  }

 /**
   * Phone numbers by which an organisation can be contacted
   * @return phoneNumbers
  **/
  @JsonProperty("PhoneNumbers")
  public List<OrganisationPhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<OrganisationPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public Organisation phoneNumbers(List<OrganisationPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public Organisation addPhoneNumbersItem(OrganisationPhoneNumbers phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

 /**
   * Organisations&#39;s Postal Addresses
   * @return postalAddresses
  **/
  @JsonProperty("PostalAddresses")
  public List<OrganisationPostalAddresses> getPostalAddresses() {
    return postalAddresses;
  }

  public void setPostalAddresses(List<OrganisationPostalAddresses> postalAddresses) {
    this.postalAddresses = postalAddresses;
  }

  public Organisation postalAddresses(List<OrganisationPostalAddresses> postalAddresses) {
    this.postalAddresses = postalAddresses;
    return this;
  }

  public Organisation addPostalAddressesItem(OrganisationPostalAddresses postalAddressesItem) {
    this.postalAddresses.add(postalAddressesItem);
    return this;
  }

 /**
   * Organisation status description
   * @return statusDescription
  **/
  @JsonProperty("StatusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public Organisation statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

 /**
   * Organisation status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Organisation status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    modifyTimestamp: ").append(toIndentedString(modifyTimestamp)).append("\n");
    sb.append("    obAuthorisationState: ").append(toIndentedString(obAuthorisationState)).append("\n");
    sb.append("    obOrganisationId: ").append(toIndentedString(obOrganisationId)).append("\n");
    sb.append("    organisationCommonName: ").append(toIndentedString(organisationCommonName)).append("\n");
    sb.append("    personalAccountRoles: ").append(toIndentedString(personalAccountRoles)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    postalAddresses: ").append(toIndentedString(postalAddresses)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

