package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OrganisationEmailAddresses;
import com.laegler.openbanking.model.OrganisationPersonalAccountRoles;
import com.laegler.openbanking.model.OrganisationPhoneNumbers;
import com.laegler.openbanking.model.OrganisationPostalAddresses;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account details for an open banking organisation which are used for SCIM access to the Directory on behalf of an accredited organisation.
 */
@ApiModel(description = "Account details for an open banking organisation which are used for SCIM access to the Directory on behalf of an accredited organisation.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class Organisation   {
  @JsonProperty("CreateTimestamp")
  private String createTimestamp = null;

  @JsonProperty("EmailAddresses")
  @Valid
  private List<OrganisationEmailAddresses> emailAddresses = null;

  @JsonProperty("ModifyTimestamp")
  private String modifyTimestamp = null;

  @JsonProperty("OBAuthorisationState")
  private String obAuthorisationState = null;

  @JsonProperty("OBOrganisationId")
  private String obOrganisationId = null;

  @JsonProperty("OrganisationCommonName")
  private String organisationCommonName = null;

  @JsonProperty("PersonalAccountRoles")
  @Valid
  private List<OrganisationPersonalAccountRoles> personalAccountRoles = null;

  @JsonProperty("PhoneNumbers")
  @Valid
  private List<OrganisationPhoneNumbers> phoneNumbers = null;

  @JsonProperty("PostalAddresses")
  @Valid
  private List<OrganisationPostalAddresses> postalAddresses = null;

  @JsonProperty("StatusDescription")
  private String statusDescription = null;

  @JsonProperty("status")
  private String status = null;

  public Organisation createTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  /**
   * Creation Timestamp
   * @return createTimestamp
  **/
  @ApiModelProperty(readOnly = true, value = "Creation Timestamp")


  public String getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public Organisation emailAddresses(List<OrganisationEmailAddresses> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Organisation addEmailAddressesItem(OrganisationEmailAddresses emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * Email addresses associated with the organisation
   * @return emailAddresses
  **/
  @ApiModelProperty(value = "Email addresses associated with the organisation")

  @Valid

  public List<OrganisationEmailAddresses> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<OrganisationEmailAddresses> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public Organisation modifyTimestamp(String modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
    return this;
  }

  /**
   * Modification Timestamp
   * @return modifyTimestamp
  **/
  @ApiModelProperty(readOnly = true, value = "Modification Timestamp")


  public String getModifyTimestamp() {
    return modifyTimestamp;
  }

  public void setModifyTimestamp(String modifyTimestamp) {
    this.modifyTimestamp = modifyTimestamp;
  }

  public Organisation obAuthorisationState(String obAuthorisationState) {
    this.obAuthorisationState = obAuthorisationState;
    return this;
  }

  /**
   * OB Participant Authorisation State
   * @return obAuthorisationState
  **/
  @ApiModelProperty(value = "OB Participant Authorisation State")


  public String getObAuthorisationState() {
    return obAuthorisationState;
  }

  public void setObAuthorisationState(String obAuthorisationState) {
    this.obAuthorisationState = obAuthorisationState;
  }

  public Organisation obOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
    return this;
  }

  /**
   * Open Banking Organisation Identifier
   * @return obOrganisationId
  **/
  @ApiModelProperty(value = "Open Banking Organisation Identifier")


  public String getObOrganisationId() {
    return obOrganisationId;
  }

  public void setObOrganisationId(String obOrganisationId) {
    this.obOrganisationId = obOrganisationId;
  }

  public Organisation organisationCommonName(String organisationCommonName) {
    this.organisationCommonName = organisationCommonName;
    return this;
  }

  /**
   * The common name of the organisation
   * @return organisationCommonName
  **/
  @ApiModelProperty(value = "The common name of the organisation")


  public String getOrganisationCommonName() {
    return organisationCommonName;
  }

  public void setOrganisationCommonName(String organisationCommonName) {
    this.organisationCommonName = organisationCommonName;
  }

  public Organisation personalAccountRoles(List<OrganisationPersonalAccountRoles> personalAccountRoles) {
    this.personalAccountRoles = personalAccountRoles;
    return this;
  }

  public Organisation addPersonalAccountRolesItem(OrganisationPersonalAccountRoles personalAccountRolesItem) {
    if (this.personalAccountRoles == null) {
      this.personalAccountRoles = new ArrayList<>();
    }
    this.personalAccountRoles.add(personalAccountRolesItem);
    return this;
  }

  /**
   * Individuals who have authorised access to the organisation
   * @return personalAccountRoles
  **/
  @ApiModelProperty(value = "Individuals who have authorised access to the organisation")

  @Valid

  public List<OrganisationPersonalAccountRoles> getPersonalAccountRoles() {
    return personalAccountRoles;
  }

  public void setPersonalAccountRoles(List<OrganisationPersonalAccountRoles> personalAccountRoles) {
    this.personalAccountRoles = personalAccountRoles;
  }

  public Organisation phoneNumbers(List<OrganisationPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public Organisation addPhoneNumbersItem(OrganisationPhoneNumbers phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Phone numbers by which an organisation can be contacted
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "Phone numbers by which an organisation can be contacted")

  @Valid

  public List<OrganisationPhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<OrganisationPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public Organisation postalAddresses(List<OrganisationPostalAddresses> postalAddresses) {
    this.postalAddresses = postalAddresses;
    return this;
  }

  public Organisation addPostalAddressesItem(OrganisationPostalAddresses postalAddressesItem) {
    if (this.postalAddresses == null) {
      this.postalAddresses = new ArrayList<>();
    }
    this.postalAddresses.add(postalAddressesItem);
    return this;
  }

  /**
   * Organisations's Postal Addresses
   * @return postalAddresses
  **/
  @ApiModelProperty(value = "Organisations's Postal Addresses")

  @Valid

  public List<OrganisationPostalAddresses> getPostalAddresses() {
    return postalAddresses;
  }

  public void setPostalAddresses(List<OrganisationPostalAddresses> postalAddresses) {
    this.postalAddresses = postalAddresses;
  }

  public Organisation statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

  /**
   * Organisation status description
   * @return statusDescription
  **/
  @ApiModelProperty(value = "Organisation status description")


  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public Organisation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Organisation status
   * @return status
  **/
  @ApiModelProperty(value = "Organisation status")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.createTimestamp, organisation.createTimestamp) &&
        Objects.equals(this.emailAddresses, organisation.emailAddresses) &&
        Objects.equals(this.modifyTimestamp, organisation.modifyTimestamp) &&
        Objects.equals(this.obAuthorisationState, organisation.obAuthorisationState) &&
        Objects.equals(this.obOrganisationId, organisation.obOrganisationId) &&
        Objects.equals(this.organisationCommonName, organisation.organisationCommonName) &&
        Objects.equals(this.personalAccountRoles, organisation.personalAccountRoles) &&
        Objects.equals(this.phoneNumbers, organisation.phoneNumbers) &&
        Objects.equals(this.postalAddresses, organisation.postalAddresses) &&
        Objects.equals(this.statusDescription, organisation.statusDescription) &&
        Objects.equals(this.status, organisation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimestamp, emailAddresses, modifyTimestamp, obAuthorisationState, obOrganisationId, organisationCommonName, personalAccountRoles, phoneNumbers, postalAddresses, statusDescription, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

