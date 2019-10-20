package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.Availability;
import com.laegler.openbanking.model.BranchResponseContactInfo;
import com.laegler.openbanking.model.BranchResponseOtherAccessibility;
import com.laegler.openbanking.model.BranchResponseOtherCustomerSegment;
import com.laegler.openbanking.model.BranchResponseOtherServiceAndFacility;
import com.laegler.openbanking.model.PostalAddress1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information that locates and identifies a specific branch of a financial institution.
 */
@ApiModel(description = "Information that locates and identifies a specific branch of a financial institution.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class BranchResponseBranch   {
  /**
   * Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people
   */
  public enum AccessibilityEnum {
    AUTOMATICDOORS("AutomaticDoors"),
    
    AUDIOCASHMACHINE("AudioCashMachine"),
    
    EXTERNALRAMP("ExternalRamp"),
    
    HELPINGHANDUNIT("HelpingHandUnit"),
    
    INDUCTIONLOOP("InductionLoop"),
    
    INTERNALRAMP("InternalRamp"),
    
    LEVELACCESS("LevelAccess"),
    
    LOWERLEVELCOUNTER("LowerLevelCounter"),
    
    OTHER("Other"),
    
    WHEELCHAIRACCESS("WheelchairAccess");

    private String value;

    AccessibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessibilityEnum fromValue(String text) {
      for (AccessibilityEnum b : AccessibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Accessibility")
  @Valid
  private List<AccessibilityEnum> accessibility = null;

  @JsonProperty("Availability")
  private Availability availability = null;

  @JsonProperty("ContactInfo")
  @Valid
  private List<BranchResponseContactInfo> contactInfo = null;

  /**
   * The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another
   */
  public enum CustomerSegmentEnum {
    BUSINESS("Business"),
    
    CORPORATE("Corporate"),
    
    OTHER("Other"),
    
    PERSONAL("Personal"),
    
    PRIVATE("Private"),
    
    PREMIER("Premier"),
    
    SELECT("Select"),
    
    SME("SME"),
    
    WEALTH("Wealth");

    private String value;

    CustomerSegmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerSegmentEnum fromValue(String text) {
      for (CustomerSegmentEnum b : CustomerSegmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CustomerSegment")
  @Valid
  private List<CustomerSegmentEnum> customerSegment = new ArrayList<>();

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Note")
  private String note = null;

  @JsonProperty("OtherAccessibility")
  @Valid
  private List<BranchResponseOtherAccessibility> otherAccessibility = null;

  @JsonProperty("OtherCustomerSegment")
  @Valid
  private List<BranchResponseOtherCustomerSegment> otherCustomerSegment = null;

  @JsonProperty("OtherServiceAndFacility")
  @Valid
  private List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility = null;

  @JsonProperty("Photo")
  private String photo = null;

  @JsonProperty("PostalAddress")
  private PostalAddress1 postalAddress = null;

  @JsonProperty("SequenceNumber")
  private String sequenceNumber = null;

  /**
   * Service/Facilities offered at a branch.
   */
  public enum ServiceAndFacilityEnum {
    ASSISTEDSERVICECOUNTER("AssistedServiceCounter"),
    
    EXTERNALATM("ExternalATM"),
    
    ACCOUNTVERIFICATIONSERVICE("AccountVerificationService"),
    
    BUSINESSCOUNTER("BusinessCounter"),
    
    BUREAUDECHANGE("BureauDeChange"),
    
    BUSINESSDEPOSITTERMINAL("BusinessDepositTerminal"),
    
    BUSINESSITSUPPORT("BusinessITSupport"),
    
    CARDISSUANCEFACILITY("CardIssuanceFacility"),
    
    COLLECTIONLOCKERS("CollectionLockers"),
    
    COUNTERSERVICES("CounterServices"),
    
    EXTERNALQUICKSERVICEPOINT("ExternalQuickServicePoint"),
    
    INTERNALQUICKSERVICEPOINT("InternalQuickServicePoint"),
    
    INTERNALATM("InternalATM"),
    
    LODGEMENTDEVICE("LodgementDevice"),
    
    MORTGAGEADVISOR("MortgageAdvisor"),
    
    MEETINGROOMS("MeetingRooms"),
    
    NIGHTSAFE("NightSafe"),
    
    ONLINEBANKINGPOINT("OnlineBankingPoint"),
    
    ONDEMANDCURRENCY("OnDemandCurrency"),
    
    OTHER("Other"),
    
    PARKING("Parking"),
    
    PREMIERCOUNTER("PremierCounter"),
    
    QUICKDEPOSIT("QuickDeposit"),
    
    SATURDAYCOUNTERSERVICE("SaturdayCounterService"),
    
    STATEMENTPRINTER("StatementPrinter"),
    
    SELFSERVICEACCOUNTOPENING("SelfServiceAccountOpening"),
    
    VIDEOBANKING("VideoBanking"),
    
    WIFI("WiFi");

    private String value;

    ServiceAndFacilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceAndFacilityEnum fromValue(String text) {
      for (ServiceAndFacilityEnum b : ServiceAndFacilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ServiceAndFacility")
  @Valid
  private List<ServiceAndFacilityEnum> serviceAndFacility = null;

  @JsonProperty("SortCode")
  @Valid
  private List<String> sortCode = null;

  /**
   * Codeset to indicate if a branch is physically in 1 location or is mobile
   */
  public enum TypeEnum {
    MOBILE("Mobile"),
    
    PHYSICAL("Physical");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public BranchResponseBranch accessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  public BranchResponseBranch addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    if (this.accessibility == null) {
      this.accessibility = new ArrayList<>();
    }
    this.accessibility.add(accessibilityItem);
    return this;
  }

  /**
   * Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people
   * @return accessibility
  **/
  @ApiModelProperty(value = "Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people")


  public List<AccessibilityEnum> getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
  }

  public BranchResponseBranch availability(Availability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Availability getAvailability() {
    return availability;
  }

  public void setAvailability(Availability availability) {
    this.availability = availability;
  }

  public BranchResponseBranch contactInfo(List<BranchResponseContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  public BranchResponseBranch addContactInfoItem(BranchResponseContactInfo contactInfoItem) {
    if (this.contactInfo == null) {
      this.contactInfo = new ArrayList<>();
    }
    this.contactInfo.add(contactInfoItem);
    return this;
  }

  /**
   * Communication device number or electronic address used for communication.
   * @return contactInfo
  **/
  @ApiModelProperty(value = "Communication device number or electronic address used for communication.")

  @Valid

  public List<BranchResponseContactInfo> getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(List<BranchResponseContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
  }

  public BranchResponseBranch customerSegment(List<CustomerSegmentEnum> customerSegment) {
    this.customerSegment = customerSegment;
    return this;
  }

  public BranchResponseBranch addCustomerSegmentItem(CustomerSegmentEnum customerSegmentItem) {
    this.customerSegment.add(customerSegmentItem);
    return this;
  }

  /**
   * The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another
   * @return customerSegment
  **/
  @ApiModelProperty(required = true, value = "The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another")
  @NotNull

@Size(min=1) 
  public List<CustomerSegmentEnum> getCustomerSegment() {
    return customerSegment;
  }

  public void setCustomerSegment(List<CustomerSegmentEnum> customerSegment) {
    this.customerSegment = customerSegment;
  }

  public BranchResponseBranch identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a branch of a financial institution.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a branch of a financial institution.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BranchResponseBranch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a branch is known and which is usually used to identify that branch.
   * @return name
  **/
  @ApiModelProperty(value = "Name by which a branch is known and which is usually used to identify that branch.")

@Size(min=1,max=140) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchResponseBranch note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Summary description of services, facility and availability.
   * @return note
  **/
  @ApiModelProperty(value = "Summary description of services, facility and availability.")

@Size(min=1,max=2000) 
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BranchResponseBranch otherAccessibility(List<BranchResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
    return this;
  }

  public BranchResponseBranch addOtherAccessibilityItem(BranchResponseOtherAccessibility otherAccessibilityItem) {
    if (this.otherAccessibility == null) {
      this.otherAccessibility = new ArrayList<>();
    }
    this.otherAccessibility.add(otherAccessibilityItem);
    return this;
  }

  /**
   * Enter any new code , name and description for any other Accessibility
   * @return otherAccessibility
  **/
  @ApiModelProperty(value = "Enter any new code , name and description for any other Accessibility")

  @Valid

  public List<BranchResponseOtherAccessibility> getOtherAccessibility() {
    return otherAccessibility;
  }

  public void setOtherAccessibility(List<BranchResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
  }

  public BranchResponseBranch otherCustomerSegment(List<BranchResponseOtherCustomerSegment> otherCustomerSegment) {
    this.otherCustomerSegment = otherCustomerSegment;
    return this;
  }

  public BranchResponseBranch addOtherCustomerSegmentItem(BranchResponseOtherCustomerSegment otherCustomerSegmentItem) {
    if (this.otherCustomerSegment == null) {
      this.otherCustomerSegment = new ArrayList<>();
    }
    this.otherCustomerSegment.add(otherCustomerSegmentItem);
    return this;
  }

  /**
   * Enter a new code , name and description for any other Customer Segment
   * @return otherCustomerSegment
  **/
  @ApiModelProperty(value = "Enter a new code , name and description for any other Customer Segment")

  @Valid

  public List<BranchResponseOtherCustomerSegment> getOtherCustomerSegment() {
    return otherCustomerSegment;
  }

  public void setOtherCustomerSegment(List<BranchResponseOtherCustomerSegment> otherCustomerSegment) {
    this.otherCustomerSegment = otherCustomerSegment;
  }

  public BranchResponseBranch otherServiceAndFacility(List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility) {
    this.otherServiceAndFacility = otherServiceAndFacility;
    return this;
  }

  public BranchResponseBranch addOtherServiceAndFacilityItem(BranchResponseOtherServiceAndFacility otherServiceAndFacilityItem) {
    if (this.otherServiceAndFacility == null) {
      this.otherServiceAndFacility = new ArrayList<>();
    }
    this.otherServiceAndFacility.add(otherServiceAndFacilityItem);
    return this;
  }

  /**
   * Enter any new code , name and description for any Other Facility
   * @return otherServiceAndFacility
  **/
  @ApiModelProperty(value = "Enter any new code , name and description for any Other Facility")

  @Valid

  public List<BranchResponseOtherServiceAndFacility> getOtherServiceAndFacility() {
    return otherServiceAndFacility;
  }

  public void setOtherServiceAndFacility(List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility) {
    this.otherServiceAndFacility = otherServiceAndFacility;
  }

  public BranchResponseBranch photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Image related to the branch
   * @return photo
  **/
  @ApiModelProperty(value = "Image related to the branch")


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public BranchResponseBranch postalAddress(PostalAddress1 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PostalAddress1 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress1 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public BranchResponseBranch sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned.
   * @return sequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned.")
  @NotNull

@Size(min=1,max=35) 
  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public BranchResponseBranch serviceAndFacility(List<ServiceAndFacilityEnum> serviceAndFacility) {
    this.serviceAndFacility = serviceAndFacility;
    return this;
  }

  public BranchResponseBranch addServiceAndFacilityItem(ServiceAndFacilityEnum serviceAndFacilityItem) {
    if (this.serviceAndFacility == null) {
      this.serviceAndFacility = new ArrayList<>();
    }
    this.serviceAndFacility.add(serviceAndFacilityItem);
    return this;
  }

  /**
   * Service/Facilities offered at a branch.
   * @return serviceAndFacility
  **/
  @ApiModelProperty(value = "Service/Facilities offered at a branch.")


  public List<ServiceAndFacilityEnum> getServiceAndFacility() {
    return serviceAndFacility;
  }

  public void setServiceAndFacility(List<ServiceAndFacilityEnum> serviceAndFacility) {
    this.serviceAndFacility = serviceAndFacility;
  }

  public BranchResponseBranch sortCode(List<String> sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  public BranchResponseBranch addSortCodeItem(String sortCodeItem) {
    if (this.sortCode == null) {
      this.sortCode = new ArrayList<>();
    }
    this.sortCode.add(sortCodeItem);
    return this;
  }

  /**
   * United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held.
   * @return sortCode
  **/
  @ApiModelProperty(value = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held.")


  public List<String> getSortCode() {
    return sortCode;
  }

  public void setSortCode(List<String> sortCode) {
    this.sortCode = sortCode;
  }

  public BranchResponseBranch type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Codeset to indicate if a branch is physically in 1 location or is mobile
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Codeset to indicate if a branch is physically in 1 location or is mobile")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchResponseBranch branchResponseBranch = (BranchResponseBranch) o;
    return Objects.equals(this.accessibility, branchResponseBranch.accessibility) &&
        Objects.equals(this.availability, branchResponseBranch.availability) &&
        Objects.equals(this.contactInfo, branchResponseBranch.contactInfo) &&
        Objects.equals(this.customerSegment, branchResponseBranch.customerSegment) &&
        Objects.equals(this.identification, branchResponseBranch.identification) &&
        Objects.equals(this.name, branchResponseBranch.name) &&
        Objects.equals(this.note, branchResponseBranch.note) &&
        Objects.equals(this.otherAccessibility, branchResponseBranch.otherAccessibility) &&
        Objects.equals(this.otherCustomerSegment, branchResponseBranch.otherCustomerSegment) &&
        Objects.equals(this.otherServiceAndFacility, branchResponseBranch.otherServiceAndFacility) &&
        Objects.equals(this.photo, branchResponseBranch.photo) &&
        Objects.equals(this.postalAddress, branchResponseBranch.postalAddress) &&
        Objects.equals(this.sequenceNumber, branchResponseBranch.sequenceNumber) &&
        Objects.equals(this.serviceAndFacility, branchResponseBranch.serviceAndFacility) &&
        Objects.equals(this.sortCode, branchResponseBranch.sortCode) &&
        Objects.equals(this.type, branchResponseBranch.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibility, availability, contactInfo, customerSegment, identification, name, note, otherAccessibility, otherCustomerSegment, otherServiceAndFacility, photo, postalAddress, sequenceNumber, serviceAndFacility, sortCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchResponseBranch {\n");
    
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    customerSegment: ").append(toIndentedString(customerSegment)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    otherAccessibility: ").append(toIndentedString(otherAccessibility)).append("\n");
    sb.append("    otherCustomerSegment: ").append(toIndentedString(otherCustomerSegment)).append("\n");
    sb.append("    otherServiceAndFacility: ").append(toIndentedString(otherServiceAndFacility)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    serviceAndFacility: ").append(toIndentedString(serviceAndFacility)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

