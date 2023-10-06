package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * \&quot;An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\&quot; Prospect Management
 */
@Schema(description = "\"An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\" Prospect Management")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Demographics   {
  @JsonProperty("Socio-EconomicClassification")
  private String socioEconomicClassification = null;

  @JsonProperty("EthnicityReligion")
  private String ethnicityReligion = null;

  @JsonProperty("Employment")
  private String employment = null;

  @JsonProperty("EmploymentHistory")
  private String employmentHistory = null;

  @JsonProperty("EducationHistory")
  private String educationHistory = null;

  @JsonProperty("ServicingConstraints")
  private String servicingConstraints = null;

  public Demographics socioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
    return this;
  }

  /**
   * A bank defined classification of the socio-economic rating and prospect
   * @return socioEconomicClassification
   **/
  @Schema(description = "A bank defined classification of the socio-economic rating and prospect")
  
    public String getSocioEconomicClassification() {
    return socioEconomicClassification;
  }

  public void setSocioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
  }

  public Demographics ethnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
    return this;
  }

  /**
   * Where needed to ensure the bank's handling of the relationship follows legal and regulatory requirements
   * @return ethnicityReligion
   **/
  @Schema(description = "Where needed to ensure the bank's handling of the relationship follows legal and regulatory requirements")
  
    public String getEthnicityReligion() {
    return ethnicityReligion;
  }

  public void setEthnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
  }

  public Demographics employment(String employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Reference to the customer's employer (company name)
   * @return employment
   **/
  @Schema(description = "Reference to the customer's employer (company name)")
  
    public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }

  public Demographics employmentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
    return this;
  }

  /**
   * Details of the customer's employment history (e.g. employer, dates, job position, salary)
   * @return employmentHistory
   **/
  @Schema(description = "Details of the customer's employment history (e.g. employer, dates, job position, salary)")
  
    public String getEmploymentHistory() {
    return employmentHistory;
  }

  public void setEmploymentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
  }

  public Demographics educationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
    return this;
  }

  /**
   * Customer's education (e.g. academic institutions attended, duration, qualifications and certifications)
   * @return educationHistory
   **/
  @Schema(description = "Customer's education (e.g. academic institutions attended, duration, qualifications and certifications)")
  
    public String getEducationHistory() {
    return educationHistory;
  }

  public void setEducationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
  }

  public Demographics servicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
    return this;
  }

  /**
   * Description of any known constraints on servicing the customer (sight, hearing, religious considerations)
   * @return servicingConstraints
   **/
  @Schema(description = "Description of any known constraints on servicing the customer (sight, hearing, religious considerations)")
  
    public String getServicingConstraints() {
    return servicingConstraints;
  }

  public void setServicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demographics demographics = (Demographics) o;
    return Objects.equals(this.socioEconomicClassification, demographics.socioEconomicClassification) &&
        Objects.equals(this.ethnicityReligion, demographics.ethnicityReligion) &&
        Objects.equals(this.employment, demographics.employment) &&
        Objects.equals(this.employmentHistory, demographics.employmentHistory) &&
        Objects.equals(this.educationHistory, demographics.educationHistory) &&
        Objects.equals(this.servicingConstraints, demographics.servicingConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socioEconomicClassification, ethnicityReligion, employment, employmentHistory, educationHistory, servicingConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demographics {\n");
    
    sb.append("    socioEconomicClassification: ").append(toIndentedString(socioEconomicClassification)).append("\n");
    sb.append("    ethnicityReligion: ").append(toIndentedString(ethnicityReligion)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentHistory: ").append(toIndentedString(employmentHistory)).append("\n");
    sb.append("    educationHistory: ").append(toIndentedString(educationHistory)).append("\n");
    sb.append("    servicingConstraints: ").append(toIndentedString(servicingConstraints)).append("\n");
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
