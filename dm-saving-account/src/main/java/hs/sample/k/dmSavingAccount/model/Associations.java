package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

/**
 * \&quot;An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\&quot; Prospect Management
 */
@Schema(description = "\"An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\" Prospect Management")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Associations   {
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

  public Associations employeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
    return this;
  }

  /**
   * Reference to a contact at the customer's employer
   * @return employeeReference
   **/
  @Schema(description = "Reference to a contact at the customer's employer")
  
    public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }

  public Associations associateReference(String associateReference) {
    this.associateReference = associateReference;
    return this;
  }

  /**
   * Associated individuals of interest
   * @return associateReference
   **/
  @Schema(description = "Associated individuals of interest")
  
    public String getAssociateReference() {
    return associateReference;
  }

  public void setAssociateReference(String associateReference) {
    this.associateReference = associateReference;
  }

  public Associations associateType(String associateType) {
    this.associateType = associateType;
    return this;
  }

  /**
   * The type of association with the customer (e.g. familial or corporate, includes household associations, for corporations allowed users/buyers)
   * @return associateType
   **/
  @Schema(description = "The type of association with the customer (e.g. familial or corporate, includes household associations, for corporations allowed users/buyers)")
  
    public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  public Associations associateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
    return this;
  }

  /**
   * Description of the rights or obligations granted to the associate
   * @return associateObligationDependencyDescription
   **/
  @Schema(description = "Description of the rights or obligations granted to the associate")
  
    public String getAssociateObligationDependencyDescription() {
    return associateObligationDependencyDescription;
  }

  public void setAssociateObligationDependencyDescription(String associateObligationDependencyDescription) {
    this.associateObligationDependencyDescription = associateObligationDependencyDescription;
  }

  public Associations associationValidFromToDate(LocalDate associationValidFromToDate) {
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

  public Associations productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Reference to a product or service where the association is linked in some manner (e.g. guarantor)
   * @return productInstanceReference
   **/
  @Schema(description = "Reference to a product or service where the association is linked in some manner (e.g. guarantor)")
  
    public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public Associations preferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
    return this;
  }

  /**
   * A potentially complex and structured list of identified beneficiaries with associated contact and payment details as needed
   * @return preferredBeneficiary
   **/
  @Schema(description = "A potentially complex and structured list of identified beneficiaries with associated contact and payment details as needed")
  
    public String getPreferredBeneficiary() {
    return preferredBeneficiary;
  }

  public void setPreferredBeneficiary(String preferredBeneficiary) {
    this.preferredBeneficiary = preferredBeneficiary;
  }

  public Associations proxyRepresentativePowerofAttorneyReference(String proxyRepresentativePowerofAttorneyReference) {
    this.proxyRepresentativePowerofAttorneyReference = proxyRepresentativePowerofAttorneyReference;
    return this;
  }

  /**
   * Reference to individuals with specific representation rights (e.g. a lawyer with power of attorney)
   * @return proxyRepresentativePowerofAttorneyReference
   **/
  @Schema(description = "Reference to individuals with specific representation rights (e.g. a lawyer with power of attorney)")
  
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
    Associations associations = (Associations) o;
    return Objects.equals(this.employeeReference, associations.employeeReference) &&
        Objects.equals(this.associateReference, associations.associateReference) &&
        Objects.equals(this.associateType, associations.associateType) &&
        Objects.equals(this.associateObligationDependencyDescription, associations.associateObligationDependencyDescription) &&
        Objects.equals(this.associationValidFromToDate, associations.associationValidFromToDate) &&
        Objects.equals(this.productInstanceReference, associations.productInstanceReference) &&
        Objects.equals(this.preferredBeneficiary, associations.preferredBeneficiary) &&
        Objects.equals(this.proxyRepresentativePowerofAttorneyReference, associations.proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeReference, associateReference, associateType, associateObligationDependencyDescription, associationValidFromToDate, productInstanceReference, preferredBeneficiary, proxyRepresentativePowerofAttorneyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Associations {\n");
    
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
