package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBWriteDomestic2DataInitiation;
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

public class OBWriteDomestic2Data  {
  
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
  **/
  private String consentId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBWriteDomestic2DataInitiation initiation = null;
 /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
   * @return consentId
  **/
  @JsonProperty("ConsentId")
  @NotNull
 @Size(min=1,max=128)  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBWriteDomestic2Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

 /**
   * Get initiation
   * @return initiation
  **/
  @JsonProperty("Initiation")
  @NotNull
  public OBWriteDomestic2DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteDomestic2Data initiation(OBWriteDomestic2DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomestic2Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

