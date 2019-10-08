package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBSupplementaryData1;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationDebtorAccount;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiationRemittanceInformation;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
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
  * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.
 **/
@ApiModel(description="The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.")
public class OBWriteFile2DataInitiation  {
  
  @ApiModelProperty(value = "Total of all individual amounts included in the group, irrespective of currencies.")
  @Valid
 /**
   * Total of all individual amounts included in the group, irrespective of currencies.
  **/
  private BigDecimal controlSum = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

  @ApiModelProperty(required = true, value = "A base64 encoding of a SHA256 hash of the file to be uploaded.")
 /**
   * A base64 encoding of a SHA256 hash of the file to be uploaded.
  **/
  private String fileHash = null;

  @ApiModelProperty(value = "Reference for the file.")
 /**
   * Reference for the file.
  **/
  private String fileReference = null;

  @ApiModelProperty(required = true, value = "Specifies the payment file type.")
 /**
   * Specifies the payment file type.
  **/
  private String fileType = null;

  @ApiModelProperty(value = "")
  private String localInstrument = null;

  @ApiModelProperty(value = "Number of individual transactions contained in the payment information group.")
 /**
   * Number of individual transactions contained in the payment information group.
  **/
  private String numberOfTransactions = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

  @ApiModelProperty(value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String requestedExecutionDateTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private OBSupplementaryData1 supplementaryData = null;
 /**
   * Total of all individual amounts included in the group, irrespective of currencies.
   * @return controlSum
  **/
  @JsonProperty("ControlSum")
  public BigDecimal getControlSum() {
    return controlSum;
  }

  public void setControlSum(BigDecimal controlSum) {
    this.controlSum = controlSum;
  }

  public OBWriteFile2DataInitiation controlSum(BigDecimal controlSum) {
    this.controlSum = controlSum;
    return this;
  }

 /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @JsonProperty("DebtorAccount")
  public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBWriteFile2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

 /**
   * A base64 encoding of a SHA256 hash of the file to be uploaded.
   * @return fileHash
  **/
  @JsonProperty("FileHash")
  @NotNull
 @Size(min=1,max=44)  public String getFileHash() {
    return fileHash;
  }

  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }

  public OBWriteFile2DataInitiation fileHash(String fileHash) {
    this.fileHash = fileHash;
    return this;
  }

 /**
   * Reference for the file.
   * @return fileReference
  **/
  @JsonProperty("FileReference")
 @Size(min=1,max=40)  public String getFileReference() {
    return fileReference;
  }

  public void setFileReference(String fileReference) {
    this.fileReference = fileReference;
  }

  public OBWriteFile2DataInitiation fileReference(String fileReference) {
    this.fileReference = fileReference;
    return this;
  }

 /**
   * Specifies the payment file type.
   * @return fileType
  **/
  @JsonProperty("FileType")
  @NotNull
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public OBWriteFile2DataInitiation fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

 /**
   * Get localInstrument
   * @return localInstrument
  **/
  @JsonProperty("LocalInstrument")
  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBWriteFile2DataInitiation localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

 /**
   * Number of individual transactions contained in the payment information group.
   * @return numberOfTransactions
  **/
  @JsonProperty("NumberOfTransactions")
 @Pattern(regexp="[0-9]{1,15}")  public String getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(String numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  public OBWriteFile2DataInitiation numberOfTransactions(String numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

 /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @JsonProperty("RemittanceInformation")
  public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public OBWriteFile2DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

 /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return requestedExecutionDateTime
  **/
  @JsonProperty("RequestedExecutionDateTime")
  public String getRequestedExecutionDateTime() {
    return requestedExecutionDateTime;
  }

  public void setRequestedExecutionDateTime(String requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
  }

  public OBWriteFile2DataInitiation requestedExecutionDateTime(String requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
    return this;
  }

 /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBWriteFile2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFile2DataInitiation {\n");
    
    sb.append("    controlSum: ").append(toIndentedString(controlSum)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
    sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

