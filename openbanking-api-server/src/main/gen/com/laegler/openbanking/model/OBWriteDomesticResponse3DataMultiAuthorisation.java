package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;
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
  * The multiple authorisation flow response from the ASPSP.
 **/
@ApiModel(description="The multiple authorisation flow response from the ASPSP.")
public class OBWriteDomesticResponse3DataMultiAuthorisation  {
  
  @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String expirationDateTime = null;

  @ApiModelProperty(value = "Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String lastUpdateDateTime = null;

  @ApiModelProperty(value = "Number of authorisations received.")
 /**
   * Number of authorisations received.
  **/
  private Integer numberReceived = null;

  @ApiModelProperty(value = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")
 /**
   * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
  **/
  private Integer numberRequired = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("Authorised") AUTHORISED(String.valueOf("Authorised")), @XmlEnumValue("AwaitingFurtherAuthorisation") AWAITINGFURTHERAUTHORISATION(String.valueOf("AwaitingFurtherAuthorisation")), @XmlEnumValue("Rejected") REJECTED(String.valueOf("Rejected"));


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

  @ApiModelProperty(required = true, value = "Specifies the status of the authorisation flow in code form.")
 /**
   * Specifies the status of the authorisation flow in code form.
  **/
  private StatusEnum status = null;
 /**
   * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @JsonProperty("ExpirationDateTime")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBWriteDomesticResponse3DataMultiAuthorisation expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

 /**
   * Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastUpdateDateTime
  **/
  @JsonProperty("LastUpdateDateTime")
  public String getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(String lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public OBWriteDomesticResponse3DataMultiAuthorisation lastUpdateDateTime(String lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

 /**
   * Number of authorisations received.
   * @return numberReceived
  **/
  @JsonProperty("NumberReceived")
  public Integer getNumberReceived() {
    return numberReceived;
  }

  public void setNumberReceived(Integer numberReceived) {
    this.numberReceived = numberReceived;
  }

  public OBWriteDomesticResponse3DataMultiAuthorisation numberReceived(Integer numberReceived) {
    this.numberReceived = numberReceived;
    return this;
  }

 /**
   * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
   * @return numberRequired
  **/
  @JsonProperty("NumberRequired")
  public Integer getNumberRequired() {
    return numberRequired;
  }

  public void setNumberRequired(Integer numberRequired) {
    this.numberRequired = numberRequired;
  }

  public OBWriteDomesticResponse3DataMultiAuthorisation numberRequired(Integer numberRequired) {
    this.numberRequired = numberRequired;
    return this;
  }

 /**
   * Specifies the status of the authorisation flow in code form.
   * @return status
  **/
  @JsonProperty("Status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBWriteDomesticResponse3DataMultiAuthorisation status(StatusEnum status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticResponse3DataMultiAuthorisation {\n");
    
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    numberReceived: ").append(toIndentedString(numberReceived)).append("\n");
    sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

