package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEvent1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The resource-update event.
 */
@ApiModel(description = "The resource-update event.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBEventNotification1   {
  @JsonProperty("aud")
  private String aud = null;

  @JsonProperty("events")
  private OBEvent1 events = null;

  @JsonProperty("iat")
  private Integer iat = null;

  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("jti")
  private String jti = null;

  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("toe")
  private Integer toe = null;

  @JsonProperty("txn")
  private String txn = null;

  public OBEventNotification1 aud(String aud) {
    this.aud = aud;
    return this;
  }

  /**
   * Audience.
   * @return aud
  **/
  @ApiModelProperty(required = true, value = "Audience.")
  @NotNull

@Size(min=1,max=128) 
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBEventNotification1 events(OBEvent1 events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBEvent1 getEvents() {
    return events;
  }

  public void setEvents(OBEvent1 events) {
    this.events = events;
  }

  public OBEventNotification1 iat(Integer iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Issued At. 
   * minimum: 0
   * @return iat
  **/
  @ApiModelProperty(required = true, value = "Issued At. ")
  @NotNull

@Min(0)
  public Integer getIat() {
    return iat;
  }

  public void setIat(Integer iat) {
    this.iat = iat;
  }

  public OBEventNotification1 iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Issuer.
   * @return iss
  **/
  @ApiModelProperty(required = true, value = "Issuer.")
  @NotNull


  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBEventNotification1 jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * JWT ID.
   * @return jti
  **/
  @ApiModelProperty(required = true, value = "JWT ID.")
  @NotNull

@Size(min=1,max=128) 
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public OBEventNotification1 sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Subject
   * @return sub
  **/
  @ApiModelProperty(required = true, value = "Subject")
  @NotNull


  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OBEventNotification1 toe(Integer toe) {
    this.toe = toe;
    return this;
  }

  /**
   * Time of Event.
   * minimum: 0
   * @return toe
  **/
  @ApiModelProperty(required = true, value = "Time of Event.")
  @NotNull

@Min(0)
  public Integer getToe() {
    return toe;
  }

  public void setToe(Integer toe) {
    this.toe = toe;
  }

  public OBEventNotification1 txn(String txn) {
    this.txn = txn;
    return this;
  }

  /**
   * Transaction Identifier.
   * @return txn
  **/
  @ApiModelProperty(required = true, value = "Transaction Identifier.")
  @NotNull

@Size(min=1,max=128) 
  public String getTxn() {
    return txn;
  }

  public void setTxn(String txn) {
    this.txn = txn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventNotification1 obEventNotification1 = (OBEventNotification1) o;
    return Objects.equals(this.aud, obEventNotification1.aud) &&
        Objects.equals(this.events, obEventNotification1.events) &&
        Objects.equals(this.iat, obEventNotification1.iat) &&
        Objects.equals(this.iss, obEventNotification1.iss) &&
        Objects.equals(this.jti, obEventNotification1.jti) &&
        Objects.equals(this.sub, obEventNotification1.sub) &&
        Objects.equals(this.toe, obEventNotification1.toe) &&
        Objects.equals(this.txn, obEventNotification1.txn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aud, events, iat, iss, jti, sub, toe, txn);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

