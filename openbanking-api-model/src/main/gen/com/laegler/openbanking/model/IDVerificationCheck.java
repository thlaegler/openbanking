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
 * Identity verification criteria that the account holder will need to meet to take out the PCA product
 */
@ApiModel(description = "Identity verification criteria that the account holder will need to meet to take out the PCA product")
@Validated
@javax.annotation.Generated(value = "class com.laegler.openbanking.codegen.language.OpenbankingModelCodegen", date = "2019-10-19T07:45:56.431+13:00")

public class IDVerificationCheck   {
  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("URL")
  private String URL = null;

  public IDVerificationCheck notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public IDVerificationCheck addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the ID Verification details
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the ID Verification details")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public IDVerificationCheck URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL to identity verification document list which is required for obtaining the product.
   * @return URL
  **/
  @ApiModelProperty(value = "URL to identity verification document list which is required for obtaining the product.")

@Size(min=1,max=500) 
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDVerificationCheck idVerificationCheck = (IDVerificationCheck) o;
    return Objects.equals(this.notes, idVerificationCheck.notes) &&
        Objects.equals(this.URL, idVerificationCheck.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDVerificationCheck {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

