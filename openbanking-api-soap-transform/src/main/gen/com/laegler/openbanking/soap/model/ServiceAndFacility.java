
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAndFacility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAndFacility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AssistedServiceCounter"/&gt;
 *     &lt;enumeration value="ExternalATM"/&gt;
 *     &lt;enumeration value="AccountVerificationService"/&gt;
 *     &lt;enumeration value="BusinessCounter"/&gt;
 *     &lt;enumeration value="BureauDeChange"/&gt;
 *     &lt;enumeration value="BusinessDepositTerminal"/&gt;
 *     &lt;enumeration value="BusinessITSupport"/&gt;
 *     &lt;enumeration value="CardIssuanceFacility"/&gt;
 *     &lt;enumeration value="CollectionLockers"/&gt;
 *     &lt;enumeration value="CounterServices"/&gt;
 *     &lt;enumeration value="ExternalQuickServicePoint"/&gt;
 *     &lt;enumeration value="InternalQuickServicePoint"/&gt;
 *     &lt;enumeration value="InternalATM"/&gt;
 *     &lt;enumeration value="LodgementDevice"/&gt;
 *     &lt;enumeration value="MortgageAdvisor"/&gt;
 *     &lt;enumeration value="MeetingRooms"/&gt;
 *     &lt;enumeration value="NightSafe"/&gt;
 *     &lt;enumeration value="OnlineBankingPoint"/&gt;
 *     &lt;enumeration value="OnDemandCurrency"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Parking"/&gt;
 *     &lt;enumeration value="PremierCounter"/&gt;
 *     &lt;enumeration value="QuickDeposit"/&gt;
 *     &lt;enumeration value="SaturdayCounterService"/&gt;
 *     &lt;enumeration value="StatementPrinter"/&gt;
 *     &lt;enumeration value="SelfServiceAccountOpening"/&gt;
 *     &lt;enumeration value="VideoBanking"/&gt;
 *     &lt;enumeration value="WiFi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceAndFacility")
@XmlEnum
public enum ServiceAndFacility {

    @XmlEnumValue("AssistedServiceCounter")
    ASSISTED_SERVICE_COUNTER("AssistedServiceCounter"),
    @XmlEnumValue("ExternalATM")
    EXTERNAL_ATM("ExternalATM"),
    @XmlEnumValue("AccountVerificationService")
    ACCOUNT_VERIFICATION_SERVICE("AccountVerificationService"),
    @XmlEnumValue("BusinessCounter")
    BUSINESS_COUNTER("BusinessCounter"),
    @XmlEnumValue("BureauDeChange")
    BUREAU_DE_CHANGE("BureauDeChange"),
    @XmlEnumValue("BusinessDepositTerminal")
    BUSINESS_DEPOSIT_TERMINAL("BusinessDepositTerminal"),
    @XmlEnumValue("BusinessITSupport")
    BUSINESS_IT_SUPPORT("BusinessITSupport"),
    @XmlEnumValue("CardIssuanceFacility")
    CARD_ISSUANCE_FACILITY("CardIssuanceFacility"),
    @XmlEnumValue("CollectionLockers")
    COLLECTION_LOCKERS("CollectionLockers"),
    @XmlEnumValue("CounterServices")
    COUNTER_SERVICES("CounterServices"),
    @XmlEnumValue("ExternalQuickServicePoint")
    EXTERNAL_QUICK_SERVICE_POINT("ExternalQuickServicePoint"),
    @XmlEnumValue("InternalQuickServicePoint")
    INTERNAL_QUICK_SERVICE_POINT("InternalQuickServicePoint"),
    @XmlEnumValue("InternalATM")
    INTERNAL_ATM("InternalATM"),
    @XmlEnumValue("LodgementDevice")
    LODGEMENT_DEVICE("LodgementDevice"),
    @XmlEnumValue("MortgageAdvisor")
    MORTGAGE_ADVISOR("MortgageAdvisor"),
    @XmlEnumValue("MeetingRooms")
    MEETING_ROOMS("MeetingRooms"),
    @XmlEnumValue("NightSafe")
    NIGHT_SAFE("NightSafe"),
    @XmlEnumValue("OnlineBankingPoint")
    ONLINE_BANKING_POINT("OnlineBankingPoint"),
    @XmlEnumValue("OnDemandCurrency")
    ON_DEMAND_CURRENCY("OnDemandCurrency"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("PremierCounter")
    PREMIER_COUNTER("PremierCounter"),
    @XmlEnumValue("QuickDeposit")
    QUICK_DEPOSIT("QuickDeposit"),
    @XmlEnumValue("SaturdayCounterService")
    SATURDAY_COUNTER_SERVICE("SaturdayCounterService"),
    @XmlEnumValue("StatementPrinter")
    STATEMENT_PRINTER("StatementPrinter"),
    @XmlEnumValue("SelfServiceAccountOpening")
    SELF_SERVICE_ACCOUNT_OPENING("SelfServiceAccountOpening"),
    @XmlEnumValue("VideoBanking")
    VIDEO_BANKING("VideoBanking"),
    @XmlEnumValue("WiFi")
    WI_FI("WiFi");
    private final String value;

    ServiceAndFacility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAndFacility fromValue(String v) {
        for (ServiceAndFacility c: ServiceAndFacility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
