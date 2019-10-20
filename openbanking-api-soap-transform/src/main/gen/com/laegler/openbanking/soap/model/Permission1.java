
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Permission1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Permission1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReadAccountsBasic"/&gt;
 *     &lt;enumeration value="ReadAccountsDetail"/&gt;
 *     &lt;enumeration value="ReadBalances"/&gt;
 *     &lt;enumeration value="ReadBeneficiariesBasic"/&gt;
 *     &lt;enumeration value="ReadBeneficiariesDetail"/&gt;
 *     &lt;enumeration value="ReadDirectDebits"/&gt;
 *     &lt;enumeration value="ReadOffers"/&gt;
 *     &lt;enumeration value="ReadPAN"/&gt;
 *     &lt;enumeration value="ReadParty"/&gt;
 *     &lt;enumeration value="ReadPartyPSU"/&gt;
 *     &lt;enumeration value="ReadProducts"/&gt;
 *     &lt;enumeration value="ReadScheduledPaymentsBasic"/&gt;
 *     &lt;enumeration value="ReadScheduledPaymentsDetail"/&gt;
 *     &lt;enumeration value="ReadStandingOrdersBasic"/&gt;
 *     &lt;enumeration value="ReadStandingOrdersDetail"/&gt;
 *     &lt;enumeration value="ReadStatementsBasic"/&gt;
 *     &lt;enumeration value="ReadStatementsDetail"/&gt;
 *     &lt;enumeration value="ReadTransactionsBasic"/&gt;
 *     &lt;enumeration value="ReadTransactionsCredits"/&gt;
 *     &lt;enumeration value="ReadTransactionsDebits"/&gt;
 *     &lt;enumeration value="ReadTransactionsDetail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Permission1")
@XmlEnum
public enum Permission1 {

    @XmlEnumValue("ReadAccountsBasic")
    READ_ACCOUNTS_BASIC("ReadAccountsBasic"),
    @XmlEnumValue("ReadAccountsDetail")
    READ_ACCOUNTS_DETAIL("ReadAccountsDetail"),
    @XmlEnumValue("ReadBalances")
    READ_BALANCES("ReadBalances"),
    @XmlEnumValue("ReadBeneficiariesBasic")
    READ_BENEFICIARIES_BASIC("ReadBeneficiariesBasic"),
    @XmlEnumValue("ReadBeneficiariesDetail")
    READ_BENEFICIARIES_DETAIL("ReadBeneficiariesDetail"),
    @XmlEnumValue("ReadDirectDebits")
    READ_DIRECT_DEBITS("ReadDirectDebits"),
    @XmlEnumValue("ReadOffers")
    READ_OFFERS("ReadOffers"),
    @XmlEnumValue("ReadPAN")
    READ_PAN("ReadPAN"),
    @XmlEnumValue("ReadParty")
    READ_PARTY("ReadParty"),
    @XmlEnumValue("ReadPartyPSU")
    READ_PARTY_PSU("ReadPartyPSU"),
    @XmlEnumValue("ReadProducts")
    READ_PRODUCTS("ReadProducts"),
    @XmlEnumValue("ReadScheduledPaymentsBasic")
    READ_SCHEDULED_PAYMENTS_BASIC("ReadScheduledPaymentsBasic"),
    @XmlEnumValue("ReadScheduledPaymentsDetail")
    READ_SCHEDULED_PAYMENTS_DETAIL("ReadScheduledPaymentsDetail"),
    @XmlEnumValue("ReadStandingOrdersBasic")
    READ_STANDING_ORDERS_BASIC("ReadStandingOrdersBasic"),
    @XmlEnumValue("ReadStandingOrdersDetail")
    READ_STANDING_ORDERS_DETAIL("ReadStandingOrdersDetail"),
    @XmlEnumValue("ReadStatementsBasic")
    READ_STATEMENTS_BASIC("ReadStatementsBasic"),
    @XmlEnumValue("ReadStatementsDetail")
    READ_STATEMENTS_DETAIL("ReadStatementsDetail"),
    @XmlEnumValue("ReadTransactionsBasic")
    READ_TRANSACTIONS_BASIC("ReadTransactionsBasic"),
    @XmlEnumValue("ReadTransactionsCredits")
    READ_TRANSACTIONS_CREDITS("ReadTransactionsCredits"),
    @XmlEnumValue("ReadTransactionsDebits")
    READ_TRANSACTIONS_DEBITS("ReadTransactionsDebits"),
    @XmlEnumValue("ReadTransactionsDetail")
    READ_TRANSACTIONS_DETAIL("ReadTransactionsDetail");
    private final String value;

    Permission1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Permission1 fromValue(String v) {
        for (Permission1 c: Permission1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
