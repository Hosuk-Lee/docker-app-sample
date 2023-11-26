package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.Objects;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;
//import org.threeten.bp.LocalDate;

/**
 * ExecutePartyReferenceDataDirectoryEntryRequestReference
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T12:24:31.394878628Z[GMT]")


public class ExecutePartyReferenceDataDirectoryEntryRequestReference   {
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

  public ExecutePartyReferenceDataDirectoryEntryRequestReference partyLegalEntityReference(String partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
    return this;
  }

  /**
   *  
   * @return partyLegalEntityReference
   **/
  @Schema(description = " ")
  
    public String getPartyLegalEntityReference() {
    return partyLegalEntityReference;
  }

  public void setPartyLegalEntityReference(String partyLegalEntityReference) {
    this.partyLegalEntityReference = partyLegalEntityReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference partyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
    return this;
  }

  /**
   *  
   * @return partyNameSalutation
   **/
  @Schema(description = " ")
  
    public String getPartyNameSalutation() {
    return partyNameSalutation;
  }

  public void setPartyNameSalutation(String partyNameSalutation) {
    this.partyNameSalutation = partyNameSalutation;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference governmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
    return this;
  }

  /**
   *  
   * @return governmentIssuedIdentityReference
   **/
  @Schema(description = " ")
  
    public String getGovernmentIssuedIdentityReference() {
    return governmentIssuedIdentityReference;
  }

  public void setGovernmentIssuedIdentityReference(String governmentIssuedIdentityReference) {
    this.governmentIssuedIdentityReference = governmentIssuedIdentityReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference governmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
    return this;
  }

  /**
   *  
   * @return governmentIssuedDocumentDetails
   **/
  @Schema(description = " ")
  
    public String getGovernmentIssuedDocumentDetails() {
    return governmentIssuedDocumentDetails;
  }

  public void setGovernmentIssuedDocumentDetails(String governmentIssuedDocumentDetails) {
    this.governmentIssuedDocumentDetails = governmentIssuedDocumentDetails;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference documentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   *  
   * @return documentDirectoryEntryInstanceReference
   **/
  @Schema(description = " ")
  
    public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference residencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
    return this;
  }

  /**
   *  
   * @return residencyStatus
   **/
  @Schema(description = " ")
  
    public String getResidencyStatus() {
    return residencyStatus;
  }

  public void setResidencyStatus(String residencyStatus) {
    this.residencyStatus = residencyStatus;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference dateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
    return this;
  }

  /**
   *  
   * @return dateofBirth
   **/
  @Schema(description = " ")
  
    public String getDateofBirth() {
    return dateofBirth;
  }

  public void setDateofBirth(String dateofBirth) {
    this.dateofBirth = dateofBirth;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   *  
   * @return nationality
   **/
  @Schema(description = " ")
  
    public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference residentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
    return this;
  }

  /**
   *  
   * @return residentialAddress
   **/
  @Schema(description = " ")
  
    public String getResidentialAddress() {
    return residentialAddress;
  }

  public void setResidentialAddress(String residentialAddress) {
    this.residentialAddress = residentialAddress;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference eMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
    return this;
  }

  /**
   *  
   * @return eMailAddress
   **/
