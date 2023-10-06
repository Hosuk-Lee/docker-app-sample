package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Input: UpBQ Update details about a customer&#x27;s demographic entry
 */
@Schema(description = "Input: UpBQ Update details about a customer's demographic entry")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class UpdateDemographicsRequest   {
  @JsonProperty("PartyReferenceDataDirectoryEntry")
  private UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry = null;

  @JsonProperty("Demographics")
  private ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics = null;

  public UpdateDemographicsRequest partyReferenceDataDirectoryEntry(UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
    return this;
  }

  /**
   * Get partyReferenceDataDirectoryEntry
   * @return partyReferenceDataDirectoryEntry
   **/
  @Schema(description = "")
  
    @Valid
    public UpdateReferenceRequestPartyReferenceDataDirectoryEntry getPartyReferenceDataDirectoryEntry() {
    return partyReferenceDataDirectoryEntry;
  }

  public void setPartyReferenceDataDirectoryEntry(UpdateReferenceRequestPartyReferenceDataDirectoryEntry partyReferenceDataDirectoryEntry) {
    this.partyReferenceDataDirectoryEntry = partyReferenceDataDirectoryEntry;
  }

  public UpdateDemographicsRequest demographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   **/
  @Schema(description = "")
  
    @Valid
    public ExecutePartyReferenceDataDirectoryEntryRequestDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
    this.demographics = demographics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDemographicsRequest updateDemographicsRequest = (UpdateDemographicsRequest) o;
    return Objects.equals(this.partyReferenceDataDirectoryEntry, updateDemographicsRequest.partyReferenceDataDirectoryEntry) &&
        Objects.equals(this.demographics, updateDemographicsRequest.demographics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReferenceDataDirectoryEntry, demographics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDemographicsRequest {\n");
    
    sb.append("    partyReferenceDataDirectoryEntry: ").append(toIndentedString(partyReferenceDataDirectoryEntry)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
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
