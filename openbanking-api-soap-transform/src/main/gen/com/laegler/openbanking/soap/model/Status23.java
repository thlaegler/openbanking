
package com.laegler.openbanking.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status23.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Status23"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="AcceptedCancellationRequest"/&gt;
 *     &lt;enumeration value="AcceptedCreditSettlementCompleted"/&gt;
 *     &lt;enumeration value="AcceptedCustomerProfile"/&gt;
 *     &lt;enumeration value="AcceptedFundsChecked"/&gt;
 *     &lt;enumeration value="AcceptedSettlementCompleted"/&gt;
 *     &lt;enumeration value="AcceptedSettlementInProcess"/&gt;
 *     &lt;enumeration value="AcceptedTechnicalValidation"/&gt;
 *     &lt;enumeration value="AcceptedWithChange"/&gt;
 *     &lt;enumeration value="AcceptedWithoutPosting"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="NoCancellationProcess"/&gt;
 *     &lt;enumeration value="PartiallyAcceptedCancellationRequest"/&gt;
 *     &lt;enumeration value="PartiallyAcceptedTechnicalCorrect"/&gt;
 *     &lt;enumeration value="PaymentCancelled"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="PendingCancellationRequest"/&gt;
 *     &lt;enumeration value="Received"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="RejectedCancellationRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status23")
@XmlEnum
public enum Status23 {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("AcceptedCancellationRequest")
    ACCEPTED_CANCELLATION_REQUEST("AcceptedCancellationRequest"),
    @XmlEnumValue("AcceptedCreditSettlementCompleted")
    ACCEPTED_CREDIT_SETTLEMENT_COMPLETED("AcceptedCreditSettlementCompleted"),
    @XmlEnumValue("AcceptedCustomerProfile")
    ACCEPTED_CUSTOMER_PROFILE("AcceptedCustomerProfile"),
    @XmlEnumValue("AcceptedFundsChecked")
    ACCEPTED_FUNDS_CHECKED("AcceptedFundsChecked"),
    @XmlEnumValue("AcceptedSettlementCompleted")
    ACCEPTED_SETTLEMENT_COMPLETED("AcceptedSettlementCompleted"),
    @XmlEnumValue("AcceptedSettlementInProcess")
    ACCEPTED_SETTLEMENT_IN_PROCESS("AcceptedSettlementInProcess"),
    @XmlEnumValue("AcceptedTechnicalValidation")
    ACCEPTED_TECHNICAL_VALIDATION("AcceptedTechnicalValidation"),
    @XmlEnumValue("AcceptedWithChange")
    ACCEPTED_WITH_CHANGE("AcceptedWithChange"),
    @XmlEnumValue("AcceptedWithoutPosting")
    ACCEPTED_WITHOUT_POSTING("AcceptedWithoutPosting"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("NoCancellationProcess")
    NO_CANCELLATION_PROCESS("NoCancellationProcess"),
    @XmlEnumValue("PartiallyAcceptedCancellationRequest")
    PARTIALLY_ACCEPTED_CANCELLATION_REQUEST("PartiallyAcceptedCancellationRequest"),
    @XmlEnumValue("PartiallyAcceptedTechnicalCorrect")
    PARTIALLY_ACCEPTED_TECHNICAL_CORRECT("PartiallyAcceptedTechnicalCorrect"),
    @XmlEnumValue("PaymentCancelled")
    PAYMENT_CANCELLED("PaymentCancelled"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("PendingCancellationRequest")
    PENDING_CANCELLATION_REQUEST("PendingCancellationRequest"),
    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("RejectedCancellationRequest")
    REJECTED_CANCELLATION_REQUEST("RejectedCancellationRequest");
    private final String value;

    Status23(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status23 fromValue(String v) {
        for (Status23 c: Status23 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