//  @Schema(description = " ")
  
    public String getEMailAddress() {
    return eMailAddress;
  }

  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

  /**
   *  
   * @return cellPhoneNumber
   **/
  @Schema(description = " ")
  
    public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference socialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
    return this;
  }

  /**
   *  
   * @return socialNetworkContacts
   **/
  @Schema(description = " ")
  
    public String getSocialNetworkContacts() {
    return socialNetworkContacts;
  }

  public void setSocialNetworkContacts(String socialNetworkContacts) {
    this.socialNetworkContacts = socialNetworkContacts;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference politicalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
    return this;
  }

  /**
   *  
   * @return politicalExposureType
   **/
  @Schema(description = " ")
  
    public String getPoliticalExposureType() {
    return politicalExposureType;
  }

  public void setPoliticalExposureType(String politicalExposureType) {
    this.politicalExposureType = politicalExposureType;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference politicalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
    return this;
  }

  /**
   *  
   * @return politicalExposureDescriptionRecord
   **/
  @Schema(description = " ")
  
    public String getPoliticalExposureDescriptionRecord() {
    return politicalExposureDescriptionRecord;
  }

  public void setPoliticalExposureDescriptionRecord(String politicalExposureDescriptionRecord) {
    this.politicalExposureDescriptionRecord = politicalExposureDescriptionRecord;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
    return this;
  }

  /**
   *  
   * @return corporateCustomerReference
   **/
  @Schema(description = " ")
  
    public String getCorporateCustomerReference() {
    return corporateCustomerReference;
  }

  public void setCorporateCustomerReference(String corporateCustomerReference) {
    this.corporateCustomerReference = corporateCustomerReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
    return this;
  }

  /**
   *  
   * @return corporateCustomerLegalEntityReference
   **/
  @Schema(description = " ")
  
    public String getCorporateCustomerLegalEntityReference() {
    return corporateCustomerLegalEntityReference;
  }

  public void setCorporateCustomerLegalEntityReference(String corporateCustomerLegalEntityReference) {
    this.corporateCustomerLegalEntityReference = corporateCustomerLegalEntityReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference corporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
    return this;
  }

  /**
   *  
   * @return corporateAddress
   **/
  @Schema(description = " ")
  
    public String getCorporateAddress() {
    return corporateAddress;
  }

  public void setCorporateAddress(String corporateAddress) {
    this.corporateAddress = corporateAddress;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference companyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
    return this;
  }

  /**
   *  
   * @return companyOfficerReference
   **/
  @Schema(description = " ")
  
    public String getCompanyOfficerReference() {
    return companyOfficerReference;
  }

  public void setCompanyOfficerReference(String companyOfficerReference) {
    this.companyOfficerReference = companyOfficerReference;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference companyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
    return this;
  }

  /**
   *  
   * @return companyOfficerRole
   **/
  @Schema(description = " ")
  
    public String getCompanyOfficerRole() {
    return companyOfficerRole;
  }

  public void setCompanyOfficerRole(String companyOfficerRole) {
    this.companyOfficerRole = companyOfficerRole;
  }

  public ExecutePartyReferenceDataDirectoryEntryRequestReference customerSinceDate(LocalDate customerSinceDate) {
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
    ExecutePartyReferenceDataDirectoryEntryRequestReference executePartyReferenceDataDirectoryEntryRequestReference = (ExecutePartyReferenceDataDirectoryEntryRequestReference) o;
    return Objects.equals(this.partyLegalEntityReference, executePartyReferenceDataDirectoryEntryRequestReference.partyLegalEntityReference) &&
        Objects.equals(this.partyNameSalutation, executePartyReferenceDataDirectoryEntryRequestReference.partyNameSalutation) &&
        Objects.equals(this.governmentIssuedIdentityReference, executePartyReferenceDataDirectoryEntryRequestReference.governmentIssuedIdentityReference) &&
        Objects.equals(this.governmentIssuedDocumentDetails, executePartyReferenceDataDirectoryEntryRequestReference.governmentIssuedDocumentDetails) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, executePartyReferenceDataDirectoryEntryRequestReference.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.residencyStatus, executePartyReferenceDataDirectoryEntryRequestReference.residencyStatus) &&
        Objects.equals(this.dateofBirth, executePartyReferenceDataDirectoryEntryRequestReference.dateofBirth) &&
        Objects.equals(this.nationality, executePartyReferenceDataDirectoryEntryRequestReference.nationality) &&
        Objects.equals(this.residentialAddress, executePartyReferenceDataDirectoryEntryRequestReference.residentialAddress) &&
        Objects.equals(this.eMailAddress, executePartyReferenceDataDirectoryEntryRequestReference.eMailAddress) &&
        Objects.equals(this.cellPhoneNumber, executePartyReferenceDataDirectoryEntryRequestReference.cellPhoneNumber) &&
        Objects.equals(this.socialNetworkContacts, executePartyReferenceDataDirectoryEntryRequestReference.socialNetworkContacts) &&
        Objects.equals(this.politicalExposureType, executePartyReferenceDataDirectoryEntryRequestReference.politicalExposureType) &&
        Objects.equals(this.politicalExposureDescriptionRecord, executePartyReferenceDataDirectoryEntryRequestReference.politicalExposureDescriptionRecord) &&
        Objects.equals(this.corporateCustomerReference, executePartyReferenceDataDirectoryEntryRequestReference.corporateCustomerReference) &&
        Objects.equals(this.corporateCustomerLegalEntityReference, executePartyReferenceDataDirectoryEntryRequestReference.corporateCustomerLegalEntityReference) &&
        Objects.equals(this.corporateAddress, executePartyReferenceDataDirectoryEntryRequestReference.corporateAddress) &&
        Objects.equals(this.companyOfficerReference, executePartyReferenceDataDirectoryEntryRequestReference.companyOfficerReference) &&
        Objects.equals(this.companyOfficerRole, executePartyReferenceDataDirectoryEntryRequestReference.companyOfficerRole) &&
        Objects.equals(this.customerSinceDate, executePartyReferenceDataDirectoryEntryRequestReference.customerSinceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyLegalEntityReference, partyNameSalutation, governmentIssuedIdentityReference, governmentIssuedDocumentDetails, documentDirectoryEntryInstanceReference, residencyStatus, dateofBirth, nationality, residentialAddress, eMailAddress, cellPhoneNumber, socialNetworkContacts, politicalExposureType, politicalExposureDescriptionRecord, corporateCustomerReference, corporateCustomerLegalEntityReference, corporateAddress, companyOfficerReference, companyOfficerRole, customerSinceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePartyReferenceDataDirectoryEntryRequestReference {\n");
    
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
