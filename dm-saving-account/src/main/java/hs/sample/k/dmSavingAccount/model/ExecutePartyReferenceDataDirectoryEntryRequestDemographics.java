package hs.sample.k.dmSavingAccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestDemographics
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class ExecutePartyReferenceDataDirectoryEntryRequestDemographics   {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics socioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
    return this;
  }

  /**
   *  
   * @return socioEconomicClassification
   **/
  @Schema(description = " ")
  
    public String getSocioEconomicClassification() {
    return socioEconomicClassification;
  }

  public void setSocioEconomicClassification(String socioEconomicClassification) {
    this.socioEconomicClassification = socioEconomicClassification;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics ethnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
    return this;
  }

  /**
   *  
   * @return ethnicityReligion
   **/
  @Schema(description = " ")
  
    public String getEthnicityReligion() {
    return ethnicityReligion;
  }

  public void setEthnicityReligion(String ethnicityReligion) {
    this.ethnicityReligion = ethnicityReligion;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics employment(String employment) {
    this.employment = employment;
    return this;
  }

  /**
   *  
   * @return employment
   **/
  @Schema(description = " ")
  
    public String getEmployment() {
    return employment;
  }

  public void setEmployment(String employment) {
    this.employment = employment;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics employmentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
    return this;
  }

  /**
   *  
   * @return employmentHistory
   **/
  @Schema(description = " ")
  
    public String getEmploymentHistory() {
    return employmentHistory;
  }

  public void setEmploymentHistory(String employmentHistory) {
    this.employmentHistory = employmentHistory;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics educationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
    return this;
  }

  /**
   *  
   * @return educationHistory
   **/
  @Schema(description = " ")
  
    public String getEducationHistory() {
    return educationHistory;
  }

  public void setEducationHistory(String educationHistory) {
    this.educationHistory = educationHistory;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestDemographics servicingConstraints(String servicingConstraints) {
    this.servicingConstraints = servicingConstraints;
    return this;
  }

  /**
   *  
   * @return servicingConstraints
   **/
  @Schema(description = " ")
  
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
    ExecutePartyReferenceDataDirectoryEntryRequestDemographics executePartyReferenceDataDirectoryEntryRequestDemographics = (ExecutePartyReferenceDataDirectoryEntryRequestDemographics) o;
    return Objects.equals(this.socioEconomicClassification, executePartyReferenceDataDirectoryEntryRequestDemographics.socioEconomicClassification) &&
        Objects.equals(this.ethnicityReligion, executePartyReferenceDataDirectoryEntryRequestDemographics.ethnicityReligion) &&
        Objects.equals(this.employment, executePartyReferenceDataDirectoryEntryRequestDemographics.employment) &&
        Objects.equals(this.employmentHistory, executePartyReferenceDataDirectoryEntryRequestDemographics.employmentHistory) &&
        Objects.equals(this.educationHistory, executePartyReferenceDataDirectoryEntryRequestDemographics.educationHistory) &&
        Objects.equals(this.servicingConstraints, executePartyReferenceDataDirectoryEntryRequestDemographics.servicingConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socioEconomicClassification, ethnicityReligion, employment, employmentHistory, educationHistory, servicingConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestDemographics {\n");
    
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
