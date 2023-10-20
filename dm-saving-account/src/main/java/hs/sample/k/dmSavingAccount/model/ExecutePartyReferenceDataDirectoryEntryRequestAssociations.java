package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;
/**
 * ExecutePartyReferenceDataDirectoryEntryRequestAssociations
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class ExecutePartyReferenceDataDirectoryEntryRequestAssociations   {
  @JsonProperty("EmployeeReference")
  private String employeeReference = null;

  @JsonProperty("AssociateReference")
  private String associateReference = null;

  @JsonProperty("AssociateType")
  private String associateType = null;

  @JsonProperty("AssociateObligationDependencyDescription")
  private String associateObligationDependencyDescription = null;

  @JsonProperty("AssociationValidFromToDate")
  private LocalDate associationValidFromToDate = null;

  @JsonProperty("ProductInstanceReference")
  private String productInstanceReference = null;

  @JsonProperty("PreferredBeneficiary")
  private String preferredBeneficiary = null;

  @JsonProperty("ProxyRepresentativePowerofAttorneyReference")
  private String proxyRepresentativePowerofAttorneyReference = null;

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations employeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
    return this;
  }

  /**
   *  
   * @return employeeReference
   **/
  @Schema(description = " ")
  
    public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateReference(String associateReference) {
    this.associateReference = associateReference;
    return this;
  }

  /**
   *  
   * @return associateReference
   **/
  @Schema(description = " ")
  
    public String getAssociateReference() {
    return associateReference;
  }

  public void setAssociateReference(String associateReference) {
    this.associateReference = associateReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateType(String associateType) {
    this.associateType = associateType;
    return this;
  }

  /**
   *  
   * @return associateType
   **/
  @Schema(description = " ")
  
    public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
    return this;
  }

  /**
   *  
   * @return associateObligationDependencyDescription
   **/
  @Schema(description = " ")
  
    public String getAssociateObligationDependencyDescription() {
    return associateObligationDependencyDescription;
  }

  public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations associationValidFromToDate(LocalDate associationValidFromToDate) {
    this.associationValidFromToDate = associationValidFromToDate;
    return this;
  }

  /**
   * Get associationValidFromToDate
   * @return associationValidFromToDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getAssociationValidFromToDate() {
    return associationValidFromToDate;
  }

  public void setAssociationValidFromToDate(LocalDate associationValidFromToDate) {
    this.associationValidFromToDate = associationValidFromToDate;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   *  
   * @return productInstanceReference
   **/
  @Schema(description = " ")
  
    public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations preferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
    return this;
  }

  /**
   *  
   * @return preferredBeneficiary
   **/
  @Schema(description = " ")
  
    public String getPreferredBeneficiary() {
    return preferredBeneficiary;
  }

  public void setPreferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestAssociations proxyRepresentativePowerofAttorneyReference(String proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
    return this;
  }

  /**
   *  
   * @return proxyRepresentativePowerofAttorneyReference
   **/
  @Schema(description = " ")
  
    public String getProxyRepresentativePowerofAttorneyReference() {
    return proxyRepresentativePowerofAttorneyReference;
  }

  public void setProxyRepresentativePowerofAttorneyReference(String proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePartyReferenceDataDirectoryEntryRequestAssociations executePartyReferenceDataDirectoryEntryRequestAssociations = (ExecutePartyReferenceDataDirectoryEntryRequestAssociations) o;
    return Objects.equals(this.employeeReference, executePartyReferenceDataDirectoryEntryRequestAssociations.employeeReference) &&
        Objects.equals(this.associateReference, executePartyReferenceDataDirectoryEntryRequestAssociations.associateReference) &&
        Objects.equals(this.associateType, executePartyReferenceDataDirectoryEntryRequestAssociations.associateType) &&
        Objects.equals(this.associateObligationDependencyDescription, executePartyReferenceDataDirectoryEntryRequestAssociations.associateObligationDependencyDescription) &&
        Objects.equals(this.associationValidFromToDate, executePartyReferenceDataDirectoryEntryRequestAssociations.associationValidFromToDate) &&
        Objects.equals(this.productInstanceReference, executePartyReferenceDataDirectoryEntryRequestAssociations.productInstanceReference) &&
        Objects.equals(this.preferredBeneficiary, executePartyReferenceDataDirectoryEntryRequestAssociations.preferredBeneficiary) &&
        Objects.equals(this.proxyRepresentativePowerofAttorneyReference, executePartyReferenceDataDirectoryEntryRequestAssociations.proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeReference, associateReference, associateType, associateObligationDependencyDescription, associationValidFromToDate, productInstanceReference, preferredBeneficiary, proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestAssociations {\n");
    
    sb.append("    employeeReference: ").append(toIndentedString(employeeReference)).append("\n");
    sb.append("    associateReference: ").append(toIndentedString(associateReference)).append("\n");
    sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
    sb.append("    associateObligationDependencyDescription: ").append(toIndentedString(associateObligationDependencyDescription)).append("\n");
    sb.append("    associationValidFromToDate: ").append(toIndentedString(associationValidFromToDate)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    preferredBeneficiary: ").append(toIndentedString(preferredBeneficiary)).append("\n");
    sb.append("    proxyRepresentativePowerofAttorneyReference: ").append(toIndentedString(proxyRepresentativePowerofAttorneyReference)).append("\n");
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
