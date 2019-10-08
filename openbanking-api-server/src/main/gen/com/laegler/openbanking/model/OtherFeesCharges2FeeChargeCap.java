package com.laegler.openbanking.model;

import com.laegler.openbanking.model.BranchCurrentAccountResponseOtherFeeType;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * Details about any caps (maximum charges) that apply to a particular fee/charge
 **/
@ApiModel(description="Details about any caps (maximum charges) that apply to a particular fee/charge")
public class OtherFeesCharges2FeeChargeCap  {
  

@XmlType(name="CappingPeriodEnum")
@XmlEnum(String.class)
public enum CappingPeriodEnum {

@XmlEnumValue("Day") DAY(String.valueOf("Day")), @XmlEnumValue("HalfYear") HALFYEAR(String.valueOf("HalfYear")), @XmlEnumValue("Month") MONTH(String.valueOf("Month")), @XmlEnumValue("Quarter") QUARTER(String.valueOf("Quarter")), @XmlEnumValue("Week") WEEK(String.valueOf("Week")), @XmlEnumValue("AcademicTerm") ACADEMICTERM(String.valueOf("AcademicTerm")), @XmlEnumValue("Year") YEAR(String.valueOf("Year"));


    private String value;

    CappingPeriodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CappingPeriodEnum fromValue(String v) {
        for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
  **/
  private CappingPeriodEnum cappingPeriod = null;

  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
  **/
  private String feeCapAmount = null;

  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
  **/
  private Float feeCapOccurrence = null;


@XmlType(name="FeeTypeEnum")
@XmlEnum(String.class)
public enum FeeTypeEnum {

@XmlEnumValue("CashCentreCoinHandling") CASHCENTRECOINHANDLING(String.valueOf("CashCentreCoinHandling")), @XmlEnumValue("CashCentreCashX") CASHCENTRECASHX(String.valueOf("CashCentreCashX")), @XmlEnumValue("CashCentreCashFeePercent") CASHCENTRECASHFEEPERCENT(String.valueOf("CashCentreCashFeePercent")), @XmlEnumValue("CashCentreCashFeeRate") CASHCENTRECASHFEERATE(String.valueOf("CashCentreCashFeeRate")), @XmlEnumValue("CashCentreNotesLodged") CASHCENTRENOTESLODGED(String.valueOf("CashCentreNotesLodged")), @XmlEnumValue("CashCentreNotesOut") CASHCENTRENOTESOUT(String.valueOf("CashCentreNotesOut")), @XmlEnumValue("CashCentreCashIn") CASHCENTRECASHIN(String.valueOf("CashCentreCashIn")), @XmlEnumValue("CashCentreCashOut") CASHCENTRECASHOUT(String.valueOf("CashCentreCashOut")), @XmlEnumValue("ReportCertBalance") REPORTCERTBALANCE(String.valueOf("ReportCertBalance")), @XmlEnumValue("ATMAbroadConVisaDebit") ATMABROADCONVISADEBIT(String.valueOf("ATMAbroadConVisaDebit")), @XmlEnumValue("ATMConGroupATM") ATMCONGROUPATM(String.valueOf("ATMConGroupATM")), @XmlEnumValue("ATMAbroad") ATMABROAD(String.valueOf("ATMAbroad")), @XmlEnumValue("ATMForeignCashDebCard") ATMFOREIGNCASHDEBCARD(String.valueOf("ATMForeignCashDebCard")), @XmlEnumValue("ATMAbroadGoldVisaDebit") ATMABROADGOLDVISADEBIT(String.valueOf("ATMAbroadGoldVisaDebit")), @XmlEnumValue("ATMNonSterlingWithdrawal") ATMNONSTERLINGWITHDRAWAL(String.valueOf("ATMNonSterlingWithdrawal")), @XmlEnumValue("ATMAbroadVisaDebit") ATMABROADVISADEBIT(String.valueOf("ATMAbroadVisaDebit")), @XmlEnumValue("CHAPSOutBranch") CHAPSOUTBRANCH(String.valueOf("CHAPSOutBranch")), @XmlEnumValue("CHAPSCancellation") CHAPSCANCELLATION(String.valueOf("CHAPSCancellation")), @XmlEnumValue("CHAPSIn") CHAPSIN(String.valueOf("CHAPSIn")), @XmlEnumValue("CHAPSOutInterBank") CHAPSOUTINTERBANK(String.valueOf("CHAPSOutInterBank")), @XmlEnumValue("CHAPSInterBank") CHAPSINTERBANK(String.valueOf("CHAPSInterBank")), @XmlEnumValue("CHAPSOutPost") CHAPSOUTPOST(String.valueOf("CHAPSOutPost")), @XmlEnumValue("CHAPSOutInterBranch") CHAPSOUTINTERBRANCH(String.valueOf("CHAPSOutInterBranch")), @XmlEnumValue("CHAPSOut") CHAPSOUT(String.valueOf("CHAPSOut")), @XmlEnumValue("CHAPSOutOnline") CHAPSOUTONLINE(String.valueOf("CHAPSOutOnline")), @XmlEnumValue("CardCardReplacement") CARDCARDREPLACEMENT(String.valueOf("CardCardReplacement")), @XmlEnumValue("DraftsCounter") DRAFTSCOUNTER(String.valueOf("DraftsCounter")), @XmlEnumValue("DraftsBankers") DRAFTSBANKERS(String.valueOf("DraftsBankers")), @XmlEnumValue("DraftsCancellation") DRAFTSCANCELLATION(String.valueOf("DraftsCancellation")), @XmlEnumValue("CardGuaranteed") CARDGUARANTEED(String.valueOf("CardGuaranteed")), @XmlEnumValue("DraftsIntlPayableAbroad") DRAFTSINTLPAYABLEABROAD(String.valueOf("DraftsIntlPayableAbroad")), @XmlEnumValue("DraftsLostStolen") DRAFTSLOSTSTOLEN(String.valueOf("DraftsLostStolen")), @XmlEnumValue("CardPersonalisedCard") CARDPERSONALISEDCARD(String.valueOf("CardPersonalisedCard")), @XmlEnumValue("DraftsIntlStoppedCancelled") DRAFTSINTLSTOPPEDCANCELLED(String.valueOf("DraftsIntlStoppedCancelled")), @XmlEnumValue("EmergencyLending") EMERGENCYLENDING(String.valueOf("EmergencyLending")), @XmlEnumValue("FPSInBranch") FPSINBRANCH(String.valueOf("FPSInBranch")), @XmlEnumValue("LegalCourtOrder") LEGALCOURTORDER(String.valueOf("LegalCourtOrder")), @XmlEnumValue("IntlPayFXPaymentIn") INTLPAYFXPAYMENTIN(String.valueOf("IntlPayFXPaymentIn")), @XmlEnumValue("IntlPayForeignPaymentInUKAcc") INTLPAYFOREIGNPAYMENTINUKACC(String.valueOf("IntlPayForeignPaymentInUKAcc")), @XmlEnumValue("IntlPayForeignCharge") INTLPAYFOREIGNCHARGE(String.valueOf("IntlPayForeignCharge")), @XmlEnumValue("IntlPayForeignInternet") INTLPAYFOREIGNINTERNET(String.valueOf("IntlPayForeignInternet")), @XmlEnumValue("IntlPayFXPaymentOut") INTLPAYFXPAYMENTOUT(String.valueOf("IntlPayFXPaymentOut")), @XmlEnumValue("IntlPayFXPaymentOutIR") INTLPAYFXPAYMENTOUTIR(String.valueOf("IntlPayFXPaymentOutIR")), @XmlEnumValue("IntlPayPurchaseNonSterling") INTLPAYPURCHASENONSTERLING(String.valueOf("IntlPayPurchaseNonSterling")), @XmlEnumValue("IntlPayPaymentTracing") INTLPAYPAYMENTTRACING(String.valueOf("IntlPayPaymentTracing")), @XmlEnumValue("IntlPayTransNonSterling") INTLPAYTRANSNONSTERLING(String.valueOf("IntlPayTransNonSterling")), @XmlEnumValue("IntlPayTransRateNonSterling") INTLPAYTRANSRATENONSTERLING(String.valueOf("IntlPayTransRateNonSterling")), @XmlEnumValue("IntlPayWorldpayPayment") INTLPAYWORLDPAYPAYMENT(String.valueOf("IntlPayWorldpayPayment")), @XmlEnumValue("InvPayBankDetailsWrong") INVPAYBANKDETAILSWRONG(String.valueOf("InvPayBankDetailsWrong")), @XmlEnumValue("InvPayForeignBCNR") INVPAYFOREIGNBCNR(String.valueOf("InvPayForeignBCNR")), @XmlEnumValue("InvPayForeignRecall") INVPAYFOREIGNRECALL(String.valueOf("InvPayForeignRecall")), @XmlEnumValue("InvPayStandingOrdUnpaid") INVPAYSTANDINGORDUNPAID(String.valueOf("InvPayStandingOrdUnpaid")), @XmlEnumValue("SafeKeepingEnvelope") SAFEKEEPINGENVELOPE(String.valueOf("SafeKeepingEnvelope")), @XmlEnumValue("SafeKeepingInspection") SAFEKEEPINGINSPECTION(String.valueOf("SafeKeepingInspection")), @XmlEnumValue("SafeKeepingLargeItem") SAFEKEEPINGLARGEITEM(String.valueOf("SafeKeepingLargeItem")), @XmlEnumValue("SafeKeepingParcel") SAFEKEEPINGPARCEL(String.valueOf("SafeKeepingParcel")), @XmlEnumValue("NightSafeNightSafePaidIn") NIGHTSAFENIGHTSAFEPAIDIN(String.valueOf("NightSafeNightSafePaidIn")), @XmlEnumValue("OverdraftReview") OVERDRAFTREVIEW(String.valueOf("OverdraftReview")), @XmlEnumValue("ChqBookTheftLossAllStopped") CHQBOOKTHEFTLOSSALLSTOPPED(String.valueOf("ChqBookTheftLossAllStopped")), @XmlEnumValue("ChqCopy") CHQCOPY(String.valueOf("ChqCopy")), @XmlEnumValue("ChqDraftSterling") CHQDRAFTSTERLING(String.valueOf("ChqDraftSterling")), @XmlEnumValue("ChqOutIssued") CHQOUTISSUED(String.valueOf("ChqOutIssued")), @XmlEnumValue("ChqSpecialChqPresentation") CHQSPECIALCHQPRESENTATION(String.valueOf("ChqSpecialChqPresentation")), @XmlEnumValue("ChqSpecialChqClearance") CHQSPECIALCHQCLEARANCE(String.valueOf("ChqSpecialChqClearance")), @XmlEnumValue("ChqStopped") CHQSTOPPED(String.valueOf("ChqStopped")), @XmlEnumValue("ChqinCashCentre") CHQINCASHCENTRE(String.valueOf("ChqinCashCentre")), @XmlEnumValue("ChqDraftFX") CHQDRAFTFX(String.valueOf("ChqDraftFX")), @XmlEnumValue("ChqForeignCourier") CHQFOREIGNCOURIER(String.valueOf("ChqForeignCourier")), @XmlEnumValue("ChqGiftCheque") CHQGIFTCHEQUE(String.valueOf("ChqGiftCheque")), @XmlEnumValue("ChqForeign") CHQFOREIGN(String.valueOf("ChqForeign")), @XmlEnumValue("ChqChequePhotocopy") CHQCHEQUEPHOTOCOPY(String.valueOf("ChqChequePhotocopy")), @XmlEnumValue("ChqChequeRetrieval") CHQCHEQUERETRIEVAL(String.valueOf("ChqChequeRetrieval")), @XmlEnumValue("ChqSpecialPresentationCount") CHQSPECIALPRESENTATIONCOUNT(String.valueOf("ChqSpecialPresentationCount")), @XmlEnumValue("ChqSpecialPresentationPTT") CHQSPECIALPRESENTATIONPTT(String.valueOf("ChqSpecialPresentationPTT")), @XmlEnumValue("ChqUnpaidCharge") CHQUNPAIDCHARGE(String.valueOf("ChqUnpaidCharge")), @XmlEnumValue("ChqUnpaidTransIn") CHQUNPAIDTRANSIN(String.valueOf("ChqUnpaidTransIn")), @XmlEnumValue("ChqUnpaidTransOut") CHQUNPAIDTRANSOUT(String.valueOf("ChqUnpaidTransOut")), @XmlEnumValue("ChqUnpaidCheque") CHQUNPAIDCHEQUE(String.valueOf("ChqUnpaidCheque")), @XmlEnumValue("ReportCertInterestDuplicate") REPORTCERTINTERESTDUPLICATE(String.valueOf("ReportCertInterestDuplicate")), @XmlEnumValue("ReportCertInterest") REPORTCERTINTEREST(String.valueOf("ReportCertInterest")), @XmlEnumValue("ReportReference") REPORTREFERENCE(String.valueOf("ReportReference")), @XmlEnumValue("ReportReferralItem") REPORTREFERRALITEM(String.valueOf("ReportReferralItem")), @XmlEnumValue("ReportStatementCopyRegular") REPORTSTATEMENTCOPYREGULAR(String.valueOf("ReportStatementCopyRegular")), @XmlEnumValue("ReportStatusEnquiry") REPORTSTATUSENQUIRY(String.valueOf("ReportStatusEnquiry")), @XmlEnumValue("ReportStatementFrequent") REPORTSTATEMENTFREQUENT(String.valueOf("ReportStatementFrequent")), @XmlEnumValue("ReportStatementCopy1") REPORTSTATEMENTCOPY1(String.valueOf("ReportStatementCopy1")), @XmlEnumValue("SEPAIn") SEPAIN(String.valueOf("SEPAIn")), @XmlEnumValue("SEPAEuro") SEPAEURO(String.valueOf("SEPAEuro")), @XmlEnumValue("SEPAOut") SEPAOUT(String.valueOf("SEPAOut")), @XmlEnumValue("TransCreditTransferUKDifferent") TRANSCREDITTRANSFERUKDIFFERENT(String.valueOf("TransCreditTransferUKDifferent")), @XmlEnumValue("TransCredit") TRANSCREDIT(String.valueOf("TransCredit")), @XmlEnumValue("TransCreditTransfer") TRANSCREDITTRANSFER(String.valueOf("TransCreditTransfer")), @XmlEnumValue("TransBuyForeignWithGBP") TRANSBUYFOREIGNWITHGBP(String.valueOf("TransBuyForeignWithGBP")), @XmlEnumValue("TransSWIFTOutUKForeign") TRANSSWIFTOUTUKFOREIGN(String.valueOf("TransSWIFTOutUKForeign")), @XmlEnumValue("TransPOSSaleForeign") TRANSPOSSALEFOREIGN(String.valueOf("TransPOSSaleForeign")), @XmlEnumValue("TransReturnPayment") TRANSRETURNPAYMENT(String.valueOf("TransReturnPayment")), @XmlEnumValue("TransTransferExGroup") TRANSTRANSFEREXGROUP(String.valueOf("TransTransferExGroup")), @XmlEnumValue("TransSWIFTOutNonEEASterling") TRANSSWIFTOUTNONEEASTERLING(String.valueOf("TransSWIFTOutNonEEASterling")), @XmlEnumValue("AutoAutomatedEntries") AUTOAUTOMATEDENTRIES(String.valueOf("AutoAutomatedEntries")), @XmlEnumValue("OnlineReplacementCardReader") ONLINEREPLACEMENTCARDREADER(String.valueOf("OnlineReplacementCardReader")), @XmlEnumValue("OnlineUrgentPayment") ONLINEURGENTPAYMENT(String.valueOf("OnlineUrgentPayment")), @XmlEnumValue("ForeignChqSent") FOREIGNCHQSENT(String.valueOf("ForeignChqSent")), @XmlEnumValue("ForeignFXInwardsCust") FOREIGNFXINWARDSCUST(String.valueOf("ForeignFXInwardsCust")), @XmlEnumValue("ForeignFXOutwards") FOREIGNFXOUTWARDS(String.valueOf("ForeignFXOutwards")), @XmlEnumValue("ForeignPurchase") FOREIGNPURCHASE(String.valueOf("ForeignPurchase")), @XmlEnumValue("ForeignChqDraft") FOREIGNCHQDRAFT(String.valueOf("ForeignChqDraft")), @XmlEnumValue("ServiceCAccountFee") SERVICECACCOUNTFEE(String.valueOf("ServiceCAccountFee")), @XmlEnumValue("ServiceCAccountFeeMonthly") SERVICECACCOUNTFEEMONTHLY(String.valueOf("ServiceCAccountFeeMonthly")), @XmlEnumValue("ServiceCOther") SERVICECOTHER(String.valueOf("ServiceCOther")), @XmlEnumValue("CounterCashOut") COUNTERCASHOUT(String.valueOf("CounterCashOut")), @XmlEnumValue("CounterForeignNoteHandling") COUNTERFOREIGNNOTEHANDLING(String.valueOf("CounterForeignNoteHandling")), @XmlEnumValue("CounterForeignCashOut") COUNTERFOREIGNCASHOUT(String.valueOf("CounterForeignCashOut")), @XmlEnumValue("CounterCashFeeRate") COUNTERCASHFEERATE(String.valueOf("CounterCashFeeRate")), @XmlEnumValue("Other") OTHER(String.valueOf("Other"));


    private String value;

    FeeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String v) {
        for (FeeTypeEnum b : FeeTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
 /**
   * Fee/charge type which is being capped
  **/
  private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();


@XmlType(name="MinMaxTypeEnum")
@XmlEnum(String.class)
public enum MinMaxTypeEnum {

@XmlEnumValue("Minimum") MINIMUM(String.valueOf("Minimum")), @XmlEnumValue("Maximum") MAXIMUM(String.valueOf("Maximum"));


    private String value;

    MinMaxTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MinMaxTypeEnum fromValue(String v) {
        for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")
 /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
  **/
  private MinMaxTypeEnum minMaxType = null;

  @ApiModelProperty(value = "Free text for adding  extra details for fee charge cap")
 /**
   * Free text for adding  extra details for fee charge cap
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")
  @Valid
 /**
   * Other fee type code which is not available in the standard code set
  **/
  private List<BranchCurrentAccountResponseOtherFeeType> otherFeeType = null;
 /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @JsonProperty("CappingPeriod")
  public String getCappingPeriod() {
    if (cappingPeriod == null) {
      return null;
    }
    return cappingPeriod.value();
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OtherFeesCharges2FeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

 /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @JsonProperty("FeeCapAmount")
 @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OtherFeesCharges2FeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

 /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @JsonProperty("FeeCapOccurrence")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OtherFeesCharges2FeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

 /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @JsonProperty("FeeType")
  @NotNull
 @Size(min=1)  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OtherFeesCharges2FeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

 /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   * @return minMaxType
  **/
  @JsonProperty("MinMaxType")
  @NotNull
  public String getMinMaxType() {
    if (minMaxType == null) {
      return null;
    }
    return minMaxType.value();
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OtherFeesCharges2FeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

 /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OtherFeesCharges2FeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @JsonProperty("OtherFeeType")
  public List<BranchCurrentAccountResponseOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OtherFeesCharges2FeeChargeCap otherFeeType(List<BranchCurrentAccountResponseOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OtherFeesCharges2FeeChargeCap addOtherFeeTypeItem(BranchCurrentAccountResponseOtherFeeType otherFeeTypeItem) {
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges2FeeChargeCap {\n");
    
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

