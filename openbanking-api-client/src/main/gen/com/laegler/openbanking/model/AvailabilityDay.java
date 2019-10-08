package com.laegler.openbanking.model;

import com.laegler.openbanking.model.AvailabilityOpeningHours;
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
  * Working day information
 **/
@ApiModel(description="Working day information")
public class AvailabilityDay  {
  

@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

@XmlEnumValue("Friday") FRIDAY(String.valueOf("Friday")), @XmlEnumValue("Monday") MONDAY(String.valueOf("Monday")), @XmlEnumValue("Saturday") SATURDAY(String.valueOf("Saturday")), @XmlEnumValue("Sunday") SUNDAY(String.valueOf("Sunday")), @XmlEnumValue("Thursday") THURSDAY(String.valueOf("Thursday")), @XmlEnumValue("Tuesday") TUESDAY(String.valueOf("Tuesday")), @XmlEnumValue("Wednesday") WEDNESDAY(String.valueOf("Wednesday"));


    private String value;

    NameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NameEnum fromValue(String v) {
        for (NameEnum b : NameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "Specifies the day of the week")
 /**
   * Specifies the day of the week
  **/
  private NameEnum name = null;

  @ApiModelProperty(value = "Specify any note that is related the particular opening day e.g. Closed half day on Monday")
 /**
   * Specify any note that is related the particular opening day e.g. Closed half day on Monday
  **/
  private String notes = null;

  @ApiModelProperty(required = true, value = "Opening & Closing Times of a branch of an organisation")
 /**
   * Opening & Closing Times of a branch of an organisation
  **/
  private List<AvailabilityOpeningHours> openingHours = new ArrayList<AvailabilityOpeningHours>();
 /**
   * Specifies the day of the week
   * @return name
  **/
  @JsonProperty("Name")
  public String getName() {
    if (name == null) {
      return null;
    }
    return name.value();
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public AvailabilityDay name(NameEnum name) {
    this.name = name;
    return this;
  }

 /**
   * Specify any note that is related the particular opening day e.g. Closed half day on Monday
   * @return notes
  **/
  @JsonProperty("Notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AvailabilityDay notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Opening &amp; Closing Times of a branch of an organisation
   * @return openingHours
  **/
  @JsonProperty("OpeningHours")
  public List<AvailabilityOpeningHours> getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(List<AvailabilityOpeningHours> openingHours) {
    this.openingHours = openingHours;
  }

  public AvailabilityDay openingHours(List<AvailabilityOpeningHours> openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  public AvailabilityDay addOpeningHoursItem(AvailabilityOpeningHours openingHoursItem) {
    this.openingHours.add(openingHoursItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityDay {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
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

