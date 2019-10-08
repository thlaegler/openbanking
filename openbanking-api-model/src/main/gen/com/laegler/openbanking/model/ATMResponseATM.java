package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.ATMResponseOtherATMServices;
import com.laegler.openbanking.model.ATMResponseOtherAccessibility;
import com.laegler.openbanking.model.Branch;
import com.laegler.openbanking.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ATM information.
 */
@ApiModel(description = "ATM information.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class ATMResponseATM   {
  /**
   * Describes the type of transaction available for a customer on an ATM.
   */
  public enum AtMServicesEnum {
    BALANCE("Balance"),
    
    BILLPAYMENTS("BillPayments"),
    
    CASHDEPOSITS("CashDeposits"),
    
    CHARITYDONATION("CharityDonation"),
    
    CHEQUEDEPOSITS("ChequeDeposits"),
    
    CASHWITHDRAWAL("CashWithdrawal"),
    
    ENVELOPEDEPOSIT("EnvelopeDeposit"),
    
    FASTCASH("FastCash"),
    
    MOBILEBANKINGREGISTRATION("MobileBankingRegistration"),
    
    MOBILEPAYMENTREGISTRATION("MobilePaymentRegistration"),
    
    MOBILEPHONETOPUP("MobilePhoneTopUp"),
    
    ORDERSTATEMENT("OrderStatement"),
    
    OTHER("Other"),
    
    PINACTIVATION("PINActivation"),
    
    PINCHANGE("PINChange"),
    
    PINUNBLOCK("PINUnblock"),
    
    MINISTATEMENT("MiniStatement");

    private String value;

    AtMServicesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AtMServicesEnum fromValue(String text) {
      for (AtMServicesEnum b : AtMServicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ATMServices")
  @Valid
  private List<AtMServicesEnum> atMServices = null;

  @JsonProperty("Access24HoursIndicator")
  private Boolean access24HoursIndicator = null;

  /**
   * Indicates Types of Accessibility
   */
  public enum AccessibilityEnum {
    AUDIOCASHMACHINE("AudioCashMachine"),
    
    AUTOMATICDOORS("AutomaticDoors"),
    
    EXTERNALRAMP("ExternalRamp"),
    
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

  @JsonProperty("Branch")
  private Branch branch = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Location")
  private Location location = null;

  @JsonProperty("MinimumPossibleAmount")
  private String minimumPossibleAmount = null;

  @JsonProperty("Note")
  @Valid
  private List<String> note = null;

  @JsonProperty("OtherATMServices")
  @Valid
  private List<ATMResponseOtherATMServices> otherATMServices = null;

  @JsonProperty("OtherAccessibility")
  @Valid
  private List<ATMResponseOtherAccessibility> otherAccessibility = null;

  @JsonProperty("SupportedCurrencies")
  @Valid
  private List<String> supportedCurrencies = new ArrayList<>();

  @JsonProperty("SupportedLanguages")
  @Valid
  private List<String> supportedLanguages = null;

  public ATMResponseATM atMServices(List<AtMServicesEnum> atMServices) {
    this.atMServices = atMServices;
    return this;
  }

  public ATMResponseATM addAtMServicesItem(AtMServicesEnum atMServicesItem) {
    if (this.atMServices == null) {
      this.atMServices = new ArrayList<>();
    }
    this.atMServices.add(atMServicesItem);
    return this;
  }

  /**
   * Describes the type of transaction available for a customer on an ATM.
   * @return atMServices
  **/
  @ApiModelProperty(value = "Describes the type of transaction available for a customer on an ATM.")


  public List<AtMServicesEnum> getAtMServices() {
    return atMServices;
  }

  public void setAtMServices(List<AtMServicesEnum> atMServices) {
    this.atMServices = atMServices;
  }

  public ATMResponseATM access24HoursIndicator(Boolean access24HoursIndicator) {
    this.access24HoursIndicator = access24HoursIndicator;
    return this;
  }

  /**
   * Indicates that the ATM is available for use by customers 24 hours per day
   * @return access24HoursIndicator
  **/
  @ApiModelProperty(value = "Indicates that the ATM is available for use by customers 24 hours per day")


  public Boolean isAccess24HoursIndicator() {
    return access24HoursIndicator;
  }

  public void setAccess24HoursIndicator(Boolean access24HoursIndicator) {
    this.access24HoursIndicator = access24HoursIndicator;
  }

  public ATMResponseATM accessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
    return this;
  }

  public ATMResponseATM addAccessibilityItem(AccessibilityEnum accessibilityItem) {
    if (this.accessibility == null) {
      this.accessibility = new ArrayList<>();
    }
    this.accessibility.add(accessibilityItem);
    return this;
  }

  /**
   * Indicates Types of Accessibility
   * @return accessibility
  **/
  @ApiModelProperty(value = "Indicates Types of Accessibility")


  public List<AccessibilityEnum> getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(List<AccessibilityEnum> accessibility) {
    this.accessibility = accessibility;
  }

  public ATMResponseATM branch(Branch branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }

  public ATMResponseATM identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * ATM terminal device identification for the acquirer and the issuer.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "ATM terminal device identification for the acquirer and the issuer.")
  @NotNull

@Size(min=1,max=35) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ATMResponseATM location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ATMResponseATM minimumPossibleAmount(String minimumPossibleAmount) {
    this.minimumPossibleAmount = minimumPossibleAmount;
    return this;
  }

  /**
   * Minimum amount allowed for a transaction in the service.
   * @return minimumPossibleAmount
  **/
  @ApiModelProperty(value = "Minimum amount allowed for a transaction in the service.")

@Pattern(regexp="^-?\\d{1,10}\\.?\\d{0,2}$") 
  public String getMinimumPossibleAmount() {
    return minimumPossibleAmount;
  }

  public void setMinimumPossibleAmount(String minimumPossibleAmount) {
    this.minimumPossibleAmount = minimumPossibleAmount;
  }

  public ATMResponseATM note(List<String> note) {
    this.note = note;
    return this;
  }

  public ATMResponseATM addNoteItem(String noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Summary description of the ATM.
   * @return note
  **/
  @ApiModelProperty(value = "Summary description of the ATM.")


  public List<String> getNote() {
    return note;
  }

  public void setNote(List<String> note) {
    this.note = note;
  }

  public ATMResponseATM otherATMServices(List<ATMResponseOtherATMServices> otherATMServices) {
    this.otherATMServices = otherATMServices;
    return this;
  }

  public ATMResponseATM addOtherATMServicesItem(ATMResponseOtherATMServices otherATMServicesItem) {
    if (this.otherATMServices == null) {
      this.otherATMServices = new ArrayList<>();
    }
    this.otherATMServices.add(otherATMServicesItem);
    return this;
  }

  /**
   * Enter a new code , name and description for any other ATM Service
   * @return otherATMServices
  **/
  @ApiModelProperty(value = "Enter a new code , name and description for any other ATM Service")

  @Valid

  public List<ATMResponseOtherATMServices> getOtherATMServices() {
    return otherATMServices;
  }

  public void setOtherATMServices(List<ATMResponseOtherATMServices> otherATMServices) {
    this.otherATMServices = otherATMServices;
  }

  public ATMResponseATM otherAccessibility(List<ATMResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
    return this;
  }

  public ATMResponseATM addOtherAccessibilityItem(ATMResponseOtherAccessibility otherAccessibilityItem) {
    if (this.otherAccessibility == null) {
      this.otherAccessibility = new ArrayList<>();
    }
    this.otherAccessibility.add(otherAccessibilityItem);
    return this;
  }

  /**
   * Enter a new code , name and description for any other ATM accessibility options
   * @return otherAccessibility
  **/
  @ApiModelProperty(value = "Enter a new code , name and description for any other ATM accessibility options")

  @Valid

  public List<ATMResponseOtherAccessibility> getOtherAccessibility() {
    return otherAccessibility;
  }

  public void setOtherAccessibility(List<ATMResponseOtherAccessibility> otherAccessibility) {
    this.otherAccessibility = otherAccessibility;
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
   * All ISO 4217 defined currency  supported by the ATM.
   * @return supportedCurrencies
  **/
  @ApiModelProperty(required = true, value = "All ISO 4217 defined currency  supported by the ATM.")
  @NotNull

@Size(min=1) 
  public List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  public void setSupportedCurrencies(List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }

  public ATMResponseATM supportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
    return this;
  }

  public ATMResponseATM addSupportedLanguagesItem(String supportedLanguagesItem) {
    if (this.supportedLanguages == null) {
      this.supportedLanguages = new ArrayList<>();
    }
    this.supportedLanguages.add(supportedLanguagesItem);
    return this;
  }

  /**
   * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
   * @return supportedLanguages
  **/
  @ApiModelProperty(value = "Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.")


  public List<String> getSupportedLanguages() {
    return supportedLanguages;
  }

  public void setSupportedLanguages(List<String> supportedLanguages) {
    this.supportedLanguages = supportedLanguages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATMResponseATM atMResponseATM = (ATMResponseATM) o;
    return Objects.equals(this.atMServices, atMResponseATM.atMServices) &&
        Objects.equals(this.access24HoursIndicator, atMResponseATM.access24HoursIndicator) &&
        Objects.equals(this.accessibility, atMResponseATM.accessibility) &&
        Objects.equals(this.branch, atMResponseATM.branch) &&
        Objects.equals(this.identification, atMResponseATM.identification) &&
        Objects.equals(this.location, atMResponseATM.location) &&
        Objects.equals(this.minimumPossibleAmount, atMResponseATM.minimumPossibleAmount) &&
        Objects.equals(this.note, atMResponseATM.note) &&
        Objects.equals(this.otherATMServices, atMResponseATM.otherATMServices) &&
        Objects.equals(this.otherAccessibility, atMResponseATM.otherAccessibility) &&
        Objects.equals(this.supportedCurrencies, atMResponseATM.supportedCurrencies) &&
        Objects.equals(this.supportedLanguages, atMResponseATM.supportedLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atMServices, access24HoursIndicator, accessibility, branch, identification, location, minimumPossibleAmount, note, otherATMServices, otherAccessibility, supportedCurrencies, supportedLanguages);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

