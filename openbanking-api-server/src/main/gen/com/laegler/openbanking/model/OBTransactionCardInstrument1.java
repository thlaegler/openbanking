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
  * Set of elements to describe the card instrument used in the transaction.
 **/
@ApiModel(description="Set of elements to describe the card instrument used in the transaction.")
public class OBTransactionCardInstrument1  {
  

@XmlType(name="AuthorisationTypeEnum")
@XmlEnum(String.class)
public enum AuthorisationTypeEnum {

@XmlEnumValue("ConsumerDevice") CONSUMERDEVICE(String.valueOf("ConsumerDevice")), @XmlEnumValue("Contactless") CONTACTLESS(String.valueOf("Contactless")), @XmlEnumValue("None") NONE(String.valueOf("None")), @XmlEnumValue("PIN") PIN(String.valueOf("PIN"));


    private String value;

    AuthorisationTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AuthorisationTypeEnum fromValue(String v) {
        for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The card authorisation type.")
 /**
   * The card authorisation type.
  **/
  private AuthorisationTypeEnum authorisationType = null;


@XmlType(name="CardSchemeNameEnum")
@XmlEnum(String.class)
public enum CardSchemeNameEnum {

@XmlEnumValue("AmericanExpress") AMERICANEXPRESS(String.valueOf("AmericanExpress")), @XmlEnumValue("Diners") DINERS(String.valueOf("Diners")), @XmlEnumValue("Discover") DISCOVER(String.valueOf("Discover")), @XmlEnumValue("MasterCard") MASTERCARD(String.valueOf("MasterCard")), @XmlEnumValue("VISA") VISA(String.valueOf("VISA"));


    private String value;

    CardSchemeNameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CardSchemeNameEnum fromValue(String v) {
        for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Name of the card scheme.")
 /**
   * Name of the card scheme.
  **/
  private CardSchemeNameEnum cardSchemeName = null;

  @ApiModelProperty(value = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.")
 /**
   * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
  **/
  private String identification = null;

  @ApiModelProperty(value = "Name of the cardholder using the card instrument.")
 /**
   * Name of the cardholder using the card instrument.
  **/
  private String name = null;
 /**
   * The card authorisation type.
   * @return authorisationType
  **/
  @JsonProperty("AuthorisationType")
  public String getAuthorisationType() {
    if (authorisationType == null) {
      return null;
    }
    return authorisationType.value();
  }

  public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
  }

  public OBTransactionCardInstrument1 authorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

 /**
   * Name of the card scheme.
   * @return cardSchemeName
  **/
  @JsonProperty("CardSchemeName")
  @NotNull
  public String getCardSchemeName() {
    if (cardSchemeName == null) {
      return null;
    }
    return cardSchemeName.value();
  }

  public void setCardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public OBTransactionCardInstrument1 cardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
    return this;
  }

 /**
   * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
   * @return identification
  **/
  @JsonProperty("Identification")
 @Size(min=1,max=34)  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBTransactionCardInstrument1 identification(String identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Name of the cardholder using the card instrument.
   * @return name
  **/
  @JsonProperty("Name")
 @Size(min=1,max=70)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBTransactionCardInstrument1 name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCardInstrument1 {\n");
    
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

