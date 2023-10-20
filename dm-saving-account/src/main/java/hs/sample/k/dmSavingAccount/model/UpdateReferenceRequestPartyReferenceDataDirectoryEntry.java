package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * UpdateReferenceRequestPartyReferenceDataDirectoryEntry
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class UpdateReferenceRequestPartyReferenceDataDirectoryEntry   {
  @JsonProperty("DirectoryEntryDate")
  private Datetime directoryEntryDate = null;

  public UpdateReferenceRequestPartyReferenceDataDirectoryEntry directoryEntryDate(Datetime directoryEntryDate) {
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
    UpdateReferenceRequestPartyReferenceDataDirectoryEntry updateReferenceRequestPartyReferenceDataDirectoryEntry = (UpdateReferenceRequestPartyReferenceDataDirectoryEntry) o;
    return Objects.equals(this.directoryEntryDate, updateReferenceRequestPartyReferenceDataDirectoryEntry.directoryEntryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryEntryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReferenceRequestPartyReferenceDataDirectoryEntry {\n");
    
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
