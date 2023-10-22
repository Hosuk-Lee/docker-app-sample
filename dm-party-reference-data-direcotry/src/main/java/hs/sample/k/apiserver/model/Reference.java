package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
//import org.threeten.bp.LocalDate;

/**
 * \&quot;An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\&quot; Prospect Management
 */
@Schema(description = "\"An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed.\" Prospect Management")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class Reference   {
  @JsonProperty("PartyLegalEntityReference")
  private String partyLegalEntityReference = null;

  @JsonProperty("PartyNameSalutation")
  private String partyNameSalutation = null;

  @JsonProperty("GovernmentIssuedIdentityReference")
  private String governmentIssuedIdentityReference = null;

  @JsonProperty("GovernmentIssuedDocumentDetails")
  private String governmentIssuedDocumentDetails = null;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private String documentDirectoryEntryInstanceReference = null;

  @JsonProperty("ResidencyStatus")
  private String residencyStatus = null;

  @JsonProperty("DateofBirth")
  private String dateofBirth = null;

  @JsonProperty("Nationality")
  private String nationality = null;

  @JsonProperty("ResidentialAddress")
  private String residentialAddress = null;

  @JsonProperty("eMailAddress")
  private String eMailAddress = null;

  @JsonProperty("CellPhoneNumber")
  private String cellPhoneNumber = null;

  @JsonProperty("SocialNetworkContacts")
  private String socialNetworkContacts = null;

  @JsonProperty("PoliticalExposureType")
  private String politicalExposureType = null;

  @JsonProperty("PoliticalExposureDescriptionRecord")
  private String politicalExposureDescriptionRecord = null;

  @JsonProperty("CorporateCustomerReference")
  private String corporateCustomerReference = null;

  @JsonProperty("CorporateCustomerLegalEntityReference")
  private String corporateCustomerLegalEntityReference = null;

  @JsonProperty("CorporateAddress")
  private String corporateAddress = null;

  @JsonProperty("CompanyOfficerReference")
  private String companyOfficerReference = null;

  @JsonProperty("CompanyOfficerRole")
  private String companyOfficerRole = null;

  @JsonProperty("CustomerSinceDate")
  private LocalDate customerSinceDate = null;

  public Reference partyLegalEntityReference(String partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
    return this;
  }

  /**
   * Reference to the legal entity - enables the assembly of the legal relationship structure
   * @return partyLegalEntityReference
   **/
  @Schema(description = "Reference to the legal entity - enables the assembly of the legal relationship structure")
  
    public String getPartyLegalEntityReference() {
    return partyLegalEntityReference;
  }

  public void setPartyLegalEntityReference(String partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
  }

  public Reference partyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
    return this;
  }

  /**
   * The preferred salutation to be used
   * @return partyNameSalutation
   **/
  @Schema(description = "The preferred salutation to be used")
  
    public String getPartyNameSalutation() {
    return partyNameSalutation;
  }

  public void setPartyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
  }

  public Reference governmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
    return this;
  }

  /**
   * Reference to government or agency issued identification (e.g. social security number)
   * @return governmentIssuedIdentityReference
   **/
  @Schema(description = "Reference to government or agency issued identification (e.g. social security number)")
  
    public String getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }

  public Reference governmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
    return this;
  }

  /**
   * Details about and extracted from government issued documents (e.g. driving license/passport details)
   * @return governmentIssuedDocumentDetails
   **/
  @Schema(description = "Details about and extracted from government issued documents (e.g. driving license/passport details)")
  
    public String getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }

  public Reference documentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * The document reference for associated documents
   * @return documentDirectoryEntryInstanceReference
   **/
  @Schema(description = "The document reference for associated documents")
  
    public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public Reference residencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
    return this;
  }

  /**
   * The residency status and history as appropriate
   * @return residencyStatus
   **/
  @Schema(description = "The residency status and history as appropriate")
  
    public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }

  public Reference dateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
    return this;
  }

  /**
   * Give DoB
   * @return dateofBirth
   **/
  @Schema(description = "Give DoB")
  
    public String getDateofBirth() {
    return dateofBirth;
  }

  public void setDateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
  }

  public Reference nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * The customer nationality and history as appropriate
   * @return nationality
   **/
  @Schema(description = "The customer nationality and history as appropriate")
  
    public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Reference residentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
    return this;
  }

  /**
   * Their given residential address
   * @return residentialAddress
   **/
  @Schema(description = "Their given residential address")
  
    public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }

  public Reference eMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
    return this;
  }

  /**
   * The given email address
   * @return eMailAddress
   **/
  @Schema(description = "The given email address")
  
    public String getEMailAddress() {
    return eMailAddress;
  }

  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  public Reference cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

  /**
   * Any given phone contact numbers
   * @return cellPhoneNumber
   **/
  @Schema(description = "Any given phone contact numbers")
  
    public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public Reference socialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
    return this;
  }

  /**
   * Any given social network identifiers
   * @return socialNetworkContacts
   **/
  @Schema(description = "Any given social network identifiers")
  
    public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }

  public Reference politicalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
    return this;
  }

  /**
   * A politically exposed person indicator (PEP) (e.g. senior public figure, political position/exposure)
   * @return politicalExposureType
   **/
  @Schema(description = "A politically exposed person indicator (PEP) (e.g. senior public figure, political position/exposure)")
  
    public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }

  public Reference politicalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
    return this;
  }

  /**
   * Detail of the customer's political exposure
   * @return politicalExposureDescriptionRecord
   **/
  @Schema(description = "Detail of the customer's political exposure")
  
    public String getPoliticalExposureDescriptionRecord() {
    return politicalExposureDescriptionRecord;
  }

  public void setPoliticalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
  }

  public Reference corporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
    return this;
  }

  /**
   * Reference to the corporate entity (Company for company customers)
   * @return corporateCustomerReference
   **/
  @Schema(description = "Reference to the corporate entity (Company for company customers)")
  
    public String getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }

  public Reference corporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
    return this;
  }

  /**
   * The legal entity reference (for company customers)
   * @return corporateCustomerLegalEntityReference
   **/
  @Schema(description = "The legal entity reference (for company customers)")
  
    public String getCorporateCustomerLegalEntityReference() {
    return corporateCustomerLegalEntityReference;
  }

  public void setCorporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
  }

  public Reference corporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
    return this;
  }

  /**
   * The company registered address
   * @return corporateAddress
   **/
  @Schema(description = "The company registered address")
  
    public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }

  public Reference companyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
    return this;
  }

  /**
   * Reference to one or more identified company officers for a corporate customer
   * @return companyOfficerReference
   **/
  @Schema(description = "Reference to one or more identified company officers for a corporate customer")
  
    public String getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }

  public Reference companyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
    return this;
  }

  /**
   * The specific role played by the identified officer/employee
   * @return companyOfficerRole
   **/
  @Schema(description = "The specific role played by the identified officer/employee")
  
    public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }

  public Reference customerSinceDate(LocalDate customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
    return this;
  }

  /**
   * Get customerSinceDate
   * @return customerSinceDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getCustomerSinceDate() {
    return customerSinceDate;
  }

  public void setCustomerSinceDate(LocalDate customerSinceDate) {
    this.customerSinceDate = customerSinceDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.partyLegalEntityReference, reference.partyLegalEntityReference) &&
        Objects.equals(this.partyNameSalutation, reference.partyNameSalutation) &&
        Objects.equals(this.governmentIssuedIdentityReference, reference.governmentIssuedIdentityReference) &&
        Objects.equals(this.governmentIssuedDocumentDetails, reference.governmentIssuedDocumentDetails) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, reference.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.residencyStatus, reference.residencyStatus) &&
        Objects.equals(this.dateofBirth, reference.dateofBirth) &&
        Objects.equals(this.nationality, reference.nationality) &&
        Objects.equals(this.residentialAddress, reference.residentialAddress) &&
        Objects.equals(this.eMailAddress, reference.eMailAddress) &&
        Objects.equals(this.cellPhoneNumber, reference.cellPhoneNumber) &&
        Objects.equals(this.socialNetworkContacts, reference.socialNetworkContacts) &&
        Objects.equals(this.politicalExposureType, reference.politicalExposureType) &&
        Objects.equals(this.politicalExposureDescriptionRecord, reference.politicalExposureDescriptionRecord) &&
        Objects.equals(this.corporateCustomerReference, reference.corporateCustomerReference) &&
        Objects.equals(this.corporateCustomerLegalEntityReference, reference.corporateCustomerLegalEntityReference) &&
        Objects.equals(this.corporateAddress, reference.corporateAddress) &&
        Objects.equals(this.companyOfficerReference, reference.companyOfficerReference) &&
        Objects.equals(this.companyOfficerRole, reference.companyOfficerRole) &&
        Objects.equals(this.customerSinceDate, reference.customerSinceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLegalEntityReference, partyNameSalutation, governmentIssuedIdentityReference, governmentIssuedDocumentDetails, documentDirectoryEntryInstanceReference, residencyStatus, dateofBirth, nationality, residentialAddress, eMailAddress, cellPhoneNumber, socialNetworkContacts, politicalExposureType, politicalExposureDescriptionRecord, corporateCustomerReference, corporateCustomerLegalEntityReference, corporateAddress, companyOfficerReference, companyOfficerRole, customerSinceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    partyLegalEntityReference: ").append(toIndentedString(partyLegalEntityReference)).append("\n");
    sb.append("    partyNameSalutation: ").append(toIndentedString(partyNameSalutation)).append("\n");
    sb.append("    governmentIssuedIdentityReference: ").append(toIndentedString(governmentIssuedIdentityReference)).append("\n");
    sb.append("    governmentIssuedDocumentDetails: ").append(toIndentedString(governmentIssuedDocumentDetails)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    residencyStatus: ").append(toIndentedString(residencyStatus)).append("\n");
    sb.append("    dateofBirth: ").append(toIndentedString(dateofBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    residentialAddress: ").append(toIndentedString(residentialAddress)).append("\n");
    sb.append("    eMailAddress: ").append(toIndentedString(eMailAddress)).append("\n");
    sb.append("    cellPhoneNumber: ").append(toIndentedString(cellPhoneNumber)).append("\n");
    sb.append("    socialNetworkContacts: ").append(toIndentedString(socialNetworkContacts)).append("\n");
    sb.append("    politicalExposureType: ").append(toIndentedString(politicalExposureType)).append("\n");
    sb.append("    politicalExposureDescriptionRecord: ").append(toIndentedString(politicalExposureDescriptionRecord)).append("\n");
    sb.append("    corporateCustomerReference: ").append(toIndentedString(corporateCustomerReference)).append("\n");
    sb.append("    corporateCustomerLegalEntityReference: ").append(toIndentedString(corporateCustomerLegalEntityReference)).append("\n");
    sb.append("    corporateAddress: ").append(toIndentedString(corporateAddress)).append("\n");
    sb.append("    companyOfficerReference: ").append(toIndentedString(companyOfficerReference)).append("\n");
    sb.append("    companyOfficerRole: ").append(toIndentedString(companyOfficerRole)).append("\n");
    sb.append("    customerSinceDate: ").append(toIndentedString(customerSinceDate)).append("\n");
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
