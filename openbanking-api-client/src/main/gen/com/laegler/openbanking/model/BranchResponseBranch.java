package com.laegler.openbanking.model;

import com.laegler.openbanking.model.Availability;
import com.laegler.openbanking.model.BranchResponseContactInfo;
import com.laegler.openbanking.model.BranchResponseOtherAccessibility;
import com.laegler.openbanking.model.BranchResponseOtherCustomerSegment;
import com.laegler.openbanking.model.BranchResponseOtherServiceAndFacility;
import com.laegler.openbanking.model.PostalAddress1;
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
  * Information that locates and identifies a specific branch of a financial institution.
 **/
@ApiModel(description="Information that locates and identifies a specific branch of a financial institution.")
public class BranchResponseBranch  {
  

@XmlType(name="AccessibilityEnum")
@XmlEnum(String.class)
public enum AccessibilityEnum {

@XmlEnumValue("AutomaticDoors") AUTOMATICDOORS(String.valueOf("AutomaticDoors")), @XmlEnumValue("AudioCashMachine") AUDIOCASHMACHINE(String.valueOf("AudioCashMachine")), @XmlEnumValue("ExternalRamp") EXTERNALRAMP(String.valueOf("ExternalRamp")), @XmlEnumValue("HelpingHandUnit") HELPINGHANDUNIT(String.valueOf("HelpingHandUnit")), @XmlEnumValue("InductionLoop") INDUCTIONLOOP(String.valueOf("InductionLoop")), @XmlEnumValue("InternalRamp") INTERNALRAMP(String.valueOf("InternalRamp")), @XmlEnumValue("LevelAccess") LEVELACCESS(String.valueOf("LevelAccess")), @XmlEnumValue("LowerLevelCounter") LOWERLEVELCOUNTER(String.valueOf("LowerLevelCounter")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("WheelchairAccess") WHEELCHAIRACCESS(String.valueOf("WheelchairAccess"));


    private String value;

    AccessibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccessibilityEnum fromValue(String v) {
        for (AccessibilityEnum b : AccessibilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people")
 /**
   * Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people
  **/
  private List<AccessibilityEnum> accessibility = null;

  @ApiModelProperty(value = "")
  private Availability availability = null;

  @ApiModelProperty(value = "Communication device number or electronic address used for communication.")
 /**
   * Communication device number or electronic address used for communication.
  **/
  private List<BranchResponseContactInfo> contactInfo = null;


@XmlType(name="CustomerSegmentEnum")
@XmlEnum(String.class)
public enum CustomerSegmentEnum {

@XmlEnumValue("Business") BUSINESS(String.valueOf("Business")), @XmlEnumValue("Corporate") CORPORATE(String.valueOf("Corporate")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Personal") PERSONAL(String.valueOf("Personal")), @XmlEnumValue("Private") PRIVATE(String.valueOf("Private")), @XmlEnumValue("Premier") PREMIER(String.valueOf("Premier")), @XmlEnumValue("Select") SELECT(String.valueOf("Select")), @XmlEnumValue("SME") SME(String.valueOf("SME")), @XmlEnumValue("Wealth") WEALTH(String.valueOf("Wealth"));


    private String value;

    CustomerSegmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomerSegmentEnum fromValue(String v) {
        for (CustomerSegmentEnum b : CustomerSegmentEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another")
 /**
   * The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another
  **/
  private List<CustomerSegmentEnum> customerSegment = new ArrayList<CustomerSegmentEnum>();

  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a branch of a financial institution.")
 /**
   * Unique and unambiguous identification of a branch of a financial institution.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Name by which a branch is known and which is usually used to identify that branch.")
 /**
   * Name by which a branch is known and which is usually used to identify that branch.
  **/
  private String name = null;

  @ApiModelProperty(value = "Summary description of services, facility and availability.")
 /**
   * Summary description of services, facility and availability.
  **/
  private String note = null;

  @ApiModelProperty(value = "Enter any new code , name and description for any other Accessibility")
 /**
   * Enter any new code , name and description for any other Accessibility
  **/
  private List<BranchResponseOtherAccessibility> otherAccessibility = null;

  @ApiModelProperty(value = "Enter a new code , name and description for any other Customer Segment")
 /**
   * Enter a new code , name and description for any other Customer Segment
  **/
  private List<BranchResponseOtherCustomerSegment> otherCustomerSegment = null;

  @ApiModelProperty(value = "Enter any new code , name and description for any Other Facility")
 /**
   * Enter any new code , name and description for any Other Facility
  **/
  private List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility = null;

  @ApiModelProperty(value = "Image related to the branch")
 /**
   * Image related to the branch
  **/
  private String photo = null;

  @ApiModelProperty(required = true, value = "")
  private PostalAddress1 postalAddress = null;

  @ApiModelProperty(required = true, value = "Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned.")
 /**
   * Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned.
  **/
  private String sequenceNumber = null;


@XmlType(name="ServiceAndFacilityEnum")
@XmlEnum(String.class)
public enum ServiceAndFacilityEnum {

@XmlEnumValue("AssistedServiceCounter") ASSISTEDSERVICECOUNTER(String.valueOf("AssistedServiceCounter")), @XmlEnumValue("ExternalATM") EXTERNALATM(String.valueOf("ExternalATM")), @XmlEnumValue("AccountVerificationService") ACCOUNTVERIFICATIONSERVICE(String.valueOf("AccountVerificationService")), @XmlEnumValue("BusinessCounter") BUSINESSCOUNTER(String.valueOf("BusinessCounter")), @XmlEnumValue("BureauDeChange") BUREAUDECHANGE(String.valueOf("BureauDeChange")), @XmlEnumValue("BusinessDepositTerminal") BUSINESSDEPOSITTERMINAL(String.valueOf("BusinessDepositTerminal")), @XmlEnumValue("BusinessITSupport") BUSINESSITSUPPORT(String.valueOf("BusinessITSupport")), @XmlEnumValue("CardIssuanceFacility") CARDISSUANCEFACILITY(String.valueOf("CardIssuanceFacility")), @XmlEnumValue("CollectionLockers") COLLECTIONLOCKERS(String.valueOf("CollectionLockers")), @XmlEnumValue("CounterServices") COUNTERSERVICES(String.valueOf("CounterServices")), @XmlEnumValue("ExternalQuickServicePoint") EXTERNALQUICKSERVICEPOINT(String.valueOf("ExternalQuickServicePoint")), @XmlEnumValue("InternalQuickServicePoint") INTERNALQUICKSERVICEPOINT(String.valueOf("InternalQuickServicePoint")), @XmlEnumValue("InternalATM") INTERNALATM(String.valueOf("InternalATM")), @XmlEnumValue("LodgementDevice") LODGEMENTDEVICE(String.valueOf("LodgementDevice")), @XmlEnumValue("MortgageAdvisor") MORTGAGEADVISOR(String.valueOf("MortgageAdvisor")), @XmlEnumValue("MeetingRooms") MEETINGROOMS(String.valueOf("MeetingRooms")), @XmlEnumValue("NightSafe") NIGHTSAFE(String.valueOf("NightSafe")), @XmlEnumValue("OnlineBankingPoint") ONLINEBANKINGPOINT(String.valueOf("OnlineBankingPoint")), @XmlEnumValue("OnDemandCurrency") ONDEMANDCURRENCY(String.valueOf("OnDemandCurrency")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("Parking") PARKING(String.valueOf("Parking")), @XmlEnumValue("PremierCounter") PREMIERCOUNTER(String.valueOf("PremierCounter")), @XmlEnumValue("QuickDeposit") QUICKDEPOSIT(String.valueOf("QuickDeposit")), @XmlEnumValue("SaturdayCounterService") SATURDAYCOUNTERSERVICE(String.valueOf("SaturdayCounterService")), @XmlEnumValue("StatementPrinter") STATEMENTPRINTER(String.valueOf("StatementPrinter")), @XmlEnumValue("SelfServiceAccountOpening") SELFSERVICEACCOUNTOPENING(String.valueOf("SelfServiceAccountOpening")), @XmlEnumValue("VideoBanking") VIDEOBANKING(String.valueOf("VideoBanking")), @XmlEnumValue("WiFi") WIFI(String.valueOf("WiFi"));


    private String value;

    ServiceAndFacilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ServiceAndFacilityEnum fromValue(String v) {
        for (ServiceAndFacilityEnum b : ServiceAndFacilityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Service/Facilities offered at a branch.")
 /**
   * Service/Facilities offered at a branch.
  **/
  private List<ServiceAndFacilityEnum> serviceAndFacility = null;

  @ApiModelProperty(value = "United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held.")
 /**
   * United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held.
  **/
  private List<String> sortCode = null;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("Mobile") MOBILE(String.valueOf("Mobile")), @XmlEnumValue("Physical") PHYSICAL(String.valueOf("Physical"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Codeset to indicate if a branch is physically in 1 location or is mobile")
 /**
   * Codeset to indicate if a branch is physically in 1 location or is mobile
  **/
  private TypeEnum type = null;
 /**
   * Accessibility is the ability and ease a customer can access a service, good, associate, or facility. Features which make the Bank accessible to disabled people
   * @return accessibility
  **/
  @JsonProperty("Accessibility")
  public List<AccessibilityEnum> getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
  }

  public BranchResponseBranch accessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  public BranchResponseBranch addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    this.accessibility.add(accessibilityItem);
    return this;
  }

 /**
   * Get availability
   * @return availability
  **/
  @JsonProperty("Availability")
  public Availability getAvailability() {
    return availability;
  }

  public void setAvailability(Availability availability) {
    this.availability = availability;
  }

  public BranchResponseBranch availability(Availability availability) {
    this.availability = availability;
    return this;
  }

 /**
   * Communication device number or electronic address used for communication.
   * @return contactInfo
  **/
  @JsonProperty("ContactInfo")
  public List<BranchResponseContactInfo> getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(List<BranchResponseContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
  }

  public BranchResponseBranch contactInfo(List<BranchResponseContactInfo> contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  public BranchResponseBranch addContactInfoItem(BranchResponseContactInfo contactInfoItem) {
    this.contactInfo.add(contactInfoItem);
    return this;
  }

 /**
   * The marketing segment which the branch is able to address in terms of customer type. Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another
   * @return customerSegment
  **/
  @JsonProperty("CustomerSegment")
  public List<CustomerSegmentEnum> getCustomerSegment() {
    return customerSegment;
  }

  public void setCustomerSegment(List<CustomerSegmentEnum> customerSegment) {
    this.customerSegment = customerSegment;
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
   * Unique and unambiguous identification of a branch of a financial institution.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BranchResponseBranch identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Name by which a branch is known and which is usually used to identify that branch.
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchResponseBranch name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Summary description of services, facility and availability.
   * @return note
  **/
  @JsonProperty("Note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BranchResponseBranch note(String note) {
    this.note = note;
    return this;
  }

 /**
   * Enter any new code , name and description for any other Accessibility
   * @return otherAccessibility
  **/
  @JsonProperty("OtherAccessibility")
  public List<BranchResponseOtherAccessibility> getOtherAccessibility() {
    return otherAccessibility;
  }

  public void setOtherAccessibility(List<BranchResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
  }

  public BranchResponseBranch otherAccessibility(List<BranchResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
    return this;
  }

  public BranchResponseBranch addOtherAccessibilityItem(BranchResponseOtherAccessibility otherAccessibilityItem) {
    this.otherAccessibility.add(otherAccessibilityItem);
    return this;
  }

 /**
   * Enter a new code , name and description for any other Customer Segment
   * @return otherCustomerSegment
  **/
  @JsonProperty("OtherCustomerSegment")
  public List<BranchResponseOtherCustomerSegment> getOtherCustomerSegment() {
    return otherCustomerSegment;
  }

  public void setOtherCustomerSegment(List<BranchResponseOtherCustomerSegment> otherCustomerSegment) {
    this.otherCustomerSegment = otherCustomerSegment;
  }

  public BranchResponseBranch otherCustomerSegment(List<BranchResponseOtherCustomerSegment> otherCustomerSegment) {
    this.otherCustomerSegment = otherCustomerSegment;
    return this;
  }

  public BranchResponseBranch addOtherCustomerSegmentItem(BranchResponseOtherCustomerSegment otherCustomerSegmentItem) {
    this.otherCustomerSegment.add(otherCustomerSegmentItem);
    return this;
  }

 /**
   * Enter any new code , name and description for any Other Facility
   * @return otherServiceAndFacility
  **/
  @JsonProperty("OtherServiceAndFacility")
  public List<BranchResponseOtherServiceAndFacility> getOtherServiceAndFacility() {
    return otherServiceAndFacility;
  }

  public void setOtherServiceAndFacility(List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility) {
    this.otherServiceAndFacility = otherServiceAndFacility;
  }

  public BranchResponseBranch otherServiceAndFacility(List<BranchResponseOtherServiceAndFacility> otherServiceAndFacility) {
    this.otherServiceAndFacility = otherServiceAndFacility;
    return this;
  }

  public BranchResponseBranch addOtherServiceAndFacilityItem(BranchResponseOtherServiceAndFacility otherServiceAndFacilityItem) {
    this.otherServiceAndFacility.add(otherServiceAndFacilityItem);
    return this;
  }

 /**
   * Image related to the branch
   * @return photo
  **/
  @JsonProperty("Photo")
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public BranchResponseBranch photo(String photo) {
    this.photo = photo;
    return this;
  }

 /**
   * Get postalAddress
   * @return postalAddress
  **/
  @JsonProperty("PostalAddress")
  public PostalAddress1 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress1 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public BranchResponseBranch postalAddress(PostalAddress1 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

 /**
   * Sequence Number that is used in conjunction with Identification to uniquely identify a branch. Physical branches should have 0 assigned, mobile and sub branches should have 1,2,3....etc. assigned.
   * @return sequenceNumber
  **/
  @JsonProperty("SequenceNumber")
  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public BranchResponseBranch sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

 /**
   * Service/Facilities offered at a branch.
   * @return serviceAndFacility
  **/
  @JsonProperty("ServiceAndFacility")
  public List<ServiceAndFacilityEnum> getServiceAndFacility() {
    return serviceAndFacility;
  }

  public void setServiceAndFacility(List<ServiceAndFacilityEnum> serviceAndFacility) {
    this.serviceAndFacility = serviceAndFacility;
  }

  public BranchResponseBranch serviceAndFacility(List<ServiceAndFacilityEnum> serviceAndFacility) {
    this.serviceAndFacility = serviceAndFacility;
    return this;
  }

  public BranchResponseBranch addServiceAndFacilityItem(ServiceAndFacilityEnum serviceAndFacilityItem) {
    this.serviceAndFacility.add(serviceAndFacilityItem);
    return this;
  }

 /**
   * United Kingdom (UK) Sort Code - identifies British financial institutions on the British national clearing systems. The sort code, which is a six-digit number, is usually formatted as three pairs of numbers, for example 12-34-56. It identifies both the bank and the branch(s) where the account is held.
   * @return sortCode
  **/
  @JsonProperty("SortCode")
  public List<String> getSortCode() {
    return sortCode;
  }

  public void setSortCode(List<String> sortCode) {
    this.sortCode = sortCode;
  }

  public BranchResponseBranch sortCode(List<String> sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  public BranchResponseBranch addSortCodeItem(String sortCodeItem) {
    this.sortCode.add(sortCodeItem);
    return this;
  }

 /**
   * Codeset to indicate if a branch is physically in 1 location or is mobile
   * @return type
  **/
  @JsonProperty("Type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BranchResponseBranch type(TypeEnum type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

