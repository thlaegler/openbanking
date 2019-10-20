package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEvent1;
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
  * The resource-update event.
 **/
@ApiModel(description="The resource-update event.")
public class OBEventNotification1  {
  
  @ApiModelProperty(required = true, value = "Audience.")
 /**
   * Audience.
  **/
  private String aud = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBEvent1 events = null;

  @ApiModelProperty(required = true, value = "Issued At. ")
 /**
   * Issued At. 
  **/
  private Integer iat = null;

  @ApiModelProperty(required = true, value = "Issuer.")
 /**
   * Issuer.
  **/
  private String iss = null;

  @ApiModelProperty(required = true, value = "JWT ID.")
 /**
   * JWT ID.
  **/
  private String jti = null;

  @ApiModelProperty(required = true, value = "Subject")
 /**
   * Subject
  **/
  private String sub = null;

  @ApiModelProperty(required = true, value = "Time of Event.")
 /**
   * Time of Event.
  **/
  private Integer toe = null;

  @ApiModelProperty(required = true, value = "Transaction Identifier.")
 /**
   * Transaction Identifier.
  **/
  private String txn = null;
 /**
   * Audience.
   * @return aud
  **/
  @JsonProperty("aud")
  @NotNull
 @Size(min=1,max=128)  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBEventNotification1 aud(String aud) {
    this.aud = aud;
    return this;
  }

 /**
   * Get events
   * @return events
  **/
  @JsonProperty("events")
  @NotNull
  public OBEvent1 getEvents() {
    return events;
  }

  public void setEvents(OBEvent1 events) {
    this.events = events;
  }

  public OBEventNotification1 events(OBEvent1 events) {
    this.events = events;
    return this;
  }

 /**
   * Issued At. 
   * minimum: 0
   * @return iat
  **/
  @JsonProperty("iat")
  @NotNull
 @Min(0)  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public OBEventNotification1 iat(Integer iat) {
    this.iat = iat;
    return this;
  }

 /**
   * Issuer.
   * @return iss
  **/
  @JsonProperty("iss")
  @NotNull
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBEventNotification1 iss(String iss) {
    this.iss = iss;
    return this;
  }

 /**
   * JWT ID.
   * @return jti
  **/
  @JsonProperty("jti")
  @NotNull
 @Size(min=1,max=128)  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public OBEventNotification1 jti(String jti) {
    this.jti = jti;
    return this;
  }

 /**
   * Subject
   * @return sub
  **/
  @JsonProperty("sub")
  @NotNull
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OBEventNotification1 sub(String sub) {
    this.sub = sub;
    return this;
  }

 /**
   * Time of Event.
   * minimum: 0
   * @return toe
  **/
  @JsonProperty("toe")
  @NotNull
 @Min(0)  public Integer getToe() {
    return toe;
  }

  public void setToe(Integer toe) {
    this.toe = toe;
  }

  public OBEventNotification1 toe(Integer toe) {
    this.toe = toe;
    return this;
  }

 /**
   * Transaction Identifier.
   * @return txn
  **/
  @JsonProperty("txn")
  @NotNull
 @Size(min=1,max=128)  public String getTxn() {
    return txn;
  }

  public void setTxn(String txn) {
    this.txn = txn;
  }

  public OBEventNotification1 txn(String txn) {
    this.txn = txn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventNotification1 {\n");
    
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    toe: ").append(toIndentedString(toe)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
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

