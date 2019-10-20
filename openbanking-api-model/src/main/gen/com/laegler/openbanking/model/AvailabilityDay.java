package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.laegler.openbanking.model.AvailabilityOpeningHours;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Working day information
 */
@ApiModel(description = "Working day information")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class AvailabilityDay   {
  /**
   * Specifies the day of the week
   */
  public enum NameEnum {
    FRIDAY("Friday"),
    
    MONDAY("Monday"),
    
    SATURDAY("Saturday"),
    
    SUNDAY("Sunday"),
    
    THURSDAY("Thursday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Name")
  private NameEnum name = null;

  @JsonProperty("Notes")
  private String notes = null;

  @JsonProperty("OpeningHours")
  @Valid
  private List<AvailabilityOpeningHours> openingHours = new ArrayList<>();

  public AvailabilityDay name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies the day of the week
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies the day of the week")
  @NotNull


  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public AvailabilityDay notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Specify any note that is related the particular opening day e.g. Closed half day on Monday
   * @return notes
  **/
  @ApiModelProperty(value = "Specify any note that is related the particular opening day e.g. Closed half day on Monday")

@Size(min=1,max=2000) 
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AvailabilityDay openingHours(List<AvailabilityOpeningHours> openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  public AvailabilityDay addOpeningHoursItem(AvailabilityOpeningHours openingHoursItem) {
    this.openingHours.add(openingHoursItem);
    return this;
  }

  /**
   * Opening & Closing Times of a branch of an organisation
   * @return openingHours
  **/
  @ApiModelProperty(required = true, value = "Opening & Closing Times of a branch of an organisation")
  @NotNull

  @Valid
@Size(min=1) 
  public List<AvailabilityOpeningHours> getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(List<AvailabilityOpeningHours> openingHours) {
    this.openingHours = openingHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityDay availabilityDay = (AvailabilityDay) o;
    return Objects.equals(this.name, availabilityDay.name) &&
        Objects.equals(this.notes, availabilityDay.notes) &&
        Objects.equals(this.openingHours, availabilityDay.openingHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, notes, openingHours);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

