package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBWriteDomestic2DataInitiation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataSCASupportData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteDomesticConsent3Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBWriteDomesticConsent3Data   {
  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

  @JsonProperty("Initiation")
  private OBWriteDomestic2DataInitiation initiation = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;

  public OBWriteDomesticConsent3Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteDomesticConsent3Data initiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBWriteDomestic2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomesticConsent3Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }

  /**
   * Get scASupportData
   * @return scASupportData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsent3Data obWriteDomesticConsent3Data = (OBWriteDomesticConsent3Data) o;
    return Objects.equals(this.authorisation, obWriteDomesticConsent3Data.authorisation) &&
        Objects.equals(this.initiation, obWriteDomesticConsent3Data.initiation) &&
        Objects.equals(this.scASupportData, obWriteDomesticConsent3Data.scASupportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisation, initiation, scASupportData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsent3Data {\n");
    
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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

