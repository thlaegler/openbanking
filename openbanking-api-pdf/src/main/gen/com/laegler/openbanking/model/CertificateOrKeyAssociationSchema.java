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
 * CertificateOrKeyAssociationSchema
 */
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:29.752+13:00")

public class CertificateOrKeyAssociationSchema   {
  @JsonProperty("associate")
  private Boolean associate = null;

  public CertificateOrKeyAssociationSchema associate(Boolean associate) {
    this.associate = associate;
    return this;
  }

  /**
   * Get associate
   * @return associate
  **/
  @ApiModelProperty(value = "")


  public Boolean isAssociate() {
    return associate;
  }

  public void setAssociate(Boolean associate) {
    this.associate = associate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateOrKeyAssociationSchema certificateOrKeyAssociationSchema = (CertificateOrKeyAssociationSchema) o;
    return Objects.equals(this.associate, certificateOrKeyAssociationSchema.associate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateOrKeyAssociationSchema {\n");
    
    sb.append("    associate: ").append(toIndentedString(associate)).append("\n");
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

