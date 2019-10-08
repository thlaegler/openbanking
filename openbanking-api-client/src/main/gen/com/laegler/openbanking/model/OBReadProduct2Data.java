package com.laegler.openbanking.model;

import com.laegler.openbanking.model.OBReadProduct2DataProduct;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Aligning with the read write specs structure.
 **/
@ApiModel(description="Aligning with the read write specs structure.")
public class OBReadProduct2Data  {
  
  @ApiModelProperty(value = "")
  private List<OBReadProduct2DataProduct> product = null;
 /**
   * Get product
   * @return product
  **/
  @JsonProperty("Product")
  public List<OBReadProduct2DataProduct> getProduct() {
    return product;
  }

  public void setProduct(List<OBReadProduct2DataProduct> product) {
    this.product = product;
  }

  public OBReadProduct2Data product(List<OBReadProduct2DataProduct> product) {
    this.product = product;
    return this;
  }

  public OBReadProduct2Data addProductItem(OBReadProduct2DataProduct productItem) {
    this.product.add(productItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2Data {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

