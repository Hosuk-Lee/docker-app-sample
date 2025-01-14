/*
 * Savings Account
 * This service domain orchestrates a consumer savings account. The typical range of services and fees covers payments from and scheduled and ad-hoc deposits to the account, standing orders, sweeps, and liens.
 *
 * OpenAPI spec version: 11.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.kb.sample.savings.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InitiateSavingsAccountFacilityRequestSavingsAccountFacility
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class InitiateSavingsAccountFacilityRequestSavingsAccountFacility {
  @JsonProperty("CustomerReference")
  private String customerReference = null;

  @JsonProperty("BankBranchLocationReference")
  private String bankBranchLocationReference = null;

  @JsonProperty("AccountType")
  private String accountType = null;

  @JsonProperty("AccountCurrency")
  private Currencycode accountCurrency = null;

  @JsonProperty("TaxReference")
  private String taxReference = null;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting = null;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting = null;

  @JsonProperty("Associations")
  private String associations = null;

  @JsonProperty("AssociationType")
  private String associationType = null;

  @JsonProperty("AssociationObligationEntitlement")
  private String associationObligationEntitlement = null;

  @JsonProperty("AssociationReference")
  private String associationReference = null;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts = null;

  @JsonProperty("LinkType")
  private String linkType = null;

  @JsonProperty("AccountDetails")
  private String accountDetails = null;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings = null;

  @JsonProperty("DateType")
  private String dateType = null;

  @JsonProperty("StatementsSchedule")
  private String statementsSchedule = null;

  @JsonProperty("StatementType")
  private String statementType = null;

  @JsonProperty("StatementTransactionType")
  private String statementTransactionType = null;

  @JsonProperty("StatementPeriod")
  private String statementPeriod = null;

  @JsonProperty("StatementReport")
  private String statementReport = null;

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   *  
   * @return customerReference
  **/
   @Schema(
     description =
      "Reference to the account primary party/owner" 
      + "<br/>" + "고객 참조번호"
   )
   public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility bankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
    return this;
  }

   /**
   *  
   * @return bankBranchLocationReference
  **/
  @Schema(description =
          "Bank branch associated with the account for booking purposes"
                  + "<br>"
                  + "기장을 목적으로 계정과 연결된 은행 지점")
  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   *  
   * @return accountType
  **/
  @Schema(
          description = "The type of savings account (e.g. checking, student, small business)"
          ,defaultValue = "normal"
//          ,examples = {"student","silver"} 안나옴..
  )
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility accountCurrency(Currencycode accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

   /**
   * Get accountCurrency
   * @return accountCurrency
  **/
  @Schema(description = "")
  public Currencycode getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(Currencycode accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

   /**
   *  
   * @return taxReference
  **/
  @Schema(description =
          "Reference identifier linking the account to appropriate tax handling"
                  + "<br>"
                  + "계정을 적절한 세금 처리와 연결하는 참조 식별자")
  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

   /**
   *  
   * @return entitlementOptionSetting
  **/
  @Schema(description = "The setting for the entitlement option"
      + "<br>"
      + "사용 권한 옵션에 대한 설정")
  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

   /**
   *  
   * @return restrictionOptionSetting
  **/
  @Schema(description = "The setting for the restriction option"
      + "<br>"
      + "제한 옵션 설정")
  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

   /**
   *  
   * @return associations
  **/
  @Schema(description = "Definition of the associations to the account"
          + "<br>"
          + "계정에 대한 연관성 정의")
  public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   *  
   * @return associationType
  **/
  @Schema(description = "The type of association (e.g. guarantor, co-signer)"
          + "<br>"
          + "연결 유형(예: 보증인, 공동 서명인).")
  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility associationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
    return this;
  }

   /**
   *  
   * @return associationObligationEntitlement
  **/
  @Schema(description = "Description of the role, obligations or entitlements of the associated party"
          + "<br>"
          + "관련 당사자의 역할, 의무 또는 자격에 대한 설명")
  public String getAssociationObligationEntitlement() {
    return associationObligationEntitlement;
  }

  public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
    this.associationObligationEntitlement = associationObligationEntitlement;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility associationReference(String associationReference) {
    this.associationReference = associationReference;
    return this;
  }

   /**
   *  
   * @return associationReference
  **/
  @Schema(description = "Reference to the associated party"
          + "<br>"
          + "참조인 참조번호")
  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

   /**
   *  
   * @return linkedAccounts
  **/
  @Schema(description = "Definition of the associations to the account\n"
          + "<br>"
          + "계정에 대한 연관성 정의")
  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   *  
   * @return linkType
  **/
  @Schema(description = "The type and purpose for the link"
          + "<br>"
          + "링크 유형 및 목적")
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

   /**
   *  
   * @return accountDetails
  **/
  @Schema(description = "Details of the linked account"
          + "<br>"
          + "연결된 계정의 세부 정보")
  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

   /**
   *  
   * @return positionLimitSettings
  **/
  @Schema(description = "Position limits that are maintained by the account\n"
          + "<br>"
          + "계정에 의해 유지되는 포지션 제한")
  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   *  
   * @return dateType
  **/
  @Schema(description = "Key dates associated with the account (e.g. opening date, closing date)"
          + "<br>"
          + "계정과 연관된 주요 날짜(예: 개설일, 마감일)")
  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility statementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
    return this;
  }

   /**
   *  
   * @return statementsSchedule
  **/
  @Schema(description = "The schedule for generating product statements to schedule"
          + "<br>"
          + "예약할 제품 문 생성 예약")
  public String getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

   /**
   *  
   * @return statementType
  **/
  @Schema(description = "The types of scheduled statement (e.g. balance/mini-statement/annual)"
          + "<br>"
          + "예정표 유형(예: 잔액/미니 명세서/연간)")
  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility statementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
    return this;
  }

   /**
   *  
   * @return statementTransactionType
  **/
  @Schema(description = "The types of transactions and transaction details to be included"
          + "<br>"
          + "트랜잭션 유형, 거래내역 포함")
  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility statementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
    return this;
  }

   /**
   *  
   * @return statementPeriod
  **/
  @Schema(description = "The reporting period covered by the statement"
      + "<br>"
      + "명세서에서 다루는 보고기간")
  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }

  public InitiateSavingsAccountFacilityRequestSavingsAccountFacility statementReport(String statementReport) {
    this.statementReport = statementReport;
    return this;
  }

   /**
   *  
   * @return statementReport
  **/
  @Schema(description = "The statement content"
      + "<br>"
      + "전표내용")
  public String getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(String statementReport) {
    this.statementReport = statementReport;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateSavingsAccountFacilityRequestSavingsAccountFacility initiateSavingsAccountFacilityRequestSavingsAccountFacility = (InitiateSavingsAccountFacilityRequestSavingsAccountFacility) o;
    return Objects.equals(this.customerReference, initiateSavingsAccountFacilityRequestSavingsAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchLocationReference, initiateSavingsAccountFacilityRequestSavingsAccountFacility.bankBranchLocationReference) &&
        Objects.equals(this.accountType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, initiateSavingsAccountFacilityRequestSavingsAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, initiateSavingsAccountFacilityRequestSavingsAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionSetting, initiateSavingsAccountFacilityRequestSavingsAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateSavingsAccountFacilityRequestSavingsAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, initiateSavingsAccountFacilityRequestSavingsAccountFacility.associations) &&
        Objects.equals(this.associationType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.associationType) &&
        Objects.equals(this.associationObligationEntitlement, initiateSavingsAccountFacilityRequestSavingsAccountFacility.associationObligationEntitlement) &&
        Objects.equals(this.associationReference, initiateSavingsAccountFacilityRequestSavingsAccountFacility.associationReference) &&
        Objects.equals(this.linkedAccounts, initiateSavingsAccountFacilityRequestSavingsAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateSavingsAccountFacilityRequestSavingsAccountFacility.accountDetails) &&
        Objects.equals(this.positionLimitSettings, initiateSavingsAccountFacilityRequestSavingsAccountFacility.positionLimitSettings) &&
        Objects.equals(this.dateType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.dateType) &&
        Objects.equals(this.statementsSchedule, initiateSavingsAccountFacilityRequestSavingsAccountFacility.statementsSchedule) &&
        Objects.equals(this.statementType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.statementType) &&
        Objects.equals(this.statementTransactionType, initiateSavingsAccountFacilityRequestSavingsAccountFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, initiateSavingsAccountFacilityRequestSavingsAccountFacility.statementPeriod) &&
        Objects.equals(this.statementReport, initiateSavingsAccountFacilityRequestSavingsAccountFacility.statementReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, bankBranchLocationReference, accountType, accountCurrency, taxReference, entitlementOptionSetting, restrictionOptionSetting, associations, associationType, associationObligationEntitlement, associationReference, linkedAccounts, linkType, accountDetails, positionLimitSettings, dateType, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateSavingsAccountFacilityRequestSavingsAccountFacility {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationEntitlement: ").append(toIndentedString(associationObligationEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    statementsSchedule: ").append(toIndentedString(statementsSchedule)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    statementTransactionType: ").append(toIndentedString(statementTransactionType)).append("\n");
    sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
    sb.append("    statementReport: ").append(toIndentedString(statementReport)).append("\n");
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
