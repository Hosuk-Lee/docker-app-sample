package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestBankRelations
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class ExecutePartyReferenceDataDirectoryEntryRequestBankRelations   {
  @JsonProperty("BankRelationType")
  private String bankRelationType = null;

  @JsonProperty("BusinessUnitEmployeeReference")
  private String businessUnitEmployeeReference = null;

  public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations bankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
    return this;
  }

  /**
   *  
   * @return bankRelationType
   **/
  @Schema(description = " ")
  
    public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestBankRelations businessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    return this;
  }

  /**
   *  
   * @return businessUnitEmployeeReference
   **/
  @Schema(description = " ")
  
    public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePartyReferenceDataDirectoryEntryRequestBankRelations executePartyReferenceDataDirectoryEntryRequestBankRelations = (ExecutePartyReferenceDataDirectoryEntryRequestBankRelations) o;
    return Objects.equals(this.bankRelationType, executePartyReferenceDataDirectoryEntryRequestBankRelations.bankRelationType) &&
        Objects.equals(this.businessUnitEmployeeReference, executePartyReferenceDataDirectoryEntryRequestBankRelations.businessUnitEmployeeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRelationType, businessUnitEmployeeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestBankRelations {\n");
    
    sb.append("    bankRelationType: ").append(toIndentedString(bankRelationType)).append("\n");
    sb.append("    businessUnitEmployeeReference: ").append(toIndentedString(businessUnitEmployeeReference)).append("\n");
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
