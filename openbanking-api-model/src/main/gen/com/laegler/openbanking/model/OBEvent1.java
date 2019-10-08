package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBEventResourceUpdate1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Events.
 */
@ApiModel(description = "Events.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBEvent1   {
  @JsonProperty("urn:uk:org:openbanking:events:resource-update")
  private OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate = null;

  public OBEvent1 urnukorgopenbankingeventsresourceUpdate(OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate) {
    this.urnukorgopenbankingeventsresourceUpdate = urnukorgopenbankingeventsresourceUpdate;
    return this;
  }

  /**
   * Get urnukorgopenbankingeventsresourceUpdate
   * @return urnukorgopenbankingeventsresourceUpdate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBEventResourceUpdate1 getUrnukorgopenbankingeventsresourceUpdate() {
    return urnukorgopenbankingeventsresourceUpdate;
  }

  public void setUrnukorgopenbankingeventsresourceUpdate(OBEventResourceUpdate1 urnukorgopenbankingeventsresourceUpdate) {
    this.urnukorgopenbankingeventsresourceUpdate = urnukorgopenbankingeventsresourceUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEvent1 obEvent1 = (OBEvent1) o;
    return Objects.equals(this.urnukorgopenbankingeventsresourceUpdate, obEvent1.urnukorgopenbankingeventsresourceUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urnukorgopenbankingeventsresourceUpdate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

