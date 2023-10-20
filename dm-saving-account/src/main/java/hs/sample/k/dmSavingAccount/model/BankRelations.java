package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * \&quot;An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\&quot; Prospect Management
 */
@Schema(description = "\"An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\" Prospect Management")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class BankRelations   {
  @JsonProperty("BankRelationType")
  private String bankRelationType = null;

  @JsonProperty("BusinessUnitEmployeeReference")
  private String businessUnitEmployeeReference = null;

  public BankRelations bankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
    return this;
  }

  /**
   * The type of relationship (e.g. relationship manager)
   * @return bankRelationType
   **/
  @Schema(description = "The type of relationship (e.g. relationship manager)")
  
    public String getBankRelationType() {
    return bankRelationType;
  }

  public void setBankRelationType(String bankRelationType) {
    this.bankRelationType = bankRelationType;
  }

  public BankRelations businessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    return this;
  }

  /**
   * Reference to the associated employee or unit
   * @return businessUnitEmployeeReference
   **/
  @Schema(description = "Reference to the associated employee or unit")
  
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
    BankRelations bankRelations = (BankRelations) o;
    return Objects.equals(this.bankRelationType, bankRelations.bankRelationType) &&
        Objects.equals(this.businessUnitEmployeeReference, bankRelations.businessUnitEmployeeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankRelationType, businessUnitEmployeeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRelations {\n");
    
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
