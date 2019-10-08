package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.OtherContactType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Communication device number or electronic address used for communication.
 */
@ApiModel(description = "Communication device number or electronic address used for communication.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BranchResponseContactInfo   {
  @JsonProperty("ContactContent")
  private String contactContent = null;

  @JsonProperty("ContactDescription")
  private String contactDescription = null;

  /**
   * Contact type such Phone, Fax and email
   */
  public enum ContactTypeEnum {
    ALTERNATEEMAIL("AlternateEmail"),
    
    ALTERNATEFAX("AlternateFax"),
    
    ALTERNATEPHONE("AlternatePhone"),
    
    EMAIL("Email"),
    
    FAX("Fax"),
    
    OTHER("Other"),
    
    PHONE("Phone");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContactTypeEnum fromValue(String text) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ContactType")
  private ContactTypeEnum contactType = null;

  @JsonProperty("OtherContactType")
  private OtherContactType otherContactType = null;

  public BranchResponseContactInfo contactContent(String contactContent) {
    this.contactContent = contactContent;
    return this;
  }

  /**
   * Collection of information that identifies a phone/Fax number/ email, as defined by telecom services.
   * @return contactContent
  **/
  @ApiModelProperty(required = true, value = "Collection of information that identifies a phone/Fax number/ email, as defined by telecom services.")
  @NotNull

@Size(min=1,max=256) 
  public String getContactContent() {
    return contactContent;
  }

  public void setContactContent(String contactContent) {
    this.contactContent = contactContent;
  }

  public BranchResponseContactInfo contactDescription(String contactDescription) {
    this.contactDescription = contactDescription;
    return this;
  }

  /**
   * Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email
   * @return contactDescription
  **/
  @ApiModelProperty(value = "Description of contact such as main phone number, alternate phone number, Fax number, alternate fax number, email and alternate email")

@Size(min=1,max=70) 
  public String getContactDescription() {
    return contactDescription;
  }

  public void setContactDescription(String contactDescription) {
    this.contactDescription = contactDescription;
  }

  public BranchResponseContactInfo contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Contact type such Phone, Fax and email
   * @return contactType
  **/
  @ApiModelProperty(required = true, value = "Contact type such Phone, Fax and email")
  @NotNull


  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public BranchResponseContactInfo otherContactType(OtherContactType otherContactType) {
    this.otherContactType = otherContactType;
    return this;
  }

  /**
   * Get otherContactType
   * @return otherContactType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OtherContactType getOtherContactType() {
    return otherContactType;
  }

  public void setOtherContactType(OtherContactType otherContactType) {
    this.otherContactType = otherContactType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchResponseContactInfo branchResponseContactInfo = (BranchResponseContactInfo) o;
    return Objects.equals(this.contactContent, branchResponseContactInfo.contactContent) &&
        Objects.equals(this.contactDescription, branchResponseContactInfo.contactDescription) &&
        Objects.equals(this.contactType, branchResponseContactInfo.contactType) &&
        Objects.equals(this.otherContactType, branchResponseContactInfo.otherContactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactContent, contactDescription, contactType, otherContactType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

