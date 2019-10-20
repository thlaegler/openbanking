package com.laegler.openbanking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Repayment allocation details
 */
@ApiModel(description = "Repayment allocation details")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.module.OpenbankingSpringCodegen", date = "2019-10-19T13:25:17.080+13:00")

public class RepaymentAllocation   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = new ArrayList<>();

  public RepaymentAllocation notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public RepaymentAllocation addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Additional notes to supplement the Repayment Allocation details.
   * @return notes
  **/
  @ApiModelProperty(required = true, value = "Additional notes to supplement the Repayment Allocation details.")
  @NotNull

@Size(min=1) 
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentAllocation repaymentAllocation = (RepaymentAllocation) o;
    return Objects.equals(this.notes, repaymentAllocation.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentAllocation {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

