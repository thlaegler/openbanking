package com.laegler.openbanking.model;

import com.laegler.openbanking.model.ATMResponseOtherATMServices;
import com.laegler.openbanking.model.ATMResponseOtherAccessibility;
import com.laegler.openbanking.model.Branch;
import com.laegler.openbanking.model.Location;
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
  * ATM information.
 **/
@ApiModel(description="ATM information.")
public class ATMResponseATM  {
  

@XmlType(name="AtMServicesEnum")
@XmlEnum(String.class)
public enum AtMServicesEnum {

@XmlEnumValue("Balance") BALANCE(String.valueOf("Balance")), @XmlEnumValue("BillPayments") BILLPAYMENTS(String.valueOf("BillPayments")), @XmlEnumValue("CashDeposits") CASHDEPOSITS(String.valueOf("CashDeposits")), @XmlEnumValue("CharityDonation") CHARITYDONATION(String.valueOf("CharityDonation")), @XmlEnumValue("ChequeDeposits") CHEQUEDEPOSITS(String.valueOf("ChequeDeposits")), @XmlEnumValue("CashWithdrawal") CASHWITHDRAWAL(String.valueOf("CashWithdrawal")), @XmlEnumValue("EnvelopeDeposit") ENVELOPEDEPOSIT(String.valueOf("EnvelopeDeposit")), @XmlEnumValue("FastCash") FASTCASH(String.valueOf("FastCash")), @XmlEnumValue("MobileBankingRegistration") MOBILEBANKINGREGISTRATION(String.valueOf("MobileBankingRegistration")), @XmlEnumValue("MobilePaymentRegistration") MOBILEPAYMENTREGISTRATION(String.valueOf("MobilePaymentRegistration")), @XmlEnumValue("MobilePhoneTopUp") MOBILEPHONETOPUP(String.valueOf("MobilePhoneTopUp")), @XmlEnumValue("OrderStatement") ORDERSTATEMENT(String.valueOf("OrderStatement")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("PINActivation") PINACTIVATION(String.valueOf("PINActivation")), @XmlEnumValue("PINChange") PINCHANGE(String.valueOf("PINChange")), @XmlEnumValue("PINUnblock") PINUNBLOCK(String.valueOf("PINUnblock")), @XmlEnumValue("MiniStatement") MINISTATEMENT(String.valueOf("MiniStatement"));


    private String value;

    AtMServicesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AtMServicesEnum fromValue(String v) {
        for (AtMServicesEnum b : AtMServicesEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Describes the type of transaction available for a customer on an ATM.")
 /**
   * Describes the type of transaction available for a customer on an ATM.
  **/
  private List<AtMServicesEnum> atMServices = null;

  @ApiModelProperty(value = "Indicates that the ATM is available for use by customers 24 hours per day")
 /**
   * Indicates that the ATM is available for use by customers 24 hours per day
  **/
  private Boolean access24HoursIndicator = null;


@XmlType(name="AccessibilityEnum")
@XmlEnum(String.class)
public enum AccessibilityEnum {

@XmlEnumValue("AudioCashMachine") AUDIOCASHMACHINE(String.valueOf("AudioCashMachine")), @XmlEnumValue("AutomaticDoors") AUTOMATICDOORS(String.valueOf("AutomaticDoors")), @XmlEnumValue("ExternalRamp") EXTERNALRAMP(String.valueOf("ExternalRamp")), @XmlEnumValue("InductionLoop") INDUCTIONLOOP(String.valueOf("InductionLoop")), @XmlEnumValue("InternalRamp") INTERNALRAMP(String.valueOf("InternalRamp")), @XmlEnumValue("LevelAccess") LEVELACCESS(String.valueOf("LevelAccess")), @XmlEnumValue("LowerLevelCounter") LOWERLEVELCOUNTER(String.valueOf("LowerLevelCounter")), @XmlEnumValue("Other") OTHER(String.valueOf("Other")), @XmlEnumValue("WheelchairAccess") WHEELCHAIRACCESS(String.valueOf("WheelchairAccess"));


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

  @ApiModelProperty(value = "Indicates Types of Accessibility")
 /**
   * Indicates Types of Accessibility
  **/
  private List<AccessibilityEnum> accessibility = null;

  @ApiModelProperty(value = "")
  private Branch branch = null;

  @ApiModelProperty(required = true, value = "ATM terminal device identification for the acquirer and the issuer.")
 /**
   * ATM terminal device identification for the acquirer and the issuer.
  **/
  private String identification = null;

  @ApiModelProperty(required = true, value = "")
  private Location location = null;

  @ApiModelProperty(value = "Minimum amount allowed for a transaction in the service.")
 /**
   * Minimum amount allowed for a transaction in the service.
  **/
  private String minimumPossibleAmount = null;

  @ApiModelProperty(value = "Summary description of the ATM.")
 /**
   * Summary description of the ATM.
  **/
  private List<String> note = null;

  @ApiModelProperty(value = "Enter a new code , name and description for any other ATM Service")
 /**
   * Enter a new code , name and description for any other ATM Service
  **/
  private List<ATMResponseOtherATMServices> otherATMServices = null;

  @ApiModelProperty(value = "Enter a new code , name and description for any other ATM accessibility options")
 /**
   * Enter a new code , name and description for any other ATM accessibility options
  **/
  private List<ATMResponseOtherAccessibility> otherAccessibility = null;

  @ApiModelProperty(required = true, value = "All ISO 4217 defined currency  supported by the ATM.")
 /**
   * All ISO 4217 defined currency  supported by the ATM.
  **/
  private List<String> supportedCurrencies = new ArrayList<String>();

  @ApiModelProperty(value = "Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.")
 /**
   * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
  **/
  private List<String> supportedLanguages = null;
 /**
   * Describes the type of transaction available for a customer on an ATM.
   * @return atMServices
  **/
  @JsonProperty("ATMServices")
  public List<AtMServicesEnum> getAtMServices() {
    return atMServices;
  }

  public void setAtMServices(List<AtMServicesEnum> atMServices) {
    this.atMServices = atMServices;
  }

  public ATMResponseATM atMServices(List<AtMServicesEnum> atMServices) {
    this.atMServices = atMServices;
    return this;
  }

  public ATMResponseATM addAtMServicesItem(AtMServicesEnum atMServicesItem) {
    this.atMServices.add(atMServicesItem);
    return this;
  }

 /**
   * Indicates that the ATM is available for use by customers 24 hours per day
   * @return access24HoursIndicator
  **/
  @JsonProperty("Access24HoursIndicator")
  public Boolean isAccess24HoursIndicator() {
    return access24HoursIndicator;
  }

  public void setAccess24HoursIndicator(Boolean access24HoursIndicator) {
    this.access24HoursIndicator = access24HoursIndicator;
  }

  public ATMResponseATM access24HoursIndicator(Boolean access24HoursIndicator) {
    this.access24HoursIndicator = access24HoursIndicator;
    return this;
  }

 /**
   * Indicates Types of Accessibility
   * @return accessibility
  **/
  @JsonProperty("Accessibility")
  public List<AccessibilityEnum> getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
  }

  public ATMResponseATM accessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  public ATMResponseATM addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    this.accessibility.add(accessibilityItem);
    return this;
  }

 /**
   * Get branch
   * @return branch
  **/
  @JsonProperty("Branch")
  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }

  public ATMResponseATM branch(Branch branch) {
    this.branch = branch;
    return this;
  }

 /**
   * ATM terminal device identification for the acquirer and the issuer.
   * @return identification
  **/
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ATMResponseATM identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("Location")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ATMResponseATM location(Location location) {
    this.location = location;
    return this;
  }

 /**
   * Minimum amount allowed for a transaction in the service.
   * @return minimumPossibleAmount
  **/
  @JsonProperty("MinimumPossibleAmount")
  public String getMinimumPossibleAmount() {
    return minimumPossibleAmount;
  }

  public void setMinimumPossibleAmount(String minimumPossibleAmount) {
    this.minimumPossibleAmount = minimumPossibleAmount;
  }

  public ATMResponseATM minimumPossibleAmount(String minimumPossibleAmount) {
    this.minimumPossibleAmount = minimumPossibleAmount;
    return this;
  }

 /**
   * Summary description of the ATM.
   * @return note
  **/
  @JsonProperty("Note")
  public List<String> getNote() {
    return note;
  }

  public void setNote(List<String> note) {
    this.note = note;
  }

  public ATMResponseATM note(List<String> note) {
    this.note = note;
    return this;
  }

  public ATMResponseATM addNoteItem(String noteItem) {
    this.note.add(noteItem);
    return this;
  }

 /**
   * Enter a new code , name and description for any other ATM Service
   * @return otherATMServices
  **/
  @JsonProperty("OtherATMServices")
  public List<ATMResponseOtherATMServices> getOtherATMServices() {
    return otherATMServices;
  }

  public void setOtherATMServices(List<ATMResponseOtherATMServices> otherATMServices) {
    this.otherATMServices = otherATMServices;
  }

  public ATMResponseATM otherATMServices(List<ATMResponseOtherATMServices> otherATMServices) {
    this.otherATMServices = otherATMServices;
    return this;
  }

  public ATMResponseATM addOtherATMServicesItem(ATMResponseOtherATMServices otherATMServicesItem) {
    this.otherATMServices.add(otherATMServicesItem);
    return this;
  }

 /**
   * Enter a new code , name and description for any other ATM accessibility options
   * @return otherAccessibility
  **/
  @JsonProperty("OtherAccessibility")
  public List<ATMResponseOtherAccessibility> getOtherAccessibility() {
    return otherAccessibility;
  }

  public void setOtherAccessibility(List<ATMResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
  }

  public ATMResponseATM otherAccessibility(List<ATMResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
    return this;
  }

  public ATMResponseATM addOtherAccessibilityItem(ATMResponseOtherAccessibility otherAccessibilityItem) {
    this.otherAccessibility.add(otherAccessibilityItem);
    return this;
  }

 /**
   * All ISO 4217 defined currency  supported by the ATM.
   * @return supportedCurrencies
  **/
  @JsonProperty("SupportedCurrencies")
  public List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  public void setSupportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }

  public ATMResponseATM supportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public ATMResponseATM addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

 /**
   * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
   * @return supportedLanguages
  **/
  @JsonProperty("SupportedLanguages")
  public List<String> getSupportedLanguages() {
    return supportedLanguages;
  }

  public void setSupportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
  }

  public ATMResponseATM supportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
    return this;
  }

  public ATMResponseATM addSupportedLanguagesItem(String supportedLanguagesItem) {
    this.supportedLanguages.add(supportedLanguagesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATMResponseATM {\n");
    
    sb.append("    atMServices: ").append(toIndentedString(atMServices)).append("\n");
    sb.append("    access24HoursIndicator: ").append(toIndentedString(access24HoursIndicator)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    minimumPossibleAmount: ").append(toIndentedString(minimumPossibleAmount)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    otherATMServices: ").append(toIndentedString(otherATMServices)).append("\n");
    sb.append("    otherAccessibility: ").append(toIndentedString(otherAccessibility)).append("\n");
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    supportedLanguages: ").append(toIndentedString(supportedLanguages)).append("\n");
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

