
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ATMService"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Balance"/&gt;
 *     &lt;enumeration value="BillPayments"/&gt;
 *     &lt;enumeration value="CashDeposits"/&gt;
 *     &lt;enumeration value="CharityDonation"/&gt;
 *     &lt;enumeration value="ChequeDeposits"/&gt;
 *     &lt;enumeration value="CashWithdrawal"/&gt;
 *     &lt;enumeration value="EnvelopeDeposit"/&gt;
 *     &lt;enumeration value="FastCash"/&gt;
 *     &lt;enumeration value="MobileBankingRegistration"/&gt;
 *     &lt;enumeration value="MobilePaymentRegistration"/&gt;
 *     &lt;enumeration value="MobilePhoneTopUp"/&gt;
 *     &lt;enumeration value="OrderStatement"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="PINActivation"/&gt;
 *     &lt;enumeration value="PINChange"/&gt;
 *     &lt;enumeration value="PINUnblock"/&gt;
 *     &lt;enumeration value="MiniStatement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMService")
@XmlEnum
public enum ATMService {

    @XmlEnumValue("Balance")
    BALANCE("Balance"),
    @XmlEnumValue("BillPayments")
    BILL_PAYMENTS("BillPayments"),
    @XmlEnumValue("CashDeposits")
    CASH_DEPOSITS("CashDeposits"),
    @XmlEnumValue("CharityDonation")
    CHARITY_DONATION("CharityDonation"),
    @XmlEnumValue("ChequeDeposits")
    CHEQUE_DEPOSITS("ChequeDeposits"),
    @XmlEnumValue("CashWithdrawal")
    CASH_WITHDRAWAL("CashWithdrawal"),
    @XmlEnumValue("EnvelopeDeposit")
    ENVELOPE_DEPOSIT("EnvelopeDeposit"),
    @XmlEnumValue("FastCash")
    FAST_CASH("FastCash"),
    @XmlEnumValue("MobileBankingRegistration")
    MOBILE_BANKING_REGISTRATION("MobileBankingRegistration"),
    @XmlEnumValue("MobilePaymentRegistration")
    MOBILE_PAYMENT_REGISTRATION("MobilePaymentRegistration"),
    @XmlEnumValue("MobilePhoneTopUp")
    MOBILE_PHONE_TOP_UP("MobilePhoneTopUp"),
    @XmlEnumValue("OrderStatement")
    ORDER_STATEMENT("OrderStatement"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PINActivation")
    PIN_ACTIVATION("PINActivation"),
    @XmlEnumValue("PINChange")
    PIN_CHANGE("PINChange"),
    @XmlEnumValue("PINUnblock")
    PIN_UNBLOCK("PINUnblock"),
    @XmlEnumValue("MiniStatement")
    MINI_STATEMENT("MiniStatement");
    private final String value;

    ATMService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ATMService fromValue(String v) {
        for (ATMService c: ATMService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
