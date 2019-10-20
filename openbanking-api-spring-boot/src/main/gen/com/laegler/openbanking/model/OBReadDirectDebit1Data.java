package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.laegler.openbanking.model.OBReadDirectDebit1DataDirectDebit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadDirectDebit1Data
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class OBReadDirectDebit1Data   {
  @JsonProperty("DirectDebit")
  @Valid
  private List<OBReadDirectDebit1DataDirectDebit> directDebit = null;

  public OBReadDirectDebit1Data directDebit(List<OBReadDirectDebit1DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit1Data addDirectDebitItem(OBReadDirectDebit1DataDirectDebit directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OBReadDirectDebit1DataDirectDebit> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBReadDirectDebit1DataDirectDebit> directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit1Data obReadDirectDebit1Data = (OBReadDirectDebit1Data) o;
    return Objects.equals(this.directDebit, obReadDirectDebit1Data.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1Data {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

