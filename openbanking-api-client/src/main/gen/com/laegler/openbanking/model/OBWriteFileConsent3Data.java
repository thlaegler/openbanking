package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomesticConsent3DataAuthorisation;
import com.laegler.openbanking.model.OBWriteDomesticConsent3DataSCASupportData;
import com.laegler.openbanking.model.OBWriteFile2DataInitiation;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OBWriteFileConsent3Data  {
  
  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataAuthorisation authorisation = null;

  @ApiModelProperty(required = true, value = "")
  private OBWriteFile2DataInitiation initiation = null;

  @ApiModelProperty(value = "")
  private OBWriteDomesticConsent3DataSCASupportData scASupportData = null;
 /**
   * Get authorisation
   * @return authorisation
  **/
  @JsonProperty("Authorisation")
  public OBWriteDomesticConsent3DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteFileConsent3Data authorisation(OBWriteDomesticConsent3DataAuthorisation authorisation) {
    this.authorisation = authorisation;
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

  public OBWriteFileConsent3Data initiation(OBWriteFile2DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

 /**
   * Get scASupportData
   * @return scASupportData
  **/
  @JsonProperty("SCASupportData")
  public OBWriteDomesticConsent3DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }

  public OBWriteFileConsent3Data scASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFileConsent3Data {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

