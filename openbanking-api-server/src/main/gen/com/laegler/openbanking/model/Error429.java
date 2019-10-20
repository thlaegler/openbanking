package com.laegler.openbanking.model;

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

public class Error429  {
  

@XmlType(name="DescriptionEnum")
@XmlEnum(String.class)
public enum DescriptionEnum {

@XmlEnumValue("You have requested this resource too often. Slow down.") YOU_HAVE_REQUESTED_THIS_RESOURCE_TOO_OFTEN_SLOW_DOWN_(String.valueOf("You have requested this resource too often. Slow down."));


    private String value;

    DescriptionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DescriptionEnum fromValue(String v) {
        for (DescriptionEnum b : DescriptionEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private DescriptionEnum description = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("429") _429(String.valueOf("429"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private StatusEnum status = null;


@XmlType(name="TitleEnum")
@XmlEnum(String.class)
public enum TitleEnum {

@XmlEnumValue("Too many requests") TOO_MANY_REQUESTS(String.valueOf("Too many requests"));


    private String value;

    TitleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TitleEnum fromValue(String v) {
        for (TitleEnum b : TitleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "")
  private TitleEnum title = null;
 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    if (description == null) {
      return null;
    }
    return description.value();
  }

  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }

  public Error429 description(DescriptionEnum description) {
    this.description = description;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Error429 status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    if (title == null) {
      return null;
    }
    return title.value();
  }

  public void setTitle(TitleEnum title) {
    this.title = title;
  }

  public Error429 title(TitleEnum title) {
    this.title = title;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error429 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

