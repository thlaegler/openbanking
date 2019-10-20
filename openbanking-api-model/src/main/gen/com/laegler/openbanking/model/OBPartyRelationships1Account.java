package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Relationship to the Account resource.
 */
@ApiModel(description = "Relationship to the Account resource.")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class OBPartyRelationships1Account   {
  @JsonProperty("Id")
  private String id = null;

  @JsonProperty("Related")
  private String related = null;

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OBPartyRelationships1Account related(String related) {
    this.related = related;
    return this;
  }

  /**
   * Absolute URI to the related resource.
   * @return related
  **/
  @ApiModelProperty(required = true, value = "Absolute URI to the related resource.")
  @NotNull


  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1Account obPartyRelationships1Account = (OBPartyRelationships1Account) o;
    return Objects.equals(this.id, obPartyRelationships1Account.id) &&
        Objects.equals(this.related, obPartyRelationships1Account.related);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, related);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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
