package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Output: ReBQ Retrieve details about customer bank relations entries in the directory
 */
@Schema(description = "Output: ReBQ Retrieve details about customer bank relations entries in the directory")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class RetrieveBankRelationsResponse   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry = null;

  @JsonProperty("BankRelations")
  private ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations = null;

  public RetrieveBankRelationsResponse partyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    return this;
  }

  /**
   * Get partyReferenceDataDirectoryEntry
   * @return partyReferenceDataDirectoryEntry
   **/
  @Schema(description = "")
  
    @Valid
    public RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
    return partyReferenceDataDirectoryEntry;
  }

  public void setPartyReferenceDataDirectoryEntry(RegisterPartyReferenceDataDirectoryEntryRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
  }

  public RetrieveBankRelationsResponse bankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
    this.bankRelations = bankRelations;
    return this;
  }

  /**
   * Get bankRelations
   * @return bankRelations
   **/
  @Schema(description = "")
  
    @Valid
    public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations getBankRelations() {
    return bankRelations;
  }

  public void setBankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
    this.bankRelations = bankRelations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveBankRelationsResponse retrieveBankRelationsResponse = (RetrieveBankRelationsResponse) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, retrieveBankRelationsResponse.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.bankRelations, retrieveBankRelationsResponse.bankRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, bankRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveBankRelationsResponse {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("    bankRelations: ").append(toIndentedString(bankRelations)).append("\n");
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
