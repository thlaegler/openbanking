package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomestic2DataInitiation;
import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
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

public class OBWriteDomesticResponse3Data  {
  
  @ApiModelProperty(value = "")
  private List<OBWriteDomesticConsentResponse3DataCharges> charges = null;

  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String creationDateTime = null;

  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.")
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
  **/
  private String domesticPaymentId = null;

  @ApiModelProperty(value = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String expectedExecutionDateTime = null;

  @ApiModelProperty(value = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String expectedSettlementDateTime = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteDomestic2DataInitiation initiation = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("AcceptedCreditSettlementCompleted") ACCEPTEDCREDITSETTLEMENTCOMPLETED(String.valueOf("AcceptedCreditSettlementCompleted")), @XmlEnumValue("AcceptedSettlementCompleted") ACCEPTEDSETTLEMENTCOMPLETED(String.valueOf("AcceptedSettlementCompleted")), @XmlEnumValue("AcceptedSettlementInProcess") ACCEPTEDSETTLEMENTINPROCESS(String.valueOf("AcceptedSettlementInProcess")), @XmlEnumValue("AcceptedWithoutPosting") ACCEPTEDWITHOUTPOSTING(String.valueOf("AcceptedWithoutPosting")), @XmlEnumValue("Pending") PENDING(String.valueOf("Pending")), @XmlEnumValue("Rejected") REJECTED(String.valueOf("Rejected"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the status of the payment information group.")
 /**
   * Specifies the status of the payment information group.
  **/
  private StatusEnum status = null;

  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String statusUpdateDateTime = null;
 /**
   * Get charges
   * @return charges
  **/
  @JsonProperty("Charges")
  public List<OBWriteDomesticConsentResponse3DataCharges> getCharges() {
    return charges;
  }

  public void setCharges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
  }

  public OBWriteDomesticResponse3Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteDomesticResponse3Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
    this.charges.add(chargesItem);
    return this;
  }

 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteDomesticResponse3Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Date and time at which the message was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBWriteDomesticResponse3Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource.
   * @return domesticPaymentId
  **/
  @JsonProperty("DomesticPaymentId")
  public String getDomesticPaymentId() {
    return domesticPaymentId;
  }

  public void setDomesticPaymentId(String domesticPaymentId) {
    this.domesticPaymentId = domesticPaymentId;
  }

  public OBWriteDomesticResponse3Data domesticPaymentId(String domesticPaymentId) {
    this.domesticPaymentId = domesticPaymentId;
    return this;
  }

 /**
   * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedExecutionDateTime
  **/
  @JsonProperty("ExpectedExecutionDateTime")
  public String getExpectedExecutionDateTime() {
    return expectedExecutionDateTime;
  }

  public void setExpectedExecutionDateTime(String expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
  }

  public OBWriteDomesticResponse3Data expectedExecutionDateTime(String expectedExecutionDateTime) {
    this.expectedExecutionDateTime = expectedExecutionDateTime;
    return this;
  }

 /**
   * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expectedSettlementDateTime
  **/
  @JsonProperty("ExpectedSettlementDateTime")
  public String getExpectedSettlementDateTime() {
    return expectedSettlementDateTime;
  }

  public void setExpectedSettlementDateTime(String expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
  }

  public OBWriteDomesticResponse3Data expectedSettlementDateTime(String expectedSettlementDateTime) {
    this.expectedSettlementDateTime = expectedSettlementDateTime;
    return this;
  }

 /**
   * Get initiation
   * @return initiation
  **/
  @JsonProperty("Initiation")
  public OBWriteDomestic2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticResponse3Data initiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

 /**
   * Get multiAuthorisation
   * @return multiAuthorisation
  **/
  @JsonProperty("MultiAuthorisation")
  public OBWriteDomesticResponse3DataMultiAuthorisation getMultiAuthorisation() {
    return multiAuthorisation;
  }

  public void setMultiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
  }

  public OBWriteDomesticResponse3Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
    return this;
  }

 /**
   * Specifies the status of the payment information group.
   * @return status
  **/
  @JsonProperty("Status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteDomesticResponse3Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @JsonProperty("StatusUpdateDateTime")
  public String getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBWriteDomesticResponse3Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticResponse3Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    domesticPaymentId: ").append(toIndentedString(domesticPaymentId)).append("\n");
    sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
    sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    multiAuthorisation: ").append(toIndentedString(multiAuthorisation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
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

