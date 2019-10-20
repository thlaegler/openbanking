package com.laegler.openbanking.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * OBReadParty1DataParty
 */
@Validated
@javax.annotation.Generated(
    value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen",
    date = "2019-10-19T13:25:17.080+13:00")

public class OBReadParty1DataParty {
  @JsonProperty("Address")
  @Valid
  private List<OBParty2Address> address = null;

  @JsonProperty("EmailAddress")
  private String emailAddress = null;

  @JsonProperty("Mobile")
  private String mobile = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PartyId")
  private String partyId = null;

  @JsonProperty("PartyNumber")
  private String partyNumber = null;

  @JsonProperty("PartyType")
  private OBExternalPartyType1Code partyType = null;

  @JsonProperty("Phone")
  private String phone = null;

  public OBReadParty1DataParty address(List<OBParty2Address> address) {
    this.address = address;
    return this;
  }

  public OBReadParty1DataParty addAddressItem(OBParty2Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * 
   * @return address
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBParty2Address> getAddress() {
    return address;
  }

  public void setAddress(List<OBParty2Address> address) {
    this.address = address;
  }

  public OBReadParty1DataParty emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * 
   * @return emailAddress
   **/
  @ApiModelProperty(value = "")

  @Size(min = 1, max = 256)
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public OBReadParty1DataParty mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * 
   * @return mobile
   **/
  @ApiModelProperty(value = "")

  @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public OBReadParty1DataParty name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   **/
  @ApiModelProperty(value = "")

  @Size(min = 1, max = 70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadParty1DataParty partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * Get partyId
   * 
   * @return partyId
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Size(min = 1, max = 40)
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public OBReadParty1DataParty partyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
    return this;
  }

  /**
   * Get partyNumber
   * 
   * @return partyNumber
   **/
  @ApiModelProperty(value = "")

  @Size(min = 1, max = 35)
  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }

  public OBReadParty1DataParty partyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * 
   * @return partyType
   **/
  @ApiModelProperty(value = "")

  @Valid

  public OBExternalPartyType1Code getPartyType() {
    return partyType;
  }

  public void setPartyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
  }

  public OBReadParty1DataParty phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * 
   * @return phone
   **/
  @ApiModelProperty(value = "")

  @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadParty1DataParty obReadParty1DataParty = (OBReadParty1DataParty) o;
    return Objects.equals(this.address, obReadParty1DataParty.address)
        && Objects.equals(this.emailAddress, obReadParty1DataParty.emailAddress)
        && Objects.equals(this.mobile, obReadParty1DataParty.mobile)
        && Objects.equals(this.name, obReadParty1DataParty.name)
        && Objects.equals(this.partyId, obReadParty1DataParty.partyId)
        && Objects.equals(this.partyNumber, obReadParty1DataParty.partyNumber)
        && Objects.equals(this.partyType, obReadParty1DataParty.partyType)
        && Objects.equals(this.phone, obReadParty1DataParty.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, emailAddress, mobile, name, partyId, partyNumber, partyType,
        phone);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

