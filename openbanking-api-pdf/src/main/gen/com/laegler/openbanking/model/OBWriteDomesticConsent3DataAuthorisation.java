package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The authorisation type request from the TPP.
 */
@ApiModel(description = "The authorisation type request from the TPP.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class OBWriteDomesticConsent3DataAuthorisation   {
  /**
   * Type of authorisation flow requested.
   */
  public enum AuthorisationTypeEnum {
    ANY("Any"),
    
    SINGLE("Single");

    private String value;

    AuthorisationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthorisationTypeEnum fromValue(String text) {
      for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AuthorisationType")
  private AuthorisationTypeEnum authorisationType = null;

  @JsonProperty("CompletionDateTime")
  private String completionDateTime = null;

  public OBWriteDomesticConsent3DataAuthorisation authorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

  /**
   * Type of authorisation flow requested.
   * @return authorisationType
  **/
  @ApiModelProperty(required = true, value = "Type of authorisation flow requested.")
  @NotNull


  public AuthorisationTypeEnum getAuthorisationType() {
    return authorisationType;
  }

  public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
  }

  public OBWriteDomesticConsent3DataAuthorisation completionDateTime(String completionDateTime) {
    this.completionDateTime = completionDateTime;
    return this;
  }

  /**
   * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return completionDateTime
  **/
  @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")


  public String getCompletionDateTime() {
    return completionDateTime;
  }

  public void setCompletionDateTime(String completionDateTime) {
    this.completionDateTime = completionDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsent3DataAuthorisation obWriteDomesticConsent3DataAuthorisation = (OBWriteDomesticConsent3DataAuthorisation) o;
    return Objects.equals(this.authorisationType, obWriteDomesticConsent3DataAuthorisation.authorisationType) &&
        Objects.equals(this.completionDateTime, obWriteDomesticConsent3DataAuthorisation.completionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationType, completionDateTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

