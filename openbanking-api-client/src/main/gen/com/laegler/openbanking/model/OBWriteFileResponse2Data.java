package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomesticConsentResponse3DataCharges;
import com.laegler.openbanking.model.OBWriteDomesticResponse3DataMultiAuthorisation;
import com.laegler.openbanking.model.OBWriteFile2DataInitiation;
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

public class OBWriteFileResponse2Data  {
  
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

  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.")
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.
  **/
  private String filePaymentId = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteFile2DataInitiation initiation = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("InitiationCompleted") INITIATIONCOMPLETED(String.valueOf("InitiationCompleted")), @XmlEnumValue("InitiationFailed") INITIATIONFAILED(String.valueOf("InitiationFailed")), @XmlEnumValue("InitiationPending") INITIATIONPENDING(String.valueOf("InitiationPending"));


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

  @ApiModelProperty(required = true, value = "Specifies the status of the payment order resource.")
 /**
   * Specifies the status of the payment order resource.
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

  public OBWriteFileResponse2Data charges(List<OBWriteDomesticConsentResponse3DataCharges> charges) {
    this.charges = charges;
    return this;
  }

  public OBWriteFileResponse2Data addChargesItem(OBWriteDomesticConsentResponse3DataCharges chargesItem) {
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

  public OBWriteFileResponse2Data consentId(String consentId) {
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

  public OBWriteFileResponse2Data creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the file payment resource.
   * @return filePaymentId
  **/
  @JsonProperty("FilePaymentId")
  public String getFilePaymentId() {
    return filePaymentId;
  }

  public void setFilePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
  }

  public OBWriteFileResponse2Data filePaymentId(String filePaymentId) {
    this.filePaymentId = filePaymentId;
    return this;
  }

 /**
   * Get initiation
   * @return initiation
  **/
  @JsonProperty("Initiation")
  public OBWriteFile2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteFile2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteFileResponse2Data initiation(OBWriteFile2DataInitiation initiation) {
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

  public OBWriteFileResponse2Data multiAuthorisation(OBWriteDomesticResponse3DataMultiAuthorisation multiAuthorisation) {
    this.multiAuthorisation = multiAuthorisation;
    return this;
  }

 /**
   * Specifies the status of the payment order resource.
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

  public OBWriteFileResponse2Data status(StatusEnum status) {
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

  public OBWriteFileResponse2Data statusUpdateDateTime(String statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFileResponse2Data {\n");
    
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    filePaymentId: ").append(toIndentedString(filePaymentId)).append("\n");
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

