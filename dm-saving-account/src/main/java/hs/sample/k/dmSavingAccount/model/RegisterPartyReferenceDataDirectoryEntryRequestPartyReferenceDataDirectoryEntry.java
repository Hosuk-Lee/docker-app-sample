package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry   {
  @JsonProperty("DirectoryEntryDateType")
  private Directoryentrydatetypevalues directoryEntryDateType = null;

  public RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry directoryEntryDateType(Directoryentrydatetypevalues directoryEntryDateType) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry = (RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry) o;
    return Objects.equals(this.directoryEntryDateType, registerPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry.directoryEntryDateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryEntryDateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry {\n");
    
    sb.append("    directoryEntryDateType: ").append(toIndentedString(directoryEntryDateType)).append("\n");
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
