package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Capture and maintain reference information about some type of entitity within Party Reference Data Directory.
 */
@Schema(description = "Capture and maintain reference information about some type of entitity within Party Reference Data Directory.")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class PartyReferenceDataDirectoryEntry   {
  @JsonProperty("PartyReference")
  private Party partyReference = null;

  @JsonProperty("DirectoryEntryDateType")
  private Directoryentrydatetypevalues directoryEntryDateType = null;

  @JsonProperty("DirectoryEntryDate")
  private Datetime directoryEntryDate = null;

  public PartyReferenceDataDirectoryEntry partyReference(Party partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Get partyReference
   * @return partyReference
   **/
  @Schema(description = "")
  
    @Valid
    public Party getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(Party partyReference) {
    this.partyReference = partyReference;
  }

  public PartyReferenceDataDirectoryEntry directoryEntryDateType(Directoryentrydatetypevalues directoryEntryDateType) {
    this.directoryEntryDateType = directoryEntryDateType;
    return this;
  }

  /**
   * Get directoryEntryDateType
   * @return directoryEntryDateType
   **/
  @Schema(description = "")
  
    @Valid
    public Directoryentrydatetypevalues getDirectoryEntryDateType() {
    return directoryEntryDateType;
  }

  public void setDirectoryEntryDateType(Directoryentrydatetypevalues directoryEntryDateType) {
    this.directoryEntryDateType = directoryEntryDateType;
  }

  public PartyReferenceDataDirectoryEntry directoryEntryDate(Datetime directoryEntryDate) {
    this.directoryEntryDate = directoryEntryDate;
    return this;
  }

  /**
   * Get directoryEntryDate
   * @return directoryEntryDate
   **/
  @Schema(description = "")
  
    @Valid
    public Datetime getDirectoryEntryDate() {
    return directoryEntryDate;
  }

  public void setDirectoryEntryDate(Datetime directoryEntryDate) {
    this.directoryEntryDate = directoryEntryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry = (PartyReferenceDataDirectoryEntry) o;
    return Objects.equals(this.partyReference, partyReferenceDataDirectoryEntry.partyReference) &&
        Objects.equals(this.directoryEntryDateType, partyReferenceDataDirectoryEntry.directoryEntryDateType) &&
        Objects.equals(this.directoryEntryDate, partyReferenceDataDirectoryEntry.directoryEntryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference, directoryEntryDateType, directoryEntryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyReferenceDataDirectoryEntry {\n");
    
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
    sb.append("    directoryEntryDateType: ").append(toIndentedString(directoryEntryDateType)).append("\n");
    sb.append("    directoryEntryDate: ").append(toIndentedString(directoryEntryDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
