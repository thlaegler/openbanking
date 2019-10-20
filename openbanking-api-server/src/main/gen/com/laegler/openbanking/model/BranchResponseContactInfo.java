package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OtherContactType;
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
  * Communication device number or electronic address used for communication.
 **/
@ApiModel(description="Communication device number or electronic address used for communication.")
public class BranchResponseContactInfo  {
  
  @ApiModelProperty(required = true, value = "Collection of information that identifies a phone/Fax number/ email, as defined by telecom services.")
 /**
   * Collection of information that identifies a phone/Fax number/ email, as defined by telecom services.
  **/
  private String contactContent = null;

  @ApiModelProperty(value = "Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email")
 /**
   * Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email
  **/
  private String contactDescription = null;


@XmlType(name="ContactTypeEnum")
@XmlEnum(String.class)
public enum ContactTypeEnum {

@XmlEnumValue("AlternateEmail") ALTERNATEEMAIL(String.valueOf("AlternateEmail")), @XmlEnumValue("AlternateFax") ALTERNATEFAX(String.valueOf("AlternateFax")), @XmlEnumValue("AlternatePhone") ALTERNATEPHONE(String.valueOf("AlternatePhone")), @XmlEnumValue("Email") EMAIL(String.valueOf("Email")), @XmlEnumValue("Fax") FAX(String.valueOf("Fax")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Phone") PHONE(String.valueOf("Phone"));


    private String value;

    ContactTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContactTypeEnum fromValue(String v) {
        for (ContactTypeEnum b : ContactTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Contact type such Phone, Fax and email")
 /**
   * Contact type such Phone, Fax and email
  **/
  private ContactTypeEnum contactType = null;

  @ApiModelProperty(value = "")
  @Valid
  private OtherContactType otherContactType = null;
 /**
   * Collection of information that identifies a phone/Fax number/ email, as defined by telecom services.
   * @return contactContent
  **/
  @JsonProperty("ContactContent")
  @NotNull
 @Size(min=1,max=256)  public String getContactContent() {
    return contactContent;
  }

  public void setContactContent(String contactContent) {
    this.contactContent = contactContent;
  }

  public BranchResponseContactInfo contactContent(String contactContent) {
    this.contactContent = contactContent;
    return this;
  }

 /**
   * Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email
   * @return contactDescription
  **/
  @JsonProperty("ContactDescription")
 @Size(min=1,max=70)  public String getContactDescription() {
    return contactDescription;
  }

  public void setContactDescription(String contactDescription) {
    this.contactDescription = contactDescription;
  }

  public BranchResponseContactInfo contactDescription(String contactDescription) {
    this.contactDescription = contactDescription;
    return this;
  }

 /**
   * Contact type such Phone, Fax and email
   * @return contactType
  **/
  @JsonProperty("ContactType")
  @NotNull
  public String getContactType() {
    if (contactType == null) {
      return null;
    }
    return contactType.value();
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public BranchResponseContactInfo contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

 /**
   * Get otherContactType
   * @return otherContactType
  **/
  @JsonProperty("OtherContactType")
  public OtherContactType getOtherContactType() {
    return otherContactType;
  }

  public void setOtherContactType(OtherContactType otherContactType) {
    this.otherContactType = otherContactType;
  }

  public BranchResponseContactInfo otherContactType(OtherContactType otherContactType) {
    this.otherContactType = otherContactType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseContactInfo {\n");
    
    sb.append("    contactContent: ").append(toIndentedString(contactContent)).append("\n");
    sb.append("    contactDescription: ").append(toIndentedString(contactDescription)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    otherContactType: ").append(toIndentedString(otherContactType)).append("\n");
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

