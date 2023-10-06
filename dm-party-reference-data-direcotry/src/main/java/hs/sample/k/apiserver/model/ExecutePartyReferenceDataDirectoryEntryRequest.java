package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Input: ExCR Execute an automated action against an entry
 */
@Schema(description = "Input: ExCR Execute an automated action against an entry")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class ExecutePartyReferenceDataDirectoryEntryRequest   {
  @JsonProperty("Reference")
  private ExecutePartyReferenceDataDirectoryEntryRequestReference reference = null;

  @JsonProperty("Associations")
  private ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations = null;

  @JsonProperty("Demographics")
  private ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics = null;

  @JsonProperty("BankRelations")
  private ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations = null;

  public ExecutePartyReferenceDataDirectoryEntryRequest reference(ExecutePartyReferenceDataDirectoryEntryRequestReference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   **/
  @Schema(description = "")
  
    @Valid
    public ExecutePartyReferenceDataDirectoryEntryRequestReference getReference() {
    return reference;
  }

  public void setReference(ExecutePartyReferenceDataDirectoryEntryRequestReference reference) {
    this.reference = reference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequest associations(ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
   **/
  @Schema(description = "")
  
    @Valid
    public ExecutePartyReferenceDataDirectoryEntryRequestAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(ExecutePartyReferenceDataDirectoryEntryRequestAssociations associations) {
    this.associations = associations;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequest demographics(ExecutePartyReferenceDataDirectoryEntryRequestDemographics demographics) {
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

  public ExecutePartyReferenceDataDirectoryEntryRequest bankRelations(ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelations) {
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
    ExecutePartyReferenceDataDirectoryEntryRequest executePartyReferenceDataDirectoryEntryRequest = (ExecutePartyReferenceDataDirectoryEntryRequest) o;
    return Objects.equals(this.reference, executePartyReferenceDataDirectoryEntryRequest.reference) &&
        Objects.equals(this.associations, executePartyReferenceDataDirectoryEntryRequest.associations) &&
        Objects.equals(this.demographics, executePartyReferenceDataDirectoryEntryRequest.demographics) &&
        Objects.equals(this.bankRelations, executePartyReferenceDataDirectoryEntryRequest.bankRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, associations, demographics, bankRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequest {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
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
