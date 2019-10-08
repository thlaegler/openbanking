package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBEventResourceUpdate1;
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
  * Events.
 **/
@ApiModel(description="Events.")
public class OBEvent1  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate = null;
 /**
   * Get urnukorgopenbankingeventsresourceUpdate
   * @return urnukorgopenbankingeventsresourceUpdate
  **/
  @JsonProperty("urn:uk:org:openbanking:events:resource-update")
  @NotNull
  public OBEventResourceUpdate1 getUrnukorgopenbankingeventsresourceUpdate() {
    return urnukorgopenbankingeventsresourceUpdate;
  }

  public void setUrnukorgopenbankingeventsresourceUpdate(OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate) {
    this.urnukorgopenbankingeventsresourceUpdate = urnukorgopenbankingeventsresourceUpdate;
  }

  public OBEvent1 urnukorgopenbankingeventsresourceUpdate(OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate) {
    this.urnukorgopenbankingeventsresourceUpdate = urnukorgopenbankingeventsresourceUpdate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEvent1 {\n");
    
    sb.append("    urnukorgopenbankingeventsresourceUpdate: ").append(toIndentedString(urnukorgopenbankingeventsresourceUpdate)).append("\n");
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

