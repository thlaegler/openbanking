package com.laegler.openbanking.model;

import io.swagger.annotations.ApiModel;

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
  * The authorisation type request from the TPP.
 **/
@ApiModel(description="The authorisation type request from the TPP.")
public class OBWriteDomesticConsent3DataAuthorisation  {
  

@XmlType(name="AuthorisationTypeEnum")
@XmlEnum(String.class)
public enum AuthorisationTypeEnum {

@XmlEnumValue("Any") ANY(String.valueOf("Any")), @XmlEnumValue("Single") SINGLE(String.valueOf("Single"));


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

  @ApiModelProperty(required = true, value = "Type of authorisation flow requested.")
 /**
   * Type of authorisation flow requested.
  **/
  private AuthorisationTypeEnum authorisationType = null;

  @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
 /**
   * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
  **/
  private String completionDateTime = null;
 /**
   * Type of authorisation flow requested.
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

  public OBWriteDomesticConsent3DataAuthorisation authorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

 /**
   * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return completionDateTime
  **/
  @JsonProperty("CompletionDateTime")
  public String getCompletionDateTime() {
    return completionDateTime;
  }

  public void setCompletionDateTime(String completionDateTime) {
    this.completionDateTime = completionDateTime;
  }

  public OBWriteDomesticConsent3DataAuthorisation completionDateTime(String completionDateTime) {
    this.completionDateTime = completionDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsent3DataAuthorisation {\n");
    
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    completionDateTime: ").append(toIndentedString(completionDateTime)).append("\n");
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

